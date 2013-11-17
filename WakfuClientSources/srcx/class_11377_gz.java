public class gz
  implements ML
{
  public static final byte aDG = 0;
  private TE aEP;

  public gz()
  {
  }

  public gz(TE paramTE)
  {
    this.aEP = paramTE;
  }

  public void a(TE paramTE) {
    this.aEP = paramTE;
  }

  public TE nF() {
    return this.aEP;
  }

  public boolean a(rP paramrP) {
    if (paramrP.yo() != 0) {
      return false;
    }

    azB localazB = (azB)paramrP;
    return localazB.aLx() == this.aEP;
  }

  public void d(aYQ paramaYQ) {
    this.aEP = TE.at(paramaYQ.readByte());
  }

  public void b(dSw paramdSw) {
    paramdSw.writeByte(this.aEP.bJ());
  }

  public byte nq() {
    return 0;
  }

  public ML nr() {
    return new gz(this.aEP);
  }
}