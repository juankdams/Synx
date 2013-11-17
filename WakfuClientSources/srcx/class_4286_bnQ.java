import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class bnQ
  implements Iterable
{
  protected final LinkedHashMap fHa;
  private int fHb;
  private int fHc = 0;
  private int fHd = 1;

  public bnQ(int paramInt) {
    this.fHb = paramInt;
    this.fHa = new cfD(this, paramInt, 0.75F, true);
  }

  public Object get(Object paramObject)
  {
    return this.fHa.get(paramObject);
  }

  public void put(Object paramObject1, Object paramObject2)
  {
    this.fHa.put(paramObject1, paramObject2);
  }

  public void remove(Object paramObject)
  {
    this.fHa.remove(paramObject);
  }

  public void clear()
  {
    this.fHa.clear();
  }

  public int bxJ()
  {
    return this.fHb;
  }

  public void qs(int paramInt)
  {
    this.fHb = paramInt;
    this.fHd = 1;
    this.fHc = 0;
  }

  public int bxK()
  {
    return this.fHc;
  }

  public int bxL()
  {
    return this.fHd;
  }

  public int bxM()
  {
    return this.fHa.size() * 100 / this.fHb;
  }

  public int size()
  {
    return this.fHa.size();
  }

  public Iterator iterator()
  {
    return this.fHa.values().iterator();
  }
}