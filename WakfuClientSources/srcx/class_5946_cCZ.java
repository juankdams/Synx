import org.apache.log4j.Logger;

public class cCZ extends bDl
  implements aYY
{
  private static final Logger K = Logger.getLogger(bSH.class);

  private static final cCZ ivI = new cCZ();
  public static final String ivJ = "currentMapName";
  public static final String ivK = "currentTerritoryName";
  public static final String ivL = "currentTerritoryIconUrl";
  public static final String ivM = "currentProtectorDescription";
  public static final String ivN = "availableMapsCoords";
  public static final String ivO = "displayedPosition";
  public static final String ivP = "displayTerritories";
  public static final String NQ = "recommendedLevel";
  public static final String ivQ = "protectorAnimatedElem";
  public static final String ivR = "protectorAnimName";
  public static final String[] bF = { "displayedPosition", "availableMapsCoords", "displayTerritories" };

  public static final String[] aOb = new String[bF.length + bDl.bF.length];

  private int aGC = -1;
  private ahm ivS;
  private float dkb = 1.0F;
  private int ivT;
  private int ivU;
  private boolean ivV;
  private int ivW = -1;

  private cCZ()
  {
    axi localaxi = new axi();
    bKM.bSX().a(bdN.fqb, 0, localaxi);
  }

  public String cyY() {
    return bU.fH().b(77, this.gyv, new Object[0]);
  }

  public static cCZ cyZ() {
    return ivI;
  }

  public void hU(boolean paramBoolean) {
    if (this.ivV == paramBoolean) {
      return;
    }

    this.ivV = paramBoolean;
    bMw();
  }

  public void bLJ()
  {
    super.bLJ();

    dLE.doY().t("map", this);
  }

  public acq cza()
  {
    return (acq)this.gyG;
  }

  public void a(acq paramacq) {
    super.f(paramacq);

    bMv();
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, Object paramObject) {
    a(2, paramFloat1, paramFloat2, paramFloat3, paramObject, null);
  }

  public void czb() {
    super.bLW();
    Dj.My().removeAll();
  }

  public void a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, Object paramObject, String paramString) {
    if (paramString == null) {
      paramString = bU.fH().getString("compass");
    }
    b(0L, paramInt, paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, dSP.mpb, clP.hOS);
  }

  public void b(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz, float[] paramArrayOfFloat)
  {
    Dj.My().a(paramInt, paramLong, (int)paramFloat1, (int)paramFloat2, (int)paramFloat3, paramObject, this);

    a(paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, paramArrayOfFloat);

    bLU().kH(true);
  }

  public void z(int paramInt, long paramLong) {
    bLW();
    Dj.My().n(paramInt, paramLong);
  }

  public boolean xt(int paramInt) {
    return Dj.My().wh(paramInt);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("availableMapsCoords")) {
      return aaX.anG().anH().cIf();
    }

    if (paramString.equals("displayedPosition")) {
      return new StringBuilder("x=").append(this.ivT).append(" y=").append(this.ivU);
    }

    if (paramString.equals("displayTerritories")) {
      return Boolean.valueOf(this.ivV);
    }

    if (paramString.equals("currentTerritoryName")) {
      if (bMr()) {
        return bU.fH().b(77, Vr.cAl.aiG().D(), new Object[0]);
      }
      int i = czd();
      return bU.fH().b(66, i, new Object[0]);
    }

    if (paramString.equals("currentMapName")) {
      if (bMr()) {
        return bU.fH().getString("desc.havenWorld");
      }
      return cyY();
    }
    Object localObject;
    if (paramString.equals("currentTerritoryIconUrl")) {
      localObject = czc();
      if (localObject == null) {
        return null;
      }
      return ay.bd().a("nationFlagIconsPath", null, new Object[] { Integer.valueOf(((aid)localObject).avc()) });
    }
    if (paramString.equals("protectorAnimatedElem")) {
      return this.ivS;
    }
    if (paramString.equals("protectorAnimName")) {
      return aDD.dYy.ata();
    }
    if (paramString.equals("currentProtectorDescription")) {
      localObject = czc();
      if (localObject == null) {
        return null;
      }

      lZ locallZ = new lZ();
      aWN.a(locallZ, (ayn)localObject);
      return locallZ.tP();
    }
    if (paramString.equals("recommendedLevel")) {
      localObject = (bva)QI.cpK.gq(czd());
      if (localObject == null) {
        return null;
      }
      short s1 = ((bva)localObject).Qb();
      short s2 = ((bva)localObject).nV();
      if ((s1 != -1) && (s2 != -1)) {
        return bjv.format(bU.fH().getString("recommended.level", new Object[] { Short.valueOf(s1), Short.valueOf(s2) }), new Object[0]);
      }
      return null;
    }

    return super.getFieldValue(paramString);
  }

  private aid czc() {
    bva localbva = (bva)QI.cpK.gq(czd());
    if (localbva == null) {
      return null;
    }

    aid localaid = localbva.boT();
    if (localaid == null) {
      return null;
    }
    return localaid;
  }

  public int czd() {
    int i = this.gyM;
    if ((this.gyN == dGc.lQC) || (this.gyM == -1)) {
      byz localbyz = byv.bFN().bFO();
      cYk localcYk = localbyz.aKb();
      bva localbva = byJ.gma.cF(localcYk.getX(), localcYk.getY());
      if (localbva != null) {
        i = localbva.getId();
      }
    }
    return i;
  }

  public String[] getFields()
  {
    return aOb;
  }

  public void eb(int paramInt1, int paramInt2) {
    this.ivT = paramInt1;
    this.ivU = paramInt2;
    dLE.doY().a(this, new String[] { "displayedPosition" });
  }

  public float getZoomScale()
  {
    return this.dkb;
  }

  public void setZoomScale(float paramFloat)
  {
    this.dkb = paramFloat;
    super.setZoomScale(paramFloat);
  }

  protected void bMp()
  {
    super.bMp();

    q(czc());

    dLE.doY().a(this, new String[] { "currentTerritoryName", "currentProtectorDescription", "currentTerritoryName", "currentMapName", "currentTerritoryIconUrl", "recommendedLevel" });
  }

  protected void bMw()
  {
    acq localacq = cza();
    if (localacq == null) {
      return;
    }

    localacq.setAllMapZonesVisible(this.ivV);

    int i = bMl() != null ? 1 : 0;
    if (i != 0) {
      localacq.setDragEnabled(false);
      localacq.setDropEnabled(false);
      localacq.setLandMarkZoom(0.75F);
      localacq.setUseAlternateTexture(true);
    } else {
      localacq.setDragEnabled(true);
      localacq.setDropEnabled(true);
      localacq.setLandMarkZoom(1.0F);
      localacq.setUseAlternateTexture(false);
    }
  }

  public void cze()
  {
    dRn localdRn = cza().getSelectedMapZone();
    if (localdRn == null) {
      return;
    }

    dGc localdGc = bMk();
    Object localObject;
    if (localdGc == dGc.lQA) {
      localObject = (Ww)localdRn.dsj();
      if (((Ww)localObject).getId() == 0) {
        return;
      }
      if (((Ww)localObject).aiX()) {
        a((short)0, (short)((Ww)localObject).getId(), true, false);
        b(dGc.lQB);
      } else {
        a((short)((Ww)localObject).getId(), true, false);
        b(dGc.lQC);
      }
    }
    else
    {
      int i;
      if (localdGc == dGc.lQB) {
        localObject = (azm)localdRn.dsj();
        i = ((azm)localObject).getId();
        g((short)i, false);
        b(dGc.lQC);
      } else if (localdGc == dGc.lQC) {
        localObject = (cwE)localdRn.dsj();
        i = ((cwE)localObject).qv().getId();
        sv(i);
        b(dGc.lQD);
      } else if (localdGc == dGc.lQD) {
        localObject = (cwE)localdRn.dsj();
        i = ((cwE)localObject).qv().getId();
        sv(i);
      }
    }
  }

  public boolean bMq() {
    if (byv.bFN().c(coX.coM())) {
      return false;
    }

    return super.bMq();
  }

  private void du(short paramShort)
  {
    if (paramShort == -1) {
      bKM.bSX().b(bdN.fqa);
    } else if (paramShort != this.ivW) {
      bHu localbHu = bDk.bLI().cs(paramShort);
      aOh localaOh = new aOh(paramShort, localbHu);
      bKM.bSX().a(bdN.fqa, paramShort, localaOh);
    }
    this.ivW = paramShort;
  }

  public void ct(short paramShort)
  {
    g(paramShort, true);
  }

  public void g(short paramShort, boolean paramBoolean) {
    a(paramShort, paramBoolean, true);
  }

  public void a(short paramShort, boolean paramBoolean1, boolean paramBoolean2) {
    if (bDk.bLI().cr(paramShort) == null) {
      return;
    }

    short s1 = bDk.bLI().cr(paramShort).mrN;
    short s2 = -1;

    if ((s1 > 0) && (s1 != paramShort))
    {
      s2 = s1;
    } else if (s1 < 0) {
      paramShort = s1;
    }

    a(paramShort, s2, paramBoolean1, paramBoolean2);
  }

  public void a(short paramShort1, short paramShort2, boolean paramBoolean1, boolean paramBoolean2) {
    this.gyL = paramShort2;

    if ((!bMr()) && (!paramBoolean1) && (this.gyv == paramShort1)) {
      return;
    }

    du(this.gyL);

    byJ.gma.rE(paramShort1);

    if (bMr())
      bMs();
    else {
      super.ct(paramShort1);
    }

    if ((byv.bFN().bFO().Lk() == paramShort1) && (paramBoolean2))
      bMn();
    else {
      bMo();
    }

    if ((!bMq()) && (byv.bFN().c(dCr.deY()))) {
      byv.bFN().b(dCr.deY());
    }

    q(czc());

    dLE.doY().a(this, new String[] { "isMapAvailable", "currentMapName", "currentProtectorDescription", "currentTerritoryIconUrl", "currentTerritoryName", "recommendedLevel" });
  }

  public avz bMh()
  {
    return dSP.mpf;
  }

  public void bMv()
  {
    acq localacq = cza();
    if (localacq == null) {
      return;
    }

    bKM.bSX().c(czf());
    localacq.aiA();

    dmn localdmn = bKM.bSX().bSY();

    while ((localdmn != null) && (localdmn.hasNext())) {
      localdmn.fl();
      localObject = (aQI)localdmn.value();
      localacq.a((aQI)localObject);
    }

    Object localObject = byv.bFN().bFO().ML();
    localacq.setPlayerMapZone(((cYk)localObject).getX(), ((cYk)localObject).getY());

    bMw();
  }

  private bdN czf() {
    if (bMk() == dGc.lQA) {
      return bdN.fqb;
    }
    if (bMk() == dGc.lQB) {
      return bdN.fqa;
    }

    return bdN.fpZ;
  }

  public boolean xu(int paramInt) {
    boolean bool = aaX.anG().hA(paramInt);

    if (bool) {
      dLE.doY().a(this, new String[] { "availableMapsCoords" });
    }

    return bool;
  }

  public void czg() {
    dLE.doY().a(this, new String[] { "isMapAvailable" });
  }

  public void boh() {
    czb();
  }

  private void q(aid paramaid) {
    if (bMu()) {
      KP localKP = KP.bXy.CB() == -1 ? bWW.ccf() : KP.bXy;

      int j = localKP.CB();
      if (this.aGC == j) {
        return;
      }
      this.aGC = j;
      if (this.ivS != null) {
        this.ivS.dispose();
      }
      this.ivS = bBi.rX(j);
    } else {
      int i = paramaid == null ? -1 : paramaid.getId();
      if (this.aGC == i) {
        return;
      }

      this.aGC = i;
      if (this.ivS != null) {
        this.ivS.dispose();
        this.ivS = null;
      }

      if (i != -1) {
        this.ivS = bBi.rX(i);
      }
    }
    dLE.doY().a(this, new String[] { "protectorAnimatedElem", "protectorAnimName" });
  }

  public dGc bMk()
  {
    if (bMr()) {
      return dGc.lQE;
    }
    return super.bMk();
  }

  static
  {
    System.arraycopy(bF, 0, aOb, 0, bF.length);
    System.arraycopy(bDl.bF, 0, aOb, bF.length, bDl.bF.length);
  }
}