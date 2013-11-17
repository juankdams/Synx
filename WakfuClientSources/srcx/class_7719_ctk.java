import java.util.ArrayList;
import java.util.List;

public class ctk extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public ctk(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 1)
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null)
      return -1;
    return localaxQ.a(afC.cYy) ? 0 : -1;
  }

  public Enum gm() {
    return Bz.bCe;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}