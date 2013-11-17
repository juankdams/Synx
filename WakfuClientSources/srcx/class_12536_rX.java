import org.apache.log4j.Logger;

public class rX extends dKd
  implements cvW
{
  private static rX baf = new rX();
  protected static final Logger K = Logger.getLogger(rX.class);
  private dRY bag;
  private ccG bah;
  private bnm N;

  public static rX yA()
  {
    return baf;
  }

  public boolean a(cWG paramcWG)
  {
    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bpj(this);

      cBQ.cxL().a(this.N);

      init();

      dOc localdOc = (dOc)cBQ.cxL().a("dimensionalBagFleaDialog", VV.dJ("dimensionalBagFleaDialog"), 32769L, (short)10000);

      this.bah = ((ccG)localdOc.getElementMap().fi("itemsList"));
      bpn localbpn = (bpn)localdOc.getElementMap().fi("fleaWindow");
      this.bag = new bpi(this, localbpn);

      this.bah.a(this.bag);

      byv.bFN().b(Rl.acN());
      byv.bFN().aJK().a(cBM.cxH());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);
      this.bah.b(this.bag);
      this.bah = null;
      this.bag = null;

      clean();

      cBQ.cxL().mW("dimensionalBagFleaDialog");
      cBQ.cxL().mW("confirmFleaPurchaseDialog");

      byv.bFN().a(Rl.acN());
      byv.bFN().aJK().b(cBM.cxH());
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(Object paramObject, dKc paramdKc) {
    lWH = new bpk(this, paramObject, paramdKc);

    bVl.caZ().b(lWH);
  }
}