import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bZv extends mp
  implements cfM
{
  private static final boolean aRN = false;
  private static final Logger K = Logger.getLogger(bZv.class);

  private static final bZv hpO = new bZv();
  private aLD hpP;
  private mw hpQ;
  private final bBg aQT;
  private int hpR;
  private aRa aRn;
  private bnm N;
  private int hpS;

  public bZv()
  {
    this.aQT = new bBg(new bzp());
  }

  public static bZv cdR()
  {
    return hpO;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (paramcWG.getId()) {
    case 19360:
      localObject1 = (djw)paramcWG;
      localObject2 = ((djw)localObject1).cSt();
      switch (oN.aMN[localObject2.uz().ordinal()]) {
      case 1:
        this.hpP.setTool(new acZ((cDs)((bZw)localObject2).bqR()));
        break;
      case 2:
        this.hpP.setTool(new dMK((bOB)((bZw)localObject2).bqR()));
      }

      dLE.doY().t("havenWorldSelectedCatalogEntry", localObject2);
      ceb();
      return false;
    case 19361:
      localObject1 = (djt)paramcWG;
      localObject2 = ((djt)localObject1).cSl();
      localObject3 = ((ju)localObject2).rj();

      if (localObject3 == null) {
        return false;
      }

      ArrayList localArrayList = c((dDO)localObject3);

      if (!localArrayList.isEmpty()) {
        a(localArrayList, (dDO)localObject3);
        return false;
      }
      ((dDO)localObject3).a(this.hpP);

      this.hpQ.b((ju)localObject2);
      cdU();
      bZw localbZw = ((ju)localObject2).ri();
      dLE.doY().a(localbZw, localbZw.getFields());

      dLE.doY().t("havenWorldSelectedCatalogEntry", null);
      if (this.hpQ.ue() == 0) {
        dLE.doY().t("havenWorldCatalogQuotationMode", Boolean.valueOf(false));
      }
      return false;
    case 17805:
      localObject1 = (bzu)paramcWG;
      this.hpQ.x(((bzu)localObject1).af());
      this.hpP.setCurrentLayer(this.hpQ.ug());
      dLE.doY().t("havenWorldCatalogQuotationMode", Boolean.valueOf(false));
      ceb();
      return false;
    case 17804:
      localObject1 = bU.fH().getString("question.havenWorldModificationConfirm");
      localObject2 = new NW(102, 0, (String)localObject1, null, Cn.et(8), 24L);

      localObject3 = cBQ.cxL().a((NW)localObject2);
      ((cKX)localObject3).a(new oW(this));

      ceb();
      return false;
    case 17803:
      localObject1 = (cAt)paramcWG;
      a((cAt)localObject1);
      return false;
    case 17800:
      return false;
    case 17801:
      return false;
    case 17806:
      localObject1 = (awO)paramcWG;
      localObject2 = ((awO)localObject1).rj();
      ((dDO)localObject2).g(this.hpP);
      b(((awO)localObject1).aIy(), (dDO)localObject2);
      return false;
    }
    return true;
  }

  private ArrayList c(dDO paramdDO) {
    bNi localbNi = paramdDO.Qw();
    Object localObject1;
    Object localObject2;
    if ((localbNi instanceof bRc)) {
      localObject1 = new cSI(this.hpP.getWorkingHavenWorld());
      localObject2 = (bRc)localbNi;
      ((cSI)localObject1).dx(((bRc)localObject2).bqO(), ((bRc)localObject2).bqP());
      return ((cSI)localObject1).aIy();
    }
    if ((paramdDO instanceof ie)) {
      localObject1 = new cqs(this.hpP.getWorkingHavenWorld(), cyF.inc);
      localObject2 = (ie)paramdDO;
      bcQ localbcQ = (bcQ)((ie)localObject2).Qw();
      ((cqs)localObject1).d(((ie)localObject2).pQ(), localbcQ.bqO(), localbcQ.bqP());
      return ((cqs)localObject1).aIy();
    }
    if ((localbNi instanceof cbR)) {
      return a(localbNi, paramdDO.pI().cZL());
    }
    throw new UnsupportedOperationException("modification non prise en compte " + localbNi);
  }

  private void cdS() {
    bvK localbvK = new bvK();
    for (ju localju : this.hpQ.uf()) {
      bH localbH = c(localju);
      if (localbH != null)
      {
        localbvK.a(localbH);
      }
    }
    byv.bFN().aJK().d(localbvK);
    this.hpR = this.hpQ.ue();

    dLE.doY().t("havenWorldCatalogQuotationMode", Boolean.valueOf(false));
    this.hpQ.uk();
  }

  private bH c(ju paramju) {
    Object localObject = null;
    dDO localdDO = paramju.rj();
    MD localMD = localdDO.wr();
    bZw localbZw = paramju.ri();
    switch (oN.aMN[localbZw.uz().ordinal()]) {
    case 3:
      localObject = new dCz(BX.eh(localMD.getX()), BX.ei(localMD.getY()));

      break;
    case 2:
      switch (oN.aUs[localdDO.pI().ordinal()]) {
      case 1:
        int i = ((aXZ)localbZw).bns();
        localObject = new jk((short)i, (short)localMD.getX(), (short)localMD.getY());
        this.hpQ.ui();
        break;
      case 2:
        localObject = new clB(localdDO.Qw().EN());
        this.hpQ.ui();
        break;
      case 3:
        localObject = new aEV(localdDO.Qw().EN(), (short)localMD.getX(), (short)localMD.getY());
      }

      break;
    case 1:
      ie localie = (ie)localdDO;
      short s1 = (short)bnp.qo(localMD.getX());
      short s2 = (short)bnp.qp(localMD.getY());
      short s3 = ((cDs)localbZw.bqR()).bqQ();
      short s4 = localie.pQ();
      localObject = new ctl(s1, s2, s3, s4);
      break;
    }

    return localObject;
  }

  public void cdT() {
    dGx.dhr().unlock();
    bWx.cbz().hide();
  }

  private void a(ArrayList paramArrayList, dDO paramdDO) {
    lZ locallZ = new lZ();
    String str = dat.k(paramdDO.Qw());
    if ((paramdDO.pI() == dtv.lwh) || (paramdDO.pI() == dtv.lwi)) {
      locallZ.a(bU.fH().getString("havenWorldBoardConflictOnRevertMessage", new Object[] { str })).tH();
      a(paramArrayList, locallZ);
    } else {
      locallZ.a(bU.fH().getString("havenWorldBoardConflictMessage", new Object[] { str })).tH();
    }

    dLE.doY().t("havenWorldConflictList", locallZ.tP());
  }

  private void b(ArrayList paramArrayList, dDO paramdDO) {
    lZ locallZ = new lZ();
    String str = dat.k(paramdDO.Qw());
    locallZ.a(bU.fH().getString("havenWorldBoardConflictMessage", new Object[] { str })).tH();

    a(paramArrayList, locallZ);
    dLE.doY().t("havenWorldConflictList", locallZ.tP());
  }

  private void a(ArrayList paramArrayList, lZ paramlZ) {
    for (int i = 0; i < paramArrayList.size(); i++) {
      Gz localGz = (Gz)paramArrayList.get(i);

      K.error(localGz);

      a(paramlZ, localGz);

      this.hpP.f(localGz.Qw());

      if ((!(localGz instanceof bee)) && 
        (!(localGz instanceof sc)))
      {
        K.error("Erreur non gérée = " + localGz.toString());
      }
    }
  }

  private static void a(lZ paramlZ, Gz paramGz) {
    MD localMD = paramGz.Qx();
    String str = dat.k(paramGz.Qw());

    paramlZ.tH().tI();
    paramlZ.ao(localMD.getX() + ";" + localMD.getY());
    paramlZ.tz().tF().a(str).tG().tA();
    paramlZ.a(" ").a(bU.fH().getString(paramGz.yE().name()));
    paramlZ.tJ();
  }

  private void a(lZ paramlZ, long paramLong, bZw parambZw) {
    paramlZ.tz().tF();
    paramlZ.ao(String.valueOf(paramLong));
    paramlZ.a(parambZw.getName());
    paramlZ.tG().tA();
  }

  private void a(cAt paramcAt) {
    dDO localdDO = paramcAt.rj();
    Object localObject;
    switch (oN.aUs[localdDO.pI().ordinal()]) {
    case 1:
      localObject = localdDO.bqR();
      if ((localObject instanceof bOB))
        e(localdDO);
      else if ((localObject instanceof cDs))
        a(localdDO, (cDs)localObject);
      else {
        d(localdDO);
      }
      break;
    case 2:
      localObject = dfq.createDeleteMessageBox();
      ((cKX)localObject).a(new oO(this, localdDO));

      break;
    case 3:
      localObject = bU.fH().getString("question.havenWorldMoveBuilding");
      NW localNW = new NW(102, 0, (String)localObject, null, Cn.et(8), 24L);

      cKX localcKX = cBQ.cxL().a(localNW);
      localcKX.a(new oP(this, localdDO));

      break;
    case 4:
      localObject = this.hpQ.b(localdDO);
      if (localObject == null) {
        K.warn("Élémént n'appartenant pas au devis, todo design");
        return;
      }
      dLE.doY().t("havenWorldCatalogQuotationMode", Boolean.valueOf(true));
      dLE.doY().t("havenWorldSelectedCatalogEntry", localObject);
      break;
    }
  }

  private void d(dDO paramdDO)
  {
    if (!this.aQT.rW(this.aQq.La())) {
      paramdDO.a(this.hpP);
      cdX();
    } else {
      aWc.blo().eO(600182L);
      f(paramdDO);
    }
  }

  private void a(dDO paramdDO, cDs paramcDs) {
    if (!this.aQT.rW(paramcDs.ahA())) {
      paramdDO.a(this.hpP);
      cdX();
      return;
    }

    int i = bGQ.gDB.sS(paramcDs.aTz());
    if (i != -1) {
      aWc.blo().eO(i);
    }
    f(paramdDO);
  }

  private void e(dDO paramdDO) {
    cbR localcbR = (cbR)paramdDO.Qw();
    cUh localcUh = localcbR.cfy().adj();
    if (localcUh == null) {
      paramdDO.a(this.hpP);
      return;
    }

    ctA localctA = new ctA(this.aQT);
    localctA.h(localcbR.cfy());

    if (localctA.b(cLT.iLC)) {
      cdY();
    }
    if (localctA.b(cLT.iLA)) {
      cdX();
    }
    if (localctA.b(cLT.iLE)) {
      K.error("Manque des batiement ");
    }
    if (localctA.b(cLT.iLF)) {
      cdW();
    }

    if (localctA.bzZ()) {
      paramdDO.a(this.hpP);
      return;
    }

    int i = bGQ.gDB.sR(localcbR.bna().nc());
    if (i != -1) {
      aWc.blo().eO(i);
    }

    f(paramdDO);
  }

  private void f(dDO paramdDO) {
    bZw localbZw = dfX.laF.b(paramdDO.bqR());
    ju localju = ju.a(localbZw);
    localju.a(paramdDO);
    a(localju);
    dLE.doY().a(localbZw, localbZw.getFields());
  }

  private ArrayList a(bNi parambNi, dtv paramdtv) {
    bBg localbBg = new bBg(this.aQT);
    a(localbBg, parambNi, paramdtv);
    aKi localaKi = new aKi(localbBg);
    localaKi.bbw();
    return localaKi.aIy();
  }

  private boolean g(dDO paramdDO) {
    ArrayList localArrayList = a(paramdDO.Qw(), paramdDO.pI());
    if (localArrayList.isEmpty()) {
      return true;
    }
    cjO.clE().j(new awO(paramdDO, localArrayList));
    return false;
  }

  private void a(ju paramju) {
    this.hpQ.a(paramju);
    cdU();

    if (!this.hpQ.b(paramju.ri())) {
      bUO.cancelAction();
      this.hpP.setSelectTool();
    }
  }

  public void cdU() {
    this.aQT.a(this.hpS, this.aQq);

    for (ju localju : this.hpQ.uf()) {
      dDO localdDO = localju.rj();
      a(this.aQT, localdDO.Qw(), localdDO.pI());
    }
    this.hpQ.a(this.aQT);
    this.hpQ.ui();
  }

  private void a(bBg parambBg, bNi parambNi, dtv paramdtv) {
    bvy localbvy = parambNi.bqR();
    Object localObject;
    if ((localbvy instanceof bOB)) {
      localObject = (cbR)parambNi;
      if (paramdtv == dtv.lwh) {
        parambBg.n(((cbR)localObject).cfy());
      }
      if (paramdtv == dtv.lwi) {
        parambBg.o(((cbR)localObject).cfy());
      }

      return;
    }
    if ((localbvy instanceof bAb)) {
      localObject = (bAb)localbvy;
      parambBg.a((bAb)localObject);
      return;
    }
    if ((localbvy instanceof cDs)) {
      localObject = (cDs)localbvy;
      parambBg.b((cDs)localObject);
      return;
    }
  }

  public ju b(cbR paramcbR) {
    return this.hpQ.a(paramcbR.EN(), dmh.ljT);
  }

  public cuF cI(long paramLong) {
    return this.aQq.cI(paramLong);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.aQq == null) {
        return;
      }

      this.N = new oM(this);

      cBQ.cxL().a(this.N);

      this.aRn = aRa.eNR;
      cBQ.cxL().j("wakfu.worldEditor", bUO.class);

      aNL localaNL = cBQ.cxL().a("worldEditorDialog", VV.dJ("worldEditorDialog"), 256L, (short)10005);

      cdV();

      this.hpP = ((aLD)localaNL.getElementMap().fi("worldEditor"));
      this.hpP.a(Vr.cAl.aiG(), this.aRn);
      this.hpP.setTool(new bzi());

      pa localpa = new pa();
      this.aQq.o(localpa);
      MD localMD = localpa.wr();
      if (localMD != null) {
        this.hpP.bF(localMD.getX(), localMD.getY());
      }

      byv.bFN().bFO().aeL().a(this);
      dLE.doY().t("havenWorldConflictList", null);
      dLE.doY().t("havenWorldCatalogPlacingMode", Boolean.valueOf(false));

      aWc.blo().eO(600012L);

      aWc.blo().f(0.2F, 1000);
      aWc.blo().e(0.2F, 1000);
    }
    super.a(paramaqv, paramBoolean);
  }

  public cuF ua()
  {
    Object localObject = dLE.doY().rv("selectedBuilding");
    if (localObject == null) {
      return null;
    }

    long l = ((boU)localObject).oj();
    return this.aQq.cI(l);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      bUO.stopScroll(null);
      cdT();
      this.aQq = null;
      cBQ.cxL().b(this.N);

      ckU.cmE().done();

      this.aRn = null;
      this.hpR = 0;

      if (this.hpQ != null) {
        this.hpQ.clear();
      }

      this.hpQ = null;
      dLE.doY().removeProperty("havenWorldCatalog");
      dLE.doY().removeProperty("havenWorldConflictList");

      if (this.hpP != null) {
        this.hpP.getHavenWorldImages().aEs();
      }
      cBQ.cxL().mW("worldEditorDialog");
      cBQ.cxL().mN("wakfu.worldEditor");

      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localbyz.bSf();
        localbyz.aeL().b(this);
      }

      aWc.blo().eO(600013L);

      aWc.blo().f(1.0F, 1000);
      aWc.blo().e(1.0F, 1000);
    }
    this.hpP = null;
    super.b(paramaqv, paramBoolean);
  }

  private void cdV() {
    this.hpQ = new mw(this.aQT);
    cdU();
    dLE.doY().t("havenWorldCatalog", this.hpQ);
    dLE.doY().t("havenWorldCatalogQuotationMode", Boolean.valueOf(false));
    dLE.doY().t("havenWorldSelectedCatalogEntry", null);
  }

  private void cdW() {
    cpa localcpa = cBQ.cxL().coO().nf("worldEditorDialog");
    dOc localdOc = (dOc)localcpa.fi("resourceCostContainer");
    o(localdOc);
  }

  public void cdX() {
    cpa localcpa = cBQ.cxL().coO().nf("worldEditorDialog");
    dOc localdOc = (dOc)localcpa.fi("moneyCostContainer");
    o(localdOc);
  }

  public void cdY() {
    cpa localcpa = cBQ.cxL().coO().nf("worldEditorDialog");
    dOc localdOc = (dOc)localcpa.fi("sidoaCostContainer");
    o(localdOc);
  }

  private void o(dOc paramdOc)
  {
    bNa localbNa1;
    if (paramdOc.getAppearance().getModulationColor() == null)
      localbNa1 = bNa.gRx;
    else {
      localbNa1 = paramdOc.getAppearance().getModulationColor();
    }
    bNa localbNa2 = bNa.gRu;

    gm localgm = new gm(localbNa1, localbNa2, paramdOc.getAppearance(), 0, 250, 4, true, ddp.kWG);
    paramdOc.getAppearance().a(localgm);
  }

  public void cdZ() {
    if (this.hpR <= 0) {
      return;
    }
    bOK localbOK = ckU.cmE().FO();
    localbOK.gs(1);
    this.hpR -= 1;
    if (this.hpR <= 0) {
      dLE.doY().a(this.hpQ, mw.bF);
      ckU.cmE().done();
    }
  }

  public bBg uj() {
    return this.aQT;
  }

  public mw cea() {
    return this.hpQ;
  }

  private void b(short paramShort1, int paramInt, short paramShort2, short paramShort3, long paramLong1, long paramLong2) {
    new xT(this.aQq, null).a(paramShort1, paramInt, paramShort2, paramShort3, paramLong1, paramLong2);
    cuF localcuF = this.aQq.cI(paramLong1);
    cbR localcbR = new cbR(new bFA(localcuF));
    jZ localjZ = new jZ(localcbR);
    localjZ.b(this.hpP);
    a(this.aQq);
    cdU();
  }

  private void a(long paramLong, short paramShort1, short paramShort2) {
    cuF localcuF = this.aQq.cI(paramLong);
    aT(paramLong);
    b(localcuF.adj().nc(), localcuF.adl(), paramShort1, paramShort2, paramLong, localcuF.rb());
  }

  private void D(long paramLong1, long paramLong2) {
    cuF localcuF = this.aQq.cI(paramLong1);
    dAi localdAi = ars.dzL.aN(localcuF.adj().nc());
    short s = localdAi.ddx();

    aT(paramLong1);
    b(s, localcuF.adl(), localcuF.nx(), localcuF.ny(), paramLong1, paramLong2);
    a(this.aQq);
    cdU();
  }

  private void aT(long paramLong) {
    cuF localcuF = this.aQq.cI(paramLong);
    cbR localcbR = new cbR(new bFA(localcuF));
    cfs localcfs = new cfs(localcbR);

    new xT(this.aQq, null).aT(paramLong);

    localcfs.b(this.hpP);
    cdU();
  }

  public void c(bH parambH) {
    dDO localdDO = d(parambH);
    if (localdDO != null)
      localdDO.b(this.hpP);
    Object localObject;
    if (parambH.eT() == bqr.fLA) {
      localObject = (jk)parambH;
      b(((jk)localObject).rc(), 0, ((jk)localObject).nx(), ((jk)localObject).ny(), ((jk)localObject).gv(), ((jk)localObject).rb());
      return;
    }
    if (parambH.eT() == bqr.fLH) {
      localObject = (aEV)parambH;
      a(((aEV)localObject).gv(), ((aEV)localObject).nx(), ((aEV)localObject).ny());
      return;
    }
    if (parambH.eT() == bqr.fLB) {
      localObject = (clB)parambH;
      aT(((clB)localObject).gv());
      return;
    }
    if (parambH.eT() == bqr.fLC) {
      localObject = (azN)parambH;
      D(((azN)localObject).gv(), ((azN)localObject).rb());
      return;
    }
  }

  public void b(bH parambH, je paramje) {
    dDO localdDO = d(parambH);
    if (localdDO != null)
      localdDO.f(this.hpP);
  }

  private dDO d(bH parambH)
  {
    Object localObject1;
    if (parambH.eT() == bqr.fLA) {
      localObject1 = (jk)parambH;
      return new jZ(new cbR(new bFA(((jk)localObject1).gv(), ((jk)localObject1).rc(), 0, ((jk)localObject1).nx(), ((jk)localObject1).ny())));
    }
    Object localObject2;
    if (parambH.eT() == bqr.fLB) {
      localObject1 = (clB)parambH;
      localObject2 = this.aQq.cI(((clB)localObject1).gv());
      return new cfs(new cbR(new bFA((cuF)localObject2)));
    }
    if (parambH.eT() == bqr.fLz) {
      localObject1 = (ctl)parambH;
      localObject2 = ars.dzL.aP(((ctl)localObject1).bqQ());
      return new ie(new bcQ((cDs)localObject2, ((ctl)localObject1).cqW(), ((ctl)localObject1).cqX()), ((ctl)localObject1).pQ());
    }
    if (parambH.eT() == bqr.fLH) {
      localObject1 = (aEV)parambH;
      localObject2 = this.aQq.cI(((aEV)localObject1).gv());
      return new ckt(new cbR(new bFA((cuF)localObject2)), ((cuF)localObject2).nx(), ((cuF)localObject2).ny());
    }
    return null;
  }

  public void a(cKg paramcKg)
  {
    super.a(paramcKg);
    this.aQT.d(paramcKg);
    paramcKg.a(this);
  }

  public void a(dMM paramdMM, cuB paramcuB) {
    byv.bFN().b(this);
  }

  public void ceb() {
    dLE.doY().t("havenWorldConflictList", null);
    this.hpP.bdi();
    this.hpP.refresh();
  }

  public int cec() {
    return this.hpS;
  }

  public void uq(int paramInt) {
    this.hpS = paramInt;
    String str = bU.fH().iK(paramInt);
    dLE.doY().t("guildMoney", str);
  }

  public void a(bpu parambpu) {
  }

  public void a(cuF paramcuF) {
  }

  public void b(cuF paramcuF) {
  }

  public void a(bnt parambnt) {
  }

  public void b(bnt parambnt) {
  }

  public void bG(int paramInt) {
    cdU();
    if (this.hpQ != null)
      this.hpQ.bG(paramInt);
  }

  public int cU(short paramShort)
  {
    aPA localaPA = new aPA(paramShort);
    this.aQT.o(localaPA);
    return localaPA.getCount();
  }
}