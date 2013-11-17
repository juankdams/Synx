public enum EH
{
  private final String bKu;

  private EH(String arg3)
  {
    Object localObject;
    this.bKu = localObject;
  }

  public static EH bD(String paramString)
  {
    for (EH localEH : values()) {
      if (localEH.bKu.equals(paramString)) {
        return localEH;
      }
    }
    return null;
  }
}