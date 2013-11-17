import org.apache.log4j.Logger;

public class bvj extends cMb
{
  private static final Logger K = Logger.getLogger(bvj.class);
  private TU gfa;
  private bir gfb;
  private final cCH gfc;

  public bvj()
  {
    this.gfc = new asR(this);
  }

  public boolean a(dJO paramdJO, bhL parambhL)
  {
    switch (asU.av[paramdJO.ordinal()]) {
    case 1:
      d(paramdJO);
      BR localBR = new BR(this);
      if (!localBR.fV()) {
        K.error("[STORAGE_BOX] Impossible de démarrer le browsing");
        return false;
      }
      localBR.begin();
      a(paramdJO);
      Nj.Xh().a(this);
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

  protected cCH ak()
  {
    return this.gfc;
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
    if ((!bB) && (this.gfa != null)) throw new AssertionError();
    if ((!bB) && (this.gfb != null)) throw new AssertionError();
  }

  public void bc()
  {
    super.bc();
    eu(false);
    ev(false);
    D(false);
    ix(false);
    this.gfa = null;
    this.gfb = null;
  }

  public void al()
  {
    this.gfa = ((TU)aKY.epr.a(cdc.hwa, Integer.parseInt(this.fgH)));
    if (this.gfa == null) {
      K.error("Impossible de trouver le paramètre " + this.fgH);
      return;
    }

    this.gfb = new bir(this.gfa.size());
  }

  public csx[] am()
  {
    aCH localaCH = clR.cni().vL(this.gfa.gC());

    csl localcsl = (csl)aiI.dfO.avt();
    localcsl.iT(localaCH.aOR());
    localcsl.ma("desc.mru." + localaCH.aOS());

    return new csx[] { localcsl };
  }

  public String getName()
  {
    return bU.fH().b(104, this.gfa.getId(), new Object[0]);
  }

  public bir bCQ() {
    return this.gfb;
  }

  public void a(abc paramabc)
  {
  }

  public TU bCR()
  {
    return this.gfa;
  }

  public String toString()
  {
    return "StorageBox{m_info=" + this.gfa + ", m_inventory=" + this.gfb + '}';
  }
}