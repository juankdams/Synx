import org.apache.log4j.Logger;

public class cZd
{
  private static Logger K = Logger.getLogger(cZd.class);
  private Object aOd;
  private bbo kMQ;

  private cZd(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public static cZd a(Object paramObject, String paramString, cpa paramcpa, axU paramaxU)
  {
    if ((paramObject instanceof dBv)) {
      bbo localbbo = null;

      if (paramcpa == null) {
        localbbo = dLE.doY().getProperty(paramString);
      }

      if (localbbo == null) {
        localbbo = new bbo(paramString, paramcpa, true);
        dLE.doY().c(localbbo);
      }

      localbbo.setValue(paramObject, false);

      cZd localcZd = new cZd(paramObject);
      localcZd.f(localbbo);
      localbbo.b(localcZd);

      return localcZd;
    }
    return new cZd(paramObject);
  }

  public static void d(cZd paramcZd)
  {
    if ((paramcZd == null) || (paramcZd.cMf() == null)) {
      return;
    }

    paramcZd.cMf().c(paramcZd);
  }

  public void setValue(Object paramObject)
  {
    this.aOd = paramObject;
  }

  public Object getValue()
  {
    return this.aOd;
  }

  public void f(bbo parambbo)
  {
    this.kMQ = parambbo;
  }

  public bbo cMf()
  {
    return this.kMQ;
  }

  public Object getFieldValue(String paramString)
  {
    if ((this.aOd != null) && ((this.aOd instanceof dBv)) && (paramString != null)) {
      return bbo.c(this.aOd, paramString);
    }
    return null;
  }
}