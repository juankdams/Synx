import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class Sh extends aph
{
  private static ArrayList aAG = new ArrayList();
  private final long crQ;
  private final long crR;
  private final boolean crS;

  public Sh(List paramList)
  {
    int i = J(paramList);
    this.brd = ((aOw)paramList.get(0));
    this.aMu = ((cic)paramList.get(1)).getValue().equalsIgnoreCase("target");
    this.crQ = ((aOw)paramList.get(2)).b(null, null, null, null);
    if (i == 1)
      this.crR = ((aOw)paramList.get(3)).b(null, null, null, null);
    else
      this.crR = -1L;
    if (i == 2)
      this.crS = ((bBB)paramList.get(3)).i(null, null, null, null);
    else
      this.crS = true;
  }

  protected List kM()
  {
    return aAG;
  }

  protected Collection a(dbE paramdbE, axQ paramaxQ)
  {
    if (paramdbE == null)
      return Collections.emptyList();
    Collection localCollection = this.crS ? paramdbE.bgJ() : paramdbE.bgU();
    ArrayList localArrayList = new ArrayList();
    for (Object localObject1 = localCollection.iterator(); ((Iterator)localObject1).hasNext(); ) {
      localObject2 = (dhJ)((Iterator)localObject1).next();
      if (this.crR >= 0L) {
        if (((dhJ)localObject2).r(this.crQ, this.crR)) {
          localArrayList.add(localObject2);
        }
      }
      else if (((dhJ)localObject2).du(this.crQ)) {
        localArrayList.add(localObject2);
      }

    }

    localObject1 = paramdbE.LC().bbj();
    for (Object localObject2 = ((Collection)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject2).next();
      bgJ localbgJ = (bgJ)localcjK.atO();
      if (localbgJ != null)
      {
        bPD localbPD = localbgJ.pz((int)this.crQ);
        if ((localbPD != null) && (
          (this.crR < 0L) || (
          (localbPD.bWk() != null) && (localbPD.bWk().nU() == this.crR))))
        {
          localArrayList.add(localcjK);
        }
      } } return localArrayList;
  }

  public Enum gm()
  {
    return Bz.bBJ;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv, Pq.chu, Pq.chv });
    aAG.add(new Pq[] { Pq.chv, Pq.chu, Pq.chv, Pq.chv });
    aAG.add(new Pq[] { Pq.chv, Pq.chu, Pq.chv, Pq.chw });
  }
}