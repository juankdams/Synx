import org.apache.log4j.Logger;

public final class Ag extends tY
{
  private static final aee bx = new bOO(new biM());

  private static final qM by = new dzQ(new ec[] { new dLx("Gain de carac pour la cible", new dmb[] { new dmb("Charac a booster", dnN.lnS), new dmb("Charac de Reference", dnN.lnS), new dmb("% de la Charac de reference", dnN.lnS) }), new dLx("Gain de carac poru la cible ou le caster, en fonction des caracs de la cible", new dmb[] { new dmb("Charac a booster", dnN.lnS), new dmb("Charac de Reference", dnN.lnS), new dmb("% de la Charac de reference", dnN.lnS), new dmb("Gain pour le caster (0=non, 1=oui)", dnN.lnS) }) });

  private boolean bvD = false;

  public cCH aAR = new bim(this);

  public qM aF()
  {
    return by;
  }

  public Ag()
  {
    aH();
  }

  public Ag Jn()
  {
    Ag localAg;
    try {
      localAg = (Ag)bx.Mm();
      localAg.aOr = bx;
    } catch (Exception localException) {
      localAg = new Ag();
      localAg.aOr = null;
      localAg.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacGainBasedOnOtherCharacValue : " + localException.getMessage());
    }
    localAg.bvD = false;
    return localAg;
  }

  protected dle sx() {
    return this.bvD ? this.evo : this.evp;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }
    if (((dpI)this.eWL).bep() < 3) {
      return;
    }
    if ((sx() == null) || (this.evp == null)) {
      return;
    }
    byte b1 = (byte)((dpI)this.eWL).a(0, cVC(), dNF.meh);
    byte b2 = (byte)((dpI)this.eWL).a(1, cVC(), dNF.meh);
    int i = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
    this.bvD = ((((dpI)this.eWL).bep() >= 4) && (((dpI)this.eWL).a(3, cVC(), dNF.meh) == 1));

    if ((!sx().b(eu.a(Byte.valueOf(b1)))) || (!this.evp.b(eu.a(Byte.valueOf(b2)))))
    {
      return;
    }
    this.aOF = eu.a(Byte.valueOf(b1));

    this.cxl = (this.evp.e(eu.a(Byte.valueOf(b2))) * i / 100);
  }

  void Cy()
  {
    sx().a(this.aOF).gw(this.cxl);
  }

  void e(cqm paramcqm) {
    this.cxl = paramcqm.gv(this.cxl);
  }

  public final bTI Cz()
  {
    if (this.eWL == null) {
      return null;
    }
    if (this.aOF == null) {
      byte b = (byte)((dpI)this.eWL).a(0, cVC(), dNF.meh);
      this.aOF = eu.a(Byte.valueOf(b));
    }

    if (this.aOF.ln() == 0) {
      bTI localbTI = ((eu)this.aOF).lB();
      if (localbTI != null)
        return localbTI;
    }
    return bTI.heW;
  }

  public void bc() {
    this.aOF = null;
    super.bc();
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}