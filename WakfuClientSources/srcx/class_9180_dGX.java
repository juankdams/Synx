public enum dGX
  implements aqm, ccI
{
  private final byte hV;
  private final String aKM;
  private final qM aZl;

  private dGX(int paramString, qM arg4, String arg5)
  {
    this.hV = ((byte)paramString);
    Object localObject2;
    this.aKM = localObject2;
    Object localObject1;
    this.aZl = localObject1;
  }

  public String bK() {
    return String.valueOf(this.hV);
  }

  public String bL() {
    return this.aKM;
  }

  public static dGX CG(int paramInt) {
    for (dGX localdGX : values())
      if (localdGX.hV == paramInt)
        return localdGX;
    return null;
  }

  public qM aF() {
    return this.aZl;
  }

  public String bN() {
    return null;
  }

  public byte bJ() {
    return this.hV;
  }
}