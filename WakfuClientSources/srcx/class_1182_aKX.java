import java.util.Collection;
import java.util.Iterator;

public class aKX extends cGj
{
  public static final String bC = "name";
  public static final String epm = "sourcesDescription";
  public static final String epn = "logFiltered";
  public static final String epo = "visible";
  public final String[] bF = { "name", "sourcesDescription" };
  private cpT epp;
  private boolean aYZ;
  private boolean epq;

  public aKX(bxU parambxU, cpT paramcpT)
  {
    this.epp = paramcpT;
    this.aYZ = (sa() > 0);
    this.epq = false;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.epp.name() + "(" + sa() + ")";
    if (paramString.equals("logFiltered"))
      return Boolean.valueOf(this.epq);
    if (paramString.equals("visible"))
      return Boolean.valueOf(this.aYZ);
    if (paramString.equals("sourcesDescription")) {
      lZ locallZ = new lZ();
      dJZ localdJZ = this.epp.cpd();
      if (localdJZ != null) {
        locallZ.tz().a("-Default- size=").bw(localdJZ.rZ().size()).tA().a("\n");
        for (localObject1 = localdJZ.rZ().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (ZG)((Iterator)localObject1).next();
          locallZ.a(((ZG)localObject2).getDescription()).a("\n");
        }
      }
      Object localObject1 = this.epp.cpe();
      if (localObject1 != null) {
        locallZ.tz().a("-Field- size=").bw(((kk)localObject1).sa()).tA().a("\n");
        locallZ.a(((kk)localObject1).sb()).a("\n");
      }
      Object localObject2 = this.epp.cpc();
      if (localObject2 != null) {
        ZG localZG = ((ciB)localObject2).ckk();
        locallZ.tz().a("-Music-").tA().a("\n");
        if (localZG != null)
          locallZ.a(localZG.getDescription()).a("\n");
      }
      return locallZ.tP();
    }
    return null;
  }

  public void dE(boolean paramBoolean) {
    this.epq = paramBoolean;
    dLE.doY().a(this, new String[] { "logFiltered" });
  }

  public byte bcI() {
    return this.epp.bcI();
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
    dLE.doY().a(this, new String[] { "visible" });
  }

  public int sa() {
    int i = 0;
    if (this.epp.cpd() != null)
      i += this.epp.cpd().rZ().size();
    if (this.epp.cpe() != null)
      i += this.epp.cpe().sa();
    return i;
  }
}