import java.util.ArrayList;
import java.util.List;

public final class ahH extends avC
{
  private static ArrayList aAG = new ArrayList();
  private final aOw ddu;

  protected List kM()
  {
    return aAG;
  }

  public ahH(ArrayList paramArrayList)
  {
    super(((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target"), (aOw)paramArrayList.get(1), (bBB)paramArrayList.get(2));

    u(paramArrayList);
    this.ddu = ((aOw)paramArrayList.get(3));
  }

  protected boolean a(cjK paramcjK, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramcjK == null)
      return false;
    if (!(paramcjK instanceof axQ))
      return false;
    long l = this.ddu.b(paramObject1, paramObject2, paramObject3, paramObject4);
    return ((axQ)paramcjK).du(l);
  }

  public Enum gm() {
    return Bz.bBE;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[4];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chv;
    arrayOfPq[2] = Pq.chw;
    arrayOfPq[3] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}