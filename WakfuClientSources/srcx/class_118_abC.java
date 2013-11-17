public class abC
  implements ML
{
  public static final byte aDG = 2;
  private byu cQd;
  private short aDI = -1;
  private short aDJ = -1;

  public abC() {
  }

  public abC(byu parambyu, short paramShort1, short paramShort2) {
    this.cQd = parambyu;
    this.aDI = paramShort1;
    this.aDJ = paramShort2;
  }

  public byu anX() {
    return this.cQd;
  }

  public void a(byu parambyu) {
    this.cQd = parambyu;
  }

  public short no() {
    return this.aDI;
  }

  public void j(short paramShort) {
    this.aDI = paramShort;
  }

  public short np() {
    return this.aDJ;
  }

  public void k(short paramShort) {
    this.aDJ = paramShort;
  }

  public boolean a(rP paramrP) {
    if (paramrP.yo() != 2) {
      return false;
    }

    td localtd = (td)paramrP;
    if (localtd.AE() != this.cQd) {
      return false;
    }

    if ((this.aDI != -1) && (localtd.getStrength() < this.aDI)) {
      return false;
    }

    if ((this.aDJ != -1) && (localtd.getStrength() > this.aDJ)) {
      return false;
    }

    return true;
  }

  public void d(aYQ paramaYQ) {
    this.cQd = byu.dg(paramaYQ.readByte());
    this.aDI = paramaYQ.readShort();
    this.aDJ = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeByte(this.cQd.hV);
    paramdSw.writeShort(this.aDI);
    paramdSw.writeShort(this.aDJ);
  }

  public byte nq() {
    return 2;
  }

  public ML nr() {
    return new abC(this.cQd, this.aDI, this.aDJ);
  }
}