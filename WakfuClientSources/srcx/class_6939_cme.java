import java.util.ArrayList;
import java.util.List;

public class cme extends akN
{
  private final clK ciJ;
  private static final ArrayList hRb = new ArrayList();

  public cme(ArrayList paramArrayList)
  {
    u(paramArrayList);
    String str = ((cic)paramArrayList.get(0)).getValue();

    this.ciJ = clK.valueOf(str);
  }

  protected List kM() {
    return hRb;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((dDE.dft().isSynchronized()) && (dDE.dft().abK() == this.ciJ)) {
      return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bxS;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    hRb.add(arrayOfPq);
  }
}