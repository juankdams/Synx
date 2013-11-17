public class dlo extends csx
  implements bye
{
  public aiI pW()
  {
    return aiI.dgh;
  }

  public void run() {
    if (!pZ()) {
      return;
    }
    byo localbyo = (byo)this.dvI;
    ayn localayn = localbyo.FB();

    if (localayn != null) {
      byz localbyz = byv.bFN().bFO();

      if (!localbyz.q(false, true)) {
        return;
      }
      dLE.doY().t("voteList", Boolean.valueOf(true));
      byv.bFN().a(aUy.bjB());
    }
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.adF()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }

    if (!(this.dvI instanceof byo)) {
      return false;
    }
    ayn localayn = ((byo)this.dvI).FB();
    if (localayn == null) {
      return false;
    }
    cvY localcvY = localbyz.cJf();
    int i = localayn.avc();
    if ((i == 0) || (i != localcvY.bP())) {
      return false;
    }
    aYr localaYr = localayn.ava();
    if (localaYr == null) {
      return false;
    }

    if (localaYr.aMX()) {
      return false;
    }

    return true;
  }

  public String getLabel()
  {
    byz localbyz = byv.bFN().bFO();
    aTl localaTl = (aTl)localbyz.cJf();

    return super.getLabel();
  }

  public String qa() {
    return "voteList";
  }

  public csx qb() {
    return new dlo();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    byv.bFN().a(aUy.bjB());
  }

  protected int qc() {
    return coH.hWK.aw;
  }
}