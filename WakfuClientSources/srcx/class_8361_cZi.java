import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class cZi extends cIX
{
  private static ArrayList aAG = new ArrayList();

  public cZi(ArrayList paramArrayList)
  {
    J(paramArrayList);
  }

  protected ArrayList Vs() {
    return aAG;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject4 instanceof dMC)) {
      K.error("Le critere ne peut pas etre utilisé autre part que dans un contexte de combat");
      return -1L;
    }

    tl localtl = ((dMC)paramObject4).LH();
    if (localtl == null)
      return -1L;
    return localtl.AU();
  }

  public boolean pH() {
    return true;
  }

  public Enum gm() {
    return Bz.bCD;
  }

  static
  {
    aAG.add(new Pq[0]);
  }
}