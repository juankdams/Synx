import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class coX
  implements cvW
{
  private static final Logger K = Logger.getLogger(coX.class);

  private static coX hXW = new coX();
  private bnm N;
  private long hXX = 0L;
  private Runnable hXY;
  private anG bxb = null;
  private cst bxc = new cst();
  private cAK hXZ;

  public static coX coM()
  {
    return hXW;
  }

  public void c(cAK paramcAK) {
    this.hXZ = paramcAK;
    ajt.diJ.gO(paramcAK.getId());

    byv.bFN().a(this);
  }

  public boolean a(cWG paramcWG)
  {
    float f1;
    float f2;
    bzu localbzu2;
    switch (paramcWG.getId()) {
    case 16584:
      bzu localbzu1 = (bzu)paramcWG;
      cCZ.cyZ().l(localbzu1.af(), localbzu1.getBooleanValue());

      return false;
    case 16581:
      f1 = cCZ.cyZ().getZoomScale();
      f2 = f1 + 0.1F;
      f1 = 1.0F < f2 ? 1.0F : f2;
      cCZ.cyZ().setZoomScale(f1);

      return false;
    case 16582:
      f1 = cCZ.cyZ().getZoomScale();
      f2 = f1 - 0.1F;
      f1 = 0.0F > f2 ? 0.0F : f2;
      cCZ.cyZ().setZoomScale(f1);

      return false;
    case 16583:
      localbzu2 = (bzu)paramcWG;

      cCZ.cyZ().setZoomScale((float)localbzu2.getDoubleValue());

      return false;
    case 19312:
      localbzu2 = (bzu)paramcWG;
      long l = localbzu2.ah();
      dhD localdhD = aot.dtv.cX(l);
      if (localdhD == null) {
        K.warn("On essaye de se téléporter sur une drago d'id inconnue ?");
        return false;
      }
      byz localbyz = byv.bFN().bFO();
      dOy localdOy = bDk.bLI().cr(localbyz.Lk()).mrY;
      int i = localdOy == dOy.mgi ? 0 : 0;
      if (localbyz.JE() < i) {
        cBQ.cxL().a(bU.fH().getString("error.notEnoughKamas"), Cn.et(1), 3L, 102, 1);
      }
      else
      {
        cKX localcKX = cBQ.cxL().a(bU.fH().getString("drago.confirmTravel", new Object[] { Integer.valueOf(i) }), Cn.et(0), 2073L, 102, 1);

        if (localcKX != null) {
          localcKX.a(new bzz(this, localbyz, l));

          return false;
        }
      }

      return false;
    }

    return true;
  }

  public final void b(sV paramsV) {
    String str = null;
    if ((paramsV.AB().getValue() instanceof brS)) {
      localObject = (brS)paramsV.AB().getValue();
      if (((brS)localObject).dYr == 47) {
        lZ locallZ = new lZ();
        locallZ.tz().a(bU.fH().b(82, (int)((brS)localObject).aTz, new Object[0])).tA();
        bva localbva = byJ.gma.cF((int)paramsV.AB().cKl(), (int)paramsV.AB().cKm());
        if (localbva != null) {
          ayn localayn = (ayn)localbva.boT();
          if (localayn != null) {
            locallZ.tH();
            aWN.a(locallZ, localayn);
          }
        }
        str = locallZ.tP();
      }
    }

    if (str == null) {
      str = paramsV.AB().getName();
    }

    dLE.doY().t("mapPopupDescription", str);

    Object localObject = (aka)paramsV.cIl();

    this.bxc.wq(paramsV.Ax() + ((aka)localObject).getScreenX() - paramsV.Az() / 2);
    this.bxc.wr(paramsV.Ay() + ((aka)localObject).getScreenY() - paramsV.AA() / 2);
    this.bxc.setWidth(paramsV.Az());
    this.bxc.setHeight(paramsV.AA());

    this.bxb.b(this.bxc);
  }

  public final void hidePopup()
  {
    bsP.getInstance().getPopupContainer().hide();
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  private void coN() {
    long l = System.currentTimeMillis();
    if (l - this.hXX > 30000L) {
      this.hXX = l;
      aCK localaCK = new aCK();
      byv.bFN().aJK().d(localaCK);
    }
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (byv.bFN().c(dCr.deY())) {
        byv.bFN().b(dCr.deY());
      }

      this.N = new bzC(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("landMarkGfxs", byv.bFN().bFO().bHp().cyq());

      cCZ.cyZ().a(ajt.diJ);
      cCZ.cyZ().a(new aub());

      cCZ.cyZ().bLJ();
      cCZ.cyZ().hU(WakfuClientInstance.awy().awB().a(bmz.fEI));

      cCZ.cyZ().czg();
      cCZ.cyZ().ct(byv.bFN().bFO().Lk());
      cCZ.cyZ().b(dGc.lQC);

      cBQ.cxL().a("dragoMapPopup", VV.dJ("dragoMapPopup"), 8200L, (short)10000);

      cpa localcpa = cBQ.cxL().coO().nf("dragoMapPopup");
      if (localcpa != null) {
        this.bxb = ((anG)localcpa.fi("popup"));
      }

      dOc localdOc = (dOc)cBQ.cxL().a("dragoMapDialog", VV.dJ("dragoMapDialog"), 1L, (short)10000);
      localcpa = cBQ.cxL().coO().nf("dragoMapDialog");
      if (localcpa != null) {
        biy localbiy = (biy)localcpa.fi("closeMapButton");

        acq localacq = (acq)localcpa.fi("map");
        localacq.a(new bzB(this, localdOc, localacq, localbiy));

        cCZ.cyZ().a(localacq);
      }
      this.bxc.e(localcpa);

      cFe.reset();
      cBQ.cxL().j("wakfu.dragoMap", cFe.class);

      aWc.blo().eO(600021L);

      coN();

      this.hXY = new bzD(this);

      dka.cSF().a(this.hXY, 30000L, -1);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("dragoMapDialog");
      cBQ.cxL().mW("dragoMapPopup");

      this.bxb = null;
      this.bxc.e(null);

      dLE.doY().removeProperty("landMarkGfxs");

      cCZ.cyZ().a(null);
      dlw.cTl().cTn();

      cFe.setCurrentWorldPositionMarker(null);
      cFe.setCurrentNote(null);

      cBQ.cxL().mN("wakfu.dragoMap");

      aWc.blo().eO(600022L);

      dGx.dhr().unlock();

      dka.cSF().j(this.hXY);
      this.hXY = null;

      cFe.reset();

      cCZ.cyZ().czg();

      this.hXZ = null;
    }
  }
}