public class dVe extends cQd
{
  public static final byte aDG = 3;
  private bib mtU;

  public bib dvl()
  {
    return this.mtU;
  }

  public void a(bib parambib) {
    this.mtU = parambib;
  }

  public boolean aOX() {
    return axg.aIP().aIS() == this.mtU.bJ();
  }

  public byte nq() {
    return 3;
  }

  public void k(aYQ paramaYQ) {
    this.mtU = bib.cM(paramaYQ.readByte());
  }

  public void e(dSw paramdSw) {
    paramdSw.writeByte(this.mtU.bJ());
  }

  public String aOY() {
    return "Type de zone : " + this.mtU.toString();
  }

  public XF ajE()
  {
    dVe localdVe = new dVe();
    localdVe.a(this.mtU);
    localdVe.iF(ajF());
    return localdVe;
  }
}