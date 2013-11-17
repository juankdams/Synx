import java.text.DateFormat;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class vD
  implements dBv
{
  protected final dDU bjV;
  public static final String bjW = "isModel";
  public static final String bjX = "isCurrent";
  public static final String aIE = "type";
  public static final String aGo = "title";
  public static final String RI = "description";
  public static final String bjY = "longDescription";
  public static final String bjZ = "expiry";
  public static final String bka = "duration";
  public static final String RH = "iconUrl";
  public static final String bkb = "requirements";
  public static final String bkc = "meetsRequirements";
  public static final String bkd = "state";
  public static final String bke = "rewards";
  public static final String bkf = "firstRankReward";
  public static final String bkg = "secondRankReward";
  public static final String bkh = "thirdRankReward";
  public static final String bki = "minUsers";
  public static final String bkj = "maxUsers";
  public static final String bkk = "isSelectedByProtector";
  public static final String bkl = "hasRewards";
  public static final String[] bF = { "isModel", "isCurrent", "type", "title", "description", "expiry", "duration", "iconUrl", "requirements", "meetsRequirements", "state", "rewards", "hasRewards" };

  private boolean bkm = false;

  protected static final Logger K = Logger.getLogger(vD.class);

  public vD(dDU paramdDU) {
    this.bjV = paramdDU;
  }

  public dDU EE() {
    return this.bjV;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isModel"))
      return Boolean.valueOf(true);
    if (paramString.equals("isCurrent"))
      return Boolean.valueOf(this.bkm);
    if (paramString.equals("type"))
      return this.bjV.EH();
    Object localObject1;
    if (paramString.equals("title")) {
      localObject1 = this.bjV.dfQ();
      if ((localObject1 != null) && (((String)localObject1).length() == 0)) {
        return null;
      }
      return localObject1;
    }if (paramString.equals("description"))
      return EF();
    if (paramString.equals("longDescription")) {
      localObject1 = this.bjV.dfS();
      if ((localObject1 == null) || (((String)localObject1).length() == 0)) {
        return null;
      }
      return "\"" + (String)localObject1 + "\"";
    }
    Object localObject2;
    if (paramString.equals("requirements")) {
      localObject1 = this.bjV.dfT();
      if ((localObject1 != null) && (((String)localObject1).length() == 0)) {
        return null;
      }

      localObject2 = new lZ();
      if (!EJ()) {
        ((lZ)localObject2).tI().am(bNa.gRz.bUV());
      }
      ((lZ)localObject2).a((CharSequence)localObject1);
      return ((lZ)localObject2).tP();
    }if (paramString.equals("meetsRequirements"))
      return Boolean.valueOf(EJ());
    if (paramString.equals("expiry"))
      return EG();
    if (paramString.equals("duration")) {
      if (this.bjV.azI() > 0)
        return String.format("%d:00:00", new Object[] { Short.valueOf(this.bjV.azI()) });
    } else {
      if (paramString.equals("iconUrl"))
        return fJ();
      if (paramString.equals("state"))
        return Byte.valueOf(this.bjV.azu());
      if (paramString.equals("hasRewards"))
        return Boolean.valueOf(this.bjV.cfd().size() != 0);
      if (paramString.equals("rewards")) {
        localObject1 = this.bjV.cfd();
        localObject2 = new ArrayList();
        int i = 0; for (int j = ((ArrayList)localObject1).size(); i < j; i++) {
          ((ArrayList)localObject2).add(new Ym((Aa)((ArrayList)localObject1).get(i)));
        }

        return localObject2;
      }if (paramString.equals("firstRankReward")) {
        localObject1 = this.bjV.cfd();
        if ((localObject1 == null) || (((ArrayList)localObject1).size() < 1)) {
          return null;
        }
        return new Ym((Aa)((ArrayList)localObject1).get(0));
      }if (paramString.equals("secondRankReward")) {
        localObject1 = this.bjV.cfd();
        if ((localObject1 == null) || (((ArrayList)localObject1).size() < 2)) {
          return null;
        }
        return new Ym((Aa)((ArrayList)localObject1).get(1));
      }if (paramString.equals("thirdRankReward")) {
        localObject1 = this.bjV.cfd();
        if ((localObject1 == null) || (((ArrayList)localObject1).size() < 3)) {
          return null;
        }
        return new Ym((Aa)((ArrayList)localObject1).get(2));
      }if (paramString.equals("minUsers"))
        return Short.valueOf(this.bjV.cnZ());
      if (paramString.equals("maxUsers"))
        return Short.valueOf(this.bjV.coa());
      if (paramString.equals("isSelectedByProtector"))
        return Boolean.valueOf(bWW.ccf().FB().aKp().contains(this.bjV.getId()));
    }
    return null;
  }

  protected Object EF() {
    String str = this.bjV.dfR();
    if ((str != null) && (str.length() == 0)) {
      return null;
    }
    return str;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void af(boolean paramBoolean) {
    if (this.bkm != paramBoolean) {
      this.bkm = paramBoolean;

      dLE.doY().a(this, new String[] { "isCurrent" });
    }
  }

  public String fJ() {
    try {
      return String.format(ay.bd().getString("challengeCategoryIconsPath"), new Object[] { Byte.valueOf(this.bjV.EH().bJ()) });
    } catch (bdh localbdh) {
      K.error("Exception", localbdh);
    }

    return null;
  }

  public String EG() {
    if (this.bjV.dfV() != null) {
      DateFormat localDateFormat = DateFormat.getDateTimeInstance(1, 2, bU.fH().ajJ().cAZ());
      return String.format("%s %s", new Object[] { bU.fH().getString("expire.in"), localDateFormat.format(this.bjV.dfV()) });
    }
    return null;
  }

  public aF EH() {
    return this.bjV.EH();
  }

  public cXa EI() {
    return this.bjV.EI();
  }

  public boolean EJ() {
    bZA localbZA = this.bjV.dfX();
    return (localbZA == null) || (localbZA.i(byv.bFN().bFO(), byv.bFN().bFO(), null, null));
  }
}