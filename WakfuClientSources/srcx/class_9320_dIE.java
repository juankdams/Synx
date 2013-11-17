public final class dIE
{
  private short lTT;
  private int lTU;
  private int lTV;
  private short lTW;
  private byte dSl;
  private boolean bQF;
  private boolean lTX;

  public dIE(short paramShort)
  {
    this.lTT = paramShort;
  }

  public dIE(short paramShort1, int paramInt1, int paramInt2, short paramShort2, byte paramByte, boolean paramBoolean1, boolean paramBoolean2) {
    this.lTT = paramShort1;
    this.lTU = paramInt1;
    this.lTV = paramInt2;
    this.lTW = paramShort2;
    this.dSl = paramByte;
    this.bQF = paramBoolean1;
    this.lTX = paramBoolean2;
  }

  public short diu() {
    return this.lTT;
  }

  public int div() {
    return this.lTU;
  }

  public int diw() {
    return this.lTV;
  }

  public short dix() {
    return this.lTW;
  }

  public byte aLR() {
    return this.dSl;
  }

  public boolean Ry() {
    return this.bQF;
  }

  public boolean diy() {
    return this.lTX;
  }

  int aa(short paramShort1, short paramShort2)
  {
    int i = this.lTU - paramShort1 * 18;
    int j = this.lTV - paramShort2 * 18;
    if ((i < 0) || (i >= 18)) {
      throw new RuntimeException("relativeX invalide: " + i);
    }
    if ((j < 0) || (j >= 18)) {
      throw new RuntimeException("relativeY invalide: " + j);
    }
    int k = i * 18 + j;
    if ((!bB) && ((k & 0x1FF) != k)) throw new AssertionError("relativeXY invalide: " + k);
    int m = this.lTW & 0xFFFF;
    int n = this.dSl & 0x1F;
    if ((this.dSl & 0x1F) != this.dSl) {
      throw new RuntimeException("EvolutionStep trop grand: " + this.dSl);
    }
    int i1 = this.bQF ? 1 : 0;
    int i2 = this.lTX ? 1 : 0;
    return i2 << 31 | i1 << 30 | n << 25 | m << 9 | k;
  }

  void d(int paramInt, short paramShort1, short paramShort2) {
    int i = paramInt & 0x1FF;
    this.lTU = (paramShort1 * 18 + i / 18);
    this.lTV = (paramShort2 * 18 + i % 18);
    this.lTW = ((short)(paramInt >>> 9 & 0xFFFF));
    this.dSl = ((byte)(paramInt >>> 25 & 0x1F));
    this.bQF = ((paramInt >>> 30 & 0x1) == 1);
    this.lTX = (paramInt >>> 31 == 1);
  }
}