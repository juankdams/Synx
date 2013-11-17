import java.util.ArrayList;
import java.util.List;

public class ceY extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private bby hzR;

  protected List kM()
  {
    return aAG;
  }

  public ceY(ArrayList paramArrayList) {
    if (J(paramArrayList) == 0)
      this.hzR = (paramArrayList.size() == 0 ? bby.fkJ : bby.valueOf(((cic)paramArrayList.get(0)).getValue().toUpperCase()));
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    long l;
    switch (aHj.eeT[this.hzR.ordinal()]) {
    case 1:
      if ((paramObject1 == null) || (!(paramObject1 instanceof axQ)))
        throw new aIh("Le User du critère n'est pas un CriterionUser");
      l = ((axQ)paramObject1).getId();
      break;
    case 2:
      if ((paramObject2 == null) || (!(paramObject2 instanceof axQ)))
        throw new aIh("La target du critère n'est pas un CriterionUser");
      l = ((axQ)paramObject2).getId();
      break;
    default:
      throw new aIh("Impossible de définir la cible du critère");
    }

    return super.cDu() * l;
  }

  public Enum gm() {
    return Bz.byf;
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