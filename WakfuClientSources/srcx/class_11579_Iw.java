public class Iw
{
  private static final int[] bRi = new int[256];
  public byte[] bRj;
  public int header;
  public int bRk;
  public byte[] bRl;
  public int bRm;
  public int bRn;

  private static int fi(int paramInt)
  {
    int i = paramInt << 24;
    for (int j = 0; j < 8; j++) {
      if ((i & 0x80000000) != 0) {
        i = i << 1 ^ 0x4C11DB7;
      }
      else
      {
        i <<= 1;
      }
    }
    return i & 0xFFFFFFFF;
  }

  public void xo()
  {
    this.bRj = null;
    this.header = 0;
    this.bRk = 0;
    this.bRl = null;
    this.bRm = 0;
    this.bRn = 0;
  }

  int version() {
    return this.bRj[(this.header + 4)] & 0xFF;
  }

  int RM() {
    return this.bRj[(this.header + 5)] & 0x1;
  }

  public int RN() {
    return this.bRj[(this.header + 5)] & 0x2;
  }

  public int RO() {
    return this.bRj[(this.header + 5)] & 0x4;
  }

  public long RP() {
    long l = this.bRj[(this.header + 13)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 12)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 11)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 10)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 9)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 8)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 7)] & 0xFF;
    l = l << 8 | this.bRj[(this.header + 6)] & 0xFF;
    return l;
  }

  public int RQ() {
    return this.bRj[(this.header + 14)] & 0xFF | (this.bRj[(this.header + 15)] & 0xFF) << 8 | (this.bRj[(this.header + 16)] & 0xFF) << 16 | (this.bRj[(this.header + 17)] & 0xFF) << 24;
  }

  int RR()
  {
    return this.bRj[(this.header + 18)] & 0xFF | (this.bRj[(this.header + 19)] & 0xFF) << 8 | (this.bRj[(this.header + 20)] & 0xFF) << 16 | (this.bRj[(this.header + 21)] & 0xFF) << 24;
  }

  void RS()
  {
    int i = 0;

    for (int j = 0; j < this.bRk; j++) {
      i = i << 8 ^ bRi[(i >>> 24 & 0xFF ^ this.bRj[(this.header + j)] & 0xFF)];
    }

    for (j = 0; j < this.bRn; j++) {
      i = i << 8 ^ bRi[(i >>> 24 & 0xFF ^ this.bRl[(this.bRm + j)] & 0xFF)];
    }

    this.bRj[(this.header + 22)] = ((byte)i);
    this.bRj[(this.header + 23)] = ((byte)(i >>> 8));
    this.bRj[(this.header + 24)] = ((byte)(i >>> 16));
    this.bRj[(this.header + 25)] = ((byte)(i >>> 24));
  }

  static
  {
    for (int i = 0; i < bRi.length; i++)
      bRi[i] = fi(i);
  }
}