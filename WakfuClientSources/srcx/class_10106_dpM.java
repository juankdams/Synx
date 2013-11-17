import java.util.Comparator;

final class dpM
  implements Comparator
{
  public int a(cRs paramcRs1, cRs paramcRs2)
  {
    boolean bool1 = paramcRs1.cHW();
    boolean bool2 = paramcRs2.cHW();
    if ((bool1) && (!bool2)) {
      return -1;
    }
    if ((!bool1) && (bool2)) {
      return 1;
    }
    return cKT.iJw.compare(paramcRs1, paramcRs2);
  }
}