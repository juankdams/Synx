import org.apache.log4j.Logger;

class uD
  implements dFU
{
  public boolean a(ayq paramayq)
  {
    byz localbyz = byv.bFN().bFO();
    dKc localdKc = localbyz.bSe();
    if (localdKc.fU() != 23) {
      aYJ.ch().warn("[GUILD_STORAGE_BOX] Reception d'un message de taille dans un contexte ne correspondant pas");
      return false;
    }
    aMY localaMY = paramayq.aKA();
    Nj.Xh().a(paramayq.aKz(), localaMY, paramayq.Fd());

    aYJ.ch().info("[GUILD_STORAGE_BOX]  Taille reçue");
    return false;
  }

  public int vN() {
    return 20076;
  }
}