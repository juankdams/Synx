import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class dPw extends bnS
  implements List
{
  private static final long serialVersionUID = -1403835447328619437L;

  public static List u(List paramList)
  {
    return new dPw(paramList);
  }

  protected dPw(List paramList)
  {
    super(paramList);
  }

  protected dPw(List paramList, Object paramObject)
  {
    super(paramList, paramObject);
  }

  protected List getList()
  {
    return (List)this.dNw;
  }

  public void add(int paramInt, Object paramObject)
  {
    synchronized (this.lock) {
      getList().add(paramInt, paramObject);
    }
  }

  public boolean addAll(int paramInt, Collection paramCollection) {
    synchronized (this.lock) {
      return getList().addAll(paramInt, paramCollection);
    }
  }

  public Object get(int paramInt) {
    synchronized (this.lock) {
      return getList().get(paramInt);
    }
  }

  public int indexOf(Object paramObject) {
    synchronized (this.lock) {
      return getList().indexOf(paramObject);
    }
  }

  public int lastIndexOf(Object paramObject) {
    synchronized (this.lock) {
      return getList().lastIndexOf(paramObject);
    }
  }

  public ListIterator listIterator()
  {
    return getList().listIterator();
  }

  public ListIterator listIterator(int paramInt)
  {
    return getList().listIterator(paramInt);
  }

  public Object remove(int paramInt) {
    synchronized (this.lock) {
      return getList().remove(paramInt);
    }
  }

  public Object set(int paramInt, Object paramObject) {
    synchronized (this.lock) {
      return getList().set(paramInt, paramObject);
    }
  }

  public List subList(int paramInt1, int paramInt2) {
    synchronized (this.lock) {
      List localList = getList().subList(paramInt1, paramInt2);

      return new dPw(localList, this.lock);
    }
  }
}