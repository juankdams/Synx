public class cwT
{
  public biv cul()
  {
    return R(null);
  }

  public biv R(FF paramFF)
  {
    String str = null;
    if (paramFF == null)
      str = System.getProperty("ant.regexp.regexpimpl");
    else {
      str = paramFF.getProperty("ant.regexp.regexpimpl");
    }

    if (str != null) {
      return ms(str);
    }

    return new dfm();
  }

  protected biv ms(String paramString)
  {
    return (biv)bmR.a(paramString, cwT.class.getClassLoader(), biv.class);
  }

  protected void mt(String paramString)
  {
    try
    {
      Class.forName(paramString);
    } catch (Throwable localThrowable) {
      throw new cJ(localThrowable);
    }
  }

  public static boolean S(FF paramFF)
  {
    try
    {
      new cwT().R(paramFF);
      return true; } catch (Throwable localThrowable) {
    }
    return false;
  }
}