import java.util.ArrayList;
import java.util.Collections;
import org.apache.log4j.Logger;

public class cYG extends cGj
  implements nc
{
  private static final Logger K = Logger.getLogger(cYG.class);
  public static final String cvZ = "guildName";
  public static final String kMd = "buildingList";
  public static final String kMe = "evolutingBuildingList";
  public static final String kMf = "buildingsOpenned";
  public static final String kMg = "evolutingBuildingsOpenned";
  public static final String kMh = "guildRank";
  public static final String kMi = "conquestRank";
  public static final String kMj = "havenWorldName";
  public static final String kMk = "exitInstanceName";
  public static final String kMl = "numBuildings";
  public static final String kMm = "kamasTotalCost";
  public static final String kMn = "resourcesTotalCost";
  public static final String kMo = "nextBuildingText";
  public static final String[] bF = { "guildName", "buildingList", "evolutingBuildingList", "buildingsOpenned", "evolutingBuildingsOpenned", "guildRank", "conquestRank", "havenWorldName", "kamasTotalCost", "resourcesTotalCost", "nextBuildingText" };
  private long kMp;
  private long gtz;
  private final String aQZ;
  private boolean kMq;
  private boolean kMr;
  private final ArrayList kMs = new ArrayList();
  private final ArrayList kMt = new ArrayList();
  private int eaX;
  private int eaY;
  private short az;

  public String[] getFields()
  {
    return bF;
  }

  public cYG(short paramShort, String paramString, ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    this(paramString, paramArrayList);
    this.az = paramShort;
    this.eaX = paramInt1;
    this.eaY = paramInt2;
  }

  public cYG(String paramString, ArrayList paramArrayList) {
    this.aQZ = paramString;
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bSw()) {
      bMG localbMG = localbyz.bSt();
      brW localbrW = ars.dzL.jG(localbMG.CF());
      this.az = (localbrW == null ? 0 : localbrW.arI());
    }
    ad(paramArrayList);
    this.kMq = true;
    bXT.hnW.a(this);
  }

  private void ad(ArrayList paramArrayList) {
    for (cuF localcuF : paramArrayList) {
      boU localboU = dfX.laF.jG(localcuF.EN());

      cUh localcUh = localcuF.adj();

      bzt localbzt = new bzt(localcUh.nc());
      ars.dzL.w(localbzt);
      this.kMp += localbzt.bIg();
      this.gtz += localbzt.bIh();

      if (!localcUh.aTC())
      {
        if (aDF.g(localcUh) == aAb.dSs)
          this.kMs.add(localboU);
        else
          this.kMt.add(localboU);
      }
    }
    Collections.sort(this.kMt, new dIY(this));
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("guildName")) {
      return (this.aQZ != null) && (this.aQZ.length() > 0) ? this.aQZ : bU.fH().getString("noOwner");
    }
    if (paramString.equals("buildingList")) {
      return this.kMs;
    }
    if (paramString.equals("buildingsOpenned")) {
      return Boolean.valueOf((this.kMq) && (this.kMs.size() > 0));
    }
    if (paramString.equals("evolutingBuildingList")) {
      return this.kMt;
    }
    if (paramString.equals("evolutingBuildingsOpenned")) {
      return Boolean.valueOf((this.kMr) && (this.kMt.size() > 0));
    }
    if (paramString.equals("guildRank")) {
      return Integer.valueOf(this.eaX);
    }
    if (paramString.equals("conquestRank")) {
      return Integer.valueOf(this.eaY);
    }
    if (paramString.equals("havenWorldName"))
      return bU.fH().b(77, this.az, new Object[0]);
    Object localObject;
    if (paramString.equals("exitInstanceName")) {
      localObject = ars.dzL.aL(this.az);
      if (localObject != null) {
        return bU.fH().b(77, ((brW)localObject).bAp(), new Object[0]);
      }
      return null;
    }
    if (paramString.equals("numBuildings")) {
      return Integer.valueOf(this.kMt.size() + this.kMs.size());
    }
    if (paramString.equals("kamasTotalCost")) {
      return bU.fH().iK(this.kMp);
    }
    if (paramString.equals("resourcesTotalCost")) {
      return bU.fH().iK(this.gtz);
    }
    if (paramString.equals("nextBuildingText")) {
      if (this.kMt.isEmpty()) {
        return bU.fH().getString("none");
      }
      localObject = (boU)this.kMt.get(0);
      cUh localcUh1 = ((boU)localObject).byD().bdb();
      cUh localcUh2 = aDF.e(localcUh1);
      if (localcUh2 == null) {
        K.error("pas de batiment pour " + localcUh1.nc());
        return null;
      }
      String str = bU.fH().b(126, localcUh2.nc(), new Object[0]);
      return bU.fH().getString("havenWorld.nextBuildingRemainingTime", new Object[] { str, ((boU)localObject).eZ(false) });
    }

    return null;
  }

  public boolean cLW() {
    return this.kMq;
  }

  public boolean cLX() {
    return this.kMr;
  }

  public void iQ(boolean paramBoolean) {
    this.kMq = paramBoolean;
    dLE.doY().a(this, new String[] { "buildingsOpenned" });
  }

  public void iR(boolean paramBoolean) {
    this.kMr = paramBoolean;
    dLE.doY().a(this, new String[] { "evolutingBuildingsOpenned" });
  }

  public void uD() {
    dLE.doY().a(this, new String[] { "nextBuildingText" });
  }

  public void byC() {
    bXT.hnW.b(this);
  }
}