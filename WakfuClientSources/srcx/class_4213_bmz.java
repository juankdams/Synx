public enum bmz
  implements dEn
{
  private final String hX;
  private final cXb bsM;

  private bmz(String arg3, cXb arg4)
  {
    Object localObject1;
    this.hX = localObject1;
    Object localObject2;
    this.bsM = localObject2;
  }

  public String getKey() {
    return this.hX;
  }

  public ciW Hs() {
    return cZy.a(this.bsM);
  }

  public static dEn bk(String paramString) {
    for (bmz localbmz : values()) {
      if (localbmz.getKey().equals(paramString)) {
        return localbmz;
      }
    }
    return null;
  }
}