import java.util.Comparator;

final class Av
  implements Comparator
{
  public int a(cfW paramcfW1, cfW paramcfW2)
  {
    String str1 = bU.fH().getString("desc.mru." + paramcfW1.qa());
    String str2 = bU.fH().getString("desc.mru." + paramcfW2.qa());
    return str1.compareTo(str2);
  }
}