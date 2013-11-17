public class asm
  implements ML
{
  public static final byte aDG = 3;
  private wK dCg;
  private short aDI = -1;
  private short aDJ = -1;

  public asm() {
  }

  public asm(wK paramwK, short paramShort1, short paramShort2) {
    this.dCg = paramwK;
    this.aDI = paramShort1;
    this.aDJ = paramShort2;
  }

  public wK aEF() {
    return this.dCg;
  }

  public void a(wK paramwK) {
    this.dCg = paramwK;
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
    if (paramrP.yo() != 3) {
      return false;
    }

    cld localcld = (cld)paramrP;
    if (localcld.cmT() != this.dCg) {
      return false;
    }

    if ((this.aDI != -1) && (localcld.nP() < this.aDI)) {
      return false;
    }

    if ((this.aDJ != -1) && (localcld.nP() > this.aDJ)) {
      return false;
    }

    return true;
  }

  public void d(aYQ paramaYQ) {
    this.dCg = wK.dq(paramaYQ.readInt());
    this.aDI = paramaYQ.readShort();
    this.aDJ = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.dCg.getId());
    paramdSw.writeShort(this.aDI);
    paramdSw.writeShort(this.aDJ);
  }

  public byte nq() {
    return 3;
  }

  public ML nr() {
    return new asm(this.dCg, this.aDI, this.aDJ);
  }
}