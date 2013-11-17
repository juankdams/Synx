import java.util.ArrayList;
import java.util.List;

public final class bZa extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private boolean cLk;

  public bZa(ArrayList paramArrayList)
  {
    this.cLk = ((J(paramArrayList) == 0) && (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target")));
  }

  protected List kM() {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.a(this.cLk, paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ == null) {
      return -1L;
    }
    return super.cDu() * localdhJ.afd();
  }

  public Enum gm() {
    return Bz.bAc;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}