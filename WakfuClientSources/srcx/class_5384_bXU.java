import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class bXU extends bJC
  implements dxY
{
  private static Logger K = Logger.getLogger(bXU.class);
  boolean aSN;
  boolean bKS;
  int aSg;
  public static final String hnX = "showInTimeline";
  public static final String bC = "name";
  public static final String bHI = "nameAndLevel";
  public static final String fNK = "tableTurnDuration";
  public static final String bka = "duration";
  public static final String RH = "iconUrl";
  public static final String RI = "description";
  public static final String ghp = "effectDescription";
  public static final String hnY = "isCumulable";
  public static final String bsP = "level";
  public static final String bHK = "levelValue";
  public static final String ghq = "maxLevelValue";
  public static final String gho = "nameWithFormat";
  public static final String[] bF = { "name", "nameAndLevel", "tableTurnDuration", "duration", "iconUrl", "showInTimeline", "description", "effectDescription", "isCumulable", "level", "nameWithFormat", "levelValue", "maxLevelValue" };

  public bXU cT(short paramShort)
  {
    bXU localbXU = new bXU();
    a(paramShort, localbXU);
    return localbXU;
  }

  public void cb(short paramShort) {
    this.cZu = ((short)Math.min(paramShort, this.gLa));
    dLE.doY().a(this, bF);
  }

  protected void a(short paramShort, bXU parambXU) {
    super.a(paramShort, parambXU);
    parambXU.aSg = this.aSg;
    parambXU.aSN = this.aSN;
    parambXU.bKS = this.bKS;
    if ((this.gLn != null) && (!this.gLn.isEmpty()))
      parambXU.gLn = new ArrayList(this.gLn);
  }

  public void c(String paramString, Object paramObject) {
  }

  public String cdi() {
    String str = "";
    switch (bUE.hgy[ZY.aC(this.bKO).ordinal()]) {
    case 1:
      str = cxg.ijY.getColor().bUV();
      break;
    case 2:
      str = bNa.gRx.bUV();
      break;
    case 3:
      str = cxg.ijT.getColor().bUV();
    }

    return new lZ().tI().am(str).a(getName()).tJ().tP();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equalsIgnoreCase("name")) {
      return getName(14);
    }
    if (paramString.equalsIgnoreCase("nameWithFormat")) {
      return cdi();
    }
    if (paramString.equalsIgnoreCase("nameAndLevel")) {
      return cdj();
    }
    if (paramString.equalsIgnoreCase("duration")) {
      return Integer.valueOf(bdm());
    }

    if (paramString.equalsIgnoreCase("tableTurnDuration")) {
      return Integer.valueOf(bdm());
    }
    if (paramString.equalsIgnoreCase("iconUrl")) {
      return fJ();
    }
    if (paramString.equalsIgnoreCase("showInTimeline")) {
      return Boolean.valueOf(cdl());
    }

    if (paramString.equals("description")) {
      return getDescription();
    }

    if (paramString.equals("effectDescription")) {
      return cxo.a(new chR(this, cMx.krP));
    }

    if (paramString.equals("isCumulable")) {
      return Boolean.valueOf(NW());
    }

    if (paramString.equals("level")) {
      return bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(nU()) });
    }

    if (paramString.equals("levelValue"))
      return Short.valueOf(this.cZu);
    if (paramString.equals("maxLevelValue")) {
      return Short.valueOf(bEt());
    }
    return null;
  }

  public short bEt() {
    if (this.gLa <= 0) {
      return 200;
    }
    return this.gLa;
  }

  public String getDescription()
  {
    return bU.fH().b(9, bQW(), new Object[0]);
  }

  private String cdj() {
    String str = getName(14);
    short s = nU();
    if (s == 1)
      return str;
    return str + " (" + bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(s) }) + ")";
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject) {
  }

  public void a(String paramString, Object paramObject) {
  }

  public String getName() {
    return getName(-1);
  }

  public String getName(int paramInt) {
    String str = bU.fH().b(8, bQW(), new Object[0]);
    str = bU.c(str, paramInt);

    return str;
  }

  public String cdk() {
    return bU.fH().b(8, bQW(), new Object[0]);
  }

  public String fJ() {
    try {
      return String.format(ay.bd().getString("statesIconsPath"), new Object[] { Integer.valueOf(this.aSg) });
    } catch (bdh localbdh) {
      K.error("PropertyException pendant l'accès à l'url de l'icone de l'état " + bQW());
    }return null;
  }

  public boolean cdl()
  {
    return this.aSN;
  }

  public boolean Od() {
    return this.bKS;
  }

  public short bEu() {
    return bQW();
  }
}