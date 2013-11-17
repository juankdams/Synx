import java.util.Comparator;

final class cVc
  implements Comparator
{
  public int a(bXe parambXe1, bXe parambXe2)
  {
    if (parambXe1 == parambXe2)
      return 0;
    if (parambXe1 == null)
      return 1;
    if (parambXe2 == null)
      return -1;
    return Integer.signum(bXe.b(parambXe2) - bXe.b(parambXe1));
  }
}