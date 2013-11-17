import java.util.Comparator;

abstract class bme
{
  private final Comparator cwp;

  private bme(Ej paramEj, Comparator paramComparator)
  {
    this.cwp = paramComparator;
  }

  public final int compare(Object paramObject1, Object paramObject2)
  {
    return this.cwp.compare(paramObject1, paramObject2);
  }

  public abstract int a(Ej paramEj, Object paramObject);
}