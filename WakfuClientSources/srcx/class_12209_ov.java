import java.util.HashMap;
import java.util.Map.Entry;
import org.apache.log4j.Logger;

public class ov
{
  private static final Logger K = Logger.getLogger(ov.class);

  private static boolean aTF = false;

  private static final HashMap aTG = new HashMap();

  public static void L(boolean paramBoolean) {
    aTF = paramBoolean;
    if (paramBoolean)
      aTG.clear();
  }

  public static void add(Object paramObject) {
    if (!aTF)
      return;
    HashMap localHashMap = (HashMap)aTG.get(paramObject.getClass());
    if (localHashMap == null) {
      localHashMap = new HashMap();
      aTG.put(paramObject.getClass(), localHashMap);
    }

    localHashMap.put(paramObject, new Exception().getStackTrace());
  }

  public static void remove(Object paramObject) {
    if (aTG.isEmpty())
      return;
    HashMap localHashMap = (HashMap)aTG.get(paramObject.getClass());
    if ((localHashMap == null) || (localHashMap.isEmpty())) {
      return;
    }

    localHashMap.remove(paramObject);
  }

  public static HashMap vU() {
    HashMap localHashMap = new HashMap();
    for (Map.Entry localEntry : aTG.entrySet())
      if (!((HashMap)localEntry.getValue()).isEmpty())
      {
        localHashMap.put(localEntry.getKey(), localEntry.getValue());
      }
    return localHashMap;
  }
}