import java.util.List;
import org.apache.log4j.Logger;

public class cmT
  implements cvW
{
  private static final Logger K = Logger.getLogger(cmT.class);

  private static final cmT hSs = new cmT();
  private Su aWG;
  private Runnable hSt;
  private dOc bJM;
  private boolean hSu = false;
  private alP cdb;
  private ZG hSv = null;

  public static cmT cnA()
  {
    return hSs;
  }

  private void x(int paramInt, boolean paramBoolean) {
    if (this.hSu) {
      return;
    }
    this.hSu = true;

    synchronized (hSs) {
      if (this.bJM == null) {
        return;
      }
      int i = 0;
      if ((!paramBoolean) && (paramInt != -1)) {
        localObject1 = "list#" + paramInt + ".image";
        czv localczv = (czv)this.bJM.getElementMap().fi((String)localObject1);
        if (localczv != null) {
          Jg localJg = localczv.getAppearance();
          localJg.a(new gm(bNa.gRx, bNa.gRu, localJg, 0, 250, 8, true, ddp.kWG));
        }
        i = 1300;
      }

      Object localObject1 = new dHx(this.bJM.getX(), this.bJM.getY(), bsP.getInstance().getWidth(), this.bJM.getY(), this.bJM, i, 250, ddp.kWG);

      ((dHx)localObject1).a(new cxb(this));

      this.bJM.a((cKq)localObject1);
    }
  }

  private void cnB() {
    try {
      if (this.hSv != null) {
        this.hSv.bH(true);
        this.hSv.q(0.0F, 500.0F);
        this.hSv = null;
      }
      if (this.aWG.aeI())
        cnC();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  private void cnC() {
    byz localbyz = byv.bFN().bFO();
    eB localeB = localbyz.aeQ().aDp().bPN();
    aWc.blo().eO(600124L);
    List localList = localeB.t(localbyz.getId());
    if (localList.isEmpty())
      return;
    c((dpI)localList.get(0), false);
  }

  private void c(dpI paramdpI, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    arl localarl = localbyz.aeQ();
    if (localarl == null) {
      return;
    }
    if (paramdpI == null) {
      x(-1, paramBoolean);
    } else {
      i(paramdpI);
      y(paramdpI.yR(), paramBoolean);
    }
  }

  public void y(int paramInt, boolean paramBoolean) {
    if (this.aWG == null)
      return;
    arl localarl = this.aWG.aeQ();
    if (localarl == null) {
      return;
    }
    dpI localdpI = localarl.aDp().bPN().aE(paramInt);
    bSo[] arrayOfbSo = (bSo[])dLE.doY().rv("fight.timePointAvailableBonuses");
    int i = 0;
    while ((i < arrayOfbSo.length) && 
      (arrayOfbSo[i].agC().yR() != localdpI.yR())) {
      i++;
    }

    x(i, paramBoolean);
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 18105:
      if (!this.aWG.adL().aeI()) {
        return false;
      }
      bbl localbbl = (bbl)paramcWG;

      dpa localdpa = this.aWG.adI();
      localdpa.b(localbbl.bpx());

      c(localbbl.bpx().agC(), true);

      aWc.blo().eO(600124L);

      return false;
    }

    return true;
  }

  public Su xg() {
    return this.aWG;
  }

  public void aR(Su paramSu) {
    this.aWG = paramSu;

    bSo[] arrayOfbSo = this.aWG.aeQ().aDp().aY(this.aWG.getId());
    dLE.doY().t("fight.timePointAvailableBonuses", arrayOfbSo);

    dLE.doY().t("fight.timePointSelectionChooser", paramSu);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  private void i(dpI paramdpI) {
    dBA localdBA = new dBA();
    localdBA.X(this.aWG.getId());
    localdBA.Cp(paramdpI.yR());
    byv.bFN().aJK().d(localdBA);
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dLE.doY().t("fight.timePointBonusRemainingTime", Float.valueOf(1.0F));
      this.hSt = new cFU(this);
      this.hSu = false;

      long l = 8208L;
      if (this.aWG.aeI()) {
        l |= 256L;
      }
      this.bJM = ((dOc)cBQ.cxL().a("timePointBonusSelectionDialog", VV.dJ("timePointBonusSelectionDialog"), l, (short)10000));

      this.bJM.setX(bsP.getInstance().getWidth());
      this.cdb = ((alP)this.bJM.getElementMap().fi("progressBar"));
      this.cdb.setInitialValue(1.0F);

      cBQ.cxL().j("wakfu.timePointSelection", aQW.class);

      dka.cSF().a(new cxc(this), 200L, 1);

      aKj.bbx().dw(false);

      if (this.aWG == byv.bFN().bFO()) {
        aWc.blo().eO(600123L);
        this.hSv = aWc.blo().g(600126L, true);
      }

      this.cdb.setTweenDuration(7000L);
      this.cdb.setValue(0.0F);

      dka.cSF().a(this.hSt, 7000L, 1);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      synchronized (hSs) {
        this.bJM = null;
        cBQ.cxL().mW("timePointBonusSelectionDialog");

        cBQ.cxL().mN("wakfu.timePointSelection");

        dka.cSF().j(this.hSt);
      }

      if (this.hSv != null) {
        this.hSv.q(0.0F, 500.0F);
        this.hSv.bH(true);
        this.hSv = null;
      }

      this.cdb = null;
      this.aWG = null;
    }
  }
}