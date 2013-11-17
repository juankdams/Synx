import java.util.BitSet;
import org.apache.log4j.Logger;

public class bZi extends doA
{
  private static final aee bx = new bOO(new aYG());

  private static final qM by = new dzQ(new ec[] { new dLx("Poison sur charac (trigger)", new dmb[] { new dmb("PdV/point de charac", dnN.lnR) }), new dLx("Avec Element", new dmb[] { new dmb("PdV/point de charac", dnN.lnR), new dmb("Element", dnN.lnR) }), new dLx("Avec modificateur", new dmb[] { new dmb("PdV/point de charac", dnN.lnR), new dmb("Element", dnN.lnR), new dmb("mod : boost(1) / res (2) / rebound (4) / absorb(8) ", dnN.lnS) }) });
  private bTI cpW;
  private eu aCa;

  public qM aF()
  {
    return by;
  }

  public bZi(eu parameu)
  {
    aH();
    this.aCa = parameu;
  }

  private bZi()
  {
  }

  public bZi cdO()
  {
    bZi localbZi;
    try {
      localbZi = (bZi)bx.Mm();
      localbZi.aOr = bx;
    } catch (Exception localException) {
      localbZi = new bZi();

      localbZi.aOr = null;
      localbZi.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ArenaRunningEffect : " + localException.getMessage());
    }
    localbZi.aCa = this.aCa;
    return localbZi;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(2);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && (this.evp.b(eu.ayM)))
      this.evp.a(eu.ayM).gw(this.cxl);
    else
      jJ(true);
  }

  public void a(aVc paramaVc)
  {
    aSl();
    N(paramaVc);
    M(paramaVc);
  }

  private void aSl() {
    this.cpW = null;
    if (this.eWL == null) {
      return;
    }
    short s = cVC();
    this.cxl = bMr.ax(((dpI)this.eWL).a(0, s, dNF.mei));
    if (((dpI)this.eWL).bep() >= 2) {
      byte b = (byte)((dpI)this.eWL).a(1, s, dNF.mei);
      this.cpW = bTI.dx(b);
    }
  }

  private void M(aVc paramaVc) {
    if (this.cpW == null) {
      this.cpW = bTI.heY;
    }
    int i = 0;
    if (((dpI)this.eWL).bep() >= 3) {
      i = ((dpI)this.eWL).a(2, cVC(), dNF.meh);
    }
    aOB localaOB = new aOB(this.evo, this.evp, this.cpW);
    localaOB.nq(i);
    localaOB.setValue(this.cxl);
    localaOB.dN((this.eWL != null) && (((dpI)this.eWL).zi()));
    localaOB.bfu();
    dzW.a(localaOB.bfE(), this);
    this.cxl = localaOB.getValue();
  }

  private void N(aVc paramaVc) {
    if (paramaVc != null)
      if ((paramaVc instanceof dRu)) {
        switch (aYs.aCX[this.aCa.ordinal()]) {
        case 1:
          this.cxl *= ((dRu)paramaVc).dsq();
          break;
        case 2:
          this.cxl *= ((dRu)paramaVc).dsp();
          break;
        case 3:
          this.cxl *= ((dRu)paramaVc).dso();
        }
      }
      else if (((paramaVc instanceof cJc)) || ((paramaVc instanceof aYO)))
        this.cxl *= paramaVc.getValue();
      else if ((paramaVc.DV() != null) && (paramaVc.DV().get(2198)))
        this.cxl *= paramaVc.getValue();
  }

  public void b(int paramInt, float paramFloat, boolean paramBoolean)
  {
    super.b(paramInt, paramFloat, paramBoolean);
    switch (paramInt) {
    case 0:
      if (!paramBoolean)
        this.cxl += bMr.ax(this.cxl * paramFloat / 100.0F);
      else {
        this.cxl = bMr.ax(this.cxl * paramFloat / 100.0F);
      }
      break;
    case 1:
      if (paramBoolean)
        this.cxl = bMr.ax(paramFloat);
      else {
        this.cxl = ((int)(this.cxl + paramFloat));
      }
      break;
    }

    this.cxl = Math.max(0, this.cxl);
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

  public bTI Cz()
  {
    return this.cpW;
  }
}