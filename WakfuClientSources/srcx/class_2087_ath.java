import org.apache.log4j.Logger;

public final class ath extends doA
{
  private static final aee bx = new bOO(new Gt());

  private static final qM by = new dzQ(new ec[] { new dLx("Valeur et Element", new dmb[] { new dmb("Valeur", dnN.lnR), new dmb("Element", dnN.lnS) }) });
  private bTI cpW;
  private int dDe;
  private float dDf;

  public qM aF()
  {
    return by;
  }

  public ath() {
    aH();
  }

  public ath aFc()
  {
    ath localath;
    try {
      localath = (ath)bx.Mm();
      localath.aOr = bx;
    } catch (Exception localException) {
      localath = new ath();
      localath.aOr = null;
      localath.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ElementalVirutalArmor : " + localException.getMessage());
    }
    localath.cpW = this.cpW;
    localath.dDe = this.dDe;
    localath.dDf = this.dDf;
    return localath;
  }

  public void oT()
  {
    if (bkn() == null)
      oS();
  }

  private void oS() {
    byte b = (byte)((dpI)this.eWL).a(1, cVC(), dNF.meh);
    this.cpW = bTI.dx(b);
    if (this.cpW == null) {
      K.error("Element inconnu " + b);
      return;
    }

    this.dDe = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    if ((bkh() == null) || (!((dji)bkh()).cSa())) {
      int i = 0;
      if (this.evo.b(this.cpW.bZS()))
        i += this.evo.e(this.cpW.bZS());
      if (this.evo.b(eu.azc))
        i += this.evo.e(eu.azc);
      this.cxl = (this.dDe + this.dDe * i / 100);
      this.dDf = (this.dDe / this.cxl);
    } else {
      kf(((dji)bkh()).cRZ());
    }
  }

  public void a(aVc paramaVc)
  {
    if ((bkn() != null) && (bkn().getId() == getId()))
      this.cxl = bkn().getValue();
  }

  public void kf(int paramInt)
  {
    if ((bkn() != null) && (bkn().getId() == getId())) {
      this.cxl = bkn().getValue();
    } else {
      super.kf(paramInt);
      this.dDf = (this.dDe / paramInt);
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();
    if ((paramaVc != null) && (paramBoolean))
      c(paramaVc);
  }

  private void c(aVc paramaVc)
  {
    dle localdle = paramaVc.bkf();
    if (localdle == null) {
      return;
    }
    int i = paramaVc.getValue();
    this.cxl -= i;

    int j = Math.max(0, -this.cxl);
    int k = i - j;
    if (k > 0) {
      paramaVc.b(1, -k, false);
    }
    if ((bkn() != null) && (bkn().getId() == getId())) {
      ((ath)bkn()).aK(this.cxl);
    }

    if (paramaVc.aiz()) {
      return;
    }
    int m = bMr.ax(k * this.dDf);
    b(paramaVc, m);
  }

  private void b(aVc paramaVc, int paramInt) {
    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());
    if (localaLM == null) {
      return;
    }
    if (localaLM.bdo() != 1) {
      K.error("On ne peut pas qu'un seul effet dans un groupe d'effet de ce type " + ((dpI)this.eWL).yR());
      cVD();
      return;
    }

    aOB localaOB = new aOB(this.evo, this.evp, this.cpW);
    localaOB.nq(11);
    localaOB.setValue(paramInt);
    localaOB.bfu();
    dzW.a(localaOB.bfE(), this);
    int i = localaOB.getValue();

    dji localdji = a((doA)paramaVc, true);
    localdji.Ap(i);

    dpI localdpI = localaLM.nc(0);
    localdpI.a(wa(), bke(), aIq(), bsj.bAv(), this.evp.fa(), this.evp.fb(), this.evp.fc(), this.evp, localdji);
  }

  private dji a(doA paramdoA, boolean paramBoolean)
  {
    dji localdji = dji.a(paramBoolean, false, paramdoA);
    localdji.jt(false);
    return localdji;
  }

  public void aK(int paramInt) {
    this.cxl = paramInt;
    if (this.cxl <= 0)
      this.eWS = 0;
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
    this.cpW = null;
    super.bc();
  }
}