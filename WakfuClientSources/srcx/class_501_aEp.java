import org.apache.log4j.Logger;

public class aEp
{
  private static final Logger K = Logger.getLogger(aEp.class);
  public static final String dZN = "reverbdensity";
  public static final String djA = "reverbgain";
  public static final String dZO = "decaytime";
  public static final String dZP = "decayLPF";
  public static final String dZQ = "earlygain";
  public static final String dZR = "predelay";
  private float dZS = 1.0F;
  private float dZT = 0.32F;
  private float dZU = 1.49F;
  private float dZV = 0.83F;
  private float dZW = 1.26F;
  private float dZX = 0.011F;

  private aEp()
  {
  }

  public aEp(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this.dZS = paramFloat1;
    this.dZT = paramFloat2;
    this.dZU = paramFloat3;
    this.dZV = paramFloat4;
    this.dZW = paramFloat5;
    this.dZX = paramFloat6;
  }

  public static aEp u(K paramK) {
    aEp localaEp = new aEp();
    for (K localK : paramK.getChildren()) {
      if (localK.getName().equals("reverbdensity"))
        localaEp.dZS = bCO.t(localK.e("value").ai(), 0.0F, 1.0F);
      else if (localK.getName().equals("reverbgain"))
        localaEp.dZT = bCO.t(localK.e("value").ai(), 0.0F, 1.0F);
      else if (localK.getName().equals("decaytime"))
        localaEp.dZU = bCO.t(localK.e("value").ai(), 0.1F, 20.0F);
      else if (localK.getName().equals("decayLPF"))
        localaEp.dZV = bCO.t(localK.e("value").ai(), 0.1F, 2.0F);
      else if (localK.getName().equals("earlygain"))
        localaEp.dZW = bCO.t(localK.e("value").ai(), 0.0F, 10.0F);
      else if (localK.getName().equals("predelay")) {
        localaEp.dZX = bCO.t(localK.e("value").ai(), 0.0F, 0.1F);
      }
    }
    return localaEp;
  }

  public static cSR r(K paramK) {
    cSR localcSR = new cSR();
    for (K localK : paramK.getChildren()) {
      if (localK.getName().equals("reverb")) {
        localcSR.put(localK.e("id").getIntValue(), u(localK));
      }
    }
    return localcSR;
  }

  public float aQv()
  {
    return this.dZS;
  }

  public float aQw() {
    return this.dZT;
  }

  public float aQx() {
    return this.dZU;
  }

  public float aQy() {
    return this.dZV;
  }

  public float aQz() {
    return this.dZW;
  }

  public float aQA() {
    return this.dZX;
  }
}