public class gg
  implements ML
{
  public static final byte aDG = 1;
  private int aDH;
  private short aDI = -1;
  private short aDJ = -1;

  public gg() {
  }

  public gg(int paramInt, short paramShort1, short paramShort2) {
    this.aDH = paramInt;
    this.aDI = paramShort1;
    this.aDJ = paramShort2;
  }

  public void aG(int paramInt) {
    this.aDH = paramInt;
  }

  public int nn() {
    return this.aDH;
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
    if (paramrP.yo() != 1) {
      return false;
    }

    cln localcln = (cln)paramrP;
    if (localcln.nn() != this.aDH) {
      return false;
    }

    if ((this.aDI != -1) && (localcln.nP() < this.aDI)) {
      return false;
    }

    if ((this.aDJ != -1) && (localcln.nP() > this.aDJ)) {
      return false;
    }

    return true;
  }

  public void d(aYQ paramaYQ) {
    this.aDH = paramaYQ.readInt();
    this.aDI = paramaYQ.readShort();
    this.aDJ = paramaYQ.readShort();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeInt(this.aDH);
    paramdSw.writeShort(this.aDI);
    paramdSw.writeShort(this.aDJ);
  }

  public byte nq() {
    return 1;
  }

  public ML nr() {
    return new gg(this.aDH, this.aDI, this.aDJ);
  }
}