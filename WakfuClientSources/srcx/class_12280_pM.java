public abstract class pM
  implements cvW
{
  protected gA aUe;
  protected BG aWp;
  protected int aWq;
  protected short aWr;
  protected cVE aWs;

  protected boolean wY()
  {
    if (this.aWs == null)
      return false;
    this.aWq = a(this.aWp.nP(), this.aWp.Hy(), this.aWp.KI().gpi, this.aWp.Hv());
    if (this.aWq == -1)
      return false;
    dLE.doY().t("stackTax", Integer.valueOf(this.aWq));
    return true;
  }

  private int a(short paramShort, bCe parambCe, double paramDouble, int paramInt)
  {
    int i = paramShort / parambCe.goO;
    long l = Math.round(paramInt * i * paramDouble);
    if ((l < 0L) || (l > 2147483647L))
      return -1;
    return akb.dkL.a(byv.bFN().bFO(), this.aWs, (int)l);
  }

  protected boolean wZ() {
    byz localbyz = byv.bFN().bFO();
    int i = localbyz.JE();
    return i >= this.aWq;
  }

  protected void b(gA paramgA, short paramShort) {
    this.aWp.setItem(paramgA);
    this.aWr = paramShort;
    this.aWp.l(this.aWr);
    this.aWp.b(bCe.gwo);
    this.aWp.KJ();
    this.aWp.ed(0);
    this.aWp.KK();
    this.aWp.b(bAp.gpd);
    wY();
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    this.aWp = BG.KH();

    dLE.doY().t("merchantItem", this.aWp);

    cBQ.cxL().j("wakfu.merchant.tax", bsN.class);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    this.aWs = null;

    this.aWp.setItem(null);
    this.aWp.release();
    this.aWp = null;

    dLE.doY().t("merchantItem", null);

    cBQ.cxL().mN("wakfu.merchant.tax");
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    switch (paramcWG.getId()) {
    case 17300:
      if (this.aWp.getItem() == null)
        return false;
      localObject1 = (bzu)paramcWG;
      int i = ((bzu)localObject1).getIntValue();
      if (this.aWp.nP() * i < 0)
        i = 0;
      int j = this.aWp.Hv();
      this.aWp.ed(i);

      if (!wY())
        this.aWp.ed(j);
      return false;
    case 17311:
      if (this.aWp.getItem() == null)
        return false;
      localObject1 = (cga)paramcWG;
      localObject2 = this.aWp.KI();
      this.aWp.b(((cga)localObject1).bdK());
      if (!wY())
        this.aWp.b((bAp)localObject2);
      return false;
    case 17302:
      if (this.aWp.getItem() == null)
        return false;
      localObject1 = (cLw)paramcWG;
      localObject2 = ((cLw)localObject1).Hy();
      bCe localbCe = this.aWp.Hy();
      this.aWp.b((bCe)localObject2);
      short s1 = (short)(this.aWr / ((bCe)localObject2).goO * ((bCe)localObject2).goO);
      short s2 = this.aWp.nP();
      this.aWp.l(s1);

      if (!wY()) {
        this.aWp.b(localbCe);
        this.aWp.l(s2);
      }
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}