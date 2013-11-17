import java.util.ArrayList;
import java.util.List;

public class dVM extends cIX
{
  private static ArrayList aAG = new ArrayList();

  public boolean pH()
  {
    return true;
  }

  protected List kM()
  {
    return aAG;
  }

  public dVM(ArrayList paramArrayList)
  {
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    long l = 0L;
    dhJ localdhJ1 = aAw.a(false, paramObject1, paramObject2, paramObject4, paramObject3);
    dhJ localdhJ2 = aAw.a(true, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ1 == null)
      return -1L;
    if (!(localdhJ1 instanceof ajF)) {
      return -1L;
    }
    NQ localNQ = localdhJ1.awq();
    l = localNQ.R(localdhJ2.uO());

    return super.cDu() * l;
  }

  public Enum gm() {
    return Bz.bxF;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}