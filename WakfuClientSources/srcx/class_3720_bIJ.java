import java.util.Collection;
import java.util.Iterator;

public class bIJ extends Mc
{
  private static final long serialVersionUID = -5259182142076705162L;
  protected final cSc gIo;

  public static Collection a(Collection paramCollection, cSc paramcSc)
  {
    return new bIJ(paramCollection, paramcSc);
  }

  protected bIJ(Collection paramCollection, cSc paramcSc)
  {
    super(paramCollection);
    if (paramcSc == null) {
      throw new IllegalArgumentException("Predicate must not be null");
    }
    this.gIo = paramcSc;
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); )
      aK(localIterator.next());
  }

  protected void aK(Object paramObject)
  {
    if (!this.gIo.evaluate(paramObject))
      throw new IllegalArgumentException("Cannot add Object '" + paramObject + "' - Predicate rejected it");
  }

  public boolean add(Object paramObject)
  {
    aK(paramObject);
    return getCollection().add(paramObject);
  }

  public boolean addAll(Collection paramCollection)
  {
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) {
      aK(localIterator.next());
    }
    return getCollection().addAll(paramCollection);
  }
}