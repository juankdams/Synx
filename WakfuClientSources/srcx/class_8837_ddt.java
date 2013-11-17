import org.apache.log4j.Logger;

public class ddt
{
  private static final Logger K = Logger.getLogger(ddt.class);

  public void info(Object paramObject)
  {
    try
    {
      aEe localaEe = new aEe(paramObject.toString());
      localaEe.mm(4);
      CM.LV().a(localaEe);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  public void error(Object paramObject)
  {
    try
    {
      aEe localaEe = new aEe(paramObject.toString());
      localaEe.mm(4);
      CM.LV().a(localaEe);
      CM.LV().a(localaEe);
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }
}