import org.apache.log4j.Logger;

public abstract class PO
{
  private static final Logger K = Logger.getLogger(PO.class);

  public static boolean e(cWG paramcWG) {
    return (paramcWG.getId() == 19990) || (paramcWG.getId() == 19991);
  }

  public static boolean f(cWG paramcWG)
  {
    return (paramcWG.getId() == 19994) || (paramcWG.getId() == 19995) || (paramcWG.getId() == 19998) || (paramcWG.getId() == 19992) || (paramcWG.getId() == 19995) || (paramcWG.getId() == 19997);
  }

  public static boolean g(cWG paramcWG)
  {
    return (f(paramcWG)) || (e(paramcWG));
  }
}