public final class bep extends bMu
{
  public static final int fqX = 128;
  public static final int fqY = 64;
  public static final int fqZ = 48;
  public static final int fra = 16;
  private static final int frb = 192;
  private static final int frc = 48;
  public static final int frd = 15;
  private static final int fre = 207;
  public static final int frf = 0;
  public static final int frg = 128;
  public static final int frh = 64;
  public static final int fri = 192;
  public static final int frj = 1;
  public static final int frk = 2;
  public static final int frl = 4;
  public byte flI;
  public byte frm = 0;
  public byte frn;

  public bep()
  {
  }

  public bep(bep parambep)
  {
    a(parambep);
  }

  public static bep[] brZ()
  {
    bep[] arrayOfbep = new bep[32];
    for (int i = 0; i < arrayOfbep.length; i++)
      arrayOfbep[i] = new bep();
    return arrayOfbep;
  }

  public static short a(bep[] paramArrayOfbep, dNg paramdNg, int paramInt1, int paramInt2, short paramShort) {
    short s = -1;
    int i = paramdNg.a(paramInt1, paramInt2, paramArrayOfbep, 0);
    if (i == 1) {
      if (paramArrayOfbep[0].aOl == paramShort)
        s = 0;
    }
    else for (int j = 0; j < i; j++) {
        if ((paramArrayOfbep[j].aOl == paramShort) && (!paramArrayOfbep[j].gPY)) {
          s = (short)j;
          break;
        }
      }

    return s;
  }

  public void a(bep parambep)
  {
    this.hY = parambep.hY;
    this.hZ = parambep.hZ;
    this.aOl = parambep.aOl;
    this.io = parambep.io;
    this.gPY = parambep.gPY;
    this.flI = parambep.flI;
    this.frm = parambep.frm;
    this.frn = parambep.frn;
  }

  public String toString()
  {
    return 28 + "CellPathData(" + this.hY + ',' + this.hZ + ',' + this.aOl + ',' + this.io + ')';
  }

  public int bsa()
  {
    return this.frm & 0xC0;
  }

  public int bsb()
  {
    return this.frm;
  }

  public int bsc() {
    return this.frm & 0x30;
  }

  public int bsd() {
    return this.frm & 0xFFFFFF30;
  }

  public int RV() {
    return this.frm & 0xF;
  }

  public boolean bse() {
    return (this.frn & 0x1) == 1;
  }

  public boolean bsf() {
    return (this.frn & 0x2) == 2;
  }

  public boolean bsg() {
    return (this.frn & 0x4) == 4;
  }

  public static boolean pc(int paramInt) {
    return (paramInt & 0x80) == 128;
  }

  public static boolean pd(int paramInt) {
    return (paramInt & 0x40) == 64;
  }

  public bMu a(bMu parambMu) {
    bep localbep1 = new bep();
    a(this, parambMu, localbep1);

    bep localbep2 = parambMu.aOl >= this.aOl ? (bep)parambMu : this;

    localbep1.flI = localbep2.flI;
    localbep1.frm = localbep2.frm;
    localbep1.frn = localbep2.frn;
    return localbep1;
  }
}