import java.util.ArrayList;
import java.util.List;

public class ctS extends akN
{
  private static ArrayList aAG = new ArrayList();
  private List iea;

  protected List kM()
  {
    return aAG;
  }

  public ctS(ArrayList paramArrayList)
  {
    if (u(paramArrayList) == 0)
    {
      this.iea = new ArrayList();
      for (dKY localdKY : paramArrayList) {
        aOw localaOw = (aOw)localdKY;
        this.iea.add(localaOw);
      }
    }
  }

  public ctS() {
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramObject1 == null)
      return -1;
    if (!(paramObject1 instanceof dhJ))
      return -1;
    bZH localbZH = ((dhJ)paramObject1).ayJ();
    if (localbZH == null)
      return -1;
    try {
      if (a(paramObject1, paramObject2, paramObject3, paramObject4, localbZH, azO.dRM.bJ()))
        return 0;
      if (a(paramObject1, paramObject2, paramObject3, paramObject4, localbZH, azO.dRN.bJ()))
        return 0;
    } catch (Exception localException) {
      return -1;
    }
    return -1;
  }

  private boolean a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, bZH parambZH, byte paramByte) {
    gA localgA = (gA)parambZH.dB((short)paramByte);
    if (localgA == null)
      return false;
    if (localgA.oi() == null)
      return false;
    if (b(localgA.oi().bKn(), paramObject1, paramObject2, paramObject3, paramObject4))
      return true;
    return false;
  }

  private boolean b(ge paramge, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    ge localge = paramge;
    while (localge != null) {
      for (int i = 0; i < this.iea.size(); i = (byte)(i + 1)) {
        if ((short)(int)((aOw)this.iea.get(i)).b(paramObject1, paramObject2, paramObject3, paramObject4) == localge.nc())
          return true;
      }
      localge = localge.ne();
    }
    return false;
  }

  public Enum gm() {
    return Bz.bxM;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chx;
    aAG.add(arrayOfPq);
  }
}