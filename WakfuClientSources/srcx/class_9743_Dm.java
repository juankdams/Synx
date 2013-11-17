import org.apache.log4j.Logger;

public class Dm
  implements cvW
{
  public static final Dm bHF = new Dm();
  protected static final Logger K = Logger.getLogger(Dm.class);
  private dfw bHG;
  private bnm N;

  public boolean a(cWG paramcWG)
  {
    bzu localbzu;
    switch (paramcWG.getId()) {
    case 19370:
      localbzu = (bzu)paramcWG;
      String str = localbzu.getStringValue();
      this.bHG.setSearch(str);
      return false;
    case 19371:
      localbzu = (bzu)paramcWG;
      this.bHG.cjp();
      return false;
    case 19372:
      localbzu = (bzu)paramcWG;
      this.bHG.cjq();
      return false;
    }

    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new ceD(this);

      this.bHG = new dfw();
      dLE.doY().t("tutorialBook", this.bHG);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("tutorialBookDialog", VV.dJ("tutorialBookDialog"), 32768L, (short)10000);

      cBQ.cxL().j("wakfu.tutorialBook", bLU.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.bHG = null;
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("tutorialBookDialog");

      cBQ.cxL().mN("wakfu.tutorialBook");

      dLE.doY().removeProperty("tutorialBook");
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}