import java.util.Comparator;

class dhE
  implements Comparator
{
  dhE(dwC paramdwC)
  {
  }

  public int a(dkI paramdkI1, dkI paramdkI2)
  {
    if (paramdkI1 == paramdkI2)
      return 0;
    if (paramdkI1.agg() == paramdkI2.agg())
      return 0;
    if (paramdkI1.agg() > paramdkI2.agg())
      return 1;
    return -1;
  }
}