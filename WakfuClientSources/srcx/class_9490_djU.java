final class djU
  implements BB
{
  private final String PREFIX = "toString:";
  private final int lhb = "toString:".length();

  public Object a(String paramString, afR paramafR) {
    Object localObject = null;
    if ((paramString.startsWith("toString:")) && (paramafR.Ga() != null)) {
      localObject = paramafR.Ga().bR(paramString.substring(this.lhb));
    }
    return localObject == null ? null : localObject.toString();
  }
}