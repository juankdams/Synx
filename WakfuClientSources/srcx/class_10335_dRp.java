import org.apache.log4j.Logger;

public class dRp extends alO
{
  private static final Logger K = Logger.getLogger(dRp.class);

  protected void a(cew paramcew, bcn parambcn)
  {
  }

  public void a(bcn parambcn1, bcn parambcn2, cew paramcew)
  {
    Su localSu = paramcew.cbD();

    bcn localbcn = (bcn)ayx();
    if (localbcn == null)
      localSu.gE(0);
    else {
      localSu.gE(bUD.aR(localbcn.ki));
    }
    localSu.aek();
    paramcew.c(new cAr(this, paramcew));
  }
}