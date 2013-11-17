public enum PY
  implements ccI
{
  private final byte aNc;
  private final String aKM;

  private PY(int arg3, String arg4)
  {
    Object localObject;
    this.aKM = localObject;
    int i;
    this.aNc = ((byte)i);
  }

  public String bK() {
    return String.valueOf(this.aNc);
  }

  public String bL() {
    return this.aKM;
  }

  public String bN() {
    return null;
  }

  public static PY gm(int paramInt) {
    for (PY localPY : values()) {
      if (localPY.aNc == paramInt)
        return localPY;
    }
    return null;
  }
}