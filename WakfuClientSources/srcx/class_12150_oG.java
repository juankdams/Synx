import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class oG
  implements bUL, cvW, fd, Runnable
{
  private static final float[] aTW = { 0.0F, 1.0F, 0.0F, 0.6F };
  private static final float[] aTX = { 1.0F, 0.0F, 0.0F, 0.6F };
  private static final float[] aTY = { 1.0F, 0.5F, 0.0F, 0.6F };
  private static final float[] aTZ = { 1.0F, 1.0F, 0.0F, 0.6F };
  private static final float[] aUa = { 0.0F, 0.0F, 0.0F, 0.6F };
  private static final float[] aUb = { 1.0F, 1.0F, 1.0F, 0.6F };

  private static final int[] aUc = { 36, 10, 35 };
  protected static final int aUd = 8;
  private static final Logger K = Logger.getLogger(oG.class);

  protected gA aUe = null;

  protected final bCF aUf = new bCF();
  protected cYk aUg = null;
  private cYk aUh;
  protected dRK aUi;
  protected dRK aUj;
  protected final LinkedList aUk = new LinkedList();
  protected dmd aUl;
  private bye aUm;
  private final csA aUn = new bjK(this);

  protected oG()
  {
    this.aUi = new dRK("seedVeryBadRange", aTW);
    this.aUj = new dRK("seedSelectedCells", aUb);
  }

  public void e(gA paramgA)
  {
    this.aUe = paramgA;
  }

  public gA getItem()
  {
    return this.aUe;
  }

  protected Ce wa()
  {
    return this.aUe;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void wb()
  {
    String str = (String)this.aUe.getFieldValue("iconUrl");
    if (str != null) {
      as(str);
    } else {
      bWx.cbz().hide();
      dGx.dhr().unlock();
    }
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
    case 19995:
      localaqQ = (aqQ)paramcWG;
      localcYk = D(localaqQ.aCX(), localaqQ.aCY());
      if ((!a(localcYk, this.aUg)) && (aqQ.aCZ())) {
        c(localcYk);
        this.aUg = localcYk;
      }
      return false;
    case 19998:
      localaqQ = (aqQ)paramcWG;
      if (localaqQ.aCU()) {
        this.aUg = null;
      }
      return false;
    case 19992:
      localaqQ = (aqQ)paramcWG;

      if (localaqQ.aCU()) {
        localcYk = D(localaqQ.aCX(), localaqQ.aCY());
        c(localcYk);
      } else {
        a(localaqQ);
      }

      return false;
    case 19993:
    case 19996:
    case 19997: } return true;
  }

  private static boolean a(cYk paramcYk1, cYk paramcYk2) {
    if ((paramcYk1 == null) && (paramcYk2 == null))
      return true;
    if (paramcYk1 == null)
      return false;
    return paramcYk1.equals(paramcYk2);
  }

  private void a(aqQ paramaqQ) {
    dKc localdKc = byv.bFN().bFO().bSe();
    int i = (localdKc != null) && (localdKc.fU() == 2) ? 1 : 0;
    if (((!this.aUk.isEmpty()) || (i != 0)) && (paramaqQ.aCV())) {
      dmd localdmd = (dmd)this.aUk.removeLast();
      cYk localcYk = localdmd.azG();
      if (!d(localcYk))
        this.aUj.R(localcYk.getX(), localcYk.getY(), localcYk.IB());
    }
    else
    {
      if (i != 0) {
        localdKc.cancel();
      }
      byv.bFN().b(this);
    }
  }

  protected void a(cYk paramcYk, boolean paramBoolean) {
    if (paramcYk == null) {
      this.aUi.clear();
      this.aUg = null;
      wk();
      return;
    }

    if ((paramcYk.equals(this.aUg)) && (!paramBoolean)) {
      return;
    }
    this.aUi.clear();
    this.aUg = paramcYk;

    bWx.cbz().setText(wj());

    int i = h(paramcYk);

    bS(i);
    a(paramcYk);

    this.aUf.k(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());

    if (i < 0) {
      wk();
      return;
    }

    wc();
  }

  protected abstract void a(cYk paramcYk);

  protected abstract void wc();

  protected void bS(int paramInt) {
    if (paramInt < 0) {
      this.aUi.g(aUa);
    } else if (wd()) {
      this.aUi.g(aTW);
    } else if (paramInt <= 25) {
      this.aUi.g(aTX);
    } else if (paramInt <= 50) {
      this.aUi.g(aTY);
    } else if (paramInt <= 75) {
      this.aUi.g(aTZ);
    } else if (paramInt <= 100) {
      this.aUi.g(aTW);
    } else {
      this.aUi.g(aUa);
      K.error("Validité inattendue pour planter sur la case [" + this.aUg + "] : " + paramInt);
    }
  }

  public boolean wd() {
    return this.aUe.oi().b(bGS.gDK);
  }

  private boolean b(cYk paramcYk)
  {
    int i = Math.abs(paramcYk.getX() - byv.bFN().bFO().fa()) + Math.abs(paramcYk.getY() - byv.bFN().bFO().fb());

    return i >= 8;
  }

  private boolean c(cYk paramcYk)
  {
    if ((paramcYk == null) || (h(paramcYk) == -1)) {
      return false;
    }

    dmd localdmd = new dmd(paramcYk, null);

    int i = this.aUk.size();
    if ((i > 98) || (!bT(i))) {
      return false;
    }
    if (d(paramcYk)) {
      return false;
    }
    if (this.aUl == null) {
      a(localdmd);
    } else {
      this.aUk.add(localdmd);
      this.aUj.Q(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
    }

    return true;
  }

  dmd we()
  {
    this.aUl = null;
    if (this.aUk.isEmpty()) {
      return null;
    }
    return (dmd)this.aUk.poll();
  }

  protected boolean d(cYk paramcYk)
  {
    for (dmd localdmd : this.aUk) {
      if (localdmd.azG().equals(paramcYk)) {
        return true;
      }
    }
    return false;
  }

  protected void e(cYk paramcYk)
  {
    dmd[] arrayOfdmd = (dmd[])this.aUk.toArray(new dmd[this.aUk.size()]);
    for (int i = arrayOfdmd.length - 1; i >= 0; i--) {
      dmd localdmd = arrayOfdmd[i];
      if (localdmd.azG().equals(paramcYk))
        this.aUk.remove(localdmd);
    }
  }

  private int f(cYk paramcYk)
  {
    int i = 0;
    for (dmd localdmd : this.aUk) {
      if (localdmd.azG().equals(paramcYk)) {
        i++;
      }
    }
    return i;
  }

  public abstract void wf();

  public void wg()
  {
    wh();
    dka.cSF().a(this, 5000L, 1);
  }

  public void wh() {
    dka.cSF().j(this);
  }

  public void run()
  {
    K.warn("[Plantation] timeOut executé");
    wi();
  }

  public void b(azX paramazX) {
    if (c(paramazX))
      a(this.aUg, true);
  }

  public void a(azX paramazX)
  {
    if (c(paramazX))
      a(this.aUg, true);
  }

  private boolean c(azX paramazX)
  {
    return (this.aUf != null) && (this.aUf.fa() == paramazX.fa()) && (this.aUf.fb() == paramazX.fb());
  }

  public void wi()
  {
    while (!a(we()));
  }

  boolean a(dmd paramdmd)
  {
    this.aUl = paramdmd;
    if (paramdmd == null) {
      return true;
    }

    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    int i = paramdmd.cTW();
    int j = paramdmd.cTX();
    int k = paramdmd.cTY();
    cYk localcYk = paramdmd.azG();
    float f = k - localcew.getAltitude();

    if (Math.abs(f) > Math.abs(localbyz.arG())) {
      K.error("Plantation impossible sur la cellule " + localcYk + " : hauteur maximale de saut de " + localbyz.arG());
      avW.aIb().a(5, 3, new Object[0]);
      g(localcYk);
      this.aUl = null;
      return false;
    }

    if (this.aUm != null) {
      localcew.c(this.aUm);
    }

    this.aUm = new bjL(this, i, j);

    localcew.b(this.aUm);

    int m = localcYk.eC(localcew.fa(), localcew.fb());
    if ((m >= 2) || (m == 0)) {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new cYk(localcYk.getX() + 1, localcYk.getY(), localcYk.IB()));
      localArrayList.add(new cYk(localcYk.getX() - 1, localcYk.getY(), localcYk.IB()));
      localArrayList.add(new cYk(localcYk.getX(), localcYk.getY() + 1, localcYk.IB()));
      localArrayList.add(new cYk(localcYk.getX(), localcYk.getY() - 1, localcYk.IB()));
      if (!localcew.a(false, true, localArrayList)) {
        localcew.c(this.aUm);
        avW.aIb().a(2, 3, new Object[0]);
        this.aUl = null;
        return false;
      }
    } else {
      localcew.c(this.aUm);
      C(i, j);
    }
    if (f(localcYk) <= 1) {
      g(localcYk);
    }

    if (!bT(1))
    {
      byv.bFN().b(this);
    }
    return true;
  }

  protected abstract void C(int paramInt1, int paramInt2);

  protected boolean bT(int paramInt)
  {
    gA localgA = byv.bFN().bFO().bGP().iS(this.aUe.oj());
    if (localgA == null) {
      return false;
    }
    adx localadx = localgA.oi().bKr();
    if (!localadx.apv()) {
      return true;
    }
    return localgA.nP() > paramInt;
  }

  protected void g(cYk paramcYk)
  {
    this.aUj.R(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    this.aUl = null;

    acL.apd().b(this);
    acL.apd().b(this);

    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();

    dGx.dhr().a(duv.lyv, true);

    localaTL.dX(true);
    localaTL.dZ(true);

    cYk localcYk = D(localaTL.aCX(), localaTL.aCY());
    a(localcYk, false);

    bsP.getInstance().a(CH.bGw, this.aUn, true);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      acL.apd().c(this);
      acL.apd().c(this);

      bWx.cbz().hide();

      dGx.dhr().unlock();

      this.aUk.clear();

      this.aUi.clear();
      this.aUj.clear();
      this.aUg = null;

      wk();

      bsP.getInstance().b(CH.bGw, this.aUn, true);
    }
  }

  private static cYk D(int paramInt1, int paramInt2)
  {
    cYk localcYk = bYZ.a(WakfuClientInstance.awy().Dg(), paramInt1, paramInt2, false);
    if (localcYk == null) {
      return null;
    }

    byz localbyz = byv.bFN().bFO();
    cwO.a((short)localbyz.bY(), localbyz.afD(), localbyz.arG());
    short s = cwO.T(localcYk.getX(), localcYk.getY(), localcYk.IB());
    if ((s == -32768) || (Math.abs(localcYk.IB() - s) > 1)) {
      return null;
    }
    localcYk.dG(s);
    return localcYk;
  }

  private void as(String paramString)
  {
    if (paramString != null)
      bWx.cbz().a(paramString, wj(), 30, 0, aFG.ecj);
  }

  protected abstract String wj();

  protected abstract int h(cYk paramcYk);

  public void bU(int paramInt)
  {
    if (aUP.c(aUc, paramInt)) {
      byv.bFN().b(this);
      return;
    }
    wi();
  }

  protected abstract void wk();
}