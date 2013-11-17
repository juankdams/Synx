import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Nf extends akN
{
  private static final Logger K = Logger.getLogger(Nf.class);

  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public Nf(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  public Nf()
  {
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    int i;
    if ((paramObject1 instanceof aid))
      i = ((aid)paramObject1).avb().getId();
    else if ((paramObject1 instanceof dhJ))
      i = ((dhJ)paramObject1).afd();
    else {
      throw new aIh("Impossible de récupérer le territoire");
    }

    if (bnk.fFX.contains(i)) {
      return -1;
    }
    bGI localbGI = QI.cpK.gq(i);
    if (localbGI == null)
    {
      return -1;
    }

    aLl localaLl = localbGI.bOz();
    if (localaLl == null) {
      return -1;
    }
    return localaLl.CC() ? 0 : -1;
  }

  public Enum gm() {
    return Bz.bCl;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}