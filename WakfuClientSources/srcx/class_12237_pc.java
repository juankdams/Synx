import java.util.ArrayList;
import java.util.List;

public final class pc extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw aUQ;

  protected List kM()
  {
    return aAG;
  }

  public pc()
  {
  }

  public pc(ArrayList paramArrayList)
  {
    J(paramArrayList);
    if (paramArrayList.size() == 1)
      this.aUQ = ((aOw)paramArrayList.get(0));
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i = (int)this.aUQ.b(paramObject1, paramObject2, paramObject3, paramObject4);

    deT localdeT = DA.bIr.eD(i);

    if (localdeT == null) {
      throw new aIh("Impossible de récupérer la nation d'ID " + i);
    }
    return super.cDu() * localdeT.cPh();
  }

  public Enum gm() {
    return Bz.bAX;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    Pq tmp22_19 = Pq.chv; arrayOfPq[0] = tmp22_19; arrayOfPq[0] = tmp22_19;
    aAG.add(arrayOfPq);
  }
}