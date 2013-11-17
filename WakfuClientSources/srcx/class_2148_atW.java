import java.util.ArrayList;
import java.util.List;

public class atW extends cIX
{
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public atW(ArrayList paramArrayList) {
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ == null)
      throw new aIh("on cherche le nombre de kamas d'un user null");
    if (!(paramObject1 instanceof drG)) {
      throw new aIh("on cherche le titre d'un character qui ne peut en avoir");
    }
    return super.cDu() * ((drG)localdhJ).bSl();
  }

  public Enum gm() {
    return Bz.bBg;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}