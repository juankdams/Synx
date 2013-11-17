import com.ankamagames.wakfu.client.binaryStorage.AptitudeBinaryData;
import org.apache.log4j.Logger;

class dwD
  implements gd
{
  dwD(dOR paramdOR)
  {
  }

  public void a(AptitudeBinaryData paramAptitudeBinaryData)
  {
    bJw localbJw = dOR.a(this.lCh, paramAptitudeBinaryData);
    bto.bBQ().a(localbJw);

    for (int k : paramAptitudeBinaryData.vD()) {
      dpI localdpI = ciQ.ckL().vt(k);
      if (localdpI != null)
        localbJw.a(localdpI);
      else
        dOR.i().error("Problème de chargmeent de ReferenceAptitude " + paramAptitudeBinaryData.getId());
    }
  }
}