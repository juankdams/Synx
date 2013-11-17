import org.apache.log4j.Logger;

public class VE extends cMb
{
  private static final Logger K = Logger.getLogger(VE.class);

  public void aJ()
  {
    super.aJ();
    x((short)1);
    eu(false);
    ev(false);
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    switch (cWc.av[paramdJO.ordinal()]) {
    case 1:
      if (this.aTn == 2) {
        K.info("Action [" + paramdJO + "] ignored on interactive element : " + getId());
        return true;
      }

      K.info("Action [" + paramdJO + "] performed on interactive element : " + getId());

      d(paramdJO);
      sM();
      a(paramdJO);

      return true;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVA;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVA };
  }

  public byte bY()
  {
    return 0;
  }
}