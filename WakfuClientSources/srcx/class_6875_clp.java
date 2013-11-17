import org.apache.log4j.Logger;

public class clp extends doA
{
  private static final aee bx = new bOO(new Fz());

  private static final qM by = new dzQ(new ec[] { new dLx("Renvoi de sort (complet)", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public clp cmU()
  {
    clp localclp;
    try
    {
      localclp = (clp)bx.Mm();
      localclp.aOr = bx;
    } catch (Exception localException) {
      localclp = new clp();
      localclp.aOr = null;
      localclp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un SpellRebound : " + localException.getMessage());
    }

    return localclp;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((paramaVc != null) && (paramBoolean)) {
      if ((paramaVc.bke() != null) && (!paramaVc.bke().c(dKm.lXn))) {
        dle localdle = paramaVc.bke();
        paramaVc.C(localdle.fa(), localdle.fb(), localdle.fc());
      } else {
        jJ(true);
      }
    } else if (bkt())
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