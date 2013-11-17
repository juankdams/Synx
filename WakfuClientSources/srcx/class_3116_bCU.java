import java.util.ArrayList;
import java.util.List;

public class bCU extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw gxP;
  private aOw gxQ;

  protected List kM()
  {
    return aAG;
  }

  public bCU(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0) {
      this.gxQ = ((aOw)paramArrayList.get(0));
      this.gxP = null;
    }
    if (i == 1) {
      this.gxP = null;
      this.gxQ = null;
    }
    if (i == 2) {
      this.gxP = ((aOw)paramArrayList.get(1));
      this.gxQ = ((aOw)paramArrayList.get(0));
    }
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null)
      throw new aIh("On compte les monstres hors combat");
    short s = (short)(int)(this.gxP == null ? -1L : this.gxP.b(paramObject1, paramObject2, paramObject3, paramObject4));
    byte b = (byte)(int)(this.gxQ == null ? -1L : this.gxQ.b(paramObject1, paramObject2, paramObject3, paramObject4));
    long l = localdbE.g(s, b);
    return cDu() * l;
  }

  public Enum gm()
  {
    return Bz.bxD;
  }

  static
  {
    aAG.add(zT.bva);
    aAG.add(zT.buX);
    aAG.add(new Pq[] { Pq.chv, Pq.chv });
  }
}