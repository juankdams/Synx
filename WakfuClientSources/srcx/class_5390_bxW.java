import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bxW
  implements dBv
{
  private static final Logger K = Logger.getLogger(bxW.class);
  public static final String gjl = "characterId";
  public static final String bC = "name";
  public static final String cso = "smileyDescriptorLibrary";
  public static final String frV = "flagIconUrl";
  public static final String bsP = "level";
  public static final String fOi = "guildPoints";
  public static final String fOj = "conquestPoints";
  public static final String eNX = "rank";
  public static final String gjm = "isLocalPlayer";
  public static final String gjn = "isConnected";
  public static final String gjo = "backgroundColor";
  public static final String gjp = "canBan";
  public static final String gjq = "canChangeRank";
  public static final String gjr = "ranks";
  public static final String gjs = "isFriend";
  public static final String gjt = "hasRightToChangeMemberRank";
  private final aCl gju;
  public static final String[] bF = { "characterId", "name", "smileyDescriptorLibrary", "flagIconUrl", "level", "guildPoints", "conquestPoints", "rank", "isLocalPlayer", "isConnected", "backgroundColor", "canBan", "canChangeRank", "ranks", "isFriend", "hasRightToChangeMemberRank" };

  private boolean gjv = false;

  public bxW(aCl paramaCl)
  {
    this.gju = paramaCl;
  }

  public String[] getFields() {
    return new String[0];
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("characterId"))
      return Long.valueOf(this.gju.getId());
    if (paramString.equals("name"))
      return this.gju.getName();
    if (paramString.equals("smileyDescriptorLibrary")) {
      int i = this.gju.getId() == byv.bFN().bFO().getId() ? 1 : 0;
      byte b = this.gju.aOD();
      return i != 0 ? dqB.cXD().fv(b) : new AI(this.gju, this.gju.aOD());
    }if (paramString.equals("level")) {
      long l = this.gju.ayX();
      return Short.valueOf(byv.bFN().bFO().ble().cF(l));
    }if (paramString.equals("conquestPoints"))
      return dzp.Ca(0);
    if (paramString.equals("guildPoints"))
      return dzp.Ca(this.gju.ajD());
    if (paramString.equals("rank"))
      return dqB.cXD().jX(this.gju.aOC());
    Object localObject1;
    Object localObject2;
    if (paramString.equals("ranks")) {
      localObject1 = dqB.cXD();
      localObject2 = (ArrayList)((dqB)localObject1).cXG().clone();
      if (!((dqB)localObject1).cXP()) {
        ((ArrayList)localObject2).remove(((dqB)localObject1).jX(((dqB)localObject1).CE()));
      }
      return localObject2;
    }if (paramString.equals("canChangeRank")) {
      return Boolean.valueOf(((!bFk()) || (dqB.cXD().cXP())) && (dqB.cXD().cXO().a(cnm.hTi)));
    }
    if (paramString.equals("isLocalPlayer"))
      return Boolean.valueOf(aeI());
    if (paramString.equals("isConnected"))
      return Boolean.valueOf(isConnected());
    if (paramString.equals("backgroundColor")) {
      if (bFk())
        return "1,0.97,0.7,0.9";
      if (isConnected()) {
        return "1,1,1,0.9";
      }
      return "1,1,1,0.3";
    }
    if (paramString.equals("hasRightToChangeMemberRank")) {
      localObject1 = dqB.cXD();
      if (((dqB)localObject1).CG() == null) {
        return Boolean.valueOf(false);
      }

      if (((dqB)localObject1).CG().aNs() == 1) {
        return Boolean.valueOf(false);
      }
      localObject2 = ((dqB)localObject1).cXO();
      if (localObject2 == null) {
        return Boolean.valueOf(false);
      }
      return Boolean.valueOf((aOC() != ((dqB)localObject1).CG().CE()) && (((aUJ)localObject2).a(cnm.hTh)));
    }if (paramString.equals("canBan")) {
      localObject1 = dqB.cXD().cXO();
      if (localObject1 != null)
        return Boolean.valueOf((!bFk()) && (((aUJ)localObject1).a(cnm.hTg))); 
    } else { if (paramString.equals("flagIconUrl")) {
        int j = this.gju.bP();
        return ay.bd().C(j == 0 ? -1 : j);
      }if (paramString.equals("isFriend"))
        return Boolean.valueOf(dmY.cUs().cUu().ky(this.gju.getId()) != null);
    }
    return null;
  }

  private boolean bFk() {
    return aOC() == dqB.cXD().CE();
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public boolean aeI() {
    return byv.bFN().bFO().getId() == this.gju.getId();
  }

  public void setNotify(boolean paramBoolean)
  {
    this.gjv = paramBoolean;
  }

  public void bFl() {
    byz localbyz = byv.bFN().bFO();

    String str3 = dqB.cXD().jX(this.gju.aOC()).getName();
    String str1;
    String str2;
    if (this.gju.getId() == localbyz.getId()) {
      str1 = "notification.guildRankChangeTitle";
      str2 = bU.fH().getString("notification.guildRankChangeSelfText", new Object[] { str3 });
    } else {
      str1 = "notification.guildRankChangeTitle";
      str2 = bU.fH().getString("notification.guildRankChangeText", new Object[] { getName(), str3 });
    }

    String str4 = bU.fH().getString(str1);
    String str5 = cda.createLink(str2, ana.dqj);
    az localaz = new az(str4, str5, ana.dqj);
    cjO.clE().j(localaz);
  }

  public long aOC() {
    return this.gju.aOC();
  }

  public int ajD() {
    return this.gju.ajD();
  }

  public short nU() {
    cOB localcOB = byv.bFN().bFO().ble();
    return localcOB.cF(this.gju.ayX());
  }

  public String getName() {
    return this.gju.getName() == null ? "" : this.gju.getName();
  }

  public long getId() {
    return this.gju.getId();
  }

  public boolean isConnected() {
    return this.gju.isConnected();
  }

  public byte aOD() {
    return this.gju.aOD();
  }

  public byte xK() {
    return this.gju.xK();
  }

  public short uO() {
    return this.gju.uO();
  }
}