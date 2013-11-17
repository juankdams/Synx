import org.apache.log4j.Logger;

public final class hG extends bpf
{
  private static final aee bx = new bOO(new coQ());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  public hG()
  {
    aH();
  }

  public hG(eu parameu) {
    this.aCa = parameu;
  }

  public hG pG()
  {
    hG localhG;
    try {
      localhG = (hG)bx.Mm();
      localhG.aOr = bx;
    } catch (Exception localException) {
      localhG = new hG();
      localhG.aOr = null;
      localhG.eXg = false;
      K.error("Erreur lors d'un checkOut sur un REGExecutionCountFunctionCharac : " + localException.getMessage());
    }
    localhG.aCa = this.aCa;
    return localhG;
  }

  protected int d(aVc paramaVc) {
    if ((this.evo == null) || (!this.evo.b(this.aCa))) {
      return 0;
    }
    return this.evo.e(this.aCa);
  }

  protected boolean e(aVc paramaVc) {
    return false;
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