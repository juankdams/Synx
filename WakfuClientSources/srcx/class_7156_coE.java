import java.util.ArrayList;
import java.util.List;

public final class coE extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aXA = false;
  private aOw hWe;

  public coE(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.aXA = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    this.hWe = ((aOw)paramArrayList.get(1));
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aXA, paramObject1, paramObject2, paramObject4, paramObject3);

    int i = (int)this.hWe.b(paramObject1, paramObject2, paramObject3, paramObject4);

    return localdhJ.zW(i) ? 0 : -1;
  }

  public Enum gm() {
    return Bz.bCc;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu, Pq.chv });
  }
}