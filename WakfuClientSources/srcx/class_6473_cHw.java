import java.util.ArrayList;
import java.util.List;

public class cHw extends cIX
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

  public cHw(ArrayList paramArrayList) {
    this.cLk = ((J(paramArrayList) == 0) && (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target")));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Object localObject = this.cLk ? paramObject2 : paramObject1;
    if (localObject != null) {
      int i = 0;
      if ((localObject instanceof dhJ)) {
        aid localaid = ((dhJ)localObject).boT();
        if (localaid != null)
          i = localaid.avd();
      } else if ((localObject instanceof aid)) {
        i = ((aid)localObject).avd();
      }
      return super.cDu() * i;
    }
    throw new aIh("On essaie de récupérer l'id de nation d'une cible invalide");
  }

  public Enum gm()
  {
    return Bz.bzu;
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