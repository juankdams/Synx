public class Fs extends dwq
{
  public Fs(long paramLong)
  {
    super(new bUZ(paramLong));
    ((bUZ)this.lBG).a(paramLong);
  }

  public void a(aay paramaay)
  {
    super.c(paramaay);

    Su localSu = CA.Lv().bj(paramaay.eq());
    if (localSu != null) {
      localSu.adq();
    }

    byz localbyz = byv.bFN().bFO();

    cYk localcYk = paramaay.ML();
    if ((paramaay.eq() != localbyz.getId()) && 
      (paramaay.Lk() == localbyz.Lk())) {
      duf.a(paramaay.eq(), 0, localcYk.getX(), localcYk.getY(), localcYk.IB(), paramaay, dSP.mpb, paramaay.getName(), clP.hOS, bSH.bZs());

      duf.a(paramaay.eq(), 0, localcYk.getX(), localcYk.getY(), localcYk.IB(), paramaay, dSP.mpb, paramaay.getName(), clP.hOS, cCZ.cyZ());
    }
  }

  public int a(aym paramaym)
  {
    bgo localbgo = (bgo)paramaym;
    if (this.VB.size() >= 6)
      return 307;
    if ((localbgo.aE(go.aEq.bJ()) != 0L) || (this.VB.containsKey(localbgo.eq())))
      return 300;
    return 0;
  }

  public boolean b(aay paramaay)
  {
    return (paramaay.aE(go.aEq.bJ()) == ((bUZ)this.lBG).getId()) && (this.VB.containsKey(paramaay.eq()));
  }

  public byte Pg()
  {
    return go.aEq.bJ();
  }

  public long Ph() {
    return ((bUZ)this.lBG).Ph();
  }

  public aay bv(long paramLong) {
    return (aay)this.VB.get(paramLong);
  }

  public void q(long paramLong)
  {
  }

  public void d(cbQ paramcbQ) {
    Pj();
    Pk();
  }

  public void Pi() {
    cHu localcHu = this.VB.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      aay localaay = (aay)localcHu.value();
      Su localSu = CA.Lv().bj(localaay.eq());
      if (localSu != null)
        localSu.adq();
    }
  }

  public void bw(long paramLong) {
    aay localaay = (aay)this.VB.get(paramLong);
  }

  private void Pj()
  {
    byz localbyz = byv.bFN().bFO();

    cHu localcHu = this.VB.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      aay localaay = (aay)localcHu.value();
      if (localaay.eq() != localbyz.getId()) {
        bSH.bZs().o(0, localaay.eq());
        cCZ.cyZ().o(0, localaay.eq());
        if (localbyz.Lk() != localaay.Lk())
          Dj.My().n(0, localaay.eq());
      }
    }
  }

  private void Pk() {
    byz localbyz = byv.bFN().bFO();

    cHu localcHu = this.VB.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      aay localaay = (aay)localcHu.value();

      cYk localcYk = localaay.ML();
      if ((localaay.eq() != localbyz.getId()) && (localaay.Lk() == localbyz.Lk())) {
        duf.a(localaay.eq(), 0, localcYk.getX(), localcYk.getY(), localcYk.IB(), localaay, dSP.mpj, localaay.getName(), clP.hOS, bSH.bZs());

        Dj.My().a(0, localaay.eq(), localcYk.getX(), localcYk.getY(), localcYk.IB());

        duf.a(localaay.eq(), 0, localcYk.getX(), localcYk.getY(), localcYk.IB(), localaay, dSP.mpj, localaay.getName(), clP.hOS, cCZ.cyZ());
      }
    }
  }

  public void Pl()
  {
    cHu localcHu = this.VB.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      bx(((aay)localcHu.value()).eq());
      localcHu = this.VB.aBa();
    }
  }

  public boolean bx(long paramLong)
  {
    byz localbyz = byv.bFN().bFO();

    aay localaay = (aay)kp(paramLong);
    boolean bool = super.bx(paramLong);
    if (bool)
    {
      Su localSu = CA.Lv().bj(localaay.eq());

      if ((localSu != null) && (!localSu.aeI())) {
        duf.a(localSu, bSH.bZs());
        localSu.adq();
      }

      if (localaay.eq() != localbyz.getId())
      {
        bSH.bZs().o(0, localaay.eq());
        cCZ.cyZ().o(0, localaay.eq());
        Dj.My().n(0, localaay.eq());
      }
    }

    return bool;
  }

  public boolean c(aay paramaay)
  {
    return bx(paramaay.eq());
  }
}