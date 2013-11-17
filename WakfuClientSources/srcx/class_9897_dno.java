import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class dno
  implements Iterable
{
  private static final Logger K = Logger.getLogger(dno.class);
  public static final short lmJ = -1;
  protected short laZ;
  protected final boolean lmK;
  private boolean coU;
  protected final List lmL = new ArrayList(1);

  protected dno(boolean paramBoolean, short paramShort) {
    this.lmK = paramBoolean;
    this.laZ = bCO.F((short)-1, paramShort);
  }

  public boolean cUK() {
    return this.lmK;
  }

  public void d(bbk parambbk)
  {
    if (parambbk == null) {
      return;
    }
    if (!this.lmL.contains(parambbk))
      this.lmL.add(parambbk);
  }

  public void c(bbk parambbk)
  {
    if (parambbk == null) {
      return;
    }
    this.lmL.remove(parambbk);
  }

  public void cHU() {
    this.lmL.clear();
  }

  protected void b(bNz parambNz)
  {
    bbk[] arrayOfbbk1 = (bbk[])this.lmL.toArray(new bbk[this.lmL.size()]);
    for (bbk localbbk : arrayOfbbk1) {
      localbbk.a(parambNz);
    }
    try
    {
      parambNz.release();
    } catch (Exception localException) {
      K.error("Exception lors du release d'un InventoryEvent", localException);
    }
  }

  public void cleanup() {
    ajy();
    cHU();
  }

  public boolean dy(short paramShort)
  {
    if ((this.laZ > 0) && (paramShort < size())) {
      K.error("Can't change the size of the inventory to " + paramShort + " : current size is " + size());
      return false;
    }

    this.laZ = bCO.F((short)-1, paramShort);
    return true;
  }

  public short cFy()
  {
    return this.laZ;
  }

  public boolean isFull()
  {
    return (this.laZ != -1) && (size() >= this.laZ);
  }

  public boolean isEmpty()
  {
    return size() == 0;
  }

  public boolean isLocked() {
    return this.coU;
  }

  public void setLocked(boolean paramBoolean) {
    this.coU = paramBoolean;
    b(dvB.b(this));
  }

  public abstract boolean c(dsj paramdsj);

  public abstract boolean c(long paramLong, short paramShort);

  public abstract short cf(long paramLong);

  public abstract boolean d(dsj paramdsj);

  public abstract boolean e(dsj paramdsj);

  public abstract dsj cg(long paramLong);

  public abstract int nP(int paramInt);

  public abstract int bP(int paramInt1, int paramInt2);

  public abstract boolean f(dsj paramdsj);

  public abstract boolean ch(long paramLong);

  public abstract boolean hg(int paramInt);

  public abstract dsj ci(long paramLong);

  public abstract dsj hh(int paramInt);

  public abstract dsj a(int paramInt, dVX paramdVX);

  public abstract ArrayList hi(int paramInt);

  public abstract ArrayList b(int paramInt, dVX paramdVX);

  public abstract ArrayList a(dVX paramdVX);

  public abstract int size();

  public abstract int ajx();

  public abstract int ajy();

  public abstract Iterator iterator();

  public abstract bPr ajz();

  public abstract void a(bPr parambPr);
}