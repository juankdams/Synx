public enum bmt
{
  public final byte bUy;

  private bmt(int arg3)
  {
    int j;
    this.bUy = ((byte)j);
  }

  public static bmt cW(byte paramByte) {
    bmt[] arrayOfbmt = values();
    for (int i = 0; i < arrayOfbmt.length; i++) {
      bmt localbmt = arrayOfbmt[i];
      if (localbmt.bUy == paramByte)
        return localbmt;
    }
    return null;
  }
}