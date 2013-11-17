import org.apache.log4j.Logger;

public final class clV extends doA
{
  private static final qM by = new dzQ(new ec[] { new dLx("Defaut", new dmb[] { new dmb("Valeur de modification ", dnN.lnR) }) });
  private boolean aHd;
  private dEv hQR;
  private bcz hQS;
  private static final aee aER = new bOO(new cvP());

  public cCH aAR = new cvQ(this, 2);

  public clV()
  {
  }

  public clV(dEv paramdEv, bcz parambcz)
  {
    this.hQR = paramdEv;
    this.hQS = parambcz;
  }

  public static clV cnj()
  {
    clV localclV;
    try
    {
      localclV = (clV)aER.Mm();
      localclV.aHd = true;
    } catch (Exception localException) {
      localclV = new clV();
      K.error("Erreur lors d'un checkOut sur un objet de type EcosystemSkillModification : " + localException.getMessage());
    }
    return localclV;
  }

  public void release() {
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

  public void bc() {
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    this.cxl = aN(this.cxl);
  }

  public void aK() {
    aN(-this.cxl);
  }

  private int aN(int paramInt) {
    if (this.evp == null)
      return 0;
    if (!(this.evp instanceof dhJ))
      return 0;
    baD localbaD = ((dhJ)this.evp).JL();
    int i = localbaD.a(this.hQR, this.hQS);
    localbaD.a(this.hQR, this.hQS, paramInt);
    int j = localbaD.a(this.hQR, this.hQS);
    return j - i;
  }

  public aVc aO() {
    clV localclV = cnj();
    localclV.hQS = this.hQS;
    localclV.hQR = this.hQR;
    return localclV;
  }

  public boolean aL() {
    return false;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void a(aVc paramaVc) {
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() > 1) {
      this.hQR = dEv.fH((byte)((dpI)this.eWL).a(1, cVC(), dNF.meh));
      this.hQS = bcz.bI((short)((dpI)this.eWL).a(2, cVC(), dNF.meh));
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