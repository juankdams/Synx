import java.util.Comparator;

public class mD
  implements Comparator
{
  private static mD aQY = new mD();

  public int a(aLE paramaLE1, aLE paramaLE2) {
    return paramaLE1.getLevel() - paramaLE2.getLevel();
  }
}