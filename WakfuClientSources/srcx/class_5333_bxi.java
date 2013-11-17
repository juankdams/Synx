import java.util.Stack;

public class bxi extends Stack
{
  private static final long serialVersionUID = -5555522620060077046L;

  public static bxi a(Stack paramStack)
  {
    if ((paramStack instanceof bxi)) {
      return (bxi)paramStack;
    }
    bxi localbxi = new bxi();
    if (paramStack != null) {
      localbxi.addAll(paramStack);
    }
    return localbxi;
  }

  public bxi()
  {
  }

  public bxi(Object paramObject)
  {
    push(paramObject);
  }

  public synchronized boolean contains(Object paramObject)
  {
    return indexOf(paramObject) >= 0;
  }

  public synchronized int indexOf(Object paramObject, int paramInt)
  {
    int i = size();
    for (int j = paramInt; j < i; j++) {
      if (get(j) == paramObject) {
        return j;
      }
    }
    return -1;
  }

  public synchronized int lastIndexOf(Object paramObject, int paramInt)
  {
    for (int i = paramInt; i >= 0; i--) {
      if (get(i) == paramObject) {
        return i;
      }
    }
    return -1;
  }
}