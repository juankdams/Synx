import com.ankamagames.wakfu.client.binaryStorage.DialogBinaryData;
import org.apache.log4j.Logger;

class czi
  implements gd
{
  czi(aQi paramaQi)
  {
  }

  public void a(DialogBinaryData paramDialogBinaryData)
  {
    cdf localcdf = new cdf(paramDialogBinaryData.getId());
    agL.daF.a(localcdf);

    for (KE localKE : paramDialogBinaryData.FU()) { int k = localKE.getId();
      bZA localbZA;
      try {
        localbZA = aVj.hn(localKE.gB());
      } catch (Exception localException) {
        aQi.ch().error("[LD] Impossible de compiler le critère " + localKE.gB() + " sur la réponse " + k + " du dialog " + paramDialogBinaryData.getId(), localException);

        continue;
      }

      cwR localcwR = new cwR(k, localbZA, (byte)localKE.getType());
      localcdf.a(localcwR);
    }
  }
}