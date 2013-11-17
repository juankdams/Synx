import org.apache.log4j.Logger;

public final class cIV extends doA
{
  private static final aee bx = new bOO(new dhw());

  private static final qM by = new dzQ(new ec[] { new dLx("Id du mob, niveaux = niveau moyen du mob", new dmb[] { new dmb("Id du mob", dnN.lnR) }), new dLx("Id du mob, niveaux = niveau moyen du mob ou du joueur", new dmb[] { new dmb("Id du mob", dnN.lnR), new dmb("Niveaux : 0 : niveau du mob, 1 = niveau du joueur", dnN.lnR) }) });
  private static final int iGX = -1;
  private cDZ iGY;
  public cCH aAR = new dhc(this, 4);

  public qM aF()
  {
    return by;
  }

  public cIV() {
    aH();
  }

  public cIV cDs()
  {
    cIV localcIV;
    try {
      localcIV = (cIV)bx.Mm();
      localcIV.aOr = bx;
    } catch (Exception localException) {
      localcIV = new cIV();
      localcIV.aOr = null;
      localcIV.eXg = false;
      localcIV.iGY = cDZ.ixt;
      K.error("Erreur lors d'un checkOut sur un ChangePlayerByMobSkinAndSpells : " + localException.getMessage());
    }
    return localcIV;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if (((dpI)this.eWL).bep() >= 2) {
      int i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
      this.iGY = (i == 1 ? cDZ.ixu : cDZ.ixt);
    } else {
      this.iGY = cDZ.ixt;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.evp == null) {
      cVD();
      return;
    }

    if (!(this.evp instanceof dhJ)) {
      cVD();
      return;
    }
    if (((dhJ)this.evp).aeE())
      ((dhJ)this.evp).aeD();
    ((dhJ)this.evp).b(this.cxl, this.iGY);
  }

  public boolean Cu() {
    if (!(this.evp instanceof dhJ)) {
      return false;
    }
    return super.Cu();
  }

  public void aK() {
    if (!this.ksH)
      return;
    if (!(this.evp instanceof dhJ)) {
      return;
    }

    ((dhJ)this.evp).Ad(this.cxl);
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

  public void bc()
  {
    this.cxl = -1;
    this.iGY = cDZ.ixt;
    super.bc();
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}