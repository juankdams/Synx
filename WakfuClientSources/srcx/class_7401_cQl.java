import com.ankamagames.wakfu.client.binaryStorage.AchievementBinaryData;
import org.apache.log4j.Logger;

class cQl
  implements gd
{
  cQl(cdb paramcdb)
  {
  }

  public void a(AchievementBinaryData paramAchievementBinaryData)
  {
    int i = paramAchievementBinaryData.getId();
    boolean bool1 = paramAchievementBinaryData.isVisible();

    String str = paramAchievementBinaryData.gB();
    bZA localbZA;
    try
    {
      localbZA = aVj.hn(str);
    } catch (Exception localException) {
      localbZA = null;
      cdb.K.error("", localException);
    }

    cYq localcYq = null;
    kb localkb = null;
    if (paramAchievementBinaryData.duD() != 0L) {
      localcYq = cYq.jq(paramAchievementBinaryData.duD());
      localkb = kb.I(paramAchievementBinaryData.duE());
    }

    int j = paramAchievementBinaryData.dgl() ? -1 : paramAchievementBinaryData.dgo();

    boolean bool2 = dHn.lSk.a(i, paramAchievementBinaryData.aTz(), bool1, paramAchievementBinaryData.dgi(), null, null, localbZA, paramAchievementBinaryData.getDuration() * 1000, paramAchievementBinaryData.dtV() * 1000L, paramAchievementBinaryData.dgk(), paramAchievementBinaryData.bnc(), paramAchievementBinaryData.dgl(), paramAchievementBinaryData.dgm(), paramAchievementBinaryData.dgn(), paramAchievementBinaryData.dgj(), j, localcYq, localkb, paramAchievementBinaryData.isActive(), paramAchievementBinaryData.dgp(), paramAchievementBinaryData.oc());

    if (!bool2) {
      cdb.K.error("[STOP] Erreur durant l'enregistrement d'un achievement");
    }

    a(paramAchievementBinaryData, i);
    b(paramAchievementBinaryData, i);
  }

  private void a(AchievementBinaryData paramAchievementBinaryData, int paramInt) {
    for (drY localdrY : paramAchievementBinaryData.duB())
    {
      boolean bool1 = localdrY.avy();
      aBO[] arrayOfaBO1 = localdrY.cYJ();
      cSi localcSi = new cSi(arrayOfaBO1.length);

      for (aBO localaBO : arrayOfaBO1) {
        localcSi.add(localaBO.aNQ());
      }

      boolean bool2 = localdrY.cYF();
      ??? = localdrY.cYG();
      short s1 = localdrY.cYH();
      short s2 = localdrY.avV();
      short s3 = localdrY.cYI();

      if (!dHn.lSk.a(localdrY.getId(), paramInt, localcSi.isEmpty() ? null : localcSi.cIf(), null, null, bool1, bool2, ???, s1, s2, s3))
        cdb.K.error("[STOP] Erreur durant l'enregistrement d'un objectif");
    }
  }

  private void b(AchievementBinaryData paramAchievementBinaryData, int paramInt)
  {
    for (dnj localdnj : paramAchievementBinaryData.duC()) {
      bSa localbSa = bSa.tT(localdnj.getType());
      if (!dHn.lSk.a(localdnj.getId(), paramInt, localbSa, localdnj.cUE()))
        cdb.K.error("[STOP] Erreur durant l'enregistrement d'une récompense d'achievement");
    }
  }
}