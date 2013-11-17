import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class dV
  implements ListIterator
{
  private final cPo Vw;
  KN Vx;
  int Vy;
  int Vz;
  int cursor;
  int VA;
  int expected;

  dV(cPo paramcPo, KN paramKN, int paramInt)
  {
    this.Vw = 
      paramcPo;
    this.Vx = paramKN;
    this.Vz = az(paramInt);
    this.VA = -1;
    this.expected = cPo.a(paramcPo);
    this.Vy = 0;
  }

  public void add(Object paramObject)
  {
    ip();

    if (this.Vx.matches(paramObject)) {
      this.VA = (this.cursor + 1);
      this.Vw.add(this.VA, paramObject);
    }
    else {
      throw new bLc("Filter won't allow add of " + 
        paramObject.getClass().getName());
    }
    this.expected = cPo.a(this.Vw);
    this.Vy = 5;
  }

  private void ip()
  {
    if (this.expected != cPo.a(this.Vw))
      throw new ConcurrentModificationException();
  }

  public boolean hasNext()
  {
    ip();

    switch (this.Vy) { case 0:
      this.cursor = this.Vz;
      break;
    case 3:
      this.cursor = this.VA;
      break;
    case 4:
    case 5:
      this.cursor = aB(this.VA + 1);
      break;
    case 6:
      this.cursor = aB(this.VA);
      break;
    case 1:
      this.cursor = aB(this.cursor + 1);
      break;
    default:
      throw new IllegalStateException("Unknown operation");
    case 2:
    }
    if (this.Vy != 0) {
      this.Vy = 2;
    }

    return this.cursor < this.Vw.size();
  }

  public boolean hasPrevious()
  {
    ip();

    switch (this.Vy) { case 0:
      this.cursor = this.Vz;
      int i = this.Vw.size();
      if (this.cursor >= i) {
        this.cursor = aA(i - 1);
      }
      break;
    case 3:
    case 6:
      this.cursor = aA(this.VA - 1);
      break;
    case 2:
      this.cursor = aA(this.cursor - 1);
      break;
    case 4:
    case 5:
      this.cursor = this.VA;
      break;
    default:
      throw new IllegalStateException("Unknown operation");
    case 1:
    }
    if (this.Vy != 0) {
      this.Vy = 1;
    }

    return this.cursor >= 0;
  }

  private int az(int paramInt)
  {
    if (paramInt < 0) {
      throw new IndexOutOfBoundsException("Index: " + paramInt);
    }

    int i = 0;
    for (int j = 0; j < this.Vw.size(); j++) {
      Object localObject = this.Vw.get(j);
      if (this.Vx.matches(localObject)) {
        if (paramInt == i) {
          return j;
        }
        i++;
      }
    }

    if (paramInt > i) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + 
        " Size: " + i);
    }

    return this.Vw.size();
  }

  private int aA(int paramInt)
  {
    if (paramInt >= this.Vw.size()) {
      paramInt = this.Vw.size() - 1;
    }

    for (int i = paramInt; i >= 0; i--) {
      Object localObject = this.Vw.get(i);
      if (this.Vx.matches(localObject)) {
        return i;
      }
    }
    return -1;
  }

  private int aB(int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < this.Vw.size(); i++) {
      Object localObject = this.Vw.get(i);
      if (this.Vx.matches(localObject)) {
        return i;
      }
    }
    return this.Vw.size();
  }

  public Object next()
  {
    ip();

    if (hasNext()) {
      this.VA = this.cursor;
    }
    else {
      this.VA = this.Vw.size();
      throw new NoSuchElementException();
    }

    this.Vy = 4;

    return this.Vw.get(this.VA);
  }

  public int nextIndex()
  {
    ip();
    hasNext();

    int i = 0;
    for (int j = 0; j < this.Vw.size(); j++) {
      if (this.Vx.matches(this.Vw.get(j))) {
        if (j == this.cursor) {
          return i;
        }
        i++;
      }
    }
    this.expected = cPo.a(this.Vw);
    return i;
  }

  public Object previous()
  {
    ip();

    if (hasPrevious()) {
      this.VA = this.cursor;
    }
    else {
      this.VA = -1;
      throw new NoSuchElementException();
    }

    this.Vy = 3;

    return this.Vw.get(this.VA);
  }

  public int previousIndex()
  {
    ip();

    if (hasPrevious()) {
      int i = 0;
      for (int j = 0; j < this.Vw.size(); j++) {
        if (this.Vx.matches(this.Vw.get(j))) {
          if (j == this.cursor) {
            return i;
          }
          i++;
        }
      }
    }
    return -1;
  }

  public void remove()
  {
    ip();

    if ((this.VA < 0) || (this.Vy == 6))
    {
      throw new IllegalStateException("no preceeding call to prev() or next()");
    }

    if (this.Vy == 5)
    {
      throw new IllegalStateException("cannot call remove() after add()");
    }

    Object localObject = this.Vw.get(this.VA);
    if (this.Vx.matches(localObject))
      this.Vw.remove(this.VA);
    else
      throw new bLc("Filter won't allow " + 
        localObject.getClass().getName() + 
        " (index " + this.VA + 
        ") to be removed");
    this.expected = cPo.a(this.Vw);
    this.Vy = 6;
  }

  public void set(Object paramObject)
  {
    ip();

    if ((this.Vy == 5) || 
      (this.Vy == 6))
    {
      throw new IllegalStateException("cannot call set() after add() or remove()");
    }

    if (this.VA < 0) {
      throw new IllegalStateException("no preceeding call to prev() or next()");
    }

    if (this.Vx.matches(paramObject)) {
      Object localObject = this.Vw.get(this.VA);
      if (!this.Vx.matches(localObject)) {
        throw new bLc("Filter won't allow " + 
          localObject.getClass().getName() + " (index " + 
          this.VA + ") to be removed");
      }
      this.Vw.set(this.VA, paramObject);
    }
    else {
      throw new bLc("Filter won't allow index " + 
        this.VA + " to be set to " + 
        paramObject.getClass().getName());
    }

    this.expected = cPo.a(this.Vw);
  }
}