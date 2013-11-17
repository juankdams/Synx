import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dkM extends akN
{
  private static final List aWC = Collections.singletonList(Pq.chC);

  public dkM(ArrayList paramArrayList) {
    u(paramArrayList);
  }

  protected List kM()
  {
    return aWC;
  }

  public int a(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    if (!(paramObject1 instanceof awJ)) {
      throw new aIh("On essaye d'accéder à l'historique de combat d'un objet qui n'en possède pas");
    }
    awJ localawJ = (awJ)paramObject1;
    diR localdiR = localawJ.aIw();
    return localdiR.cRG() ? 0 : -1;
  }

  public Enum gm()
  {
    return Bz.bBQ;
  }
}