import java.util.BitSet;
import org.apache.log4j.Logger;

public class cyN extends doA
  implements cmD
{
  private static final aee bx = new bOO(new pD());

  private static final qM by = new dzQ(new ec[] { new dLx("Poison fonction de la valeur de l'effet déclenchant", new dmb[] { new dmb("PdV perdus pour une unité", dnN.lnR), new dmb("Valeur de l'unité", dnN.lnR), new dmb("Element", dnN.lnR) }), new dLx("Poison fonction de la valeur de l'effet déclenchant (unité = 1)", new dmb[] { new dmb("PdV perdus pour une unité", dnN.lnR), new dmb("Element", dnN.lnR) }) });
  private bTI cpW;
  private float cXR = 0.0F;
  private int gAG;
  private final cCH cum = new pE(this, 4);

  public qM aF()
  {
    return by;
  }

  public cyN() {
    aH();
  }

  public cyN cvN()
  {
    cyN localcyN;
    try
    {
      localcyN = (cyN)bx.Mm();
      localcyN.aOr = bx;
    } catch (Exception localException) {
      localcyN = new cyN();

      localcyN.aOr = null;
      localcyN.eXg = false;
      K.error("Erreur lors d'un checkOut sur un TriggeringValuePoison  : " + localException.getMessage());
    }
    localcyN.gAG = this.gAG;
    return localcyN;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(2);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && (this.evp.b(eu.ayM)))
      bNj();
    else
      jJ(true);
  }

  private void bNj()
  {
    bFw localbFw = new bFw();
    localbFw.a(this.cxl, this.evp);
    this.gAG = localbFw.bNq();
  }

  public void a(aVc paramaVc)
  {
    aSl();
    N(paramaVc);
    M(paramaVc);
  }

  private void aSl() {
    short s = cVC();
    this.cpW = null;
    if (this.eWL != null) {
      byte b = 0;
      if (((dpI)this.eWL).bep() == 3) {
        float f1 = ((dpI)this.eWL).o(0, s);
        float f2 = ((dpI)this.eWL).o(1, s);
        if (f2 == 0.0F)
          f2 = 1.0F;
        this.cXR = (f1 / f2);
        b = (byte)((dpI)this.eWL).a(2, s, dNF.mei);
      } else if (((dpI)this.eWL).bep() == 2) {
        this.cXR = ((dpI)this.eWL).o(0, s);
        b = (byte)((dpI)this.eWL).a(1, s, dNF.mei);
      }
      this.cpW = bTI.dx(b);
    }
  }

  protected static int bNo() {
    return 15;
  }

  private void M(aVc paramaVc) {
    aOB localaOB = new aOB(this.evo, this.evp, this.cpW);
    localaOB.setValue(this.cxl);
    localaOB.dN((this.eWL != null) && (((dpI)this.eWL).zi()));
    localaOB.nq(bNo());
    localaOB.bfu();
    dzW.a(localaOB.bfE(), this);
    this.cxl = localaOB.getValue();
  }

  private void N(aVc paramaVc) {
    if (paramaVc != null) {
      this.cxl = bMr.ax(this.cXR * paramaVc.getValue());
    } else {
      this.cxl = 0;
      K.error("Unable to compute damages for a " + getClass().getSimpleName() + " : no triggering effect");
    }
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

  public int bNq() {
    return this.gAG;
  }

  public void bc()
  {
    this.gAG = 0;
    super.bc();
  }

  public cCH lJ()
  {
    return this.cum;
  }
}