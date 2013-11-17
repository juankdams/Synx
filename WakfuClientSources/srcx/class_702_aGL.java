public enum aGL
  implements ccI
{
  private final byte hV;
  private final String m_name;

  private aGL(byte arg3, String arg4)
  {
    byte b;
    this.hV = b;
    Object localObject;
    this.m_name = localObject;
  }

  public static aGL bI(byte paramByte) {
    for (aGL localaGL : values()) {
      if (localaGL.hV == paramByte) {
        return localaGL;
      }
    }

    return null;
  }

  public byte bJ() {
    return this.hV;
  }

  public String getName() {
    return this.m_name;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.m_name;
  }

  public String bN() {
    return null;
  }
}