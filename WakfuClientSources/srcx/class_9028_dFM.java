import com.ankamagames.wakfu.client.WakfuClientInstance;

public class dFM extends cMt
{
  private static final dFM lQd = new dFM();

  private apX dpp = null;

  private dFM()
  {
    this.krJ = bhR.btU();
    ((aTL)WakfuClientInstance.awy().Dg()).a((bhR)this.krJ);
  }

  public static dFM dhf() {
    return lQd;
  }

  public void d(apX paramapX) {
    this.dpp = paramapX;
  }

  public apX azh() {
    return this.dpp;
  }

  protected Ce wa()
  {
    return this.dpp;
  }

  protected void x(int paramInt1, int paramInt2, short paramShort)
  {
    bJn localbJn = new bJn();
    localbJn.X(this.Rl.getId());
    localbJn.fG(this.dpp.oj());
    localbJn.z(paramInt1, paramInt2, paramShort);
    byv.bFN().aJK().d(localbJn);
  }

  protected void azi()
  {
    byz localbyz = byv.bFN().bFO();
    if (this.Rl == localbyz)
      localbyz.e(this.dpp);
  }

  protected String azl()
  {
    Su localSu = (Su)this.Rl.aeQ().x(axB.aJa());
    if (localSu == null)
      return "";
    if (!h(this.dpp))
      return "";
    float f = localSu.cRk();
    if (f >= 1.0F) {
      return bU.fH().getString("desc.healRes", new Object[] { Integer.valueOf((int)f) });
    }
    return "";
  }

  private boolean h(Ce paramCe) {
    for (dpI localdpI : paramCe) {
      if (q(localdpI)) {
        return true;
      }
      aLM localaLM = aww.cMI().zw(localdpI.yR());
      if (localaLM != null)
      {
        boolean bool = h(localaLM);
        if (bool)
          return true; 
      }
    }
    return false;
  }

  private boolean q(dpI paramdpI) {
    doA localdoA = (doA)bsj.bAv().kD(paramdpI.eo());
    return (localdoA != null) && ((localdoA instanceof aWl));
  }

  protected String azj()
  {
    if (this.dpp != null) {
      return (String)this.dpp.getFieldValue("smallIconUrl");
    }
    return null;
  }

  protected byte azk() {
    return 1;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void wb()
  {
    super.wb();

    if ((this.dpp != null) && (this.Rl != null))
      ((bhR)this.krJ).a(this.dpp, this.Rl);
  }
}