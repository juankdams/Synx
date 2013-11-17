import org.apache.log4j.Logger;

public class bHI extends dkO
  implements cUQ
{
  private static final Logger K = Logger.getLogger(bHI.class);
  private final Qb gGt;
  private final jK gGu;

  public bHI(AQ paramAQ)
  {
    super(paramAQ);
    int i = paramAQ.tj().ckc();
    this.gGt = ((Qb)aKY.epr.a(cdc.hvV, i));
    this.gGu = new jK(this.gGt);
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    switch (v.av[paramdJO.ordinal()]) {
    case 1:
      try {
        dTW localdTW = new dTW(this, new u(this));

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

  public dJO adT()
  {
    return dJO.lVH;
  }

  public Qb bPi() {
    return this.gGt;
  }

  public cMb bPj() {
    return (cMb)this.lio;
  }

  public drw bPk() {
    return this.gGu;
  }

  public int bPl()
  {
    throw new UnsupportedOperationException("Aucune serialisation dans le client");
  }

  public byte[] bPm()
  {
    throw new UnsupportedOperationException("Aucune serialisation dans le client");
  }

  public void al(byte[] paramArrayOfByte)
  {
    this.gGu.e(paramArrayOfByte);
  }

  public dJO[] adU() {
    return new dJO[] { dJO.lVH, dJO.lVI };
  }

  public csx[] adN() {
    aCH localaCH = clR.cni().vL(this.gGt.gC());

    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(localaCH.aOR());
    localcsl.ma("desc.mru." + localaCH.aOS());

    return new csx[] { localcsl };
  }

  public void cC(short paramShort)
  {
    super.cC(paramShort);
  }

  public void a(dJO paramdJO) {
    ((duA)this.lio).a(paramdJO);
  }

  public String toString()
  {
    return "ChaosInteractiveElementHandler{m_collectorParam=" + this.gGt + ", m_collectorInventory=" + this.gGu + '}';
  }
}