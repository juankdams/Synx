import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class cyH extends akN
{
  private static ArrayList aAG = new ArrayList();

  private boolean aMu = false;

  protected List kM()
  {
    return aAG;
  }

  public cyH(ArrayList paramArrayList) {
    u(paramArrayList);
    this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    dhJ localdhJ = aAw.a(false, paramObject1, paramObject2, paramObject4, paramObject3);

    if (localdhJ == null) {
      return -1;
    }
    dbE localdbE = aAw.ah(paramObject4);
    if (localdbE == null) {
      return -1;
    }
    cYk localcYk = null;

    Collection localCollection = localdbE.LC().bbj();
    Object localObject = null;
    for (cjK localcjK : localCollection) {
      if ((localcjK.getType() == xj.bpz.xj()) && (localcjK.axG() == localdhJ)) {
        localObject = localcjK;
        break;
      }
    }

    if (localObject == null) {
      return -1;
    }
    if (this.aMu) {
      if ((paramObject2 instanceof dhJ))
        localcYk = ((dhJ)paramObject2).aKb();
      else if ((paramObject2 instanceof cYk)) {
        localcYk = (cYk)paramObject2;
      }
      if (localcYk == null)
        return 0;
    } else {
      localcYk = localdhJ.ML();
    }

    if ((localObject.fa() == localcYk.getX() + 1) && (localObject.fb() == localcYk.getY()))
      return 0;
    if ((localObject.fa() == localcYk.getX() - 1) && (localObject.fb() == localcYk.getY()))
      return 0;
    if ((localObject.fa() == localcYk.getX()) && (localObject.fb() == localcYk.getY() + 1))
      return 0;
    if ((localObject.fa() == localcYk.getX()) && (localObject.fb() == localcYk.getY() - 1))
      return 0;
    if ((localObject.fa() == localcYk.getX() + 1) && (localObject.fb() == localcYk.getY() + 1))
      return 0;
    if ((localObject.fa() == localcYk.getX() + 1) && (localObject.fb() == localcYk.getY() - 1))
      return 0;
    if ((localObject.fa() == localcYk.getX() - 1) && (localObject.fb() == localcYk.getY() + 1))
      return 0;
    if ((localObject.fa() == localcYk.getX() - 1) && (localObject.fb() == localcYk.getY() - 1))
      return 0;
    return -1;
  }

  public Enum gm() {
    return Bz.bAN;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}