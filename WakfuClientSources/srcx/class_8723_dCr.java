import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dCr
  implements cvW
{
  private static final Logger K = Logger.getLogger(dCr.class);

  private static final dCr lKK = new dCr();
  private bnm N;
  private long hXX;
  private Runnable hXY;
  private anG bxb;
  private anG lKL;
  private anG lKM;
  private cst bxc = new cst();
  private dRn lKN;

  public static dCr deY()
  {
    return lKK;
  }

  public boolean a(cWG paramcWG)
  {
    float f;
    switch (paramcWG.getId()) {
    case 16584:
      bzu localbzu1 = (bzu)paramcWG;
      cCZ.cyZ().l(localbzu1.af(), localbzu1.getBooleanValue());
      return false;
    case 16581:
      f = cCZ.cyZ().getZoomScale() + 0.1F;
      cCZ.cyZ().setZoomScale(Math.max(f, 1.0F));
      return false;
    case 16582:
      f = cCZ.cyZ().getZoomScale() - 0.1F;
      cCZ.cyZ().setZoomScale(Math.min(0.0F, f));
      return false;
    case 16583:
      bzu localbzu2 = (bzu)paramcWG;
      cCZ.cyZ().setZoomScale((float)localbzu2.getDoubleValue());
      return false;
    }

    return true;
  }

  public final void a(cVW paramcVW)
  {
    acq localacq = (acq)paramcVW.cIl();
    dRn localdRn = localacq.getSelectedMapZone();
    if (this.lKN == localdRn) {
      return;
    }
    this.lKN = localdRn;

    if (this.lKN == null) {
      bsP.getInstance().getPopupContainer().hide();
      return;
    }

    aHN localaHN = (aHN)localdRn.dsj();
    String str = localaHN.aqW();
    if ((str != null) && (str.length() > 0)) {
      dLE.doY().t("mapPopupDescription", str);
      try {
        dLE.doY().t("currentMapScrollDecoratorPath", String.format(ay.bd().getString("mapScrollDecoratorPath"), new Object[] { Byte.valueOf(localaHN.aiY()) }));
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage());
      }

      int i = localdRn.dsf();
      int j = localdRn.dsh();
      int k = localdRn.dsg();
      int m = localdRn.dsi();

      int n = (int)(i / 86.0F - j / 43.0F);
      int i1 = (int)-(i / 86.0F + j / 43.0F);
      int i2 = (int)(k / 86.0F - m / 43.0F);
      int i3 = (int)-(k / 86.0F + m / 43.0F);

      MD localMD1 = localacq.isoToScreen(n, i1, true);
      MD localMD2 = localacq.isoToScreen(i2, i3, true);

      int i4 = localMD2.getX() - localMD1.getX();
      int i5 = localMD2.getY() - localMD1.getY();

      this.bxc.wq(localMD1.getX() + localacq.getScreenX() - i4 / 2 + localacq.getAppearance().getContentWidth() / 2);
      this.bxc.wr(localMD1.getY() + localacq.getScreenY());
      this.bxc.setWidth(i4);
      this.bxc.setHeight(i5);

      this.lKM.b(this.bxc);
    }
  }

  public final void b(sV paramsV)
  {
    String str = paramsV.AB().getName();
    if ((!paramsV.AB().isEditable()) && ((str == null) || (str.length() == 0))) {
      return;
    }
    dLE.doY().t("mapPopupDescription", str);

    aka localaka = (aka)paramsV.cIl();

    this.bxc.wq(paramsV.Ax() + localaka.getScreenX() - paramsV.Az() / 2);
    this.bxc.wr(paramsV.Ay() + localaka.getScreenY() - paramsV.AA() / 2);
    this.bxc.setWidth(paramsV.Az());
    this.bxc.setHeight(paramsV.AA());

    if (this.bxc.getDisplayX() < bsP.getInstance().getWidth() / 2)
      this.bxb.b(this.bxc);
    else
      this.lKL.b(this.bxc);
  }

  public final boolean deZ() {
    return dLE.doY().getBooleanProperty("mapPopupIsEditing");
  }

  public final void kP(boolean paramBoolean) {
    dLE.doY().t("mapPopupIsEditing", Boolean.valueOf(paramBoolean));

    if (paramBoolean) {
      cpa localcpa = bsP.getInstance().getPopupContainer().getElementMap();
      if (localcpa != null)
        aTp localaTp = (aTp)localcpa.fi("textEditor");
    }
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

  public static void a(biy parambiy, float paramFloat) {
    Or localOr = parambiy.getPrefSize();
    if (localOr == null) {
      return;
    }
    parambiy.setSize((int)(localOr.width * paramFloat), (int)(localOr.height * paramFloat));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new cIi(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("landMarkGfxs", byv.bFN().bFO().bHp().cyq());
      dLE.doY().t("compassGfx", byv.bFN().bFO().bHp().cyr());

      cCZ.cyZ().a(new cGI());
      cCZ.cyZ().a(ajt.diK);

      cCZ.cyZ().bLS();

      cCZ.cyZ().bLJ();
      cCZ.cyZ().hU(WakfuClientInstance.awy().awB().a(bmz.fEI));

      cCZ.cyZ().bMn();

      this.bxb = qO("mapEditablePopup");
      this.lKL = qO("mapEditablePopup2");
      this.lKM = qO("completeMapPopup");

      dOc localdOc = (dOc)cBQ.cxL().a("mapDialog", VV.dJ("mapDialog"), 1L, (short)10000);
      if (localdOc == null)
        return;
      localdOc.setVisible(false);
      cpa localcpa = cBQ.cxL().coO().nf("mapDialog");
      if (localcpa != null) {
        acq localacq = (acq)localcpa.fi("map");
        localacq.a(new cIk(this, localdOc));

        cCZ.cyZ().a(localacq);
      }

      cCZ.cyZ().ct(byv.bFN().bFO().Lk());
      this.bxc.e(localcpa);

      bmh.reset();
      cBQ.cxL().j("wakfu.map", bmh.class);

      aWc.blo().eO(600021L);

      coN();

      kP(false);

      this.hXY = new cIm(this);

      dka.cSF().a(this.hXY, 30000L, -1);
    }
  }

  private anG qO(String paramString) {
    cBQ.cxL().a(paramString, VV.dJ(paramString), 8200L, (short)10000);

    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa != null) {
      return (anG)localcpa.fi("popup");
    }
    return null;
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("mapDialog");
      cBQ.cxL().mW("mapEditablePopup");
      cBQ.cxL().mW("mapEditablePopup2");
      cBQ.cxL().mW("completeMapPopup");

      this.bxb = null;
      this.lKL = null;
      this.lKM = null;
      this.bxc.e(null);

      dLE.doY().removeProperty("landMarkGfxs");

      cCZ.cyZ().a(null);
      dlw.cTl().cTn();

      bmh.setCurrentWorldPositionMarker(null);
      bmh.setCurrentNote(null);

      cBQ.cxL().mN("wakfu.map");

      aWc.blo().eO(600022L);

      dGx.dhr().unlock();

      dka.cSF().j(this.hXY);
      this.hXY = null;

      bmh.reset();
    }
  }
}