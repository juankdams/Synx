import com.ankamagames.framework.kernel.core.common.MemoryObjectPool.1;
import org.apache.log4j.Logger;

public class aum
{
  private static final boolean DEBUG = false;
  private static final Logger K = Logger.getLogger(aum.class);
  private akE[] dGy;
  private final Yr dGz;
  private final Class dGA;
  private final bJv dGB;
  private final int dGC;
  private final Object dGD = new Object();

  public static bJv D(Class paramClass)
  {
    return new MemoryObjectPool.1(paramClass, paramClass);
  }

  public aum(int paramInt, Class paramClass)
  {
    this(paramInt, paramClass, D(paramClass));
  }

  public aum(int paramInt, Class paramClass, bJv parambJv) {
    a(parambJv, paramClass);

    this.dGB = parambJv;
    this.dGA = paramClass;
    this.dGC = akE.C(paramClass);

    this.dGy = new akE[paramInt];
    this.dGz = new Yr(paramInt);

    for (int i = 0; i < this.dGy.length; i++) {
      this.dGy[i] = kp(i);
    }

    aDM.aPZ().a(this);
  }

  private boolean a(bJv parambJv, Class paramClass) {
    akE localakE = parambJv.ZX();
    if (localakE.getClass() != paramClass)
      throw new IllegalArgumentException("factory invalide : devrait renvoyée un " + paramClass);
    return true;
  }

  public final akE aGv()
  {
    int i;
    akE localakE;
    synchronized (this.dGD) {
      i = this.dGz.ajZ();
      if (i == -1) {
        resize(aGz());
        i = this.dGz.ajZ();
      }

      localakE = this.dGy[i];
    }
    localakE.bpv();
    try
    {
      localakE.gL();
      ov.add(localakE);
      return localakE;
    } catch (Exception localException) {
      synchronized (this.dGD) {
        this.dGz.hq(i);
      }
      throw new RuntimeException("Exception levée lors de l'extraction d'un élément du pool", localException);
    }
  }

  public final void a(akE paramakE)
  {
    synchronized (this.dGD) {
      this.dGz.hq(paramakE.axD());
      ov.remove(paramakE);
    }
  }

  protected void aGw()
  {
    synchronized (this.dGD) {
      this.dGz.aka();
    }
  }

  public final int aGx() {
    return this.dGC;
  }

  public final Class aGy() {
    return this.dGA;
  }

  public final int akb() {
    synchronized (this.dGD) {
      return this.dGz.akb();
    }
  }

  public final int akc() {
    synchronized (this.dGD) {
      return this.dGz.akc();
    }
  }

  public final int getSize() {
    synchronized (this.dGD) {
      return this.dGz.getSize();
    }
  }

  private int aGz()
  {
    int i = this.dGy.length;
    if (i < 4096)
      return i * 2;
    return i + 4096;
  }

  private void resize(int paramInt) {
    if ((!bB) && (paramInt <= this.dGy.length)) throw new AssertionError();

    akE[] arrayOfakE = new akE[paramInt];
    System.arraycopy(this.dGy, 0, arrayOfakE, 0, this.dGy.length);
    for (int i = this.dGy.length; i < paramInt; i++) {
      arrayOfakE[i] = kp(i);
    }

    this.dGz.resize(paramInt);
    this.dGy = arrayOfakE;
  }

  private akE kp(int paramInt)
  {
    try
    {
      akE localakE = this.dGB.ZX();
      localakE.a(paramInt, this);
      return localakE;
    } catch (Exception localException) {
      K.error("Failed to create object", localException);
    }
    return null;
  }
}