import java.util.ArrayList;

final class bIe extends Mo
{
  private final all gGR;
  private final cSi gGS = new cSi();

  bIe(bKm parambKm, all paramall) {
    this.gGR = paramall;
    this.gGR.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("[NATION] La Part NationEnemy ne devrait pas être sérialisée par le client.");
  }

  public void aT() {
    ctE localctE = (ctE)this.aHq.cJf();
    ArrayList localArrayList1 = this.gGR.dlU;
    this.gGS.add(localctE.HS());
    int i = 0;
    int i1;
    for (int j = localArrayList1.size(); i < j; i++) {
      ai localai = (ai)localArrayList1.get(i);
      m = localai.bL;
      int n = localai.bM;
      i1 = localctE.N(m, n);
      Cu.b(this.gGS, m);
      if (i1 != n) {
        localctE.cP(m, i1);
      }
    }
    i = 0; for (j = this.gGS.size(); i < j; i++) {
      k = this.gGS.get(i);
      m = localctE.N(k, 0);
      localctE.cP(k, m);
    }
    this.gGS.clear();
    ArrayList localArrayList2 = this.gGR.dlV;
    adz localadz = new adz(localctE.HT().toArray());
    localctE.crf();
    int k = 0; for (int m = localArrayList2.size(); k < m; k++) {
      aWa localaWa = (aWa)localArrayList2.get(k);
      i1 = localaWa.eYo;
      if (!localadz.contains(i1)) {
        sX(i1);
      }
      localctE.a(dsh.luB.BA(i1));
    }
    localctE.cre();
  }

  private void sX(int paramInt) {
    if (byv.bFN().bFO() != this.aHq) {
      return;
    }
    String str1 = bU.fH().getString("notification.outlawTitle");

    String str2 = cda.createLink(bU.fH().getString("notification.outlawText", new Object[] { bU.fH().b(39, paramInt, new Object[0]) }), ana.dqh, paramInt + "");

    az localaz = new az(str1, str2, ana.dqh);
    cjO.clE().j(localaz);

    String str3 = new lZ().tz().am("cc4444").a(bU.fH().b(39, paramInt, new Object[0])).tA().tP();
    String str4 = bU.fH().getString("nation.chatEnemy", new Object[] { str3 });
    CM.LV().f(str4, 4);
  }
}