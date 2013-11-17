import java.util.ArrayList;
import java.util.List;

public class cWo extends akN
{
  private static ArrayList aAG = new ArrayList();
  private aOw ecE;

  public cWo(ArrayList paramArrayList)
  {
    u(paramArrayList);
    this.ecE = ((aOw)paramArrayList.get(0));
  }

  public int Fh() {
    if ((this.ecE.sc()) && (this.ecE.pH())) {
      return (int)this.ecE.b(null, null, null, null);
    }
    return -1;
  }

  protected List kM() {
    return aAG;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (!(paramObject1 instanceof awJ)) {
      throw new aIh("On essaye d'accéder à l'historique de combat d'un objet qui n'en possède pas");
    }
    awJ localawJ = (awJ)paramObject1;

    int i = Fh();

    diR localdiR = localawJ.aIw();
    return localdiR.Ai(i) ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bBP;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chv;
    aAG.add(arrayOfPq);
  }
}