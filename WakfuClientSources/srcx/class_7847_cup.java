class cup
  implements bhn
{
  private final int ieW;
  private final bPu ieX;
  private final cfh ieY;

  cup(int paramInt1, bPu parambPu, int paramInt2)
  {
    this.ieW = paramInt1;
    this.ieX = parambPu;
    this.ieY = new cfh(paramInt2);
  }

  public cfh csM() {
    return this.ieY;
  }

  public boolean b(byte paramByte, byte[] paramArrayOfByte) {
    if (paramByte == 0) {
      return true;
    }

    short s = dm((short)paramByte);
    short[] arrayOfShort = new short[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfShort[i] = dm((short)paramArrayOfByte[i]);
    }
    if ((!bB) && (this.ieX.contains(s))) throw new AssertionError();
    this.ieX.c(s, arrayOfShort);
    this.ieY.b(s, arrayOfShort);
    return true;
  }

  private short dm(short paramShort) {
    if (paramShort == 0) {
      return 0;
    }
    return paramShort > 0 ? (short)(paramShort + this.ieW) : (short)(paramShort - this.ieW);
  }
}