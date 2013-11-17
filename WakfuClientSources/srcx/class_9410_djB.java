import org.apache.log4j.Logger;

public class djB
  implements cvW
{
  protected static final Logger K = Logger.getLogger(djB.class);

  private static djB lgF = new djB();

  private final dQz lgG = new dQz();
  private cAK lgH;
  private bnm N;

  public static djB cSv()
  {
    return lgF;
  }

  public boolean a(cWG paramcWG)
  {
    if (PO.g(paramcWG)) {
      return false;
    }
    switch (paramcWG.getId())
    {
    case 19312:
      bzu localbzu = (bzu)paramcWG;
      long l = localbzu.ah();
      int i = localbzu.getIntValue();

      cKX localcKX = cBQ.cxL().a(bU.fH().getString("zaap.confirmTravel", new Object[] { Integer.valueOf(i) }), Cn.et(0), 2073L, 102, 1);

      if (localcKX != null) {
        localcKX.a(new aFs(this, l));

        return false;
      }

      return false;
    }

    return true;
  }

  public void c(cAK paramcAK) {
    this.lgH = paramcAK;
    if (paramcAK.chE() == dFN.lQe) {
      this.lgG.kT(paramcAK.getId());
    } else if (paramcAK.chE() == dFN.lQi) {
      byz localbyz = byv.bFN().bFO();
      this.lgG.C(paramcAK.getId(), ((L)paramcAK).d(localbyz.bSt().CD()));
    } else {
      K.error("Type de voyage inconnu, on ne peut pas initialiser le provider");
    }

    byv.bFN().a(this);
  }

  public void cSw() {
    dOc localdOc = (dOc)cBQ.cxL().mU("zaapDialog");
    if (localdOc != null)
      localdOc.setVisible(false);
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new aFr(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("ticketOffice", this.lgG);
      dLE.doY().t("boatTicketOffice", Boolean.valueOf(false));

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

      cBQ.cxL().mN("wakfu.zaap");

      this.lgH = null;
    }
  }
}