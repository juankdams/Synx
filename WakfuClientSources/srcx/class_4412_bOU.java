import java.util.ArrayList;

public class bOU
{
  public static final bOU gUc = new bOU();

  private final cSR gUd = new cSR();
  private final cSR gUe = new cSR();

  public void b(ayJ paramayJ) {
    int i = paramayJ.aKH();

    ArrayList localArrayList = (ArrayList)this.gUe.get(i);
    if (localArrayList == null) {
      localArrayList = new ArrayList();
      this.gUe.put(i, localArrayList);
    }

    localArrayList.add(paramayJ);
    this.gUd.put(paramayJ.getId(), paramayJ);
  }

  public void b(aAM paramaAM) {
    int i = paramaAM.getId();
    String[] arrayOfString1 = paramaAM.mo();

    ArrayList localArrayList = (ArrayList)this.gUe.get(i);
    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return;
    }
    int j = 0; for (int k = localArrayList.size(); j < k; j++) {
      ayJ localayJ = (ayJ)localArrayList.get(j);
      String[] arrayOfString2 = localayJ.aKI();
      if ((localayJ.isActive()) && (b(arrayOfString1, arrayOfString2)))
        localayJ.a(paramaAM);
    }
  }

  public ayJ tG(int paramInt) {
    return (ayJ)this.gUd.get(paramInt);
  }

  private boolean b(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    if ((paramArrayOfString1 == null) || (paramArrayOfString2 == null) || (paramArrayOfString1.length == 0) || (paramArrayOfString2.length == 0))
    {
      return true;
    }
    for (int i = 0; i < paramArrayOfString2.length; i++) {
      if ((paramArrayOfString1[i] != null) && (paramArrayOfString2[i] != null) && (!paramArrayOfString1[i].equals(paramArrayOfString2[i]))) {
        return false;
      }
    }
    return true;
  }

  public void initialize() {
    cBQ.cxL().a(dGv.lQZ);
    cBQ.cxL().a(dGv.lQZ);
  }

  public void aKL() {
    this.gUd.s(new Ga(this));
  }
}