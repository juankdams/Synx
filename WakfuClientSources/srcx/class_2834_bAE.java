import java.util.ArrayList;

final class bAE
  implements cvW
{
  public static final bAE gpN = new bAE();
  private cKX gpO;
  private boolean gpP;

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    this.gpO = null;
    this.gpP = false;
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (this.gpO != null)
      this.gpO.a(4, null);
    this.gpO = null;
    this.gpP = false;
  }

  public boolean a(cWG paramcWG) {
    if (paramcWG.getId() != 19992) {
      return true;
    }
    bdr();
    return false;
  }

  public void bdr()
  {
    String str;
    if (byv.bFN().bFO().bGG().aW() == -1)
      str = bU.fH().getString("death.resurrectMessage");
    else {
      str = bU.fH().getString("death.backToPhoenixMessage");
    }

    NW localNW = new NW(102, 1, str, 41L);

    ArrayList localArrayList = new ArrayList();
    localArrayList.add(bU.fH().getString("death.waitForRaise"));
    localNW.o(localArrayList);
    localNW.cT(Cn.et(0));

    localNW.ge(1);

    this.gpO = cBQ.cxL().a(localNW);
    if (this.gpO == null) {
      return;
    }
    this.gpO.a(new dBI(this));
  }

  public boolean bIQ()
  {
    return this.gpP;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}