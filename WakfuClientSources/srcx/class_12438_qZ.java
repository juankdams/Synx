import org.apache.log4j.Logger;

public class qZ extends doA
{
  private static final aee bx = new bOO(new czG());

  private static final qM by = new dzQ(new ec[] { new dLx("Default (pa/pm/pw, consommés à la fin)", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("levelPerPa", dnN.lnS), new dmb("levelPerPm", dnN.lnS), new dmb("levelPerPw", dnN.lnS) }), new dLx("Default (pa/pm/pw, consommés ou non)", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("levelPerPa", dnN.lnS), new dmb("levelPerPm", dnN.lnS), new dmb("levelPerPw", dnN.lnS), new dmb("consommés (0=non, 1 = oui)", dnN.lnS) }) });
  protected short aGz;
  protected short aYK;
  protected short aYL;
  protected short aYM;
  protected boolean aYN;

  public qZ()
  {
    aH();
  }

  public qZ xJ()
  {
    qZ localqZ;
    try {
      localqZ = (qZ)bx.Mm();
      localqZ.aOr = bx;
    } catch (Exception localException) {
      localqZ = new qZ();
      localqZ.eXg = false;
      localqZ.aOr = null;
      K.error("Erreur lors d'un newInstance sur un LatentState : " + localException.getMessage());
    }
    localqZ.aGz = this.aGz;
    localqZ.aYK = this.aYK;
    localqZ.aYL = this.aYL;
    localqZ.aYM = this.aYM;
    localqZ.aYN = this.aYN;
    return localqZ;
  }

  public qM aF() {
    return by;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    jJ(true);

    if ((this.evo == null) || (this.evp == null)) {
      return;
    }
    int i = this.aYK == 0 ? 0 : this.evo.e(eu.ayN);
    int j = this.aYL == 0 ? 0 : this.evo.e(eu.ayO);
    int k = this.aYM == 0 ? 0 : this.evo.e(eu.ayP);
    dRu localdRu;
    if (this.aYN)
      localdRu = dRu.a(this.ejP, new bPk((byte)i, (byte)j, (byte)k), this.evo);
    else {
      localdRu = dRu.a(this.ejP, new bPk((byte)0, (byte)0, (byte)0), this.evo);
    }
    localdRu.i(this.evo);
    localdRu.a(cMe.krm);
    localdRu.c(null, false);

    short s = (short)(i * this.aYK + j * this.aYL + k * this.aYM);

    bZG localbZG = bZG.a(this.ejP, this.evp, this.aGz, s, false);
    localbZG.i(this.evo);
    localbZG.b(this.eWM);
    localbZG.b(this.eWL);
    localbZG.cel();
    localbZG.c(null, false);
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void a(aVc paramaVc) {
    if (this.eWL == null) {
      return;
    }
    short s = cVC();
    this.aGz = ((short)((dpI)this.eWL).a(0, s, dNF.meh));
    this.aYK = ((short)((dpI)this.eWL).a(1, s, dNF.meh));
    this.aYL = ((short)((dpI)this.eWL).a(2, s, dNF.meh));
    this.aYM = ((short)((dpI)this.eWL).a(3, s, dNF.meh));
    if (((dpI)this.eWL).bep() < 5)
      this.aYN = true;
    else
      this.aYN = (1 == ((dpI)this.eWL).a(4, s, dNF.meh));
  }
}