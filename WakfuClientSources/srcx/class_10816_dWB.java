import com.ankamagames.wakfu.client.binaryStorage.EffectGroupBinaryData;
import org.apache.log4j.Logger;

class dWB
  implements gd
{
  dWB(aTP paramaTP, aww paramaww)
  {
  }

  public void a(EffectGroupBinaryData paramEffectGroupBinaryData)
  {
    bOf localbOf = new bOf(paramEffectGroupBinaryData.getId());

    for (int k : paramEffectGroupBinaryData.vD()) {
      dpI localdpI = ciQ.ckL().vt(k);

      if (localdpI != null)
        localbOf.a(localdpI);
      else {
        aTP.ch().error("Problème de chargmeent de effectGruop " + paramEffectGroupBinaryData.getId());
      }

    }

    this.mwO.a(localbOf);
  }
}