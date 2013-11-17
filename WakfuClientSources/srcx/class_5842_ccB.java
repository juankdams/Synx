import org.apache.log4j.Logger;

public class ccB extends doA
{
  private static final aee bx = new bOO(new aqj());

  private static final qM by = new dzQ(new ec[] { new dLx("Standard", new dmb[0]), new dLx("Affichage flottant (ExecutionStatusConstants)", new dmb[] { new dmb("", dnN.lnR) }), new dLx("2 params", new dmb[] { new dmb("1", dnN.lnR), new dmb("2", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public ccB qP()
  {
    ccB localccB;
    try
    {
      localccB = (ccB)bx.Mm();
      localccB.aOr = bx;
    } catch (Exception localException) {
      localccB = new ccB();
      localccB.aOr = null;
      K.error("Erreur lors d'un checkOut sur un NullEffect : " + localException.getMessage());
    }
    return localccB;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
  }

  public void a(aVc paramaVc)
  {
    if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0))
      fe((byte)((dpI)this.eWL).a(0, (short)0, dNF.mei));
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

  public boolean afW()
  {
    return true;
  }
}