public enum vH
{
  private static final vH[] bkA = values();
  private final byte hV;
  private final cds bkB;
  private final int[] aSX;
  private static final kb bkC = new kb(0L);

  private vH(int paramArrayOfInt, int arg4, int[] arg5)
  {
    this.hV = bCO.gn(paramArrayOfInt);
    int i;
    this.bkB = kb.I(i);
    Object localObject;
    this.aSX = localObject;
  }

  public static vH K(byte paramByte) {
    for (vH localvH : values()) {
      if (localvH.hV == paramByte) {
        return localvH;
      }
    }
    return null;
  }

  public cds EK() {
    return this.bkB;
  }

  public byte bJ() {
    return this.hV;
  }

  public int[] vD() {
    return this.aSX;
  }

  public static vH dj(int paramInt)
  {
    bkC.set(paramInt, 0, 0, 0);
    for (int i = bkA.length - 1; i >= 0; i--) {
      vH localvH = bkA[i];
      if (localvH.bkB.c(bkC)) {
        return localvH;
      }
    }
    return bku;
  }

  public static vH dk(int paramInt) {
    if (paramInt <= 0) {
      return null;
    }
    for (vH localvH : bkA) {
      if (aUP.c(localvH.aSX, paramInt)) {
        return localvH;
      }
    }
    return null;
  }
}