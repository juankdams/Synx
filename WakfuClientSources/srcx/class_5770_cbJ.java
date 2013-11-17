import java.util.ArrayList;
import java.util.List;

public class cbJ extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public cbJ(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 1)
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    return (localaxQ != null) && (localaxQ.aJu()) ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bBx;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}