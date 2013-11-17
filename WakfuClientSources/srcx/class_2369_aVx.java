import java.util.ArrayList;

public class aVx extends aBr
{
  private aBr eXB;
  private aBr eXC;

  public Pq aNE()
  {
    return Pq.chx;
  }

  public Enum gm() {
    return apd.duT;
  }

  public cbQ g(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    cbQ localcbQ = this.eXB.g(paramObject1, paramObject2, paramObject3, paramObject4);
    localcbQ.o(this.eXC.g(paramObject1, paramObject2, paramObject3, paramObject4).cfv());
    return localcbQ;
  }

  public aVx(dKY paramdKY1, dKY paramdKY2)
  {
    ArrayList localArrayList;
    if (paramdKY1.aNE() == Pq.chx) {
      this.eXB = ((aBr)paramdKY1);
    } else if (paramdKY1.aNE() == Pq.chv) {
      localArrayList = new ArrayList();
      localArrayList.add((aOw)paramdKY1);
      this.eXB = new ctp(localArrayList);
    } else {
      throw new ddQ("On essaie de concatener deux objets qui ne sont pas des listes");
    }
    if (paramdKY2.aNE() == Pq.chx) {
      this.eXC = ((aBr)paramdKY2);
    } else if (paramdKY2.aNE() == Pq.chv) {
      localArrayList = new ArrayList();
      localArrayList.add((aOw)paramdKY2);
      this.eXC = new ctp(localArrayList);
    } else {
      throw new ddQ("On essaie de concatener deux objets qui ne sont pas des listes");
    }
  }

  public int getSize() {
    int i = this.eXB.getSize();
    if (i == -2147483648)
      return i;
    int j = this.eXC.getSize();
    if (j == -2147483648)
      return j;
    return i + j;
  }
}