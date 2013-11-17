import java.util.List;

public class aZj extends vC
  implements bye
{
  protected cYk aVG;

  public aiI pW()
  {
    return aiI.dga;
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
      dLE.doY().t("voteList", Boolean.valueOf(false));
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
    if (localayn.avc() != localcvY.bP()) {
      return false;
    }
    aYr localaYr = localayn.ava();
    if (localaYr == null) {
      return false;
    }

    if (!localaYr.aMX()) {
      return false;
    }

    return true;
  }

  public String getLabel()
  {
    return super.getLabel();
  }

  public String qa() {
    return "vote";
  }

  public csx qb() {
    return new aZj();
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    byv.bFN().a(aUy.bjB());
  }

  protected int qc() {
    return coH.hWq.aw;
  }

  public boolean isEnabled()
  {
    if (!super.isEnabled())
      return false;
    return true;
  }

  public List EB() {
    return null;
  }

  public List EC() {
    if (Ew() != dqU.ltr)
      return null;
    byz localbyz = byv.bFN().bFO();

    Object localObject = new cjI(localbyz);
    List localList = ((bvD)localObject).bDr();
    localObject = new duG(localbyz, -1L);
    localList.addAll(((bvD)localObject).bDr());

    aYr localaYr = localbyz.cJf().UI();
    dpE localdpE = localaYr.aNd().clp();
    if (localdpE != null) {
      localObject = new duG(localbyz, localdpE.getId());
      localList.addAll(((bvD)localObject).bDr());
    }
    return localList;
  }
}