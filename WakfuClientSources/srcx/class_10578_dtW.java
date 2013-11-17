import org.apache.log4j.Logger;

public final class dtW extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Defaut", new dmb[] { new dmb("Valeur de modification ", dnN.lnR), new dmb("Id du métier)", dnN.lnS) }) });
  private boolean aHd;
  private int aHf;
  private int lxC;
  private int lxD;
  private static final aee aER = new bOO(new dNC());

  public static dtW cZW()
  {
    dtW localdtW;
    try
    {
      localdtW = (dtW)aER.Mm();
      localdtW.aHd = true;
    } catch (Exception localException) {
      localdtW = new dtW();
      K.error("Erreur lors d'un checkOut sur un objet de type EcosystemSkillModification : " + localException.getMessage());
    }
    return localdtW;
  }

  public void release()
  {
    if (this.aHd)
      try {
        aER.y(this);
        this.aHd = false;
      } catch (Exception localException) {
        K.error("Exception lors du retour au pool", localException);
      }
    else
      bc();
  }

  public void aJ()
  {
  }

  public void bc()
  {
    this.lxD = 0;
    this.lxC = 0;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    this.lxC = a(this.cxl, bG.kI);
    this.lxD = a(this.cxl, bG.kH);
  }

  public void aK()
  {
    a(-this.lxC, bG.kI);
    a(-this.lxD, bG.kH);
  }

  private int a(int paramInt, bG parambG) {
    if (this.evp == null)
      return 0;
    if (!(this.evp instanceof dhJ))
      return 0;
    baD localbaD = ((dhJ)this.evp).JL();
    int i = localbaD.a(parambG, this.aHf);
    localbaD.a(parambG, this.aHf, paramInt);
    int j = localbaD.a(parambG, this.aHf);
    return j - i;
  }

  public aVc aO()
  {
    dtW localdtW = cZW();
    localdtW.aHf = this.aHf;
    localdtW.lxD = this.lxD;
    localdtW.lxC = this.lxC;
    return localdtW;
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

  public void a(aVc paramaVc)
  {
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() == 2)
      this.aHf = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
  }

  public qM aF()
  {
    return by;
  }
}