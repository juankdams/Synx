import java.util.ArrayList;
import java.util.List;

public class bfD extends akN
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public bfD(ArrayList paramArrayList) {
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ1 = aAw.a(true, paramObject1, paramObject2, paramObject4, paramObject3);
    dhJ localdhJ2 = aAw.a(false, paramObject1, paramObject2, paramObject4, paramObject3);
    if ((localdhJ2 == null) || (localdhJ1 == null))
      return -1;
    if (localdhJ2.Fx() == localdhJ1.Fx()) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bCa;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}