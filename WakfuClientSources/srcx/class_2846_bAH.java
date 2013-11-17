import org.apache.log4j.Logger;

public final class bAH extends doA
{
  private static final aee bx = new bOO(new aqy());

  private static final qM by = new dzQ(new ec[] { new dLx("Copie de Charac entre cible et caster", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS) }), new dLx("La cible copie le max de la charac du caster", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon ", dnN.lnS) }), new dLx("La cible copie le max de la charac du caster", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon ", dnN.lnS), new dmb("% de la charac à copier ", dnN.lnS) }), new dLx("La cible copie le max de la charac du caster en % et l'ajoute à sa charac de base", new dmb[] { new dmb("Id de la charac à copier", dnN.lnS), new dmb("1 pour cible copie caster, 0 sinon ", dnN.lnS), new dmb("% de la charac à copier ", dnN.lnS), new dmb("écraser(0) ou ajouter(1) à la charac de base ?", dnN.lnS) }) });
  private static final int gqm = 0;
  private byte beg;
  private boolean gqn;
  private int gqo;
  private int gqp;
  private boolean gqq;
  public cCH aAR = new aqz(this, 7);

  public qM aF()
  {
    return by;
  }

  public aVc aO() {
    bAH localbAH;
    try {
      localbAH = (bAH)bx.Mm();
      localbAH.aOr = bx;
    } catch (Exception localException) {
      localbAH = new bAH();
      localbAH.aOr = null;
      K.error("Erreur lors d'un checkOut sur un CharacDebuff : " + localException.getMessage());
    }
    return localbAH;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.cxl == 0) {
      jJ(true);
      return;
    }
    eu localeu = eu.a(Byte.valueOf(this.beg));
    if (localeu == null) {
      K.error("Id de Charac inconnu " + this.beg);
    }
    if ((this.evo == null) || (this.evp == null) || (localeu == null) || (!this.evo.b(localeu)) || (!this.evp.b(localeu))) {
      jJ(true);
      return;
    }

    cqm localcqm = this.gqn ? this.evp.a(localeu) : this.evo.a(localeu);

    if (!this.gqq) {
      localcqm.setMax(this.cxl);
      localcqm.set(localcqm.max());
    } else {
      localcqm.gx(this.cxl);
      localcqm.set(localcqm.max());
    }
  }

  public void a(aVc paramaVc) {
    aSl();

    this.cxl = 0;

    eu localeu = eu.a(Byte.valueOf(this.beg));
    if (localeu == null) {
      K.error("Id de Charac inconnu " + this.beg);
      return;
    }

    if ((this.evo == null) || (this.evp == null) || (!this.evo.b(localeu)) || (!this.evp.b(localeu))) {
      return;
    }

    cqm localcqm1 = this.gqn ? this.evo.a(localeu) : this.evp.a(localeu);
    cqm localcqm2 = this.gqn ? this.evp.a(localeu) : this.evo.a(localeu);

    this.gqp = localcqm2.max();

    this.cxl = Math.round(localcqm1.max() * this.gqo / 100.0F);
  }

  private void aSl() {
    this.gqo = 100;
    if (this.eWL == null)
      return;
    int i = ((dpI)this.eWL).bep();
    if (i < 1) {
      return;
    }
    short s = cVC();
    this.beg = ((byte)((dpI)this.eWL).a(0, s, dNF.meh));
    if (i < 2) {
      return;
    }
    this.gqn = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
    if (i < 3) {
      return;
    }

    this.gqo = ((dpI)this.eWL).a(2, s, dNF.meh);

    if (i < 4) {
      return;
    }

    this.gqq = (((dpI)this.eWL).a(3, s, dNF.meh) == 1);
  }

  public void aK() {
    eu localeu = eu.a(Byte.valueOf((byte)this.cxl));
    if ((this.gqn) && (this.evp != null) && (this.evp.b(localeu)))
      this.evp.a(localeu).setMax(this.gqp);
    else if ((this.evo != null) && (this.evo.b(localeu))) {
      this.evo.a(localeu).setMax(this.gqp);
    }
    super.aK();
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public cCH lJ() {
    return this.aAR;
  }

  public void bc()
  {
    super.bc();
    this.gqn = false;
    this.gqo = 100;
    this.gqq = false;
  }
}