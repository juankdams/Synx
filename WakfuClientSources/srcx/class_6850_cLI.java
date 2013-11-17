import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class cLI extends akN
{
  private static final ArrayList ayr = new ArrayList();
  private boolean aXA;
  private long crQ;

  public cLI(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.crQ = ((aOw)paramArrayList.get(1)).b(null, null, null, null);
  }

  protected List kM()
  {
    return ayr;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    if (((localaxQ instanceof dhJ)) && (!aU((dhJ)localaxQ))) {
      return -1;
    }
    int i = localaxQ.dv(this.crQ);
    if (i < 0) {
      return -1;
    }
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }
    dbE localdbE = aAw.i(paramObject1, paramObject4);
    if (localdbE == null) {
      throw new aIh("Impossible de récupérer le combat");
    }
    Collection localCollection = localdbE.bgF();
    for (dhJ localdhJ : localCollection) {
      if ((aU(localdhJ)) && (localdhJ.dv(this.crQ) > i)) {
        return -1;
      }
    }
    return 0;
  }

  private boolean aU(dhJ paramdhJ) {
    return (!paramdhJ.c(cfY.hBO)) && (!paramdhJ.c(cfY.hBt)) && (!paramdhJ.Vj());
  }

  public Enum gm()
  {
    return Bz.bDv;
  }

  static
  {
    ayr.add(new Pq[] { Pq.chu, Pq.chv });
  }
}