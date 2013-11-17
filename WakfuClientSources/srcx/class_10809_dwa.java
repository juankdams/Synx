import java.util.ArrayList;

final class dwa
  implements Runnable
{
  dwa(int paramInt)
  {
  }

  public void run()
  {
    int i = (!LJ.Wo().cE("followedAchievementsDialog")) || (LJ.Wo().cF("followedAchievementsDialog")) ? 1 : 0;

    String str = i != 0 ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";

    cpa localcpa = cBQ.cxL().coO().nf(str);
    if (localcpa == null) {
      return;
    }
    at localat = (at)localcpa.fi("achievementsList");
    ArrayList localArrayList = localat.getItems();

    int j = -1;
    int k = 0; for (int m = localArrayList.size(); k < m; k++) {
      localObject = (ckJ)localArrayList.get(k);
      if ((localObject != null) && (((ckJ)localObject).getId() == this.lBn))
      {
        j = k;
        break;
      }
    }
    if (j == -1) {
      return;
    }

    axU localaxU = (axU)localat.getRenderables().get(j);
    if (localaxU == null) {
      return;
    }

    dOc localdOc = (dOc)localaxU.getInnerElementMap().fi("environmentQuestContainer");

    Object localObject = new cag();
    ((cag)localObject).aJ();
    ((cag)localObject).setFile("6001051.xps");
    ((cag)localObject).setAlignment(aFG.eck);
    localdOc.getAppearance().a((aNL)localObject);
  }
}