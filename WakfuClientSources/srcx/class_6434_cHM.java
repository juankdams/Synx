import com.ankamagames.wakfu.client.WakfuClientInstance;

public class cHM extends cMt
{
  private static cHM iCT = new cHM();

  private gA aUe = null;
  private byte bPk;

  private cHM()
  {
    this.krJ = dJl.diE();
    ((aTL)WakfuClientInstance.awy().Dg()).a((dJl)this.krJ);
  }

  public static cHM cBY()
  {
    return iCT;
  }

  public void a(gA paramgA, byte paramByte)
  {
    this.aUe = paramgA;
    this.bPk = paramByte;
  }

  public gA getItem()
  {
    return this.aUe;
  }

  protected Ce wa()
  {
    return this.aUe;
  }

  protected void x(int paramInt1, int paramInt2, short paramShort)
  {
    aPd localaPd = new aPd();
    localaPd.X(this.Rl.getId());
    localaPd.aW(this.aUe.oj());
    localaPd.V(this.bPk);
    localaPd.z(paramInt1, paramInt2, paramShort);
    byv.bFN().aJK().d(localaPd);
  }

  protected void azi()
  {
    if (this.Rl == byv.bFN().bFO())
      byv.bFN().bFO().aa(this.aUe);
  }

  protected String azj()
  {
    if (this.aUe != null) {
      return (String)this.aUe.getFieldValue("iconUrl");
    }
    return null;
  }

  protected byte azk() {
    return 0;
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