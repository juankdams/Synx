public class dtG
{
  public static final dtG lwJ = new dtG();

  private final cSR lwK = new cSR();
  private final cSR lwL = new cSR();

  public auG BH(int paramInt) {
    auG localauG = (auG)this.lwK.get(paramInt);
    if (localauG == null) {
      dED localdED = wn.bmg.dn(paramInt);
      if (localdED == null) {
        return null;
      }
      localauG = new auG(localdED);
      this.lwK.put(paramInt, localauG);
    }

    return localauG;
  }

  public void Z(dGy paramdGy) {
    this.lwK.s(paramdGy);
  }

  public LF BI(int paramInt) {
    LF localLF = (LF)this.lwL.get(paramInt);
    if (localLF == null) {
      localLF = new LF(paramInt);
      this.lwL.put(paramInt, localLF);
    }

    return localLF;
  }

  public void aa(dGy paramdGy) {
    this.lwL.s(paramdGy);
  }
}