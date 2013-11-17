import com.ankamagames.wakfu.client.binaryStorage.GemBackgroundInteractiveElementParamBinaryData;
import org.apache.log4j.Logger;

final class byW
  implements gd
{
  public void a(GemBackgroundInteractiveElementParamBinaryData paramGemBackgroundInteractiveElementParamBinaryData)
  {
    int i = paramGemBackgroundInteractiveElementParamBinaryData.getId();
    int j = paramGemBackgroundInteractiveElementParamBinaryData.HX();
    int[] arrayOfInt = paramGemBackgroundInteractiveElementParamBinaryData.aju();
    Ka[] arrayOfKa = new Ka[arrayOfInt.length];
    for (int k = 0; k < arrayOfInt.length; k++) {
      Ka localKa = Ka.fv(arrayOfInt[k]);
      if (localKa != null)
        arrayOfKa[k] = localKa;
      else {
        TO.ch().error("L'id de gemme id=" + arrayOfInt[k] + " pour le paramètrage de décoration id=" + i + " ne correspond pas à une gemme valide");
      }
    }
    aKY.epr.a(new cXc(i, arrayOfKa, j));
  }
}