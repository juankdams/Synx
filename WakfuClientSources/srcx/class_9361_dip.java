import java.util.ArrayList;
import java.util.List;

public class dip extends cIX
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = true;
  private dKY lee;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public dip(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.aMu = false;
    if (i == 1) {
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
    }
    if (i == 2) {
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
      this.lee = ((dKY)paramArrayList.get(1));
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }

    boolean bool1 = paramObject4 instanceof dbE;
    boolean bool2 = paramObject4 instanceof dMC;
    if ((!bool1) && (!bool2)) {
      throw new aIh("On essaie de compter les invocations en dehors d'un combat...");
    }

    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null)
      return -1L;
    long l = a(localaxQ);
    return cDu() * l;
  }

  protected int a(axQ paramaxQ)
  {
    int i;
    if (this.lee == null)
      i = paramaxQ.aJt();
    else
      i = paramaxQ.kV((int)((aOw)this.lee).b(null, null, null, null));
    return i;
  }

  public Enum gm()
  {
    return Bz.bxU;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
    aAG.add(new Pq[] { Pq.chu, Pq.chv });
  }
}