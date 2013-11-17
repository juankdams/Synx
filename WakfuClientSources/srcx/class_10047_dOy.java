public enum dOy
{
  public static final dOy mgl = mgi;
  private final byte hV;

  private dOy(byte arg3)
  {
    byte b;
    this.hV = b;
  }

  public static dOy rG(String paramString) {
    if (paramString.equals("Zone libre")) {
      return mgi;
    }
    if (paramString.equals("Zone limitée")) {
      return mgj;
    }
    if (paramString.equals("Zone bloquée")) {
      return mgk;
    }
    return mgl;
  }

  public static dOy fV(byte paramByte) {
    for (dOy localdOy : values()) {
      if (localdOy.hV == paramByte) {
        return localdOy;
      }
    }
    return mgl;
  }

  public byte bJ() {
    return this.hV;
  }
}