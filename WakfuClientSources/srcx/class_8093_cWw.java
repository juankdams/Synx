import org.apache.log4j.Logger;

public class cWw extends cMb
  implements cUQ
{
  private static final Logger K = Logger.getLogger(cWw.class);
  private Qb kJn;
  private dNj kJo;

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    d(paramdJO);
    switch (cgN.av[paramdJO.ordinal()]) {
    case 1:
      try {
        dTW localdTW = new dTW(this, new cgP(this));

        if (!localdTW.fV()) {
          K.error("[IE] Impossible de démarrer le browsing");
          return false;
        }
        localdTW.begin();
        a(paramdJO);
      } catch (UnsupportedOperationException localUnsupportedOperationException) {
        K.error("[IE] Impossible de démarrer le browsing", localUnsupportedOperationException);
        return false;
      }
      return true;
    case 2:
      byv.bFN().b(DM.bIC);
      a(paramdJO);
      byv.bFN().bFO().bSf();
      return true;
    }

    K.error("Action non traitée sur une Collector : " + paramdJO);
    return false;
  }

  public drw bPk()
  {
    return (drw)this.kJo;
  }

  public Qb bPi() {
    return this.kJn;
  }

  public dJO eR()
  {
    return dJO.lVH;
  }

  public dJO[] eS()
  {
    return new dJO[] { dJO.lVH, dJO.lVI };
  }

  public String getName()
  {
    return bU.fH().b(86, this.kJn.getId(), new Object[0]);
  }

  public void al(byte[] paramArrayOfByte) {
    this.kJo.e(paramArrayOfByte);
  }

  public cMb bPj() {
    return this;
  }

  public csx[] am()
  {
    aCH localaCH = clR.cni().vL(this.kJn.gC());

    csx[] arrayOfcsx = new csx[1];
    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(localaCH.aOR());
    localcsl.ma("desc.mru." + localaCH.aOS());

    arrayOfcsx[0] = localcsl;
    return arrayOfcsx;
  }

  public void al()
  {
    this.kJn = ((Qb)aKY.epr.a(cdc.hvV, Integer.valueOf(this.fgH).intValue()));
    this.kJo = (this.kJn.abS() ? new jK(this.kJn) : new aCp(this.kJn));
    D(true);
    ev(true);
    eu(true);
  }

  public boolean ta()
  {
    byz localbyz = byv.bFN().bFO();

    return bGP.gDx.a(new aGH[] { localbyz });
  }

  public void a(abc paramabc)
  {
  }

  public void bc()
  {
    super.bc();
    this.kJn = null;
    this.kJo = null;
  }

  public void aJ()
  {
    super.aJ();
    if ((!bB) && (this.kJn != null)) throw new AssertionError();
    if ((!bB) && (this.kJo != null)) throw new AssertionError();
  }

  public String toString()
  {
    return "Collector : \r\nm_info=" + this.kJn + "\r\n" + "m_inventory=" + this.kJo;
  }
}