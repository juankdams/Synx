import com.ankamagames.wakfu.client.binaryStorage.GemAndPowderBinaryData;
import org.apache.log4j.Logger;

class tm
  implements gd
{
  tm(aEK paramaEK)
  {
  }

  public void a(GemAndPowderBinaryData paramGemAndPowderBinaryData)
  {
    bBn localbBn = Hh.QM().dh(paramGemAndPowderBinaryData.getId());
    if (localbBn == null) {
      aEK.ch().warn("Impossible de trouver la gemme/poudre d'id " + paramGemAndPowderBinaryData.getId());
      return;
    }
    try
    {
      Bd.bwT.a(localbBn.bKD(), localbBn.bKs(), localbBn.nU(), localbBn.getId());
    } catch (IllegalArgumentException localIllegalArgumentException) {
      aEK.ch().error("Gemme d'id " + localbBn.getId() + " - " + localIllegalArgumentException.getMessage(), localIllegalArgumentException);
    }
  }
}