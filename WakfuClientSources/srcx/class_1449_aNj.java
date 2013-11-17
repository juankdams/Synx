public class aNj extends csx
  implements bye
{
  private static final byte etq = 0;
  private static final byte etr = 1;
  private static final byte ets = 2;
  private byte bwR;

  public aiI pW()
  {
    return aiI.dfY;
  }

  public void run() {
    if (!pZ()) {
      return;
    }

    beb();
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }

    bKm localbKm = (bKm)this.dvI;

    dKc localdKc = localbKm.bSe();
    if ((localdKc == null) || (localdKc.fU() != 4)) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    if (localbyz.isDead()) {
      return false;
    }

    return true;
  }

  public void Q(Object paramObject) {
    super.Q(paramObject);

    this.bwR = 0;

    byz localbyz = byv.bFN().bFO();
    int i = localbyz.bGP().yi(9247);
    if (i < 1) {
      setEnabled(false);
      this.bwR = 1;
      return;
    }
    bBn localbBn = Hh.QM().dh(9247);
    if (localbyz.nU() < localbBn.nU()) {
      setEnabled(false);
      this.bwR = 2;
    }
  }

  private void beb() {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    bKm localbKm = (bKm)this.dvI;

    int i = localbyz.ML().ac(localbKm.ML());
    if (i > 1) {
      localcew.b(this);
      if (!localbyz.b(localbKm.ML(), true, false)) {
        localcew.c(this);
        avW.aIb().a(2, 3, new Object[0]);
      }
      return;
    }

    CG localCG = localcew.atB().Z(localbKm.ML());
    if (localCG != null) {
      localcew.c(localCG);
    }

    akG localakG = new akG(localbKm.getId());
    byv.bFN().aJK().d(localakG);
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    beb();
  }

  public String qa() {
    return "desc.mru.resurrect";
  }

  public String getLabel()
  {
    lZ locallZ = new lZ().tz().am(icr);
    locallZ.a(bU.fH().getString(qa()));
    locallZ.tA();

    if (this.bwR != 0) {
      locallZ.tH().tI().am(bNa.gRz.bUV());
      bBn localbBn = Hh.QM().dh(9247);
      if (this.bwR == 1)
        locallZ.a(bU.fH().getString("action.error.resurrectionItemNotOwned", new Object[] { localbBn.getName() }));
      else if (this.bwR == 2) {
        locallZ.a(bU.fH().getString("collect.error.ItemNotUsable"));
      }
    }
    return locallZ.tP();
  }

  public csx qb() {
    return new aNj();
  }

  protected int qc()
  {
    return coH.hWO.aw;
  }
}