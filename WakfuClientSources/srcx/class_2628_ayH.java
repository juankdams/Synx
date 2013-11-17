import org.apache.log4j.Logger;

public class ayH extends csx
  implements bye
{
  private czr dPt;

  public csx qb()
  {
    return new ayH();
  }

  public boolean pZ() {
    if (!(this.dvI instanceof czr)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();

    dUx localdUx = bDk.bLI().cr(localbyz.Lk());
    if ((localdUx != null) && (localdUx.duy() == go.aEq)) {
      return false;
    }

    if (localbyz.isDead()) {
      return false;
    }
    if (localbyz.bGK()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }

    if (localbyz.adF()) {
      return false;
    }
    return true;
  }

  public boolean isEnabled()
  {
    czr localczr = (czr)this.dvI;
    if (localczr.isLocked()) {
      return false;
    }
    return (super.isEnabled()) && (aKE());
  }

  private boolean aKE() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bHa() != null) {
      return true;
    }
    bva localbva = localbyz.bHn();
    if (localbva != null) {
      aid localaid = localbva.boT();
      if (localaid != null) {
        cvY localcvY = localbyz.cJf();
        if (!dow.cVB().a(localcvY, localaid.avc())) {
          return false;
        }
      }
    }
    return true;
  }

  public void run() {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    byz localbyz = byv.bFN().bFO();
    localbyz.q(false, false);

    this.dPt = ((czr)this.dvI);

    cYk localcYk = FQ.a(localbyz.aKb(), this.dPt.bVi());
    if (localcYk == null) {
      return;
    }
    if (localcYk.ac(localbyz.aKb()) == 0) {
      int i = this.dPt.fa() - localbyz.fa();
      int j = this.dPt.fb() - localbyz.fb();
      localbyz.c(La.l(i, j));

      bve localbve = new bve();
      localbve.ge(this.dPt.cwk().sN());
      byv.bFN().aJK().d(localbve);
    } else {
      localbyz.aeL().b(this);
      localbyz.b(localcYk, false, true);
    }
  }

  public aiI pW() {
    return aiI.dfC;
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort)
  {
    paramdMM.c(this);

    int i = this.dPt.fa() - paramdMM.fa();
    int j = this.dPt.fb() - paramdMM.fb();

    if ((Math.abs(i) <= 1) && (Math.abs(j) <= 1)) {
      paramdMM.c(La.l(i, j));

      bve localbve = new bve();
      localbve.ge(this.dPt.cwk().sN());
      byv.bFN().aJK().d(localbve);
    }
  }

  protected int qc()
  {
    return coH.hWL.aw;
  }

  public String getLabel() {
    lZ locallZ = new lZ().tz().am(isEnabled() ? icr : ict);
    locallZ.a(bU.fH().getString(qa()));
    locallZ.tA();
    return locallZ.tP();
  }

  public String qa()
  {
    czr localczr = (czr)this.dvI;
    if (localczr.isLocked())
      return "bag.forbiddenLocked";
    if (!aKE())
      return "bag.forbiddenInEnnemyTerritory";
    return "desc.mru.bagEnterOther";
  }
}