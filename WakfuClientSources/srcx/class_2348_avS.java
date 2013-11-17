import org.apache.log4j.Logger;

class avS extends drP
{
  private static final Logger K = Logger.getLogger(avS.class);

  private final dRf dKL = new dRf(this, null);
  private static final boolean aRN = false;
  private static final int dKM = 3000;
  private long dKN = -1L;
  private long dKO = -1L;

  avS(ctE paramctE) {
    super(paramctE);
  }

  public void run()
  {
    long l1 = dDE.dft().bcy();
    int i = this.luf.HM();
    super.run();
    if (i != this.luf.HM()) {
      ((ctE)this.luf).st(i);
      this.dKL.ln(false);
    }

    if (this.dKO != -1L) {
      long l2 = getRemainingTime();
      bJL.bRp().tf(3000);
      this.dKL.kU(l2 - this.dKO);
      this.dKN = l1;
      this.dKO = -1L;
    }

    if ((this.dKN != -1L) && (l1 - this.dKN > 3000L)) {
      this.dKL.kU(0L);
      this.dKN = -1L;
    }

    if (getRemainingTime() <= 0L) {
      zX();
    }
    aHV();
  }

  public void bq(int paramInt1, int paramInt2) {
    this.dKO = Bp(paramInt2);
    super.bq(paramInt1, paramInt2);
  }

  public boolean zX()
  {
    K.info("Purgation de peine terminée");
    super.zX();
    aHT();

    dIH localdIH = new dIH();
    localdIH.cb(10006703);
    byv.bFN().aJK().d(localdIH);

    return false;
  }

  public void aHT() {
    K.info("Purgation de peine stoppée");
    byz localbyz = byv.bFN().bFO();
    ((ctE)localbyz.cJf()).HR();
    dLE.doY().t("jailFlag", null);
    if (byv.bFN().c(bJL.bRp())) {
      byv.bFN().b(bJL.bRp());
    }
    dka.cSF().j(this);
  }

  public void aHU() {
    K.info("Purgation de peine démarrée avec une durée de " + getRemainingTime() + "ms");
    dLE.doY().t("jailFlag", this.dKL);
    if (!byv.bFN().c(bJL.bRp()))
      byv.bFN().a(bJL.bRp());
  }

  public void aHV()
  {
    dLE.doY().a(this.dKL, new String[] { "remainingTime" });
  }
}