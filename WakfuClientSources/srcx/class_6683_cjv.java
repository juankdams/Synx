import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class cjv extends Dd
  implements aee
{
  protected static final int hIX = 8;
  protected static final int hIY = 4;
  protected Stack hIZ = null;

  protected aRy hJa = null;

  protected int hJb = 8;

  protected int hJc = 0;

  public cjv()
  {
    this((aRy)null, 8, 4);
  }

  public cjv(int paramInt)
  {
    this((aRy)null, paramInt, 4);
  }

  public cjv(int paramInt1, int paramInt2)
  {
    this((aRy)null, paramInt1, paramInt2);
  }

  public cjv(aRy paramaRy)
  {
    this(paramaRy, 8, 4);
  }

  public cjv(aRy paramaRy, int paramInt)
  {
    this(paramaRy, paramInt, 4);
  }

  public cjv(aRy paramaRy, int paramInt1, int paramInt2)
  {
    this.hJa = paramaRy;
    this.hJb = (paramInt1 < 0 ? 8 : paramInt1);
    int i = paramInt2 < 1 ? 4 : paramInt2;
    this.hIZ = new Stack();
    this.hIZ.ensureCapacity(i > this.hJb ? this.hJb : i);
  }

  public synchronized Object Mm() {
    Mq();
    Object localObject = null;
    while (null == localObject) {
      if (!this.hIZ.empty()) {
        localObject = this.hIZ.pop();
      } else {
        if (null == this.hJa) {
          throw new NoSuchElementException();
        }
        localObject = this.hJa.q();
      }

      if ((null != this.hJa) && (null != localObject)) {
        this.hJa.aw(localObject);
      }
      if ((null != this.hJa) && (null != localObject) && (!this.hJa.av(localObject))) {
        this.hJa.au(localObject);
        localObject = null;
      }
    }
    this.hJc += 1;
    return localObject;
  }

  public synchronized void y(Object paramObject) {
    Mq();
    int i = 1;
    if (null != this.hJa) {
      if (!this.hJa.av(paramObject))
        i = 0;
      else {
        try {
          this.hJa.ax(paramObject);
        } catch (Exception localException1) {
          i = 0;
        }
      }
    }

    int j = i == 0 ? 1 : 0;

    this.hJc -= 1;
    if (i != 0) {
      Object localObject = null;
      if (this.hIZ.size() >= this.hJb) {
        j = 1;
        localObject = this.hIZ.remove(0);
      }
      this.hIZ.push(paramObject);
      paramObject = localObject;
    }
    notifyAll();

    if (j != 0)
      try {
        this.hJa.au(paramObject);
      }
      catch (Exception localException2)
      {
      }
  }

  public synchronized void z(Object paramObject) {
    Mq();
    this.hJc -= 1;
    if (null != this.hJa) {
      this.hJa.au(paramObject);
    }
    notifyAll();
  }

  public synchronized int Mn() {
    Mq();
    return this.hIZ.size();
  }

  public synchronized int Mo() {
    Mq();
    return this.hJc;
  }

  public synchronized void clear() {
    Mq();
    if (null != this.hJa) {
      Iterator localIterator = this.hIZ.iterator();
      while (localIterator.hasNext())
        try {
          this.hJa.au(localIterator.next());
        }
        catch (Exception localException)
        {
        }
    }
    this.hIZ.clear();
  }

  public synchronized void close() {
    clear();
    this.hIZ = null;
    this.hJa = null;
    super.close();
  }

  public synchronized void Mp()
  {
    Mq();
    Object localObject = this.hJa.q();
    this.hJc += 1;
    y(localObject);
  }

  public synchronized void a(aRy paramaRy) {
    Mq();
    if (0 < Mo()) {
      throw new IllegalStateException("Objects are already active");
    }
    clear();
    this.hJa = paramaRy;
  }
}