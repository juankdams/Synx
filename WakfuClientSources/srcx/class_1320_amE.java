import com.ankamagames.wakfu.client.WakfuClientInstance;

public class amE extends cMt
{
  private static amE dpo = new amE();

  private gA aUe = null;
  private byte bPk;
  private apX dpp = null;

  private amE()
  {
    this.krJ = dJl.diE();
    ((aTL)WakfuClientInstance.awy().Dg()).a((dJl)this.krJ);
  }

  public static amE azg() {
    return dpo;
  }

  public void d(apX paramapX) {
    this.dpp = paramapX;
  }

  public apX azh() {
    return this.dpp;
  }

  public void a(gA paramgA, byte paramByte) {
    this.aUe = paramgA;
    this.bPk = paramByte;
  }

  public gA getItem() {
    return this.aUe;
  }

  protected Ce wa()
  {
    return this.aUe;
  }

  protected void x(int paramInt1, int paramInt2, short paramShort)
  {
    blG localblG = new blG();
    localblG.X(this.Rl.getId());
    localblG.aW(this.aUe.oj());
    localblG.V(this.bPk);
    localblG.fG(this.dpp.oj());
    localblG.z(paramInt1, paramInt2, paramShort);
    byv.bFN().aJK().d(localblG);
  }

  protected void azi()
  {
    byz localbyz = byv.bFN().bFO();
    if (this.Rl == localbyz) {
      localbyz.aa(this.aUe);
      localbyz.e(this.dpp);
    }
  }

  protected String azj()
  {
    if (this.aUe != null) {
      return (String)this.aUe.getFieldValue("smallIconUrl");
    }
    return null;
  }

  protected byte azk() {
    return 2;
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

    if ((this.aUe != null) && (this.Rl != null))
      ((dJl)this.krJ).a(this.aUe, this.Rl);
  }

  protected String azl()
  {
    return "";
  }
}