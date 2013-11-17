import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

public abstract class aka extends bXx
{
  private static final int djS = 200;
  private static final cgR djT;
  protected EntityGroup djU;
  private bSi djV;
  private cJN djW;
  protected boolean djX;
  private final cIj djY;
  private boolean djZ;
  protected float dka;
  protected float cUi;
  protected float cUh;
  protected float dkb;
  private boolean dkc;
  protected boolean dkd;
  protected cYp dke;
  private final aJP dkf;
  private final aJP dkg;
  private final aJP dkh;
  private final HashMap bhQ;
  private final aGe dki;
  private boolean dkj;
  protected adG dkk;
  protected boolean dkl;
  protected boolean dkm;
  private float dkn;
  private boolean dko;
  protected float dkp;
  protected float dkq;
  protected float dkr;
  protected float dks;
  protected dDq bQC;
  protected bah dkt;
  protected boolean dku;
  public static final int cs = "content".hashCode();
  public static final int dkv = "compassContent".hashCode();
  public static final int dkw = "landMarkContent".hashCode();
  public static final int dkx = "isoCenterX".hashCode();
  public static final int dky = "isoCenterY".hashCode();
  public static final int dkz = "isoCenterZ".hashCode();
  public static final int dkA = "isoMap".hashCode();
  public static final int dkB = "maxZoom".hashCode();
  public static final int dkC = "minZoom".hashCode();
  public static final int dkD = "tooltipHotPoint".hashCode();
  public static final int dkE = "zoomScale".hashCode();
  public static final int dkF = "onMapClick".hashCode();
  public static final int dkG = "onMapDoubleClick".hashCode();
  public static final int dkH = "onMapMove".hashCode();
  public static final int dkI = "enableTooltip".hashCode();
  public static final int dkJ = "landMarkZoom".hashCode();
  public static final int dkK = "mapPath".hashCode();

  public aka()
  {
    this.djV = bSi.hcG;

    this.djX = true;

    this.djY = new cIj();

    this.dka = 1.0F;
    this.cUi = 1.0F;
    this.cUh = 1.0F;
    this.dkb = 1.0F;

    this.dkf = new aJP();
    this.dkg = new aJP();
    this.dkh = new aJP();

    this.bhQ = new HashMap();
    this.dki = new aGe();
  }

  private boolean a(EntitySprite paramEntitySprite, avz paramavz)
  {
    uz localuz = getMeshTexture(paramavz.gN());
    if (localuz != null) {
      if (localuz.isEmpty()) {
        return false;
      }
      cSJ localcSJ = localuz.wn(0);
      MD localMD = localuz.cqv();
      int i = localMD.getX();
      int j = localMD.getY();
      paramEntitySprite.setTexture(localuz);
      paramEntitySprite.i(0.0F, 0.0F, j / localcSJ.getHeight(), i / localcSJ.getWidth());
    }

    return true;
  }

  private void a(adG paramadG, dwn paramdwn, EntitySprite paramEntitySprite1, EntitySprite paramEntitySprite2, float paramFloat1, float paramFloat2, cYm paramcYm, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!paramdwn.isVisible()) {
      return;
    }

    if (paramdwn.dr(0.05F)) {
      paramdwn.cU(getIsoValue(paramdwn.cKl(), paramdwn.dbw(), paramBoolean2));
      paramdwn.cV(getIsoValue(paramdwn.cKm(), paramdwn.dbv(), paramBoolean2));
      paramdwn.dq(getIsoValue(paramdwn.dbr(), paramdwn.dbx(), paramBoolean2));
    }

    int i = (this.dke != null) && (this.dke.aVb == paramEntitySprite1) ? 1 : 0;

    int j = 3; int k = 3;
    int m = 3;
    int n = (this.dko) && (paramdwn.dbt() != null) ? 1 : 0;
    avz localavz1 = n != 0 ? paramdwn.dbt() : paramdwn.dbs();

    if ((localavz1 != null) && (a(paramEntitySprite1, localavz1))) {
      MD localMD1 = paramEntitySprite1.hN().cqv();
      j = localMD1.getX();
      k = m = localMD1.getY();
    } else {
      return;
    }

    int i1 = 3;
    int i2 = 3;
    int i3 = 3;

    avz localavz2 = paramdwn.dbu();
    if ((localavz2 != null) && (a(paramEntitySprite2, localavz2))) {
      paramEntitySprite2.setVisible(true);
      MD localMD2 = paramEntitySprite2.hN().cqv();
      i1 = localMD2.getX();
      i2 = i3 = localMD2.getY();
    } else {
      paramEntitySprite2.setVisible(false);
    }

    float f1 = paramadG.r(paramdwn.cKl(), paramdwn.cKm()) - paramcYm.getX();
    float f2 = paramadG.g(paramdwn.cKl(), paramdwn.cKm(), paramdwn.dbr()) - paramcYm.getY();

    int i8 = (int)(f1 + getAppearance().getContentWidth() / 2.0F);
    int i9 = (int)(f2 + getAppearance().getContentHeight() / 2.0F);
    boolean bool = getAppearance().bQ(i8, i9);
    int i6;
    int i4;
    int i7;
    int i5;
    if ((!bool) && (paramBoolean1)) {
      i4 = i6 = getAppearance().getOnScreenX(i8, i9) - (int)(getAppearance().getContentWidth() / 2.0F);
      i5 = i7 = getAppearance().getOnScreenY(i8, i9) - (int)(getAppearance().getContentHeight() / 2.0F);
    } else {
      i4 = i6 = (int)f1;
      i5 = i7 = (int)f2;
    }

    if ((i != 0) && (paramdwn.dbA())) {
      j = (int)(j * 1.2D);
      k = (int)(k * 1.2D);
      i1 = (int)(i1 * 1.2D);
      i2 = (int)(i2 * 1.2D);
    }

    if (n == 0) {
      j = (int)(j * this.dkn);
      k = (int)(k * this.dkn);
      i1 = (int)(i1 * this.dkn);
      i2 = (int)(i2 * this.dkn);
    }

    i4 -= (int)(j * localavz1.aHw());
    i5 += (int)(k * localavz1.aHx());

    if (localavz2 != null) {
      i6 -= (int)(i1 * localavz2.aHw());
      i7 = i5 - 1;
    }

    paramEntitySprite1.c((int)(paramFloat2 + i5), (int)(paramFloat1 + i4), j, k);
    paramEntitySprite2.c((int)(paramFloat2 + i7), (int)(paramFloat1 + i6), i1, i2);

    float[] arrayOfFloat = paramdwn.ckE();
    float f3 = 1.0F;
    if ((arrayOfFloat != null) && (arrayOfFloat.length == 4)) {
      f3 = arrayOfFloat[3] * ((paramBoolean1) && (!bool) ? 0.5F : 1.0F);
    }

    XulorParticleSystem localXulorParticleSystem = this.dki.f(paramdwn);
    if (localXulorParticleSystem != null) {
      int i10 = k - m;
      localXulorParticleSystem.j(paramFloat1 + f1, paramFloat2 + f2 + i10);
    }

    if ((paramBoolean1) || (bool)) {
      bkk localbkk = Pb.aaU().aaV();
      if (localbkk.pZ(cmL.hRR)) {
        if (paramdwn.dbB()) {
          paramEntitySprite1.a(localbkk, cmL.hRR, null);
          paramEntitySprite2.a(localbkk, cmL.hRR, null);
        } else {
          paramEntitySprite1.a(Pb.aaU().aaV(), cmL.hRG, djT);
          paramEntitySprite2.a(Pb.aaU().aaV(), cmL.hRG, djT);
        }
      }
      else if (paramdwn.dbB()) {
        f3 *= 0.5F;
      }

      paramEntitySprite1.setColor(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], f3);
      paramEntitySprite2.setColor(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], f3);
      this.djU.d(paramEntitySprite1);
      this.djU.d(paramEntitySprite2);
      if (localXulorParticleSystem != null)
        localXulorParticleSystem.a(this.djU);
    }
  }

  private float getIsoValue(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.djY.getIsoValue(paramFloat1, paramFloat2, paramBoolean);
  }

  public void a(aNL paramaNL)
  {
    super.a(paramaNL);
  }

  protected void rd()
  {
    this.bqm.d(this.dkt.getEntity());

    this.bqm.d(this.djU);
    super.rd();
  }

  public boolean isDisplayPoints()
  {
    return this.dkl;
  }

  public void setDisplayPoints(boolean paramBoolean) {
    this.dkl = paramBoolean;
  }

  public boolean isDisplayCompass() {
    return this.dkm;
  }

  public void setDisplayCompass(boolean paramBoolean) {
    this.dkm = paramBoolean;
  }

  public float getIsoCenterX() {
    return this.djY.getIsoCenterX();
  }

  public void setIsoCenterX(float paramFloat) {
    this.djY.setIsoCenterX(paramFloat);
  }

  public float getIsoCenterY() {
    return this.djY.getIsoCenterY();
  }

  public void setIsoCenterY(float paramFloat) {
    this.djY.setIsoCenterY(paramFloat);
  }

  public float getIsoCenterZ() {
    return this.djY.getIsoCenterZ();
  }

  public void setIsoCenterZ(float paramFloat) {
    this.djY.setIsoCenterZ(paramFloat);
  }

  public boolean getEnableTooltip() {
    return this.djX;
  }

  public void setEnableTooltip(boolean paramBoolean) {
    this.djX = paramBoolean;
  }

  public float getZoom()
  {
    return this.dka;
  }

  public float getMinZoom()
  {
    return this.cUh;
  }

  public void setMinZoom(float paramFloat) {
    if ((paramFloat > 0.0F) && (paramFloat <= 1.0F)) {
      this.cUh = paramFloat;
      setZoom();
    }
  }

  public float getMaxZoom()
  {
    return this.cUi;
  }

  public void setMaxZoom(float paramFloat) {
    if ((paramFloat > 0.0F) && (paramFloat <= 1.0F)) {
      this.cUi = paramFloat;
      setZoom();
    }
  }

  public float getZoomScale()
  {
    return this.dkb;
  }

  public void setZoomScale(float paramFloat) {
    if ((paramFloat >= 0.0F) && (paramFloat <= 1.0F)) {
      this.dkb = paramFloat;
      setZoom();
    }
  }

  public bSi getTooltipHotPoint()
  {
    return this.djV;
  }

  public void setTooltipHotPoint(bSi parambSi)
  {
    this.djV = parambSi;
  }

  protected void setZoom() {
    this.dka = (this.cUh + (this.cUi - this.cUh) * this.dkb);
    if ((!bB) && ((this.dka <= 0.0F) || (this.dka > 1.0F))) throw new AssertionError();
    this.djY.setZoom(this.dka);

    this.dkk.ar(86.0F * this.dka);

    this.dkk.as(43.0F * this.dka * (this.djZ ? 1 : 2));
    this.dkk.at(10.0F * this.dka);

    this.dkt.C(this.dka);
    this.dku = true;
    setNeedsToPostProcess();
  }

  public boolean isIsoMap() {
    return this.djZ;
  }

  public void setIsoMap(boolean paramBoolean) {
    this.djZ = paramBoolean;
    setZoom();
  }

  private void setList(aJP paramaJP, ArrayList paramArrayList) {
    this.dki.a(paramaJP);
    paramaJP.D(paramArrayList);
  }

  public void d(dwn paramdwn) {
    this.dkh.g(paramdwn);
  }

  public void e(dwn paramdwn) {
    this.dkh.h(paramdwn);
    if (getOverItem() == paramdwn)
      setOverItem(null);
  }

  public void axn()
  {
    this.dkh.clear();
    setOverItem(null);
  }

  private uz getMeshTexture(String paramString)
  {
    uz localuz = (uz)this.bhQ.get(paramString);
    if (localuz != null) {
      return localuz;
    }

    localuz = atz.fK(paramString);
    this.bhQ.put(paramString, localuz);

    return localuz;
  }

  public dOc getWidget(int paramInt1, int paramInt2)
  {
    if ((this.fnH) || (bsP.getInstance().isMovePointMode())) {
      return null;
    }

    return super.getWidget(paramInt1, paramInt2);
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return paramJg != null;
  }

  public void setOnMapClick(blg paramblg) {
    a(CH.bGl, paramblg, true);
  }

  public void setOnMapDoubleClick(cnr paramcnr) {
    a(CH.bGm, paramcnr, true);
  }

  public void setOnMapMove(ajE paramajE) {
    this.dkc = true;
    a(CH.bGn, paramajE, true);
  }

  public dwn getOverItem() {
    return this.dke == null ? null : this.dke.aVa;
  }

  public EntitySprite getOverMesh() {
    return this.dke == null ? null : this.dke.aVb;
  }

  public float getLandMarkZoom() {
    return this.dkn;
  }

  public void setLandMarkZoom(float paramFloat) {
    this.dkn = paramFloat;
  }

  public boolean isUseAlternateTexture() {
    return this.dko;
  }

  public void setUseAlternateTexture(boolean paramBoolean) {
    this.dko = paramBoolean;
  }

  protected void axo()
  {
    this.dkj = true;
  }

  private boolean b(EntitySprite paramEntitySprite, int paramInt1, int paramInt2) {
    if (paramEntitySprite == null) {
      return false;
    }

    int i = paramInt1 - this.czl.getLeftInset();
    int j = paramInt2 - this.czl.getBottomInset();

    return (getAppearance().bQ(i, j)) && (nK.a(paramEntitySprite, paramInt1, paramInt2));
  }

  public dwn getItemUnderMouse(aJP paramaJP, ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    int i = a(paramaJP, paramInt1, paramInt2);
    if ((i < 0) || (i >= paramArrayList.size())) {
      return null;
    }

    return (dwn)paramArrayList.get(i);
  }

  private cYp getMapOverlayPointUnderMouse(int paramInt1, int paramInt2) {
    cYp localcYp = this.dkl ? getMapOverlayPointUnderMouse(this.dkf, paramInt1, paramInt2) : null;
    if (localcYp != null) {
      return localcYp;
    }

    localcYp = this.dkm ? getMapOverlayPointUnderMouse(this.dkg, paramInt1, paramInt2) : null;
    if (localcYp != null) {
      return localcYp;
    }

    return getMapOverlayPointUnderMouse(this.dkh, paramInt1, paramInt2);
  }

  private cYp getMapOverlayPointUnderMouse(aJP paramaJP, int paramInt1, int paramInt2) {
    int i = a(paramaJP, paramInt1, paramInt2);
    return paramaJP.mM(i);
  }

  private int a(aJP paramaJP, int paramInt1, int paramInt2) {
    for (int i = paramaJP.size() - 1; i >= 0; i--) {
      EntitySprite localEntitySprite = paramaJP.mK(i);
      if (b(localEntitySprite, paramInt1, paramInt2)) {
        return i;
      }
    }
    return -1;
  }

  protected void a(cYp paramcYp) {
  }

  protected void b(cYp paramcYp) {
  }

  protected void a(int paramInt, cYp paramcYp) {
  }

  protected void aO(int paramInt1, int paramInt2) {
  }

  public MD getIsoMousePosition() {
    int i = cyb.cvg().getX() - getScreenX();
    int j = cyb.cvg().getY() - getScreenY();

    cYm localcYm = getMouseToIso(i, j);
    return new MD((int)localcYm.getX(), (int)localcYm.getY());
  }

  private void setOverItem(cYp paramcYp) {
    if (this.dke != null) {
      this.dke.axl();
    }
    this.dke = paramcYp;
    if (this.dke != null)
      this.dke.gQ();
  }

  public void axp()
  {
    int i = cyb.cvg().getX() - getScreenX();
    int j = cyb.cvg().getY() - getScreenY();

    setOverItem(getMapOverlayPointUnderMouse(i, j));
  }

  void a(dMr paramdMr) {
    int i = paramdMr.y(this);
    int j = paramdMr.z(this);

    cYp localcYp = getMapOverlayPointUnderMouse(i, j);

    if (this.dke != localcYp) {
      if (this.dke != null) {
        b(this.dke);
        g(sV.a(paramdMr, this, CH.bGf, this.dke.aVa, this.dke.aVb));
        setOverItem(null);
      }

      if (localcYp != null) {
        a(localcYp);
        g(sV.a(paramdMr, this, CH.bGg, localcYp.aVa, localcYp.aVb));
        setOverItem(localcYp);
      }
    }

    cYm localcYm = getMouseToIso(i, j);
    aO((int)localcYm.getX(), (int)localcYm.getY());

    if (this.dkc) {
      cVW localcVW = cVW.a(paramdMr, localcYm.getX(), localcYm.getY(), this.dke != null ? this.dke.getValue() : null);
      localcVW.b(CH.bGn);
      g(localcVW);
    }
  }

  private cYm getMouseToIso(int paramInt1, int paramInt2) {
    int i = -this.czl.getLeftInset() - this.czl.getContentWidth() / 2;
    int j = -this.czl.getBottomInset() - this.czl.getContentHeight() / 2;

    return this.djY.b(this.dkk, paramInt1 + i, paramInt2 + j);
  }

  boolean b(dMr paramdMr) {
    if ((paramdMr.mp() != CH.bGw) && (paramdMr.mp() != CH.bGx))
    {
      return false;
    }

    int i = paramdMr.y(this);
    int j = paramdMr.z(this);
    CH localCH1;
    CH localCH2;
    if (paramdMr.mp() == CH.bGw) {
      localCH1 = CH.bGd;
      localCH2 = CH.bGl;
    } else {
      localCH1 = CH.bGe;
      localCH2 = CH.bGm;
    }

    if (this.dke != null) {
      localObject = sV.a(paramdMr, this, localCH1, this.dke.aVa, this.dke.aVb);
      g((cSx)localObject);
      a(paramdMr.getButton(), this.dke);
    }

    Object localObject = getMouseToIso(i, j);
    aO((int)((cYm)localObject).getX(), (int)((cYm)localObject).getY());

    cVW localcVW = cVW.a(paramdMr, ((cYm)localObject).getX(), ((cYm)localObject).getY(), this.dke != null ? this.dke.getValue() : null);
    localcVW.b(localCH2);
    g(localcVW);

    return false;
  }

  private void aji()
  {
    dxE localdxE = new dxE(this);

    a(CH.bGo, localdxE, false);

    dxX localdxX = new dxX(this);

    a(CH.bGw, localdxX, false);
    a(CH.bGx, localdxX, false);
  }

  public MD isoToScreen(int paramInt1, int paramInt2, boolean paramBoolean) {
    cYm localcYm = this.djY.a(this.dkk, paramInt1, paramInt2, paramBoolean);
    return new MD((int)localcYm.getX(), (int)localcYm.getY());
  }

  public void bc()
  {
    super.bc();

    this.djU.axl();
    this.djU = null;

    this.dkf.clear();
    this.dkh.clear();
    this.dkg.clear();

    this.djW.bc();
    this.djW = null;

    setOverItem(null);

    this.dki.clear();

    this.dkk.uninitialize();
    this.dkk = null;
    axr();

    if (this.dkt != null) {
      this.dkt.bc();
      this.dkt = null;
    }
  }

  protected final void axq() {
    if (!this.dku) {
      return;
    }
    if ((this.czl == null) || (this.czl.getContentWidth() == 0) || (this.czl.getContentHeight() == 0)) {
      return;
    }
    oV();

    axo();
    this.dku = false;
  }

  protected void oV() {
    this.dkt.a(this.haN, this.czl.getMargin(), this.czl.getBorder(), this.czl.getPadding());
  }

  protected final void axr() {
    if ((this.bQC != null) && (this.bQC.hN() != null)) {
      this.bQC.hN().axl();
    }
    this.bQC = null;
  }

  public void aJ()
  {
    super.aJ();

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    aId localaId = aId.checkOut();
    a(localaId);

    if ((!bB) && (this.djU != null)) throw new AssertionError();
    this.djU = ((EntityGroup)EntityGroup.ecY.bQy());
    this.djU.mnU = this;

    this.djU.dsE().a(new cxn());

    this.djW = new cJN();
    this.djW.aJ();

    this.djY.reset();

    this.djX = true;
    this.dkj = false;

    this.dkn = 1.0F;
    this.dko = false;

    aji();

    axs();

    setNonBlocking(false);
  }

  public void invalidate()
  {
    super.invalidate();
  }

  public void validate()
  {
    super.validate();
    this.djY.xX((int)(this.czl.getContentWidth() / this.dkk.apB()));
    this.dku = true;
  }

  public boolean r(int paramInt)
  {
    super.r(paramInt);

    this.dkk.setVisible(false);

    this.dkk.W(this.czl.getContentWidth(), this.czl.getContentHeight());
    this.dkk.MG().setX(getDisplayX() + this.czl.getLeftInset());
    this.dkk.MG().setY(getDisplayY() + this.czl.getBottomInset());
    this.dkk.cz(paramInt);

    return true;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    aka localaka = (aka)parambdj;

    localaka.setIsoCenterX(getIsoCenterX());
    localaka.setIsoCenterY(getIsoCenterY());
    localaka.setIsoCenterZ(getIsoCenterZ());
    localaka.setIsoMap(this.djZ);
    localaka.setMaxZoom(getMaxZoom());
    localaka.setMinSize(getMinSize());
    localaka.setTooltipHotPoint(getTooltipHotPoint());
    localaka.setZoomScale(getZoomScale());
    localaka.setEnableTooltip(getEnableTooltip());
  }

  private void axs()
  {
    if ((!bB) && (this.dkk != null)) throw new AssertionError();
    this.dkl = true;
    this.dkm = true;
    this.dkk = new dxW(this, adG.cUe, adG.cUg);

    this.dkk.ar(86.0F * this.dka);
    this.dkk.as(43.0F * this.dka);

    this.dkk.setVisible(false);
  }

  public void setMapPath(String paramString)
  {
    if (this.dkd) {
      return;
    }
    if (paramString == null) {
      return;
    }
    URL localURL;
    try
    {
      localURL = new URL(paramString);
    } catch (MalformedURLException localMalformedURLException) {
      K.error("URL invalide : " + paramString);
      return;
    }
    bwZ localbwZ;
    try {
      localbwZ = cBQ.h(localURL);
    } catch (Exception localException) {
      K.error("Problème lors de la lecture du fichier de map d'url : " + localURL);
      return;
    }

    axr();

    this.dkp = 0.0F;
    this.dkq = 0.0F;
    this.dkr = 0.0F;
    this.dks = 0.0F;

    setBaseMapDisplayer();

    ArrayList localArrayList = localbwZ.bEx().getChildren();
    int i = localArrayList.size();
    for (int j = 0; j < i; j++) {
      K localK = (K)localArrayList.get(j);
      atz localatz = atz.s(localK);
      if (localatz != null)
      {
        this.dkr = ((float)localatz.dEW);
        this.dks = ((float)localatz.dEX);
        this.dkp = ((float)localatz.dEU);
        this.dkq = ((float)localatz.dEV);

        uz localuz = atz.a((K)localArrayList.get(j), localURL);
        a(paramString, localURL, localK);
        if (localuz != null) {
          a(localatz, localuz);
        }
        this.dkt.cg((int)this.dkr, (int)this.dks);
        setMeshCenter();
      }
    }
    oU();
  }

  protected void oU() {
    setNeedsToPreProcess();
    setNeedsToPostProcess();
  }

  protected void setMeshCenter() {
  }

  protected void a(atz paramatz, uz paramuz) {
    this.bQC = paramatz.a(paramuz);
  }

  protected abstract void a(String paramString, URL paramURL, K paramK);

  protected abstract void setBaseMapDisplayer();

  public void setForceDisplayEntity(boolean paramBoolean) {
    this.dkd = paramBoolean;
  }

  public void setMapRect(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if ((!bB) && (!this.dkd)) throw new AssertionError();
    this.dkp = paramInt1;
    this.dkq = paramInt2;
    this.dkr = paramInt3;
    this.dks = paramInt4;
    this.dkt.cg(paramInt3, paramInt4);
    axr();
  }

  public void setMapDisplayer(dWq paramdWq) {
    setForceDisplayEntity(true);
    this.dkt.setMapDisplayer(paramdWq);
    oU();
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == dkK)
      setMapPath(paramString);
    else if (paramInt == dkx)
      setIsoCenterX(bUD.getFloat(paramString));
    else if (paramInt == dky)
      setIsoCenterY(bUD.getFloat(paramString));
    else if (paramInt == dkz)
      setIsoCenterZ(bUD.getFloat(paramString));
    else if (paramInt == dkA)
      setIsoMap(bUD.getBoolean(paramString));
    else if (paramInt == dkF)
      setOnMapClick((blg)paramaKN.b(blg.class, paramString));
    else if (paramInt == dkG)
      setOnMapDoubleClick((cnr)paramaKN.b(cnr.class, paramString));
    else if (paramInt == dkH)
      setOnMapMove((ajE)paramaKN.b(ajE.class, paramString));
    else if (paramInt == dkB)
      setMaxZoom(bUD.getFloat(paramString));
    else if (paramInt == dkC)
      setMinZoom(bUD.getFloat(paramString));
    else if (paramInt == dkD)
      setTooltipHotPoint(bSi.kp(paramString));
    else if (paramInt == dkI)
      setEnableTooltip(bUD.getBoolean(paramString));
    else if (paramInt == dkJ)
      setLandMarkZoom(bUD.getFloat(paramString));
    else if (paramInt == dkE)
      setZoomScale(bUD.getFloat(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    if (paramInt == dkK)
      setMapPath(bUD.getString(paramObject));
    else if (paramInt == cs)
    {
      setList(this.dkf, (ArrayList)paramObject);
    } else if (paramInt == dkv)
    {
      setList(this.dkg, (ArrayList)paramObject);
    } else if (paramInt == dkw)
    {
      setList(this.dkh, (ArrayList)paramObject);
    } else if (paramInt == dkx)
      setIsoCenterX(bUD.getFloat(paramObject));
    else if (paramInt == dky)
      setIsoCenterY(bUD.getFloat(paramObject));
    else if (paramInt == dkz)
      setIsoCenterZ(bUD.getFloat(paramObject));
    else if (paramInt == dkA)
      setIsoMap(bUD.getBoolean(paramObject));
    else if (paramInt == dkB)
      setMaxZoom(bUD.getFloat(paramObject));
    else if (paramInt == dkC)
      setMinZoom(bUD.getFloat(paramObject));
    else if (paramInt == dkD)
      setTooltipHotPoint((bSi)paramObject);
    else if (paramInt == dkI)
      setEnableTooltip(bUD.getBoolean(paramObject));
    else if (paramInt == dkE)
      setZoomScale(bUD.getFloat(paramObject));
    else if (paramInt == dkJ)
      setLandMarkZoom(bUD.getFloat(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  static
  {
    djT = new cgR(new cbW[0]);

    djT.setFloat("gColorScale", 1.0F);
  }
}