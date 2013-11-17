import java.util.Iterator;

public class alz extends iH
  implements Iterable
{
  private Object[] cHk;

  public alz()
  {
    this(10);
  }

  public alz(int paramInt) {
    super(paramInt);

    this.cHk = ((Object[])new Object[paramInt]);
  }

  public boolean aV(int paramInt)
  {
    int i = this.aID.length;
    if (!super.aV(paramInt)) {
      return false;
    }

    Object[] arrayOfObject = this.cHk;
    this.cHk = ((Object[])new Object[paramInt]);
    System.arraycopy(arrayOfObject, 0, this.cHk, 0, i);

    return true;
  }

  public void a(byte paramByte, Object paramObject) {
    qx();
    int i = k(paramByte);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.aID[i] = paramByte;
    }

    this.cHk[i] = paramObject;
  }

  public Object be(byte paramByte) {
    if (this.m_size == 0) {
      return null;
    }

    int i = j(paramByte);
    if (i < 0) {
      return null;
    }

    Object localObject = this.cHk[i];

    if (i < this.m_size - 1) {
      this.aID[i] = this.aID[(this.m_size - 1)];
      this.cHk[i] = this.cHk[(this.m_size - 1)];
      this.aID[(this.m_size - 1)] = 0;
      this.cHk[(this.m_size - 1)] = null;
    } else {
      this.aID[i] = 0;
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

  public Object bf(byte paramByte)
  {
    int i = j(paramByte);
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