import java.util.Comparator;

class bqt
  implements Comparator
{
  bqt(cub paramcub)
  {
  }

  public int a(dym paramdym1, dym paramdym2)
  {
    String str1 = paramdym1.getName().toUpperCase();
    String str2 = paramdym2.getName().toUpperCase();
    return str1.compareTo(str2);
  }
}