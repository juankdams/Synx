import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class bwQ extends doA
{
  private static final aee bx = new bOO(new ckQ());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });

  public qM aF()
  {
    return by;
  }

  public bwQ() {
    aH();
  }

  public bwQ bEw()
  {
    bwQ localbwQ;
    try {
      localbwQ = (bwQ)bx.Mm();
      localbwQ.aOr = bx;
    } catch (Exception localException) {
      localbwQ = new bwQ();
      localbwQ.aOr = null;
      localbwQ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CollectForController : " + localException.getMessage());
    }
    return localbwQ;
  }

  public void a(aVc paramaVc) {
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    cVD();

    if (this.eUw == null) {
      return;
    }
    Collection localCollection = this.ejP.LC().bbj();
    dhJ localdhJ = null;
    if ((this.evo instanceof dhJ)) {
      localdhJ = ((dhJ)this.evo).afw();
    }

    if (localdhJ == null) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      localObject = (cjK)localIterator.next();
      if ((((cjK)localObject).B(this.eUw)) && (((cjK)localObject).getType() == xj.bpw.xj()))
        localArrayList.add((aAn)localObject);
    }
    Object localObject;
    for (localIterator = localArrayList.iterator(); localIterator.hasNext(); ) { localObject = (aAn)localIterator.next();
      ((aAn)localObject).J(localdhJ);
      ((aAn)localObject).a(this, localdhJ); }
  }

  public boolean aL()
  {
    return true;
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