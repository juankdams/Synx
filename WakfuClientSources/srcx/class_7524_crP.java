import java.util.ArrayList;
import java.util.Collections;

public class crP
{
  public static String d(cig paramcig)
  {
    aRH localaRH = paramcig.cjZ();
    lZ locallZ;
    Object localObject;
    switch (cHq.cGB[localaRH.Rf().ordinal()]) {
    case 1:
      locallZ = new lZ();
      localObject = (ckY)localaRH;
      dBY localdBY = ((ckY)localObject).cmS();
      locallZ.a(bU.fH().getString("storageCompartmentBonusDesc", new Object[] { Short.valueOf(localdBY.lKr) }));
      return locallZ.tP();
    case 2:
      locallZ = new lZ();
      localObject = (cnW)localaRH;
      int i = ((cnW)localObject).yR();
      dpI localdpI = ciQ.ckL().nc(i);
      cJH localcJH = new cJH(Collections.singletonList(localdpI), 0, (short)0);
      ArrayList localArrayList = localcJH.cAK();
      int j = 0; for (int k = localArrayList.size(); j < k; j++) {
        locallZ.a((CharSequence)localArrayList.get(j));
      }
      return locallZ.tP();
    case 3:
      return bU.fH().getString("guildBonus.increaseMaxAuthorizedEvolution");
    case 4:
      return bU.fH().getString("guildBonus.reduceLearningDuration");
    case 5:
      return bU.fH().getString("guildBonus.setWeeklyPointsLimit");
    case 6:
      return bU.fH().getString("guildBonus.setPointsEarnedFactor");
    case 7:
      return bU.fH().b(138, paramcig.getId(), new Object[0]);
    }
    return null;
  }

  public static boolean a(bqd parambqd, cig paramcig, cyS paramcyS) {
    double d = paramcyS.aNv().bwQ();
    bMG localbMG = byv.bFN().bFO().bSt();
    float f = ((ud)localbMG).CJ();
    return alL.b(parambqd, paramcig, d * f);
  }

  public static cYq b(bqd parambqd, cig paramcig, cyS paramcyS) {
    double d = paramcyS.aNv().bwQ();
    bMG localbMG = byv.bFN().bFO().bSt();
    float f = ((ud)localbMG).CJ();
    return alL.a(parambqd, paramcig, d * f);
  }

  public static cYq c(bqd parambqd, cig paramcig, cyS paramcyS) {
    return alL.d(parambqd, paramcig, paramcyS.aNv().bwS());
  }

  public static boolean e(cig paramcig) {
    return (paramcig.cjX()) || (paramcig.bkM());
  }
}