public class bLY
  implements cDq
{
  private static final bLY gPt = new bLY();
  private final agk gPu;
  private byte gPv = 0;
  private int gPw = 0;
  private dwN gPx;

  private bLY()
  {
    this.gPu = new aAy(this);
  }

  public static bLY bTB()
  {
    return gPt;
  }

  public void e(bAF parambAF)
  {
    switch (this.gPv) {
    case 1:
      if ((!bB) && (this.gPx == null)) throw new AssertionError();
      f(parambAF);
      break;
    case -1:
      if ((!bB) && (this.gPx != null)) throw new AssertionError();
      bTC();
    }

    this.gPv = 0;
  }

  public void aMH()
  {
    btL.gcv.a(this.gPu);
    this.gPw = bFq.bNc();
  }

  public void bTC() {
    btL.gcv.b(this.gPu);
    bFq.sB(this.gPw);
  }

  public void c(dwN paramdwN)
  {
    if ((!bB) && (paramdwN == null)) throw new AssertionError();
    this.gPv = 1;
    this.gPx = paramdwN;
  }

  public void bTD()
  {
    this.gPv = -1;
    this.gPx = null;
  }

  private void f(bAF parambAF)
  {
    if (this.gPx != null)
      aMH();
  }
}