import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class bzh extends aHh
  implements List
{
  private static final long serialVersionUID = 1077193035000013141L;

  public static List a(List paramList, bna parambna)
  {
    return new bzh(paramList, parambna);
  }

  protected bzh(List paramList, bna parambna)
  {
    super(paramList, parambna);
  }

  protected List getList()
  {
    return (List)this.dNw;
  }

  public Object get(int paramInt)
  {
    return getList().get(paramInt);
  }

  public int indexOf(Object paramObject) {
    return getList().indexOf(paramObject);
  }

  public int lastIndexOf(Object paramObject) {
    return getList().lastIndexOf(paramObject);
  }

  public Object remove(int paramInt) {
    return getList().remove(paramInt);
  }

  public void add(int paramInt, Object paramObject)
  {
    paramObject = an(paramObject);
    getList().add(paramInt, paramObject);
  }

  public boolean addAll(int paramInt, Collection paramCollection) {
    paramCollection = e(paramCollection);
    return getList().addAll(paramInt, paramCollection);
  }

  public ListIterator listIterator() {
    return listIterator(0);
  }

  public ListIterator listIterator(int paramInt) {
    return new aTZ(this, getList().listIterator(paramInt));
  }

  public Object set(int paramInt, Object paramObject) {
    paramObject = an(paramObject);
    return getList().set(paramInt, paramObject);
  }

  public List subList(int paramInt1, int paramInt2) {
    List localList = getList().subList(paramInt1, paramInt2);
    return new bzh(localList, this.eeS);
  }

  static Object a(bzh parambzh, Object paramObject)
  {
    return parambzh.an(paramObject); } 
  static Object b(bzh parambzh, Object paramObject) { return parambzh.an(paramObject); }

}