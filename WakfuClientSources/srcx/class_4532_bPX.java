import org.apache.log4j.Logger;

public final class bPX extends dqZ
{
  private static final aee bx = new bOO(new coI());

  private static final qM by = new dzQ(new ec[] { new dLx("Defaut", new dmb[0]), new dLx("Ratio en %", new dmb[] { new dmb("ratio en %", dnN.lnS) }) });
  private dSc[] aHb;

  public qM aF()
  {
    return by;
  }

  public bPX() {
    aH();
  }

  public bPX(dSc paramdSc, dSc[] paramArrayOfdSc) {
    super(paramdSc);
    this.aHb = paramArrayOfdSc;
    aH();
  }

  public bPX bXp()
  {
    bPX localbPX;
    try {
      localbPX = (bPX)bx.Mm();
      localbPX.aOr = bx;
    } catch (Exception localException) {
      localbPX = new bPX();
      localbPX.aOr = null;
      localbPX.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacGainFunctionCasterCharacAtApplication : " + localException.getMessage());
    }
    localbPX.aOF = this.aOF;
    localbPX.aHb = this.aHb;
    return localbPX;
  }

  public void oT()
  {
    if ((this.evo != null) && (bkt())) {
      for (int i = 0; i < this.aHb.length; i++) {
        dSc localdSc = this.aHb[i];
        if (this.evo.b(localdSc))
          this.cxl += this.evo.e(localdSc);
      }
      if ((this.eWL != null) && (((dpI)this.eWL).bep() > 0)) {
        i = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
        this.cxl = (this.cxl * i / 100);
      }
    }
    super.oT();
  }

  public void a(aVc paramaVc)
  {
  }

  public void bc()
  {
    this.aOF = null;
    this.aHb = null;
    super.bc();
  }
}