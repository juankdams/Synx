import org.apache.log4j.Logger;

public final class TB extends bFw
{
  private static final aee bx = new bOO(new BF());

  private static final qM by = new dzQ(new ec[] { new dLx("Degats par valeur max de la charac du caster", new dmb[] { new dmb("Dégâts / valeur max", dnN.lnR) }) });
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  public TB()
  {
    aH();
  }

  public TB(bTI parambTI, dnO paramdnO, eu parameu) {
    super(parambTI, paramdnO);
    this.aCa = parameu;
    aH();
  }

  public TB agD()
  {
    TB localTB;
    try {
      localTB = (TB)bx.Mm();
      localTB.aOr = bx;
    } catch (Exception localException) {
      localTB = new TB();
      localTB.aOr = null;
      localTB.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HpLossFunctionCharac : " + localException.getMessage());
    }
    a(localTB);
    return localTB;
  }

  protected void a(bFw parambFw) {
    super.a(parambFw);
    ((TB)parambFw).aCa = this.aCa;
  }

  protected void b(aVc paramaVc) {
    this.gAD = 0;
    short s = cVC();
    if (this.eWL == null) {
      return;
    }
    float f = ((dpI)this.eWL).o(0, s);

    if ((this.evo != null) && (this.evo.b(this.aCa)))
      this.cxl = Math.round(f * this.evo.a(this.aCa).max());
    else
      this.cxl = 0;
  }
}