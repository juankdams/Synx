import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class cPq extends doA
{
  private static final aee bx = new bOO(new aoD());

  private static final qM by = new dzQ(new ec[] { new dLx("Buff PvP", new dmb[] { new dmb("Niveau à simuler", dnN.lnR) }) });

  private final HashMap kyl = new HashMap();
  private int kym;
  private int kyn;
  private cCH aGA = new aoE(this);

  public qM aF()
  {
    return by;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    int i = 0;

    cqm localcqm = this.evp.a(eu.ayM);
    if (localcqm != null) {
      int j = localcqm.acX();
      int k = localcqm.max();
      localcqm.gx(this.kym);
      this.kym = (localcqm.acX() - j);
      this.kyn = (localcqm.max() - k);
      localcqm.gv(this.kyn);
    }

    for (Map.Entry localEntry : this.kyl.entrySet()) {
      bfE localbfE = (bfE)localEntry.getKey();
      Short localShort = (Short)localEntry.getValue();
      if (localShort.shortValue() <= 0) {
        K.error("Error dans PvPBuffGain : gain <= 0 ??");
      }
      else {
        i = 1;
        localbfE.jv(localShort.shortValue());
      }
    }
    if (i != 0)
      cGB();
    else
      jJ(true);
  }

  public void aK()
  {
    super.aK();
    if (!this.ksH) {
      return;
    }

    cqm localcqm = this.evp.a(eu.ayM);
    if (localcqm != null) {
      localcqm.gw(this.kyn);
      localcqm.gx(-this.kym);
    }

    for (Map.Entry localEntry : this.kyl.entrySet()) {
      bfE localbfE = (bfE)localEntry.getKey();
      Short localShort = (Short)localEntry.getValue();
      if (localShort.shortValue() <= 0) {
        K.error("Error dans PvPBuffGain : gain <= 0 ??");
      }
      else
        localbfE.jv(-localShort.shortValue());
    }
    cGB();
  }

  private void cGB() {
    dhJ localdhJ = (dhJ)this.evp;
    for (bTI localbTI : bTI.values())
      localdhJ.n(localbTI);
  }

  public void a(aVc paramaVc)
  {
    if ((this.eWL == null) || (this.evp == null)) {
      return;
    }
    if (!(this.evp instanceof dhJ))
      return;
    dhJ localdhJ = (dhJ)this.evp;

    short s = cVC();
    this.cxl = ((dpI)this.eWL).a(0, s, dNF.meh);

    if (!d(localdhJ, this.cxl)) {
      K.warn("Unable to apply spellGain to " + this.evp);
    }

    bhh localbhh = localdhJ.aJp();
    if ((localbhh instanceof SB)) {
      doC localdoC = ((SB)localbhh).afL();
      this.kym = localdoC.a(eu.ayM, localdhJ.nU(), (short)this.cxl);
    } else {
      this.kym = (Math.max(0, this.cxl - localdhJ.nU()) * 5);
    }
  }

  private boolean d(dhJ paramdhJ, int paramInt)
  {
    if (!(this.evp instanceof aVF)) {
      return false;
    }

    if (paramdhJ.nU() >= paramInt) {
      return false;
    }
    dCi localdCi = cGC();
    if (localdCi == null) {
      return false;
    }
    long l1 = ((aVF)paramdhJ).blf();

    long l2 = 0L;
    for (bTI localbTI1 : bTI.values()) {
      if (localbTI1.bZV())
      {
        l5 = dyc.a(paramdhJ, l1, localbTI1);
        l2 += l5;
      }
    }
    if (l2 == 0L) {
      return false;
    }

    long l3 = dyc.ks(l1);
    long l4 = l3 / 3L;

    long l5 = dyc.ew((short)this.cxl);
    long l6 = l5 / 3L;

    double d = l5 / l2;
    if (d <= 1.0D) {
      K.error("Gain in a PvPBuffGain <= 1 (" + d + ")");
      return false;
    }

    for (bfE localbfE : localdCi) {
      bTI localbTI2 = localbfE.Cz();
      if (localbTI2.bZV())
      {
        int k = localbfE.bsN();
        if (k != 0)
        {
          long l7 = localbfE.ayX();
          long l8 = dyc.h(0L, l7, l4);
          long l9 = Math.round(l8 * d);
          long l10 = Math.round(dyc.i(0L, l9, l6));
          int m = dMu.abu().cF(l10);
          if (k < m)
          {
            this.kyl.put(localbfE, Short.valueOf((short)(m - k)));
          }
        }
      }
    }
    return true;
  }

  private dCi cGC() {
    if (!(this.evp instanceof dhJ))
      return null;
    return ((dhJ)this.evp).auL();
  }

  public cCH lJ()
  {
    return this.aGA;
  }

  public cPq cGD()
  {
    cPq localcPq;
    try
    {
      localcPq = (cPq)bx.Mm();
      localcPq.aOr = bx;
    } catch (Exception localException) {
      localcPq = new cPq();
      localcPq.aOr = null;
      K.error("Erreur lors d'un checkOut sur un " + cPq.class + " : " + localException.getMessage());
    }
    return localcPq;
  }

  public void bc()
  {
    super.bc();
    this.kyl.clear();
    this.kyn = 0;
  }

  public void aJ()
  {
    super.aJ();
    this.kyl.clear();
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

  public cPq() {
    aH();
  }
}