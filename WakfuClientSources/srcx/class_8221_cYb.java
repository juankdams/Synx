import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class cYb
  implements Runnable
{
  private static final Logger K = Logger.getLogger(cYb.class);

  private static final cYb kLt = new cYb();

  private static final float[] aUb = { 1.0F, 1.0F, 1.0F, 0.6F };
  private final LinkedList kLu = new LinkedList();
  public static final boolean kLv = false;

  public static cYb cLu()
  {
    return kLt;
  }

  public void cLv()
  {
    while (!a(cLw()));
  }

  private boolean a(cyG paramcyG)
  {
    if (paramcyG == null) {
      return true;
    }

    paramcyG.adg();

    if ((paramcyG.isEnabled()) && (paramcyG.pZ())) {
      paramcyG.fy(true);
      return true;
    }
    return false;
  }

  cyG cLw()
  {
    if (this.kLu.isEmpty()) {
      return null;
    }
    return (cyG)this.kLu.poll();
  }

  public void b(cyG paramcyG) {
    if (c(paramcyG))
      return;
    paramcyG.azR();

    this.kLu.add(paramcyG);
  }

  public boolean cLx() {
    return this.kLu.isEmpty();
  }

  public void clear() {
    K.info("[QUEUE_COLLECT] on clear toutes les actions");
    cLz();
    for (int i = this.kLu.size() - 1; i >= 0; i--)
      d((cyG)this.kLu.get(i));
  }

  public boolean c(cyG paramcyG) {
    bKi localbKi = paramcyG.bFc();
    bVf localbVf = paramcyG.bFd();
    if ((localbKi == null) || (localbVf == null))
      return true;
    for (Iterator localIterator = this.kLu.iterator(); localIterator.hasNext(); ) {
      cyG localcyG = (cyG)localIterator.next();
      if ((localbKi.equals(localcyG.bFc())) && (localbKi.equals(localcyG.bFd()))) {
        return true;
      }
    }
    return false;
  }

  public void d(cyG paramcyG) {
    if (this.kLu.contains(paramcyG)) {
      paramcyG.adg();
      this.kLu.remove(paramcyG);
    }
  }

  public boolean s(azX paramazX) {
    for (cyG localcyG : this.kLu)
      if (localcyG.bFd().equals(paramazX))
        return true;
    return false;
  }

  public void wg()
  {
    wh();
    dka.cSF().a(this, 5000L, 1);
  }

  public void wh()
  {
    dka.cSF().j(this);
  }

  public boolean cLy() {
    dKc localdKc = byv.bFN().bFO().bSe();
    return (localdKc != null) && ((localdKc.fU() == 3) || (localdKc.fU() == 6));
  }

  public void cLz()
  {
    wh();
  }

  public void run()
  {
    K.warn("[QUEUE_COLLECT] timeOut executé");
    cLv();
  }
}