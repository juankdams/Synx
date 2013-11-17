import org.apache.log4j.Logger;

final class dpz
  implements Runnable
{
  public void run()
  {
    try
    {
      boolean bool = false;
      try {
        bool = ay.bd().getBoolean("autoLogin_selectCharacter");
      } catch (bdh localbdh) {
        pN.K.warn("Impossible de trouver la propriété 'autoLogin_selectCharacter' : initialisation par défaut à false.");
      }

      if (bool) {
        Thread.sleep(500L);

        bKm localbKm = (bKm)bXb.cci().ccn();
        if (localbKm != null) {
          cgZ localcgZ = new cgZ();
          localcgZ.s(localbKm);
          localcgZ.d(16514);
          cjO.clE().j(localcgZ);
        } else {
          Thread.sleep(500L);
          pN.a(pN.xb(), false);
        }
      } else {
        Thread.sleep(500L);
        pN.a(pN.xb(), false);
      }
    } catch (Exception localException) {
      pN.K.error("Erreur lors du choix du personnage.");
      pN.a(pN.xb(), false);
    }
  }
}