import java.util.ArrayList;
import java.util.List;

public class cmU extends cIX
{
  private aOw hSw;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public cmU(ArrayList paramArrayList) {
    J(paramArrayList);
    this.hSw = ((aOw)paramArrayList.get(0));
  }

  public int cnE() {
    if ((this.hSw.sc()) && (this.hSw.pH())) {
      return (int)this.hSw.b(null, null, null, null);
    }
    return -1;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!this.hSw.pH())
      throw new aIh("La limite du random n'est pas un entier");
    return bCO.sf(cnE());
  }

  public Enum gm() {
    return Bz.bzk;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}