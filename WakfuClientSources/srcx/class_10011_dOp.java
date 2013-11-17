import java.util.ArrayList;
import java.util.List;

public final class dOp extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw aUQ;

  public dOp()
  {
  }

  public dOp(ArrayList paramArrayList)
  {
    J(paramArrayList);
    this.aUQ = ((aOw)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public Enum gm() {
    return Bz.bAZ;
  }

  public boolean pH() {
    return true;
  }

  public int axX() {
    if ((this.aUQ.sc()) && (this.aUQ.pH())) {
      return (int)this.aUQ.b(null, null, null, null);
    }
    return -1;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.f(paramObject1, paramObject2, paramObject3, paramObject4);

    if ((localaxQ == null) || (!(localaxQ instanceof aHi))) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }
    int i = (int)this.aUQ.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return ((aHi)localaxQ).aTn().getLevel(i);
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv });
  }
}