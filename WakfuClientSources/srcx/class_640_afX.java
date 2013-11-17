import org.apache.log4j.Logger;

public final class afX extends bZG
{
  private static final aee bx = new bOO(new acN());

  private static final qM by = new dzQ(new ec[] { new dLx("Applique l'armure", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS) }), new dLx("Spécifie le nombre de plaque", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS), new dmb("nombre de plaque de base (3 par défaut)", dnN.lnS) }) });
  private static final int cZo = 0;
  private static final int cZp = 1139;
  private byte cZq = 0;

  public cCH aAR = new acO(this, 5);

  public qM aF()
  {
    return by;
  }

  public afX() {
    aH();
  }

  public boolean Cu()
  {
    cel();
    return super.Cu();
  }

  public afX arp()
  {
    afX localafX;
    try {
      localafX = (afX)bx.Mm();
      localafX.aOr = bx;
    } catch (Exception localException) {
      localafX = new afX();
      localafX.aOr = null;
      localafX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyStateForFecaArmor : " + localException.getMessage());
    }
    localafX.cZq = this.cZq;
    return localafX;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    super.a(paramaVc, paramBoolean);
    if ((this.evp == null) || (this.evo == null)) {
      return;
    }
    if (!this.evp.b(eu.azS)) {
      return;
    }
    if (this.evp.e(eu.azS) <= 0)
      this.evp.a(eu.azS).set(this.cZq);
  }

  protected void a(bPD parambPD) {
    bJC localbJC = parambPD.bWk();
    if (localbJC != null) {
      localbJC.gj(true);
    }
    parambPD.gy(true);
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    short s = cVC();
    this.aGz = ((short)((dpI)this.eWL).a(0, s, dNF.meh));
    P(s);
    this.hqf = bJC.I(this.aGz, this.gCj);

    if (((dpI)this.eWL).bep() == 3)
      this.cZq = ((byte)((dpI)this.eWL).a(2, s, dNF.meh));
    else {
      this.cZq = 0;
    }

    dle localdle = arq();
    if (localdle.b(eu.azT))
      this.cZq = ((byte)(this.cZq + localdle.e(eu.azT)));
  }

  private dle arq()
  {
    dle localdle = this.evo;
    bPD localbPD = ((bgJ)this.evp.atO()).pz(1139);
    if (localbPD == null)
      K.error("L'état marqueur de l'armure neutre n'est pas present sur la cible");
    else {
      localdle = localbPD.bke();
    }
    return localdle;
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  public void bc() {
    super.bc();
    this.cZq = 0;
  }
}