import java.util.ArrayList;
import org.apache.log4j.Logger;

class ahU
  implements dFU
{
  public boolean a(UJ paramUJ)
  {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 23)) {
      aYJ.ch().warn("[GUILD_STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
      return false;
    }
    ArrayList localArrayList = paramUJ.aie();
    bbO localbbO = paramUJ.Fe();

    ajT.axh().cancel();

    Nj.Xh().Xj();
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      ((cfZ)localdKc); cZl localcZl = cfZ.a((dya)localArrayList.get(i));
      Nj.Xh().b(localcZl);
    }
    Nj.Xh().a(localbbO);
    aYJ.ch().info("[GUILD_STORAGE_BOX]  Contenu reçu");
    return false;
  }

  public int vN() {
    return 20078;
  }
}