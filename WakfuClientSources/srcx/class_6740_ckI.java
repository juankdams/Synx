import org.apache.log4j.Logger;

public class ckI extends bmb
{
  private static final Logger K = Logger.getLogger(ckI.class);
  private aWe hLY;

  private static String bMY()
  {
    try
    {
      return ay.bd().getString("shadersPath");
    } catch (bdh localbdh) {
      K.error("", localbdh);
    }
    return "";
  }

  public ckI() {
    super(bMY() + "rain.cgfx", "rain0", new cgR(new cbW[] { new cbW("gStrength", bHf.gFo), new cbW("threshold", bHf.gFo), new cbW("camera", bHf.gFq), new cbW("high", bHf.gFp), new cbW("low", bHf.gFp), new cbW("highlight", bHf.gFo) }));
  }

  public void cc(float paramFloat)
  {
    this.fDt.setFloat("highlight", paramFloat);
  }

  public void a(aWe paramaWe) {
    this.hLY = paramaWe;
  }

  public void A(float paramFloat) {
    this.fDt.setFloat("gStrength", paramFloat);
  }

  public void cd(float paramFloat) {
    this.fDt.setFloat("threshold", paramFloat);
  }

  public void update(int paramInt) {
    float f1 = (float)this.fDs / 1000.0F;
    float f2 = 0.1F;
    float f3 = 0.01F;

    float f4 = this.hLY.xV();
    float f5 = this.hLY.xW();
    float f6 = (float)Math.sin(f1 * 0.1F);
    float f7 = (float)Math.cos(f1 * 0.1F);
    float f8 = (float)Math.sin(f1 * 0.01F);
    float f9 = (float)Math.cos(f1 * 0.01F);
    this.fDt.a("low", f8, f9);
    this.fDt.a("high", f6, f7);
    this.fDt.b("camera", f4, f5, this.hLY.getZoomFactor());
    super.update(paramInt);
  }
}