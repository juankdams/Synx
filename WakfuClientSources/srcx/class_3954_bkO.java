import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class bkO extends doA
{
  private static final aee bx = new bOO(new dng());

  private static final qM by = new dzQ(new ec[] { new dLx("Id de la Zone a retirer", new dmb[] { new dmb("Id", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public bkO()
  {
    aH();
  }

  public bkO bvw()
  {
    bkO localbkO;
    try {
      localbkO = (bkO)bx.Mm();
      localbkO.aOr = bx;
    } catch (Exception localException) {
      localbkO = new bkO();
      localbkO.aOr = null;
      localbkO.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveAllAreasWithId : " + localException.getMessage());
    }
    return localbkO;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() < 1)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!bkt())
      return;
    if (this.ejP == null) {
      return;
    }
    aJD localaJD = this.ejP.LC();
    Collection localCollection = localaJD.bbj();
    HashSet localHashSet = new HashSet();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      if (localcjK.clt() == this.cxl)
        localHashSet.add(localcjK);
    }
    cjK localcjK;
    for (localIterator = localHashSet.iterator(); localIterator.hasNext(); ) { localcjK = (cjK)localIterator.next();
      localaJD.a(localcjK, this.evo);
    }
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void bc()
  {
    super.bc();
  }
}