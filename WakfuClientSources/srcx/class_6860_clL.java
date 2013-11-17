import org.apache.log4j.Logger;

public final class clL
{
  protected static final Logger K = Logger.getLogger(clL.class);
  private static cle hNM;

  public static void a(cle paramcle)
  {
    hNM = paramcle;
  }

  public static cle cng() {
    return hNM;
  }
}