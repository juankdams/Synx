import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class dPk extends cIX
  implements azn
{
  private eu crd;
  private boolean aMu;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return false;
  }

  public dPk(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.crd = ZD.dU(((cic)paramArrayList.get(0)).getValue());
    if (i == 1) {
      this.crd = ZD.dU(((cic)paramArrayList.get(0)).getValue());
      if (((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target"))
        this.aMu = true;
      else
        this.aMu = false;
    }
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    double d = 0.0D;

    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1.0D;
    }
    if (localaxQ.b(this.crd)) {
      int i = localaxQ.e(this.crd);
      int j = localaxQ.g(this.crd);
      d = i / j * 100.0F;
      return super.cDu() * d;
    }
    K.error("Trying to get GetCharacteristicInPct for a character without this charac. Charac=" + this.crd + " criterionUser=" + paramObject1 + " criterionTarget=" + paramObject2 + " criterionContent=" + paramObject3);

    return -1.0D;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    throw new UnsupportedOperationException("Can't get Long value of a double");
  }

  public eu akK() {
    return this.crd;
  }

  public Enum gm() {
    return Bz.bxA;
  }

  public boolean akL() {
    return this.aMu;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}