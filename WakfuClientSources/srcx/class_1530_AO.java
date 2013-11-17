import org.apache.log4j.Logger;

public class AO extends doA
{
  private static final aee bx = new bOO(new Fp());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de param", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public AO() {
    aH();
  }

  public AO JY()
  {
    AO localAO;
    try {
      localAO = (AO)bx.Mm();
      localAO.aOr = bx;
    } catch (Exception localException) {
      localAO = new AO();
      localAO.eXg = false;
      localAO.aOr = null;
      K.error("Erreur lors d'un checkOut sur un RE:Unsummon : " + localException.getMessage());
    }
    this.eWS = 1;
    return localAO;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp != null) {
      this.evp.a(cfY.hBr);
      this.evp.a(cfY.hBl);
      b(paramaVc, paramBoolean);

      this.evp.a(eu.ayM).cpy();
      this.evp.a(eu.ayX).setMax(0);
    }
    else {
      jJ(true);
    }
  }

  public void a(aVc paramaVc)
  {
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
}