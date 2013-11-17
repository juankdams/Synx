public enum byu
{
  final byte hV;

  private byu(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public static byu dg(byte paramByte) {
    for (byu localbyu : values()) {
      if (localbyu.hV == paramByte) {
        return localbyu;
      }
    }

    return null;
  }
}