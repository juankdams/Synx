import java.util.Collection;

public class FQ
{
  public static cYk a(cYk paramcYk, Collection paramCollection)
  {
    if (paramCollection.isEmpty()) {
      return null;
    }
    int i = 2147483647;
    Object localObject = null;
    for (cYk localcYk : paramCollection) {
      int j = localcYk.ac(paramcYk);
      if (j < i) {
        localObject = localcYk;
        i = j;
      }
    }

    return localObject;
  }
}