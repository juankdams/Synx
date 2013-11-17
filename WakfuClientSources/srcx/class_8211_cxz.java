import java.util.ArrayList;
import java.util.List;

public class cxz extends akN
{
  private cSi ilz = new cSi();
  private boolean aMu = false;

  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public cSi cuR() {
    return this.ilz;
  }

  public boolean akL() {
    return this.aMu;
  }

  public cxz(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 0) {
      String str = ((cic)paramArrayList.get(0)).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
      else if (str.equalsIgnoreCase("caster")) {
        this.aMu = false;
      }
    }
    for (int j = i == 0 ? 1 : 0; j < paramArrayList.size(); j++) {
      int k = (int)((aOw)paramArrayList.get(j)).b(null, null, null, null);
      this.ilz.add(k);
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    bhh localbhh = localdhJ.aJp();
    if (((localbhh instanceof dGf)) && (this.ilz.contains(((dGf)localbhh).nn()))) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.byP;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chx;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chx;
    aAG.add(arrayOfPq);
  }
}