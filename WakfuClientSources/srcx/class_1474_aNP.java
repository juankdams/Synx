import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class aNP
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aNP.class);

  private static final aNP eub = new aNP();
  private String euc;
  private cXf cQs;
  private final Runnable eud = new cnD(this);
  private bnm N;

  public static aNP beQ()
  {
    return eub;
  }

  public boolean a(cWG paramcWG)
  {
    paramcWG.getId();

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void setVideoPath(String paramString) {
    this.euc = paramString;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.euc == null) {
        K.error("Impossible de charger la frame de lecture video sans définir la video à jouer");
        return;
      }

      this.N = new cnE(this);

      cBQ.cxL().a(this.N);

      bAU localbAU = WakfuClientInstance.awy().rs();
      dSz localdSz = WakfuClientInstance.awy().Dg();
      localbAU.a(localdSz);
      aWc.blo().av(false);

      if (!beR()) {
        byv.bFN().b(beQ());
      }
      cBQ.cxL().j("wakfu.videoLoading", Df.class);

      dLE.doY().t("isNewWorldReady", Boolean.valueOf(false));
      dka.cSF().a(this.eud, 500L);
    }
  }

  public void c(cXf paramcXf) {
    this.cQs = paramcXf;
  }

  private boolean beR() {
    try {
      aNL localaNL = cBQ.cxL().a("videoLoadingDialog", VV.dJ("videoLoadingDialog"), 8448L, (short)19500);

      dtz localdtz = (dtz)localaNL.getElementMap().fi("video");
      localdtz.setVideoPath(this.euc);
      localdtz.play();
      localdtz.setPaused(false);

      localdtz.a(new cnH(this));

      return true;
    } catch (Exception localException) {
      K.error("Erreur durant la tentative de lecture de la video " + this.euc, localException);
      cBQ.cxL().mW("videoLoadingDialog");
    }return false;
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      bAU localbAU = WakfuClientInstance.awy().rs();
      dSz localdSz = WakfuClientInstance.awy().Dg();
      localbAU.a(localdSz, false);

      aWc.blo().av(true);

      this.euc = null;
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("videoLoadingDialog");
      this.cQs = null;
      dLE.doY().removeProperty("isNewWorldReady");
      cBQ.cxL().mN("wakfu.videoLoading");
    }
  }
}