import org.apache.log4j.Logger;

public class cyo extends cGj
{
  private static final Logger K = Logger.getLogger(cyo.class);
  public static final String imC = "baseBuilding";
  public static final String imD = "evolvedBuilding";
  public static final String fIC = "canBeEvolved";
  public static final String imE = "canPay";
  public static final String cvZ = "guildName";
  public static final String imF = "buildingDate";
  public static final String imG = "hasRightToPay";
  public static final String[] bF = { "baseBuilding", "evolvedBuilding", "canPay", "guildName", "buildingDate" };
  private cYq imH;
  private long imI;
  private final aLw imJ;
  private final aXZ imK;

  public cyo(long paramLong, cUh paramcUh, bOB parambOB, bBg parambBg)
  {
    this(paramcUh, parambOB, parambBg);
    this.imI = paramLong;
  }

  public String[] getFields() {
    return bF;
  }

  public cyo(cUh paramcUh, bOB parambOB, bBg parambBg)
  {
    this.imJ = dfX.laF.j(paramcUh);
    this.imK = new aXZ(parambOB);
    if (parambBg != null) {
      dSb localdSb = new dSb(parambBg);
      int i = this.imK.bns();
      this.imK.gf(localdSb.h(new bFA(0L, i, 0, (short)-32768, (short)-32768)));
      this.imK.a(localdSb);
    }
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("baseBuilding")) {
      return this.imJ;
    }
    if (paramString.equals("evolvedBuilding")) {
      return this.imK;
    }
    if (paramString.equals("canPay")) {
      byz localbyz = byv.bFN().bFO();
      bMG localbMG = localbyz.bSt();
      aCl localaCl = localbMG.ay(localbyz.getId());
      if (localaCl == null) {
        return Boolean.valueOf(false);
      }

      aUJ localaUJ = localbMG.az(localaCl.aOC());
      if (localaUJ == null) {
        return Boolean.valueOf(false);
      }

      return Boolean.valueOf((this.imK.ux()) && (this.imK.bvn()) && (localaUJ.a(cnm.hTn)));
    }
    if (paramString.equals("guildName")) {
      return "-";
    }
    if (paramString.equals("buildingDate")) {
      return this.imH == null ? null : this.imH.cLV();
    }
    return null;
  }

  public void b(cYq paramcYq) {
    this.imH = paramcYq;
  }

  public aLw cvq() {
    return this.imJ;
  }

  public aXZ cvr() {
    return this.imK;
  }

  public long cvs()
  {
    return this.imI;
  }
}