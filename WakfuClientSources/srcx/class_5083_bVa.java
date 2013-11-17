import org.apache.log4j.Logger;

public class bVa extends cMb
{
  private static final Logger K = Logger.getLogger(bVa.class);
  private boolean hhk;

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (QB.av[paramdJO.ordinal()]) {
    case 1:
      if ((this.aTn == 1) && (!this.hhk)) {
        K.info("Action [" + paramdJO + "] performed on interactive element : " + getId());
        bOU.gUc.b(new yF(getId()));
        d(paramdJO, parambhL);
      } else {
        K.info("Action [" + paramdJO + "] ignored on interactive element : " + getId());
      }
      this.hhk = true;
      return true;
    case 2:
      if ((this.aTn == 1) && (this.hhk)) {
        K.info("Action [" + paramdJO + "] performed on interactive element : " + getId());
        c(paramdJO, parambhL);
      } else {
        K.info("Action [" + paramdJO + "] ignored on interactive element : " + getId());
      }
      this.hhk = false;
      return true;
    }

    K.info("Action [" + paramdJO + "] not processed on interactive element : " + getId());

    return false;
  }

  protected void c(dJO paramdJO, bhL parambhL) {
    e(paramdJO, parambhL);
  }

  protected void d(dJO paramdJO, bhL parambhL) {
    e(paramdJO, parambhL);
  }

  protected void e(dJO paramdJO, bhL parambhL) {
    d(paramdJO);
    sM();
    a(paramdJO);
  }

  public dJO eR()
  {
    return dJO.lVE;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVE, dJO.lVF, dJO.lVA };
  }

  public boolean caY()
  {
    return this.hhk;
  }

  public void aJ() {
    super.aJ();
    this.hhk = false;
  }
}