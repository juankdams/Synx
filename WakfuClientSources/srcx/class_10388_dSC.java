import java.io.PrintStream;

public class dSC
{
  protected Object[] moG;
  private Object[] cHk;
  protected int m_size;

  public dSC()
  {
    this(10);
  }

  public dSC(int paramInt) {
    this.moG = ((Object[])new Object[paramInt]);
    this.cHk = ((Object[])new Object[paramInt]);

    this.m_size = 0;
  }

  public boolean aV(int paramInt) {
    if (paramInt > this.moG.length) {
      Object[] arrayOfObject1 = this.moG;
      this.moG = ((Object[])new Object[paramInt]);
      System.arraycopy(arrayOfObject1, 0, this.moG, 0, arrayOfObject1.length);

      Object[] arrayOfObject2 = this.cHk;
      this.cHk = ((Object[])new Object[paramInt]);
      System.arraycopy(arrayOfObject2, 0, this.cHk, 0, arrayOfObject2.length);
      return true;
    }

    return false;
  }

  protected final int index(Object paramObject) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramObject.equals(this.moG[i])) {
        return i;
      }
    }

    return -1;
  }

  protected final int bD(Object paramObject) {
    for (int i = this.m_size - 1; i >= 0; i--) {
      if (paramObject == this.moG[i]) {
        return -i - 1;
      }
    }

    return this.m_size;
  }

  protected final void qx() {
    if (this.m_size == this.moG.length)
      aV(this.moG.length * 2);
  }

  public final boolean contains(Object paramObject)
  {
    return index(paramObject) != -1;
  }

  public final void reset()
  {
    this.m_size = 0;
  }

  public void clear() {
    this.m_size = 0;

    int i = 0; for (int j = this.cHk.length; i < j; i++)
      this.cHk[i] = null;
  }

  public final int size()
  {
    return this.m_size;
  }

  public final Object DT(int paramInt) {
    return this.moG[paramInt];
  }

  public void put(Object paramObject1, Object paramObject2) {
    qx();
    int i = bD(paramObject1);

    if (i < 0) {
      i = -i - 1;
    }
    else {
      this.m_size += 1;
      this.moG[i] = paramObject1;
    }

    this.cHk[i] = paramObject2;
  }

  public Object remove(Object paramObject) {
    if (this.m_size == 0) {
      return null;
    }

    int i = index(paramObject);
    if (i < 0) {
      return null;
    }

    Object localObject = this.cHk[i];

    if (i < this.m_size - 1) {
      this.moG[i] = this.moG[(this.m_size - 1)];
      this.cHk[i] = this.cHk[(this.m_size - 1)];
      this.moG[(this.m_size - 1)] = null;
      this.cHk[(this.m_size - 1)] = null;
    } else {
      this.moG[i] = null;
      this.cHk[i] = null;
    }

    this.m_size -= 1;

    return localObject;
  }

  public Object get(Object paramObject)
  {
    int i = index(paramObject);
    if (i < 0) {
      return null;
    }

    return this.cHk[i];
  }

  public final Object hc(int paramInt) {
    return this.cHk[paramInt];
  }

  public final void af(dGy paramdGy) {
    for (int i = 0; i < this.m_size; i++)
      paramdGy.d(this.cHk[i]);
  }

  public static void main(String[] paramArrayOfString)
  {
    dSC localdSC = new dSC();
    localdSC.put("id", Integer.valueOf(10));
    localdSC.put("craft_id", Integer.valueOf(20));

    int i = ((Integer)localdSC.get("craft_id")).intValue();
    System.out.println(i);
  }
}