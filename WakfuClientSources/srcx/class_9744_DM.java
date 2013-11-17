import org.apache.log4j.Logger;

public class DM
  implements cvW
{
  private static final Logger K = Logger.getLogger(DM.class);
  public static final DM bIC = new DM();

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
    case 15730:
      bXc localbXc = (bXc)paramcWG;
      dKc localdKc = localbyz.bSe();
      if (localdKc.fU() != 17) {
        K.warn("Reception d'un message de contenu de réceptacle ne dans un contexte ne correspondant pas");
        return false;
      }
      ((dTW)localdKc).aR(localbXc.ccq());
      K.info("Contenu du réceptacle reçu");
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