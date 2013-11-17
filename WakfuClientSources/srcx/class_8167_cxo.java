import java.util.ArrayList;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class cxo
{
  public static final String ikj = "craft";
  public static final String ikk = "(\\[(el)([0-9]?)\\])";
  public static final String ikl = "(\\[(st)([0-9]+)\\])";
  public static final Pattern ikm;
  public static final Pattern ikn;
  public static final String iko = "fighter";
  public static final String ikp = "shield";
  public static final String ikq = "glyph";
  public static final String ikr = "drake";
  public static final String iks = "paw";
  public static final String ikt = "tique";
  public static final String iku = "taque";
  public static final String ikv = "backstab";
  public static final String ikw = "sidestab";
  public static final String ikx = "invisible";
  public static final String iky = "barrel";
  public static final String ikz = "lucky";
  public static final String ikA = "totem";
  public static final String ikB = "puppet";
  public static final String ikC = "enemy";
  public static final String ikD = "ally";
  public static final String ikE = "seed";
  public static final String ikF = "chromatic";
  public static final String gkm = "caster";
  public static final Pattern ikG;
  public static final Pattern ikH;
  public static final Pattern ikI;
  public static final Pattern ikJ;
  public static final char ikK = '+';
  public static final char ikL = '-';
  public static final char ikM = '*';
  public static final char ikN = '/';
  public static final String ikO = "([\\+\\-\\*\\/])([0-9]+([,\\.][0-9]+)?)";
  public static final Pattern ikP;
  public static final Pattern ikQ;
  public static final Pattern ikR;
  public static final Pattern ikS;
  public static final Pattern ikT;
  public static final int ikU;
  public static final int ikV;
  public static final int ikW;
  public static final int ikX;
  public static final int ikY;
  public static final int ikZ;
  public static final int ila;
  public static final int ilb;
  public static final int ilc;
  public static final int ild;
  public static final int ile;
  public static final int ilf;
  private static final Logger K;
  public static final int ilg = -1;
  public static final int ilh = 0;
  public static final String ili = "    ";
  public static String ilj;
  public static String ilk;
  public static cDM feH;
  public static dMF ill;
  public static aXw ilm;
  public static String AA;
  public static String EN;
  public static String GO;
  public static String GP;
  public static String of;
  public static String og;
  public static String pO;
  public static String pM;
  public static String STRENGTH;
  public static String pN;
  public static String pP;
  public static String pL;
  public static String oe;
  public static String GB;
  public static int lq;
  public static int lI;
  public static int lm;
  public static int ll;
  public static final cSR iln;

  public static ArrayList a(cFo paramcFo)
  {
    return paramcFo.cAK();
  }

  public static String a(bJC parambJC, short paramShort, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3) {
    if (parambJC.nU() != paramShort) {
      parambJC = parambJC.cJ(paramShort);
    }
    chR localchR = new chR(parambJC, cMx.krQ, paramInt);
    ArrayList localArrayList = a(localchR);

    if ((localArrayList != null) && (localArrayList.size() != 0)) {
      lZ locallZ = ill.cLY();
      if ((paramBoolean2) && (!paramBoolean1))
        locallZ.am("8888ff");
      locallZ.a((paramBoolean2 ? "\n" : "") + c(localArrayList, paramBoolean3));
      return locallZ.tP();
    }
    return null;
  }

  public static String c(ArrayList paramArrayList, boolean paramBoolean) {
    String str1 = "";
    int i = 1;

    for (String str2 : paramArrayList) {
      if (i == 0) {
        str1 = str1 + "\n";
      }
      if (paramBoolean) {
        if (str2.contains(ilk))
          str1 = str1 + "    ";
        else {
          str1 = str1 + ilj;
        }
      }
      str1 = str1 + str2;
      i = 0;
    }
    return str1;
  }

  public static String n(dpI paramdpI) {
    if ((!bB) && (paramdpI == null)) throw new AssertionError("Effect null !");

    doA localdoA = (doA)bsj.bAv().kD(paramdpI.eo());

    if (localdoA == null) {
      K.error("impossible de trouver de RunningEffect associé à l'actionId " + paramdpI.eo());
      return "";
    }
    bTI localbTI = ((doA)bsj.bAv().kD(paramdpI.eo())).Cz();
    return l(localbTI);
  }

  public static String l(bTI parambTI) {
    if ((parambTI != null) && (parambTI != bTI.heW) && (parambTI != bTI.hfc)) {
      return ilm.a(ill.cLY(), parambTI).tP();
    }
    return "";
  }

  public static String a(dpI paramdpI, short paramShort, bJC parambJC, int paramInt) {
    if (paramdpI.aMG() == 2) {
      aAU localaAU = (aAU)paramdpI;
      int i = localaAU.aV(paramShort).csD();
      if (parambJC != null) {
        i = parambJC.cK((short)paramInt).csD();
      }
      if (i == -1) {
        return ilm.a(feH);
      }
      if (i > 0) {
        return ilm.a(feH, i);
      }
    }
    return "";
  }

  public static String a(bJC parambJC, short paramShort1, short paramShort2, boolean paramBoolean) {
    lZ locallZ = ill.cLY();
    ilm.a(locallZ, parambJC, paramShort1);

    if ((paramShort2 > 0) && (paramBoolean)) {
      bJC localbJC = cNO.cFX().yF(parambJC.bQW());
      locallZ.a(" (" + feH.getString(localbJC.NW() ? og : of, new Object[] { Integer.valueOf(Math.min(localbJC.bRe(), paramShort1)) }) + ")");
    }
    return locallZ.tP();
  }

  public static String a(aAn paramaAn, short paramShort) {
    lZ locallZ = ill.cLY();
    ilm.a(locallZ, paramaAn, paramShort);
    return locallZ.tP();
  }

  public static String b(bzj parambzj) {
    lZ locallZ = ill.cLY();
    ilm.a(locallZ, parambzj);
    return locallZ.tP();
  }

  public static aFA xb(int paramInt) {
    aFA localaFA = (aFA)iln.get(paramInt);
    if (localaFA != null) {
      return localaFA;
    }
    return (aFA)iln.get(-1);
  }

  static
  {
    ikm = Pattern.compile("\\[@(el|mr|Mr|ap|mp|wp|ch|lv)\\]");

    ikn = Pattern.compile("\\[(pr|se|pl|ae)\\]");

    ikG = Pattern.compile("\\[(fighter|shield|glyph|paw|taque|tique|backstab|sidestab|invisible|barrel|lucky|totem|puppet|enemy|ally|caster|seed|chromatic|drake)\\]");

    ikH = Pattern.compile("\\[(li|lp)\\]");

    ikI = Pattern.compile("(\\[(\\$[0-9]+)+(ef|ae|el|pr|st|li|lp|(#[0-9]+))\\])");
    ikJ = Pattern.compile("(\\$[0-9]+|ef|ae|el|pr|st|li|lp|#[0-9]+)");

    ikP = Pattern.compile("([\\+\\-\\*\\/])([0-9]+([,\\.][0-9]+)?)");
    ikQ = Pattern.compile("\\|([0-9]d)?([0-9]+([,\\.][0-9]+)?)(.*)\\|");
    ikR = Pattern.compile("(\\[(el)([0-9]?)\\])");
    ikS = Pattern.compile("(\\[(st)([0-9]+)\\])");

    ikU = bsj.fSO.getId();
    ikV = bsj.fSV.getId();
    ikW = bsj.fSd.getId();
    ikX = bsj.fSs.getId();
    ikY = bsj.fRh.getId();
    ikZ = bsj.fRG.getId();
    ila = bsj.fWn.getId();

    ilb = bsj.fVg.getId();
    ilc = bsj.fSq.getId();
    ild = bsj.fSX.getId();
    ile = bsj.fSk.getId();
    ilf = bsj.fSo.getId();
    K = Logger.getLogger(cxo.class);

    ilj = "";
    ilk = "";

    iln = new cSR();

    String str = "\\[(";
    for (localcbh : cgr.values()) {
      if (!localcbh.equals(cgr.values()[0])) {
        str = str + "|";
      }
      str = str + localcbh.name();
    }
    str = str + ")\\]";
    ikT = Pattern.compile(str);

    iln.put(-1, new Vz());

    ??? = new cbb();
    iln.put(bsj.fVr.getId(), ???);
    iln.put(bsj.fSm.getId(), ???);
    iln.put(bsj.fSh.getId(), ???);
    iln.put(bsj.fSo.getId(), ???);
    iln.put(bsj.fSn.getId(), ???);
    iln.put(bsj.fSG.getId(), ???);
    iln.put(bsj.fUW.getId(), ???);
    iln.put(bsj.fSl.getId(), ???);
    iln.put(bsj.fSk.getId(), ???);
    iln.put(bsj.fSH.getId(), ???);
    iln.put(bsj.fSX.getId(), ???);
    iln.put(bsj.fSq.getId(), ???);
    iln.put(bsj.fSG.getId(), ???);

    byO localbyO = new byO();
    aBn.dVb.g(new SZ(localbyO));

    TH localTH = new TH();
    iln.put(bsj.fPn.getId(), localTH);

    cbh localcbh = new cbh();
    iln.put(bsj.fVh.getId(), localcbh);

    dMo localdMo = new dMo();
    iln.put(bsj.fSd.getId(), localdMo);
    iln.put(bsj.fSs.getId(), localdMo);
    iln.put(bsj.fRh.getId(), localdMo);
    iln.put(bsj.fRG.getId(), localdMo);
    iln.put(bsj.fSO.getId(), localdMo);
    iln.put(bsj.fSV.getId(), localdMo);
    iln.put(bsj.fWn.getId(), localdMo);

    bDX localbDX = new bDX();
    iln.put(bsj.fSg.getId(), localbDX);

    Vz localVz = new Vz(cJV.iIq);
    iln.put(bsj.fXb.getId(), localVz);
  }
}