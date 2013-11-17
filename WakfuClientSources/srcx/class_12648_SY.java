import org.apache.log4j.Logger;

public class SY extends cMb
{
  private static final Logger K = Logger.getLogger(SY.class);
  private static final int cuB = 31;

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (anH.av[paramdJO.ordinal()])
    {
    case 1:
      K.info("[BallotBox] vote d'un candidat");
      a(paramdJO);
      return true;
    }

    return false;
  }

  public dJO eR() {
    return dJO.lVU;
  }

  public dJO[] eS() {
    return new dJO[] { dJO.lVU };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
  }

  public csx[] am()
  {
    return csx.icw;
  }

  public String getName()
  {
    return bU.fH().getString("ie.urne");
  }
}