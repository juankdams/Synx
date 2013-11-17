import java.util.ArrayList;
import java.util.List;

public final class JL extends akN
{
  private static ArrayList aAG = new ArrayList();
  private String bUJ;

  public JL(ArrayList paramArrayList)
  {
    int i = u(paramArrayList);
    this.bUJ = "target";
    if (i == 1)
      this.bUJ = ((cic)paramArrayList.get(0)).getValue();
  }

  protected List kM()
  {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.a(this.bUJ, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null)
      return -1;
    return localaxQ.a(afC.cYz) ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bCM;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}