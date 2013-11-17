import org.apache.log4j.Logger;

public final class bZR extends bpf
{
  private static final aee bx = new bOO(new dw());

  private static final qM by = new dzQ(new ec[] { new dLx("Nombre d'exécutions fixe", new dmb[] { new dmb("Nombre d'executions", dnN.lnR) }), new dLx("Nombre d'exécutions fixe, avec condition d'arrêt", new dmb[] { new dmb("Nombre d'executions", dnN.lnR), new dmb("Doit s'arrêter quand un effet n'est pas exécuté (1=oui, 0=non,défaut)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public bZR() {
    aH();
  }

  public bZR ceu()
  {
    bZR localbZR;
    try {
      localbZR = (bZR)bx.Mm();
      localbZR.aOr = bx;
    } catch (Exception localException) {
      localbZR = new bZR();
      localbZR.aOr = null;
      localbZR.eXg = false;
      K.error("Erreur lors d'un checkOut sur un REGExecutionCountFunctionCharac : " + localException.getMessage());
    }
    return localbZR;
  }

  protected int d(aVc paramaVc) {
    if ((this.eWL == null) || (((dpI)this.eWL).bep() < 1)) {
      return 0;
    }
    return ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected boolean e(aVc paramaVc) {
    if ((this.eWL == null) || (((dpI)this.eWL).bep() < 2))
      return false;
    return ((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1;
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return false;
  }

  public boolean aN() {
    return true;
  }
}