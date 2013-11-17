import java.util.ArrayList;
import java.util.List;

public class cBU extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private boolean cLk;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public cBU(ArrayList paramArrayList) {
    this.cLk = ((J(paramArrayList) == 0) && (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target")));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((paramObject3 instanceof aij))
      return cDu() * ((aij)paramObject3).ZU().bJ();
    aid localaid;
    if ((paramObject1 instanceof aid)) {
      localaid = (aid)paramObject1;
    } else {
      axQ localaxQ = aAw.b(this.cLk, paramObject1, paramObject2, paramObject3, paramObject4);
      if (localaxQ == null)
        throw new aIh("On essaie de récupérer la satisfaction d'une cible qui n'est pas un protecteur");
      localaid = (localaxQ instanceof dhJ) ? ((dhJ)localaxQ).boT() : (aid)localaxQ;
    }

    int i = localaid != null ? localaid.ave().bJ() : 0;
    return cDu() * i;
  }

  public Enum gm() {
    return Bz.bzP;
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