import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class cAp extends brg
{
  private static final ArrayList ayr = new ArrayList();
  private long ibW;

  public cAp(ArrayList paramArrayList)
  {
    int i = u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");

    switch (i) {
    case 1:
      this.ibW = ((aOw)paramArrayList.get(1)).b(null, null, null, null);
      this.fMN = aWq.fbC;
      break;
    case 2:
      this.ibW = -1L;
      iN(((cic)paramArrayList.get(1)).getValue());
      break;
    case 3:
      this.ibW = ((aOw)paramArrayList.get(1)).b(null, null, null, null);
      iN(((cic)paramArrayList.get(2)).getValue());
    }
  }

  protected List kM()
  {
    return ayr;
  }

  protected boolean a(dhJ paramdhJ, dbE paramdbE, cYk paramcYk)
  {
    aPH localaPH = paramdhJ.afv();
    if (localaPH == null) {
      return false;
    }
    Collection localCollection = localaPH.bgF();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      dhJ localdhJ = (dhJ)localIterator.next();
      if ((localdhJ != paramdhJ) && 
        (localdhJ.afw() == paramdhJ))
      {
        if ((localdhJ.uO() == this.ibW) || (this.ibW == -1L)) {
          switch (dUe.cOt[this.fMN.ordinal()]) {
          case 1:
            if (paramcYk.eE(localdhJ.fa(), localdhJ.fb())) {
              return true;
            }
            break;
          case 2:
            if (paramcYk.eD(localdhJ.fa(), localdhJ.fb()))
              return true;
            break;
          }
        }
      }
    }
    return false;
  }

  public Enum gm()
  {
    return Bz.bCO;
  }

  static
  {
    ayr.add(zT.buY);
    ayr.add(new Pq[] { Pq.chu, Pq.chv });
    ayr.add(new Pq[] { Pq.chu, Pq.chu });
    ayr.add(new Pq[] { Pq.chu, Pq.chv, Pq.chu });
  }
}