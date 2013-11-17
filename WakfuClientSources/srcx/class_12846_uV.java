import com.ankamagames.wakfu.client.binaryStorage.ClimateBonusBinaryData;
import org.apache.log4j.Logger;

class uV
  implements gd
{
  uV(bVB parambVB)
  {
  }

  public void a(ClimateBonusBinaryData paramClimateBonusBinaryData)
  {
    int i = paramClimateBonusBinaryData.acm();
    String str = paramClimateBonusBinaryData.uL();
    float f1 = paramClimateBonusBinaryData.bwd();
    float f2 = paramClimateBonusBinaryData.bwf();
    float f3 = paramClimateBonusBinaryData.bwe();
    int j = paramClimateBonusBinaryData.getDuration();
    short s = paramClimateBonusBinaryData.bwc();
    try
    {
      bZA localbZA = aVj.hn(str);
      but.gdO.a(i, f1, f2, f3, localbZA, j, s);
    } catch (Exception localException) {
      bVB.K.error("Exception levée lors de l'interprétation du critère : " + str);
    }
  }
}