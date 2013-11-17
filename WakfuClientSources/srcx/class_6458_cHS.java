import org.apache.log4j.Logger;

public abstract class cHS
{
  protected static final Logger K = Logger.getLogger(cHS.class);
  public static final int iDp = 1;
  public static final int iDq = 0;

  protected static boolean a(cYk paramcYk, aZK paramaZK, boolean paramBoolean)
  {
    int i = paramBoolean ? 0 : 1;
    cYk localcYk = paramaZK.ML();

    if (Math.abs(localcYk.getX() - paramcYk.getX()) > i) {
      return true;
    }
    if (Math.abs(localcYk.getY() - paramcYk.getY()) > i) {
      return true;
    }
    return false;
  }
}