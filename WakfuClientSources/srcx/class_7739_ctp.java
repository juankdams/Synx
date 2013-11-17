import java.util.ArrayList;

public class ctp extends aBr
{
  private ArrayList eMR;

  public Pq aNE()
  {
    return Pq.chx;
  }

  public Enum gm() {
    return apd.duT;
  }

  public cbQ g(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    cbQ localcbQ = new cbQ();
    for (aOw localaOw : this.eMR) {
      localcbQ.add(localaOw.b(paramObject1, paramObject2, paramObject3, paramObject4));
    }
    return localcbQ;
  }

  public ctp(ArrayList paramArrayList) {
    this(paramArrayList, false);
  }

  public ctp(ArrayList paramArrayList, boolean paramBoolean) {
    if (paramBoolean) {
      this.eMR = paramArrayList;
    } else {
      this.eMR = new ArrayList();
      for (dKY localdKY : paramArrayList)
        if (localdKY.aNE() == Pq.chv)
          this.eMR.add((aOw)localdKY);
        else
          throw new ddQ("On essaie d'ajouter " + localdKY + " de type " + localdKY.aNE().name() + " à une liste de valeur numérique");
    }
  }

  public int getSize()
  {
    return this.eMR.size();
  }
}