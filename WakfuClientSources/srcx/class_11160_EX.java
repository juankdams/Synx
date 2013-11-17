import java.util.ArrayList;
import java.util.List;

public class EX extends cIX
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public EX(ArrayList paramArrayList) {
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ == null)
      throw new aIh("on cherche le rang gouvernemental d'un user null");
    if (!(paramObject1 instanceof cTK)) {
      throw new aIh("on cherche le gouvernemental d'un user qui n'est pas citoyen");
    }
    Yp localYp = localdhJ.cJf().HK();
    if (localYp == null) {
      return -1L;
    }
    return super.cDu() * localYp.getId();
  }

  public Enum gm() {
    return Bz.bBh;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}