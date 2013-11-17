import com.ankamagames.wakfu.client.console.command.debug.DisplayStatesCommand;
import org.apache.log4j.Logger;

public class dcU
  implements aXw
{
  private static final Logger K = Logger.getLogger(dcU.class);

  public void a(cDM paramcDM, dMF paramdMF) {
    cxo.feH = paramcDM;
    cxo.ill = paramdMF;
    cxo.ilm = this;
    try {
      cxo.ilk = ay.bd().getString("effectDescPlotIconUrl");
      cxo.ilj = cxo.ill.cLY().a("    ").a(cxo.ilk, -1, -1, null).a(" ").tP();
    } catch (bdh localbdh) {
      localbdh.printStackTrace();
    }

    cxo.AA = "critical";
    cxo.EN = "requirements";
    cxo.GO = "hp.var.beacon";
    cxo.GP = "hp.var.barrel";
    cxo.of = "levelShort.custom";
    cxo.og = "levelShort.customCumulable";
    cxo.pO = "WISDOMShort";
    cxo.pM = "AGILITYShort";
    cxo.STRENGTH = "STRENGTHShort";
    cxo.pN = "LUCKShort";
    cxo.pP = "INTELLIGENCEShort";
    cxo.pL = "vitalityShort";
    cxo.oe = "max";
    cxo.GB = "level";

    cxo.lq = 10;
    cxo.lI = 33;
    cxo.lm = 6;
    cxo.ll = 5;
  }

  public lZ a(lZ paramlZ, String paramString) {
    return paramlZ.tI().am("cc4444").a(paramString);
  }

  public void a(lZ paramlZ, aAn paramaAn, short paramShort) {
    paramlZ.tz().tF().am("70FEC5").ao("glyph_" + bCO.G((short)(int)paramaAn.clt(), paramShort));

    paramlZ.a(bU.fH().b(6, (short)(int)paramaAn.clt(), new Object[0]));
    paramlZ.tG().tA();
  }

  public void a(lZ paramlZ, bJC parambJC, short paramShort) {
    paramlZ.tz().tF().am("70FEC5").ao("state_" + bCO.G(parambJC.bQW(), paramShort));

    paramlZ.a(parambJC.getName());
    paramlZ.tG().tA();
  }

  public void a(lZ paramlZ, bzj parambzj) {
    paramlZ.tz().tF().am("70FEC5").ao("spell_" + parambzj.getId());
    paramlZ.a(bU.fH().b(3, parambzj.getId(), new Object[0]));
    paramlZ.tG().tA();
  }

  public bfE bu(short paramShort)
  {
    apX localapX = (apX)byv.bFN().bFO().auK().hh(paramShort);
    if (localapX == null)
      localapX = (apX)Be.Kj().h(paramShort, (short)0);
    else {
      localapX = localapX.k(false, true);
    }
    if (localapX == null) {
      localapX = new apX(Be.Kj().ea(paramShort), (short)0, 0L);
    }

    return localapX;
  }

  public String oj(int paramInt) {
    return X.aw().f(paramInt).getName();
  }

  public String ok(int paramInt) {
    return bU.fH().b(15, paramInt, new Object[0]);
  }

  public String bv(short paramShort) {
    return ((Dk)kN.sy().qy(paramShort)).getName();
  }

  public String bw(short paramShort) {
    return bU.fH().b(43, paramShort, new Object[0]);
  }

  public String jB(int paramInt) {
    return bU.fH().b(138, paramInt, new Object[0]);
  }

  public String bx(short paramShort) {
    bdi localbdi = cMn.cFp().dP(paramShort);
    if (localbdi == null)
      return null;
    return localbdi.getName();
  }

  public String by(short paramShort) {
    return bU.fH().b(38, paramShort, new Object[0]);
  }

  public String ol(int paramInt) {
    return bU.fH().getString("breed." + paramInt);
  }

  public String om(int paramInt) {
    return bU.fH().b(39, paramInt, new Object[0]);
  }

  public String cw(byte paramByte) {
    return bU.fH().getString("nation.alignmentName" + dqU.fx(paramByte).name());
  }

  public String on(int paramInt) {
    return bU.fH().b(77, paramInt, new Object[0]);
  }

  public int bP() {
    byz localbyz = byv.bFN().bFO();
    if (localbyz != null) {
      cvY localcvY = localbyz.cJf();
      if (localcvY != null) {
        return localcvY.bP();
      }
    }

    return -1;
  }

  public lZ a(lZ paramlZ) {
    try {
      String str = String.format(ay.bd().getString("elementsSmallIconsPath"), new Object[] { "craft" });
      paramlZ.a(str, -1, -1, null);
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }
    return paramlZ;
  }

  public lZ a(lZ paramlZ, bTI parambTI) {
    try {
      String str = String.format(ay.bd().getString("elementsSmallIconsPath"), new Object[] { parambTI.name() });
      paramlZ.a(str, -1, -1, null);
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }
    return paramlZ;
  }

  public lZ b(lZ paramlZ, String paramString) {
    try {
      String str = String.format(ay.bd().getString("targetEffectIconsPath"), new Object[] { paramString });
      paramlZ.a(str, -1, -1, null, paramString);
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }
    return paramlZ;
  }

  public String a(bbH parambbH) {
    try {
      String str1 = String.format(ay.bd().getString("areasIconsPath"), new Object[] { parambbH.eP().name() });
      String str2 = "areaRange";
      int i = parambbH.eJ();
      if (i > 0) {
        str2 = str2 + "-" + i;
      }
      return cxo.ill.cLY().a(str1, -1, -1, null, str2).tP();
    } catch (bdh localbdh) {
      K.error(localbdh.toString());
    }
    return null;
  }

  public String bmI() {
    try {
      return cxo.ill.cLY().a(dfn.eT((byte)10), -1, -1, null, "critere.chrage").a(" ").tP();
    } catch (bdh localbdh) {
      localbdh.getMessage();
    }
    return null;
  }

  public String bmJ() {
    try {
      return cxo.ill.cLY().a(dfn.eT((byte)9), -1, -1, null, "citizenScore").a(" ").tP();
    } catch (bdh localbdh) {
      localbdh.getMessage();
    }
    return null;
  }

  public String hu(String paramString) {
    try {
      String str = String.format(ay.bd().getString("areasIconsPath"), new Object[] { paramString });
      return cxo.ill.cLY().a(str, -1, -1, null).tP();
    } catch (bdh localbdh) {
      K.error(localbdh.toString());
    }
    return null;
  }

  public String a(cDM paramcDM) {
    return cxo.feH.getString("cast.infiniteDuration");
  }

  public String a(cDM paramcDM, int paramInt) {
    return cxo.feH.getString("remaining.duration.turn", new Object[] { Integer.valueOf(paramInt) });
  }

  public boolean d(bfE parambfE) {
    return ((dSR)((apX)parambfE).bsL()).vs();
  }

  public dhJ bmK() {
    return byv.bFN().bFO();
  }

  public long bmL() {
    return byv.bFN().bFO().bmL();
  }

  public boolean bmM() {
    return DisplayStatesCommand.aIv();
  }

  public Object bmN() {
    return bmK().bEY();
  }
}