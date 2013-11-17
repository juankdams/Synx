import org.apache.log4j.Logger;

public class dwj
{
  protected static Logger K = Logger.getLogger(bnc.class);

  private static dwj lBr = new dwj();

  private dts dCn = new dts();

  public static dwj dbl()
  {
    return lBr;
  }

  public bvm d(bSR parambSR)
  {
    if (parambSR == null)
      return null;
    return this.dCn.e(parambSR);
  }

  public void cZI()
  {
    this.dCn.cZI();
  }

  public void dbm()
  {
    this.dCn.cZF();
  }

  public dts dbn() {
    return this.dCn;
  }

  public void clear() {
    this.dCn.clear();
  }
}