import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Arrays;

public class alP extends dRq
  implements dKW
{
  public static final String TAG = "progressBar";
  private GX dmO;
  private boolean bY;
  private float dmP;
  private float dmQ;
  public static final float dmR = 0.0F;
  public static final float dmS = 1.0F;
  private float dmT;
  private float dmU;
  private float dmV;
  private float dmW;
  private float dmX;
  private boolean dmY;
  private boolean dmZ;
  private bpg dna;
  private boolean dnb;
  private float[] dnc;
  private ArrayList dnd;
  private boolean dne;
  private aAR dnf;
  private long dng;
  private ddp dnh;
  public static final int ct = "horizontal".hashCode();
  public static final int dni = "fullCirclePercentage".hashCode();
  public static final int dnj = "deltaAngle".hashCode();
  public static final int dnk = "maxBound".hashCode();
  public static final int dnl = "minBound".hashCode();
  public static final int dnm = "displayType".hashCode();
  public static final int dnn = "useIncreaseProgressTween".hashCode();
  public static final int dno = "useDecreaseProgressTween".hashCode();
  public static final int crX = "value".hashCode();
  public static final int dnp = "initialValue".hashCode();
  public static final int dnq = "inversed".hashCode();
  public static final int dnr = "markers".hashCode();
  public static final int dns = "tweenDuration".hashCode();

  public alP()
  {
    this.bY = true;
    this.dmP = 1.0F;
    this.dmQ = 1.570796F;

    this.dmT = 0.0F;
    this.dmU = 1.0F;

    this.dmV = 0.0F;
    this.dmW = 0.0F;
    this.dmX = 0.0F;

    this.dmY = true;
    this.dmZ = true;

    this.dnb = false;

    this.dnc = null;
    this.dnd = new ArrayList();
    this.dne = false;
    this.dnf = null;

    this.dng = -1L;
  }

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof aAR)) {
      setPixmap((aAR)paramaNL);
    }

    super.a(paramaNL);
  }

  public void setPixmap(aAR paramaAR) {
    if (paramaAR != this.dnf) {
      this.dnf = paramaAR;
      setNeedsToPreProcess();
    }
  }

  public void invalidate()
  {
    this.dne = true;
    super.invalidate();
  }

  protected void rd() {
    super.rd();
    this.bqm.d(this.dmO.getEntity());
  }

  public String getTag()
  {
    return "progressBar";
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof dUa;
  }

  public dUa getAppearance()
  {
    return (dUa)this.czl;
  }

  public boolean getUseIncreaseProgressTween() {
    return this.dmY;
  }

  public void setUseIncreaseProgressTween(boolean paramBoolean) {
    this.dmY = paramBoolean;
  }

  public boolean getUseDecreaseProgressTween() {
    return this.dmZ;
  }

  public void setUseDecreaseProgressTween(boolean paramBoolean) {
    this.dmZ = paramBoolean;
  }

  public void setPixmaps(aAR paramaAR1, aAR paramaAR2, aAR paramaAR3, aAR paramaAR4, aAR paramaAR5, aAR paramaAR6, aAR paramaAR7, aAR paramaAR8, aAR paramaAR9)
  {
    if (this.dna == bpg.fIO) {
      setDisplayType(bpg.fIP);
    }
    this.dmO.setPixmaps(paramaAR1.getPixmap(), paramaAR2.getPixmap(), paramaAR3.getPixmap(), paramaAR4.getPixmap(), paramaAR5.getPixmap(), paramaAR6.getPixmap(), paramaAR7.getPixmap(), paramaAR8.getPixmap(), paramaAR9.getPixmap());

    int i = paramaAR1.getPixmap().getWidth() + paramaAR3.getPixmap().getWidth();
    int j = paramaAR1.getPixmap().getHeight() + paramaAR7.getPixmap().getHeight();

    setMinSize(new Or(i, j));
  }

  public void setModulationColor(bNa parambNa) {
    if (this.dmO != null) {
      this.dmO.setModulationColor(parambNa);
    }
    for (int i = this.dnd.size() - 1; i >= 0; i--)
      ((czv)this.dnd.get(i)).setModulationColor(parambNa);
  }

  public bNa getModulationColor()
  {
    if (this.dmO != null) {
      return this.dmO.getModulationColor();
    }
    return null;
  }

  public void setColor(bNa parambNa, String paramString) {
    if ((paramString == null) || (paramString.equalsIgnoreCase("progressBar"))) {
      this.dmO.setColor(parambNa);

      setMinSize(new Or(0, 0));
    } else if (paramString.equals("progressBarBorder")) {
      this.dmO.setBorderColor(parambNa);
    }
  }

  public void setInnerPosition(aFG paramaFG) {
    if (this.dmO != null)
      this.dmO.setPosition(paramaFG);
  }

  public void setInnerBorder(Insets paramInsets)
  {
    if (this.dmO != null) {
      this.dmO.setBorder(paramInsets);
    }

    setMinSize(new Or(paramInsets.left + paramInsets.right, paramInsets.bottom + paramInsets.top));
  }

  public float getMinBound() {
    return this.dmT;
  }

  public void setMinBound(float paramFloat) {
    this.dmT = paramFloat;
    if (this.dmV < this.dmT) {
      setMinBound(this.dmT);
    }
    ayz();
  }

  public float getMaxBound() {
    return this.dmU;
  }

  public void setMaxBound(float paramFloat) {
    this.dmU = paramFloat;
    if (this.dmV > this.dmU) {
      setValue(this.dmU);
    }
    ayz();
  }

  public float getPercentage() {
    return Math.max(0.0F, Math.min(1.0F, (this.dmV - this.dmT) / (this.dmU - this.dmT)));
  }

  private float getVisualPercentage() {
    return Math.max(0.0F, Math.min(1.0F, (this.dmX - this.dmT) / (this.dmU - this.dmT)));
  }

  public float getValue() {
    return this.dmV;
  }

  public cKq setValue(float paramFloat)
  {
    paramFloat = bCO.t(paramFloat, this.dmT, this.dmU);
    if (this.dmV == paramFloat) {
      return null;
    }

    int i = ((this.dmY) && (paramFloat > this.dmV)) || ((this.dmZ) && (paramFloat < this.dmV)) ? 1 : 0;

    J(aDv.class);
    aDv localaDv = new aDv(this, this.dnb ? this.dmU - this.dmX : this.dmX, this.dnb ? this.dmU - paramFloat : paramFloat, this, 0, i != 0 ? (int)(this.dng != -1L ? this.dng : 500L) : 0, this.dnh, null);

    a(localaDv);

    this.dmV = paramFloat;

    return localaDv;
  }

  public ddp getTweenFunction() {
    return this.dnh;
  }

  public void setTweenFunction(ddp paramddp) {
    this.dnh = paramddp;
  }

  public float getInitialValue() {
    return this.dmW;
  }

  public void setInitialValue(float paramFloat) {
    this.dmW = paramFloat;
    this.dmX = paramFloat;
    this.dmV = this.dmW;
    ayz();
  }

  public float getFullCirclePercentage() {
    return this.dmP;
  }

  public void setFullCirclePercentage(float paramFloat) {
    this.dmP = paramFloat;
    if (this.dmO != null)
      this.dmO.setFullCirclePercentage(paramFloat);
  }

  public float getDeltaAngle()
  {
    return this.dmQ;
  }

  public void setDeltaAngle(float paramFloat) {
    this.dmQ = paramFloat;
    if (this.dmO != null)
      this.dmO.setDeltaAngle(paramFloat);
  }

  public bpg getDisplayType()
  {
    return this.dna;
  }

  public void setDisplayType(bpg parambpg) {
    if ((this.dna != parambpg) || (this.dmO == null)) {
      this.dna = parambpg;
      bNa localbNa1 = null;
      bNa localbNa2 = null;
      bNa localbNa3 = null;
      Insets localInsets = null;
      if (this.dmO != null) {
        localbNa1 = this.dmO.getColor();
        localbNa2 = this.dmO.getBorderColor();
        localbNa3 = this.dmO.getModulationColor();
        localInsets = this.dmO.getBorder();
        this.dmO.bc();
      }
      this.dmO = this.dna.byH();
      this.dmO.aJ();
      this.dmO.setHorizontal(this.bY);
      this.dmO.setColor(localbNa1);
      this.dmO.setBorderColor(localbNa2);
      this.dmO.setModulationColor(localbNa3);
      if (localInsets != null) {
        this.dmO.setBorder(localInsets);
      }
      this.dmO.setFullCirclePercentage(this.dmP);
      this.dmO.setDeltaAngle(this.dmQ);
    }
  }

  public boolean isHorizontal()
  {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
    if (this.dmO != null)
      this.dmO.setHorizontal(paramBoolean);
  }

  public boolean isInversed()
  {
    return this.dnb;
  }

  public void setInversed(boolean paramBoolean) {
    this.dnb = paramBoolean;
  }

  public void setMarkers(float[] paramArrayOfFloat)
  {
    if ((this.dnc != null) && (Arrays.equals(this.dnc, paramArrayOfFloat))) {
      return;
    }

    this.dnc = paramArrayOfFloat;

    invalidate();
  }

  public void setTweenDuration(long paramLong) {
    this.dng = paramLong;
  }

  public GX getProgressBarMesh() {
    return this.dmO;
  }

  public void validate()
  {
    super.validate();

    ayz();
  }

  public void ayz() {
    if (this.dmO != null) {
      int i = this.czl.getContentWidth();
      int j = this.czl.getContentHeight();

      float f = getVisualPercentage();
      int k;
      if (this.dnb) {
        k = this.czl.getLeftInset() + (int)(i * f) + 1;
        f = 1.0F - f;
      } else {
        k = this.czl.getLeftInset();
      }
      int m = this.czl.getBottomInset();

      this.dmO.a(k, m, i, j, f);
    }
  }

  public boolean je(int paramInt)
  {
    boolean bool = super.je(paramInt);

    if (this.dne) {
      invalidate();
    }

    return bool;
  }

  public void c(bdj parambdj)
  {
    alP localalP = (alP)parambdj;
    super.c(parambdj);
    localalP.setDisplayType(getDisplayType());
    localalP.setUseIncreaseProgressTween(this.dmY);
    localalP.setUseDecreaseProgressTween(this.dmZ);
    localalP.setHorizontal(this.bY);
    localalP.setValue(this.dmV);
    localalP.setInitialValue(this.dmW);
    localalP.setMaxBound(this.dmU);
    localalP.setMinBound(this.dmT);
    localalP.setFullCirclePercentage(this.dmP);
    localalP.setDeltaAngle(this.dmQ);
    localalP.dnf = this.dnf;
    localalP.setInversed(this.dnb);
    localalP.setTweenDuration(this.dng);

    localalP.setNeedsToPreProcess();
  }

  public void bc()
  {
    super.bc();

    this.dmO.bc();
    this.dmO = null;
    this.dnd.clear();
    this.dne = false;
    this.dnf = null;
    this.dnc = null;
    this.dng = -1L;
  }

  public void aJ() {
    super.aJ();

    dUa localdUa = new dUa();
    localdUa.aJ();
    localdUa.setWidget(this);
    a(localdUa);

    aYg localaYg = new aYg(this, null);
    localaYg.aJ();
    a(localaYg);

    this.dmP = 1.0F;
    this.dmQ = 1.570796F;
    this.bY = true;
    this.dmZ = true;
    this.dmY = true;
    this.dnb = false;
    setDisplayType(bpg.fIO);
    setNonBlocking(false);

    this.dnh = ddp.kWF;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == ct)
      setHorizontal(bUD.getBoolean(paramString));
    else if (paramInt == dnj)
      setDeltaAngle(bUD.getFloat(paramString));
    else if (paramInt == dnk)
      setMaxBound(bUD.getFloat(paramString));
    else if (paramInt == dni)
      setFullCirclePercentage(bUD.getFloat(paramString));
    else if (paramInt == dnl)
      setMinBound(bUD.getFloat(paramString));
    else if (paramInt == dnn)
      setUseIncreaseProgressTween(bUD.getBoolean(paramString));
    else if (paramInt == dno)
      setUseDecreaseProgressTween(bUD.getBoolean(paramString));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramString));
    else if (paramInt == dnp)
      setInitialValue(bUD.getFloat(paramString));
    else if (paramInt == dnm)
      setDisplayType(bpg.iw(paramString));
    else if (paramInt == dnq)
      setInversed(bUD.getBoolean(paramString));
    else if (paramInt == dns)
      setTweenDuration(bUD.getLong(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == dnk)
      setMaxBound(bUD.getFloat(paramObject));
    else if (paramInt == dnl)
      setMinBound(bUD.getFloat(paramObject));
    else if (paramInt == crX)
      setValue(bUD.getFloat(paramObject));
    else if (paramInt == dnp)
      setInitialValue(bUD.getFloat(paramObject));
    else if (paramInt == dnq)
      setInversed(bUD.getBoolean(paramObject));
    else if (paramInt == dnr) {
      if ((paramObject == null) || ((paramObject instanceof float[])))
        setMarkers((float[])paramObject);
      else
        return false;
    }
    else if (paramInt == dns)
      setTweenDuration(bUD.getLong(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}