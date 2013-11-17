import org.apache.log4j.Logger;

public class Mg extends doA
{
  private static final aee bx = new bOO(new ey());

  private static final qM by = new dzQ(new ec[] { new dLx("Param standard", new dmb[0]) });
  private static final boolean bZy = false;

  public qM aF()
  {
    return by;
  }

  public Mg WD()
  {
    Mg localMg;
    try {
      localMg = (Mg)bx.Mm();
      localMg.aOr = bx;
    } catch (Exception localException) {
      localMg = new Mg();
      localMg.aOr = null;
      localMg.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    return localMg;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (bou() != 14) {
      return;
    }

    if ((!(this.evo instanceof dhJ)) || (!(this.evp instanceof dhJ))) {
      K.error("La cible ou le caster n'est pas du bon type");
      jJ(true);
      return;
    }

    dhJ localdhJ1 = (dhJ)this.evo;
    NQ localNQ = localdhJ1.awq();
    if (localNQ == null) {
      K.error("On n'a pas de symbiote");
      jJ(true);
      return;
    }

    dhJ localdhJ2 = (dhJ)this.evp;
    if ((localdhJ2.getType() != 1) || (localdhJ2.aJr())) {
      K.error("La cible que l'on tente de seduire n'est pas seductible");
      jJ(true);
      return;
    }

    csi localcsi = localNQ.Q(localdhJ2.uO());
    K.info("Séduction d'une créature avec " + localcsi.cqE() + " PV");

    if (bkt())
      this.cxl = localNQ.b(localcsi);
    else {
      localNQ.a(localcsi, (byte)this.cxl);
    }

    if (this.cxl == -1) {
      K.info("Erreur lors de l'ajout de la creature au symbiot, annulation de la seduction");
      jJ(true);
      return;
    }

    this.evp.a(cfY.hBr);
    this.evp.a(cfY.hBl);
    this.evp.a(dKm.lWY);
    this.evp.a(cfY.hCm);
    this.evp.a(cfY.hCl);
    b(paramaVc, paramBoolean);
  }

  public void a(aVc paramaVc)
  {
    if ((!(this.evp instanceof dhJ)) || (this.evp.c(cfY.hBA)) || (!this.evp.c(cfY.hBM)))
    {
      fe((byte)13);
      return;
    }
    int i = ((dhJ)this.evo).nU();
    int j = ((dhJ)this.evp).nU();

    if (j > i) {
      fe((byte)12);
      return;
    }

    fe((byte)14);
  }

  public void aK()
  {
    super.aK();
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }
}