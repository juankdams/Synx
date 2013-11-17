import java.util.ArrayList;
import java.util.List;

public final class dzE extends akN
{
  private static ArrayList aAG = new ArrayList();
  private boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public dzE(ArrayList paramArrayList) {
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public Enum gm() {
    return Bz.bCb;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);

    if (!(localdhJ instanceof aDW)) {
      return -1;
    }
    return ((aDW)localdhJ).aQh().size() > 0 ? 0 : -1;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu });
  }
}