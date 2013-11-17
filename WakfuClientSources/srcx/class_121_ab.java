import java.util.ArrayList;
import java.util.Collection;

public class ab extends cGj
{
  public static final ab bl = new ab();
  public static final String bm = "environmentQuest";
  public static final String bn = "almanaxQuest";
  public static final String bo = "regularQuests";
  private int bp = -1;
  private int bq = -1;
  private int br = -1;

  public void init() {
    this.bp = -1;
    this.bq = -1;
    this.br = -1;
    dLE.doY().t("followedAchievements", this);
    dLE.doY().t("canFollowMoreAchievements", Boolean.valueOf(true));
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("almanaxQuest"))
      return this.bp == -1 ? null : cHT.iDr.xQ(this.bp);
    if (paramString.equals("environmentQuest"))
      return this.bq == -1 ? null : aUi.eUP.nW(this.bq);
    if (paramString.equals("regularQuests")) {
      ArrayList localArrayList = new ArrayList();
      cSi localcSi = byv.bFN().bFO().bGa().aQa();
      int i = 0; for (int j = localcSi.size(); i < j; i++) {
        ckJ localckJ = h(localcSi.get(i));
        localArrayList.add(localckJ);
      }

      return localArrayList;
    }
    return null;
  }

  private void az() {
    int i = -1;

    bCP localbCP = byv.bFN().bFO().bGa();
    for (dmn localdmn = localbCP.bLq(); localdmn.hasNext(); ) {
      localdmn.fl();
      dEE localdEE = (dEE)localdmn.value();
      if ((localbCP.mc(localdEE.getId())) && (!localbCP.md(localdEE.getId())))
      {
        boolean bool = localdEE.dgg().um(81);
        if (bool)
        {
          i = localdEE.getId();
        }
      }
    }
    if (i != this.bp) {
      this.bp = i;
      dLE.doY().a(this, new String[] { "almanaxQuest" });
    }
  }

  private static ckJ h(int paramInt) {
    dEE localdEE = byv.bFN().bFO().bGa().sq(paramInt);
    if (localdEE == null) {
      return null;
    }
    bvw localbvw = cHT.iDr.xS(localdEE.getId());
    if (localbvw == null)
      return null;
    aMT localaMT = localbvw.rm(localdEE.dgg().getId());
    if ((localaMT == null) || (localaMT.bdT())) {
      return null;
    }
    cPH localcPH = (cPH)localaMT;
    return localcPH.yN(paramInt);
  }

  private void aA() {
    if (!aB()) {
      bMK.bUv(); bMK.gq(false);
    } else {
      bMK.bUv(); if (!bMK.bUw()) {
        bMK.bUv(); bMK.gq(true);
      }
    }
  }

  private boolean aB() {
    if (this.br != -1) {
      return false;
    }
    return (this.bp != -1) || (this.bq != -1) || (!byv.bFN().bFO().bGa().aQa().isEmpty());
  }

  public void i(int paramInt)
  {
    this.bq = paramInt;
    dLE.doY().a(this, new String[] { "environmentQuest" });
    aA();
  }

  public void j(int paramInt) {
    h(paramInt);
    aC();
  }

  public void aC() {
    az();
    dLE.doY().a(this, new String[] { "regularQuests" });

    cSi localcSi = byv.bFN().bFO().bGa().aQa();
    dLE.doY().t("canFollowMoreAchievements", Boolean.valueOf(localcSi.size() < 4));
    aA();
  }

  public void k(int paramInt) {
    dmz localdmz = sx.bbD.cN(paramInt);
    if (localdmz != null) {
      this.br = localdmz.getId();
      bMK.bUv().b(cHT.iDr.xQ(paramInt));
    }

    aA();
  }

  public void l(int paramInt) {
    dmz localdmz = sx.bbD.cN(paramInt);
    if (localdmz != null) {
      int i = localdmz.AK(localdmz.size() - 1);
      if (paramInt == i) {
        this.br = -1;
        bMK.bUv().bUx();
      }
    }

    aA();
  }

  public void aD() {
    if (this.bq != -1) {
      ceQ localceQ = aUi.eUP.nW(this.bq);
      localceQ.aLl();
    }
  }
}