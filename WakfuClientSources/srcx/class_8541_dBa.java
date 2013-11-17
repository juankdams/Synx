import java.util.BitSet;
import org.apache.log4j.Logger;

public class dBa extends doA
{
  private static final aee bx = new bOO(new nt());

  private static final qM by = new dzQ(new ec[] { new dLx("Résurrection (hors combat)", new dmb[] { new dmb("Pdv rendus (en % du total)", dnN.lnR), new dmb("Pénalité d'xp mitigée (en % de la pénalité infligée)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public dBa() {
    aH();
  }

  public dBa des()
  {
    dBa localdBa;
    try {
      localdBa = (dBa)bx.Mm();
      localdBa.aOr = bx;
    } catch (Exception localException) {
      localdBa = new dBa();
      localdBa.aOr = null;
      K.error("Erreur lors d'un checkOut sur un NullEffect : " + localException.getMessage());
    }
    return localdBa;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(203);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    float f = ((dpI)this.eWL).nl(1);
    int i = (int)Math.max(1.0F, this.evp.e(eu.ayM) * ((dpI)this.eWL).nl(0));

    if ((this.evp != null) && ((this.evp instanceof dhJ)))
    {
      dhJ localdhJ = (dhJ)this.evp;

      this.evp.a(eu.ayM).set(i);
      localdhJ.bSg();
    }
  }

  public void a(aVc paramaVc)
  {
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void aK()
  {
    super.aK();
  }

  public boolean bWq()
  {
    return super.bWq();
  }
}