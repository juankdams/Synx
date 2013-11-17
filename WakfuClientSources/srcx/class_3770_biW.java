import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingVisualDefinitionBinaryData;

class biW
  implements gd
{
  biW(ale paramale)
  {
  }

  public void a(HavenWorldBuildingVisualDefinitionBinaryData paramHavenWorldBuildingVisualDefinitionBinaryData)
  {
    KJ localKJ = new KJ(paramHavenWorldBuildingVisualDefinitionBinaryData.mP());
    dM.Uk.a(localKJ);

    wY[] arrayOfwY1 = paramHavenWorldBuildingVisualDefinitionBinaryData.mQ();
    for (wY localwY : arrayOfwY1) {
      cYk localcYk = new cYk(localwY.FX(), localwY.FY(), (short)localwY.FZ());
      localKJ.a(new cZw(localwY.oc(), localwY.getAnimName(), localwY.FV(), localwY.bZ(), localwY.bY(), localcYk, CG.eu(localwY.FW())));
    }
  }
}