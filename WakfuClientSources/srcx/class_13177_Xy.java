import java.util.ArrayList;
import java.util.List;

public class Xy extends cIX
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public Xy(ArrayList paramArrayList) {
    J(paramArrayList);
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ != null) {
      return localdhJ.Lk();
    }
    if ((paramObject1 instanceof dgG)) {
      return ((dgG)paramObject1).Lk();
    }
    throw new aIh("Impossible d'evaluer le critere GetInstanceId sur user=" + paramObject1);
  }

  public Enum gm() {
    return Bz.byp;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}