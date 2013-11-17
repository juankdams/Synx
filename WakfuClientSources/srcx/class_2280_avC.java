import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class avC extends akN
{
  private static ArrayList aAG = new ArrayList();
  protected final boolean aMu;
  private final aOw dsO;
  private final bBB cYJ;

  protected List kM()
  {
    return aAG;
  }

  protected avC(boolean paramBoolean, aOw paramaOw, bBB parambBB) {
    this.aMu = paramBoolean;
    this.dsO = paramaOw;
    this.cYJ = parambBB;
  }

  public avC(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.dsO = ((aOw)paramArrayList.get(1));

    if (paramArrayList.size() >= 3)
      this.cYJ = ((bBB)paramArrayList.get(2));
    else
      this.cYJ = null;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    long l = this.dsO.b(paramObject1, paramObject2, paramObject3, paramObject4);

    dbE localdbE = null;
    if ((paramObject4 instanceof dbE))
      localdbE = (dbE)paramObject4;
    else if ((paramObject4 instanceof dMC)) {
      localdbE = ((dMC)paramObject4).dps();
    }
    if (localdbE == null) {
      return -1;
    }
    int i = (this.cYJ != null) && (this.cYJ.i(paramObject1, paramObject3, paramObject3, paramObject4)) ? 1 : 0;
    dle localdle;
    if (i != 0)
      localdle = aAw.ai(localaxQ);
    else {
      localdle = null;
    }
    Collection localCollection = localdbE.LC().bbj();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      cjK localcjK = (cjK)localIterator.next();
      if ((localcjK.clt() == l) && (
        (localdle == null) || 
        (aAw.ai(localcjK) == localdle)))
      {
        if ((localcjK.B(localaxQ.ML())) && 
          (a(localcjK, paramObject1, paramObject2, paramObject3, paramObject4))) {
          return 0;
        }
      }
    }
    return -1;
  }

  protected boolean a(cjK paramcjK, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    return true;
  }

  public aOw aHy() {
    return this.dsO;
  }

  public Enum gm()
  {
    return Bz.bBD;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu, Pq.chv });
    aAG.add(new Pq[] { Pq.chu, Pq.chv, Pq.chw });
  }
}