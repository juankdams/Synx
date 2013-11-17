import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class bfU
  implements cvW
{
  private static final Logger K = Logger.getLogger(bfU.class);

  private static final bfU ftX = new bfU();

  private static final float[] aTW = { 0.0F, 1.0F, 0.0F, 0.6F };
  private dRK aUi;
  private gA aUe;
  private cYk aUg;

  public static bfU bsU()
  {
    return ftX;
  }

  public gA getItem() {
    return this.aUe;
  }

  public void setItem(gA paramgA) {
    this.aUe = paramgA;
  }

  public void wb() {
    dGx.dhr().a(duv.lyK, true);
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.aUi = new dRK("actionRange", aTW);
      dSz localdSz = WakfuClientInstance.awy().Dg();
      cYk localcYk = D(localdSz.aCX(), localdSz.aCY());
      a(localcYk, false);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.aUi.clear();
      dGx.dhr().unlock();
    }
    this.aUe = null;
    this.aUg = null;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public boolean a(cWG paramcWG)
  {
    aqQ localaqQ;
    cYk localcYk;
    switch (paramcWG.getId())
    {
    case 19994:
      localaqQ = (aqQ)paramcWG;
      localcYk = D(localaqQ.aCX(), localaqQ.aCY());
      a(localcYk, false);
      return false;
    case 19992:
      localaqQ = (aqQ)paramcWG;

      if (localaqQ.aCU()) {
        localcYk = D(localaqQ.aCX(), localaqQ.aCY());
        C(localcYk.getX(), localcYk.getY());
      } else {
        byv.bFN().b(this);
      }

      return false;
    }

    return true;
  }

  protected void a(cYk paramcYk, boolean paramBoolean)
  {
    if (paramcYk == null) {
      this.aUi.clear();
      this.aUg = null;
      return;
    }

    if ((paramcYk.equals(this.aUg)) && (!paramBoolean)) {
      return;
    }
    this.aUi.clear();
    this.aUg = paramcYk;

    int i = h(paramcYk);

    this.aUi.g(aTW);
    a(paramcYk);
  }

  private static cYk D(int paramInt1, int paramInt2)
  {
    cYk localcYk = bYZ.a(WakfuClientInstance.awy().Dg(), paramInt1, paramInt2, false);
    if (localcYk == null) {
      return null;
    }

    short s = cwO.T(localcYk.getX(), localcYk.getY(), localcYk.IB());
    if ((s == -32768) || (Math.abs(localcYk.IB() - s) > 1)) {
      return null;
    }
    localcYk.dG(s);
    return localcYk;
  }

  protected void a(cYk paramcYk) {
    are localare = (are)this.aUe.oi().bKr();
    int i = localare.getRadius();
    this.aUi.Q(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
    int j = paramcYk.getX() - i; for (int k = paramcYk.getX() + i; j <= k; j++) {
      int m = paramcYk.getY() - i; for (int n = paramcYk.getY() + i; m <= n; m++)
        if (bCO.bL(j - paramcYk.getX()) + bCO.bL(m - paramcYk.getY()) <= bCO.bL(i))
          this.aUi.Q(j, m, paramcYk.IB());
    }
  }

  protected void wc()
  {
  }

  protected void C(int paramInt1, int paramInt2) {
    byz localbyz = byv.bFN().bFO();
    are localare = (are)this.aUe.oi().bKr();
    localare.ap(new cYk(paramInt1, paramInt2, localbyz.fc()));
    localare.a(this.aUe, paramInt1, paramInt2);
  }

  protected int h(cYk paramcYk) {
    if (this.aUe == null) {
      return -1;
    }

    return 0;
  }
}