import java.util.Iterator;

public class bHa extends dBM
  implements Iterable
{
  private Object[] cHk;

  public bHa()
  {
    this(10);
  }

  public bHa(int paramInt) {
    super(paramInt);

    this.cHk = ((Object[])new Object[paramInt]);
  }

  public boolean aV(int paramInt)
  {
    int i = this.lJo.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    Object[] arrayOfObject = this.cHk;
    this.cHk = ((Object[])new Object[paramInt]);
    System.arraycopy(arrayOfObject, 0, this.cHk, 0, i);

    return true;
  }

  public void b(short paramShort, Object paramObject) {
    qx();
    int i = eD(paramShort);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.lJo[i] = paramShort;
    }

    this.cHk[i] = paramObject;
  }

  public Object cw(short paramShort) {
    if (this.m_size == 0) {
      return null;
    }

    int i = dU(paramShort);
    if (i < 0) {
      return null;
    }

    Object localObject = this.cHk[i];

    if (i < this.m_size - 1) {
      this.lJo[i] = this.lJo[(this.m_size - 1)];
      this.cHk[i] = this.cHk[(this.m_size - 1)];
      this.lJo[(this.m_size - 1)] = 0;
      this.cHk[(this.m_size - 1)] = null;
    } else {
      this.lJo[i] = 0;
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

  public Object cx(short paramShort)
  {
    int i = dU(paramShort);
    if (i < 0) {
      return null;
    }

    return this.cHk[i];
  }

  public final Object hc(int paramInt) {
    return this.cHk[paramInt];
  }

  public final Iterator iterator() {
    return new tK(this.cHk, false);
  }
}