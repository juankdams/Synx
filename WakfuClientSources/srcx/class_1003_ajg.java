import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class ajg extends doA
{
  private static final aee bx = new bOO(new Db());

  private static final qM by = new dzQ(new ec[] { new dLx("Default", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public ajg() {
    aH();
  }

  public ajg awe()
  {
    ajg localajg;
    try {
      localajg = (ajg)bx.Mm();
      localajg.aOr = bx;
    } catch (Exception localException) {
      localajg = new ajg();
      localajg.aOr = null;
      localajg.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveEffectArea : " + localException.getMessage());
    }
    return localajg;
  }

  public void a(aVc paramaVc) {
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    if (this.ejP == null) {
      return;
    }
    Collection localCollection = this.ejP.LC().bbj();
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if ((localcjK.B(this.eUw)) && (localcjK.getType() == xj.bpv.xj()) && (localcjK.axG() == ((dhJ)this.evo).aft()))
      {
        localArrayList.add(localcjK);
      }
    }
    cjK localcjK;
    if (localArrayList.isEmpty()) {
      return;
    }
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      this.ejP.LC().h(localcjK); }
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM() {
    return false;
  }

  public boolean aN() {
    return true;
  }

  public void bc() {
    super.bc();
  }
}