import org.apache.log4j.Logger;

public class bal extends cMb
{
  private static final Logger K = Logger.getLogger(bal.class);
  private static final int cuB = coH.hXg.aw;
  private static final String fib = "guild.machine";

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (Np.av[paramdJO.ordinal()]) {
    case 1:
      if (!byv.bFN().c(dKb.djg())) {
        dKb.djg().a(this);
        byv.bFN().a(dKb.djg());
      }

      return true;
    }
    return false;
  }

  public dJO eR() {
    return dJO.lVv;
  }

  public dJO[] eS() {
    return new dJO[] { dJO.lVv };
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
    csx[] arrayOfcsx = new csx[1];

    bBf localbBf = (bBf)aiI.dgn.avt();
    localbBf.iT(cuB);
    arrayOfcsx[0] = localbBf;

    return arrayOfcsx;
  }

  public String getName()
  {
    return bU.fH().getString("guild.machine");
  }
}