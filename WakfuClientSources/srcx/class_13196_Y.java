import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Y
{
  private static Y bi = new Y();
  private final cSR bj;

  public Y()
  {
    this.bj = new cSR();
  }

  public static Y ax()
  {
    return bi;
  }

  public void a(int paramInt1, int paramInt2, short paramShort1, short paramShort2, short paramShort3)
  {
    cSR localcSR = (cSR)this.bj.get(paramInt1);
    if (localcSR == null) {
      localcSR = new cSR();
      this.bj.put(paramInt1, localcSR);
    }
    Object localObject = (List)localcSR.get(paramInt2);
    if (localObject == null) {
      localObject = new ArrayList();
      localcSR.put(paramInt2, localObject);
    }

    Iterator localIterator = ((List)localObject).iterator();
    int i = 0;
    while (localIterator.hasNext()) {
      cj localcj = (cj)localIterator.next();
      if (localcj.gc() == paramShort1) {
        throw new UnsupportedOperationException("Impossible d'ajouter deux fois un step de même limite");
      }
      if (localcj.gc() > paramShort1)
        break;
      i++;
    }
    ((List)localObject).add(i, new cj(this, paramShort1, paramShort2, paramShort3));
  }

  public short a(int paramInt1, int paramInt2, short paramShort) {
    cj localcj = c(paramInt1, paramInt2, paramShort);
    if (localcj != null)
      return localcj.ge();
    return 32767;
  }

  public short b(int paramInt1, int paramInt2, short paramShort) {
    cj localcj = c(paramInt1, paramInt2, paramShort);
    if (localcj != null)
      return localcj.gd();
    return 0;
  }

  private cj c(int paramInt1, int paramInt2, short paramShort)
  {
    Object localObject = null;
    cSR localcSR = (cSR)this.bj.get(paramInt1);

    if (localcSR != null) {
      List localList = (List)localcSR.get(paramInt2);
      if (localList != null) {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext()) {
          cj localcj = (cj)localIterator.next();
          if (localcj.gc() > paramShort) {
            return localObject;
          }
          localObject = localcj;
        }
      }
    }

    return localObject;
  }

  public void ay()
  {
    this.bj.clear();
  }
}