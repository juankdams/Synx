import org.apache.log4j.Logger;

public class dtN extends dKd
  implements cvW
{
  private static dtN lwM = new dtN();
  protected static final Logger K = Logger.getLogger(dtN.class);
  private aoL lwN = new aoL();
  private afQ lwO;
  private afQ lwP;
  private ccG lwQ;
  private ccG lwR;
  private bnm lwS;
  private bnm N;

  public static dtN cZR()
  {
    return lwM;
  }

  public boolean a(cWG paramcWG)
  {
    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new cEK(this);

      cBQ.cxL().a(this.N);

      init();

      dOc localdOc = (dOc)cBQ.cxL().a("dimensionalBagFleaListDialog", VV.dJ("dimensionalBagFleaListDialog"), 32769L, (short)10000);

      this.lwQ = ((ccG)localdOc.getElementMap().fi("fleaList"));
      bpn localbpn = (bpn)localdOc.getElementMap().fi("fleaWindow");
      this.lwO = new afQ(this, this.lwQ, localbpn, null);
      this.lwQ.a(this.lwO);

      byv.bFN().aJK().a(Xk.ajn());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);
      cBQ.cxL().b(this.lwS);
      this.lwS = null;

      this.lwQ.b(this.lwO);
      this.lwQ = null;
      this.lwO = null;

      if (this.lwR != null) {
        this.lwR.b(this.lwP);
        this.lwR = null;
        this.lwP = null;
      }

      clean();

      cBQ.cxL().mW("dimensionalBagFleaListDialog");
      cBQ.cxL().mW("dimensionalBagFleaDialog");
      cBQ.cxL().mW("confirmFleaPurchaseDialog");

      byv.bFN().aJK().b(Xk.ajn());
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void kj(long paramLong) {
    this.lwN.remove(paramLong);
  }

  public void a(long paramLong, Cs paramCs) {
    this.lwN.put(paramLong, paramCs);
  }

  public Cs kk(long paramLong) {
    return (Cs)this.lwN.get(paramLong);
  }

  public void cZS() {
    cBQ.cxL().mW("dimensionalBagFleaDialog");
  }

  public void b(dag paramdag) {
    if (cBQ.cxL().mZ("dimensionalBagFleaDialog")) {
      return;
    }

    bpn localbpn1 = (bpn)cBQ.cxL().coO().nf("dimensionalBagFleaListDialog").fi("fleaWindow");
    bpn localbpn2;
    if (localbpn1.getX() + localbpn1.getWidth() * 2 > cBQ.cxL().cxS().MH()) {
      localbpn2 = (bpn)cBQ.cxL().a("dimensionalBagFleaDialog", VV.dJ("dimensionalBagFleaDialog"), "dimensionalBagFleaListDialog", "dimensionalBagFleaListDialog", dHp.lSt, 1L, (short)10000);
    }
    else {
      localbpn2 = (bpn)cBQ.cxL().a("dimensionalBagFleaDialog", VV.dJ("dimensionalBagFleaDialog"), 17L, (short)10000);
    }

    if (localbpn2 != null) {
      this.lwR = ((ccG)localbpn2.getElementMap().fi("itemsList"));
      this.lwP = new afQ(this, this.lwR, localbpn1, null);
      this.lwR.a(this.lwP);
    }
  }

  public void a(Object paramObject, dKc paramdKc) {
    lWH = new cEF(this, paramObject, paramdKc);

    bVl.caZ().b(lWH);
  }

  public void cZT() {
    if (this.lwQ == null) {
      return;
    }
    this.lwO.setListOffset(this.lwQ.getOffset());
  }
}