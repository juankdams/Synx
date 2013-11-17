import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StorageBoxBinaryData;

final class beZ
  implements gd
{
  public void a(StorageBoxBinaryData paramStorageBoxBinaryData)
  {
    ChaosParamBinaryData localChaosParamBinaryData = paramStorageBoxBinaryData.gD();
    TU localTU = new TU(paramStorageBoxBinaryData.getId(), paramStorageBoxBinaryData.gC(), TO.b(localChaosParamBinaryData), TO.a(localChaosParamBinaryData));

    for (SI localSI : paramStorageBoxBinaryData.bfp()) {
      localTU.b(new cLD(localSI.getUid(), localSI.afS(), localSI.afR()));
    }
    aKY.epr.a(localTU);
  }
}