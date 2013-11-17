import java.util.ArrayList;

public class cio
{
  public static final cio hHe = new cio();
  private int hHf;
  private long hHg;
  private dJe hHh = new dJe();

  private final ArrayList hHi = new ArrayList();
  private bnm N = new dOZ(this);

  private auP O = new dPb(this);

  private void ckh()
  {
    if (this.hHi.isEmpty()) {
      cBQ.cxL().mW("questActivationDialog");
    } else {
      Lj localLj = (Lj)this.hHi.remove(this.hHi.size() - 1);
      x(Lj.a(localLj), Lj.b(localLj));
    }
  }

  public void cki() {
    if (this.hHf != -1) {
      bWu localbWu = new bWu(this.hHf, this.hHg, true);
      byv.bFN().aJK().d(localbWu);
    }

    ckh();
  }

  public void ckj() {
    if (this.hHf != -1) {
      bWu localbWu = new bWu(this.hHf, this.hHg, false);
      byv.bFN().aJK().d(localbWu);
    }

    ckh();
  }

  public void w(int paramInt, long paramLong) {
    long l1 = this.hHh.get(paramInt);
    long l2 = System.currentTimeMillis();
    if ((l1 != 0L) && (l2 - l1 < 30000L)) {
      return;
    }
    this.hHh.C(paramInt, l2);

    if (cBQ.cxL().mZ("questActivationDialog"))
      this.hHi.add(new Lj(paramLong, paramInt, null));
    else
      x(paramInt, paramLong);
  }

  private void x(int paramInt, long paramLong)
  {
    this.hHf = paramInt;
    this.hHg = paramLong;

    if (!cBQ.cxL().mZ("questActivationDialog")) {
      cBQ.cxL().a(this.N);
      bBq.bKG().b(this.O);

      cBQ.cxL().a("questActivationDialog", VV.dJ("questActivationDialog"), 8192L, (short)10000);

      cBQ.cxL().j("wakfu.quests", dKE.class);
    }

    ckJ localckJ = cHT.iDr.xQ(paramInt);
    dLE.doY().a("displayedAchievement", localckJ, "questActivationDialog");
  }

  public void cleanUp() {
    this.hHi.clear();
    this.hHf = -1;
    this.hHg = -1L;
    this.hHh.clear();

    bBq.bKG().b(this.O);
    cBQ.cxL().b(this.N);
    cBQ.cxL().mN("wakfu.quests");
  }
}