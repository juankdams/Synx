public abstract class cUh
{
  protected final short aDx;
  protected final short gTZ;
  protected final int kGz;
  protected final byte kGA;
  protected final int kGB;
  protected final int heo;
  protected final int kGC;
  protected final boolean fBE;

  protected cUh(short paramShort1, short paramShort2, int paramInt1, byte paramByte, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    this.aDx = paramShort1;
    this.gTZ = paramShort2;
    this.kGz = paramInt1;
    this.kGA = paramByte;
    this.kGB = paramInt2;
    this.heo = paramInt3;
    this.kGC = paramInt4;
    this.fBE = paramBoolean;
  }

  public short nc() {
    return this.aDx;
  }

  public int cJu() {
    return this.kGz;
  }

  public int bcY() {
    return this.heo;
  }

  public abstract int xN(int paramInt);

  public short bVJ() {
    return this.gTZ;
  }

  public byte cJv() {
    return this.kGA;
  }

  public int bVy() {
    return this.kGB;
  }

  public int cJw() {
    return this.kGC;
  }

  public boolean clx() {
    return this.fBE;
  }

  public abstract boolean aTC();

  public abstract boolean cBI();

  public abstract boolean k(dGy paramdGy);

  public abstract boolean xO(int paramInt);

  public abstract int[] cBH();
}