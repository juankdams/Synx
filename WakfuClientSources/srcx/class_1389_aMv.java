import java.util.Comparator;

final class aMv
  implements Comparator
{
  public int a(aVw paramaVw1, aVw paramaVw2)
  {
    if (paramaVw1 == null)
      return -1;
    if (paramaVw2 == null)
      return 1;
    return paramaVw2.bdH().compareTo(paramaVw1.bdH());
  }
}