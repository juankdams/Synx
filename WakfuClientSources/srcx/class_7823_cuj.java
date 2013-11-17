import org.apache.log4j.Logger;

public class cuj
  implements cvW
{
  protected static final Logger K = Logger.getLogger(cuj.class);

  private static final cuj ieC = new cuj();
  private bnm N;
  private aGP ieD;

  public static cuj csG()
  {
    return ieC;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bmk(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("bookcaseDialog", VV.dJ("bookcaseDialog"), 1L, (short)10000);

      aWc.blo().eO(600012L);

      cBQ.cxL().j("wakfu.bookcase", cWu.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("bookcaseDialog");

      dLE.doY().removeProperty("bookcase");

      aWc.blo().eO(600013L);

      cBQ.cxL().mN("wakfu.bookcase");
    }
  }

  private void addBook(gA paramgA, short paramShort)
  {
    byz localbyz = byv.bFN().bFO();
    if (!paramgA.oi().b(bGS.gDJ))
    {
      return;
    }

    aEq localaEq = this.ieD.aSS();
    EA localEA = localaEq.abI();
    if ((localEA.sN() != localbyz.getId()) && (!deV.jF(localEA.sN())))
    {
      return;
    }
    if (!localaEq.aQC().h(paramgA, paramShort))
    {
      return;
    }

    bhJ localbhJ = new bhJ(paramgA.oj(), (byte)paramShort);
    aDp localaDp = new aDp();
    localaDp.b(localaEq.getId());
    localaDp.a(localbhJ);
    byv.bFN().aJK().d(localaDp);
  }

  private void removeBook(short paramShort) {
    byz localbyz = byv.bFN().bFO();
    aEq localaEq = this.ieD.aSS();
    EA localEA = localaEq.abI();
    if ((localEA.sN() != localbyz.getId()) && (!deV.jF(localEA.sN())))
    {
      return;
    }
    dHz localdHz = new dHz((byte)paramShort);
    aDp localaDp = new aDp();
    localaDp.b(this.ieD.aSS().getId());
    localaDp.a(localdHz);
    byv.bFN().aJK().d(localaDp);
  }

  private void o(byte paramByte1, byte paramByte2) {
    byz localbyz = byv.bFN().bFO();
    aEq localaEq = this.ieD.aSS();
    EA localEA = localaEq.abI();
    if ((localEA.sN() != localbyz.getId()) && (!deV.jF(localEA.sN())))
    {
      return;
    }
    aPw localaPw = new aPw(paramByte1, paramByte2);
    aDp localaDp = new aDp();
    localaDp.b(this.ieD.aSS().getId());
    localaDp.a(localaPw);
    byv.bFN().aJK().d(localaDp);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 19316:
      localObject = (czW)paramcWG;
      addBook(((czW)localObject).getItem(), ((czW)localObject).ag());
      return false;
    case 19318:
      localObject = (bzu)paramcWG;
      byte b1 = ((bzu)localObject).af();
      byte b2 = (byte)((bzu)localObject).ag();

      o(b1, b2);
      return false;
    case 19317:
      localObject = (czW)paramcWG;
      removeBook(((czW)localObject).ag());
      return false;
    case 19319:
      localObject = (czW)paramcWG;
      gA localgA = ((czW)localObject).getItem();
      if (localgA != null) {
        ((dDX)localgA.oi().bKr()).display();
      }
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void b(aEq paramaEq) {
    this.ieD = new aGP(paramaEq);
    dLE.doY().t("bookcase", this.ieD);
    byv.bFN().a(this);
  }
}