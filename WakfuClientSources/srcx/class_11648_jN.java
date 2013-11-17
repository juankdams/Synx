import java.util.ArrayList;
import java.util.List;

public final class jN extends akN
{
  private static ArrayList aAG = new ArrayList();
  private boolean aMu;

  protected List kM()
  {
    return aAG;
  }

  public jN(ArrayList paramArrayList) {
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);

    return (localaxQ != null) && (localaxQ.aJr()) ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bBU;
  }

  static
  {
    aAG.add(new Pq[] { Pq.chu });
  }
}