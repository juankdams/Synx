import org.apache.log4j.Logger;

public final class csz extends doA
{
  private static final aee bx = new bOO(new dIp());

  private static final qM by = new dzQ(new ec[] { new dLx("Copie de Charac entre cible et caster", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS) }), new dLx("La cible copie le max de la charac du caster", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon (defaut)", dnN.lnS) }), new dLx("Ratio de la valeur a copier", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon (defaut)", dnN.lnS), new dmb("% à copier, (defaut = 100)", dnN.lnS) }) });
  private caY icx;
  private int icy;
  private boolean gqn;
  public cCH aAR = new dIn(this, 5);

  public qM aF()
  {
    return by;
  }

  public csz()
  {
    aH();
  }

  public csz cqO()
  {
    csz localcsz;
    try {
      localcsz = (csz)bx.Mm();
      localcsz.aOr = bx;
    } catch (Exception localException) {
      localcsz = new csz();
      localcsz.aOr = null;
      localcsz.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CopyCharacInRealTime : " + localException.getMessage());
    }
    return localcsz;
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
    if (((dpI)this.eWL).bep() > 1)
      this.gqn = (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() > 2)
      this.icy = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    eu localeu = eu.a(Byte.valueOf((byte)this.cxl));
    if (localeu == null) {
      cVD();
      K.error("Erreur de saisie, charac inexistante " + this.cxl);
      return;
    }

    Rx localRx1 = (Rx)(this.gqn ? this.evo.a(localeu) : this.evp.a(localeu));
    Rx localRx2 = (Rx)(this.gqn ? this.evp.a(localeu) : this.evo.a(localeu));
    if ((localRx2 == null) || (localRx1 == null)) {
      cVD();
      return;
    }

    this.icx = new dIo(this, localRx2);

    localRx1.a(this.icx);
    if (this.icy == 100)
      localRx2.c(localRx1);
    else
      localRx2.a(localRx1, this.icy);
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
    super.bc();
  }
}