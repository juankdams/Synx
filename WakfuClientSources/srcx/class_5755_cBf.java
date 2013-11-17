import org.apache.log4j.Logger;

public class cBf extends doA
{
  private static final aee bx = new bOO(new lO());

  private static final qM by = new dzQ(new ec[] { new dLx("Rappelle l'invocation dans le symbiote", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public cBf() {
    aH();
  }

  public cBf Mx()
  {
    cBf localcBf;
    try
    {
      localcBf = (cBf)bx.Mm();
      localcBf.aOr = bx;
    } catch (Exception localException) {
      localcBf = new cBf();
      localcBf.aOr = null;
      localcBf.eXg = false;
      K.error("Erreur lors d'un checkOut sur un BringBackToSymbiot : " + localException.getMessage());
    }
    return localcBf;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    dle localdle = Mw();
    if ((!(localdle instanceof dhJ)) || (!(localdle instanceof ajF))) {
      cVD();
      return;
    }

    ajF localajF = (ajF)localdle;
    NQ localNQ = localajF.awq();
    if (localNQ == null) {
      cVD();
      return;
    }

    if (!(this.evp instanceof dhJ)) {
      cVD();
      return;
    }

    dhJ localdhJ = (dhJ)this.evp;
    if (localdhJ.aft() != localajF) {
      cVD();
      return;
    }

    byte b = localNQ.bL(this.evp.getId());
    csi localcsi = localNQ.aj(b);
    if (localcsi != null) {
      localcsi.ej(-1L);
    }
    localdhJ.jo(true);
    localNQ.d(b, true);

    this.evp.a(cfY.hCl);
    this.evp.a(cfY.hCm);
    this.evp.a(cfY.hBr);
    this.evp.a(cfY.hBl);

    b(paramaVc, paramBoolean);

    this.evp.a(eu.ayM).cpy();
    this.evp.a(eu.ayX).setMax(0);
  }

  protected dle Mw() {
    return this.evo;
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
    return true;
  }
}