import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class avV
  implements bSX, bbk, cvW
{
  protected static final Logger K = Logger.getLogger(avV.class);

  private static final avV dKQ = new avV();
  static final int chb = 250;
  private static final byte chc = 1;
  private static final String chd = "progressBar";
  private static final String che = "startButton";
  private bnm N;
  cMb chf;
  private bwe chg;
  private cpa buE;
  gA dKR;
  private bBn dKS;
  private bBn dKT;
  private bBn dKU;
  private ArrayList dKV;
  private boolean dKW;
  private byte dKX;

  private avV()
  {
    this.chf = null;
  }

  public void abg() {
    byz localbyz = byv.bFN().bFO();
    localbyz.ayJ().d(this);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((cRs)localcHu.value()).d(this);
    }
    abh();

    w(null);
    aHY();
  }

  public void clean() {
    byz localbyz = byv.bFN().bFO();
    localbyz.ayJ().c(this);
    for (cHu localcHu = localbyz.bGP().cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((cRs)localcHu.value()).c(this);
    }
    abh();
  }

  private void abh() {
    dLE.doY().removeProperty("mergeGem.item");
    w(null);
  }

  public void cS(boolean paramBoolean) {
    axU localaxU = (axU)this.buE.fi("gemItem");
    dOc localdOc = (dOc)localaxU.getInnerElementMap().fi("ingredientBackgroundContainer");
    localdOc.setStyle(paramBoolean ? "itemSelectedBackground" : "itemBackground");
  }

  private void w(gA paramgA) {
    this.dKR = paramgA;
    dLE.doY().t("mergeGem.item", this.dKR);
    this.dKU = a(this.dKR, cpu.hYF);
    dLE.doY().t("mergeGem.itemLevelUp", this.dKU);
    this.dKT = a(this.dKR, cpu.hYG);
    dLE.doY().t("mergeGem.itemRarityUp", this.dKT);
    this.dKS = a(this.dKR, cpu.hYH);
    dLE.doY().t("mergeGem.itemTypeUp", this.dKS);

    a((short)1, cpu.hYH);
    a((short)1, cpu.hYF);
    a((short)1, cpu.hYG);
  }

  private void a(short paramShort, cpu paramcpu) {
    aTp localaTp = a(paramcpu);
    if (localaTp == null) {
      return;
    }

    bBn localbBn = c(paramcpu);
    if (localbBn == null) {
      localaTp.setText("0");
      return;
    }

    int i = this.dKR.nP() / paramcpu.aHZ();
    int j = Math.min(i, Math.min(paramShort, localbBn.nR()));

    localaTp.setText(String.valueOf(j));
  }

  private aTp a(cpu paramcpu) {
    cpa localcpa = cBQ.cxL().coO().nf(MK());
    if (localcpa == null) {
      return null;
    }
    return (aTp)localcpa.fi("quantity" + paramcpu.bJ());
  }

  private void b(cpu paramcpu) {
    bBn localbBn = c(paramcpu);
    short s = (short)Math.min(localbBn == null ? 0 : localbBn.nR(), this.dKR.nP() / paramcpu.aHZ());
    a(s, paramcpu);
  }

  private gA kA(int paramInt) {
    int i = 0; for (int j = this.dKV.size(); i < j; i++) {
      gA localgA = (gA)this.dKV.get(i);
      if (localgA.ok() == paramInt) {
        return localgA;
      }
    }

    return null;
  }

  private bBn c(cpu paramcpu) {
    switch (aoX.duB[paramcpu.ordinal()]) {
    case 1:
      return this.dKT;
    case 2:
      return this.dKU;
    case 3:
      return this.dKS;
    }
    return null;
  }

  private bBn a(gA paramgA, cpu paramcpu)
  {
    if ((paramgA != null) && (paramcpu.h(paramgA.oi()))) {
      return cvS.a(paramgA.oi(), paramcpu);
    }
    return null;
  }

  public void a(cRs paramcRs) {
    paramcRs.d(this);
  }

  public void b(cRs paramcRs) {
    paramcRs.c(this);
  }

  public void a(bNz parambNz)
  {
    Object localObject;
    switch (aoX.aOs[parambNz.bVg().ordinal()]) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      localObject = (YS)parambNz;
      gA localgA1 = (gA)((YS)localObject).akr();
      if ((this.dKR != null) && (localgA1.ok() == this.dKR.ok())) {
        ArrayList localArrayList = byv.bFN().bFO().bGP().hi(localgA1.ok());
        short s = 0;
        for (int i = localArrayList.size() - 1; i >= 0; i--) {
          s = (short)(s + ((gA)localArrayList.get(i)).nP());
        }
        if (s >= aHZ()) {
          this.dKR.l(s);
          gA localgA2 = kA(this.dKR.ok());
          if (localgA2 != null)
            localgA2.l(this.dKR.nP());
        }
        else {
          w(null);
          aHY();
        }
      } else if (x(localgA1)) {
        aHY(); } break;
    case 6:
      localObject = byv.bFN().bFO().bGP();
      if ((this.dKR != null) && (!((bMD)localObject).N(this.dKR.oj()))) {
        w(null);
      }

      aHY();
      break;
    }
  }

  private void aHY()
  {
    int i = aHZ();

    il localil = new il();

    ArrayList localArrayList1 = byv.bFN().bFO().bGP().a(new arq(this));

    for (int j = localArrayList1.size() - 1; j >= 0; j--) {
      localObject = (gA)localArrayList1.get(j);
      localil.a(((gA)localObject).ok(), ((gA)localObject).nP(), ((gA)localObject).nP());
    }

    ArrayList localArrayList2 = new ArrayList();
    for (Object localObject = localil.qd(); ((BZ)localObject).hasNext(); ) {
      ((BZ)localObject).fl();
      short s = ((BZ)localObject).Lb();
      if (s >= i)
      {
        cGm localcGm = new cGm(Hh.QM().dh(((BZ)localObject).zY()));
        localcGm.l(s);
        localArrayList2.add(localcGm);
      }
    }
    Collections.sort(localArrayList2, new apa(this));

    this.dKV = localArrayList2;

    dLE.doY().t("mergeGem.itemList", this.dKV);

    a((short)1, cpu.hYH);
    a((short)1, cpu.hYF);
    a((short)1, cpu.hYG);
  }

  private short aHZ() {
    if (this.dKW) {
      return cpu.hYH.aHZ();
    }
    return (short)Math.min(cpu.hYF.aHZ(), cpu.hYG.aHZ());
  }

  public boolean a(cWG paramcWG) {
    if (PO.g(paramcWG))
      return false;
    Object localObject1;
    int i;
    Object localObject3;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 16848:
      localObject1 = (afk)paramcWG;
      i = ((afk)localObject1).getIntValue();
      byte b = ((afk)localObject1).af();

      localObject3 = cpu.dO(b);
      a((short)i, (cpu)localObject3);
      return false;
    case 16849:
      localObject1 = (afk)paramcWG;
      i = ((afk)localObject1).af();

      cpu localcpu = cpu.dO(i);
      b(localcpu);

      return false;
    case 16846:
      localObject1 = (afk)paramcWG;
      long l = ((afk)localObject1).ah();

      if ((this.dKR != null) && (this.dKR.oj() == l)) {
        w(null);
      }

      cS(true);
      return false;
    case 16845:
      if (dLE.doY().getBooleanProperty("mergeGem.running")) {
        return false;
      }

      localObject1 = (czW)paramcWG;
      localObject2 = ((czW)localObject1).getItem();

      if (localObject2 != this.dKR) {
        return false;
      }

      w(null);

      dLE.doY().a((dBv)localObject2, new String[] { "usedInCurrentRecipe" });

      return false;
    case 16844:
      localObject1 = (czW)paramcWG;
      localObject2 = ((czW)localObject1).getItem();

      if (dLE.doY().getBooleanProperty("mergeGem.running")) {
        return false;
      }

      if (!x((gA)localObject2)) {
        return false;
      }

      if (!(localObject2 instanceof cGm)) {
        return false;
      }

      w((gA)localObject2);

      dLE.doY().a((dBv)localObject2, new String[] { "usedInCurrentRecipe" });
      cS(false);

      return false;
    case 16840:
      localObject1 = (bKY)paramcWG;
      this.dKX = ((bKY)localObject1).af();
      localObject2 = cpu.dO(this.dKX);

      localObject3 = a((cpu)localObject2);
      short s;
      if ((localObject3 == null) || (((aTp)localObject3).getText().length() == 0))
        s = 1;
      else {
        s = bUD.a(((aTp)localObject3).getText(), (short)1);
      }

      if (this.dKR != null)
      {
        cEn localcEn = new cEn();
        localcEn.xB(this.dKR.ok());
        localcEn.l(s);
        localcEn.eg(this.dKX);
        byv.bFN().aJK().d(localcEn);
        dLE.doY().t("mergeGem.running", Boolean.valueOf(true));
      }

      return false;
    case 16841:
    case 16842:
    case 16843:
    case 16847: } return true;
  }

  public void cT(boolean paramBoolean) {
    this.dKW = paramBoolean;
  }

  public String MK() {
    return this.dKW ? "mergePowderDialog" : "mergeGemDialog";
  }

  private boolean x(gA paramgA) {
    if (this.dKW) {
      return cpu.hYH.h(paramgA.oi());
    }
    return (cpu.hYF.h(paramgA.oi())) || (cpu.hYG.h(paramgA.oi()));
  }

  private static boolean bR(long paramLong)
  {
    byz localbyz = byv.bFN().bFO();
    return (localbyz.ayJ().ch(paramLong)) || (localbyz.bGP().N(paramLong));
  }

  public void cU(boolean paramBoolean)
  {
    cpa localcpa = cBQ.cxL().coO().nf(MK());
    if (localcpa != null) {
      alP localalP = (alP)localcpa.fi("progressBar" + this.dKX);
      br localbr = (br)localcpa.fi("startButton" + this.dKX);

      cag localcag = new cag();
      localcag.aJ();
      localcag.setAlignment(aFG.eck);
      localcag.setLevel(1);
      localcag.setFile(paramBoolean ? "6001038.xps" : "6001039.xps");
      localcag.setUseParentScissor(true);
      localcag.setRemovable(false);
      localbr.getAppearance().a(localcag);

      localalP.setTweenDuration(0L);
      localalP.setValue(0.0F);
    }

    dLE.doY().t("mergeGem.running", Boolean.valueOf(false));
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();

      this.chg = new aoZ(this);

      localbyz.aeL().a(this.chg);

      String str = MK();

      this.N = new aoY(this, str);

      cBQ.cxL().a(this.N);

      abg();

      aNL localaNL = cBQ.cxL().a(str, VV.dJ(str), 32768L, (short)10000);

      if (localaNL != null) {
        this.buE = localaNL.getElementMap();
      }

      cBQ.cxL().j("wakfu.mergeGem", cff.class);

      dLE.doY().t("mergeGem.running", Boolean.valueOf(false));
      dLE.doY().t("mergeGem.itemLevelUp.quantityNeeded", cpu.hYF.aHZ() + "x");
      dLE.doY().t("mergeGem.itemRarityUp.quantityNeeded", cpu.hYG.aHZ() + "x");
      dLE.doY().t("mergeGem.itemTypeUp.quantityNeeded", cpu.hYH.aHZ() + "x");

      a((short)1, cpu.hYH);
      a((short)1, cpu.hYF);
      a((short)1, cpu.hYG);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      byv.bFN().bFO().aeL().b(this.chg);
      this.chg = null;
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW(MK());

      cBQ.cxL().mN("wakfu.mergeGem");

      clean();

      if (this.chf != null) {
        this.chf.x((short)1);
        this.chf.sM();
      }
    }
  }

  public void a(cMb paramcMb) {
    this.chf = paramcMb;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public static avV aIa() {
    return dKQ;
  }
}