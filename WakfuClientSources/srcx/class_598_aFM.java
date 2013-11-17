import java.util.ArrayList;
import java.util.List;

public final class aFM extends cIX
{
  private static ArrayList aAG = new ArrayList();
  private aOw ecE;

  public aFM()
  {
  }

  public aFM(ArrayList paramArrayList)
  {
    J(paramArrayList);
    this.ecE = ((aOw)paramArrayList.get(0));
  }

  protected List kM()
  {
    return aAG;
  }

  public Enum gm() {
    return Bz.bBR;
  }

  public boolean pH() {
    return true;
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject1 instanceof awJ)) {
      throw new aIh("On essaye d'accéder à l'historique de combat d'un objet qui n'en possède pas");
    }
    int i = (int)this.ecE.b(paramObject1, paramObject2, paramObject3, paramObject4);
    awJ localawJ = (awJ)paramObject1;
    diR localdiR = localawJ.aIw();
    return localdiR.Aj(i);
  }

  static
  {
    aAG.add(new Pq[] { Pq.chv });
  }
}