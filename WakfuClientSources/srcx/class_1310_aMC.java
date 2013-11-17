import java.util.Comparator;

final class aMC
  implements Comparator
{
  public int a(aVw paramaVw1, aVw paramaVw2)
  {
    if (paramaVw1 == null)
      return -1;
    if (paramaVw2 == null) {
      return 1;
    }
    if (paramaVw1.bdJ() != paramaVw2.bdJ()) {
      return paramaVw2.bdJ() - paramaVw1.bdJ();
    }
    return paramaVw2.c(paramaVw1);
  }
}