import com.ankamagames.wakfu.client.WakfuClientInstance;

public class asv
{
  public static void aEL()
  {
    byz localbyz = byv.bFN().bFO();
    boolean bool2 = localbyz.i(dKm.lXJ);
    boolean bool1;
    if (bool2) {
      bool1 = true;
    } else if (localbyz.aeQ() != null) {
      bool1 = false;
    } else {
      aIH localaIH = WakfuClientInstance.awy().awB();
      bool1 = localaIH.a(bmz.fEW);
    }

    dLE.doY().t("followedQuestsDisplay", Boolean.valueOf(bool1));
  }
}