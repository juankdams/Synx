import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class acn extends duq
  implements dBv
{
  private static final acn cRB = new acn();
  public static final String cRC = "protectorSatisfactionColor";
  public static final String cRD = "protectorSatisfaction";
  private static final String[] bF = { "protectorSatisfactionColor", "protectorSatisfactionColor" };
  private dUx cRE;
  private int cRF = -1;

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("protectorSatisfactionColor"))
      return aoz();
    if (paramString.equals("protectorSatisfaction")) {
      return aoy();
    }
    return null;
  }

  public int aox() {
    int i = 0;
    for (Iterator localIterator = blo.bws().bwr().iterator(); localIterator.hasNext(); ) { localacy = (acy)localIterator.next();
      if (localacy.aoT())
        i++;
    }
    acy localacy;
    for (localIterator = dcK.cOf().cOe().iterator(); localIterator.hasNext(); ) { localacy = (acy)localIterator.next();
      if (localacy.aoT())
        i++;
    }
    return i;
  }

  private ArrayList aoy() {
    ArrayList localArrayList = new ArrayList();
    for (Iterator localIterator = blo.bws().bwr().iterator(); localIterator.hasNext(); ) { localacy = (acy)localIterator.next();
      if (localacy.aoT())
        localArrayList.add(Boolean.valueOf(localacy.aoU()));
    }
    acy localacy;
    for (localIterator = dcK.cOf().cOe().iterator(); localIterator.hasNext(); ) { localacy = (acy)localIterator.next();
      if (localacy.aoT())
        localArrayList.add(Boolean.valueOf(localacy.aoU()));
    }
    Collections.sort(localArrayList, new aHk(this));

    return localArrayList;
  }

  private bNa aoz() {
    ayn localayn = bWW.ccf().FB();
    if (localayn == null)
      return null;
    cIZ localcIZ = localayn.ave();
    if (localcIZ == null)
      return null;
    switch (aHm.ceo[localcIZ.ordinal()]) {
    case 1:
      return bNa.gRA;
    case 2:
      return bNa.gRx;
    case 3:
      return bNa.gRz;
    }

    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString)
  {
    return false;
  }

  public static acn aoA() {
    return cRB;
  }

  public void aoB() {
    dLE.doY().a(this, new String[] { "protectorSatisfactionColor" });
  }

  public void aoC() {
    dLE.doY().a(this, new String[] { "protectorSatisfactionColor", "protectorSatisfaction" });
  }

  public void hE(int paramInt)
  {
    this.cRF = paramInt;
  }

  public void a(dUx paramdUx) {
    this.cRE = paramdUx;
  }

  public uA aoD() {
    return this.cRE.Ef(this.cRF);
  }

  public float aoE() {
    return (blo.bws().aoS() + dcK.cOf().aoS()) / 2.0F;
  }
}