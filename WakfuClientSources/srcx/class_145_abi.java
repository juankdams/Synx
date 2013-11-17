public enum abi
  implements coM
{
  private final String cPC;
  private final String cPD;
  private final int cPE;

  private abi(int paramString2, String arg4, String arg5)
  {
    this.cPE = paramString2;
    Object localObject1;
    this.cPC = localObject1;
    Object localObject2;
    this.cPD = localObject2;
  }

  public String anI() {
    return this.cPC;
  }

  public String anJ() {
    return this.cPD;
  }

  public static abi dW(String paramString) {
    for (abi localabi : values()) {
      if (localabi.anI().equals(paramString))
        return localabi;
    }
    return null;
  }
}