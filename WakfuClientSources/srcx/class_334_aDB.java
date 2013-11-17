import java.util.ArrayList;
import java.util.List;

public class aDB extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private boolean aMu;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public aDB(ArrayList paramArrayList) {
    this.aMu = ((J(paramArrayList) == 0) && (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target")));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Object localObject = this.aMu ? paramObject2 : paramObject1;
    if (localObject != null) {
      int i = 0;
      if ((localObject instanceof dhJ)) {
        i = ((dhJ)localObject).cJf().bP();
      }
      return super.cDu() * i;
    }
    throw new aIh("On essaie de récupérer l'id de nation d'une cible invalide");
  }

  public Enum gm()
  {
    return Bz.bzs;
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