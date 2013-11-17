import org.apache.log4j.Logger;

public final class ahY extends gE
{
  private static final aee bx = new bOO(new dNA());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public ahY() {
    aH();
  }

  public ahY auQ()
  {
    ahY localahY;
    try {
      localahY = (ahY)bx.Mm();
      localahY.aOr = bx;
    } catch (Exception localException) {
      localahY = new ahY();
      localahY.aOr = null;
      localahY.eXg = false;
      K.error("Erreur lors d'un checkOut sur un TeleportCasterBehindTarget : " + localException.getMessage());
    }
    return localahY;
  }

  public void a(aVc paramaVc)
  {
    this.aFK = true;
    if (this.evp == null) {
      this.aFK = false;
      return;
    }
    cYk localcYk = this.evp.ML();
    CG localCG = this.evp.E();
    if ((localcYk == null) || (localCG == null)) {
      this.aFK = false;
      return;
    }

    this.eUw.ae(localcYk);
    this.eUw.aa(localCG.hY, localCG.hZ, 0);

    super.a(paramaVc);
  }

  protected dle gs()
  {
    return this.evo;
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

  public void bc()
  {
    super.bc();
  }
}