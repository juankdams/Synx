import java.util.BitSet;
import org.apache.log4j.Logger;

public class dWp extends doA
{
  private static final BitSet edb = new BitSet();

  private static final aee bx = new bOO(new Bl());

  private static final qM by = new dzQ(new ec[] { new dLx("% PdV de la cibles gagnés", new dmb[] { new dmb("valeur", dnN.lnR) }), new dLx("% PdV de la cibles gagnés", new dmb[] { new dmb("valeur", dnN.lnR), new dmb("fixe (1 = oui, 0 = non (defaut))", dnN.lnS) }) });
  private int ke;
  private boolean edc = false;
  private bTI cpW;

  public qM aF()
  {
    return by;
  }

  protected dWp()
  {
  }

  public dWp(bTI parambTI)
  {
    this.cpW = parambTI;
    aH();
  }

  public bTI Cz()
  {
    return this.cpW;
  }

  public static dWp e(cOE paramcOE, bTI parambTI) {
    dWp localdWp;
    try {
      localdWp = (dWp)bx.Mm();
      localdWp.aOr = bx;
    } catch (Exception localException) {
      localdWp = new dWp();
      localdWp.aOr = null;
      localdWp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGainForCasterBasedOnTarget : " + localException.getMessage());
    }

    localdWp.cpW = parambTI;
    localdWp.aw = bsj.fOS.getId();
    localdWp.eWQ = ((doA)bsj.fOS.getObject()).DU();
    localdWp.eWS = -1;
    localdWp.ejP = paramcOE;
    return localdWp;
  }

  public dWp dvC()
  {
    dWp localdWp;
    try {
      localdWp = (dWp)bx.Mm();
      localdWp.aOr = bx;
    } catch (Exception localException) {
      localdWp = new dWp();
      localdWp.aOr = null;
      localdWp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGainForCasterBasedOnTarget : " + localException.getMessage());
    }

    localdWp.cpW = this.cpW;
    return localdWp;
  }

  public void release()
  {
    super.release();
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(1);
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt)
    {
    case 0:
      if (!paramBoolean)
        this.cxl = ((int)(this.cxl + this.cxl * paramFloat / 100.0F)); break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else
        this.cxl = ((int)(this.cxl + paramFloat));
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    jJ(true);
    aWl localaWl = aWl.c(this.ejP, Cz());
    localaWl.kf(this.cxl);
    localaWl.b(this.eWL);
    localaWl.i(this.evp);
    localaWl.j(this.evo);
    localaWl.bkz();
  }

  public void a(aVc paramaVc)
  {
    aSl();
    if ((this.evp == null) || (!this.evp.b(eu.ayM)) || (this.evo == null) || (!this.evo.b(eu.ayM)))
    {
      this.cxl = 0;
    } else {
      i = this.evp.a(eu.ayM).max();
      this.cxl = (i * this.ke / 100);
    }
    if (this.edc)
      return;
    int i = aSm();
    this.cxl += this.cxl * i / 100;
    this.cxl = Math.max(0, bMr.ax(this.cxl));
  }

  public void aSl() {
    short s = cVC();
    if (this.eWL == null)
      return;
    int i = ((dpI)this.eWL).bep();
    if (i >= 1)
      this.ke = ((dpI)this.eWL).a(0, s, dNF.meh);
    if (i >= 2)
      this.edc = (((dpI)this.eWL).a(1, s, dNF.meh) == 1);
    else
      this.edc = false;
  }

  private int aSm() {
    if (this.evo == null)
      return 0;
    int i = 0;
    if (this.evo.b(this.cpW.bZR()))
      i += this.evo.e(this.cpW.bZR());
    if (this.evo.b(eu.aza))
      i += this.evo.e(eu.aza);
    if (this.evo.b(eu.azo))
      i -= this.evo.e(eu.azo);
    return i;
  }

  public boolean aL()
  {
    return true;
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
    this.edc = false;
    super.bc();
  }

  public BitSet DV()
  {
    if ((this.evo != null) && (this.evo.c(cfY.hBs))) {
      return edb;
    }
    return super.DV();
  }
}