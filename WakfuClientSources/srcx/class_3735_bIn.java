import java.util.ArrayList;
import java.util.List;

public class bIn extends cIX
{
  private aOw gHA;
  private static ArrayList aAG = new ArrayList();

  protected List kM()
  {
    return aAG;
  }

  public bIn(ArrayList paramArrayList) {
    J(paramArrayList);
    this.gHA = ((aOw)paramArrayList.get(0));
  }

  public int Uq() {
    if ((this.gHA.sc()) && (this.gHA.pH())) {
      return (int)this.gHA.b(null, null, null, null);
    }
    return -1;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if ((!(paramObject1 instanceof dhJ)) && (this.gHA.pH()))
      throw new aIh("Le user du critère n'est pas un personnage ou l'id n'est pas un entier");
    return super.cDu() * ((cyv)((dhJ)paramObject1).bGn().hh((int)this.gHA.b(paramObject1, paramObject2, paramObject3, paramObject4))).nU();
  }

  public Enum gm()
  {
    return Bz.bxE;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}