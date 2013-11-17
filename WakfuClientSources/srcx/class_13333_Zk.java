public class Zk extends cwT
{
  public cyp akv()
  {
    return o(null);
  }

  public cyp o(FF paramFF)
  {
    String str = null;
    if (paramFF == null)
      str = System.getProperty("ant.regexp.regexpimpl");
    else {
      str = paramFF.getProperty("ant.regexp.regexpimpl");
    }

    if (str != null) {
      return dT(str);
    }

    return new aNI();
  }

  protected cyp dT(String paramString)
  {
    return (cyp)bmR.a(paramString, Zk.class.getClassLoader(), cyp.class);
  }
}