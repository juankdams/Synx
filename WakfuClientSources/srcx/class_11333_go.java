public enum go
{
  public final byte bJ()
  {
    return (byte)ordinal();
  }

  public static go g(byte paramByte) {
    if (paramByte < 0) {
      return aEp;
    }
    go[] arrayOfgo = values();
    if (paramByte >= arrayOfgo.length) {
      return aEp;
    }
    return arrayOfgo[paramByte];
  }

  public static go E(long paramLong) {
    byte b = (byte)(int)(paramLong >>> 56);
    return g(b);
  }

  public static go R(String paramString) {
    if (paramString == null)
      return aEp;
    return valueOf(paramString.toUpperCase());
  }
}