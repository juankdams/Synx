import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class Ej extends ArrayList
{
  protected static final Logger K = Logger.getLogger(Ej.class);
  private static final int bIO = 10;
  public static final Comparator bIP = new cXT();

  public static final Comparator bIQ = new cXR();

  public static final Comparator bIR = new cXQ();

  public static final Comparator bIS = new cXO();

  public static final Comparator bIT = new cYa();
  private final bme bIU;

  public Ej(int paramInt, bme parambme)
  {
    super(paramInt);

    this.bIU = parambme;
  }

  public Ej(int paramInt, Comparator paramComparator)
  {
    super(paramInt);

    this.bIU = new bxZ(this, paramComparator, null);
  }

  public Ej(bme parambme)
  {
    this(10, parambme);
  }

  public Ej(Comparator paramComparator)
  {
    this(10, paramComparator);
  }

  public boolean add(Object paramObject)
  {
    int i = indexOf(paramObject);

    if (i < 0)
      super.add(-(i + 1), paramObject);
    else {
      super.add(i, paramObject);
    }
    return true;
  }

  public void add(int paramInt, Object paramObject)
  {
    K.warn("Impossible d'inserer un élément à un index donné.");

    add(paramObject);
  }

  public boolean addAll(Collection paramCollection)
  {
    Iterator localIterator;
    if (((paramCollection instanceof Ej)) && (size() == 0))
      super.addAll(paramCollection);
    else
      for (localIterator = paramCollection.iterator(); localIterator.hasNext(); ) { Object localObject = localIterator.next();
        add(localObject);
      }
    return 0 < paramCollection.size();
  }

  public boolean addAll(int paramInt, Collection paramCollection)
  {
    K.warn("Impossible d'inserer des éléments à un index donné.");

    return addAll(paramCollection);
  }

  private void b(Collection paramCollection)
  {
    super.addAll(paramCollection);
  }

  public boolean A(Object paramObject)
  {
    boolean bool = (size() == 0) || (compare(paramObject, get(0)) <= 0);

    if (bool) {
      super.add(0, paramObject);
    }
    return bool;
  }

  public boolean B(Object paramObject)
  {
    int i = size();

    boolean bool = (i == 0) || (compare(get(i - 1), paramObject) <= 0);

    if (bool) {
      super.add(i, paramObject);
    }
    return bool;
  }

  public Object clone()
  {
    Ej localEj = new Ej(size(), this.bIU);

    localEj.b(this);

    return localEj;
  }

  protected final int compare(Object paramObject1, Object paramObject2)
  {
    return this.bIU.compare(paramObject1, paramObject2);
  }

  public boolean contains(Object paramObject)
  {
    return 0 <= indexOf(paramObject);
  }

  public boolean containsAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();

    while (localIterator.hasNext()) {
      if (!contains(localIterator.next()))
        return false;
    }
    return true;
  }

  public Object getFirst()
  {
    return size() == 0 ? null : get(0);
  }

  public Object getLast()
  {
    int i = size();

    return i == 0 ? null : get(--i);
  }

  public int indexOf(Object paramObject)
  {
    Object localObject = paramObject;

    int i = search(localObject);

    if ((i < 0) || (get(i).equals(paramObject))) {
      return i;
    }
    int j = i;
    do
    {
      j--;
    }while ((0 <= j) && (compare(get(j), localObject) == 0) && (!get(j).equals(paramObject)));

    if ((0 <= j) && (compare(get(j), localObject) == 0) && (get(j).equals(paramObject))) {
      return j;
    }
    int k = Math.max(0, j + 1);
    j = i;
    int m = size();
    do
    {
      j++;
    }while ((j < m) && (compare(get(j), localObject) == 0) && (!get(j).equals(paramObject)));

    return (j < m) && (compare(get(j), localObject) == 0) && (get(j).equals(paramObject)) ? j : -(k + 1);
  }

  public int C(Object paramObject)
  {
    int i = indexOf(paramObject);

    if (i < 0) {
      return -1;
    }

    Object localObject = paramObject;

    int j = size();
    do
    {
      i--;
    }while ((0 <= i) && (compare(get(i), localObject) == 0));
    do
    {
      i++;
    }while ((i < j) && (compare(get(i), localObject) == 0) && (!get(i).equals(paramObject)));

    return (i < j) && (compare(get(i), localObject) == 0) && (get(i).equals(paramObject)) ? i : -1;
  }

  public int lastIndexOf(Object paramObject)
  {
    int i = indexOf(paramObject);

    if (i < 0) {
      return -1;
    }

    Object localObject = paramObject;

    int j = size();
    do
    {
      i++;
    }while ((i < j) && (compare(get(i), localObject) == 0));
    do
    {
      i--;
    }while ((0 <= i) && (compare(get(i), localObject) == 0) && (!get(i).equals(paramObject)));

    return (0 <= i) && (compare(get(i), localObject) == 0) && (get(i).equals(paramObject)) ? i : -1;
  }

  public boolean D(Object paramObject)
  {
    int i = super.lastIndexOf(paramObject);

    boolean bool = 0 <= i;

    if (bool)
    {
      int j = i - 1;

      while ((0 <= j) && (get(j).equals(paramObject))) {
        j--;
      }
      j++;
      i++;

      super.removeRange(j, i);

      int k = i - j;

      if (k == 1) {
        super.add(-(indexOf(paramObject) + 1), paramObject);
      }
      else
      {
        ArrayList localArrayList = new ArrayList(k + 1);

        for (int m = 0; m < k; m++) {
          localArrayList.add(m, paramObject);
        }
        super.addAll(-(indexOf(paramObject) + 1), localArrayList);
      }
    }

    return bool;
  }

  public boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);

    boolean bool = 0 <= i;

    if (bool) {
      super.remove(i);
    }
    return bool;
  }

  public boolean removeAll(Collection paramCollection)
  {
    int i = size();

    Iterator localIterator = paramCollection.iterator();

    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();

      int j = C(localObject);

      if (0 <= j) {
        super.removeRange(j, lastIndexOf(localObject) + 1);
      }
    }
    return size() < i;
  }

  public boolean retainAll(Collection paramCollection)
  {
    int i = size();

    for (int j = i - 1; 0 <= j; ) {
      if (paramCollection.contains(get(j))) {
        j--;
      }
      else
      {
        int k = j;
        do
        {
          j--;
        }while ((0 <= j) && (!paramCollection.contains(get(j))));

        super.removeRange(j + 1, k + 1);
      }
    }

    return size() < i;
  }

  protected final int search(Object paramObject)
  {
    return this.bIU.a(this, paramObject);
  }

  public Object set(int paramInt, Object paramObject)
  {
    Object localObject = super.remove(paramInt);

    super.add(-(indexOf(paramObject) + 1), paramObject);

    return localObject;
  }
}