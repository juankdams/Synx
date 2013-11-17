import java.util.Comparator;

final class bAV
  implements Comparator
{
  public int a(dNt paramdNt1, dNt paramdNt2)
  {
    if ((paramdNt1 == null) || (paramdNt1.getFullName() == null))
      return -1;
    if ((paramdNt2 == null) || (paramdNt2.getFullName() == null))
      return 1;
    return paramdNt1.getFullName().compareTo(paramdNt2.getFullName());
  }
}