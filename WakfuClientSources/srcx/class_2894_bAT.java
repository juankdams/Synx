public final class bAT
{
  public static final int gqY = 1;
  public static final int gqZ = 2;
  public static final int gra = 4;
  public static final int grb = 8;
  public static final int grc = 16;
  private byte grd;
  private float gre = 25.0F;

  public void d(aYQ paramaYQ) {
    this.grd = paramaYQ.readByte();
    paramaYQ.readShort();
    this.gre = paramaYQ.readByte();
  }

  public void b(dSw paramdSw) {
    paramdSw.writeByte(this.grd);
    paramdSw.writeShort((short)0);
    paramdSw.writeByte((byte)(int)this.gre);
  }

  public float getFrameRate() {
    return this.gre;
  }

  public boolean bJt() {
    return (this.grd & 0x1) != 0;
  }

  public boolean bJu() {
    return (this.grd & 0x2) != 0;
  }

  public void bJv() {
    this.grd = ((byte)(this.grd | 0x2));
  }

  public boolean gJ() {
    return (this.grd & 0x4) == 4;
  }

  public void Xr() {
    this.grd = ((byte)(this.grd | 0x4));
  }

  public boolean bJw()
  {
    return (this.grd & 0x10) == 16;
  }

  public void bJx() {
    this.grd = ((byte)(this.grd | 0x10));
  }

  public boolean bJy() {
    return (this.grd & 0x8) == 8;
  }

  public void bJz() {
    this.grd = ((byte)(this.grd | 0x8));
  }
}