import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class afG extends akN
{
  private static ArrayList aAG = new ArrayList();
  private final boolean aMu;
  private final aOw cYI;
  private final bBB cYJ;

  protected List kM()
  {
    return aAG;
  }

  public afG(ArrayList paramArrayList) {
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.cYI = ((aOw)paramArrayList.get(1));
    if (paramArrayList.size() >= 3)
      this.cYJ = ((bBB)paramArrayList.get(2));
    else
      this.cYJ = null;
  }

  public afG(String paramString, int paramInt, boolean paramBoolean) {
    this.aMu = paramString.equalsIgnoreCase("target");
    this.cYI = new ciM(paramInt);
    this.cYJ = new bBB(paramBoolean);
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    int i = (int)this.cYI.b(paramObject1, paramObject2, paramObject3, paramObject4);
    xj localxj = xj.dA(i);
    if (localxj == null) {
      K.error("Error while checking IsOnEffectAreaType : area type " + i + " doesn't exist");
      return -1;
    }

    dbE localdbE = null;
    if ((paramObject4 instanceof dbE))
      localdbE = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC)) {
      localdbE = ((dMC)paramObject4).dps();
    }
    if (localdbE == null) {
      return -1;
    }
    int j = (this.cYJ != null) && (this.cYJ.i(paramObject1, paramObject3, paramObject3, paramObject4)) ? 1 : 0;
    dle localdle;
    if (j != 0)
      localdle = aAw.ai(localdhJ);
    else {
      localdle = null;
    }
    Collection localCollection = localdbE.LC().bbj();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      cjK localcjK = (cjK)localIterator.next();
      if ((localcjK.getType() == i) && (
        (localdle == null) || 
        (aAw.ai(localcjK) == localdle)))
      {
        if (localcjK.B(localdhJ.ML()))
          return 0;
      }
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bBC;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[3];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chv;
    arrayOfPq[2] = Pq.chw;
    aAG.add(arrayOfPq);
  }
}