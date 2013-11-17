public enum bG
{
  private final byte hV;

  private bG(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public byte bJ() {
    return this.hV;
  }

  public static bG d(byte paramByte) {
    bG[] arrayOfbG = values();
    for (int i = 0; i < arrayOfbG.length; i++) {
      bG localbG = arrayOfbG[i];
      if (localbG.hV == paramByte)
        return localbG;
    }
    return null;
  }
}