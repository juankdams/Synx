import java.util.Comparator;

final class lE
  implements Comparator
{
  public int a(bJP parambJP1, bJP parambJP2)
  {
    if (parambJP1.getX() < parambJP2.getX())
      return -1;
    return parambJP1.getX() == parambJP2.getX() ? 0 : 1;
  }
}