import java.util.ArrayList;
import java.util.List;

public class bBV extends akN
{
  private bHu gwg = new bHu();
  private boolean aMu = false;

  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public bHu bKM() {
    return this.gwg;
  }

  public boolean akL() {
    return this.aMu;
  }

  public bBV(ArrayList paramArrayList) {
    u(paramArrayList);
    int i = 0;
    for (dKY localdKY : paramArrayList)
    {
      if (i == 0) {
        String str = ((cic)localdKY).getValue();
        if (str.equalsIgnoreCase("target"))
          this.aMu = true;
        else if (str.equalsIgnoreCase("caster")) {
          this.aMu = false;
        }
        i = 1;
      } else {
        short s = (short)(int)((aOw)localdKY).b(null, null, null, null);
        this.gwg.add(s);
      }
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1;
    }
    if (this.gwg.contains(localaxQ.aJp().uO())) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.byz;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chx;
    aAG.add(arrayOfPq);
  }
}