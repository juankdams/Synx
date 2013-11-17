import org.apache.log4j.Logger;

public final class dOv extends bpf
{
  private static final aee bx = new bOO(new aIw());

  private static final qM by = new dzQ(new ec[] { new dLx("Nombre d'exécution en fonction des PA/PM/PW utilisés", new dmb[] { new dmb("Execution par PA", dnN.lnR), new dmb("Execution par PM", dnN.lnR), new dmb("Execution par PW", dnN.lnR) }), new dLx("Nombre d'exécution en fonction des PA/PM/PW utilisés, avec max", new dmb[] { new dmb("Execution par PA", dnN.lnR), new dmb("Execution par PM", dnN.lnR), new dmb("Execution par PW", dnN.lnR), new dmb("Nombre d'executions max", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public dOv() {
    aH();
  }

  public dOv dqp()
  {
    dOv localdOv;
    try {
      localdOv = (dOv)bx.Mm();
      localdOv.aOr = bx;
    } catch (Exception localException) {
      localdOv = new dOv();
      localdOv.aOr = null;
      localdOv.eXg = false;
      K.error("Erreur lors d'un checkOut sur un REGExecutionCountFunctionCharac : " + localException.getMessage());
    }
    return localdOv;
  }

  protected int d(aVc paramaVc)
  {
    if (paramaVc == null) {
      K.error("Unable to execute a REGExecutionCountFunctionTriggeringActionCost without triggering effect");
      return 0;
    }

    if (!(paramaVc instanceof dRu)) {
      K.error("Unable to execute a REGExecutionCountFunctionTriggeringActionCost without actionCost triggering effect");
      return 0;
    }

    float f1 = ((dpI)this.eWL).o(0, cVC());
    float f2 = ((dpI)this.eWL).o(1, cVC());
    float f3 = ((dpI)this.eWL).o(2, cVC());

    dRu localdRu = (dRu)paramaVc;
    int i = localdRu.dsq();
    int j = localdRu.dsp();
    int k = localdRu.dso();

    int m = Math.round(i * f1 + j * f2 + k * f3);
    if (((dpI)this.eWL).bep() >= 4) {
      m = Math.min(m, ((dpI)this.eWL).a(3, cVC(), dNF.meh));
    }
    return m;
  }

  protected boolean e(aVc paramaVc) {
    return false;
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return true;
  }
}