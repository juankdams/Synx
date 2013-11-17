public enum rn
  implements aqm, ccI
{
  private final byte hV;
  private final String aKM;
  private final qM aZl;

  private rn(int paramString, qM arg4, String arg5)
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

  public static rn cy(int paramInt) {
    for (rn localrn : values())
      if (localrn.hV == paramInt)
        return localrn;
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