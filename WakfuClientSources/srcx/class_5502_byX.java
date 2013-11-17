import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StreetLightInteractiveElementParamBinaryData;

final class byX
  implements gd
{
  public void a(StreetLightInteractiveElementParamBinaryData paramStreetLightInteractiveElementParamBinaryData)
  {
    int i = paramStreetLightInteractiveElementParamBinaryData.getId();
    int j = paramStreetLightInteractiveElementParamBinaryData.aBc();
    float f = paramStreetLightInteractiveElementParamBinaryData.aBd();
    int k = paramStreetLightInteractiveElementParamBinaryData.LI();
    boolean bool1 = paramStreetLightInteractiveElementParamBinaryData.aQe();
    int m = paramStreetLightInteractiveElementParamBinaryData.aBf();
    boolean bool2 = paramStreetLightInteractiveElementParamBinaryData.aBg();
    int n = paramStreetLightInteractiveElementParamBinaryData.aBh() * 1000;
    int i1 = paramStreetLightInteractiveElementParamBinaryData.aBi();
    boolean bool3 = paramStreetLightInteractiveElementParamBinaryData.aBj();
    int i2 = paramStreetLightInteractiveElementParamBinaryData.aBk() * 1000;
    ChaosParamBinaryData localChaosParamBinaryData = paramStreetLightInteractiveElementParamBinaryData.gD();
    aPb localaPb = TO.b(localChaosParamBinaryData);
    int i3 = TO.a(localChaosParamBinaryData);

    aoQ localaoQ = new aoQ(i, j, f, k, bool1, m, bool2, n, i1, bool3, i2, localaPb, i3);

    aKY.epr.a(localaoQ);
  }
}