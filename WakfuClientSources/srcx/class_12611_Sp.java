import java.util.ArrayList;
import java.util.List;

public class Sp extends akN
{
  private cSi csg = new cSi();

  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public cSi adn() {
    return this.csg;
  }

  public Sp(ArrayList paramArrayList) {
    u(paramArrayList);
    for (dKY localdKY : paramArrayList) {
      int i = (int)((aOw)localdKY).b(null, null, null, null);
      this.csg.add(i);
    }
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    Object localObject = paramObject1;
    if (!(localObject instanceof duL)) {
      throw new aIh("On essaie de récupérer la présence d'un challenge sur une cible invalide");
    }
    duL localduL = (duL)localObject;
    for (int k : this.csg.cIf()) {
      if (!localduL.ry(k))
        return -1;
    }
    return 0;
  }

  public Enum gm() {
    return Bz.byR;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chx;
    aAG.add(arrayOfPq);
  }
}