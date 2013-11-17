import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class dpK extends aph
{
  private static ArrayList aAG = new ArrayList();
  private aOw lqB;
  private long lqC;

  protected List kM()
  {
    return aAG;
  }

  public dpK(ArrayList paramArrayList)
  {
    this.brd = ((aOw)paramArrayList.get(0));
    this.aMu = ((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target");
    this.lqB = ((aOw)paramArrayList.get(2));
  }

  protected Collection a(dbE paramdbE, axQ paramaxQ) {
    if (paramdbE == null)
      return Collections.emptyList();
    Collection localCollection = paramdbE.bgF();
    ArrayList localArrayList = new ArrayList();
    for (dhJ localdhJ : localCollection) {
      if (localdhJ.uO() == this.lqC)
        localArrayList.add(localdhJ);
    }
    return localArrayList;
  }

  protected void d(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    this.lqC = this.lqB.b(paramObject1, paramObject2, paramObject4, paramObject3);
  }

  public Enum gm()
  {
    return Bz.bBO;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[3];
    arrayOfPq[0] = Pq.chv;
    arrayOfPq[1] = Pq.chu;
    arrayOfPq[2] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}