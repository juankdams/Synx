import java.util.BitSet;
import org.apache.log4j.Logger;

public class dGJ extends doA
{
  private static final aee bx = new bOO(new aZn());

  private static final qM by = new dzQ(new ec[] { new dLx("don de PV", new dmb[] { new dmb("% de valeur", dnN.lnR) }) });
  private float gDZ;

  public qM aF()
  {
    return by;
  }

  public dGJ() {
    aH();
  }

  public dGJ dhI()
  {
    dGJ localdGJ;
    try
    {
      localdGJ = (dGJ)bx.Mm();
      localdGJ.aOr = bx;
    } catch (Exception localException) {
      localdGJ = new dGJ();
      localdGJ.aOr = null;
      localdGJ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGain : " + localException.getMessage());
    }
    return localdGJ;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(1);
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt)
    {
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((bkt()) && (this.evp != null) && (this.evp.b(eu.ayM)))
    {
      cqm localcqm1 = this.evo.a(eu.ayM);
      this.cxl = bMr.ax(localcqm1.max() * this.gDZ / 100.0F);

      int i = localcqm1.value() - this.cxl;
      this.cxl += Math.min(i, localcqm1.min());

      cqm localcqm2 = this.evp.a(eu.ayM);
      int j = localcqm2.value() + this.cxl;
      this.cxl = ((j < localcqm2.max() ? j : localcqm2.max()) - localcqm2.value());

      bFw localbFw = bFw.a(this.ejP, bTI.heW, dnO.lnU, this.cxl, this.evo);
      localbFw.j(this.evo);
      localbFw.kf(this.cxl);
      localbFw.c(null, false);

      aWl localaWl = aWl.c(this.ejP, bTI.heW);
      localaWl.j(this.evp);
      localaWl.kf(this.cxl);
      localaWl.c(null, false);
    } else {
      jJ(true);
    }
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null)
      this.gDZ = ((dpI)this.eWL).a(0, s, dNF.mei);
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