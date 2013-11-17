import java.util.ArrayList;
import java.util.List;

public class cCJ extends cIX
{
  private aOw ecE;
  private static ArrayList aAG = new ArrayList();

  public int Fh()
  {
    if ((this.ecE != null) && (this.ecE.sc()) && (this.ecE.pH())) {
      return (int)this.ecE.b(null, null, null, null);
    }
    return -1;
  }

  protected List kM()
  {
    return aAG;
  }

  public cCJ(ArrayList paramArrayList) {
    J(paramArrayList);
    if (paramArrayList.size() == 1)
      this.ecE = ((aOw)paramArrayList.get(0));
    else
      this.ecE = null;
  }

  public boolean pH()
  {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    bfE localbfE = null;
    if ((this.ecE == null) && ((paramObject3 instanceof bfE))) {
      localbfE = (bfE)paramObject3;
    } else {
      if (!(paramObject1 instanceof dhJ)) {
        throw new aIh("Le user du critère n'est pas un personnage ou l'id n'est pas un entier");
      }
      dCi localdCi = ((dhJ)paramObject1).auK();
      if (localdCi == null) {
        return 0L;
      }
      localbfE = (bfE)localdCi.hh((int)this.ecE.b(paramObject1, paramObject2, paramObject3, paramObject4));
    }

    if (localbfE != null) {
      return super.cDu() * localbfE.nU();
    }
    return 0L;
  }

  public Enum gm()
  {
    return Bz.bxG;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[0];
    aAG.add(arrayOfPq);
  }
}