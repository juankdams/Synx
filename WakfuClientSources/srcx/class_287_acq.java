import java.awt.geom.Point2D.Float;
import java.net.URL;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class acq extends aka
  implements doT
{
  private static final Logger K = Logger.getLogger(acq.class);
  public static final String cRK = "poissonDisk";
  public static final String TAG = "map";
  public static final String cRL = "internalPopup";
  public static final String cRM = "internalPopupTextView";
  public static final String cRN = "internalPopupTextEditor";
  public static final String cRO = "internalPopupValid";
  public static final String cRP = "internalPopupCancel";
  private pi cRQ;
  private dDq cRR;
  private int cRS;
  private int cRT;
  private int cRU;
  private int cRV;
  private doN cRW;
  private Vo cRX;
  private boolean cRY;
  private uz cRZ;
  private boolean cSa;
  private boolean cSb;
  private boolean cSc;
  private boolean cQo;
  private boolean aKY;
  private final ArrayList cSd;
  public static final int cSe = "knownMaps".hashCode();

  public acq()
  {
    this.cRY = true;

    this.cSd = new ArrayList();
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
  }

  public void a(dSg paramdSg)
  {
    this.cSd.add(paramdSg);
  }

  public void setMapBackgroundPixmap(dDq paramdDq)
  {
    this.cRR = paramdDq;
    this.aKY = true;
    setNeedsToPreProcess();
  }

  public Point2D.Float getMapWidgetZoom() {
    if (this.cRR == null) {
      return new Point2D.Float(1.0F, 1.0F);
    }
    float f1 = (this.cRU - this.cRS) / this.cRR.getWidth();
    float f2 = (this.cRV - this.cRT) / this.cRR.getHeight();
    float f3 = getWidth() / f1;
    float f4 = getHeight() / f2;

    float f5 = f3 / this.cRR.getWidth();
    float f6 = f4 / this.cRR.getHeight();
    K.info("width ratio = " + f5);
    K.info("height ratio = " + f6);

    return new Point2D.Float(f5, f6);
  }

  public dDq getMapBackgroundPixmap() {
    return this.cRR;
  }

  public int getMapBackgroundStartX() {
    return this.cRS;
  }

  public int getMapBackgroundStartY() {
    return this.cRT;
  }

  public int getMapBackgroundEndX() {
    return this.cRU;
  }

  public int getMapBackgroundEndY() {
    return this.cRV;
  }

  public void setMapBackgroundStartX(int paramInt) {
    this.cRS = paramInt;
  }

  public void setMapBackgroundStartY(int paramInt) {
    this.cRT = paramInt;
  }

  public void setMapBackgroundEndX(int paramInt) {
    this.cRU = paramInt;
  }

  public void setMapBackgroundEndY(int paramInt) {
    this.cRV = paramInt;
  }

  public void setPixmap(aAR paramaAR) {
    if (paramaAR == null) {
      return;
    }
    String str = paramaAR.getName();
    if ((str == null) || (!str.equals("poissonDisk"))) {
      return;
    }
    dDq localdDq = paramaAR.getPixmap();
    if ((localdDq != null) && (localdDq.dfm()))
      localdDq.dfn();
  }

  public void setModulationColor(bNa parambNa)
  {
  }

  public bNa getModulationColor() {
    return null;
  }

  public String getTag()
  {
    return "map";
  }

  public void setKnownMaps(int[] paramArrayOfInt)
  {
  }

  protected void setMeshCenter()
  {
  }

  protected void a(String paramString, URL paramURL, K paramK)
  {
    this.cRZ = atz.a(paramK, paramURL, paramString);
  }

  protected void oU()
  {
    this.cSb = true;
    this.cSc = true;
    this.cQo = true;
    super.oU();
  }

  protected void a(atz paramatz, uz paramuz)
  {
    super.a(paramatz, paramuz);
    aoK();
    this.aKY = true;
  }

  private void aoK() {
    if (this.cRR != null) {
      float f1 = (this.cRU - this.cRS) / this.cRR.getWidth();
      float f2 = (this.cRV - this.cRT) / this.cRR.getHeight();

      float f3 = this.dkr / f1;
      float f4 = this.dks / f2;
      float f5 = -f3 * this.cRS / this.cRR.getWidth();
      float f6 = -f4 * this.cRT / this.cRR.getHeight();

      ((cAY)this.dkt).C((int)f5, (int)f6, (int)f3, (int)f4);
    }
  }

  protected void setBaseMapDisplayer()
  {
    ((cAY)this.dkt).setMapDisplayer(new cOs());
  }

  public void setMapRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setMapRect(paramInt1, paramInt2, paramInt3, paramInt4);
    aoK();
  }

  public void setAllMapZonesVisible(boolean paramBoolean) {
    this.cRY = paramBoolean;

    ((cAY)this.dkt).hS((this.cRY) && (this.cRX.aiC()));
    this.dku = true;
    setNeedsToPostProcess();
  }

  public void setMapZoneVisibleById(int paramInt, boolean paramBoolean) {
    if (!this.cRX.h(paramInt, paramBoolean)) {
      K.info("Impossible de trouver la zone d'id " + paramInt);
    }

    this.dku = true;
    setNeedsToPostProcess();
  }

  public void setPlayerMapZone(int paramInt1, int paramInt2) {
    this.cRX.setPlayerMapZone(paramInt1, paramInt2);
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg instanceof bXR;
  }

  public dRn getSelectedMapZone() {
    return this.cRX.getSelectedMapZone();
  }

  public void aiA()
  {
    this.cRX.aiA();
    this.cSa = true;
    setNeedsToPostProcess();
  }

  public void gZ(int paramInt) {
    this.cRX.gZ(paramInt);

    this.cSa = true;
    setNeedsToPostProcess();
  }

  private void aiD() {
    this.cRX.aiD();
    this.cSa = false;
    this.dku = true;
  }

  public void a(aQI paramaQI) {
    ZT localZT = Vo.a(paramaQI, this.dka, this.dkp, this.dkq);

    this.cRX.a(paramaQI.getId(), localZT);
    ((cAY)this.dkt).b(paramaQI.getId(), localZT);

    this.dku = true;
    setNeedsToPostProcess();
  }

  protected void aO(int paramInt1, int paramInt2)
  {
    super.aO(paramInt1, paramInt2);

    int i = oU.bV(paramInt1);
    int j = oU.bW(paramInt2);

    this.cRX.aH(i, j);
  }

  public void validate()
  {
    super.validate();

    this.cSc = true;

    this.cRX.aiB();
    int i = 0; for (int j = this.cSd.size(); i < j; i++)
      ((dSg)this.cSd.get(i)).bIq();
  }

  private boolean rf()
  {
    if (this.cQo) {
      Or localOr = bsP.getInstance().getSize();
      boolean bool = false;

      float f1 = localOr.width * 0.9F;
      float f2 = localOr.height * 0.9F;

      float f3 = f1 / f2;

      float f4 = 2.0F;

      if (f3 >= 2.0F)
        f1 = f2 * 2.0F;
      else {
        f2 = f1 / 2.0F;
      }

      if ((this.haL == null) || (this.haL.width != f1) || (this.haL.height != f2))
      {
        setMinSize(new Or((int)f1, (int)f2));
        bool = true;
      }

      this.cQo = false;
      return bool;
    }

    return false;
  }

  private void aoL() {
    if (!this.cSc) {
      return;
    }
    if (this.czl == null) {
      return;
    }

    float f2 = this.czl.getContentWidth() / this.dkr;
    float f3 = this.czl.getContentHeight() / this.dks;

    float f1 = Math.min(f2, f3);

    setMinZoom(f1);
    setMaxZoom(f1);

    this.cSc = false;
    this.dku = true;

    float f4 = -this.dkp * this.dka;
    float f5 = -this.dkq * this.dka;

    float f6 = this.dkk.t(f4, f5);
    float f7 = this.dkk.u(f4, f5);

    setIsoCenterX(f6);
    setIsoCenterY(f7);
    setIsoCenterZ(0.0F);
  }

  private void aoM() {
    this.cRX.e(this.dka, this.dkp, this.dkq);

    this.dku = true;
    this.cSb = false;
  }

  protected void oV()
  {
    cSR localcSR = new cSR();
    bjI localbjI = new bjI();
    this.cRX.a(this.dka, localcSR, localbjI);

    super.oV();
    ((cAY)this.dkt).d(localcSR);
    ((cAY)this.dkt).c(localbjI);
    ((cAY)this.dkt).hS((this.cRY) && (this.cRX.aiC()));
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if ((this.cQo) && 
      (rf()) && (this.meE != null)) {
      this.meE.cfM();
      setNeedsToPostProcess();
    }

    if (this.aKY) {
      int i = (this.cRR != null) && (this.cRR.hN().gI()) ? 1 : 0;
      int j = ((this.bQC != null) && (this.bQC.hN().gI())) || (this.dkd) ? 1 : 0;
      int k = (this.cRZ == null) || (this.cRZ.gI()) ? 1 : 0;

      if ((i == 0) || (j == 0) || (k == 0)) {
        return true;
      }

      if (this.bQC != null)
        ((cAY)this.dkt).setPixmap(this.bQC);
      ((cAY)this.dkt).h(this.cRZ);

      if (this.cRR != null) {
        ((cAY)this.dkt).p(this.cRR);
      }

      for (int m = this.cSd.size() - 1; m >= 0; m--) {
        ((dSg)this.cSd.get(m)).bIp();
      }

      this.aKY = false;

      this.dku = true;

      setNeedsToPreProcess();
      setNeedsToPostProcess();
    }

    return bool;
  }

  public boolean r(int paramInt)
  {
    boolean bool = super.r(paramInt);

    if (this.aKY) {
      return bool;
    }
    if (this.cSa) {
      aiD();
    }

    if (this.cSc) {
      aoL();
    }

    if (this.cSb) {
      aoM();
    }

    if (this.dku) {
      axq();
    }

    return bool;
  }

  public void bc()
  {
    super.bc();

    this.cSd.clear();

    this.cRX.clear();
    this.cRX = null;

    ajT.axh().a(this.cRQ, true);

    bsP.getInstance().b(CH.bGJ, this.cRW, false);
    this.cRW = null;
  }

  public void aJ()
  {
    super.aJ();

    bXR localbXR = new bXR();
    localbXR.aJ();
    localbXR.setWidget(this);
    a(localbXR);

    setLayoutManager(null);

    this.dkt = new cAY();
    ((cAY)this.dkt).aJ();

    ((cAY)this.dkt).setModulationColor(new bNa(bNa.gRx));

    this.cRX = new Vo((cAY)this.dkt);

    this.cRY = true;

    this.cSa = false;
    this.aKY = false;

    this.djX = false;

    this.cRQ = new pi(this);
    ajT.axh().a(this.cRQ);

    this.cRW = new cFr(this);

    bsP.getInstance().a(CH.bGJ, this.cRW, false);
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == cSe)
      setKnownMaps((int[])paramObject);
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}