import org.apache.log4j.Logger;

public class csf
  implements cvW
{
  protected static final Logger K = Logger.getLogger(csf.class);

  public static final csf ibS = new csf();
  private bnm N;
  private bre ibT;

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.N = new dAC(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("stuffPreviewDialog", VV.dJ("stuffPreviewDialog"), 1L, (short)10000);

      aWc.blo().eO(600012L);

      cBQ.cxL().j("wakfu.stuffPreview", dHD.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localbyz.ayJ().c(this.ibT);
      }

      dHD.setDraggedItemId(-1L);

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("stuffPreviewDialog");

      dLE.doY().removeProperty("stuffPreview");

      aWc.blo().eO(600013L);

      cBQ.cxL().mN("wakfu.stuffPreview");
    }
  }

  public boolean a(cWG paramcWG)
  {
    czW localczW;
    switch (paramcWG.getId()) {
    case 19368:
      localczW = (czW)paramcWG;
      d(localczW.getItem(), localczW.af());
      return false;
    case 19369:
      localczW = (czW)paramcWG;

      a(localczW);

      return false;
    }

    return true;
  }

  public bre cqD() {
    return this.ibT;
  }

  private void d(gA paramgA, byte paramByte) {
    this.ibT.c(paramgA, paramByte);
  }

  private void a(czW paramczW) {
    this.ibT.da(paramczW.af());
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void am(gA paramgA) {
    this.ibT = new bre();
    this.ibT.Y(paramgA);
    dLE.doY().t("stuffPreview", this.ibT);
    byv.bFN().a(this);
  }
}