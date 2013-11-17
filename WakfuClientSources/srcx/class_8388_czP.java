import org.apache.log4j.Logger;

public class czP extends cMb
{
  private static final Logger K = Logger.getLogger(czP.class);

  public void aJ()
  {
    super.aJ();
    x((short)1);
    eu(true);
    ev(true);
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    d(paramdJO);

    switch (coG.av[paramdJO.ordinal()]) {
    case 1:
      x((short)Math.max(1, (getState() + 1) % 3));
      sM();
      a(paramdJO);

      return true;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVv;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVv };
  }

  public byte bY()
  {
    return 0;
  }
}