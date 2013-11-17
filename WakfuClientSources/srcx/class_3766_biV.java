import com.ankamagames.wakfu.client.binaryStorage.HavenWorldBuildingCatalogBinaryData;

class biV
  implements gd
{
  biV(ale paramale)
  {
  }

  public void a(HavenWorldBuildingCatalogBinaryData paramHavenWorldBuildingCatalogBinaryData)
  {
    bOB localbOB = new bOB((short)paramHavenWorldBuildingCatalogBinaryData.getId(), paramHavenWorldBuildingCatalogBinaryData.aTz(), paramHavenWorldBuildingCatalogBinaryData.getOrder(), paramHavenWorldBuildingCatalogBinaryData.aTy(), paramHavenWorldBuildingCatalogBinaryData.aTA(), paramHavenWorldBuildingCatalogBinaryData.aTB());

    bGQ.gDB.cT(paramHavenWorldBuildingCatalogBinaryData.getId(), paramHavenWorldBuildingCatalogBinaryData.aTD());

    for (cqN localcqN : paramHavenWorldBuildingCatalogBinaryData.aTE()) {
      localbOB.dd(localcqN.aot(), localcqN.ajS());
    }
    ars.dzL.a(localbOB);
  }
}