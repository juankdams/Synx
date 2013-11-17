import java.util.ArrayList;
import java.util.List;

public abstract class cqm
{
  private List aEZ = null;

  public abstract int value();

  public abstract int acU();

  public abstract int max();

  public abstract int acX();

  public abstract int min();

  public abstract int gu(int paramInt);

  public abstract void set(int paramInt);

  public abstract int gv(int paramInt);

  public abstract int gw(int paramInt);

  public abstract int gx(int paramInt);

  public abstract int gy(int paramInt);

  public abstract void setMax(int paramInt);

  public abstract void setMin(int paramInt);

  public abstract void acY();

  public boolean rN()
  {
    return value() > 0;
  }

  public boolean isNegative()
  {
    return value() < 0;
  }

  public boolean isZero()
  {
    return value() == 0;
  }

  public boolean cpv()
  {
    return value() != 0;
  }

  public boolean isMaximum()
  {
    return acU() >= max();
  }

  public boolean cpw()
  {
    return acU() <= min();
  }

  public void cpx()
  {
    set(max());
  }

  public void cpy()
  {
    set(min());
  }

  public abstract dSc adb();

  public void F(List paramList) {
    if (paramList == null) {
      return;
    }
    if (this.aEZ == null) {
      this.aEZ = new ArrayList();
      this.aEZ.addAll(paramList);
    } else {
      cpA();
      this.aEZ.addAll(paramList);
    }
  }

  public void a(caY paramcaY) {
    if (this.aEZ == null) {
      this.aEZ = new ArrayList();
      this.aEZ.add(paramcaY);
    } else if (!this.aEZ.contains(paramcaY)) {
      this.aEZ.add(paramcaY);
    }
  }

  public void b(caY paramcaY) { if (this.aEZ != null)
      this.aEZ.remove(paramcaY); }

  public List cpz()
  {
    return this.aEZ;
  }

  public void cpA() {
    if (this.aEZ != null)
      this.aEZ.clear();
  }

  public void cpB() {
    if ((this.aEZ != null) && (!this.aEZ.isEmpty()))
      for (caY localcaY : this.aEZ)
        localcaY.a(this);
  }
}