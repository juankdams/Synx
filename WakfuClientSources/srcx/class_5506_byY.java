import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.CraftInteractiveElementParamBinaryData;

final class byY
  implements gd
{
  public void a(CraftInteractiveElementParamBinaryData paramCraftInteractiveElementParamBinaryData)
  {
    int i = paramCraftInteractiveElementParamBinaryData.getId();
    int j = paramCraftInteractiveElementParamBinaryData.cpJ();
    int k = paramCraftInteractiveElementParamBinaryData.LI();
    int m = paramCraftInteractiveElementParamBinaryData.Uq();
    int[] arrayOfInt = paramCraftInteractiveElementParamBinaryData.cxE();
    ChaosParamBinaryData localChaosParamBinaryData = paramCraftInteractiveElementParamBinaryData.gD();
    aKY.epr.a(new dnA(i, j, m, arrayOfInt, k, TO.b(localChaosParamBinaryData), TO.a(localChaosParamBinaryData)));
  }
}