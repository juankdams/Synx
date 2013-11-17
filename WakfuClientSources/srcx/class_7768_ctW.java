import org.apache.log4j.Logger;

public class ctW
  implements cvW
{
  protected static final Logger K = Logger.getLogger(ctW.class);

  private static ctW ied = new ctW();

  private final aUg iee = new aUg();
  private cAK ief;
  private bnm N;

  public static ctW csy()
  {
    return ied;
  }

  public boolean a(cWG paramcWG)
  {
    if (PO.g(paramcWG)) {
      return false;
    }

    switch (paramcWG.getId()) {
    case 19312:
      bzu localbzu = (bzu)paramcWG;
      long l = localbzu.ah();
      int i = localbzu.getIntValue();

      cKX localcKX = cBQ.cxL().a(bU.fH().getString("zaap.confirmTravel", new Object[] { Integer.valueOf(i) }), Cn.et(0), 2073L, 102, 1);

      if (localcKX != null) {
        localcKX.a(new cFE(this, l));

        return false;
      }

      return false;
    }

    return true;
  }

  public void c(cAK paramcAK) {
    this.ief = paramcAK;
    this.iee.a(paramcAK.getId(), paramcAK);

    byv.bFN().a(this);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new cFF(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("ticketOffice", this.iee);
      dLE.doY().t("boatTicketOffice", Boolean.valueOf(true));

      cBQ.cxL().a("zaapDialog", VV.dJ("zaapDialog"), 1L, (short)10000);

      cBQ.cxL().j("wakfu.zaap", bjW.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("zaapDialog");

      dLE.doY().removeProperty("ticketOffice");
      dLE.doY().removeProperty("boatTicketOffice");

      cBQ.cxL().mN("wakfu.zaap");

      this.ief = null;
    }
  }
}