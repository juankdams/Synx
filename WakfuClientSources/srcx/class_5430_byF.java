import com.ankamagames.wakfu.client.binaryStorage.ChaosParamBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.DoorInteractiveElementParamBinaryData;
import org.apache.log4j.Logger;

final class byF
  implements gd
{
  public void a(DoorInteractiveElementParamBinaryData paramDoorInteractiveElementParamBinaryData)
  {
    ChaosParamBinaryData localChaosParamBinaryData = null;
    bZA localbZA;
    try
    {
      localbZA = aVj.hn(paramDoorInteractiveElementParamBinaryData.gB());
    } catch (Exception localException) {
      TO.ch().error("Impossible de compiler le critère de la porte " + paramDoorInteractiveElementParamBinaryData.getId(), localException);
      return;
    }
    aKY.epr.a(new aDG(paramDoorInteractiveElementParamBinaryData.getId(), paramDoorInteractiveElementParamBinaryData.gC(), paramDoorInteractiveElementParamBinaryData.ahy(), paramDoorInteractiveElementParamBinaryData.ahz(), paramDoorInteractiveElementParamBinaryData.ahA(), localbZA, TO.b(localChaosParamBinaryData), TO.a(localChaosParamBinaryData)));
  }
}