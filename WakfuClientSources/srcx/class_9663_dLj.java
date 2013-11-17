public abstract class dLj
  implements dBv, eN
{
  public static final String dtK = "animation";
  public static final String dtL = "animName";
  public static final String lZL = "currentProtector";
  public static final String lZM = "challengeInventory";
  public static final String lZN = "buffInventory";
  public static final String lZO = "climateInventory";
  public static final String lZP = "challengeObjInventory";
  public static final String lZQ = "buffObjInventory";
  public static final String lZR = "climateObjInventory";
  public static final String lZS = "tax";
  public static final String lZT = "walletHandler";
  public static final String lZU = "zoology";
  public static final String lZV = "hasMoneyBaseChallenges";
  public static final String lZW = "baseChallenges";
  public static final String lZX = "availableChallenges";
  public static final String lZY = "boughtBuffs";
  public static final String lZZ = "boughtChallenges";
  public static final String maa = "numBoughtChallenges";
  public static final String mab = "numAvailableChallenges";
  public static final String mac = "boughtClimates";
  public static final String mad = "buffList";
  public static final String mae = "numBuffList";
  public static final String maf = "buffTooltip";
  public static final String mag = "buffTitle";
  public static final String mah = "unsatisfiedRegionalState";
  public static final String mai = "halfSatisfiedRegionalState";
  public static final String maj = "satisfiedRegionalState";
  public static final String mak = "unsatisfiedGlobalState";
  public static final String mal = "halfSatisfiedGlobalState";
  public static final String mam = "satisfiedGlobalState";
  public static final String man = "unsatisfiedStateIcon";
  public static final String mao = "halfSatisfiedStateIcon";
  public static final String maq = "satisfiedStateIcon";
  public static final String mar = "globalStateIcon";
  public static final String gjB = "nation";
  public static final String RI = "description";
  public static final String mas = "isStatic";
  public static final String bC = "name";
  public static final String mat = "job";
  public static final String csl = "sex";
  public static final String mau = "height";
  public static final String mav = "weight";
  public static final String maw = "customDescription";
  public static final String may = "secrets";
  public static final String maz = "numSecrets";
  public static final String maA = "unlockedSecrets";
  public static final String dtG = "territoryName";
  public static final String maB = "territoryRecommendedLevel";
  public static final String maC = "illustrationUrl";
  public static final String[] bF = { "boughtClimates", "boughtChallenges", "boughtBuffs", "currentProtector", "animation", "challengeInventory", "buffInventory", "climateInventory", "walletHandler", "challengeObjInventory", "buffObjInventory", "climateObjInventory", "nation", "description", "isStatic", "job", "sex", "height", "weight", "customDescription", "secrets", "buffList", "illustrationUrl", "territoryRecommendedLevel" };
  public static final byte maD = 2;

  public void initialize()
  {
    biI.fzg.a(this);
  }

  public void a(cWT paramcWT) {
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("isStatic"))
      return Boolean.valueOf(Vn());
    if (paramString.equals("name"))
      return bU.fH().b(48, CB(), new Object[0]);
    if (paramString.equals("illustrationUrl")) {
      return ay.bd().n(ctr.idk.hJ(CB()));
    }
    return null;
  }

  public abstract int CB();

  public abstract boolean Vn();

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

  protected void djO() {
    dLE.doY().a(this, bF);
  }

  public ahm djP()
  {
    return a(CB(), aDD.dYy);
  }

  public abstract ahm a(int paramInt, aDD paramaDD);

  public abstract bva qv();
}