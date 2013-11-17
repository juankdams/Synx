import java.util.ArrayList;
import java.util.List;

public final class dAl extends akN
{
  private boolean aMu = false;

  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public dAl(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    switch (i) {
    case 0:
      this.aMu = false;
      break;
    case 1:
      String str = ((cic)paramArrayList.get(0)).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
      break;
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    if (localdhJ.cLK()) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bAQ;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}