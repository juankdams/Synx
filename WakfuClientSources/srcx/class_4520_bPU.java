import java.util.ArrayList;
import java.util.List;

public class bPU extends akN
{
  private int dfl;
  private boolean gYd;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public bPU() {
  }

  public bPU(ArrayList paramArrayList) {
    int i = (short)u(paramArrayList);
    if (i == 0) {
      this.dfl = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
      this.gYd = false;
    } else if (i == 1) {
      this.dfl = ((int)((aOw)paramArrayList.get(0)).b(null, null, null, null));
      this.gYd = ((bZA)paramArrayList.get(1)).i(null, null, null, null);
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    boolean bool;
    if (this.gYd) {
      bool = NB.cdZ.cF(this.dfl);
    } else {
      if (!(paramObject1 instanceof djv)) {
        return -1;
      }

      djv localdjv = (djv)paramObject1;
      se localse = localdjv.bFZ();

      bool = localse.cF(this.dfl);
    }

    return bool ? 0 : -1;
  }

  public Enum gm() {
    return Bz.bDs;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chv;
    arrayOfPq[1] = Pq.chw;
    aAG.add(arrayOfPq);
  }
}