public final class bNa
{
  public static final bNa gRt = new bNa(0.0F, 0.0F, 0.0F, 0.0F);
  public static final bNa gRu = new bNa(1.0F, 1.0F, 1.0F, 0.0F);
  public static final bNa gRv = new bNa(1.0F, 1.0F, 1.0F, 0.5F);
  public static final bNa gRw = new bNa(1.0F, 1.0F, 1.0F, 0.25F);
  public static final bNa gRx = new bNa(1.0F, 1.0F, 1.0F, 1.0F);
  public static final bNa gRy = new bNa(0.0F, 0.0F, 0.0F, 1.0F);
  public static final bNa gRz = new bNa(1.0F, 0.0F, 0.0F, 1.0F);
  public static final bNa gRA = new bNa(0.0F, 1.0F, 0.0F, 1.0F);
  public static final bNa gRB = new bNa(0.0F, 0.4F, 0.0F, 1.0F);
  public static final bNa gRC = new bNa(0.0F, 0.0F, 1.0F, 1.0F);
  public static final bNa gRD = new bNa(0.0F, 1.0F, 1.0F, 1.0F);
  public static final bNa gRE = new bNa(128, 128, 128, 255);
  public static final bNa gRF = new bNa(64, 64, 64, 255);
  public static final bNa gRG = new bNa(192, 192, 192, 255);
  public static final bNa gRH = new bNa(224, 224, 224, 255);
  public static final bNa gRI = new bNa(0.57F, 0.2F, 0.75F, 0.66F);
  public static final bNa gRJ = new bNa(0.95F, 0.64F, 0.25F, 1.0F);
  public static final bNa gRK = new bNa(237, 172, 97, 255);
  private static final int bs = 255;
  private static final int gRL = 255;
  private static final int gRM = 24;
  private static final int gRN = 16;
  private static final int gRO = 8;
  private static final int gRP = 16;
  private int gRQ;

  public bNa()
  {
    this.gRQ = 0;
  }

  public bNa(bNa parambNa)
  {
    this.gRQ = parambNa.gRQ;
  }

  public bNa(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    k(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public bNa(int paramInt)
  {
    this.gRQ = paramInt;
  }

  public bNa(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    d(paramByte1, paramByte2, paramByte3, paramByte4);
  }

  public bNa(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    v(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public int get()
  {
    return this.gRQ;
  }

  public int bUH() {
    return this.gRQ;
  }

  public int bUI() {
    return x(bUP(), bUQ(), bUR(), bUO());
  }

  public int bUJ() {
    return x(bUO(), bUP(), bUQ(), bUR());
  }

  public byte bUK() {
    return (byte)(this.gRQ >> 24 & 0xFF);
  }

  public byte bUL() {
    return (byte)(this.gRQ & 0xFF);
  }

  public byte bUM() {
    return (byte)(this.gRQ >> 8 & 0xFF);
  }

  public byte bUN() {
    return (byte)(this.gRQ >> 16 & 0xFF);
  }

  public int bUO() {
    return this.gRQ >> 24 & 0xFF;
  }

  public int bUP() {
    return this.gRQ & 0xFF;
  }

  public int bUQ() {
    return this.gRQ >> 8 & 0xFF;
  }

  public int bUR() {
    return this.gRQ >> 16 & 0xFF;
  }

  public float getAlpha() {
    int i = bUO();
    if (i < 0)
      i = 256 + i;
    return i / 255.0F;
  }

  public float QC() {
    return bUP() / 255.0F;
  }

  public float QD() {
    return bUQ() / 255.0F;
  }

  public float QE() {
    return bUR() / 255.0F;
  }

  public float bUS() {
    return Math.max(QC(), Math.max(QE(), QD()));
  }

  public float bEK() {
    return (QC() + QD() + QE()) / 3.0F;
  }

  public void bx(float paramFloat) {
    if ((!bB) && ((paramFloat < 0.0F) || (paramFloat > 1.0F))) throw new AssertionError("Invalid intensity value " + paramFloat);

    float f1 = Math.max(QC(), Math.max(QE(), QD()));

    if (f1 == 0.0F) {
      k(paramFloat, paramFloat, paramFloat, getAlpha());
      return;
    }

    float f2 = paramFloat / f1;
    float f3 = Math.min(1.0F, QC() * f2);
    float f4 = Math.min(1.0F, QE() * f2);
    float f5 = Math.min(1.0F, QD() * f2);

    k(f3, f5, f4, getAlpha());
  }

  public float[] bUT() {
    return new float[] { QC(), QD(), QE(), getAlpha() };
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.gRQ = l(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }

  public void z(float paramFloat) {
    float f = bCO.t(paramFloat, 0.0F, 1.0F);
    this.gRQ = (this.gRQ & 0xFFFFFF | (int)(f * 255.0F) << 24);
  }

  public void f(bNa parambNa) {
    this.gRQ = parambNa.gRQ;
  }

  public void set(int paramInt)
  {
    this.gRQ = paramInt;
  }

  public void tt(int paramInt) {
    this.gRQ = tz(paramInt);
  }

  public void tu(int paramInt) {
    this.gRQ = tA(paramInt);
  }

  public void d(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    this.gRQ = e(paramByte1, paramByte2, paramByte3, paramByte4);
  }

  public void v(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.gRQ = w(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void g(bNa parambNa) {
    k(QC() * parambNa.QC(), QD() * parambNa.QD(), QE() * parambNa.QE(), getAlpha() * parambNa.getAlpha());
  }

  public void bUU()
  {
    v(bCO.cL(0, 255), bCO.cL(0, 255), bCO.cL(0, 255), bCO.cL(0, 255));
  }

  public static bNa a(bNa parambNa1, bNa parambNa2)
  {
    bNa localbNa = new bNa(parambNa1);
    localbNa.g(parambNa2);
    return localbNa;
  }

  public static float tv(int paramInt) {
    return (paramInt >> 24 & 0xFF) / 255.0F;
  }

  public static float tw(int paramInt) {
    return (paramInt >> 16 & 0xFF) / 255.0F;
  }

  public static float tx(int paramInt) {
    return (paramInt >> 8 & 0xFF) / 255.0F;
  }

  public static float ty(int paramInt) {
    return (paramInt & 0xFF) / 255.0F;
  }

  public static int l(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    return (int)(bCO.t(paramFloat4, 0.0F, 1.0F) * 255.0F) << 24 | (int)(bCO.t(paramFloat1, 0.0F, 1.0F) * 255.0F) | (int)(bCO.t(paramFloat2, 0.0F, 1.0F) * 255.0F) << 8 | (int)(bCO.t(paramFloat3, 0.0F, 1.0F) * 255.0F) << 16;
  }

  public static int e(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    return clH.dM(paramByte4) << 24 | clH.dM(paramByte1) | clH.dM(paramByte2) << 8 | clH.dM(paramByte3) << 16;
  }

  public static int w(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return bCO.J(paramInt4, 0, 255) << 24 | bCO.J(paramInt1, 0, 255) | bCO.J(paramInt2, 0, 255) << 8 | bCO.J(paramInt3, 0, 255) << 16;
  }

  public static int tz(int paramInt)
  {
    return w(paramInt >> 8 & 0xFF, paramInt >> 16 & 0xFF, paramInt >> 24 & 0xFF, paramInt & 0xFF);
  }

  public static int tA(int paramInt)
  {
    return w(paramInt >> 16 & 0xFF, paramInt >> 8 & 0xFF, paramInt & 0xFF, paramInt >> 24 & 0xFF);
  }

  private static int x(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return bCO.J(paramInt1, 0, 255) << 24 | bCO.J(paramInt2, 0, 255) << 16 | bCO.J(paramInt3, 0, 255) << 8 | bCO.J(paramInt4, 0, 255);
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(ty(this.gRQ)).append(", ").append(tx(this.gRQ)).append(", ").append(tw(this.gRQ)).append(", ").append(tv(this.gRQ));
    return localStringBuilder.toString();
  }

  public String bUV() {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = (bUP() < 16 ? "0" : "") + Integer.toHexString(bUP());
    String str2 = (bUQ() < 16 ? "0" : "") + Integer.toHexString(bUQ());
    String str3 = (bUR() < 16 ? "0" : "") + Integer.toHexString(bUR());
    localStringBuilder.append(str1).append(str2).append(str3);
    return localStringBuilder.toString();
  }

  public String bUW() {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = (bUP() < 16 ? "0" : "") + Integer.toHexString(bUP());
    String str2 = (bUQ() < 16 ? "0" : "") + Integer.toHexString(bUQ());
    String str3 = (bUR() < 16 ? "0" : "") + Integer.toHexString(bUR());
    String str4 = (bUO() < 16 ? "0" : "") + Integer.toHexString(bUO());
    localStringBuilder.append(str1).append(str2).append(str3).append(str4);
    return localStringBuilder.toString();
  }

  public static bNa kd(String paramString) {
    if (paramString.charAt(0) == '#')
      paramString = paramString.substring(1);
    int i = Integer.parseInt(paramString.substring(0, 2), 16);
    int j = Integer.parseInt(paramString.substring(2, 4), 16);
    int k = Integer.parseInt(paramString.substring(4, 6), 16);
    int m;
    if (paramString.length() == 8)
      m = Integer.parseInt(paramString.substring(6, 8), 16);
    else {
      m = 255;
    }

    return new bNa(i, j, k, m);
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass())) {
      return false;
    }
    bNa localbNa = (bNa)paramObject;

    if (this.gRQ != localbNa.gRQ) {
      return false;
    }
    return true;
  }

  public int hashCode()
  {
    return this.gRQ;
  }
}