import java.util.ArrayList;
import org.apache.log4j.Logger;

public class asP extends cGj
{
  private static final Logger K = Logger.getLogger(asP.class);
  public static final String dCP = "style";
  public static final String dCQ = "effect";
  public static final String czg = "enabled";
  private final cHN dCR;
  private final ayn dtQ;
  private final boolean dCS;

  public asP(cHN paramcHN, ayn paramayn)
  {
    this(paramcHN, paramayn, true);
  }

  public asP(cHN paramcHN, ayn paramayn, boolean paramBoolean) {
    this.dCR = paramcHN;
    this.dtQ = paramayn;
    this.dCS = paramBoolean;
  }

  public String[] getFields() {
    return null;
  }

  private cIZ ave()
  {
    return a(this.dCR, this.dtQ);
  }

  public static cIZ a(cHN paramcHN, ayn paramayn) {
    if (paramcHN == null) {
      return cIZ.iHb;
    }
    if ((paramcHN.F() == null) || (paramayn == null)) {
      return cIZ.iHa;
    }
    if (paramcHN.F().i(paramayn, paramayn, paramayn.aKs(), null))
      return paramayn.ave();
    if (paramayn.ave() == cIZ.iHc) {
      return cIZ.iHd;
    }
    return cIZ.iHc;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("effect"))
      return aEU();
    if (paramString.equals("enabled"))
      return Boolean.valueOf(isEnabled());
    if (paramString.equals("style")) {
      if (!this.dCS) {
        return "";
      }
      if ((this.dCR != null) && (this.dCR.cBZ() == bMn.gPI)) {
        return "";
      }

      switch (bAv.ceo[ave().ordinal()]) {
      case 1:
        return "PassportMDCBadBuff";
      case 2:
        return "PassportMDCMediumBuff";
      case 3:
      case 4:
        return "PassportMDCGoodBuff";
      }
      return "PassportMDCBadBuff";
    }

    return null;
  }

  private boolean isEnabled() {
    return a(this.dtQ, this.dCR);
  }

  public static boolean a(ayn paramayn, cHN paramcHN) {
    if ((paramayn == null) || ((paramcHN == null) && (paramayn.aKd().length == 0))) {
      return true;
    }

    for (cBV localcBV : paramayn.aKd()) {
      if (paramcHN == localcBV) {
        return true;
      }
    }
    return a(paramcHN, paramayn).bJ() <= paramayn.ave().bJ();
  }

  private String aEU() {
    return a(this.dCR, this.dCS);
  }

  public static String a(cHN paramcHN, boolean paramBoolean) {
    if (paramcHN == null) {
      if (paramBoolean) {
        return bU.fH().getString("protector.noBuff");
      }
      return bU.fH().getString("protector.noWill");
    }

    dFz localdFz = new dFz(paramcHN, paramcHN.getId(), paramcHN.nU());
    ArrayList localArrayList = localdFz.cAK();
    lZ locallZ = new lZ();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      if (i != 0) {
        locallZ.tH();
      }
      locallZ.a((CharSequence)localArrayList.get(i));
    }

    return locallZ.tP();
  }
}