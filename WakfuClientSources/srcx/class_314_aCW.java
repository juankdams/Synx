public class aCW extends cQd
{
  public static final byte aDG = 0;
  private clK ciJ;

  public clK abK()
  {
    return this.ciJ;
  }

  public void a(clK paramclK) {
    this.ciJ = paramclK;
  }

  public boolean aOX() {
    return axg.aIP().abK() == this.ciJ;
  }

  public byte nq() {
    return 0;
  }

  public void k(aYQ paramaYQ) {
    this.ciJ = clK.values()[paramaYQ.readByte()];
  }

  public void e(dSw paramdSw) {
    paramdSw.writeByte((byte)this.ciJ.ordinal());
  }

  public String aOY() {
    return "Saison : " + this.ciJ.toString();
  }

  public XF ajE()
  {
    aCW localaCW = new aCW();
    localaCW.iF(ajF());
    localaCW.a(this.ciJ);
    return localaCW;
  }
}