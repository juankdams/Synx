import java.util.Iterator;

public class Xg extends cde
  implements Iterable
{
  private Object[] cHk;

  public Xg()
  {
    this(10);
  }

  public Xg(int paramInt) {
    super(paramInt);

    this.cHk = ((Object[])new Object[paramInt]);
  }

  public boolean aV(int paramInt)
  {
    int i = this.fcT.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    Object[] arrayOfObject = this.cHk;
    this.cHk = ((Object[])new Object[paramInt]);
    System.arraycopy(arrayOfObject, 0, this.cHk, 0, i);

    return true;
  }

  public void put(int paramInt, Object paramObject) {
    qx();
    int i = uL(paramInt);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.fcT[i] = paramInt;
    }

    this.cHk[i] = paramObject;
  }

  public Object remove(int paramInt) {
    if (this.m_size == 0) {
      return null;
    }

    int i = uK(paramInt);
    if (i < 0) {
      return null;
    }

    Object localObject = this.cHk[i];

    if (i < this.m_size - 1) {
      this.fcT[i] = this.fcT[(this.m_size - 1)];
      this.cHk[i] = this.cHk[(this.m_size - 1)];
      this.fcT[(this.m_size - 1)] = 0;
      this.cHk[(this.m_size - 1)] = null;
    } else {
      this.fcT[i] = 0;
      this.cHk[i] = null;
    }

    this.m_size -= 1;

    return localObject;
  }

  public void clear()
  {
    super.clear();

    int i = 0; for (int j = this.cHk.length; i < j; i++)
      this.cHk[i] = null;
  }

  public Object get(int paramInt)
  {
    int i = uK(paramInt);
    if (i < 0) {
      return null;
    }

    return this.cHk[i];
  }

  public Object hc(int paramInt) {
    return this.cHk[paramInt];
  }

  public Iterator iterator() {
    return new tK(this.cHk, false);
  }

  public void compact()
  {
    super.compact();

    Object[] arrayOfObject = this.cHk;
    this.cHk = ((Object[])new Object[this.m_size]);
    System.arraycopy(arrayOfObject, 0, this.cHk, 0, this.m_size);
  }
}