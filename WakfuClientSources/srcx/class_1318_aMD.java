import java.util.Comparator;

final class aMD
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
      return paramaVw1.bdJ() - paramaVw2.bdJ();
    }
    return paramaVw1.c(paramaVw2);
  }
}