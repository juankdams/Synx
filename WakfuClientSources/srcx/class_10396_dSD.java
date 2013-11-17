import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class dSD extends Dd
  implements aee
{
  private List moH = null;

  private aRy hJa = null;

  private int hJc = 0;

  public dSD()
  {
    this.moH = new ArrayList();
    this.hJa = null;
  }

  public dSD(aRy paramaRy) {
    this.moH = new ArrayList();
    this.hJa = paramaRy;
  }

  public dSD(aRy paramaRy, int paramInt) {
    this.moH = new ArrayList();
    this.hJa = paramaRy;
    if (null != this.hJa)
      for (int i = 0; i < paramInt; i++) {
        Object localObject = this.hJa.q();
        this.hJa.ax(localObject);
        this.moH.add(new SoftReference(localObject));
      }
  }

  public synchronized Object Mm()
  {
    Mq();
    Object localObject = null;
    while (null == localObject) {
      if (this.moH.isEmpty()) {
        if (null == this.hJa) {
          throw new NoSuchElementException();
        }
        localObject = this.hJa.q();
      }
      else {
        SoftReference localSoftReference = (SoftReference)this.moH.remove(this.moH.size() - 1);
        localObject = localSoftReference.get();
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
    if (!this.hJa.av(paramObject))
      i = 0;
    else {
      try {
        this.hJa.ax(paramObject);
      } catch (Exception localException1) {
        i = 0;
      }
    }

    int j = i == 0 ? 1 : 0;
    this.hJc -= 1;
    if (i != 0) {
      this.moH.add(new SoftReference(paramObject));
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

  public synchronized void z(Object paramObject)
  {
    Mq();
    this.hJc -= 1;
    this.hJa.au(paramObject);
    notifyAll();
  }

  public synchronized void Mp()
  {
    Mq();
    Object localObject = this.hJa.q();
    this.hJc += 1;
    y(localObject);
  }

  public synchronized int Mn()
  {
    Mq();
    return this.moH.size();
  }

  public synchronized int Mo() {
    Mq();
    return this.hJc;
  }

  public synchronized void clear() {
    Mq();
    if (null != this.hJa) {
      Iterator localIterator = this.moH.iterator();
      while (localIterator.hasNext()) {
        try {
          Object localObject = ((SoftReference)localIterator.next()).get();
          if (null != localObject)
            this.hJa.au(localObject);
        }
        catch (Exception localException)
        {
        }
      }
    }
    this.moH.clear();
  }

  public synchronized void close() {
    clear();
    this.moH = null;
    this.hJa = null;
    super.close();
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