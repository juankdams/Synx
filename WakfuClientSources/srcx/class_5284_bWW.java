import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

public class bWW extends dLj
  implements Qt, dIX
{
  private static final bWW hlm = new bWW();
  private ayn hln;
  public static aBu hlo;
  public static aBu hlp;
  private ahm hlq;
  private beJ hlr = null;
  private ayn hls;
  private final ArrayList hlt = new ArrayList();

  public static bWW ccf() {
    return hlm;
  }

  public void a(cWT paramcWT)
  {
    aAA localaAA = aAA.ly(paramcWT.getId());
    if (localaAA == aAA.dTm) {
      KP.bXy.aM(-1);
      ayn localayn = (ayn)paramcWT.boT();
      if (this.hln != localayn)
        f(localayn);
    }
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("animation")) {
      if (this.hln == null) {
        return null;
      }
      return a(CB(), aDD.dYy);
    }if (paramString.equals("animName"))
      return aDD.dYy.ata();
    if (paramString.equals("currentProtector"))
      return this.hln;
    if (paramString.equals("challengeInventory"))
      return this.hln.aKh();
    if (paramString.equals("buffInventory"))
      return a(this.hln.aKj(), false);
    if (paramString.equals("climateInventory"))
      return a(this.hln.aKl(), false);
    if (paramString.equals("challengeObjInventory"))
      return this.hln.aKe();
    if (paramString.equals("buffObjInventory"))
      return this.hln.aKj();
    if (paramString.equals("climateObjInventory"))
      return this.hln.aKl();
    Object localObject1;
    int i1;
    int i3;
    if (paramString.equals("baseChallenges")) {
      localObject1 = this.hln.aKo();
      if (((cSi)localObject1).size() == 0) {
        return null;
      }

      ArrayList localArrayList2 = new ArrayList();
      i1 = 0; for (i3 = ((cSi)localObject1).size(); i1 < i3; i1++) {
        ceQ localceQ = aUi.eUP.nW(((cSi)localObject1).get(i1));
        if (localceQ != null) {
          localArrayList2.add(localceQ);
        }
      }

      return localArrayList2;
    }if (paramString.equals("hasMoneyBaseChallenges")) {
      localObject1 = this.hln.aKo();
      int m = 0; for (i1 = ((cSi)localObject1).size(); m < i1; m++) {
        i3 = ((cSi)localObject1).get(m);
        if (aUP.c(ddR.kXL, i3)) {
          return Boolean.valueOf(true);
        }
      }

      return Boolean.valueOf(false);
    }
    Object localObject4;
    int i5;
    Object localObject8;
    if (paramString.equals("availableChallenges")) {
      localObject1 = this.hln.aKo();
      localObject4 = this.hln.aKv();
      cSi localcSi = this.hln.aKn();
      if (((cSi)localObject1).size() + localcSi.size() == 0) {
        return null;
      }

      ArrayList localArrayList3 = new ArrayList();
      i5 = 0; for (int i7 = ((cSi)localObject1).size(); i5 < i7; i5++) {
        localObject8 = aUi.eUP.nW(((cSi)localObject1).get(i5));
        cWt localcWt = (cWt)((chC)localObject4).vn(((cSi)localObject1).get(i5));
        if ((localObject8 != null) && (localcWt != null) && ((localcWt.F() == null) || (localcWt.F().i(this.hln, null, null, null)))) {
          localArrayList3.add(localObject8);
        }
      }

      i5 = 0; for (i7 = localcSi.size(); i5 < i7; i5++) {
        localObject8 = aUi.eUP.nW(localcSi.get(i5));
        if (localObject8 != null) {
          localArrayList3.add(localObject8);
        }
      }

      return localArrayList3;
    }if (paramString.equals("numAvailableChallenges"))
      return Integer.valueOf(this.hln.aKo().size() + this.hln.aKn().size());
    if (paramString.equals("numBoughtChallenges"))
      return Integer.valueOf(this.hln.aKn().size());
    if (paramString.equals("boughtChallenges")) {
      this.hlt.clear();

      localObject1 = this.hln.aKn();
      if (((cSi)localObject1).size() == 0) {
        return null;
      }

      localObject4 = this.hln.aKe();
      if (localObject4 == null) {
        return null;
      }

      int i2 = 0; for (int i4 = ((cSi)localObject1).size(); i2 < i4; i2++) {
        i5 = ((cSi)localObject1).wm(i2);
        ld localld = ((bFg)localObject4).sA(i5);
        if (localld != null) {
          this.hlt.add(localld.sE());
        }
      }
      return this.hlt;
    }if (paramString.equals("boughtBuffs"))
      return this.hln.aKd();
    if (paramString.equals("boughtClimates"))
      return a(this.hln.aKl(), true);
    if (paramString.equals("walletHandler")) {
      if ((this.hln == null) || (this.hln.aKi() == null)) {
        return null;
      }

      localObject1 = (Gi)this.hln.aKi();
      return ((Gi)localObject1).a(FB());
    }if (paramString.equals("tax"))
      return b(cVE.kHZ);
    if (paramString.equals("nation"))
      return this.hlr;
    if (paramString.equals("description")) {
      if (this.hln == null) {
        return null;
      }
      localObject1 = new lZ();
      aWN.b((lZ)localObject1, this.hln, false);
      localObject4 = ((lZ)localObject1).tP().replaceFirst("\n\n", "");
      return ((String)localObject4).length() > 0 ? localObject4 : null;
    }if (paramString.equals("job"))
      return bU.fH().b(90, CB(), new Object[0]);
    if (paramString.equals("sex"))
      return bU.fH().b(91, CB(), new Object[0]);
    if (paramString.equals("height"))
      return bU.fH().b(92, CB(), new Object[0]);
    if (paramString.equals("weight"))
      return bU.fH().b(93, CB(), new Object[0]);
    if (paramString.equals("customDescription")) {
      if (!bU.fH().ed(94, CB())) {
        return null;
      }
      localObject1 = bU.fH().b(94, CB(), new Object[0]);
      return ((String)localObject1).split("\n");
    }if (paramString.equals("numSecrets")) {
      if (this.hln == null) {
        return "";
      }
      int i = 0;
      localObject4 = this.hln.aKt();
      while (((Iterator)localObject4).hasNext()) {
        ((Iterator)localObject4).next();
        i++;
      }
      return Integer.valueOf(i);
    }
    Object localObject6;
    if (paramString.equals("secrets")) {
      if (this.hln == null) {
        return null;
      }
      ArrayList localArrayList1 = new ArrayList();
      localObject4 = this.hln.aKt();
      while (((Iterator)localObject4).hasNext()) {
        localObject6 = (deN)((Iterator)localObject4).next();
        localArrayList1.add(new cJx((deN)localObject6));
      }
      return localArrayList1;
    }
    Object localObject7;
    if (paramString.equals("unlockedSecrets")) {
      if (this.hln == null) {
        return "";
      }
      int j = 0;
      int n = 0;
      localObject6 = byv.bFN().bFO().bGa();
      localObject7 = this.hln.aKt();
      while (((Iterator)localObject7).hasNext()) {
        deN localdeN = (deN)((Iterator)localObject7).next();
        n++;
        if ((!((bCP)localObject6).lZ(localdeN.abU())) || (((bCP)localObject6).ma(localdeN.abU()))) {
          j++;
        }
      }
      return j + "/" + n;
    }
    Object localObject2;
    Object localObject5;
    if (paramString.equals("territoryName")) {
      localObject2 = (bva)this.hln.avb();
      if (bU.fH().ed(66, ((bva)localObject2).getId())) {
        localObject5 = bU.fH().b(66, ((bva)localObject2).getId(), new Object[0]);
        if ((localObject5 != null) && (((String)localObject5).length() > 0)) {
          return localObject5;
        }
      }
      return null;
    }if (paramString.equals("buffTitle")) {
      switch (NI.cen[ccg().ordinal()]) {
      case 1:
        return bU.fH().getString("protector.buffs.mdc.title");
      case 2:
        return bU.fH().getString("protector.buffs.shukrute.title");
      }
    } else if (paramString.equals("buffTooltip")) {
      switch (NI.cen[ccg().ordinal()]) {
      case 1:
        return bU.fH().getString("protector.buffs.mdc.explaination");
      case 2:
        return bU.fH().getString("protector.buffs.shukrute.explaination");
      }
    } else { if (paramString.equals("numBuffList")) {
        localObject2 = ccg();
        switch (NI.cen[localObject2.ordinal()]) {
        case 1:
          if (this.hln.ave() == cIZ.iHa) {
            return Integer.valueOf(this.hln.aKd().length);
          }
          return Integer.valueOf(this.hln.aKq().size() + 1);
        case 2:
          return Integer.valueOf(this.hln.aKd().length);
        }
        return Integer.valueOf(0);
      }if (paramString.equals("unsatisfiedRegionalState")) {
        if (acn.aoA().aox() < 1) {
          return null;
        }
        return e(cIZ.iHb);
      }if (paramString.equals("halfSatisfiedRegionalState")) {
        if (acn.aoA().aox() < 2) {
          return null;
        }
        return e(cIZ.iHc);
      }if (paramString.equals("satisfiedRegionalState")) {
        if (acn.aoA().aox() < 1) {
          return null;
        }
        return e(cIZ.iHd);
      }if (paramString.equals("unsatisfiedGlobalState")) {
        if (acn.aoA().aox() < 1) {
          return null;
        }
        return d(cIZ.iHb);
      }if (paramString.equals("halfSatisfiedGlobalState")) {
        if (acn.aoA().aox() < 2) {
          return null;
        }
        return d(cIZ.iHc);
      }if (paramString.equals("satisfiedGlobalState")) {
        if (acn.aoA().aox() < 1) {
          return null;
        }
        return d(cIZ.iHd);
      }
      int k;
      if (paramString.equals("unsatisfiedStateIcon")) {
        k = c(cIZ.iHb);
        if (k == -1) {
          return null;
        }
        localObject5 = (bXU)cNO.cFX().yF(k);
        return ((bXU)localObject5).fJ();
      }if (paramString.equals("halfSatisfiedStateIcon")) {
        k = c(cIZ.iHc);
        if (k == -1) {
          return null;
        }
        localObject5 = (bXU)cNO.cFX().yF(k);
        return ((bXU)localObject5).fJ();
      }if (paramString.equals("satisfiedStateIcon")) {
        k = c(cIZ.iHd);
        if (k == -1) {
          return null;
        }
        localObject5 = (bXU)cNO.cFX().yF(k);
        return ((bXU)localObject5).fJ();
      }if (paramString.equals("globalStateIcon"))
        return ay.bd().a("protectorBuffsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(-1) });
      Object localObject3;
      if (paramString.equals("buffList")) {
        localObject3 = ccg();
        localObject5 = this.hln.aKq();
        localObject6 = new ArrayList();

        switch (NI.cen[localObject3.ordinal()])
        {
        case 1:
          if (this.hln.ave() == cIZ.iHa) {
            if (this.hln.aKd() == null) {
              return null;
            }
            for (localObject8 : this.hln.aKd()) {
              if (((cHN)localObject8).cBZ() == bMn.gPH)
                ((ArrayList)localObject6).add(new asP((cHN)localObject8, this.hln, false));
            }
          }
          else
          {
            localObject7 = new ArrayList();
            ??? = 0; for (??? = ((cSi)localObject5).size(); ??? < ???; ???++) {
              localObject8 = dPR.mji.Do(((cSi)localObject5).get(???));
              if ((localObject8 != null) && (((cHN)localObject8).cBZ() == bMn.gPH)) {
                ((ArrayList)localObject7).add(localObject8);
              }
            }

            ((ArrayList)localObject6).add(new asP(null, this.hln, ((ArrayList)localObject7).size() != 0));
            ??? = 0; for (??? = ((ArrayList)localObject7).size(); ??? < ???; ???++) {
              localObject8 = (cHN)((ArrayList)localObject7).get(???);
              ((ArrayList)localObject6).add(new asP((cHN)localObject8, this.hln));
            }
            Collections.sort((List)localObject6, dLX.mch);
          }
          break;
        case 2:
          if (this.hln.aKd() == null) {
            return null;
          }
          for (localObject8 : this.hln.aKd()) {
            if (((cHN)localObject8).cBZ() == bMn.gPI) {
              ((ArrayList)localObject6).add(new asP((cHN)localObject8, this.hln, false));
            }
          }

        }

        return localObject6;
      }
      if (paramString.equals("zoology"))
        return this.hln.aKu().aGA();
      if (paramString.equals("territoryRecommendedLevel")) {
        localObject3 = qv();
        if (localObject3 == null) {
          return null;
        }
        short s1 = ((bva)localObject3).Qb();
        short s2 = ((bva)localObject3).nV();
        if ((s1 != -1) && (s2 != -1)) {
          return bjv.format(bU.fH().getString("recommended.level", new Object[] { Short.valueOf(s1), Short.valueOf(s2) }), new Object[0]);
        }
        return bjv.format(bU.fH().getString("recommended.level", new Object[] { Integer.valueOf(1), Integer.valueOf(5) }), new Object[0]);
      }
    }

    return super.getFieldValue(paramString);
  }

  private int c(cIZ paramcIZ) {
    switch (NI.ceo[paramcIZ.ordinal()]) {
    case 1:
      return 1917;
    case 2:
      return 1916;
    case 3:
      return 1915;
    }

    return -1;
  }

  private String d(cIZ paramcIZ) {
    ArrayList localArrayList = new ArrayList();
    bNa localbNa = paramcIZ.bJ() <= this.hln.ave().bJ() ? bNa.gRx : bNa.gRG;

    cSi localcSi = this.hln.aKq();
    int i = 0;
    Object localObject;
    for (int j = localcSi.size(); i < j; i++) {
      cHN localcHN = dPR.mji.Do(localcSi.get(i));
      if ((localcHN != null) && (localcHN.cBZ() == bMn.gPH)) {
        localObject = new NJ(this, paramcIZ);

        if ((localcHN.F() == null) || (localcHN.F().i(this.hln, this.hln, localObject, null)))
        {
          localArrayList.add(new lZ().tI().am(localbNa.bUV()).a(asP.a(localcHN, false)).tJ().tP());
        }
      }
    }
    if (localArrayList.isEmpty()) {
      localArrayList.add(bU.fH().getString("protector.noBuff"));
    }

    lZ locallZ = new lZ();
    j = 0; for (int k = localArrayList.size(); j < k; j++) {
      localObject = (String)localArrayList.get(j);
      if (j != 0) {
        locallZ.tH();
      }
      locallZ.a((CharSequence)localObject);
    }

    return locallZ.tP();
  }

  private Object e(cIZ paramcIZ) {
    int i = c(paramcIZ);
    if (i == -1) {
      return null;
    }
    bNa localbNa = paramcIZ.bJ() <= this.hln.ave().bJ() ? bNa.gRx : bNa.gRG;
    bXU localbXU = (bXU)cNO.cFX().yF(i);
    ArrayList localArrayList = new ArrayList();
    for (String str : cxo.a(new chR(localbXU, cMx.krP))) {
      localArrayList.add(new lZ().tI().am(localbNa.bUV()).a(str).tJ().tP());
    }
    if (localArrayList.isEmpty()) {
      localArrayList.add(bU.fH().getString("protector.noBuff"));
    }
    return localArrayList;
  }

  public void Pp() {
    int i = 0; for (int j = this.hlt.size(); i < j; i++)
      ((bYT)this.hlt.get(i)).Pp();
  }

  private bMn ccg()
  {
    cSi localcSi = this.hln.aKq();

    if (localcSi.size() == 0) {
      return bMn.gPH;
    }

    cHN localcHN = dPR.mji.Do(localcSi.get(0));
    return localcHN.cBZ();
  }

  public int CB() {
    return this.hln != null ? this.hln.getId() : -1;
  }

  public void a(aid paramaid, aYr paramaYr) {
    if (paramaid != this.hln) {
      return;
    }
    this.hlr = new beJ(paramaYr.bP());
    dLE.doY().a(this, new String[] { "nation" });
    if (byv.bFN().c(drM.cYz()))
      byv.bFN().b(drM.cYz());
  }

  private static aBu a(ayn paramayn, cVE paramcVE)
  {
    EnumMap localEnumMap = paramayn.aKr();
    return new aBu((baR)localEnumMap.get(paramcVE));
  }

  public aBu b(cVE paramcVE) {
    switch (NI.bMj[paramcVE.ordinal()]) {
    case 1:
      if (hlp == null) {
        hlp = a(this.hln, paramcVE);
      }
      return hlp;
    case 2:
      if (hlo == null) {
        hlo = a(this.hln, paramcVE);
      }
      return hlo;
    }

    return null;
  }

  public ayn FB() {
    return this.hln;
  }

  public ayn cch() {
    return this.hls;
  }

  public void clean() {
    if (this.hlq != null) {
      this.hlq.dispose();
      this.hlq = null;
    }
  }

  public void f(ayn paramayn) {
    if (this.hls != null) {
      akb.dkL.b(this.hls);
      this.hls = null;
    }
    bxH localbxH;
    if (this.hln != null) {
      localbxH = this.hln.aKi();
      if (localbxH != null) {
        localbxH.a(null);
      }
      byz localbyz = byv.bFN().bFO();
      if ((this.hln == null) || ((localbyz != null) && (!localbyz.bHb().equals(localbyz.bHa()))))
        akb.dkL.b(this.hln);
      else {
        this.hls = this.hln;
      }
      clean();
    }

    dLE.doY().t("wakfuEcosystemEnabled", Boolean.valueOf(false));
    this.hln = paramayn;
    if (this.hlq != null) {
      this.hlq.dispose();
      this.hlq = null;
    }

    hlo = null;
    hlp = null;

    if (this.hln != null) {
      akb.dkL.a(this.hln);

      localbxH = this.hln.aKi();
      if (localbxH != null) {
        localbxH.a(this);
      }
      this.hlr = new beJ(this.hln.ava().bP());

      dLE.doY().t("protector", this);
    } else {
      dzx.dcY().dcZ();
      this.hlr = null;
    }
    djO();
  }

  public static String a(int paramInt1, int paramInt2, int paramInt3, Object[] paramArrayOfObject) {
    int i = paramInt1 * 10000000 + paramInt2 * 10000 + paramInt3;
    String str = bU.fH().b(49, i, paramArrayOfObject == null ? new String[0] : paramArrayOfObject);
    return bU.fH().ed(49, i) ? str : null;
  }

  private ArrayList a(bFg parambFg, boolean paramBoolean)
  {
    if ((parambFg == null) || (parambFg.size() == 0)) {
      return null;
    }

    ArrayList localArrayList = new ArrayList(parambFg.size());
    for (aOm localaOm : parambFg) {
      ld localld = (ld)localaOm;
      if ((localld != null) && (localld.apR() == paramBoolean)) {
        localArrayList.add(((ld)localaOm).sE());
      }
    }

    if (localArrayList.size() == 0) {
      return null;
    }
    return localArrayList;
  }

  public void c(dsl paramdsl, int paramInt) {
    dLE.doY().a(this, new String[] { "walletHandler" });

    if ((this.hln == null) || (this.hln.aKi() == null)) {
      return;
    }

    Gi localGi = (Gi)this.hln.aKi();
    ark localark = localGi.a(FB());
    localark.As();
  }

  public ahm a(int paramInt, aDD paramaDD)
  {
    if (this.hlq == null) {
      this.hlq = bBi.rX(paramInt);
    }

    if (this.hlq != null) {
      bBi.a(this.hlq, paramaDD);
    }

    return this.hlq;
  }

  public bva qv()
  {
    if (this.hln == null) {
      return null;
    }
    return (bva)this.hln.avb();
  }

  public boolean Vn() {
    return false;
  }
}