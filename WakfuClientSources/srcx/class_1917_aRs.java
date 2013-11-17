import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class aRs extends alA
{
  private static final Logger K = Logger.getLogger(aRs.class);
  public static final String eOs = "animatedElementViewer";
  public static final String dCP = "WorldLoading";
  private static final aRs eOt = new aRs();
  private String eOu;
  private String eOv;
  private int hj;

  public static aRs bhJ()
  {
    return eOt;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, int paramInt4)
  {
    bd(paramInt1, paramInt2);
    jc(paramInt3);
    this.eOu = paramString1;
    this.eOv = paramString2;
    this.hj = paramInt4;
    cr((paramString1 != null) || (paramString2 != null));
  }

  public void bhK()
  {
    a(1000, 1000, 0, null, null, 0);
  }

  protected dnq ayj() {
    return WakfuClientInstance.awy();
  }

  private void bhL() {
    aNL localaNL = cBQ.cxL().a("progressDialog", VV.dJ("progressDialog"), 8448L, (short)19500);

    auC localauC = (auC)localaNL.getElementMap().fi("animatedElementViewer");
    localauC.setStyle("WorldLoading");
    localauC.setAnimName(this.eOu);
  }

  private void bhM() {
    try {
      String str = ay.bd().getString("videosPath");
      str = String.format(str, new Object[] { this.eOv });
      aNP.beQ().setVideoPath(str);
      aNP.beQ().c(this.cQs);
      byv.bFN().a(aNP.beQ());

      IH localIH = IH.Sd();

      K.info("darkscreen- Condition startVideoTransition");
      localIH.a(new clO(this, localIH));
    }
    catch (bdh localbdh)
    {
      K.error("Impossible de récupérer le chemin vers les videos");
    }
  }

  protected final void ayl() {
    try {
      if (this.eOu != null)
        bhL();
      else if (this.eOv != null) {
        bhM();
      }

      if (this.hj != 0)
        aWc.blo().oc(this.hj);
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  private void bhN() {
    cBQ.cxL().mW("progressDialog");
  }

  private void bhO()
  {
  }

  protected final void ayk() {
    try {
      bhN();
      bhO();
      aWc.blo().stopLoading();
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  public void nL(int paramInt)
  {
    cjY localcjY = cjY.clY();
    int i;
    int j;
    int k;
    String str1;
    String str2;
    int m;
    if (paramInt == -32768) {
      i = 1000;
      j = 1000;
      k = 0;
      str1 = null;
      str2 = null;
      m = 0;
    } else {
      i = localcjY.clZ();
      j = localcjY.cma();
      k = localcjY.cmb();
      str1 = localcjY.cmc();
      str2 = localcjY.cmd();
      m = localcjY.getSoundId();
    }

    bhK();
    localcjY.reset();
  }
}