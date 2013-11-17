import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class aGC
{
  private final List edz = new ArrayList();

  private final czD edA = new czD(this);

  private final ExecutorService edB = Executors.newSingleThreadExecutor();
  private final djj le;
  private final bSW lf;
  private bEv edC;
  private tH edD;
  private aQy edE;
  private final AtomicBoolean edF = new AtomicBoolean();
  private String[] edG;

  public aGC(djj paramdjj, bSW parambSW)
  {
    this(paramdjj, parambSW, null);
  }

  public aGC(djj paramdjj, bSW parambSW, bEv parambEv)
  {
    this.le = paramdjj;
    this.lf = parambSW;
    a(parambEv);
  }

  public final void b(dgH paramdgH)
  {
    aHA.debug("addMediaListEventListener(listener={})", new Object[] { paramdgH });
    this.edz.add(paramdgH);
  }

  public final void c(dgH paramdgH)
  {
    aHA.debug("removeMediaListEventListener(listener={})", new Object[] { paramdgH });
    this.edz.remove(paramdgH);
  }

  public final void k(String[] paramArrayOfString)
  {
    aHA.debug("setStandardMediaOptions(standardMediaOptions={})", new Object[] { Arrays.toString(paramArrayOfString) });
    this.edG = paramArrayOfString;
  }

  public final void c(String paramString, String[] paramArrayOfString)
  {
    aHA.debug("addMedia(mrl={},mediaOptions={})", new Object[] { paramString, Arrays.toString(paramArrayOfString) });
    try {
      lock();

      jJ localjJ = d(paramString, paramArrayOfString);

      this.le.b(this.edC, localjJ);

      b(localjJ);
    }
    finally {
      unlock();
    }
  }

  public final void a(int paramInt, String paramString, String[] paramArrayOfString)
  {
    aHA.debug("insertMedia(index={},mrl={},mediaOptions={})", new Object[] { Integer.valueOf(paramInt), paramString, Arrays.toString(paramArrayOfString) });
    try {
      lock();

      jJ localjJ = d(paramString, paramArrayOfString);

      this.le.a(this.edC, localjJ, paramInt);

      b(localjJ);
    }
    finally {
      unlock();
    }
  }

  public final void ms(int paramInt)
  {
    aHA.debug("removeMedia(index={})", new Object[] { Integer.valueOf(paramInt) });
    try {
      lock();
      jJ localjJ = this.le.b(this.edC, paramInt);
      if (localjJ != null)
      {
        this.le.a(this.edC, paramInt);

        this.le.g(localjJ);
      }
    }
    finally {
      unlock();
    }
  }

  public final void clear()
  {
    aHA.debug("clear()", new Object[0]);
    try {
      lock();

      for (int i = this.le.e(this.edC) - 1; i >= 0; i--)
        this.le.a(this.edC, i);
    }
    finally
    {
      unlock();
    }
  }

  public final int size()
  {
    aHA.debug("size()", new Object[0]);
    try {
      lock();
      int i = this.le.e(this.edC);
      aHA.debug("size={}", new Object[] { Integer.valueOf(i) });
      return i;
    }
    finally {
      unlock();
    }
  }

  public final boolean isReadOnly()
  {
    aHA.debug("isReadOnly()", new Object[0]);
    return this.le.f(this.edC) == 0;
  }

  public final List aSz()
  {
    aHA.debug("items()", new Object[0]);
    ArrayList localArrayList = new ArrayList();
    try {
      lock();
      for (int i = 0; i < this.le.e(this.edC); i++) {
        jJ localjJ = this.le.b(this.edC, i);
        localArrayList.add(a(localjJ));
        this.le.g(localjJ);
      }
    }
    finally {
      unlock();
    }
    return localArrayList;
  }

  private dlh a(jJ paramjJ)
  {
    String str1 = dBU.a(this.le, this.le.a(paramjJ, dgK.lbE.intValue()));
    String str2 = dBU.a(this.le, this.le.h(paramjJ));

    bEv localbEv = this.le.l(paramjJ);
    Object localObject1;
    if (localbEv != null) {
      try {
        this.le.g(localbEv);
        localObject1 = new ArrayList();
        for (int i = 0; i < this.le.e(localbEv); i++) {
          jJ localjJ = this.le.b(localbEv, i);
          ((List)localObject1).add(a(localjJ));
          this.le.g(localjJ);
        }
      }
      finally {
        this.le.h(localbEv);
      }
      this.le.b(localbEv);
    }
    else {
      localObject1 = Collections.emptyList();
    }
    return new dlh(str1, str2, (List)localObject1);
  }

  public final void release()
  {
    aHA.debug("release()", new Object[0]);
    if (this.edF.compareAndSet(false, true))
      aSA();
  }

  private void a(bEv parambEv)
  {
    aHA.debug("createInstance()", new Object[0]);
    if (parambEv == null) {
      parambEv = this.le.i(this.lf);
    }
    else {
      this.le.c(parambEv);
    }

    this.edC = parambEv;
    aHA.debug("mediaListInstance={}", new Object[] { parambEv });

    this.edD = this.le.i(parambEv);
    aHA.debug("mediaListEventManager={}", new Object[] { this.edD });

    aSB();
  }

  private void aSA()
  {
    aHA.debug("destroyInstance()", new Object[0]);

    aSC();

    if (this.edC != null) {
      this.le.b(this.edC);
    }

    aHA.debug("Shut down listeners...", new Object[0]);
    this.edB.shutdown();
    aHA.debug("Listeners shut down.", new Object[0]);
  }

  private void aSB()
  {
    aHA.debug("registerEventListener()", new Object[0]);
    this.edE = new zn(this, null);
    for (dWm localdWm : dWm.values())
      if ((localdWm.intValue() >= dWm.mvU.intValue()) && (localdWm.intValue() <= dWm.mvX.intValue())) {
        aHA.debug("event={}", new Object[] { localdWm });
        int k = this.le.a(this.edD, localdWm.intValue(), this.edE, null);
        aHA.debug("result={}", new Object[] { Integer.valueOf(k) });
      }
  }

  private void aSC()
  {
    aHA.debug("deregisterEventListener()", new Object[0]);
    if (this.edE != null) {
      for (dWm localdWm : dWm.values()) {
        if ((localdWm.intValue() >= dWm.mvU.intValue()) && (localdWm.intValue() <= dWm.mvX.intValue())) {
          aHA.debug("event={}", new Object[] { localdWm });
          this.le.b(this.edD, localdWm.intValue(), this.edE, null);
        }
      }
      this.edE = null;
    }
  }

  private void a(JG paramJG)
  {
    aHA.trace("raiseEvent(mediaListEvent={}", new Object[] { paramJG });
    if (paramJG != null)
      this.edB.submit(new abk(this, paramJG, null));
  }

  private void lock()
  {
    aHA.debug("lock()", new Object[0]);
    this.le.g(this.edC);
  }

  private void unlock()
  {
    aHA.debug("unlock()", new Object[0]);
    this.le.h(this.edC);
  }

  private jJ d(String paramString, String[] paramArrayOfString)
  {
    aHA.debug("newMediaDescriptor(media={},mediaOptions={})", new Object[] { paramString, Arrays.toString(paramArrayOfString) });

    paramString = cOA.on(paramString);
    jJ localjJ;
    if (cOA.om(paramString)) {
      aHA.debug("Treating mrl as a location", new Object[0]);
      localjJ = this.le.b(this.lf, paramString);
    }
    else {
      aHA.debug("Treating mrl as a path", new Object[0]);
      localjJ = this.le.c(this.lf, paramString);
    }
    aHA.debug("mediaDescriptor={}", new Object[] { localjJ });
    String str;
    if (this.edG != null) {
      for (str : this.edG) {
        aHA.debug("standardMediaOption={}", new Object[] { str });
        this.le.a(localjJ, str);
      }
    }
    if (paramArrayOfString != null) {
      for (str : paramArrayOfString) {
        aHA.debug("mediaOption={}", new Object[] { str });
        this.le.a(localjJ, str);
      }
    }
    return localjJ;
  }

  private void b(jJ paramjJ)
  {
    aHA.debug("releaseMediaDescriptor(mediaDescriptor={})", new Object[] { paramjJ });
    this.le.g(paramjJ);
  }

  public final bEv aSD()
  {
    return this.edC;
  }
}