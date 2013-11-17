import java.util.ArrayList;
import java.util.List;

public class dzk extends cIX
{
  private static final ArrayList aAG = new ArrayList();
  private aOw hJU;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public dzk(ArrayList paramArrayList) {
    J(paramArrayList);
    if (paramArrayList.size() == 1)
      this.hJU = ((aOw)paramArrayList.get(0));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i;
    if (this.hJU == null) {
      localObject = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);
      if (localObject == null)
        throw new aIh("Impossible de récupérer d'utilisateur pour ce critère");
      i = ((dhJ)localObject).afd();
    } else {
      i = (int)this.hJU.b(paramObject1, paramObject2, paramObject3, paramObject4);
    }

    Object localObject = QI.cpK.gq(i);

    if (localObject == null) {
      throw new aIh("Impossible de récupérer le territoire " + i);
    }
    aid localaid = ((bGI)localObject).boT();

    if (localaid == null) {
      throw new aIh("Impossible de récupérer le protecteur du territoire " + i);
    }
    return super.cDu() * localaid.avc();
  }

  public Enum gm() {
    return Bz.bzs;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}