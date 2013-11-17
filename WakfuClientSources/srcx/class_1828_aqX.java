public class aqX
{
  private float dyF;
  private short[] dyG;
  private final cYL dyH = new cYL();

  public void g(aYQ paramaYQ) {
    this.dyH.d(paramaYQ);
    this.dyF = paramaYQ.readFloat();
    this.dyG = paramaYQ.ou(4);
  }

  public float aDe() {
    return this.dyF;
  }

  short a(nM paramnM) {
    return this.dyG[paramnM.ordinal()];
  }

  public cCc[] aDf() {
    cCc[] arrayOfcCc = this.dyH.aDf();
    return arrayOfcCc == null ? dt.TJ : arrayOfcCc;
  }

  public cyB[] aDg() {
    cyB[] arrayOfcyB = this.dyH.aDg();
    return arrayOfcyB == null ? dt.TK : arrayOfcyB;
  }

  public dsc[] aDh() {
    dsc[] arrayOfdsc = this.dyH.aDh();
    return arrayOfdsc == null ? dt.TI : arrayOfdsc;
  }
}