import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class dVi extends AbstractCollection
  implements Set
{
  private bik[] mtZ;
  private int count;
  private final aDi mua;

  dVi(aDi paramaDi)
  {
  }

  private void ensureCapacity(int paramInt)
  {
    if (this.mtZ == null) {
      this.mtZ = new bik[paramInt * 3 / 2];
    }
    else if (this.mtZ.length < paramInt) {
      bik[] arrayOfbik = new bik[paramInt * 3 / 2];
      System.arraycopy(this.mtZ, 0, arrayOfbik, 0, this.mtZ.length);
      this.mtZ = arrayOfbik;
    }
  }
  public int size() { return this.count; } 
  public boolean contains(Object paramObject) {
    return indexOf(paramObject) != -1;
  }
  public boolean add(Object paramObject) {
    if (!contains(paramObject)) {
      ensureCapacity(this.count + 1);
      this.mtZ[(this.count++)] = ((bik)paramObject);
    }
    return true;
  }
  private int indexOf(Object paramObject) {
    bik localbik1 = (bik)paramObject;
    for (int i = 0; i < this.count; i++) {
      bik localbik2 = this.mtZ[i];
      if ((localbik1 == localbik2) || ((localbik1.getClass() == localbik2.getClass()) && (localbik1.size() == localbik2.size()) && (localbik1.sF().equals(localbik2.sF()))))
      {
        return i;
      }
    }
    return -1;
  }
  public boolean remove(Object paramObject) {
    int i = indexOf(paramObject);
    if (i != -1) {
      if (--this.count > 0) {
        this.mtZ[i] = this.mtZ[this.count];
        this.mtZ[this.count] = null;
      }
      return true;
    }
    return false;
  }

  public Iterator iterator()
  {
    bik[] arrayOfbik = new bik[this.count];
    if (this.count > 0) {
      System.arraycopy(this.mtZ, 0, arrayOfbik, 0, this.count);
    }
    return Arrays.asList(arrayOfbik).iterator();
  }
}