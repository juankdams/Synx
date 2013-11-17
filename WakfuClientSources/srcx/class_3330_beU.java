import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.LootChestInteractiveElementParamBinaryData;
import org.apache.log4j.Logger;

final class beU
  implements gd
{
  public void a(LootChestInteractiveElementParamBinaryData paramLootChestInteractiveElementParamBinaryData)
  {
    int i = paramLootChestInteractiveElementParamBinaryData.getId();
    int j = paramLootChestInteractiveElementParamBinaryData.gC();
    int k = paramLootChestInteractiveElementParamBinaryData.qW();
    int m = paramLootChestInteractiveElementParamBinaryData.diN();
    int n = paramLootChestInteractiveElementParamBinaryData.diO();
    bZA localbZA = null;
    try {
      localbZA = aVj.hn(paramLootChestInteractiveElementParamBinaryData.uL());
    } catch (Exception localException) {
      TO.ch().error("Erreur à la compilation du critère du coffre de loot " + i);
      return;
    }
    ChaosParamBinaryData localChaosParamBinaryData = paramLootChestInteractiveElementParamBinaryData.gD();
    aKY.epr.a(new dJu(i, j, -9223372036854775808L, k, m, n, paramLootChestInteractiveElementParamBinaryData.ayP(), -32768, -9223372036854775808L, localbZA, TO.b(localChaosParamBinaryData), TO.a(localChaosParamBinaryData)));
  }
}