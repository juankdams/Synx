import java.util.ArrayList;
import java.util.List;

public class dfh extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw kZj;

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public dfh(ArrayList paramArrayList) {
    this.kZj = ((aOw)paramArrayList.get(0));
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    short s = (short)(int)this.kZj.b(paramObject1, paramObject2, paramObject3, paramObject4);

    Object localObject1 = paramObject1;
    if (localObject1 != null) {
      int i = 0;
      if ((localObject1 instanceof dhJ)) {
        localObject2 = ((dhJ)localObject1).boT();
        if (localObject2 != null)
          i = ((aid)localObject2).avc();
      }
      else if ((localObject1 instanceof aid)) {
        i = ((aid)localObject1).avc();
      }

      Object localObject2 = aHf.eeF.be(s);
      if (localObject2 == null) {
        return -1;
      }
      if (((cPc)localObject2).cGs().isEmpty()) {
        return -1;
      }
      aEW localaEW = ((cPc)localObject2).cGx();
      if (localaEW == null) {
        return -1;
      }
      dQa localdQa = (dQa)localaEW.aRy().get(0);
      return localdQa.bP() == i ? 0 : -1;
    }
    throw new aIh("On essaie de récupérer la un résultat de nation dans un ladder sur une cible qui n'est pas un protecteur");
  }

  public Enum gm()
  {
    return Bz.bBL;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}