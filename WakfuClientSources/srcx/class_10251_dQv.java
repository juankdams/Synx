import org.apache.log4j.Logger;

public class dQv extends alO
{
  private static final Logger K = Logger.getLogger(dQv.class);
  private String dBY;

  protected void a(cew paramcew, acd paramacd)
  {
    if (isEmpty()) {
      if ((!bB) && (this.dBY != null)) throw new AssertionError();
      this.dBY = paramcew.atc();
    }
  }

  public void a(acd paramacd1, acd paramacd2, cew paramcew)
  {
    if (isEmpty()) {
      paramcew.er(this.dBY);
      this.dBY = null;
    } else {
      acd localacd = (acd)ayx();
      if (!localacd.a(paramacd1))
        localacd.a(paramcew);
    }
  }
}