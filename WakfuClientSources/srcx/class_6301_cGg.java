public class cGg
  implements bPr
{
  public static final int iBs = 0;
  public static final int iBt = -1;
  public static final int iBu = -2;

  public int a(dno paramdno, ahg paramahg)
  {
    if ((paramahg.asL() != bKq.gNe) && (paramahg.asL() != bKq.gNg) && (paramahg.asL() != bKq.gNf))
    {
      return -2;
    }
    return 0;
  }

  public int a(dno paramdno, ahg paramahg, short paramShort) {
    return a(paramdno, paramahg);
  }

  public int a(dno paramdno, ahg paramahg1, ahg paramahg2) {
    return a(paramdno, paramahg2);
  }

  public int b(dno paramdno, ahg paramahg) {
    return a(paramdno, paramahg);
  }

  public boolean a(ahg paramahg, dle paramdle, cOE paramcOE) {
    return false;
  }

  public boolean a(dno paramdno, dle paramdle, cOE paramcOE) {
    return false;
  }
}