import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class aiK extends cIX
{
  private static ArrayList aAG = new ArrayList();

  private boolean cLk = true;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH()
  {
    return true;
  }

  public aiK(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.cLk = false;
    if (i == 1)
      this.cLk = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }

    boolean bool1 = paramObject4 instanceof dbE;
    boolean bool2 = paramObject4 instanceof dMC;
    if ((!bool1) && (!bool2)) {
      throw new aIh("On essaie de compter les invocations en dehors d'un combat...");
    }

    if (!(paramObject1 instanceof dhJ)) {
      throw new aIh("On essaie de compter les invocations d'un caster qui n'est pas un perso");
    }
    dhJ localdhJ = aAw.a(this.cLk, paramObject1, paramObject2, paramObject4, paramObject3);
    if (localdhJ == null)
      return -1L;
    aPH localaPH = localdhJ.afv();
    if (localaPH == null)
      return 0L;
    int i = 0;
    Collection localCollection = localaPH.bbj();
    for (cjK localcjK : localCollection) {
      if (localcjK.axG() == localdhJ)
      {
        if ((localcjK instanceof awr))
          i++;
      }
    }
    return super.cDu() * i;
  }

  public Enum gm() {
    return Bz.bBs;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}