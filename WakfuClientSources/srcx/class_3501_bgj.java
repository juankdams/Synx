import java.util.Locale;
import org.apache.log4j.Logger;

class bgj
  implements dkT
{
  bgj(aVQ paramaVQ, cew paramcew, bKm parambKm)
  {
  }

  public void a(int paramInt, String paramString)
  {
    this.bvZ.eq(this.bvZ.atp());

    if (paramInt == 8)
    {
      if (byv.bFN().c(apc.duD)) {
        aVQ.ch().error("Il ya déjà une requete de suppression de perso en attente dans le client");
        return;
      }

      byv.bFN().a(apc.duD);
      apc.duD.g(this.cxO.getId());
      cCT localcCT = new cCT();
      cFI localcFI = bU.fH().ajJ();
      localcCT.g(this.cxO.getId());
      localcCT.setLanguage(localcFI.cAZ().getLanguage());
      localcCT.ee((byte)1);
      byv.bFN().aJK().d(localcCT);
    }
    aVQ.a(this.fub, false);
  }
}