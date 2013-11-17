import org.apache.log4j.Logger;

public final class cyn extends doA
{
  private static final aee bx = new bOO(new dIW());

  private static final qM by = new dzQ(new ec[] { new dLx("Copie de Charac entre cible et caster", new dmb[] { new dmb("Id de la charac source", dnN.lnS), new dmb("Id de la charac destination", dnN.lnS) }), new dLx("La cible copie le max de la charac du caster", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("Id de la charac destination", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon (defaut)", dnN.lnS) }), new dLx("Ratio de la valeur a copier", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("Id de la charac destination", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon (defaut)", dnN.lnS), new dmb("% à copier, (defaut = 100)", dnN.lnS) }) });
  private caY icx;
  private int icy;
  private int imB;
  private boolean gqn;
  public cCH aAR = new dIU(this, 9);

  public qM aF()
  {
    return by;
  }

  public cyn()
  {
    aH();
  }

  public cyn cvp()
  {
    cyn localcyn;
    try {
      localcyn = (cyn)bx.Mm();
      localcyn.aOr = bx;
    } catch (Exception localException) {
      localcyn = new cyn();
      localcyn.aOr = null;
      localcyn.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CopyCharacInRealTime : " + localException.getMessage());
    }
    return localcyn;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = -1;
    this.gqn = false;
    this.icy = 100;
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    this.imB = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() > 2)
      this.gqn = (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() > 3)
      this.icy = ((dpI)this.eWL).a(3, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    eu localeu1 = eu.a(Byte.valueOf((byte)this.cxl));
    if (localeu1 == null) {
      cVD();
      K.error("Erreur de saisie, charac inexistante " + this.cxl);
      return;
    }
    eu localeu2 = eu.a(Byte.valueOf((byte)this.imB));
    if (localeu1 == null) {
      cVD();
      K.error("Erreur de saisie, charac inexistante " + this.cxl);
      return;
    }

    Rx localRx1 = (Rx)(this.gqn ? this.evo.a(localeu1) : this.evp.a(localeu1));
    Rx localRx2 = (Rx)(this.gqn ? this.evp.a(localeu2) : this.evo.a(localeu2));
    if ((localRx2 == null) || (localRx1 == null)) {
      cVD();
      return;
    }

    this.icx = new aKF(this, localRx2, null);
    localRx1.a(this.icx);
    this.icx.a(localRx1);
  }

  public void aK()
  {
    if (!bkM())
      return;
    eu localeu = eu.a(Byte.valueOf((byte)this.cxl));
    if (localeu == null) {
      return;
    }
    cqm localcqm = this.gqn ? this.evo.a(localeu) : this.evp.a(localeu);
    if (localcqm != null) {
      localcqm.b(this.icx);
    }
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

  public cCH lJ()
  {
    return this.aAR;
  }

  public void bc()
  {
    this.gqn = false;
    this.icy = 100;
    this.imB = -1;
    super.bc();
  }
}