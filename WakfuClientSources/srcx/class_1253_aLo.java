import java.util.Comparator;

final class aLo
  implements Comparator
{
  static final Comparator bEa = new aLo();

  public int a(Of paramOf1, Of paramOf2) {
    return paramOf1.getName().compareTo(paramOf2.getName());
  }
}