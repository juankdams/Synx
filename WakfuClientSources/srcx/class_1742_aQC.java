import java.util.ArrayList;
import java.util.Collections;

public class aQC
{
  private static final aQC eNq = new aQC();

  private final Xg eNr = new Xg();
  private Zp[] eNs;

  public static aQC bhe()
  {
    return eNq;
  }

  private static SB[] bhf() {
    return bNl.bVa();
  }

  private static SB[] bhg() {
    return bNl.bVa();
  }

  public final void initialize() {
    this.eNs = null;
    this.eNr.clear();
    for (SB localSB : bhf()) {
      Zp localZp = new Zp(localSB);
      this.eNr.put(localSB.uO(), localZp);
    }
  }

  public final Zp nx(int paramInt) {
    return (Zp)this.eNr.get(paramInt);
  }

  public final Zp[] bhh()
  {
    if (this.eNs == null) {
      ArrayList localArrayList = new ArrayList();
      int i = 0; for (int j = this.eNr.size(); i < j; i++) {
        Zp localZp = (Zp)this.eNr.hc(i);
        if ((localZp.aii() != SB.cty) && (localZp.aii() != SB.ctz)) {
          localArrayList.add(localZp);
        }
      }
      Collections.sort(localArrayList);
      this.eNs = ((Zp[])localArrayList.toArray(new Zp[localArrayList.size()]));
    }
    return this.eNs;
  }

  public final SB bhi() {
    return bhg()[bCO.sf(bhg().length)];
  }
}