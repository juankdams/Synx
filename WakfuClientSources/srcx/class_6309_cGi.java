import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.ListIterator;

class cGi extends AbstractList
  implements Serializable
{
  private final cPo Vw;
  KN Vx;
  int count;
  int expected;

  cGi(cPo paramcPo, KN paramKN)
  {
    this.Vw = 
      paramcPo;

    this.count = 0;

    this.expected = -1;

    this.Vx = paramKN;
  }

  public void add(int paramInt, Object paramObject)
  {
    if (this.Vx.matches(paramObject)) {
      int i = xK(paramInt);
      this.Vw.add(i, paramObject);
      this.expected += 1;
      this.count += 1;
    } else {
      throw new bLc("Filter won't allow the " + 
        paramObject.getClass().getName() + 
        " '" + paramObject + "' to be added to the list");
    }
  }

  public Object get(int paramInt)
  {
    int i = xK(paramInt);
    return this.Vw.get(i);
  }

  private final int xK(int paramInt)
  {
    int i = 0;
    for (int j = 0; j < cPo.c(this.Vw); j++) {
      djh localdjh = cPo.b(this.Vw)[j];
      if (this.Vx.matches(localdjh)) {
        if (paramInt == i) {
          return j;
        }
        i++;
      }
    }

    if (paramInt == i) {
      return cPo.c(this.Vw);
    }

    return cPo.c(this.Vw) + 1;
  }

  public Iterator iterator()
  {
    return new dV(this.Vw, this.Vx, 0);
  }

  public ListIterator listIterator() {
    return new dV(this.Vw, this.Vx, 0);
  }

  public ListIterator listIterator(int paramInt) {
    return new dV(this.Vw, this.Vx, paramInt);
  }

  public Object remove(int paramInt)
  {
    int i = xK(paramInt);
    Object localObject = this.Vw.get(i);
    if (this.Vx.matches(localObject)) {
      localObject = this.Vw.remove(i);
      this.expected += 1;
      this.count -= 1;
    }
    else {
      throw new bLc("Filter won't allow the " + 
        localObject.getClass().getName() + 
        " '" + localObject + "' (index " + paramInt + 
        ") to be removed");
    }
    return localObject;
  }

  public Object set(int paramInt, Object paramObject)
  {
    Object localObject = null;
    if (this.Vx.matches(paramObject)) {
      int i = xK(paramInt);
      localObject = this.Vw.get(i);
      if (!this.Vx.matches(localObject)) {
        throw new bLc("Filter won't allow the " + 
          localObject.getClass().getName() + 
          " '" + localObject + "' (index " + paramInt + 
          ") to be removed");
      }
      localObject = this.Vw.set(i, paramObject);
      this.expected += 2;
    }
    else {
      throw new bLc("Filter won't allow index " + 
        paramInt + " to be set to " + 
        paramObject.getClass().getName());
    }
    return localObject;
  }

  public int size()
  {
    if (this.expected == cPo.a(this.Vw)) {
      return this.count;
    }

    this.count = 0;
    for (int i = 0; i < this.Vw.size(); i++) {
      djh localdjh = cPo.b(this.Vw)[i];
      if (this.Vx.matches(localdjh)) {
        this.count += 1;
      }
    }
    this.expected = cPo.a(this.Vw);
    return this.count;
  }
}