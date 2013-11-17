import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iX extends cIX
{
  private aOw aJB;
  private static ArrayList aAG = new ArrayList();

  public int qX()
  {
    if ((this.aJB.sc()) && (this.aJB.pH())) {
      return (int)this.aJB.b(null, null, null, null);
    }
    return -1;
  }

  protected List kM()
  {
    return aAG;
  }

  public iX(ArrayList paramArrayList) {
    J(paramArrayList);
    this.aJB = ((aOw)paramArrayList.get(0));
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!this.aJB.pH())
      throw new aIh("L'id n'est pas un entier");
    int i = qX();
    Object localObject1;
    if ((paramObject1 instanceof dhJ))
      localObject1 = ((dhJ)paramObject1).auK();
    else if ((paramObject1 instanceof Iterable))
      localObject1 = (Iterable)paramObject1;
    else {
      throw new aIh("CriterionUser is neither a BasicCharacterInfo nor a SpellInventory");
    }
    int j = 0;

    for (Iterator localIterator = ((Iterable)localObject1).iterator(); localIterator.hasNext(); ) { Object localObject2 = localIterator.next();
      if (!(localObject2 instanceof bfE))
        throw new aIh("Inventory is not a spell inventory");
      bfE localbfE = (bfE)localObject2;
      if (localbfE.bsL().bHU() == i) {
        j += localbfE.nU();
      }
    }

    return super.cDu() * j;
  }

  public Enum gm() {
    return Bz.byi;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}