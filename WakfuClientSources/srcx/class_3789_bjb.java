import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingBinaryData;
import org.apache.log4j.Logger;

class bjb
  implements gd
{
  bjb(ale paramale)
  {
  }

  public void a(HavenWorldBuildingBinaryData paramHavenWorldBuildingBinaryData)
  {
    dde localdde = new dde((short)paramHavenWorldBuildingBinaryData.getId(), paramHavenWorldBuildingBinaryData.bVJ(), paramHavenWorldBuildingBinaryData.ahA(), paramHavenWorldBuildingBinaryData.aDI(), paramHavenWorldBuildingBinaryData.bZC(), paramHavenWorldBuildingBinaryData.bcY(), paramHavenWorldBuildingBinaryData.bZB(), paramHavenWorldBuildingBinaryData.bvP());

    ars.dzL.a(localdde);

    ctw[] arrayOfctw = paramHavenWorldBuildingBinaryData.bZD();
    Object localObject4;
    for (Object localObject2 : arrayOfctw) {
      localObject4 = new bfx(localObject2.apa(), new cYk(localObject2.FX(), localObject2.FY(), (short)localObject2.FZ()));
      localdde.b((bfx)localObject4);
    }
    ale.a(this.fzr, paramHavenWorldBuildingBinaryData, localdde);

    for (int k : paramHavenWorldBuildingBinaryData.vD()) {
      localObject4 = ciQ.ckL().vt(k);
      if (localObject4 != null)
        localdde.a((dpI)localObject4);
      else {
        ale.i().error("Problème de chargmeent de Building " + paramHavenWorldBuildingBinaryData.getId());
      }
    }

    for (Object localObject3 : paramHavenWorldBuildingBinaryData.bZF())
      localdde.zK(localObject3.acm());
  }
}