import com.ankamagames.wakfu.client.binaryStorage.EmoteBinaryData;
import org.apache.log4j.Logger;

class dxS
  implements gd
{
  dxS(uC paramuC)
  {
  }

  public void d(EmoteBinaryData paramEmoteBinaryData)
  {
    switch (paramEmoteBinaryData.getType()) {
    case 0:
      uC.ch().error("Emote de type invalide id=" + paramEmoteBinaryData.getId());
      break;
    case 1:
      bmJ.fFu.a(paramEmoteBinaryData);
      break;
    case 2:
      bmJ.fFu.b(paramEmoteBinaryData);
    }
  }
}