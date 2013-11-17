import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class aHh extends Mc
{
  private static final long serialVersionUID = 8692300188161871514L;
  protected final bna eeS;

  public static Collection a(Collection paramCollection, bna parambna)
  {
    return new aHh(paramCollection, parambna);
  }

  protected aHh(Collection paramCollection, bna parambna)
  {
    super(paramCollection);
    if (parambna == null) {
      throw new IllegalArgumentException("Transformer must not be null");
    }
    this.eeS = parambna;
  }

  protected Object an(Object paramObject)
  {
    return this.eeS.an(paramObject);
  }

  protected Collection e(Collection paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) {
      localArrayList.add(an(localIterator.next()));
    }
    return localArrayList;
  }

  public boolean add(Object paramObject)
  {
    paramObject = an(paramObject);
    return getCollection().add(paramObject);
  }

  public boolean addAll(Collection paramCollection) {
    paramCollection = e(paramCollection);
    return getCollection().addAll(paramCollection);
  }
}