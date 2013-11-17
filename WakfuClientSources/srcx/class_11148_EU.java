public class EU
{
  public static final short bLY = -1;
  private short aSi;
  private short bLZ;
  private short bMa;
  private short bMb;
  private boolean bMc;
  private boolean bMd;
  private boolean bMe;
  private final bIS bMf;
  private final bhI bMg;

  public EU(bIS parambIS, bhI parambhI)
  {
    this.bMf = parambIS;
    this.bMg = parambhI;
    this.aSi = 0;
    this.bLZ = 10;
    this.bMb = -1;
    this.bMa = -1;
    this.bMc = true;
    this.bMd = false;
    this.bMe = true;
  }

  public short uO() {
    return this.aSi;
  }

  public short Ok() {
    return this.bMa != -1 ? this.bMa : this.bLZ;
  }

  public short Ol() {
    return this.bMb != -1 ? this.bMb : this.bLZ;
  }

  public short Om() {
    return this.bLZ;
  }

  public boolean On() {
    return this.bMc;
  }

  public boolean Oo() {
    return this.bMd;
  }

  public boolean Op() {
    return this.bMe;
  }

  public bIS Oq() {
    return this.bMf;
  }

  public bhI Or() {
    return this.bMg;
  }

  public void F(short paramShort) {
    this.aSi = paramShort;
  }

  public void G(short paramShort) {
    this.bLZ = paramShort;
  }

  public void b(short paramShort1, short paramShort2, short paramShort3) {
    this.bLZ = paramShort1;
    this.bMa = paramShort2;
    this.bMb = paramShort3;
  }

  public void az(boolean paramBoolean) {
    this.bMc = paramBoolean;
  }

  public void aA(boolean paramBoolean) {
    this.bMd = paramBoolean;
  }

  public void aB(boolean paramBoolean) {
    this.bMe = paramBoolean;
  }
}