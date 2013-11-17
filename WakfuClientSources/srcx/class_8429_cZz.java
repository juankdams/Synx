import org.apache.log4j.Logger;

public class cZz extends doA
{
  private static final aee bx = new bOO(new dvt());

  private static final qM by = new dzQ(new ec[] { new dLx("Porte la cible", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public void aH()
  {
    super.aH();
  }

  public cZz cMo()
  {
    cZz localcZz;
    try {
      localcZz = (cZz)bx.Mm();
      localcZz.aOr = bx;
    } catch (Exception localException) {
      localcZz = new cZz();
      localcZz.aOr = null;
      localcZz.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Carry : " + localException.getMessage());
    }
    return localcZz;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    int i = 0;
    if ((!(this.evp instanceof aTa)) || (!(this.evo instanceof cYl))) {
      jJ(true);
      return;
    }

    if ((this.evp.c(cfY.hBk)) || (this.evp.c(cfY.hCq))) {
      jJ(true);
      return;
    }

    int j = this.evp.fa();
    int k = this.evp.fb();
    short s = this.evp.fc();

    aTa localaTa = (aTa)this.evp;

    cYl localcYl = (cYl)this.evo;

    if (localcYl.a(localaTa)) {
      i = 1;

      b(paramaVc, paramBoolean);

      if (this.ejP.LC() != null) {
        this.ejP.LC().a(j, k, s, this.evp.fa(), this.evp.fb(), this.evp.fc(), this.evp);
      }
    }

    if (i == 0)
      jJ(true);
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