import java.util.ArrayList;
import java.util.List;

public class dmU extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public dmU(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 1)
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    return (localdhJ != null) && (localdhJ.isDead()) ? 0 : -1;
  }

  public Enum gm() {
    return Bz.bzK;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}