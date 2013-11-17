import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.StoolInteractiveElementParamBinaryData;
import org.apache.log4j.Logger;

final class bzc
  implements gd
{
  public void a(StoolInteractiveElementParamBinaryData paramStoolInteractiveElementParamBinaryData)
  {
    int i = paramStoolInteractiveElementParamBinaryData.getId();
    ChaosParamBinaryData localChaosParamBinaryData = paramStoolInteractiveElementParamBinaryData.gD();
    try {
      bZA localbZA = aVj.hn(paramStoolInteractiveElementParamBinaryData.gB());
      aKY.epr.a(new dNH(i, localbZA, paramStoolInteractiveElementParamBinaryData.gC(), TO.b(localChaosParamBinaryData), TO.a(localChaosParamBinaryData)));
    }
    catch (Exception localException) {
      TO.ch().error("", localException);
    }
  }
}