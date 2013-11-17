import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class dRN extends cIX
  implements azn
{
  private eu cLj;
  private boolean cLk;
  private static ArrayList aAG = new ArrayList();

  public eu akK() {
    return this.cLj;
  }

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public dRN(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.cLj = ZD.dU(((cic)paramArrayList.get(0)).getValue());
    if (i == 1) {
      this.cLj = ZD.dU(((cic)paramArrayList.get(0)).getValue());
      if (((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target"))
        this.cLk = true;
      else
        this.cLk = false;
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    long l = 0L;

    axQ localaxQ = aAw.b(this.cLk, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null)
      return -1L;
    if (localaxQ.b(this.cLj))
    {
      l = localaxQ.g(this.cLj);
      return super.cDu() * l;
    }

    K.error("Trying to get GetCharacteristicMax for a character without this charac. Charac=" + this.cLj + " criterionUser=" + paramObject1 + " criterionTarget=" + paramObject2 + " criterionContent=" + paramObject3);
    return -1L;
  }

  public Enum gm()
  {
    return Bz.bzj;
  }

  public boolean akL() {
    return this.cLk;
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