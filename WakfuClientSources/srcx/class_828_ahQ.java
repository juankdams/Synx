import java.util.List;
import org.apache.log4j.Logger;

public class ahQ extends cay
  implements dBv
{
  private static final Logger K = Logger.getLogger(ahQ.class);
  public static final String ddG = "element0";
  public static final String ddH = "element1";
  public static final String ddI = "element2";
  public static final String ddJ = "elementSupport";
  public static final String ddK = "element0Spells";
  public static final String ddL = "element1Spells";
  public static final String ddM = "element2Spells";
  public static final String ddN = "elementSupportSpells";
  public static final String ddO = "globalLevel";
  public static final String[] bF = { "element0", "element1", "element2", "elementSupport", "element0Spells", "element1Spells", "element2Spells", "elementSupportSpells", "globalLevel" };

  public static final String[] aOb = new String[cay.bF.length + bF.length];
  protected dCi ddP;
  protected bIf[] ddQ;
  protected Su ddR;

  public ahQ(Su paramSu)
  {
    this.ddP = new dCi((short)40, new diM(paramSu), null, false, false, false);
    this.ddR = paramSu;
  }

  public void initialize() {
    Zp localZp = this.ddR.aet();
    for (aJp localaJp = localZp.akz(); localaJp.hasNext(); ) {
      localaJp.fl();
      for (localcHu = ((aoL)localaJp.value()).aBa(); localcHu.hasNext(); ) {
        localcHu.fl();
        fg localfg = (fg)localcHu.value();
        apX localapX = (apX)this.ddP.hh(localfg.mf().getId());
        if (localapX != null)
          localfg.a(localapX);
        else
          localfg.a(null);
      }
    }
    cHu localcHu;
    this.ddQ = bIf.c(localZp.aii());
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString == null) {
      return null;
    }

    if (paramString.equals("element0"))
      return this.ddQ[0];
    if (paramString.equals("element1"))
      return this.ddQ[1];
    if (paramString.equals("element2"))
      return this.ddQ[2];
    if (paramString.equals("elementSupport")) {
      return this.ddQ[3];
    }

    if (paramString.equals("element0Spells"))
      return aU((byte)0);
    if (paramString.equals("element1Spells"))
      return aU((byte)1);
    if (paramString.equals("element2Spells"))
      return aU((byte)2);
    if (paramString.equals("elementSupportSpells")) {
      return aU((byte)3);
    }

    if (paramString.equals("globalLevel")) {
      int i = auN();
      return bU.fH().getString("desc.globalSpellLevel", new Object[] { Integer.valueOf(i) });
    }

    return super.getFieldValue(paramString);
  }

  public List aU(byte paramByte) {
    return this.ddR.aet().d(this.ddQ[paramByte].Cz());
  }

  public String[] getFields() {
    return bF;
  }

  public boolean c(apX paramapX) {
    try {
      this.ddP.c(paramapX);
      return true;
    } catch (dI localdI) {
      K.error("[SPELL] Plus de place dans l'inventaire des sort pour en apprendre un nouveau");
    } catch (dcF localdcF) {
      K.error("[SPELL] Sort déjà appri et présent dans l'inventaire");
    }

    return false;
  }

  public apX auJ() {
    return (apX)this.ddP.hh(730);
  }

  public String aV(byte paramByte) {
    return bU.fH().getString("levelShort.custom", new Object[] { Integer.valueOf(aW(paramByte)) });
  }

  public int aW(byte paramByte) {
    int i = 0;
    for (apX localapX : this.ddP) {
      if (localapX.bsL().bHU() == paramByte) {
        i += localapX.nU();
      }
    }
    return i;
  }

  public apX bV(long paramLong)
  {
    return (apX)auK().ci(paramLong);
  }

  public dCi auK() {
    if (aeE())
      return ceK();
    return this.ddP;
  }

  public dCi auL() {
    return this.ddP;
  }

  public Iterable aeA()
  {
    return auK();
  }

  public apX auM()
  {
    for (apX localapX : this.ddP) {
      if ((localapX instanceof amm))
        return localapX;
    }
    return null;
  }

  public int auN()
  {
    int i = 0;
    for (apX localapX : this.ddP) {
      i += localapX.nU();
    }
    return i;
  }

  static
  {
    System.arraycopy(bF, 0, aOb, 0, bF.length);
    System.arraycopy(cay.bF, 0, aOb, bF.length, cay.bF.length);
  }
}