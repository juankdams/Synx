import org.apache.log4j.Logger;

public class bmv extends dKl
{
  public static final String TAG = "margin";
  private static final Logger K = Logger.getLogger(bmv.class);

  private static final aee aOr = new bOO(new cJQ(), 1000);

  public String getTag()
  {
    return "margin";
  }

  public static bmv checkOut()
  {
    bmv localbmv;
    try
    {
      localbmv = (bmv)aOr.Mm();
      localbmv.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localbmv = new bmv();
      localbmv.aJ();
    }
    return localbmv;
  }
}