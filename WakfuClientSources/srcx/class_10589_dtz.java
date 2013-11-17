import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import org.apache.log4j.Logger;

public abstract class dtz extends dOc
{
  private static final int lwp = 32;
  private static final int lwq = 32;
  private static final int lwr = 4096;
  private static final int lws = 4096;
  protected static final Logger K = Logger.getLogger(dtz.class);
  public static final String TAG = "Video";
  protected cdv lwt;
  private String SK;
  private aaP lwu;
  private boolean cLV;
  private float lwv;
  private long lww;
  private boolean hwT;
  private final drz lwx = new acB(this);

  public static final int lwy = "videoPath".hashCode();
  public static final int lwz = "keepRatio".hashCode();
  public static final int lwA = "onTimeChange".hashCode();

  public static dtz checkOut()
  {
    aIK localaIK = new aIK();

    localaIK.aJ();
    return localaIK;
  }

  public void bc()
  {
    super.bc();

    this.lwt.bc();
    this.lwt = null;
    this.lww = -1L;
    this.hwT = false;
    this.lwu = aaP.cPg;

    cBQ.cxL().cxS().b(this.lwx);
  }

  public void aJ()
  {
    super.aJ();

    this.hwT = false;
    this.lwv = 1.0F;
    this.lwu = aaP.cPg;
    this.cLV = false;
    this.SK = null;
    this.lww = 0L;

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    setNeedsToPreProcess();

    if (cBQ.cxL().cxS() != null) {
      cBQ.cxL().cxS().a(this.lwx);
    }
    this.lwt = new cdv();
    this.lwt.aJ();
    this.lwt.setFlipVerticaly(true);

    setMinSize(new Or(32, 32));
    setMaxSize(new Or(4096, 4096));
    setSize(getMinSize());
  }

  protected void setState(aaP paramaaP)
  {
    this.lwu = paramaaP;
  }

  public String getVideoPath()
  {
    return this.SK;
  }

  public void setVideoPath(String paramString) {
    this.SK = paramString;
  }

  public void play() {
    if (isPlaying())
      return;
    if (isPaused()) {
      setPaused(false);
      return;
    }
    if (aUJ()) {
      this.lwu = aaP.cPh;
      setNeedsToPreProcess();
    } else {
      K.info("Unable to set video as 'PLAYING'");
    }
  }

  protected abstract boolean aUJ();

  public void setPaused(boolean paramBoolean) {
    if (!isInitialized())
      return;
    if (du(paramBoolean))
      this.lwu = (paramBoolean ? aaP.cPi : aaP.cPh);
    setNeedsToPreProcess();
  }

  protected abstract boolean du(boolean paramBoolean);

  public boolean isPaused() {
    return this.lwu == aaP.cPi;
  }

  public boolean isPlaying() {
    return this.lwu == aaP.cPh;
  }

  public abstract void aN(float paramFloat);

  public abstract void a(bpE parambpE);

  public boolean isInitialized() {
    return this.lwu != aaP.cPg;
  }

  public abstract long getVideoDuration();

  protected abstract long getVideoPosition();

  protected abstract drI getVideoTextureProducer();

  public void setVolume(float paramFloat) {
    if (paramFloat > this.lwv)
      this.cLV = false;
    this.lwv = paramFloat;
    aO(this.cLV ? 0.0F : paramFloat);
  }

  protected abstract void aO(float paramFloat);

  public float getVolume() {
    return this.lwv;
  }

  public void hC(boolean paramBoolean) {
    if (paramBoolean == this.cLV)
      return;
    this.cLV = paramBoolean;
    aO(this.cLV ? 0.0F : this.lwv);
  }

  public boolean isMuted() {
    return this.cLV;
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (!isInitialized()) {
      return bool;
    }
    long l = getVideoPosition();
    if (this.lww != l) {
      this.lww = l;
      diZ localdiZ = new diZ(this);
      localdiZ.bk(Long.valueOf(this.lww));
      localdiZ.setValue(Long.valueOf(l));
      g(localdiZ);
    }

    return (isPlaying()) || (bool);
  }

  public boolean r(int paramInt)
  {
    super.r(paramInt);
    if ((getVideoTextureProducer().cYv()) && (this.czl != null)) {
      this.lwt.a(getVideoTextureProducer(), this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
    }
    return true;
  }

  public String getTag()
  {
    return "Video";
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return true;
  }

  protected void rd()
  {
    super.rd();
    if ((this.bqm != null) && (this.lwt != null) && (this.lwt.getEntity() != null))
      this.bqm.d(this.lwt.getEntity());
  }

  public void setSize(int paramInt1, int paramInt2)
  {
    super.setSize(paramInt1, paramInt2);
    this.lwt.setSize(paramInt1, paramInt2);
    setNeedsToPreProcess();
  }

  public void setOnTimeChange(aIr paramaIr)
  {
    a(CH.bGF, paramaIr, false);
  }

  public void setKeepRatio(boolean paramBoolean) {
    this.hwT = paramBoolean;
    this.lwt.setKeepRatio(this.hwT);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == lwy)
      setVideoPath(paramString);
    else if (paramInt == lwA)
      a(CH.bGF, (doN)paramaKN.b(aIr.class, paramString), false);
    else if (paramInt == lwz)
      setKeepRatio(((Boolean)paramaKN.b(Boolean.class, paramString)).booleanValue());
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == lwy)
      setVideoPath((String)paramObject);
    else if (paramInt == lwz)
      setKeepRatio(((Boolean)paramObject).booleanValue());
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }
    return true;
  }
}