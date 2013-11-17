public class cUX
  implements bPr
{
  public static final int aEE = -1;
  public static final int kHA = 0;
  public static final int kHB = -2;
  private static final cUX kHC = new cUX();

  public static cUX cJU() {
    return kHC;
  }

  public int a(dno paramdno, aOm paramaOm)
  {
    bCI localbCI = (bCI)paramdno;
    if (paramaOm.Hy().goO > localbCI.bLc()) {
      return -2;
    }
    return a(localbCI.bLd(), paramaOm.getItem());
  }

  public int a(ccq paramccq, gA paramgA)
  {
    if (paramgA == null)
      return -1;
    if (paramgA.oi() == null)
      return -1;
    if (paramgA.oi().bKn() == null)
      return -1;
    if ((paramccq != null) && (!paramccq.l(paramgA.oi().bKn()))) {
      return -1;
    }
    return 0;
  }

  public int a(dno paramdno, aOm paramaOm, short paramShort) {
    return a(paramdno, paramaOm);
  }

  public int a(dno paramdno, aOm paramaOm1, aOm paramaOm2)
  {
    return a(paramdno, paramaOm2);
  }

  public int b(dno paramdno, aOm paramaOm)
  {
    return 0;
  }

  public boolean a(aOm paramaOm, dle paramdle, cOE paramcOE) {
    return true;
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE) {
    return true;
  }
}