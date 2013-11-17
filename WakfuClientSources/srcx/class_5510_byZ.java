import com.ankamagames.wakfu.client.binaryStorage.DecorationInteractiveElementParamBinaryData;
import org.apache.log4j.Logger;

final class byZ
  implements gd
{
  public void a(DecorationInteractiveElementParamBinaryData paramDecorationInteractiveElementParamBinaryData)
  {
    int i = paramDecorationInteractiveElementParamBinaryData.getId();
    int[] arrayOfInt = paramDecorationInteractiveElementParamBinaryData.aju();
    Ka[] arrayOfKa = new Ka[arrayOfInt.length];
    for (int j = 0; j < arrayOfInt.length; j++) {
      Ka localKa = Ka.fv(arrayOfInt[j]);
      if (localKa != null)
        arrayOfKa[j] = localKa;
      else {
        TO.ch().error("L'id de gemme id=" + arrayOfInt[j] + " pour le paramètrage de décoration id=" + i + " ne correspond pas à une gemme valide");
      }
    }
    aKY.epr.a(new cxh(i, arrayOfKa));
  }
}