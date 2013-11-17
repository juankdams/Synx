import java.io.File;
import java.util.Iterator;
import java.util.Stack;

public abstract class aQU extends cwV
  implements Ae, Cloneable
{
  private static final String eNJ = " expects exactly one nested resource collection.";
  private Ae eNK;
  private boolean dtq = true;

  public synchronized void cD(boolean paramBoolean)
  {
    this.dtq = paramBoolean;
  }

  public synchronized boolean bhs()
  {
    return this.dtq;
  }

  public synchronized void b(Ae paramAe)
  {
    if (cum()) {
      throw cur();
    }
    if (paramAe == null) {
      return;
    }
    if (this.eNK != null) {
      throw bhv();
    }
    this.eNK = paramAe;
    if (FF.E(this.eNK) == null) {
      FF localFF = Ga();
      if (localFF != null) {
        localFF.G(this.eNK);
      }
    }
    setChecked(false);
  }

  public final synchronized Iterator iterator()
  {
    if (cum()) {
      return ((aQU)cup()).iterator();
    }
    cuo();
    return new dri(this, bht());
  }

  protected abstract Iterator bht();

  public synchronized int size()
  {
    if (cum()) {
      return ((aQU)cup()).size();
    }
    cuo();
    return getSize();
  }

  protected abstract int getSize();

  public synchronized boolean Jm()
  {
    if (cum()) {
      return ((cav)cup()).Jm();
    }
    cuo();

    if ((this.eNK == null) || (this.eNK.Jm())) {
      return true;
    }

    for (bFe localbFe : this) {
      if (localbFe.G(dmo.class) == null) {
        return false;
      }
    }
    return true;
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      if ((this.eNK instanceof cwV)) {
        b((cwV)this.eNK, paramStack, paramFF);
      }
      setChecked(true);
    }
  }

  protected final synchronized Ae bhu()
  {
    cuo();
    if (this.eNK == null) {
      throw bhv();
    }
    return this.eNK;
  }

  public synchronized String toString()
  {
    if (cum()) {
      return cup().toString();
    }
    if (getSize() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (bFe localbFe : this) {
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append(File.pathSeparatorChar);
      }
      localStringBuilder.append(localbFe);
    }
    return localStringBuilder.toString();
  }

  private cJ bhv() {
    return new cJ(super.toString() + " expects exactly one nested resource collection.");
  }
}