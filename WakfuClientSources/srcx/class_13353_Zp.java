import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.log4j.Logger;

public class Zp
  implements dBv, Comparable
{
  protected static final Logger K = Logger.getLogger(Zp.class);
  public static final String bHJ = "id";
  public static final String bC = "name";
  public static final String cKz = "longName";
  public static final String cKA = "godName";
  public static final String RI = "description";
  public static final String cKB = "backgroundDescription";
  public static final String cKC = "buttonStyle";
  public static final String RH = "iconUrl";
  public static final String cKD = "smallIconUrl";
  public static final String cKE = "smallBackgroundUrl";
  public static final String cKF = "bigBackgroundUrl";
  public static final String cKG = "mainSpells";
  public static final String cKH = "supportSpellsText";
  public static final String cKI = "femaleIllustration";
  public static final String cKJ = "maleIllustration";
  public static final String cKK = "malePortraitIllustration";
  public static final String cKL = "femalePortraitIllustration";
  public static final String cKM = "maleFemalePortraitIllustration";
  public static final String[] bF = { "id", "name", "longName", "godName", "description", "backgroundDescription", "buttonStyle", "iconUrl", "smallIconUrl", "smallBackgroundUrl", "bigBackgroundUrl", "mainSpells", "supportSpellsText", "femaleIllustration", "maleIllustration", "malePortraitIllustration", "femalePortraitIllustration", "maleFemalePortraitIllustration" };

  private SB czh = SB.ctz;
  private dPx cKN;
  private byte cKO;

  public Zp(SB paramSB)
  {
    this.czh = paramSB;
    this.cKN = new dPx();
    this.cKO = bTI.heW.bJ();
  }

  public short nc() {
    return this.czh.uO();
  }

  public String getName() {
    return bU.fH().getString("breed." + nc());
  }

  public String getDescription() {
    return bU.fH().getString("breedLongDesc." + nc());
  }

  public String getLongName()
  {
    String str = bU.fH().nq("breedLongName." + nc());
    return bjv.format(str, new Object[] { new lZ().a(getName()).toString() });
  }

  public SB aii()
  {
    return this.czh;
  }

  public void a(dSR paramdSR, apX paramapX)
  {
    byte b = paramdSR.bHU();
    if (!this.cKN.D(b)) {
      this.cKN.c(b, new aoL());
    }
    ((aoL)this.cKN.bf(b)).put(paramdSR.getId(), new fg(paramdSR, paramapX));
  }

  public List d(bTI parambTI) {
    fg[] arrayOffg1 = e(parambTI);
    if (arrayOffg1 == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(arrayOffg1.length);
    for (fg localfg : arrayOffg1) {
      localArrayList.add(localfg.mg() != null ? localfg.mg() : localfg.mf());
    }
    return localArrayList;
  }

  public fg[] e(bTI parambTI) {
    aoL localaoL = (aoL)this.cKN.bf(parambTI.bJ());
    if (localaoL == null)
      return null;
    fg[] arrayOffg = new fg[localaoL.size()];
    localaoL.d(arrayOffg);
    Arrays.sort(arrayOffg);
    return arrayOffg;
  }

  private dSR[] aky()
  {
    bTI[] arrayOfbTI1 = bTI.values();
    dSR[] arrayOfdSR = new dSR[arrayOfbTI1.length];
    int i = 0;
    for (bTI localbTI : bTI.values())
    {
      if (localbTI != bTI.heW)
      {
        fg[] arrayOffg = e(localbTI);
        if ((arrayOffg != null) && (arrayOffg.length != 0))
        {
          dSR localdSR = arrayOffg[0].mf();
          if (localdSR != null) {
            i = (byte)(i + 1); arrayOfdSR[i] = localdSR;
          }
        }
      }
    }
    return arrayOfdSR;
  }

  public aJp akz() {
    return this.cKN.dqF();
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("id"))
      return Short.valueOf(nc());
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("longName"))
      return getLongName();
    if (paramString.equals("description"))
      return getDescription();
    if (paramString.equals("iconUrl")) {
      try {
        return String.format(ay.bd().getString("breedIconPath"), new Object[] { Short.valueOf(nc()) });
      } catch (bdh localbdh1) {
        K.error(localbdh1.getMessage(), localbdh1);
      }
    } else if (paramString.equals("smallIconUrl")) {
      try {
        return String.format(ay.bd().getString("breedSmallIconPath"), new Object[] { Short.valueOf(nc()) });
      } catch (bdh localbdh2) {
        K.error(localbdh2.getMessage(), localbdh2);
      }
    } else if (paramString.equals("smallBackgroundUrl")) {
      try {
        return String.format(ay.bd().getString("breedSmallBackgroundsPath"), new Object[] { Short.valueOf(nc()) });
      } catch (bdh localbdh3) {
        K.error(localbdh3.getMessage(), localbdh3);
      }
    } else if (paramString.equals("bigBackgroundUrl")) {
      try {
        return String.format(ay.bd().getString("breedBigBackgroundsPath"), new Object[] { Short.valueOf(nc()) });
      } catch (bdh localbdh4) {
        K.error(localbdh4.getMessage(), localbdh4);
      }
    } else { if (paramString.equals("buttonStyle"))
        return "characterCreationBreed" + nc();
      if (paramString.equals("mainSpells"))
        return aky();
      if (paramString.equals("supportSpellsText"))
        return bU.fH().getString("breedSupportSpells", new Object[] { getName() });
      if (paramString.equals("maleIllustration"))
        try {
          return String.format(ay.bd().getString("breedIllustrationPath"), new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(0) });
        } catch (bdh localbdh5) {
          K.error("Exception", localbdh5);
        }
      else if (paramString.equals("femaleIllustration"))
        try {
          return String.format(ay.bd().getString("breedIllustrationPath"), new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(1) });
        } catch (bdh localbdh6) {
          K.error("Exception", localbdh6);
        }
      else if (paramString.equals("malePortraitIllustration"))
        try {
          return String.format(ay.bd().getString("breedPortraitIllustrationPath"), new Object[] { String.valueOf(aii().uO()) + String.valueOf(0) });
        }
        catch (bdh localbdh7) {
          K.error("Exception", localbdh7);
        }
      else if (paramString.equals("femalePortraitIllustration"))
        try {
          return String.format(ay.bd().getString("breedPortraitIllustrationPath"), new Object[] { String.valueOf(aii().uO()) + String.valueOf(1) });
        }
        catch (bdh localbdh8) {
          K.error("Exception", localbdh8);
        }
      else if (paramString.equals("maleFemalePortraitIllustration")) {
        try {
          String[] arrayOfString = new String[2];
          arrayOfString[0] = String.format(ay.bd().getString("breedPortraitIllustrationPath"), new Object[] { String.valueOf(aii().uO()) + String.valueOf(0) });

          arrayOfString[1] = String.format(ay.bd().getString("breedPortraitIllustrationPath"), new Object[] { String.valueOf(aii().uO()) + String.valueOf(1) });

          return arrayOfString;
        } catch (bdh localbdh9) {
          K.error("Exception", localbdh9);
        }
      }
    }
    return null;
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

  public int compareTo(Object paramObject) {
    Zp localZp = (Zp)paramObject;
    return nc() - localZp.nc();
  }
}