import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public abstract class On extends axX
  implements List
{
  protected On()
  {
  }

  protected On(List paramList)
  {
    super(paramList);
  }

  protected List getList()
  {
    return (List)getCollection();
  }

  public void add(int paramInt, Object paramObject)
  {
    getList().add(paramInt, paramObject);
  }

  public boolean addAll(int paramInt, Collection paramCollection) {
    return getList().addAll(paramInt, paramCollection);
  }

  public Object get(int paramInt) {
    return getList().get(paramInt);
  }

  public int indexOf(Object paramObject) {
    return getList().indexOf(paramObject);
  }

  public int lastIndexOf(Object paramObject) {
    return getList().lastIndexOf(paramObject);
  }

  public ListIterator listIterator() {
    return getList().listIterator();
  }

  public ListIterator listIterator(int paramInt) {
    return getList().listIterator(paramInt);
  }

  public Object remove(int paramInt) {
    return getList().remove(paramInt);
  }

  public Object set(int paramInt, Object paramObject) {
    return getList().set(paramInt, paramObject);
  }

  public List subList(int paramInt1, int paramInt2) {
    return getList().subList(paramInt1, paramInt2);
  }
}