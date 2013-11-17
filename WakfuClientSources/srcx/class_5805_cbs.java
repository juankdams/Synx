import java.util.ArrayList;

public class cbs extends cGj
  implements G, Runnable
{
  public static final String bC = "name";
  public static final String hsP = "currentScore";
  public static final String hsQ = "chrono";
  public static final String hsR = "roundNumber";
  public static final String hsS = "challenges";
  public static final String bke = "rewards";
  public static final String RI = "description";
  public static final String[] bF = { "name", "currentScore", "chrono", "roundNumber", "challenges", "rewards", "description" };
  private short hsT;
  private int hsU;
  private final cSR eUQ = new cSR();
  private dVR hsV;
  private long bYL;
  private int hsW;
  private int hsX;
  private int hsY;
  private int hsZ;
  private int hta;
  private int htb;
  private short htc;

  public cbs(dVR paramdVR)
  {
    this.hsV = paramdVR;
    paramdVR.ag(new bLm(this));

    this.hsT = 0;
    this.hsU = 0;
  }

  public void cfb() {
    this.bYL = System.currentTimeMillis();
    dka.cSF().a(this, 1000L);
  }

  public void cfc() {
    dka.cSF().j(this);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name")) {
      return this.hsV.getName();
    }
    if (paramString.equals("currentScore")) {
      return bU.fH().getString("arcadeDungeon.points", new Object[] { Integer.valueOf(this.hsU) });
    }
    if (paramString.equals("chrono")) {
      long l = getRemainingTime();
      if (l > 0L)
        return ab(l);
      return "-";
    }
    if (paramString.equals("roundNumber")) {
      return Short.valueOf(this.hsT);
    }
    if (paramString.equals("challenges")) {
      Object[] arrayOfObject = this.eUQ.getValues();
      return arrayOfObject.length == 0 ? null : arrayOfObject;
    }
    if (paramString.equals("rewards")) {
      return cfd();
    }
    if (paramString.equals("description")) {
      return this.hsV.getDescription();
    }
    return null;
  }

  private ArrayList cfd() {
    byz localbyz = byv.bFN().bFO();
    int i = buI.bCs().bCC();
    ArrayList localArrayList = new ArrayList();
    this.hsV.a(new bLo(this, localArrayList), i == -1 ? localbyz.nU() : i);

    return localArrayList.size() > 0 ? localArrayList : null;
  }

  public int cfe() {
    byz localbyz = byv.bFN().bFO();
    int i = buI.bCs().bCC();
    ArrayList localArrayList = new ArrayList();
    this.hsV.a(new bLp(this, localArrayList), i == -1 ? localbyz.nU() : i, this);

    return localArrayList.size();
  }

  public static String ab(long paramLong)
  {
    long l1 = paramLong / 60L;
    long l2 = paramLong - 60L * l1;
    return String.format("%d:%s", new Object[] { Long.valueOf(l1), "0" + l2 });
  }

  private long getRemainingTime() {
    return (System.currentTimeMillis() - this.bYL) / 1000L;
  }

  public void bCz() {
    this.hsT = ((short)(this.hsT + 1));
    this.htc = 0;
    dLE.doY().a(this, new String[] { "roundNumber" });
    cfg();
  }

  public int cff() {
    return this.hsT;
  }

  public void run() {
    dLE.doY().a(this, new String[] { "chrono" });
  }

  public aZM uy(int paramInt) {
    return (aZM)this.eUQ.get(paramInt);
  }

  public void uz(int paramInt) {
    this.hsY += 1;
    this.hsZ += paramInt;
  }

  public void uA(int paramInt) {
    this.hta += 1;
    this.htb += paramInt;
  }

  public void uB(int paramInt) {
    this.hsX += 1;
    this.hsW += paramInt;
  }

  public void uC(int paramInt) {
    this.hsU = paramInt;
    dLE.doY().a(this, new String[] { "currentScore" });
  }

  private void cfg() {
    for (dmn localdmn = this.eUQ.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      dLE.doY().a((dBv)localdmn.value(), new String[] { "score" });
    }
  }

  public int cfh() {
    return this.hsZ + this.htb + this.hsW;
  }

  public int cfi() {
    return this.hsW;
  }

  public int cfj() {
    return this.hsX;
  }

  public int cfk() {
    return this.hsY;
  }

  public int cfl() {
    return this.hsZ;
  }

  public int cfm() {
    return this.hta;
  }

  public int cfn() {
    return this.htb;
  }

  public int cfo() {
    return this.hsV.Eh(bCO.J(this.hsT - 1, 0, 32767));
  }

  public int ab() {
    return this.hsU;
  }

  public int ac() {
    return cfl();
  }

  public int ad() {
    return cfi();
  }

  public int cfp() {
    return this.hsU;
  }

  public void bCA() {
    this.htc = ((short)(this.htc + 1));
  }

  public short cfq() {
    return this.htc;
  }

  public lX cfr() {
    byz localbyz = byv.bFN().bFO();
    return this.hsV.a(localbyz.nU(), this);
  }
}