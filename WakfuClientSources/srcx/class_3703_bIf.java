import java.util.ArrayList;
import java.util.EnumMap;
import org.apache.log4j.Logger;

public class bIf
  implements dBv
{
  private static final Logger K = Logger.getLogger(bIf.class);

  private static final EnumMap gGT = new EnumMap(bTI.class);
  public static final String bC = "name";
  public static final String RI = "description";
  public static final String gGU = "elementIconUrl";
  public static final String gGV = "decoratorStyle";
  public static final String cKC = "buttonStyle";
  public static final String gGW = "spellDescription";
  public static final String gGX = "stringMaster";
  public static final String gGY = "iconStyleMaster";
  public static final String eok = "color";
  private final byte hV;
  protected final bTI cpW;
  public static final String[] bF = { "name", "description", "elementIconUrl", "decoratorStyle", "spellDescription", "buttonStyle", "stringMaster", "iconStyleMaster", "color" };
  private static final String gGZ = "IconFireElement";
  private static final String gHa = "IconEarthElement";
  private static final String gHb = "IconAirElement";
  private static final String gHc = "IconStasisElement";
  private static final String gHd = "IconWaterElement";
  private static final String gHe = "IconSupportElement";
  private static final bNa gHf = new bNa(0.75F, 1.0F, 0.19F, 1.0F);
  private static final bNa gHg = new bNa(0.19F, 0.69F, 1.0F, 1.0F);
  private static final bNa gHh = new bNa(0.57F, 0.29F, 1.0F, 1.0F);
  private static final bNa gHi = new bNa(1.0F, 0.67F, 0.19F, 1.0F);
  private static final bNa gHj = new bNa(1.0F, 0.35F, 1.0F, 1.0F);
  private static final bNa gHk = new bNa(0.76F, 0.62F, 0.0F, 1.0F);

  bIf(bTI parambTI)
  {
    this.cpW = parambTI;
    this.hV = parambTI.bJ();
  }

  public byte bJ() {
    return this.hV;
  }

  public static bIf[] c(SB paramSB) {
    ArrayList localArrayList = new ArrayList();
    paramSB.l(new coL(localArrayList));

    return (bIf[])localArrayList.toArray(new bIf[localArrayList.size()]);
  }

  public static bIf j(bTI parambTI) {
    return (bIf)gGT.get(parambTI);
  }

  public static bIf jdMethod_do(byte paramByte) {
    return (bIf)gGT.get(bTI.dx(paramByte));
  }

  public bTI Cz() {
    return this.cpW;
  }

  public String getElementName() {
    return bU.fH().getString(this.cpW.name());
  }

  public String getDescription()
  {
    return bU.fH().getString(String.format("%s%s", new Object[] { "characterCreation.elementDescription.", this.cpW.name() }));
  }

  public String bPv()
  {
    return bU.fH().getString(String.format("%s%s", new Object[] { "desc.showSpells.", this.cpW.name() }));
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getElementName();
    if (paramString.equals("description"))
      return getDescription();
    if (paramString.equals("elementIconUrl")) {
      String str = null;
      try {
        str = String.format(ay.bd().getString("elementsIconsPath"), new Object[] { this.cpW.name() });
      } catch (bdh localbdh) {
      }
      return str;
    }if (paramString.equals("decoratorStyle"))
      return "elementDecorator" + bJ();
    if (paramString.equals("buttonStyle"))
      return this.cpW.name();
    if (paramString.equals("spellDescription"))
      return bPv();
    if (paramString.equalsIgnoreCase("stringMaster"))
      return bPw();
    if (paramString.equalsIgnoreCase("iconStyleMaster"))
      return bPx();
    if (paramString.equalsIgnoreCase("color")) {
      return getColor();
    }

    return null;
  }

  private String bPw()
  {
    switch (this.cpW.bJ()) {
    case 3:
      return bU.fH().getString("desc.earthMaster");
    case 2:
      return bU.fH().getString("desc.waterMaster");
    case 4:
      return bU.fH().getString("desc.airMaster");
    case 1:
      return bU.fH().getString("desc.fireMaster");
    case 0:
      return bU.fH().getString("desc.physicalMaster");
    case 5:
      return bU.fH().getString("desc.stasisMaster");
    case 9:
      return bU.fH().getString("desc.supportMaster");
    case 6:
    case 7:
    case 8: } return null;
  }

  private String bPx()
  {
    try
    {
      switch (this.cpW.bJ()) {
      case 3:
        return "IconEarthElement";
      case 2:
        return "IconWaterElement";
      case 4:
        return "IconAirElement";
      case 1:
        return "IconFireElement";
      case 5:
        return "IconStasisElement";
      case 0:
        return null;
      case 9:
        return "IconSupportElement";
      case 6:
      case 7:
      case 8: } return null;
    } catch (Exception localException) {
      K.error("Unknow Element");
    }

    return null;
  }

  private bNa getColor()
  {
    try
    {
      switch (this.cpW.bJ()) {
      case 3:
        return gHf;
      case 2:
        return gHg;
      case 4:
        return gHh;
      case 1:
        return gHi;
      case 5:
        return gHj;
      case 0:
        return null;
      case 9:
        return gHk;
      case 6:
      case 7:
      case 8: } return null;
    }
    catch (Exception localException) {
      K.error("Unknow Element");
    }

    return null;
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }

  static
  {
    for (bTI localbTI : bTI.values())
      gGT.put(localbTI, new bIf(localbTI));
  }
}