import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class bAO extends pM
  implements auP
{
  private static final Logger K = Logger.getLogger(bAO.class);

  public static final bAO gqI = new bAO();
  private ajO gqJ;
  private int gqK;
  private ctB gqL;
  private cSR gqM;
  private ArrayList gqN = new ArrayList();
  private int gqO;
  private boolean gqP;
  private Runnable cdh;
  private Jg czl;
  private cSR gqQ = new cSR();
  private bnm N;
  private short gqR = 0;

  private djH gqS = null;
  public static final int gqT = 0;
  public static final int gqU = 1;
  public static final int gqV = 2;

  public static bAO bJl()
  {
    return gqI;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject3;
    short s1;
    short s2;
    switch (paramcWG.getId())
    {
    case 19264:
      localObject1 = (bzu)paramcWG;

      if (((bzu)localObject1).getIntValue() == this.gqO) {
        return false;
      }
      this.gqO = ((bzu)localObject1).getIntValue();
      Object localObject2;
      switch (this.gqO) {
      case 0:
        localObject2 = this.gqS.cSz();
        break;
      case 1:
        localObject2 = new aEP();
        break;
      case 2:
        localObject2 = new cuS();
        break;
      default:
        localObject2 = null;
      }

      if (localObject2 == null) {
        return false;
      }
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    case 19263:
      localObject1 = (bzu)paramcWG;
      long l1 = ((bzu)localObject1).ah();
      localObject3 = new arf(l1);
      byv.bFN().aJK().d((cWG)localObject3);
      switch (this.gqO) {
      case 0:
      case 1:
        cPR.kzo.iZ(l1);
        break;
      case 2:
        cPR.kzo.iY(l1);
      }

      return false;
    case 19258:
      localObject1 = (dce)paramcWG;
      gA localgA = ((dce)localObject1).getItem();
      if ((localgA.or()) || ((localgA.oi().a(Aq.bvS) != null) && (!localgA.oi().a(Aq.bvS).i(byv.bFN().bFO(), byv.bFN().bFO().ML(), localgA, byv.bFN().bFO().bEY()))))
      {
        K.warn("L'objet " + localgA.ok() + " n'a pas le droit d'être mis en vente");
        String str = bU.fH().getString("market.addItem.unauthorized");
        localObject3 = new aEe(str);
        ((aEe)localObject3).mm(3);
        CM.LV().ez(3).a((aEe)localObject3);
        fI(true);
        return false;
      }
      this.aUe = localgA;
      s1 = ((dce)localObject1).ag();
      b(localgA.q(false), s1 == -1 ? localgA.nP() : s1);
      dLE.doY().a(this.aWp, BG.bF);
      return false;
    case 19262:
      localObject1 = (bzu)paramcWG;
      long l2 = ((bzu)localObject1).ah();
      localObject3 = new cCR();
      ((cCR)localObject3).jdMethod_if(l2);
      s2 = ((bzu)localObject1).ag();
      ((cCR)localObject3).dt(s2);
      byv.bFN().aJK().d((cWG)localObject3);
      if (cPR.kzo.p(l2, s2)) {
        byv.bFN().aJK().d(this.gqS.cSz());
      }

      return false;
    case 19242:
      this.gqR = ((short)(this.gqR + 10));
      if (this.gqR < 0) {
        this.gqR = 32757;
      }
      this.gqS.cSz().bL(this.gqR);
      byv.bFN().aJK().d(this.gqS.cSz());
      return false;
    case 19243:
      this.gqR = ((short)Math.max(0, this.gqR - 10));
      this.gqS.cSz().bL(this.gqR);
      byv.bFN().aJK().d(this.gqS.cSz());
      return false;
    case 19244:
      this.gqR = 0;
      this.gqS.cSz().bL(this.gqR);
      byv.bFN().aJK().d(this.gqS.cSz());
      return false;
    case 19245:
      this.gqR = ((short)(cPR.kzo.cGR() - cPR.kzo.cGR() % 10));
      this.gqS.cSz().bL(this.gqR);
      byv.bFN().aJK().d(this.gqS.cSz());
      return false;
    case 19259:
      if (this.aWp == null) {
        return false;
      }
      localObject1 = new aGN(this.aUe.oj(), this.aWp.Hy().ewr, (short)(this.aWp.nP() / this.aWp.Hy().goO), this.aWp.Hv(), this.aWp.KI().ewr);

      byv.bFN().aJK().d((cWG)localObject1);
      bJp();
      return false;
    case 19266:
      bJp();
      return false;
    case 19253:
      cPR.kzo.cGS();
      dLE.doY().t("marketSearchDirty", Boolean.valueOf(false));
      dLE.doY().a(cPR.kzo, new String[] { "results" });

      localObject1 = (FV)paramcWG;
      ya localya = cPR.kzo.cGV();
      s1 = localya == null ? -1 : localya.nc();
      localObject3 = ((FV)localObject1).getName();
      s2 = ((FV)localObject1).Qb();
      short s3 = ((FV)localObject1).nV();
      short s4 = ((FV)localObject1).Qc();
      short s5 = ((FV)localObject1).Qd();
      boolean bool = ((FV)localObject1).Qe();

      this.gqN.clear();
      this.gqR = 0;

      int i = ((localObject3 != null) && (((String)localObject3).length() > 0)) || (s2 != -1) || (s3 != -1) ? 1 : 0;
      if (i != 0) {
        a((String)localObject3, localya, s2, s3);
        localObject4 = a(s4, s5, bool);
        if (localObject4 != null) {
          dLE.doY().t("marketBoard.SearchError", bU.fH().getString((String)localObject4));
          bJm();
          return false;
        }
      }
      Object localObject4 = this.gqS.cSz();
      ((bfb)localObject4).bK(s1);
      ((bfb)localObject4).pf(s4);
      ((bfb)localObject4).pg(s5);
      ((bfb)localObject4).cG(this.gqL == null ? -1 : this.gqL.bUy);
      ((bfb)localObject4).bL(this.gqR);
      ((bfb)localObject4).F(this.gqN);
      ((bfb)localObject4).eD(bool);

      this.gqS.H(s2);
      this.gqS.I(s3);
      this.gqS.setName((String)localObject3);
      this.gqS.a((bfb)localObject4);
      byv.bFN().aJK().d((cWG)localObject4);
      return false;
    case 19265:
      byv.bFN().aJK().d(new aWW());
      cPR.kzo.cGT();
      dLE.doY().a(cPR.kzo, new String[] { "history", "moneyStocked", "hasMoneyStocked" });
      return false;
    case 19267:
      byv.bFN().aJK().d(new iV());
      cPR.kzo.cGU();
      dLE.doY().a(cPR.kzo, new String[] { "history", "hasUnsoldStocked" });
      return false;
    case 19246:
    case 19247:
    case 19248:
    case 19249:
    case 19250:
    case 19251:
    case 19252:
    case 19254:
    case 19255:
    case 19256:
    case 19257:
    case 19260:
    case 19261: } return super.a(paramcWG);
  }

  private String a(short paramShort1, short paramShort2, boolean paramBoolean)
  {
    if (this.gqN.size() > 200) {
      K.error("Recherche trop vague ! (" + this.gqN + " )");
      return "marketBoard.searchError";
    }
    if (this.gqN.isEmpty()) {
      K.error("Aucun item ne correspond à votre recherche");
      return "marketBoard.noResult";
    }
    return null;
  }

  public void bJm() {
    if (this.gqP) {
      return;
    }
    this.gqP = true;

    aga localaga = fH(true);
    if (localaga == null) {
      return;
    }
    localaga.a(new dKp(this, localaga));
  }

  private aga fH(boolean paramBoolean)
  {
    cpa localcpa = cBQ.cxL().coO().nf("marketDialog");
    if (localcpa == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();

    dOc localdOc = null;
    localdOc = (dOc)localcpa.fi("errorContainer");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("errorLabel");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }

    if (localdOc != null)
    {
      bNa localbNa1;
      bNa localbNa2;
      if (paramBoolean) {
        localbNa1 = new bNa(bNa.gRu.get());
        localbNa2 = new bNa(bNa.gRx.get());
      } else {
        localbNa1 = new bNa(bNa.gRx.get());
        localbNa2 = new bNa(bNa.gRu.get());
      }
      localdOc.J(aga.class);
      aga localaga = new aga(localbNa1, localbNa2, localArrayList, 0, 1000, 1, ddp.kWG);
      localdOc.a(localaga);
      return localaga;
    }
    return null;
  }

  private void a(String paramString, ya paramya, short paramShort1, short paramShort2) {
    this.gqN.clear();
    if (this.gqM == null) {
      this.gqM = ((vd)vd.QM()).DZ();
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    localArrayList1.add(paramString);

    Pattern localPattern1 = null;
    Pattern localPattern2 = null;
    try
    {
      String str1;
      int i;
      if (localArrayList1.size() > 0) {
        str1 = "";
        for (i = 0; i < localArrayList1.size(); i++) {
          if (i > 0) {
            str1 = str1 + "|";
          }
          localObject = dzp.ib(((String)localArrayList1.get(i)).trim().toLowerCase());
          str1 = str1 + ".*" + (String)localObject + ".*";
        }
        localPattern1 = Pattern.compile(str1);
      }

      if (localArrayList2.size() > 0) {
        str1 = "";
        for (i = 0; i < localArrayList2.size(); i++) {
          if (i > 0) {
            str1 = str1 + "|";
          }
          localObject = dzp.ib(((String)localArrayList2.get(i)).trim().toLowerCase());
          str1 = str1 + ".*" + (String)localObject + ".*";
        }
        localPattern2 = Pattern.compile(str1);
      }
    } catch (Exception localException1) {
      K.error(localException1.getMessage());
      dLE.doY().t("marketBoard.SearchError", bU.fH().getString("marketBoard.noResult"));
      bJm();
      return;
    }

    long l = System.currentTimeMillis();
    for (Object localObject = this.gqM.yF(); ((dmn)localObject).hasNext(); ) {
      if (System.currentTimeMillis() - l > 10000L) {
        System.err.println("fail");
        return;
      }
      ((dmn)localObject).fl();
      bBn localbBn = (bBn)((dmn)localObject).value();
      if (localbBn == null)
        K.error("RefItem null dans la liste ! Cela ne devrait pas arriver.");
      else
        try
        {
          short s = localbBn.nU();
          if (((paramya == null) || (localbBn.bKn().c(paramya))) && (
            ((paramShort1 != -1) && (s < paramShort1)) || ((paramShort2 == -1) || (s <= paramShort2))))
          {
            if ((localArrayList1.size() > 0) || (localArrayList2.size() > 0)) {
              String str2 = dzp.ib(localbBn.getName().toLowerCase());
              Matcher localMatcher;
              if (localPattern1 != null) {
                localMatcher = localPattern1.matcher(str2);
                if (localMatcher.matches()) {
                  this.gqN.add(Integer.valueOf(localbBn.getId()));
                }
              }
              if (localPattern2 != null) {
                localMatcher = localPattern2.matcher(str2);
                if (localMatcher.matches())
                  this.gqN.remove(Integer.valueOf(localbBn.getId()));
              }
            }
            else {
              this.gqN.add(Integer.valueOf(localbBn.getId()));
            }
          }
        } catch (Exception localException2) { K.error("Erreur en parcourant les refItems dans la recherche du marché sur le refItme d'id=" + localbBn.getId() + "\n" + localException2.getMessage());
          dLE.doY().t("marketBoard.SearchError", bU.fH().getString("marketBoard.noResult"));
          bJm();
          return; }
    }
  }

  public void bJn()
  {
    fI(false);
  }

  public void fI(boolean paramBoolean) {
    if (this.czl == null) {
      localObject1 = cBQ.cxL().coO().nf("marketDialog");
      if (localObject1 == null) {
        return;
      }
      localObject2 = (axU)((cpa)localObject1).fi("dropRenderable");
      localObject1 = ((axU)localObject2).getInnerElementMap();
      if (localObject1 == null) {
        return;
      }
      localObject3 = new ArrayList();

      dOc localdOc = null;
      localdOc = (dOc)((cpa)localObject1).fi("dropContainer");
      if (localdOc == null) {
        return;
      }
      this.czl = localdOc.getAppearance();
    }

    Object localObject1 = new bNa(bNa.gRx.get());
    Object localObject2 = new bNa(paramBoolean ? clP.hPe.get() : clP.hPd.get());

    this.czl.J(gm.class);
    this.czl.setModulationColor((bNa)localObject1);
    Object localObject3 = new gm((bNa)localObject1, (bNa)localObject2, this.czl, 0, 500, paramBoolean ? 3 : -1, ddp.kWG);
    this.czl.a((cKq)localObject3);
  }

  public void bJo()
  {
    if (this.czl != null)
      this.czl.J(gm.class);
  }

  public void d(int paramInt, String paramString)
  {
    if (!this.gqQ.containsKey(paramInt)) {
      this.gqQ.put(paramInt, new ArrayList());
    }
    ArrayList localArrayList = (ArrayList)this.gqQ.get(paramInt);
    if (!localArrayList.contains(paramString))
      localArrayList.add(paramString);
  }

  public int x(String paramString)
  {
    if (jA(paramString)) {
      return 0;
    }
    if (!this.gqQ.isEmpty()) {
      return 3;
    }
    return 0;
  }

  private boolean jA(String paramString) {
    for (dmn localdmn = this.gqQ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ArrayList localArrayList = (ArrayList)localdmn.value();
      if (localArrayList.contains(paramString)) {
        localArrayList.remove(paramString);
        if (localArrayList.isEmpty()) {
          localdmn.remove();
        }
        return true;
      }
    }
    return false;
  }

  private cNL getTableModel()
  {
    cNL localcNL = new cNL();

    localcNL.a(new dKs(this));

    return localcNL;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      bIE.bPR();

      this.aWs = cVE.kIa;

      this.N = new dKn(this);

      cBQ.cxL().a(this.N);

      aig.dej.ev("marketBoardSearchLock");

      byv.bFN().b(Rl.acN());

      cBQ.cxL().a("marketDialog", VV.dJ("marketDialog"), 32768L, (short)10000);

      cpa localcpa = cBQ.cxL().coO().nf("marketDialog");
      if (localcpa != null) {
        localObject = getTableModel();
        aXE localaXE = (aXE)localcpa.fi("results");
        if (localaXE != null) {
          localaXE.setTableModel((cNL)localObject);
        }

      }

      cBQ.cxL().j("wakfu.market", cOI.class);

      dLE.doY().t("market", cPR.kzo);
      dLE.doY().t("marketSearchDirty", Boolean.valueOf(false));
      dLE.doY().t("marketSearchInvalid", Boolean.valueOf(false));
      dLE.doY().a("currentPage", Integer.valueOf(0), "marketDialog");

      if (this.gqS == null) {
        this.gqS = new djH();
      }
      Object localObject = this.gqS.cSz();

      ((bfb)localObject).bL((short)0);
      ((bfb)localObject).cG((byte)-1);
      byv.bFN().aJK().d((cWG)localObject);
      dLE.doY().t("marketSavedSearch", this.gqS);

      aWc.blo().eO(600012L);

      super.a(paramaqv, paramBoolean);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.gqQ.clear();
      if (this.cdh != null) {
        dka.cSF().j(this.cdh);
      }
      cPR.kzo.clean();
      if (this.gqS.cSz().bsA() == -1) {
        cPR.kzo.cGQ();
      }
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localbyz.bSf();
      }
      cBQ.cxL().b(this.N);

      bBq.bKG().b(this);

      cBQ.cxL().mW("marketDialog");
      aig.dej.ew("marketBoardSearchLock");

      cOI.clean();
      cBQ.cxL().mN("wakfu.market");

      dLE.doY().removeProperty("market");

      this.gqP = false;
      this.gqJ = null;
      this.gqM = null;
      this.gqN.clear();
      this.gqO = 0;
      this.gqR = 0;
      this.czl = null;
      this.gqL = null;

      byv.bFN().a(Rl.acN());

      aWc.blo().eO(600008L);

      super.b(paramaqv, paramBoolean);
    }
  }

  public void a(ajO paramajO) {
    if (this.gqK != paramajO.axd()) {
      this.gqK = paramajO.axd();
    }
    this.gqJ = paramajO;
  }

  private void bJp() {
    this.aWp.setItem(null);
    this.aWr = -1;
    this.aWp.b(bCe.gwo);
    this.aWp.ed(0);
    dLE.doY().a(this.aWp, BG.bF);
  }

  public short bJq() {
    return this.gqR;
  }

  public ajO bJr() {
    return this.gqJ;
  }

  public int bJs() {
    return this.gqO;
  }
}