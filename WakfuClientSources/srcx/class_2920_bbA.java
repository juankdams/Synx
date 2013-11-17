import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class bbA extends cwV
  implements Ae
{
  public static final Ae fkM = new bOc();

  public static final Iterator fkN = new bOa();
  private Vector fkO;
  private Collection fkP;
  private boolean dtq = false;

  public bbA()
  {
  }

  public bbA(FF paramFF)
  {
    b(paramFF);
  }

  public synchronized void cD(boolean paramBoolean)
  {
    this.dtq = paramBoolean;
  }

  public synchronized void b(Ae paramAe)
  {
    if (cum()) {
      throw cur();
    }
    if (paramAe == null) {
      return;
    }
    if (this.fkO == null) {
      this.fkO = new Vector();
    }
    this.fkO.add(paramAe);
    bqc();
    this.fkP = null;
    setChecked(false);
  }

  public synchronized Iterator iterator()
  {
    if (cum()) {
      return bqd().iterator();
    }
    validate();
    return new dri(this, this.fkP.iterator());
  }

  public synchronized int size()
  {
    if (cum()) {
      return bqd().size();
    }
    validate();
    return this.fkP.size();
  }

  public boolean Jm()
  {
    if (cum()) {
      return bqd().Jm();
    }
    validate();

    for (Iterator localIterator = bqe().iterator(); localIterator.hasNext(); ) {
      if (!((Ae)localIterator.next()).Jm()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String toString()
  {
    if (cum()) {
      return cup().toString();
    }
    validate();
    if ((this.fkP == null) || (this.fkP.isEmpty())) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    for (bFe localbFe : this.fkP) {
      if (localStringBuffer.length() > 0) {
        localStringBuffer.append(File.pathSeparatorChar);
      }
      localStringBuffer.append(localbFe);
    }
    return localStringBuffer.toString();
  }

  protected void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      for (Ae localAe : bqe()) {
        if ((localAe instanceof cwV)) {
          b((cwV)localAe, paramStack, paramFF);
        }
      }
      setChecked(true);
    }
  }

  protected void bqc()
  {
    dri.bp(this);
  }

  private Ae bqd()
  {
    return (Ae)i(Ae.class, "ResourceCollection");
  }

  private synchronized void validate()
  {
    cuo();
    this.fkP = (this.fkP == null ? new cUI(this) : this.fkP);
  }

  private synchronized List bqe() {
    return this.fkO == null ? Collections.emptyList() : this.fkO;
  }
}