import java.util.BitSet;
import org.apache.log4j.Logger;

public class aZw extends bFw
{
  private static final aee bx = new bOO(new dvu());

  private static final qM by = new dzQ(new ec[] { new dLx("vol de PdV", new dmb[] { new dmb("valeur de l'attaque", dnN.lnR), new dmb("pourcentage volé", dnN.lnS) }) });
  private int fgn;
  private cCH aGA = new dvs(this);

  public qM aF()
  {
    return by;
  }

  private aZw() {
  }

  public aZw(bTI parambTI, dnO paramdnO) {
    super(parambTI, paramdnO);
    this.eXg = true;
  }

  public aZw boq()
  {
    aZw localaZw;
    try {
      localaZw = (aZw)bx.Mm();
      localaZw.aOr = bx;
    } catch (Exception localException) {
      localaZw = new aZw();
      localaZw.aOr = null;
      localaZw.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPLeech : " + localException.getMessage());
    }
    localaZw.gAB = this.gAB;
    return localaZw;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(20);
    bTI localbTI = Cz();
    if (localbTI != null)
      switch (dvx.cUV[localbTI.ordinal()]) {
      case 1:
        break;
      case 2:
        this.eWR.set(24);
        break;
      case 3:
        this.eWR.set(21);
        break;
      case 4:
        this.eWR.set(22);
        break;
      case 5:
        this.eWR.set(23);
        break;
      case 6:
        this.eWR.set(25);
      }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (this.evo == this.evp) {
      cVD();
      return;
    }

    super.a(paramaVc, paramBoolean);
    if (!RI()) {
      b(paramaVc, paramBoolean);
    }

    if ((bkt()) && (this.evo != null) && (this.evo.b(eu.ayM))) {
      aWl localaWl = aWl.c(this.ejP, Cz());
      localaWl.j(this.evo);
      localaWl.kf(this.fgn);
      localaWl.u(this);
      localaWl.i(this.evo);
      localaWl.b(dzg.dcV());
      localaWl.bkz();
    }
  }

  public void a(aVc paramaVc)
  {
    this.fgn = 0;
    short s = cVC();
    if ((this.evp == null) || (!this.evp.b(eu.ayM))) {
      K.error("[Effects] On a essayé de lancer un vol de vie sans cible avec des hps");
      jJ(true);
      return;
    }
    float f = 0.0F;
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
      f = ((dpI)this.eWL).a(1, s, dNF.mei);
      if (this.evo.b(eu.azG)) {
        f += this.evo.e(eu.azG);
      }
    }
    bNo();
    bNp();
    int i = this.cxl < this.evp.e(eu.ayM) ? this.cxl : this.evp.e(eu.ayM);

    this.fgn = bMr.ax(f / 100.0F * i);
  }

  public boolean aL()
  {
    return true;
  }

  public int bor() {
    return this.fgn;
  }

  public cCH lJ()
  {
    return this.aGA;
  }

  public void aJ()
  {
    super.aJ();
    this.fgn = 0;
  }
}