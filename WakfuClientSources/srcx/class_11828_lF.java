import org.apache.log4j.Logger;

public class lF extends cMb
{
  private static final Logger K = Logger.getLogger(lF.class);
  public static final short aPi = 0;
  public static final short aPj = 1;

  public void aJ()
  {
    super.aJ();
    x((short)0);
    eu(true);
    ev(true);
    ix(true);
  }

  public void a(abc paramabc)
  {
    K.info("[ON VIEW UPDATED] " + paramabc);
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    K.info("Action performed on interactive element : " + paramdJO.toString());

    d(paramdJO);

    switch (pX.av[paramdJO.ordinal()]) {
    case 1:
      if (getState() == 1)
        a(paramdJO);
      return true;
    case 2:
      a(paramdJO);
      return true;
    }

    return false;
  }

  public dJO eR()
  {
    return dJO.lVM;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVM };
  }

  public byte bY()
  {
    return 4;
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }
}