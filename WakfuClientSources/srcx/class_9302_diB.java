import java.util.ArrayList;
import java.util.List;

public class diB extends akN
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

  public diB(ArrayList paramArrayList) {
    u(paramArrayList);
    for (dKY localdKY : paramArrayList) {
      String str = ((cic)localdKY).getValue();
      if (str.equalsIgnoreCase("target")) {
        this.aMu = true;
      }
      else if (str.equalsIgnoreCase("caster")) {
        this.aMu = false;
      }
      else {
        SB localSB = SB.dy(str);
        if (localSB != null)
          this.gwg.add(localSB.uO()); 
      }
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) { dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    if (this.gwg.contains(localdhJ.aJp().uO())) {
      return 0;
    }
    return -1; }

  public Enum gm()
  {
    return Bz.bxN;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chy;
    aAG.add(arrayOfPq);
  }
}