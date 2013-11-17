import org.apache.log4j.Logger;

public class dkY
  implements cvW
{
  private static final Logger K = Logger.getLogger(dkY.class);
  public static final dkY liy = new dkY();

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    K.trace("Frame de Browsing ajoutée");
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    K.trace("Frame de Browsing retirée");
  }

  public boolean a(cWG paramcWG) {
    byz localbyz = byv.bFN().bFO();
    switch (paramcWG.getId()) {
    case 15972:
      aKO localaKO = (aKO)paramcWG;
      dKc localdKc = localbyz.bSe();
      if (localdKc.fU() != 21) {
        K.warn("[STORAGE_BOX] Reception d'un message de contenu dans un contexte ne correspondant pas");
        return false;
      }
      cMu localcMu = ((BR)localdKc).a(localaKO.bcu());
      Nj.Xh().b(localcMu);
      K.info("[STORAGE_BOX]  Contenu reçu");
      return false;
    }

    return true;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}