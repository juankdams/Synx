import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bTX
  implements cvW
{
  protected static final Logger K = Logger.getLogger(bTX.class);
  private static bTX hfR = new bTX();
  private bnm N;
  private String hfS;
  private ArrayList hfT = new ArrayList();
  private ArrayList hfU = new ArrayList();

  public static bTX cah()
  {
    return hfR;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject3;
    long l1;
    Object localObject4;
    Object localObject5;
    Object localObject2;
    switch (paramcWG.getId()) {
    case 18403:
    case 18417:
    case 18418:
      localObject1 = (bzu)paramcWG;
      String str = ((bzu)localObject1).getStringValue();
      localObject3 = new dWx();
      ((dWx)localObject3).sl(str);
      byv.bFN().aJK().d((cWG)localObject3);
      dLE.doY().t("speechDirty", Boolean.valueOf(false));
      dLE.doY().t("speechVisualisationMode", Boolean.valueOf(true));
      return false;
    case 18406:
      localObject1 = new aAi();
      byv.bFN().aJK().d((cWG)localObject1);
      gG(false);
      return false;
    case 18415:
      localObject1 = new cSq();
      byv.bFN().aJK().d((cWG)localObject1);
      gG(false);
      return false;
    case 18416:
      localObject1 = new dal();
      ((dal)localObject1).eQ(bPE.bWu().bWG());
      byv.bFN().aJK().d((cWG)localObject1);
      gG(false);
      return false;
    case 18407:
      localObject1 = (bzu)paramcWG;
      l1 = ((bzu)localObject1).ah();
      localObject4 = ((bzu)localObject1).getStringValue();
      localObject5 = new djq();
      ((djq)localObject5).a(l1);
      ((djq)localObject5).setName((String)localObject4);
      byv.bFN().aJK().d((cWG)localObject5);
      return false;
    case 18409:
      localObject1 = (bzu)paramcWG;
      l1 = ((bzu)localObject1).ah();
      localObject4 = "governmentMemberDetailsDialog_" + l1;
      if (cBQ.cxL().mZ((String)localObject4))
        a(null, l1);
      else {
        a(bPE.bWu().UI().aNd().n(Yp.cj(l1)));
      }
      return false;
    case 18408:
      localObject1 = (bzu)paramcWG;
      l1 = ((bzu)localObject1).ah();
      localObject4 = bPE.bWu().UI();
      localObject5 = byv.bFN().bFO();
      Yp localYp = ((byz)localObject5).cJf().HK();
      if (localYp == null) {
        return false;
      }
      ((aYr)localObject4).a(localYp, Yp.cj(l1), cuX.ifI);
      return false;
    case 18404:
      localObject1 = (bzu)paramcWG;
      short s = ((bzu)localObject1).ag();
      localObject3 = new amy();
      ((amy)localObject3).aE(s);
      byv.bFN().aJK().d((cWG)localObject3);
      return false;
    case 18410:
      localObject1 = (bzu)paramcWG;
      long l2 = ((bzu)localObject1).ah();
      if (this.hfU.contains(Long.valueOf(l2)))
        this.hfU.remove(Long.valueOf(l2));
      else {
        this.hfU.add(Long.valueOf(l2));
      }
      bPE.bWu().bWE();
      dLE.doY().t("lawsDirty", Boolean.valueOf(this.hfU.size() > 0));
      return false;
    case 18412:
      if (this.hfU.size() == 0)
        return false;
      localObject1 = bPE.bWu().bXg();
      localObject2 = new cim();
      ((cim)localObject2).b((bKR)localObject1);
      byv.bFN().aJK().d((cWG)localObject2);
      this.hfU.clear();
      dLE.doY().t("lawsDirty", Boolean.valueOf(false));
      return false;
    case 18411:
      bPE.bWu().bXh();
      this.hfU.clear();
      bPE.bWu().bWE();
      dLE.doY().t("lawsDirty", Boolean.valueOf(false));
      return false;
    case 18413:
      localObject1 = (cjW)paramcWG;
      localObject2 = new uR();
      ((uR)localObject2).dc(((cjW)localObject1).bP());
      ((uR)localObject2).G(((cjW)localObject1).clS());
      byv.bFN().aJK().d((cWG)localObject2);
      gG(false);
      return false;
    case 18414:
      localObject1 = (bzu)paramcWG;
      localObject2 = new akK();
      ((akK)localObject2).dc(((bzu)localObject1).getIntValue());
      byv.bFN().aJK().d((cWG)localObject2);
      gG(false);
      return false;
    case 18405:
    }
    return true;
  }

  public void gG(boolean paramBoolean) {
    aig.dej.o("nationLock", paramBoolean);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  private cNL getTableModel() {
    cNL localcNL = new cNL();

    localcNL.a("territories", new bnU(new RU(this)));

    localcNL.a("wills", new bnU(new RI(this)));

    localcNL.a("taxes", new bnU(new RF(this)));

    localcNL.a("cash", new bnU(new RC(this)));

    return localcNL;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (byv.bFN().bFO().cJf().UI().equals(aYr.feh))
        return;
      this.N = new RA(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("speechDirty", Boolean.valueOf(false));
      dLE.doY().t("speechVisualisationMode", Boolean.valueOf(true));
      dLE.doY().t("lawsDirty", Boolean.valueOf(false));

      if (dLE.doY().getProperty("nationCurrentPageIndex") == null) {
        dLE.doY().t("nationCurrentPageIndex", Integer.valueOf(0));
      }

      aig.dej.ev("nationLock");
      cBQ.cxL().a("nationDialog", VV.dJ("nationDialog"), 32769L, (short)10000);

      cpa localcpa = cBQ.cxL().coO().nf("nationDialog");
      if (localcpa != null) {
        localObject = getTableModel();
        aXE localaXE = (aXE)localcpa.fi("protectorTable");
        if (localaXE != null) {
          localaXE.setTableModel((cNL)localObject);
        }

      }

      Object localObject = new aMy();
      byv.bFN().aJK().d((cWG)localObject);

      cBQ.cxL().j("wakfu.nation", aTm.class);

      aWc.blo().blC();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      clean();
      bPE.bWu().bWJ();

      dLE.doY().removeProperty("speechDirty");
      dLE.doY().removeProperty("speechVisualisationMode");
      dLE.doY().removeProperty("nationCurrentPageIndex");
      dLE.doY().removeProperty("lawsDirty");

      cBQ.cxL().mW("nationDialog");
      aig.dej.ew("nationLock");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.nation");

      aWc.blo().blD();
    }
  }

  private void clean()
  {
    for (String str : this.hfT) {
      cBQ.cxL().mW(str);
    }
    this.hfT.clear();
    cai();
    this.hfS = null;
  }

  public void cai() {
    this.hfU.clear();
  }

  public void a(dpE paramdpE)
  {
    a(paramdpE, paramdpE.HK().getId());
  }

  public void a(dpE paramdpE, long paramLong)
  {
    String str2 = "governmentMemberDetailsDialog";
    String str1 = str2 + "_" + paramLong;
    if ((!cBQ.cxL().mZ(str1)) && (paramdpE != null)) {
      String str3 = this.hfS == null ? "nationDialog" : this.hfS;

      cBQ.cxL().a(str1, VV.dJ(str2), str3, "nationDialog", str2, 1L, (short)10000);

      this.hfS = str1;
      aRj localaRj = new aRj(paramdpE, bPE.bWu().gT(paramdpE.HK().getId()));
      dLE.doY().a("governmentMemberDetails", localaRj, str1);

      this.hfT.add(str1);
    } else {
      cBQ.cxL().mW(str1);
      this.hfT.remove(str1);
      if (str1.equals(this.hfS))
        this.hfS = null;
    }
  }
}