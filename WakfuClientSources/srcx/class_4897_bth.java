import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bth extends cGj
{
  public static final String dqu = "victory";
  public static final String bC = "name";
  public static final String fla = "xpValue";
  public static final String gby = "xpGain";
  public static final String gbz = "levelGain";
  public static final String dqx = "spells";
  public static final String cxm = "loots";
  public static final String gbA = "collectedLoots";
  public static final String gbB = "kamas";
  public static final String gbC = "collectedKamas";
  public static final String gbD = "taxes";
  public static final String gbE = "isLocalPlayer";
  public static final String[] bF = { "name", "victory", "xpValue", "xpGain", "levelGain", "spells", "loots", "collectedLoots", "kamas", "collectedKamas", "isLocalPlayer" };
  private final pq gbF;
  aKw gbG;
  private final bDn gbH;
  private final List cxn = new ArrayList();
  private final List gbI = new ArrayList();

  public String[] getFields()
  {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if ("name".equals(paramString)) {
      return getName();
    }
    if ("victory".equals(paramString)) {
      return bBD();
    }
    if ("xpValue".equals(paramString)) {
      return this.gbH;
    }
    if ("xpGain".equals(paramString)) {
      return bBF();
    }
    if ("levelGain".equals(paramString)) {
      return bBG();
    }
    if ("loots".equals(paramString)) {
      return this.cxn.isEmpty() ? null : Collections.unmodifiableCollection(this.cxn);
    }
    if ("collectedLoots".equals(paramString)) {
      return this.gbI.isEmpty() ? null : Collections.unmodifiableCollection(this.gbI);
    }
    if ("kamas".equals(paramString)) {
      return bBH();
    }
    if ("taxes".equals(paramString)) {
      return bBJ();
    }
    if ("collectedKamas".equals(paramString)) {
      return bBI();
    }
    if ("isLocalPlayer".equals(paramString)) {
      return Boolean.valueOf(this.gbF.eq() == byv.bFN().bFO().getId());
    }
    return null;
  }

  bth(pq parampq, aKw paramaKw) {
    this.gbF = parampq;
    this.gbG = paramaKw;
    this.gbH = bBE();
    bBC();
  }

  private void bBC() {
    il localil = new il();
    a(this.gbF.wE().qd(), localil);
    a(this.gbF.wF().qd(), localil);

    localil.a(new aox(this));

    Collections.sort(this.cxn);

    this.gbF.wG().a(new aoz(this));

    Collections.sort(this.gbI);
  }

  private void a(BZ paramBZ, il paramil) {
    while (paramBZ.hasNext()) {
      paramBZ.fl();
      int i = paramBZ.zY();
      short s = paramBZ.Lb();
      paramil.a(i, s, s);
    }
  }

  private Object bBD() {
    return Boolean.valueOf(this.gbF.wD());
  }

  private bDn bBE() {
    return new bDn(PF.abu(), this.gbF.wB(), this.gbF.wC(), bBF(), this.gbG.bch().DO());
  }

  private Long bBF()
  {
    uP localuP = this.gbG.bch();
    if (!localuP.DS()) {
      return null;
    }
    return Long.valueOf(localuP.DP());
  }

  private Object bBG() {
    short s = this.gbG.bch().DO();
    return s > 0 ? bU.fH().getString("levelGain", new Object[] { Short.valueOf(s) }) : null;
  }

  private Object bBH() {
    long l = this.gbF.wH();
    if (l < 0L) {
      return null;
    }

    return bU.fH().getString("kama.shortGain", new Object[] { Long.valueOf(this.gbF.wH()) });
  }

  private Object bBI() {
    long l = this.gbF.wJ();
    if (l < 0L) {
      return null;
    }

    return bU.fH().getString("kama.shortGain", new Object[] { Long.valueOf(this.gbF.wJ()) });
  }

  private Object bBJ() {
    long l = this.gbF.wI();
    if (l == 0L) {
      return null;
    }

    return Long.valueOf(this.gbF.wI());
  }

  public void b(aKw paramaKw) {
    this.gbG = paramaKw;
  }

  public aKw bBK() {
    return this.gbG;
  }

  public String getName() {
    return this.gbF.getName();
  }

  public short nU() {
    return this.gbH.nU();
  }

  public long bBL() {
    uP localuP = this.gbG.bch();
    if (!localuP.DS()) {
      return 0L;
    }
    return localuP.DP();
  }

  public long wH() {
    return this.gbF.wH();
  }

  public long bBM() {
    return this.gbF.wJ();
  }
}