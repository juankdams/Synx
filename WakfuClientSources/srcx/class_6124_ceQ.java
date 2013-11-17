import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public abstract class ceQ extends azx
{
  private static final Logger K = Logger.getLogger(ceQ.class);
  public static final String hgu = "score";
  public static final String aLi = "firstRankReward";
  public static final String aLj = "secondRankReward";
  public static final String aLk = "thirdRankReward";
  public static final String hzm = "finalReward";
  public static final String hzn = "hasRewards";
  public static final String hzo = "hasMoreThanOneReward";
  public static final String hzp = "resultDescriptionIconUrl";
  private long eaM;
  private Ym hzq = null;

  public Object getFieldValue(String paramString) {
    if (paramString.equals("score"))
      return Long.valueOf(this.eaM);
    Object localObject1;
    Object localObject2;
    if (paramString.equals("resultDescriptionIconUrl")) {
      localObject1 = qn.xw().cl(yC());
      localObject2 = auO();
      if ((localObject1 == null) || (!((dDU)localObject1).EI().cKU())) {
        return ay.bd().a("challengeResultQualityIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(dgR.lbY.bJ()) });
      }

      int i = ((amY)localObject2).azJ();
      if (i <= 0) {
        return ay.bd().a("challengeResultQualityIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(dgR.lcb.bJ()) });
      }
      if (i == 1) {
        return ay.bd().a("challengeResultQualityIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(dgR.lbY.bJ()) });
      }

      float f = (i - 3) / (((amY)localObject2).azM() - 3);
      if ((i == 2) || (i == 3))
        return ay.bd().a("challengeResultQualityIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(dgR.lbZ.bJ()) });
      if (f <= 0.5D) {
        return ay.bd().a("challengeResultQualityIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(dgR.lca.bJ()) });
      }
      return ay.bd().a("challengeResultQualityIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(dgR.lcb.bJ()) });
    }
    ArrayList localArrayList;
    Aa localAa;
    if (paramString.equals("firstRankReward")) {
      if (vc(yC())) {
        return new dfv();
      }
      localObject1 = auO();
      if (localObject1 == null) {
        localObject2 = qn.xw().cl(yC());
        localArrayList = ((dDU)localObject2).cfd();
        if ((localArrayList == null) || (localArrayList.size() < 1)) {
          return null;
        }

        localAa = (Aa)localArrayList.get(0);
        return aUi.eUP.a(localAa.getId(), localAa);
      }
      return ((amY)localObject1).jg(0);
    }if (paramString.equals("secondRankReward")) {
      localObject1 = auO();
      if (localObject1 == null) {
        localObject2 = qn.xw().cl(yC());
        localArrayList = ((dDU)localObject2).cfd();
        if ((localArrayList == null) || (localArrayList.size() < 2)) {
          return null;
        }

        localAa = (Aa)localArrayList.get(1);
        return aUi.eUP.a(localAa.getId(), localAa);
      }
      return ((amY)localObject1).jg(1);
    }if (paramString.equals("thirdRankReward")) {
      localObject1 = auO();
      if (localObject1 == null) {
        localObject2 = qn.xw().cl(yC());
        localArrayList = ((dDU)localObject2).cfd();
        if ((localArrayList == null) || (localArrayList.size() < 3)) {
          return null;
        }

        localAa = (Aa)localArrayList.get(2);
        return aUi.eUP.a(localAa.getId(), localAa);
      }
      return ((amY)localObject1).jg(2);
    }if (paramString.equals("finalReward")) {
      if (vc(yC())) {
        return new dfv();
      }
      localObject1 = auO();
      return ((amY)localObject1).azK();
    }if (paramString.equals("hasRewards")) {
      localObject1 = qn.xw().cl(yC());
      return Boolean.valueOf(!((dDU)localObject1).cfd().isEmpty());
    }if (paramString.equals("hasMoreThanOneReward")) {
      localObject1 = qn.xw().cl(yC());
      return Boolean.valueOf(((dDU)localObject1).cfd().size() > 1);
    }

    return super.getFieldValue(paramString);
  }

  public void chL() {
    dNR localdNR = vb(yC());
    if (localdNR != null) {
      if ((localdNR.cKo() != null) && (localdNR.cKo().length() > 0)) {
        this.eaM = auO().eN(localdNR.cKo());
      }

      String str = localdNR.dqc();
      Matcher localMatcher = cvt.igq.matcher(str);
      if (localMatcher.find())
        this.eaM = auO().eN(localMatcher.group().substring(1, localMatcher.group().length() - 1));
    }
  }

  protected String getName()
  {
    dDU localdDU = qn.xw().cl(yC());
    return localdDU.dfQ();
  }

  protected String fJ()
  {
    dDU localdDU = qn.xw().cl(yC());
    try {
      return String.format(ay.bd().getString("challengeCategoryIconsPath"), new Object[] { Byte.valueOf(localdDU.EH().bJ()) });
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }return null;
  }

  public int getId()
  {
    return yC();
  }

  public int getType()
  {
    return 2;
  }

  protected String aLi()
  {
    amY localamY = auO();
    if (localamY == null) {
      return null;
    }

    short s = localamY.azB();
    return s > 0 ? bN(s) : null;
  }

  protected ArrayList aLj()
  {
    int i = yC();
    dNR localdNR = vb(i);

    ArrayList localArrayList = new ArrayList();
    if (localdNR != null) {
      cvt localcvt = aUi.eUP.ca(i, localdNR.getId());
      localArrayList.add(localcvt);
    } else {
      localArrayList.add(new to(i));
    }
    return localArrayList;
  }

  private dNR vb(int paramInt) {
    dNR localdNR = qn.xw().cm(paramInt);
    if (localdNR == null) {
      localdNR = qn.xw().cn(paramInt);
    }
    return localdNR;
  }

  protected String getStyle() {
    dDU localdDU = qn.xw().cl(yC());
    return "challengeCategory" + localdDU.EH().bJ();
  }

  protected String aLk()
  {
    dDU localdDU = qn.xw().cl(yC());
    if ((localdDU == null) || (!localdDU.EI().cKU())) {
      return null;
    }

    amY localamY = auO();
    if (localamY == null) {
      return null;
    }
    short s = localamY.azJ();
    if (s == -2)
      return bU.fH().getString("challenge.ranking.loser");
    if (s == -1) {
      return bU.fH().getString("challenge.ranking.unknown");
    }
    lZ locallZ = new lZ();
    locallZ.o(s).a("/").bw(localamY.azM());
    return locallZ.tP();
  }

  private static String bN(short paramShort)
  {
    int i = paramShort / 60;
    int j = paramShort - 60 * i;
    return String.format("%d:%s", new Object[] { Integer.valueOf(i), "0" + j });
  }

  public void bot() {
    aLm();
    aLn();
    aLl();
  }

  public void btC()
  {
  }

  public void btG()
  {
  }

  public void btH()
  {
  }

  protected abstract amY auO();

  public abstract int yC();

  protected String aLh() {
    dDU localdDU = qn.xw().cl(yC());
    return localdDU.dfS();
  }

  private static boolean vc(int paramInt) {
    return aUP.c(ddR.kXL, paramInt);
  }
}