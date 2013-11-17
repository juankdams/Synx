import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pR extends cIX
{
  private static final List aWC = new ArrayList();
  private aOw aWD;

  protected List kM()
  {
    return Collections.unmodifiableList(aWC);
  }

  public boolean pH()
  {
    return true;
  }

  public pR(List paramList) {
    J(paramList);
    if (paramList.size() == 1)
      this.aWD = ((aOw)paramList.get(0));
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i = (int)this.aWD.b(paramObject1, paramObject2, paramObject3, paramObject4);

    dmn localdmn = dsh.luB.cgk();
    while (localdmn.hasNext()) {
      localdmn.fl();
      aYr localaYr = (aYr)localdmn.value();

      n localn = localaYr.aMO();
      bkQ localbkQ = localn.b(i);
      if (localbkQ != null) {
        return cDu() * localaYr.bP();
      }
    }
    throw new aIh("protecteur non trouvé dans le NationManager : protectorId=" + i);
  }

  public Enum gm()
  {
    return Bz.bCj;
  }

  public String toString()
  {
    return "GetProtectorNationId{m_protectorId=" + this.aWD + '}';
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aWC.add(arrayOfPq);
  }
}