import java.util.ArrayList;
import java.util.List;

public class dQB extends cIX
{
  private boolean aMu;
  private boolean mkT;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public dQB(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 1) {
      String str = ((cic)paramArrayList.get(0)).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
      else
        this.aMu = false;
      if (str.equals("eventTarget"))
        this.mkT = true;
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (this.mkT)
    {
      if ((paramObject4 instanceof LA))
        localObject = ((LA)paramObject4).Wc();
      else if ((paramObject3 instanceof LA))
        localObject = ((LA)paramObject3).Wc();
      else {
        return -1L;
      }
      if (!(localObject instanceof dhJ)) {
        return -1L;
      }
      return cDu() * ((dhJ)localObject).nU();
    }

    Object localObject = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localObject == null) {
      return -1L;
    }
    long l = ((dhJ)localObject).nU();
    return cDu() * l;
  }

  public Enum gm()
  {
    return Bz.byO;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}