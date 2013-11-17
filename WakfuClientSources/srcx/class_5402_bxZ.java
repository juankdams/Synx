import java.util.Collections;
import java.util.Comparator;

final class bxZ extends bme
{
  private bxZ(Ej paramEj, Comparator paramComparator)
  {
    super(paramEj, paramComparator, null);
  }

  public final int a(Ej paramEj, Object paramObject)
  {
    return Collections.binarySearch(paramEj, paramObject, bme.a(this));
  }
}