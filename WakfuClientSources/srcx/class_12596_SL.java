import java.util.BitSet;
import org.apache.log4j.Logger;

public class SL extends doA
{
  private static final aee bx = new bOO(new Oa());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de param", new dmb[0]), new dLx("% de pdv restoré", new dmb[] { new dmb("%", dnN.lnR) }), new dLx("Uniquement si le controlleur original est encore en jeu", new dmb[] { new dmb("%", dnN.lnR), new dmb("controleur encore en jeu (1 = oui, 0 == non (defaut))", dnN.lnR) }), new dLx("Restore aussi les pvs virtuels", new dmb[] { new dmb("%", dnN.lnR), new dmb("controleur encore en jeu (1 = oui, 0 == non (defaut))", dnN.lnS), new dmb("restore aussi les pvs virtuels (1 = oui, 0 == non (defaut))", dnN.lnS) }), new dLx("Met les PA et PM au max", new dmb[] { new dmb("%", dnN.lnR), new dmb("controleur encore en jeu (1 = oui, 0 == non (defaut))", dnN.lnS), new dmb("restore aussi les pvs virtuels (1 = oui, 0 == non (defaut))", dnN.lnS), new dmb("PA/PM au max (1 = oui, 0 == non (defaut))", dnN.lnS) }) });
  private int cuj;
  private boolean cuk;
  private boolean cul;
  private final cCH cum = new NV(this, 6);

  private boolean cun = false;
  private int ke = 0;
  private boolean cuo;

  public qM aF()
  {
    return by;
  }

  public SL()
  {
    aH();
  }

  public SL afU()
  {
    SL localSL;
    try {
      localSL = (SL)bx.Mm();
      localSL.aOr = bx;
    } catch (Exception localException) {
      localSL = new SL();
      localSL.eXg = false;
      localSL.aOr = null;
      K.error("Erreur lors d'un checkOut sur un RE:Raise : " + localException.getMessage());
    }
    this.eWS = 1;
    localSL.cuo = this.cuo;
    localSL.ke = this.ke;
    return localSL;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(202);
    this.eWR.set(1);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.cuo) && ((this.evp instanceof dhJ))) {
      dhJ localdhJ = ((dhJ)this.evp).aft();
      if ((localdhJ != null) && (!localdhJ.byc())) {
        cVD();
        return;
      }
    }

    if ((this.evp != null) && (this.evp.b(eu.ayM)) && (!this.evp.c(cfY.hCm)))
      afV();
    else
      jJ(true);
  }

  void afV()
  {
    if ((this.cun) && (bkt())) {
      int i = this.evp.a(eu.ayM).max();
      this.cxl = Math.max(1, bMr.ax(i / 100.0F * this.ke));
      if (this.evp.b(eu.aAj)) {
        int j = this.evp.a(eu.aAj).max();
        this.cuj = Math.max(1, bMr.ax(j / 100.0F * this.ke));
      }
    }
    this.evp.a(eu.ayM).set(this.cxl);
    if ((this.cuk) && (this.evp.b(eu.aAj)))
      this.evp.a(eu.aAj).set(this.cuj);
    if (((this.evp instanceof dhJ)) && 
      (bkh() != null) && (((dji)bkh()).cRV() != null)) {
      ((dhJ)this.evp).jm(true);
    }

    if (this.cul) {
      if (this.evp.b(eu.ayN))
        this.evp.a(eu.ayN).cpx();
      if (this.evp.b(eu.ayO))
        this.evp.a(eu.ayO).cpx();
    }
  }

  public void a(aVc paramaVc)
  {
    this.cuo = false;
    this.ke = 0;
    short s = cVC();
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() <= 0) {
      this.cxl = 1;
      return;
    }

    this.ke = ((dpI)this.eWL).a(0, s, dNF.meh);
    this.cun = true;

    if (((dpI)this.eWL).bep() > 1) {
      this.cuo = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
    }
    if (((dpI)this.eWL).bep() > 2) {
      this.cuk = (((dpI)this.eWL).a(2, s, dNF.meh) == 1);
    }
    if (((dpI)this.eWL).bep() > 3)
      this.cul = (((dpI)this.eWL).a(3, s, dNF.meh) == 1);
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

  protected boolean afW()
  {
    return true;
  }

  public cCH lJ()
  {
    return this.cum;
  }

  public void aJ()
  {
    super.aJ();
    this.cun = false;
    this.ke = 0;
    this.cuo = false;
    this.cuj = 0;
    this.cuk = false;
    this.cul = false;
  }
}