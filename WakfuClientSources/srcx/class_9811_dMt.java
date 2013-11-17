import org.apache.log4j.Logger;

public class dMt extends cMb
{
  private static final Logger K = Logger.getLogger(dMt.class);

  public boolean a(dJO paramdJO, bhL parambhL) {
    switch (Fb.av[paramdJO.ordinal()]) {
    case 1:
      bws localbws = new bws(this);
      if (!localbws.fV()) {
        K.error("[COIN_MACHINE] Impossible de démarrer le browsing");
        return false;
      }
      localbws.begin();
      a(paramdJO);
    case 2:
      d(paramdJO);
      a(paramdJO);
      byv.bFN().bFO().bSf();
      return true;
    case 3:
      d(paramdJO);

      a(paramdJO);
      return true;
    case 4:
      d(paramdJO);

      a(paramdJO);
      return true;
    case 5:
      d(paramdJO);

      a(paramdJO);
      return true;
    }
    K.error("Impossible d'effectuer l'action " + paramdJO, new IllegalArgumentException());
    return false;
  }

  public dJO eR()
  {
    return dJO.lVH;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVJ, dJO.lVK, dJO.lVH, dJO.lVv, dJO.lVI };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
  }

  public boolean ta()
  {
    return false;
  }

  public csx[] am()
  {
    return new csx[] { aiI.dfO.avt() };
  }

  public String getName()
  {
    return "TODO Clem: Bandit-manchot";
  }

  public void a(abc paramabc)
  {
  }
}