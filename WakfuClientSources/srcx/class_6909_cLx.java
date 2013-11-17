import java.util.ArrayList;
import java.util.List;

public class cLx extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private String bUJ;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public cLx(ArrayList paramArrayList) {
    if (J(paramArrayList) == 1)
      this.bUJ = ((cic)paramArrayList.get(0)).getValue();
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    axQ localaxQ = aAw.a(this.bUJ, paramObject1, paramObject2, paramObject4, paramObject3);

    if (localaxQ == null)
      return -1L;
    return cDu() * localaxQ.Fx();
  }

  public Enum gm()
  {
    return Bz.bxH;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}