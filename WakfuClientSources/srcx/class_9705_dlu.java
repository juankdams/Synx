import org.apache.log4j.Logger;

final class dlu extends Mo
{
  private final dl liT;

  private dlu(byz parambyz, dl paramdl)
  {
    this.liT = paramdl;
    this.liT.ao().a(this);
  }

  public void aS() {
    byz.bHy().error("Les bags ne devraient pas être sérialisés par le client.");
  }

  public void aT() {
    for (bMl localbMl : this.liT.Ti.daV) {
      btn localbtn = localbMl.bEG;

      Object localObject = byz.q(this.iZ).iO(localbtn.bPv);
      if (localObject == null) {
        localObject = new bCJ(0L, 0, gv.aEB, (short)0, byz.q(this.iZ));

        if (!((cRs)localObject).b(localbtn)) {
          byz.bHz().error("Erreur lors de la récupération du bag uniqueId=" + localbtn.bPv + ", on ignore les bags restants");

          return;
        }
        byz.q(this.iZ).d((cRs)localObject);

        ((cRs)localObject).d(akr.dlo);
      } else {
        ((cRs)localObject).b(localbtn);
      }
    }
  }
}