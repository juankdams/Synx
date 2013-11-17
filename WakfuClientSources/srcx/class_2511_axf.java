import org.apache.log4j.Logger;

class axf
  implements dFU
{
  public boolean a(vR paramvR)
  {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if ((localdKc == null) || (localdKc.fU() != 23)) {
      aYJ.ch().warn("[GUILD_STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
      return false;
    }

    int i = paramvR.Fd();
    bbO localbbO = paramvR.Fe();

    Nj.Xh().fO(i);
    Nj.Xh().a(localbbO);
    aYJ.ch().info("[GUILD_STORAGE_BOX]  Contenu reçu");
    return false;
  }

  public int vN() {
    return 20080;
  }
}