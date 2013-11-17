import java.util.Iterator;
import java.util.Stack;

public class aSI extends cJw
  implements Ae
{
  private cGk ePV = new drt(this);

  public synchronized void b(Ae paramAe)
  {
    if (cum()) {
      throw cur();
    }
    if (paramAe == null) {
      return;
    }
    this.ePV.b(paramAe);
    setChecked(false);
  }

  public synchronized void cD(boolean paramBoolean)
  {
    this.ePV.cD(paramBoolean);
  }

  public synchronized boolean bhs()
  {
    return this.ePV.bhs();
  }

  public synchronized void a(bNe parambNe)
  {
    if (parambNe == null) {
      return;
    }
    super.a(parambNe);
    dri.bp(this);
  }

  public final synchronized Iterator iterator()
  {
    if (cum()) {
      return ((aSI)cup()).iterator();
    }
    cuo();
    return this.ePV.iterator();
  }

  public synchronized int size()
  {
    if (cum()) {
      return ((aSI)cup()).size();
    }
    cuo();
    return this.ePV.size();
  }

  public synchronized boolean Jm()
  {
    if (cum()) {
      return ((aSI)cup()).Jm();
    }
    cuo();
    return this.ePV.Jm();
  }

  public synchronized String toString()
  {
    if (cum()) {
      return cup().toString();
    }
    cuo();
    return this.ePV.toString();
  }

  protected synchronized void a(Stack paramStack, FF paramFF) {
    if (isChecked()) {
      return;
    }

    super.a(paramStack, paramFF);

    if (!cum()) {
      b(this.ePV, paramStack, paramFF);
      setChecked(true);
    }
  }
}