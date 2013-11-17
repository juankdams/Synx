import com.ankamagames.wakfu.client.WakfuClientInstance;

class bgP extends PO
  implements cvW
{
  public static final bgP fuH = new bgP();

  private final dRK bEC = new dRK("emoteSelectTarget", bRM.hbw);
  private cew fuI;
  private doe fuJ;
  private das fuK;
  private cYk fuL = null;

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (paramBoolean)
      return;
    dGx.dhr().a(duv.lyt, true);
    String str = this.fuJ.fJ();
    if (str != null) {
      bWx.cbz().a(str, null, 30, 0, aFG.ecj);
    }
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    bv(localaTL.aCX(), localaTL.aCY());
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (paramBoolean)
      return;
    dGx.dhr().unlock();

    bWx.cbz().hide();
    this.bEC.clear();
    if (this.fuI != null)
      this.fuI.cgT();
    this.fuL = null;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 19994:
      aqQ localaqQ = (aqQ)paramcWG;
      return bv(localaqQ.aCX(), localaqQ.aCY());
    case 19998:
      return c((aqQ)paramcWG);
    case 19992:
      return d((aqQ)paramcWG);
    case 19995:
      return false;
    case 19993:
    case 19996:
    case 19997: } return true;
  }

  private boolean bv(int paramInt1, int paramInt2) {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    dCb localdCb = localaTL.biV();

    this.bEC.clear();
    if (this.fuI != null)
      this.fuI.cgT();
    this.fuI = null;

    if ((!(localdCb instanceof cew)) || (!(((cew)localdCb).cbD() instanceof bKm))) {
      localObject = bYZ.a(localaTL, paramInt1, paramInt2, false);
      if (localObject == null)
        return true;
      this.bEC.g(bRM.hbx);
      this.bEC.Q(((cYk)localObject).getX(), ((cYk)localObject).getY(), ((cYk)localObject).IB());
      return true;
    }

    Object localObject = (cew)localdCb;
    Su localSu = ((cew)localObject).cbD();
    byz localbyz = byv.bFN().bFO();
    if ((localSu == localbyz) || (localSu.isDead()) || (localSu.adF()) || (localSu.bSB() != null))
      return true;
    this.fuI = ((cew)localObject);
    this.fuI.cgS();
    this.bEC.g(bRM.hbw);
    this.bEC.Q(this.fuI.fa(), this.fuI.fb(), this.fuI.fc());
    return false;
  }

  private boolean c(aqQ paramaqQ)
  {
    if (!paramaqQ.aCU()) {
      return false;
    }
    this.fuL = f(paramaqQ);
    return false;
  }

  private boolean d(aqQ paramaqQ) {
    if (!paramaqQ.aCU()) {
      byv.bFN().b(this);
    }
    else if (e(paramaqQ)) {
      execute();
    }

    this.fuL = null;
    return false;
  }

  private boolean e(aqQ paramaqQ) {
    if (!paramaqQ.aCU()) {
      return false;
    }
    cYk localcYk = f(paramaqQ);
    if ((this.fuL == null) || (localcYk == null) || (!this.fuL.Z(localcYk.getX(), localcYk.getY(), localcYk.IB()))) {
      return false;
    }

    return this.fuI != null;
  }

  private boolean execute()
  {
    byz localbyz = byv.bFN().bFO();
    bRM localbRM = localbyz.bGE();
    if (!localbRM.b(this.fuJ, this.fuK)) {
      byv.bFN().b(this);
      return false;
    }

    int i = localbyz.ML().ac(this.fuI.cbD().ML());

    if ((!this.fuJ.aTj()) || (i == 1)) {
      this.fuK.a(this.fuJ, this.fuI.getId());
      byv.bFN().b(this);
      return false;
    }

    cYs localcYs = new cYs(this, localbyz);

    cew localcew = localbyz.aeL();
    localcew.b(localcYs);
    if (!localbyz.a(this.fuI.cbD(), true, true))
      localcew.c(localcYs);
    byv.bFN().b(this);
    return false;
  }

  private cYk f(aqQ paramaqQ) {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    return bYZ.a(localaTL, paramaqQ.aCX(), paramaqQ.aCY(), true);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(doe paramdoe, das paramdas) {
    if ((this.fuJ == paramdoe) && (byv.bFN().c(this))) {
      byv.bFN().b(this);
      return;
    }
    this.fuJ = paramdoe;
    this.fuK = paramdas;
    if (byv.bFN().c(this))
      byv.bFN().b(this);
    byv.bFN().a(this);
  }
}