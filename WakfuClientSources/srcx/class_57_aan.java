import java.util.ArrayList;
import java.util.List;

public final class aan extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw cOA;

  public aan()
  {
  }

  public aan(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.cOA = ((aOw)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public Enum gm() {
    return Bz.bBc;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    dhJ localdhJ = aAw.e(paramObject1, paramObject2, paramObject3, paramObject4);

    if ((localdhJ == null) || (!(localdhJ instanceof cTK))) {
      throw new aIh("Impossible de récupérer la cible du critère");
    }
    byte b = (byte)(int)this.cOA.b(paramObject1, paramObject2, paramObject3, paramObject4);
    dLC localdLC = dLC.fQ(b);
    return localdhJ.cJf().c(localdLC) ? 0 : -1;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}