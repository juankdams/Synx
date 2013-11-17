import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class bcm extends cCi
  implements Externalizable, Iterable, Set
{
  static final long serialVersionUID = 1L;

  public bcm()
  {
  }

  public bcm(cBv paramcBv)
  {
    super(paramcBv);
  }

  public bcm(int paramInt)
  {
    super(paramInt);
  }

  public bcm(int paramInt, cBv paramcBv)
  {
    super(paramInt, paramcBv);
  }

  public bcm(int paramInt, float paramFloat)
  {
    super(paramInt, paramFloat);
  }

  public bcm(int paramInt, float paramFloat, cBv paramcBv)
  {
    super(paramInt, paramFloat, paramcBv);
  }

  public bcm(Collection paramCollection)
  {
    this(paramCollection.size());
    addAll(paramCollection);
  }

  public bcm(Collection paramCollection, cBv paramcBv)
  {
    this(paramCollection.size(), paramcBv);
    addAll(paramCollection);
  }

  public boolean add(Object paramObject)
  {
    int i = bb(paramObject);

    if (i < 0) {
      return false;
    }

    Object localObject = this.iuG[i];
    this.iuG[i] = paramObject;

    fZ(localObject == iuJ);
    return true;
  }

  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof Set)) {
      return false;
    }
    Set localSet = (Set)paramObject;
    if (localSet.size() != size()) {
      return false;
    }
    return containsAll(localSet);
  }

  public int hashCode() {
    bFb localbFb = new bFb(this, null);
    d(localbFb);
    return localbFb.akt();
  }

  protected void rehash(int paramInt)
  {
    int i = this.iuG.length;
    Object[] arrayOfObject = this.iuG;

    this.iuG = new Object[paramInt];
    Arrays.fill(this.iuG, iuJ);

    for (int j = i; j-- > 0; )
      if ((arrayOfObject[j] != iuJ) && (arrayOfObject[j] != iuI)) {
        Object localObject = arrayOfObject[j];
        int k = bb(localObject);
        if (k < 0) {
          q(this.iuG[(-k - 1)], localObject);
        }
        this.iuG[k] = localObject;
      }
  }

  public Object[] toArray()
  {
    Object[] arrayOfObject = new Object[size()];
    d(new crw(arrayOfObject));
    return arrayOfObject;
  }

  public Object[] toArray(Object[] paramArrayOfObject)
  {
    int i = size();
    if (paramArrayOfObject.length < i) {
      paramArrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }
    d(new crw(paramArrayOfObject));

    if (paramArrayOfObject.length > i) {
      paramArrayOfObject[i] = null;
    }

    return paramArrayOfObject;
  }

  public void clear()
  {
    super.clear();

    Arrays.fill(this.iuG, 0, this.iuG.length, iuJ);
  }

  public boolean remove(Object paramObject)
  {
    int i = index(paramObject);
    if (i >= 0) {
      aQ(i);
      return true;
    }
    return false;
  }

  public Iterator iterator()
  {
    return new cJh(this);
  }

  public boolean containsAll(Collection paramCollection)
  {
    for (Iterator localIterator = paramCollection.iterator(); localIterator.hasNext(); ) {
      if (!contains(localIterator.next())) {
        return false;
      }
    }
    return true;
  }

  public boolean addAll(Collection paramCollection)
  {
    boolean bool = false;
    int i = paramCollection.size();

    ensureCapacity(i);
    Iterator localIterator = paramCollection.iterator();
    while (i-- > 0) {
      if (add(localIterator.next())) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean removeAll(Collection paramCollection)
  {
    boolean bool = false;
    int i = paramCollection.size();

    Iterator localIterator = paramCollection.iterator();
    while (i-- > 0) {
      if (remove(localIterator.next())) {
        bool = true;
      }
    }
    return bool;
  }

  public boolean retainAll(Collection paramCollection)
  {
    boolean bool = false;
    int i = size();

    Iterator localIterator = iterator();
    while (i-- > 0) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
        bool = true;
      }
    }
    return bool;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder("{");
    d(new asl(this, localStringBuilder));

    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public void writeExternal(ObjectOutput paramObjectOutput)
  {
    paramObjectOutput.writeByte(1);

    super.writeExternal(paramObjectOutput);

    paramObjectOutput.writeInt(this._size);

    cvF localcvF = new cvF(paramObjectOutput);
    if (!d(localcvF))
      throw localcvF.ihg;
  }

  public void readExternal(ObjectInput paramObjectInput)
  {
    int i = paramObjectInput.readByte();

    if (i != 0) super.readExternal(paramObjectInput);

    int j = paramObjectInput.readInt();
    aO(j);

    while (j-- > 0) {
      Object localObject = paramObjectInput.readObject();
      add(localObject);
    }
  }
}