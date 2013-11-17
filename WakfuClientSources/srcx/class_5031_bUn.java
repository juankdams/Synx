import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class bUn extends bIJ
  implements List
{
  private static final long serialVersionUID = -5722039223898659102L;

  public static List a(List paramList, cSc paramcSc)
  {
    return new bUn(paramList, paramcSc);
  }

  protected bUn(List paramList, cSc paramcSc)
  {
    super(paramList, paramcSc);
  }

  protected List getList()
  {
    return (List)getCollection();
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
    aK(paramObject);
    getList().add(paramInt, paramObject);
  }

  public boolean addAll(int paramInt, Collection paramCollection) {
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) {
      aK(localIterator.next());
    }
    return getList().addAll(paramInt, paramCollection);
  }

  public ListIterator listIterator() {
    return listIterator(0);
  }

  public ListIterator listIterator(int paramInt) {
    return new pf(this, getList().listIterator(paramInt));
  }

  public Object set(int paramInt, Object paramObject) {
    aK(paramObject);
    return getList().set(paramInt, paramObject);
  }

  public List subList(int paramInt1, int paramInt2) {
    List localList = getList().subList(paramInt1, paramInt2);
    return new bUn(localList, this.gIo);
  }

  static void a(bUn parambUn, Object paramObject)
  {
    parambUn.aK(paramObject); } 
  static void b(bUn parambUn, Object paramObject) { parambUn.aK(paramObject); }

}