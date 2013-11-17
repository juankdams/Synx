public class ajR
{
  public static final ajR djz = new ajR(0.5F, 0.5F);
  public static final String djA = "gain";
  public static final String djB = "gainHF";
  private float cLN = 0.5F;
  private float djC = 0.5F;

  private ajR()
  {
  }

  public ajR(float paramFloat1, float paramFloat2)
  {
    this.cLN = paramFloat1;
    this.djC = paramFloat2;
  }

  public static ajR q(K paramK) {
    ajR localajR = new ajR();
    for (K localK : paramK.getChildren()) {
      if (localK.getName().equals("gain"))
        localajR.cLN = localK.e("value").ai();
      else if (localK.getName().equals("gainHF")) {
        localajR.djC = localK.e("value").ai();
      }
    }
    return localajR;
  }

  public static cSR r(K paramK) {
    cSR localcSR = new cSR();
    for (K localK : paramK.getChildren()) {
      if (localK.getName().equals("lowpass")) {
        localcSR.put(localK.e("id").getIntValue(), q(localK));
      }
    }
    return localcSR;
  }

  public float alh()
  {
    return this.cLN;
  }

  public float axg()
  {
    return this.djC;
  }
}