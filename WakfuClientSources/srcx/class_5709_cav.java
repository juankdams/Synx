import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public abstract class cav extends cwV
  implements Ae, Cloneable
{
  private List hrm = new ArrayList();
  private Collection fkP = null;
  private boolean dtq = true;

  public cav()
  {
  }

  public cav(FF paramFF)
  {
    b(paramFF);
  }

  public synchronized void cD(boolean paramBoolean)
  {
    this.dtq = paramBoolean;
  }

  public synchronized boolean bhs()
  {
    return this.dtq;
  }

  public synchronized void clear()
  {
    if (cum()) {
      throw cur();
    }
    this.hrm.clear();
    dri.bp(this);
    this.fkP = null;
    setChecked(false);
  }

  public synchronized void b(Ae paramAe)
  {
    if (cum()) {
      throw cur();
    }
    if (paramAe == null) {
      return;
    }
    if (FF.E(paramAe) == null) {
      FF localFF = Ga();
      if (localFF != null) {
        localFF.G(paramAe);
      }
    }
    this.hrm.add(paramAe);
    dri.bp(this);
    this.fkP = null;
    setChecked(false);
  }

  public synchronized void s(Collection paramCollection)
  {
    if (cum())
      throw cur();
    try
    {
      for (Ae localAe : paramCollection)
        b(localAe);
    }
    catch (ClassCastException localClassCastException) {
      throw new cJ(localClassCastException);
    }
  }

  public final synchronized Iterator iterator()
  {
    if (cum()) {
      return ((cav)cup()).iterator();
    }
    cuo();
    return new dri(this, ceI().iterator());
  }

  public synchronized int size()
  {
    if (cum()) {
      return ((cav)i(cav.class, cun())).size();
    }
    cuo();
    return ceI().size();
  }

  public synchronized boolean Jm()
  {
    if (cum()) {
      return ((cav)cup()).Jm();
    }
    cuo();

    boolean bool = true;
    for (Iterator localIterator = this.hrm.iterator(); (bool) && (localIterator.hasNext()); ) {
      bool = ((Cloneable)localIterator.next()).Jm();
    }
    if (bool) {
      return true;
    }

    for (bFe localbFe : ceI()) {
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
      for (Ae localAe : this.hrm) {
        if ((localAe instanceof cwV)) {
          b((cwV)localAe, paramStack, paramFF);
        }
      }
      setChecked(true);
    }
  }

  public final synchronized List ceH()
  {
    cuo();
    return Collections.unmodifiableList(this.hrm);
  }

  protected abstract Collection getCollection();

  public Object clone()
  {
    try
    {
      cav localcav = (cav)super.clone();

      localcav.hrm = new ArrayList(this.hrm);
      localcav.fkP = null;
      return localcav;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }

  public synchronized String toString()
  {
    if (cum()) {
      return cup().toString();
    }
    if (ceI().size() == 0) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    for (bFe localbFe : this.fkP) {
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append(File.pathSeparatorChar);
      }
      localStringBuilder.append(localbFe);
    }
    return localStringBuilder.toString();
  }

  private synchronized Collection ceI() {
    if ((this.fkP == null) || (!bhs())) {
      this.fkP = getCollection();
    }
    return this.fkP;
  }
}