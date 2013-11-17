import org.apache.log4j.Logger;

public class bKS extends alO
{
  private static final Logger K = Logger.getLogger(bKS.class);

  protected void a(cew paramcew, cvL paramcvL)
  {
  }

  public void a(cvL paramcvL1, cvL paramcvL2, cew paramcew)
  {
    if (isEmpty()) {
      paramcew.a(null);
    } else {
      cvL localcvL = (cvL)ayx();
      if (!localcvL.a(paramcvL1))
        localcvL.a(paramcew);
    }
  }
}