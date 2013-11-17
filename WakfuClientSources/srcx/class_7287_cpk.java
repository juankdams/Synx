import java.util.ArrayList;
import java.util.List;

public class cpk extends cIX
{
  private static final int hYu = -1;
  private static ArrayList aAG = new ArrayList();
  private aOw hYv;
  private aOw hYw;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public cpk(ArrayList paramArrayList) {
    int i = J(paramArrayList);
    if (i == 0) {
      this.hYv = null;
      this.hYw = ((aOw)paramArrayList.get(0));
    } else if (i == 1) {
      this.hYv = ((aOw)paramArrayList.get(0));
      this.hYw = ((aOw)paramArrayList.get(1));
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i;
    if (this.hYv == null) {
      localObject = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);
      if (localObject == null)
        throw new aIh("Impossible de récupérer la cible du critère");
      i = ((dhJ)localObject).cJf().bP();
    } else {
      i = (int)this.hYv.b(paramObject1, paramObject2, paramObject3, paramObject4);
    }
    int j = (int)this.hYw.b(paramObject1, paramObject2, paramObject3, paramObject4);

    Object localObject = dsh.luB.BA(i).aMP().jq(j);
    return super.cDu() * ((dqU)localObject).bJ();
  }

  public Enum gm() {
    return Bz.bzt;
  }

  public aOw coT() {
    return this.hYv;
  }

  public aOw coU() {
    return this.hYw;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    Pq tmp41_38 = Pq.chv; arrayOfPq[1] = tmp41_38; arrayOfPq[0] = tmp41_38;
    aAG.add(arrayOfPq);
  }
}