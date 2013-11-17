public class dDd extends aXi
{
  public static final int ENABLED = 0;
  public static final int cRz = 1;
  private int cRA;

  public dDd(String paramString, int paramInt)
  {
    this.m_name = paramString;
    this.aSg = paramInt;
  }

  public dDd() {
  }

  public aXi arH() {
    return new dDd(this.m_name, this.aSg);
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();

    if (!bGP.gDv.a(new aGH[] { localbyz })) {
      this.cRA = 1;
      return false;
    }
    return this.bur;
  }

  public String getLabel() {
    lZ locallZ = new lZ().tz().am(isEnabled() ? icr : ict);
    locallZ.a(bU.fH().getString(this.m_name)).tA();
    if (!isEnabled()) {
      switch (this.cRA) {
      case 1:
        locallZ.tH().am(ict).a(bU.fH().getString("error.playerNotSubscribed"));
      }
    }

    return locallZ.tP();
  }

  public void run() {
    super.run();
    aQw localaQw = aQw.bhd();
    localaQw.a((dFo)this.dvI);
    aOo.euG.a(new bXu(localaQw));
  }
}