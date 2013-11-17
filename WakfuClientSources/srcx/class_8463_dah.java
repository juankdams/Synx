import java.util.ArrayList;
import java.util.List;

public class dah extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private boolean kOX;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public dah(ArrayList paramArrayList)
  {
    int i = J(paramArrayList);
    if (i == 1) {
      if (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("hhmm"))
        this.kOX = true;
      else
        this.kOX = false;
    }
    else this.kOX = false; 
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dxL localdxL = dDE.dft().VN();
    if (this.kOX)
      return localdxL.getHours() * 100 + localdxL.getMinutes();
    return localdxL.getHours();
  }

  public Enum gm() {
    return Bz.bxB;
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