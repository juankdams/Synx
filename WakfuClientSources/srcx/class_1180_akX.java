import org.apache.log4j.Logger;

public class akX extends doA
{
  private static final aee bx = new bOO(new ip());

  private static final qM by = new dzQ(new ec[] { new dLx("Attaque avec un sort", new dmb[] { new dmb("spellId", dnN.lnQ) }) });

  public qM aF()
  {
    return by;
  }

  public akX axH()
  {
    akX localakX;
    try
    {
      localakX = (akX)bx.Mm();
      localakX.aOr = bx;
    } catch (Exception localException) {
      localakX = new akX();
      localakX.aOr = null;
      localakX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SpellAttack : " + localException.getMessage());
    }
    return localakX;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evp != null)
    {
      if ((this.evo instanceof dhJ)) {
        int i = ((dpI)this.eWL).a(0, (short)1, dNF.meh);
        dle localdle = bkf();
        ((dhJ)this.evo).a(i, new cYk(localdle.fa(), localdle.fb(), localdle.fc()));
      }
    }
    else jJ(true);
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