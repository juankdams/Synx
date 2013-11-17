import java.util.Iterator;

public class aXt extends kn
  implements Iterable
{
  private Object[] cHk;

  public aXt()
  {
    this(10);
  }

  public aXt(int paramInt) {
    super(paramInt);

    this.cHk = ((Object[])new Object[paramInt]);
  }

  public boolean aV(int paramInt)
  {
    int i = this.aNM.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    Object[] arrayOfObject = this.cHk;
    this.cHk = ((Object[])new Object[paramInt]);
    System.arraycopy(arrayOfObject, 0, this.cHk, 0, i);

    return true;
  }

  public void c(long paramLong, Object paramObject) {
    qx();
    int i = M(paramLong);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.aNM[i] = paramLong;
    }

    this.cHk[i] = paramObject;
  }

  public Object remove(long paramLong) {
    if (this.m_size == 0) {
      return null;
    }

    int i = L(paramLong);
    if (i < 0) {
      return null;
    }

    return oi(i);
  }

  private Object oi(int paramInt) {
    Object localObject = this.cHk[paramInt];

    if (paramInt < this.m_size - 1) {
      this.aNM[paramInt] = this.aNM[(this.m_size - 1)];
      this.cHk[paramInt] = this.cHk[(this.m_size - 1)];
      this.aNM[(this.m_size - 1)] = 0L;
      this.cHk[(this.m_size - 1)] = null;
    } else {
      this.aNM[paramInt] = 0L;
      this.cHk[paramInt] = null;
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

  public Object get(long paramLong)
  {
    int i = L(paramLong);
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
}