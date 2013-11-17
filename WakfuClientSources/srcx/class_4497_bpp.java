import org.apache.log4j.Logger;

public class bpp extends cGj
{
  private static final Logger K = Logger.getLogger(bpp.class);
  public static final String fJx = "startDate";
  public static final String fJy = "endDate";
  public static final String cvZ = "guildName";
  public static final String fJz = "currentBid";
  public static final String fJA = "nextBid";
  public static final String fJB = "hasRightToBid";
  public static final String[] bF = { "startDate", "endDate", "guildName", "currentBid", "nextBid", "hasRightToBid" };
  private final int bgB;
  private bcD fJC;
  private dxL cZH;
  private long aT;
  private int ejS;
  private String aQZ;

  public String[] getFields()
  {
    return bF;
  }

  public bpp(long paramLong1, String paramString, int paramInt1, int paramInt2, long paramLong2, bcD parambcD)
  {
    this.aT = paramLong1;
    this.aQZ = paramString;
    this.ejS = paramInt1;
    this.bgB = paramInt2;
    this.cZH = cYq.jq(paramLong2);
    this.fJC = parambcD;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("startDate")) {
      if (this.fJC == null) {
        return null;
      }
      return bU.fH().c(this.cZH);
    }
    Object localObject;
    if (paramString.equals("endDate")) {
      if (this.fJC == null) {
        return null;
      }
      localObject = new cYq(this.cZH);
      ((cYq)localObject).n(cjQ.hJX);
      return bU.fH().c((dxL)localObject);
    }
    if (paramString.equals("guildName")) {
      return (this.aQZ != null) && (this.aQZ.length() > 0) ? this.aQZ : bU.fH().getString("noOwner");
    }
    if (paramString.equals("currentBid")) {
      return this.ejS > 0 ? bU.fH().iK(this.ejS) : Integer.valueOf(0);
    }
    if (paramString.equals("nextBid")) {
      localObject = bU.fH().iK(byK());
      return bU.fH().getString("kama.shortGain", new Object[] { localObject });
    }
    if (paramString.equals("hasRightToBid")) {
      localObject = byv.bFN().bFO();
      if (((byz)localObject).CD() < 0L) {
        return Boolean.valueOf(false);
      }
      bMG localbMG = ((byz)localObject).bSt();
      aCl localaCl = localbMG.ay(((byz)localObject).getId());
      long l = localaCl.aOC();
      if (l == -1L) {
        return Boolean.valueOf(false);
      }
      aUJ localaUJ = localbMG.az(l);
      if (localaUJ == null) {
        return Boolean.valueOf(false);
      }
      if ((l != localbMG.CE()) && (!localaUJ.a(cnm.hTn))) {
        return Boolean.valueOf(false);
      }
      if (((byz)localObject).CD() == this.aT) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf(true);
    }
    return null;
  }

  public int byK() {
    return bsx.qJ(this.ejS);
  }

  public int CF() {
    return this.bgB;
  }

  public void eC(long paramLong) {
    this.aT = paramLong;
  }

  public void qz(int paramInt) {
    this.ejS = paramInt;
  }

  public void ix(String paramString) {
    this.aQZ = paramString;
  }
}