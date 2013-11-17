import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class cJY
{
  private final LinkedList iIz = new LinkedList();

  public void ny(String paramString)
  {
    if (!this.iIz.isEmpty())
      ((Map)this.iIz.getFirst()).put(paramString, bYq.hos);
  }

  public void cDP()
  {
    this.iIz.addFirst(new HashMap());
  }

  public void cDQ()
  {
    ((Map)this.iIz.removeFirst()).clear();
  }

  public cJY cDR()
  {
    cJY localcJY = new cJY();
    localcJY.iIz.addAll(this.iIz);
    return localcJY;
  }

  public Object a(String paramString, afR paramafR)
  {
    for (Map localMap : this.iIz) {
      Object localObject = localMap.get(paramString);
      if (localObject != null) {
        return localObject;
      }
    }
    return null;
  }

  public boolean a(String paramString, Object paramObject, afR paramafR)
  {
    Map localMap = nz(paramString);
    if (localMap == null) {
      return false;
    }
    Object localObject = localMap.get(paramString);
    if (localObject == bYq.hos) {
      localMap.put(paramString, paramObject);
    }
    return true;
  }

  public boolean b(String paramString, Object paramObject, afR paramafR)
  {
    Map localMap = nz(paramString);
    if (localMap == null) {
      return false;
    }
    localMap.put(paramString, paramObject);
    return true;
  }

  private Map nz(String paramString) {
    for (Map localMap : this.iIz) {
      if (localMap.get(paramString) != null) {
        return localMap;
      }
    }
    return null;
  }
}