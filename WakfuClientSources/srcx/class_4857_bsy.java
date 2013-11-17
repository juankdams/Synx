import java.util.ArrayList;
import java.util.List;

public class bsy extends cIX
{
  private boolean aMu = false;

  private static ArrayList aAG = new ArrayList();

  public bsy(ArrayList paramArrayList)
  {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.aMu = false;
    if (i == 1)
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  protected List kM()
  {
    return aAG;
  }

  public boolean akL()
  {
    return this.aMu;
  }

  public Enum gm()
  {
    return Bz.bzi;
  }

  public boolean pH() {
    return false;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.a(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null)
      return -1L;
    long l = ()(localdhJ.JK() * 100.0F);
    return super.cDu() * l;
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