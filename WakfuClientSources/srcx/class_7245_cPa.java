public enum cPa
{
  private final byte hV;

  private cPa(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public static cPa ez(byte paramByte) {
    for (cPa localcPa : values())
      if (paramByte == localcPa.hV)
        return localcPa;
    return null;
  }
}