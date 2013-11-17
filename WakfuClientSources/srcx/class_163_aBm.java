import org.apache.log4j.Logger;

public final class aBm extends doA
{
  private static final aee bx = new bOO(new akD());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public aBm()
  {
    aH();
  }

  public aBm aND()
  {
    aBm localaBm;
    try {
      localaBm = (aBm)bx.Mm();
      localaBm.aOr = bx;
    } catch (Exception localException) {
      localaBm = new aBm();
      localaBm.aOr = null;
      localaBm.eXg = false;
      K.error("Erreur lors d'un checkOut sur un VoodoolBoostEffect : " + localException.getMessage());
    }
    return localaBm;
  }

  public void a(aVc paramaVc) {
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    cVD();
    if ((paramaVc == null) || (this.evo == null)) {
      return;
    }
    if (!(paramaVc instanceof bFw)) {
      return;
    }
    int i = this.evo.e(eu.azH);
    int j = paramaVc.getValue();
    paramaVc.kf(j + j * i / 100);
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

  public void bc() {
    super.bc();
  }
}