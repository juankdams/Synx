import org.apache.log4j.Logger;

public class asg extends alO
{
  private static final Logger K = Logger.getLogger(asg.class);
  private String dBY;

  protected void a(cew paramcew, ccd paramccd)
  {
    if (isEmpty()) {
      if ((!bB) && (this.dBY != null)) throw new AssertionError();
      this.dBY = paramcew.atp();
    }
  }

  public void a(ccd paramccd1, ccd paramccd2, cew paramcew)
  {
    if (paramcew.aty() == null) {
      K.error("Impossible de desappliquer le changement d'anim statique ");
      return;
    }
    paramcew.c(new dwO(this, paramcew, paramccd1));
  }
}