import java.util.ArrayList;
import java.util.List;

public class cpH extends akN
{
  private byte aHn;
  private boolean aMu = false;

  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean akL() {
    return this.aMu;
  }

  public cpH(ArrayList paramArrayList) {
    int i = u(paramArrayList);
    if (i == 1) {
      str = ((cic)paramArrayList.get(1)).getValue();
      if (str.equalsIgnoreCase("target"))
        this.aMu = true;
    }
    String str = ((cic)paramArrayList.get(0)).getValue();
    if (str.equalsIgnoreCase("Male"))
      this.aHn = 0;
    else
      this.aHn = 1;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null) {
      return -1;
    }
    if (localdhJ.xK() == this.aHn) {
      return 0;
    }
    return 1;
  }

  public Enum gm() {
    return Bz.byo;
  }

  public byte xK() {
    return this.aHn;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}