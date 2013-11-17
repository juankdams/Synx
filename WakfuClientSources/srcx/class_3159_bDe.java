import java.util.ArrayList;
import java.util.List;

public final class bDe extends cIX
{
  private boolean aMu;
  private static ArrayList aAG = new ArrayList();

  public bDe(ArrayList paramArrayList)
  {
    J(paramArrayList);
    if (((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target"))
      this.aMu = true;
    else
      this.aMu = false;
  }

  protected List kM() {
    return aAG;
  }

  public boolean pH() {
    return false;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    throw new UnsupportedOperationException("Can't get Long value of a double");
  }

  public double c(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    double d = 0.0D;

    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localaxQ == null) {
      return -1.0D;
    }
    eu localeu1 = eu.ayM;
    eu localeu2 = eu.aAj;
    int i = 0;
    int j = 0;
    if (localaxQ.b(localeu1)) {
      i = localaxQ.e(localeu1);
      j = localaxQ.g(localeu1);
    }

    if (localaxQ.b(localeu2)) {
      i += localaxQ.e(localeu2);
      j += localaxQ.g(localeu2);
    }

    if (j == 0) {
      return 0.0D;
    }
    d = i / j * 100.0F;
    return super.cDu() * d;
  }

  public Enum gm() {
    return Bz.bDe;
  }

  static
  {
    aAG.add(zT.buY);
  }
}