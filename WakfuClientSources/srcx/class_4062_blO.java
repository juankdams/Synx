import java.util.Comparator;

public class blO
  implements Comparator
{
  public int compare(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        return 1;
      }
      return 0;
    }
    return paramObject1.equals(paramObject2) ? 0 : 1;
  }

  public String toString()
  {
    return "EqualComparator";
  }
}