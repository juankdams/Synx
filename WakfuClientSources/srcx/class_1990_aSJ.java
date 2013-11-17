import org.apache.log4j.Logger;

public final class aSJ extends kM
{
  private static final aee bx = new bOO(new aHW());

  private static final qM by = new dzQ(new ec[] { new dLx("Buff de carac pour la cible", new dmb[] { new dmb("Charac a booster", dnN.lnS), new dmb("Charac de Reference", dnN.lnS), new dmb("% de la Charac de reference", dnN.lnS) }), new dLx("Buff de carac poru la cible ou le caster, en fonction des caracs de la cible", new dmb[] { new dmb("Charac a booster", dnN.lnS), new dmb("Charac de Reference", dnN.lnS), new dmb("% de la Charac de reference", dnN.lnS), new dmb("Buff pour le caster (0=non, 1=oui)", dnN.lnS) }), new dLx("Utilise le maximum de la charac de reference", new dmb[] { new dmb("Charac a booster", dnN.lnS), new dmb("Charac de Reference", dnN.lnS), new dmb("% de la Charac de reference", dnN.lnS), new dmb("Buff pour le caster (0=non, 1=oui)", dnN.lnS), new dmb("Utilise le max (0=non, 1=oui)", dnN.lnS) }), new dLx("Ajoute a la valeur courante", new dmb[] { new dmb("Charac a booster", dnN.lnS), new dmb("Charac de Reference", dnN.lnS), new dmb("% de la Charac de reference", dnN.lnS), new dmb("Buff pour le caster (0=non, 1=oui)", dnN.lnS), new dmb("Utilise le max (0=non, 1=oui)", dnN.lnS), new dmb("Ajoute a la valeur courante (0=non, 1=oui (defaut))", dnN.lnS) }) });

  private boolean bvD = false;

  public cCH ePW = new aHS(this);

  public qM aF()
  {
    return by;
  }

  public aSJ()
  {
    aH();
  }

  public aSJ bin()
  {
    aSJ localaSJ;
    try {
      localaSJ = (aSJ)bx.Mm();
      localaSJ.aOr = bx;
    } catch (Exception localException) {
      localaSJ = new aSJ();
      localaSJ.aOr = null;
      localaSJ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacBuffBasedOnOtherCharacValue : " + localException.getMessage());
    }
    localaSJ.bvD = false;
    return localaSJ;
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
    int j = (((dpI)this.eWL).bep() >= 5) && (((dpI)this.eWL).a(4, cVC(), dNF.meh) == 1) ? 1 : 0;
    if (((dpI)this.eWL).bep() < 6)
      this.aOG = true;
    else {
      this.aOG = (((dpI)this.eWL).a(5, cVC(), dNF.meh) == 1);
    }
    if ((!sx().b(eu.a(Byte.valueOf(b1)))) || (!this.evp.b(eu.a(Byte.valueOf(b2)))))
    {
      return;
    }
    this.aOF = eu.a(Byte.valueOf(b1));

    int k = j != 0 ? this.evp.a(eu.a(Byte.valueOf(b2))).max() : this.evp.e(eu.a(Byte.valueOf(b2)));

    this.cxl = (k * i / 100);
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
    return this.ePW;
  }
}