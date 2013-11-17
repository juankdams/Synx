import org.apache.log4j.Logger;

public class bRR extends cMb
{
  private static final Logger K = Logger.getLogger(bRR.class);

  public boolean a(dJO paramdJO, bhL parambhL) {
    switch (crR.av[paramdJO.ordinal()]) {
    case 1:
      d(paramdJO);
      cfZ localcfZ = new cfZ(this);
      if (!localcfZ.fV()) {
        K.error("[STORAGE_BOX] Impossible de démarrer le browsing");
        return false;
      }
      localcfZ.begin();
      a(paramdJO);
      byv.bFN().a(Nj.Xh());
      return true;
    case 2:
      d(paramdJO);
      if (byv.bFN().c(Nj.Xh()))
        byv.bFN().b(Nj.Xh());
      a(paramdJO);
      byv.bFN().bFO().bSf();
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
    return new dJO[] { dJO.lVH, dJO.lVI };
  }

  public void aJ()
  {
    super.aJ();
    eu(true);
    ev(true);
    D(true);
    ix(true);
  }

  public void bc()
  {
    super.bc();
    eu(false);
    ev(false);
    D(false);
    ix(false);
  }

  public csx[] am()
  {
    arj localarj = (arj)aiI.dgp.avt();
    localarj.iT(coH.hWq.aw);
    return new csx[] { localarj };
  }

  public String getName()
  {
    return bU.fH().getString("guild.storageBox");
  }

  public void a(abc paramabc)
  {
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDv.a(new aGH[] { localbyz });
  }
}