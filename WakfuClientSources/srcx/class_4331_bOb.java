import java.util.ArrayList;
import java.util.List;

public class bOb extends akN
{
  private static final ArrayList aAG = new ArrayList();
  private boolean gTf;

  protected List kM()
  {
    return aAG;
  }

  public bOb(ArrayList paramArrayList)
  {
    if (u(paramArrayList) == 0) {
      cic localcic = (cic)paramArrayList.get(0);
      if (localcic.getValue().trim().equalsIgnoreCase("target"))
        this.gTf = true;
      else
        this.gTf = false;
    } else {
      this.gTf = false;
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.a(this.gTf, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null)
      return -1;
    if (!(localdhJ instanceof ajF)) {
      return -1;
    }
    NQ localNQ = ((ajF)localdhJ).awq();
    if (localNQ == null)
      return -1;
    int j;
    for (int i = 0; i < localNQ.aaa(); j = (byte)(i + 1)) {
      if (localNQ.aj(i) != null)
        return 0;
    }
    return -1;
  }

  public Enum gm() {
    return Bz.bxx;
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