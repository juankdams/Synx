import java.util.ArrayList;
import java.util.List;

public final class cbo extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public cbo(ArrayList paramArrayList) {
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);

    return (localdhJ != null) && (localdhJ.cQJ()) ? 0 : -1;
  }

  public Enum gm() {
    return Bz.bBT;
  }

  static
  {
    Pq[] arrayOfPq = { Pq.chu };
    aAG.add(arrayOfPq);
  }
}