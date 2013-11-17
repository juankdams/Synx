import org.apache.log4j.Logger;

public final class hE extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Defaut", new dmb[] { new dmb("Valeur de modification ", dnN.lnR), new dmb("Id du métier)", dnN.lnS) }) });
  private boolean aHd;
  private bG aHe;
  private int aHf;
  private static final aee aER = new bOO(new m());

  public cCH aAR = new l(this, 5);

  public hE()
  {
  }

  public hE(bG parambG)
  {
    this.aHe = parambG;
  }

  public static hE pE()
  {
    hE localhE;
    try
    {
      localhE = (hE)aER.Mm();
      localhE.aHd = true;
    } catch (Exception localException) {
      localhE = new hE();
      K.error("Erreur lors d'un checkOut sur un objet de type EcosystemSkillModification : " + localException.getMessage());
    }
    return localhE;
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
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    this.cxl = aN(this.cxl);
  }

  public void aK()
  {
    aN(-this.cxl);
  }

  private int aN(int paramInt) {
    if (this.evp == null)
      return 0;
    if (!(this.evp instanceof dhJ))
      return 0;
    baD localbaD = ((dhJ)this.evp).JL();
    int i = localbaD.a(this.aHe, this.aHf);
    localbaD.a(this.aHe, this.aHf, paramInt);
    int j = localbaD.a(this.aHe, this.aHf);
    return j - i;
  }

  public aVc aO()
  {
    hE localhE = pE();
    localhE.aHf = this.aHf;
    localhE.aHe = this.aHe;
    return localhE;
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
    if (((dpI)this.eWL).bep() == 2) {
      this.aHf = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    } else {
      this.aHe = bG.d((byte)((dpI)this.eWL).a(1, cVC(), dNF.meh));
      this.aHf = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
    }
  }

  public qM aF() {
    return by;
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}