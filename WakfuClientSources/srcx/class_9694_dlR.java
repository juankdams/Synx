import org.apache.log4j.Logger;

public class dlR extends alO
{
  private static final Logger K = Logger.getLogger(dlR.class);

  protected void a(cew paramcew, cdj paramcdj)
  {
  }

  public void a(cdj paramcdj1, cdj paramcdj2, cew paramcew)
  {
    if (paramcdj2 != null) {
      paramcew.a(cdj.a(paramcdj2), !cdj.b(paramcdj2));
      paramcew.cgQ();
    }

    if (!isEmpty()) {
      cdj localcdj = (cdj)ayx();
      localcdj.a(paramcew);
    }
  }
}