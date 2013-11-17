import org.apache.log4j.Logger;

public final class xY extends doA
{
  private static final aee bx = new bOO(new cc());

  private static final qM by = new dzQ(new ec[] { new dLx("Modificateur / charac de reference (en % de la valeur de référence)", new dmb[] { new dmb("Modificateur", dnN.lnR) }), new dLx("Modificateur / charac de reference (en % ou en qte par valeur de référence)", new dmb[] { new dmb("Modificateur (% ou quantité)", dnN.lnR), new dmb("en % de la valeur de ref (0) en en multiplication (1)", dnN.lnR) }), new dLx("Avec Cap max", new dmb[] { new dmb("Modificateur (% ou quantité)", dnN.lnR), new dmb("en % de la valeur de ref (0) en en multiplication (1)", dnN.lnR), new dmb("Cap max", dnN.lnR) }) });
  private bBO bqZ;
  private eu bra;
  private eu brb;
  private boolean brc;

  public qM aF()
  {
    return by;
  }

  private xY()
  {
  }

  public xY(eu parameu1, eu parameu2)
  {
    aH();
    this.bra = parameu1;
    this.brb = parameu2;
  }

  public xY GW()
  {
    xY localxY;
    try {
      localxY = (xY)bx.Mm();
      localxY.aOr = bx;
    } catch (Exception localException) {
      localxY = new xY();
      localxY.aOr = null;
      localxY.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacModifiedByArmorPlate : " + localException.getMessage());
    }
    localxY.brb = this.brb;
    localxY.bra = this.bra;
    localxY.brc = this.brc;
    return localxY;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (GX()) {
      cVD();
      return;
    }

    this.brc = true;
    if ((((dpI)this.eWL).bep() >= 2) && 
      (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1)) {
      this.brc = false;
    }
    int i = -1;
    if (((dpI)this.eWL).bep() >= 3)
      i = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
    float f;
    if (this.brc)
      f = this.cxl / 100.0F;
    else {
      f = this.cxl;
    }
    dhJ localdhJ = (dhJ)this.evp;
    Rx localRx = localdhJ.d(this.bra);
    if (i <= 0)
      this.bqZ = new bBO(localdhJ.cQY(), this.brb, f, 0);
    else
      this.bqZ = new SK(localdhJ.cQY(), this.brb, f, 0, i);
    localRx.a(this.bqZ);
    this.bqZ.b(Xh.cHl, localRx.value());
  }

  private boolean GX() {
    return (this.evp == null) || (!(this.evp instanceof dhJ)) || (!this.evp.b(this.bra)) || (!this.evp.b(this.brb));
  }

  public void aK()
  {
    GY();
  }

  private void GY() {
    if (GX())
      return;
    Rx localRx = (Rx)this.evp.a(this.bra);
    if (localRx.c(this.bqZ))
      this.bqZ.b(Xh.cHm, localRx.value());
    localRx.b(this.bqZ);
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
    GY();
    super.bc();
  }
}