import java.util.ArrayList;
import java.util.List;

public final class bFu extends cIX
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  protected List kM() {
    return aAG;
  }

  public bFu(ArrayList paramArrayList) {
    int i = J(paramArrayList);
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

  public Enum gm() {
    return Bz.bAW;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1L;
    }
    CG localCG = localdhJ.E();
    if (localCG == null) {
      return -1L;
    }
    return localCG.m_index;
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