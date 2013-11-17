import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bSH extends bDl
{
  private static final Logger K = Logger.getLogger(bSH.class);

  private static final bSH hdJ = new bSH();
  private static final String hdK = "bgColor";
  private bNa aDh;

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("bgColor")) {
      return this.aDh;
    }

    return super.getFieldValue(paramString);
  }

  public static bSH bZs() {
    return hdJ;
  }

  public void bLJ()
  {
    super.bLJ();
    dLE.doY().t("miniMap", this);
    dLE.doY().t("ambienceZone", dO.hI());
  }

  public float getZoomScale()
  {
    return WakfuClientInstance.awy().awB().c(bmz.fEg);
  }

  public void setZoomScale(float paramFloat)
  {
    WakfuClientInstance.awy().awB().a(bmz.fEg, paramFloat);
    super.setZoomScale(paramFloat);
  }

  public avz bMh()
  {
    return dSP.mpf;
  }

  public void ct(short paramShort)
  {
    dUx localdUx = bDk.bLI().cr(paramShort);
    if (localdUx == null) {
      return;
    }
    short s = localdUx.mrN;
    this.aDh = localdUx.msa;

    this.gyL = -1;

    if ((s > 0) && (s != paramShort))
    {
      this.gyL = s;
    } else if (s < 0)
      paramShort = s;
    try
    {
      if (bMr()) {
        this.aDh = new bNa(152, 205, 221, 255);
        bMs();
      } else {
        super.ct(paramShort);
      }
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }

    bMn();

    dLE.doY().a(this, new String[] { "isMapAvailable", "bgColor" });
  }

  protected void bMv()
  {
  }

  protected void bMw()
  {
  }

  public void bZt()
  {
    if (bMr())
      bMs();
  }
}