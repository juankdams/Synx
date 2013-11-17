public enum dKy
{
  private float value;
  private String name;

  private dKy(float arg3, String arg4)
  {
    Object localObject1;
    this.value = localObject1;
    Object localObject2;
    this.name = localObject2;
  }

  public boolean b(dKy paramdKy)
  {
    return this.value >= paramdKy.value;
  }

  static dKy rm(String paramString)
  {
    return rn(paramString);
  }

  static dKy rn(String paramString)
  {
    if ("0.9".equals(paramString))
      return lYh;
    if ("1.1".equals(paramString))
      return lYi;
    if ("1.2".equals(paramString))
      return lYj;
    if ("1.3".equals(paramString))
      return lYk;
    if ("1.4".equals(paramString))
      return lYl;
    if ("1.5".equals(paramString))
      return lYm;
    if ("1.6".equals(paramString))
      return lYn;
    if ("1.7".equals(paramString))
      return lYo;
    if ("1.8".equals(paramString)) {
      return lYp;
    }
    return null;
  }

  public String toString()
  {
    return this.name;
  }
}