import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class bcV extends cIX
{
  private static ArrayList aAG = new ArrayList();
  boolean aMu;

  protected List kM()
  {
    return aAG;
  }

  bcV() {
  }

  public bcV(ArrayList paramArrayList) {
    J(paramArrayList);
    if (paramArrayList.size() == 1)
      this.aMu = ((cic)paramArrayList.get(0)).getValue().equalsIgnoreCase("target");
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (paramObject4 == null) {
      throw new aIh("Pas de contexte...");
    }
    boolean bool1 = paramObject4 instanceof dbE;
    boolean bool2 = paramObject4 instanceof dMC;
    if ((!bool1) && (!bool2)) {
      throw new aIh("On essaie de compter les fighters en dehors d'un combat...");
    }

    if (!(paramObject1 instanceof axQ))
      throw new aIh("On essaie de compter les fighters d'un caster qui n'est pas un perso");
    dbE localdbE;
    if (bool1)
      localdbE = (dbE)paramObject4;
    else {
      localdbE = ((dMC)paramObject4).dps();
    }
    if (localdbE == null) {
      return 0L;
    }
    axQ localaxQ = aAw.b(this.aMu, paramObject1, paramObject2, paramObject4, paramObject3);
    return localdbE.cj(localaxQ.Fx()).size();
  }

  public Enum gm() {
    return Bz.bDg;
  }

  static
  {
    aAG.add(zT.buX);
    aAG.add(zT.buY);
  }
}