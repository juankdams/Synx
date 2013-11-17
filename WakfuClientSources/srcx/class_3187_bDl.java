import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class bDl extends cGj
  implements Qh
{
  private static final Logger K = Logger.getLogger(bDl.class);
  public static final String MAP = "map";
  public static final String gyn = "zoomScale";
  public static final String gyo = "centerX";
  public static final String gyp = "centerY";
  public static final String gyq = "centerZ";
  public static final String POINTS = "points";
  public static final String KU = "compass";
  public static final String gyr = "landmarks";
  public static final String gys = "isMapAvailable";
  public static final String[] bF = { "map", "zoomScale", "centerX", "centerY", "centerZ", "points", "compass", "landmarks", "isMapAvailable" };

  private static final String[] gyt = { "centerX", "centerY", "centerZ" };

  private static final float[] duY = { 1.0F, 1.0F, 1.0F, 1.0F };
  private cGI gyu;
  protected short gyv;
  private double gyw;
  private double gyx;
  private double gyy;
  protected final Xg gyz;
  protected final ArrayList gyA;
  protected final Xg gyB;
  protected final ArrayList gyC;
  protected final aoL gyD;
  protected final ArrayList gyE;
  private long gyF;
  protected aka gyG;
  private final adz gyH;
  private final dPx gyI;
  private final cnz gyJ;
  private ajt gyK;
  protected short gyL;
  protected int gyM;
  public dGc gyN;

  public bDl()
  {
    this.gyu = new cGI();

    this.gyz = new Xg();
    this.gyA = new ArrayList();
    this.gyB = new Xg();
    this.gyC = new ArrayList();
    this.gyD = new aoL();
    this.gyE = new ArrayList();

    this.gyH = new adz();
    this.gyI = new dPx();

    this.gyJ = new cnz();

    this.gyK = ajt.diK;

    this.gyL = -1;
    this.gyM = -1;

    this.gyN = dGc.lQC;
  }

  public void bLJ()
  {
    dLE.doY().t("landMark.filters", this.gyu);
  }

  public aka bLK() {
    return this.gyG;
  }

  public void f(aka paramaka) {
    this.gyG = paramaka;

    if (this.gyG != null) {
      int i = 0; for (int j = this.gyE.size(); i < j; i++) {
        this.gyG.d((dwn)this.gyE.get(i));
      }

      if (bMr())
        bMs();
    }
  }

  public void gu(long paramLong)
  {
    this.gyF = paramLong;
  }

  private String a(String paramString, CharSequence paramCharSequence) {
    return paramString.replace("[default]", paramCharSequence);
  }

  private PH a(avH paramavH) {
    ArrayList localArrayList = paramavH.dKu;

    if (localArrayList == null) {
      return null;
    }

    byz localbyz = byv.bFN().bFO();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      PH localPH = (PH)localArrayList.get(i);
      if ((localPH.aB == null) || (localPH.aB.i(localbyz, null, null, localbyz.ayL()))) {
        return localPH;
      }
    }

    return null;
  }

  public void bLL()
  {
    bLT();
    dmn localdmn;
    if (this.gyN != dGc.lQA) {
      cSR localcSR = this.gyJ.bKY();

      for (localdmn = localcSR.yF(); localdmn.hasNext(); ) {
        localdmn.fl();
        avH localavH = (avH)localdmn.value();
        if (localavH.bkM == aYk.fdS.getType()) {
          b(localavH);
        }

      }

    }

    bLP();
  }

  public void ct(short paramShort) {
    if (bLK() != null) {
      bLK().setForceDisplayEntity(false);
    }

    if (this.gyv != paramShort) {
      this.gyv = paramShort;
      dLE.doY().a(this, new String[] { "map" });
    }

    bLN();
    bHu localbHu;
    if (this.gyL == -1) {
      localbHu = new bHu();
      localbHu.add(paramShort);
    } else {
      localbHu = bDk.bLI().cs(this.gyL);
    }

    int i = 0;
    dmn localdmn;
    for (int j = localbHu.size(); i < j; i++)
    {
      String str;
      try {
        str = String.format(ay.bd().getString("mapsPoiPath"), new Object[] { Short.valueOf(localbHu.get(i)) });
      } catch (bdh localbdh) {
        K.error("Problème lors de la lecture de mapsPoiPath");
        return;
      }
      try
      {
        this.gyJ.c(aYQ.V(dtb.readFile(str)), false);
      } catch (IOException localIOException) {
        K.error("Problème au chargement du fichier de LandMarks " + str);
        return;
      }

      dUx localdUx = bDk.bLI().cr(localbHu.sV(i));
      if (localdUx != null) {
        for (localdmn = localdUx.duz(); localdmn.hasNext(); ) {
          localdmn.fl();
          this.gyH.hL(localdmn.zY());
        }
      }
    }

    bLM();
  }

  private void bLM() {
    try {
      bLO();
      cu(bMt());
      bLP();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  private void bLN() {
    fW(false);
    this.gyI.clear();
    this.gyJ.clear();
    this.gyH.clear();
  }

  private void bLO() {
    for (dmn localdmn = this.gyJ.bKY().yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      b((avH)localdmn.value());
    }
  }

  private void b(avH paramavH) {
    PH localPH = a(paramavH);
    if (localPH == null) {
      return;
    }

    int i = c(paramavH);
    if (i > 0)
      return;
    dwn localdwn;
    if (paramavH.dKs == aGL.edU.bJ())
      localdwn = a(paramavH, localPH);
    else if (paramavH.dKs == aGL.edV.bJ())
      localdwn = b(paramavH, localPH);
    else if (paramavH.dKs == aGL.edW.bJ())
      localdwn = d(paramavH, localPH);
    else if (paramavH.dKs == aGL.edX.bJ())
      localdwn = c(paramavH, localPH);
    else {
      localdwn = null;
    }

    if (localdwn == null) {
      return;
    }

    if (i == 0)
      localdwn.c(dSP.mpk);
  }

  private dwn a(avH paramavH, PH paramPH)
  {
    avz localavz1 = dSP.moU.DV(paramPH.cii);
    ArrayList localArrayList = k(paramavH.bkM, true);
    avz localavz2 = paramPH.cii == 46 ? localavz1 : null;
    if (localavz1 == null) {
      return null;
    }
    dwn localdwn = new dwn(paramavH.hY, paramavH.hZ, paramavH.aOl, bU.fH().b(35, paramPH.aw, new Object[0]), paramavH, localavz1, localavz2, duY, false, false);

    localArrayList.add(localdwn);
    return localdwn;
  }

  private dwn b(avH paramavH, PH paramPH) {
    brS localbrS = this.gyJ.hD(paramavH.dKt);
    if (localbrS == null) {
      return null;
    }
    cMb localcMb = (cMb)acs.aoN().a(localbrS.aTz, localbrS.dYr, localbrS.bFC);
    if (localcMb == null) {
      return null;
    }

    avz localavz = dSP.moU.DV(paramPH.cii == -1 ? localbrS.fNW : paramPH.cii);
    if (localavz == null) {
      return null;
    }

    ArrayList localArrayList = k(tR.v(localbrS.dYr).Cs().getType(), true);

    String str = a(bU.fH().b(35, paramPH.aw, new Object[0]), localcMb.getName());
    dwn localdwn = new dwn(paramavH.hY, paramavH.hZ, paramavH.aOl, str, localbrS, localavz, duY);

    localArrayList.add(localdwn);
    localcMb.release();

    return localdwn;
  }

  private dwn c(avH paramavH, PH paramPH) {
    ayn localayn = (ayn)cSE.kEZ.xz(paramavH.dKt);

    if (localayn == null) {
      localayn = cSE.kEZ.yY(paramavH.dKt);
    }
    if (localayn == null) {
      return null;
    }
    lZ locallZ = new lZ();
    aWN.a(locallZ, localayn);

    String str = a(bU.fH().b(35, paramPH.aw, new Object[0]), locallZ.tP());
    avz localavz = dSP.moU.DV(paramPH.cii == -1 ? aYk.fdS.getType() : paramPH.cii);
    if (localavz == null) {
      return null;
    }

    ArrayList localArrayList = k(aYk.fdS.getType(), true);
    dwn localdwn = new dwn(paramavH.hY, paramavH.hZ, paramavH.aOl, str, paramavH, localavz, duY);

    localArrayList.add(localdwn);
    return localdwn;
  }

  private dwn d(avH paramavH, PH paramPH) {
    PD localPD = bGh.gCn.sL(paramavH.dKt);
    if (localPD == null) {
      return null;
    }

    int i = NB.cdZ.fZ(localPD.getId());
    if (NB.cdZ.cF(i)) {
      return null;
    }

    lZ locallZ = new lZ();
    locallZ.a(bU.fH().b(137, localPD.getId(), new Object[0]));

    locallZ.tH().a(bU.fH().getString("recommended.level", new Object[] { Short.valueOf(localPD.Qb()), Short.valueOf(localPD.nV()) }));

    if (i != -1) {
      str = bSq.c(byv.bFN().bFO(), i);
      if (str.length() != 0) {
        locallZ.tH().a(str);
      }
    }

    String str = a(bU.fH().b(35, paramPH.aw, new Object[0]), locallZ.tP());
    avz localavz = dSP.moU.DV(paramPH.cii == -1 ? aYk.fdT.getType() : paramPH.cii);
    if (localavz == null) {
      return null;
    }

    ArrayList localArrayList = k(aYk.fdT.getType(), true);
    dwn localdwn = new dwn(paramavH.hY, paramavH.hZ, paramavH.aOl, str, paramavH, localavz, duY);

    localArrayList.add(localdwn);

    return localdwn;
  }

  private static int c(avH paramavH)
  {
    if (paramavH.dKq > 1) {
      return 1;
    }
    if ((paramavH.dKq == 1) && (paramavH.dKr > 28)) {
      return 1;
    }

    if ((paramavH.dKq == 1) && (paramavH.dKr == 28)) {
      return 0;
    }

    return -1;
  }

  private void I(ArrayList paramArrayList) {
    acs localacs = acs.aoN();
    int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
      brS localbrS = (brS)paramArrayList.get(i);
      cMb localcMb = (cMb)localacs.a(localbrS.aTz, localbrS.dYr, localbrS.bFC);
      if (localcMb != null)
      {
        avz localavz = dSP.moU.DV(localbrS.fNW);

        if (localavz != null)
        {
          ArrayList localArrayList = k(tR.v(localbrS.dYr).Cs().getType(), true);

          localArrayList.add(new dwn(localcMb.fa(), localcMb.fb(), localcMb.fc(), localcMb.getName(), localbrS, localavz, duY));

          localcMb.release(); } 
      }
    }
  }

  private void cu(short paramShort) { dmn localdmn = dlw.cTl().ej(paramShort).yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      b((cDB)localdmn.value(), false);
    }
  }

  public void bLP()
  {
    for (dKJ localdKJ : this.gyu.cBM()) {
      ArrayList localArrayList = k(localdKJ.bJ(), false);
      if (localArrayList != null)
      {
        int i = 0; for (int j = localArrayList.size(); i < j; i++) {
          dwn localdwn = (dwn)localArrayList.get(i);
          this.gyK.a(localdwn);
          if (localdKJ.p(localdwn)) {
            if ((this.gyD.put(localdwn.getValue().hashCode(), localdwn) == null) && (this.gyG != null))
            {
              this.gyG.d(localdwn);
            }
          }
          else if ((this.gyD.remove(localdwn.getValue().hashCode()) != null) && (this.gyG != null))
          {
            this.gyG.e(localdwn);
          }
        }
      }
    }
    bMc();
  }

  private ArrayList k(byte paramByte, boolean paramBoolean) {
    ArrayList localArrayList = (ArrayList)this.gyI.bf(paramByte);
    if ((paramBoolean) && (localArrayList == null)) {
      localArrayList = new ArrayList();
      this.gyI.c(paramByte, localArrayList);
    }
    return localArrayList;
  }

  public void bLQ() {
    try {
      this.gyu.bLQ();
      bLP();
    } catch (Exception localException) {
      K.error("Exception levee", localException);
    }
  }

  public void bLR() {
    this.gyu.bLR();
    bLP();
  }

  public void bLS() {
    this.gyu.cBK();
  }

  public void a(cGI paramcGI) {
    this.gyu = paramcGI;

    bLP();
  }

  public void l(byte paramByte, boolean paramBoolean) {
    this.gyu.n(paramByte, paramBoolean);

    bLP();
  }

  private void bLT() {
    ArrayList localArrayList = k(aYk.fdS.getType(), false);
    if (localArrayList == null) {
      return;
    }

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dwn localdwn = (dwn)localArrayList.remove(0);
      if ((this.gyD.remove(localdwn.getValue().hashCode()) != null) && (this.gyG != null))
        this.gyG.e(localdwn);
    }
  }

  public void a(cDB paramcDB, boolean paramBoolean)
  {
    if (paramcDB == null) {
      return;
    }

    ArrayList localArrayList = k(aYk.fdO.getType(), false);
    if (localArrayList == null) {
      return;
    }

    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dwn localdwn = (dwn)localArrayList.get(i);
      if (localdwn.getValue() == paramcDB) {
        localArrayList.remove(i);
        if ((this.gyD.remove(localdwn.getValue().hashCode()) == null) || (this.gyG == null)) break;
        this.gyG.e(localdwn); break;
      }

    }

    if (paramBoolean)
      bLP();
  }

  public void a(cDB paramcDB)
  {
    b(paramcDB, true);
  }

  private void b(cDB paramcDB, boolean paramBoolean) {
    if (paramcDB == null) {
      return;
    }

    avz localavz = dSP.moU.DV(paramcDB.oc());
    if (localavz == null) {
      return;
    }

    ArrayList localArrayList = k(aYk.fdO.getType(), true);
    localArrayList.add(new dwn(paramcDB.getX(), paramcDB.getY(), 0.0F, paramcDB.getNote(), paramcDB, localavz, dSP.mpa, duY, true, true));

    if (paramBoolean)
      bLP();
  }

  public cDB K(int paramInt1, int paramInt2, int paramInt3)
  {
    cDB localcDB = dlw.cTl().a(paramInt1, paramInt2, bU.fH().getString("desc.landMark.personalNote"), paramInt3);
    a(localcDB);
    return localcDB;
  }

  public void b(cDB paramcDB) {
    if (!dlw.cTl().d(paramcDB)) {
      return;
    }

    a(paramcDB, true);
  }

  public void c(cDB paramcDB) {
    ArrayList localArrayList = k(aYk.fdO.getType(), false);
    if (localArrayList == null) {
      return;
    }

    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      dwn localdwn = (dwn)localArrayList.get(i);
      if (paramcDB == localdwn.getValue())
        localdwn.setName(paramcDB.getNote());
    }
  }

  public void a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, String paramString1, Object paramObject, avz paramavz, String paramString2, float[] paramArrayOfFloat)
  {
    if (paramavz == null) {
      return;
    }

    aoL localaoL = (aoL)this.gyz.get(paramInt);
    if (localaoL == null) {
      localaoL = new aoL();
      this.gyz.put(paramInt, localaoL);
    }
    dwn localdwn = (dwn)localaoL.get(paramLong);
    if (localdwn != null) {
      localdwn.B(paramFloat1, paramFloat2, paramFloat3);
      localdwn.a(paramavz);
      localdwn.g(paramArrayOfFloat);
      localdwn.setParticlePath(paramString2);
    } else {
      localaoL.put(paramLong, new dwn(paramFloat1, paramFloat2, paramFloat3, paramString1, paramObject, paramavz, paramString2, paramArrayOfFloat));
    }

    if (paramLong == this.gyF) {
      h(paramFloat1, paramFloat2, paramFloat3);
    }

    bMa();
  }

  public void a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz, float[] paramArrayOfFloat) {
    if (paramavz == null) {
      return;
    }

    aoL localaoL = (aoL)this.gyB.get(paramInt);
    if (localaoL == null) {
      localaoL = new aoL();
      this.gyB.put(paramInt, localaoL);
    }
    dwn localdwn = (dwn)localaoL.get(paramLong);
    if (localdwn != null) {
      localdwn.B(paramFloat1, paramFloat2, paramFloat3);
      localdwn.a(paramavz);
      localdwn.g(paramArrayOfFloat);
    } else {
      localaoL.put(paramLong, new dwn(paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, paramArrayOfFloat));
    }

    bMb();
  }

  public void a(float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz, float[] paramArrayOfFloat) {
    aoL localaoL = (aoL)this.gyB.get(5);
    if (localaoL != null) {
      localaoL.clear();
    }

    a(0L, 5, paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, paramArrayOfFloat);
  }

  protected void a(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, String paramString, Object paramObject, avz paramavz, float[] paramArrayOfFloat) {
    if (paramavz == null) {
      return;
    }

    dwn localdwn1 = (dwn)this.gyD.get(paramLong);
    if (localdwn1 != null) {
      localdwn1.B(paramFloat1, paramFloat2, paramFloat3);
      localdwn1.a(paramavz);
      localdwn1.g(paramArrayOfFloat);
    } else {
      dwn localdwn2 = new dwn(paramFloat1, paramFloat2, paramFloat3, paramString, paramObject, paramavz, paramArrayOfFloat);
      this.gyD.put(paramLong, localdwn2);
      k(localdwn2);
    }
  }

  protected dwn bLU() {
    aoL localaoL = (aoL)this.gyB.get(5);
    if (localaoL == null) {
      return null;
    }

    return (dwn)localaoL.get(0L);
  }

  protected void i(dwn paramdwn) {
  }

  protected void j(dwn paramdwn) {
  }

  protected void k(dwn paramdwn) {
    if (this.gyG != null)
      this.gyG.d(paramdwn);
  }

  protected void l(dwn paramdwn)
  {
  }

  protected void m(dwn paramdwn) {
  }

  protected void n(dwn paramdwn) {
    if (this.gyG != null)
      this.gyG.e(paramdwn);
  }

  public void a(long paramLong, int paramInt, float[] paramArrayOfFloat)
  {
    aoL localaoL = (aoL)this.gyz.get(paramInt);
    if (localaoL == null) {
      return;
    }
    dwn localdwn = (dwn)localaoL.get(paramLong);
    if (localdwn != null)
      localdwn.g(paramArrayOfFloat);
  }

  public void b(long paramLong, int paramInt, float[] paramArrayOfFloat)
  {
    aoL localaoL = (aoL)this.gyB.get(paramInt);
    if (localaoL == null) {
      return;
    }
    dwn localdwn = (dwn)localaoL.get(paramLong);
    if (localdwn != null)
      localdwn.g(paramArrayOfFloat);
  }

  public void a(long paramLong, float[] paramArrayOfFloat)
  {
    dwn localdwn = (dwn)this.gyD.get(paramLong);
    if (localdwn != null)
      localdwn.g(paramArrayOfFloat);
  }

  public void a(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    a(paramdMM.getId(), 0, paramInt1, paramInt2, paramShort);
  }

  public void bLV() {
    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    h(localaWe.xV(), localaWe.xW(), localaWe.getAltitude());
  }

  protected void a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    if (a(paramLong, paramInt, paramFloat1, paramFloat2, paramFloat3, this.gyz)) {
      bMa();
    }

    if (a(paramLong, paramInt, paramFloat1, paramFloat2, paramFloat3, this.gyB))
      bMb();
  }

  private boolean a(long paramLong, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, Xg paramXg)
  {
    aoL localaoL = (aoL)paramXg.get(paramInt);
    if (localaoL == null) {
      return false;
    }
    dwn localdwn = (dwn)localaoL.get(paramLong);
    if (localdwn != null) {
      localdwn.B(paramFloat1, paramFloat2, paramFloat3);
      return true;
    }
    return false;
  }

  public void n(int paramInt, long paramLong)
  {
    aoL localaoL = (aoL)this.gyz.get(paramInt);
    if (localaoL == null) {
      return;
    }
    if (localaoL.remove(paramLong) != null)
      bMa();
  }

  public void o(int paramInt, long paramLong)
  {
    aoL localaoL = (aoL)this.gyB.get(paramInt);
    if (localaoL == null) {
      return;
    }
    if (localaoL.remove(paramLong) != null)
      bMb();
  }

  public void bLW()
  {
    aoL localaoL = (aoL)this.gyB.get(5);
    if (localaoL == null) {
      return;
    }
    if (localaoL.remove(0L) != null)
      bMb();
  }

  public void gv(long paramLong)
  {
    dwn localdwn = (dwn)this.gyD.remove(paramLong);
    if (localdwn != null) {
      n(localdwn);
    }
    bMc();
  }

  public void fW(boolean paramBoolean) {
    cHu localcHu = this.gyD.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      n((dwn)localcHu.value());
    }
    this.gyD.clear();

    if (paramBoolean)
      bMc();
  }

  public abstract float getZoomScale();

  public void setZoomScale(float paramFloat)
  {
    bLY();
  }

  public double getCenterX() {
    return this.gyw;
  }

  public double getCenterY() {
    return this.gyx;
  }

  public double bLX() {
    return this.gyy;
  }

  public void h(double paramDouble1, double paramDouble2, double paramDouble3) {
    this.gyw = paramDouble1;
    this.gyx = paramDouble2;
    this.gyy = paramDouble3;
    bLZ();
  }

  private void bLY()
  {
    dLE.doY().a(this, new String[] { "zoomScale" });
  }

  private void bLZ()
  {
    dLE.doY().a(this, gyt);
  }

  private void bMa()
  {
    this.gyA.clear();

    int i = 0; for (int j = this.gyz.size(); i < j; i++) {
      aoL localaoL = (aoL)this.gyz.hc(i);
      cHu localcHu = localaoL.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        this.gyA.add(localcHu.value());
      }
    }

    dLE.doY().a(this, new String[] { "points" });
  }

  private void bMb()
  {
    this.gyC.clear();

    int i = 0; for (int j = this.gyB.size(); i < j; i++) {
      aoL localaoL = (aoL)this.gyB.hc(i);
      cHu localcHu = localaoL.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        this.gyC.add(localcHu.value());
      }
    }

    dLE.doY().a(this, new String[] { "compass" });
  }

  protected void bMc()
  {
    this.gyE.clear();

    this.gyD.s(new dgv(this));

    dLE.doY().a(this, new String[] { "landmarks" });
  }

  private String bMd() {
    try {
      return ay.bd().getString("completeMapPath");
    } catch (bdh localbdh) {
      K.error(localbdh.getMessage());
    }

    return null;
  }

  private String bMe() {
    if (this.gyL != -1) {
      try {
        return String.format(ay.bd().getString("fullMapPath"), new Object[] { Short.valueOf(this.gyL) });
      } catch (bdh localbdh) {
        K.error("Problème lors de la lecture de fullMapPath");
      }
    }

    return null;
  }

  private String bMf() {
    if (this.gyv == 0)
      return null;
    try
    {
      return String.format(ay.bd().getString("fullMapPath"), new Object[] { Short.valueOf(this.gyv) });
    } catch (bdh localbdh) {
      K.error("Problème lors de la lecture de fullMapPath");
    }
    return null;
  }

  private String bMg() {
    if (this.gyM != -1) {
      try {
        int i = this.gyM / 100;
        return String.format(ay.bd().getString("fullSubMapPath"), new Object[] { Short.valueOf(this.gyv), Integer.valueOf(i) });
      } catch (bdh localbdh) {
        K.error("Problème lors de la lecture de fullSubMapPath");
      }
    }

    return null;
  }

  protected String cv(short paramShort) {
    String str = null;
    if (this.gyN == dGc.lQA)
      str = bMd();
    else if ((this.gyN == dGc.lQB) && (this.gyL != -1))
      str = bMe();
    else if ((this.gyN == dGc.lQD) && (this.gyM != -1)) {
      str = bMg();
    }

    if ((str != null) && (bAy.jy(str))) {
      return str;
    }

    return bMf();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isMapAvailable")) {
      return Boolean.valueOf(bMq());
    }
    if (paramString.equals("map")) {
      return cv(this.gyv);
    }
    if (paramString.equals("zoomScale")) {
      return Float.valueOf(getZoomScale());
    }
    if (paramString.equals("centerX")) {
      return Double.valueOf(getCenterX());
    }
    if (paramString.equals("centerY")) {
      return Double.valueOf(getCenterY());
    }
    if (paramString.equals("centerZ")) {
      return Double.valueOf(bLX());
    }
    if (paramString.equals("points")) {
      return this.gyA;
    }
    if (paramString.equals("compass")) {
      return this.gyC;
    }
    if (paramString.equals("landmarks")) {
      return this.gyE;
    }
    return null;
  }

  public String[] getFields() {
    return bF;
  }

  public void su(int paramInt) {
    if (this.gyz.remove(paramInt) != null)
      bMa();
  }

  public void removeAllPoints()
  {
    int i;
    if (this.gyz != null) {
      i = this.gyz.size();
      this.gyz.clear();
      this.gyA.clear();
      K.info("Nettoyage des points contenus dans la map (" + this.gyz.size() + " restants sur " + i + ")");
    }

    if (this.gyB != null) {
      i = this.gyB.size();
      this.gyB.clear();
      this.gyC.clear();
      K.info("Nettoyage des points contenus dans la map (" + this.gyB.size() + " restants sur " + i + ")");
    }
    K.info("Nettoyage de la boussole contenue dans la map");

    if (this.gyD != null) {
      i = this.gyD.size();
      this.gyD.clear();
      this.gyE.clear();
      if (this.gyG != null) {
        this.gyG.axn();
      }
      K.info("Nettoyage des repères contenus dans la map (" + this.gyD.size() + " restants sur " + i + ")");
    }
  }

  public abstract avz bMh();

  public ajt bMi()
  {
    return this.gyK;
  }

  public void a(ajt paramajt) {
    this.gyK = paramajt;
  }

  public dGc bMj() {
    return this.gyN;
  }

  public dGc bMk()
  {
    String str;
    switch (dgu.lbq[this.gyN.ordinal()]) {
    case 1:
      str = bMd();
      if ((str != null) && (bAy.jy(str))) {
        return this.gyN;
      }

      break;
    case 2:
      if (this.gyL != -1) {
        str = bMe();
        if ((str != null) && (bAy.jy(str)))
          return this.gyN;
      }
      break;
    case 3:
      if (this.gyM != -1) {
        str = bMg();
        if ((str != null) && (bAy.jy(str))) {
          return this.gyN;
        }
      }
      break;
    }

    return dGc.lQC;
  }

  private boolean a(dGc paramdGc)
  {
    String str;
    switch (dgu.lbq[paramdGc.ordinal()]) {
    case 1:
      str = bMd();
      if ((str != null) && (bAy.jy(str))) {
        return true;
      }

      break;
    case 2:
      if (this.gyL != -1) {
        str = bMe();
        if ((str != null) && (bAy.jy(str)))
          return true;
      }
      break;
    case 3:
      if (this.gyM != -1) {
        str = bMg();
        if ((str != null) && (bAy.jy(str)))
          return true;
      }
      break;
    case 4:
      str = cv(this.gyv);
      if ((str != null) && (bAy.jy(str))) {
        return true;
      }
      break;
    }

    return false;
  }

  public dGc bMl() {
    dGc localdGc = bMk();
    switch (dgu.lbq[localdGc.ordinal()]) {
    case 1:
      if (a(dGc.lQB)) {
        return dGc.lQB;
      }

    case 2:
      if (a(dGc.lQC)) {
        return dGc.lQC;
      }

    case 4:
      if (a(dGc.lQD))
        return dGc.lQD;
      break;
    case 3:
    }
    return null;
  }

  public dGc bMm()
  {
    dGc localdGc = bMk();
    switch (dgu.lbq[localdGc.ordinal()]) {
    case 3:
      if (a(dGc.lQC)) {
        return dGc.lQC;
      }

    case 4:
      if (a(dGc.lQB)) {
        return dGc.lQB;
      }

    case 2:
      boolean bool = bDk.bLI().cr(byv.bFN().bFO().Lk()).msc;
      if ((a(dGc.lQA)) && (bool)) {
        return dGc.lQA;
      }
      break;
    }

    return null;
  }

  public void b(dGc paramdGc)
  {
    if (this.gyN == paramdGc) {
      return;
    }

    dGc localdGc1 = bMk();
    this.gyN = paramdGc;
    dGc localdGc2 = bMk();

    if (localdGc1 == localdGc2) {
      return;
    }

    aka localaka = bLK();
    if (localdGc2 == dGc.lQA) {
      this.gyM = -1;

      if (localaka != null) {
        localaka.setDisplayPoints(false);
        localaka.setDisplayCompass(false);
      }
      bLN();
    }
    else if ((this.gyv == byv.bFN().bFO().Lk()) && 
      (localaka != null)) {
      localaka.setDisplayPoints(true);
      localaka.setDisplayCompass(true);
    }

    bMv();

    bMw();
    bMp();
  }

  public void sv(int paramInt) {
    if (this.gyM == paramInt) {
      return;
    }
    this.gyM = paramInt;
    if (this.gyN == dGc.lQD) {
      bMw();
      bMp();
    }
  }

  public void bMn() {
    byz localbyz = byv.bFN().bFO();
    cYk localcYk = localbyz.aKb();
    bva localbva = byJ.gma.cF(localcYk.getX(), localcYk.getY());

    if (localbva == null) {
      b(dGc.lQC);
    } else {
      sv(localbva.getId());
      b(dGc.lQD);
    }
  }

  public void bMo() {
    dmn localdmn = byJ.gma.bHG();
    if (localdmn.hasNext()) {
      localdmn.fl();
      sv(localdmn.zY());
    }
  }

  protected void bMp() {
    dLE.doY().a(this, new String[] { "map" });
  }

  public boolean bMq() {
    if (bMr()) {
      return true;
    }

    String str = cv(this.gyv);
    return (str != null) && (bAy.jy(str));
  }

  public final boolean bMr() {
    return Vr.cAl.aiI();
  }

  protected final void bMs() {
    bLN();

    if (bLK() == null) {
      return;
    }
    aIJ localaIJ = Vr.cAl.aiG();
    apg.a(localaIJ, bLK());

    ArrayList localArrayList = new ArrayList();
    this.gyI.c(aYk.fdU.getType(), localArrayList);
    apg.a(localaIJ, localArrayList);

    bLM();
  }

  public short bMt() {
    return bMr() ? Vr.cAl.aiG().D() : this.gyv;
  }

  public boolean bMu() {
    return byv.bFN().bFO().Lk() == bMt();
  }

  protected abstract void bMv();

  protected abstract void bMw();
}