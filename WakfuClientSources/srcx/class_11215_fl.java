import org.apache.log4j.Logger;

public final class fl extends bFw
{
  private static final aee bx = new bOO(new cse());

  private static final qM by = new dzQ(new ec[] { new dLx("Degats par niveau du caster", new dmb[] { new dmb("Dégâts par niveau", dnN.lnR) }), new dLx("Avec Modificateur", new dmb[] { new dmb("Dégâts par niveau", dnN.lnR), new dmb("mod : boost(1) / res (2) / rebound (4) / absorb(8) (defaut = 0)", dnN.lnS) }) });
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  public fl()
  {
    aH();
  }

  public fl(bTI parambTI, dnO paramdnO, eu parameu) {
    super(parambTI, paramdnO);
    this.aCa = parameu;
    aH();
  }

  public fl ml()
  {
    fl localfl;
    try {
      localfl = (fl)bx.Mm();
      localfl.aOr = bx;
    } catch (Exception localException) {
      localfl = new fl();
      localfl.aOr = null;
      localfl.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossFunctionFighterLevel : " + localException.getMessage());
    }
    a(localfl);
    return localfl;
  }

  protected void a(bFw parambFw)
  {
    super.a(parambFw);
    ((fl)parambFw).aCa = this.aCa;
  }

  protected void b(aVc paramaVc)
  {
    this.gAD = 0;
    short s = cVC();
    if (this.eWL == null) {
      return;
    }
    float f = ((dpI)this.eWL).o(0, s);

    if ((this.evo instanceof dHW))
      this.cxl = Math.round(f * ((dHW)this.evo).nU());
    else {
      this.cxl = 0;
    }

    if (((dpI)this.eWL).bep() > 1)
      this.gAD = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
  }
}