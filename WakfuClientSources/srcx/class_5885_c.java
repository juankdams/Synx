import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.net.URL;
import org.apache.log4j.Logger;

public class c
  implements cvW
{
  private static final Logger K = Logger.getLogger(c.class);

  private static c L = new c();
  private static final int M = 366366;
  private bnm N;
  private auP O;
  private cjt P;
  private cSR Q;
  private aPy R;

  public c()
  {
    this.Q = new cSR();
  }

  public static c b()
  {
    return L;
  }

  public aPy c()
  {
    return this.R;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    switch (paramcWG.getId())
    {
    case 16403:
      byv.bFN().b(this);

      return false;
    case 17738:
      localObject1 = (nd)paramcWG;
      if (bqJ.bzC().bzE() != null)
        return false;
      cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.confirmBindedTest", new Object[] { ((nd)localObject1).uE().bwo().cmP() }), Cn.et(0), 2073L, 102, 1);

      localcKX.a(new cX(this, (nd)localObject1));

      return false;
    case 17739:
      localObject1 = bqJ.bzC().bzE();
      if (localObject1 == null)
        return false;
      try {
        bEs.bMK().d(((bln)localObject1).bwo(), f());
      } catch (Exception localException) {
        K.error("Exception", localException);
      }
      bqJ.bzC().bzD();
      return false;
    case 17731:
      localObject1 = (nd)paramcWG;

      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("<u>").append(((nd)localObject1).uE().bwp()).append("</u>\n");
      ((StringBuilder)localObject2).append(bU.fH().getString("options.enterKeysCombining"));

      dLE.doY().t("waitingForKeyTypedDescription", ((StringBuilder)localObject2).toString());
      dLE.doY().t("waitingForKeyTyped", Boolean.valueOf(true));

      this.P = new cjt(this, ((nd)localObject1).uE());
      WakfuClientInstance.awy().rs().a(this.P, true);

      return false;
    case 17732:
      localObject1 = (nd)paramcWG;

      localObject2 = ((nd)localObject1).uE().bwo();
      a((ckW)localObject2);
      a((ckW)localObject2, ((nd)localObject1).getStringValue());
      bqJ.bzC().bzD();

      return false;
    case 17733:
      localObject1 = cBQ.cxL().a(bU.fH().getString("question.restoreOptions"), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject1).a(new cW(this));

      return false;
    }

    return true;
  }

  public void d() {
    WakfuClientInstance.awy().awB().ckS();
    bEs localbEs = bEs.bMK();
    try {
      String str1 = ay.bd().getString("shortcutsFile");
      String str2 = ay.bd().getString("defaultShortcutsFile");

      localbEs.g(str2, false);
      String str3 = new URL(str1).getFile();

      dtb.dg(str3);
    } catch (Exception localException) {
      K.error("impossible de recharger le fichier de raccourcis par défaut");
    }
    bqJ.bzC().initialize();
    dLE.doY().a(bqJ.bzC(), bqJ.bzC().getFields());
    dLE.doY().a(WakfuClientInstance.awy().awB(), WakfuClientInstance.awy().awB().getFields());
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.O = new cV(this);

      bBq.bKG().a(this.O);

      this.N = new cU(this);

      cBQ.cxL().a(this.N);

      this.R = new aPy(WakfuClientInstance.awy().aww());
      dLE.doY().t("resolutionsManager", this.R);
      dLE.doY().t("waitingForKeyTyped", Boolean.valueOf(false));
      dLE.doY().t("shortcutOver", null);

      dLE.doY().t("options.numLOD", Integer.valueOf(3));

      dLE.doY().t("options.numFightLOD", Integer.valueOf(3));

      dLE.doY().t("options.graphicalPresets", aFp.values());

      cBQ.cxL().a("optionsDialog", VV.dJ("optionsDialog"), 256L, (short)26000);

      cBQ.cxL().j("wakfu.options", dtV.class);

      buj.bCk().a(cED.iyI, "optionsDialog");
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.Q.clear();

      cBQ.cxL().b(this.N);
      bBq.bKG().b(this.O);
      dLE.doY().removeProperty("waitingForKeyTyped");
      dLE.doY().removeProperty("shortcutOver");
      dLE.doY().removeProperty("options.numLOD");
      dLE.doY().removeProperty("resolutionsManager");
      this.R = null;
      WakfuClientInstance.awy().rs().a(this.P);

      cBQ.cxL().mW("optionsDialog");

      cBQ.cxL().mN("wakfu.options");

      dtV.setSelectedTabIndex(0);
    }
  }

  public dmn e()
  {
    return this.Q.yF();
  }

  private void a(ckW paramckW) {
    String str = paramckW.getId();
    if (str == null) {
      K.error("On tente de modifier un raccourci sans id !");
      return;
    }
    ckW localckW = paramckW.cmR();
    int i = str.hashCode();
    if (!this.Q.containsKey(i))
      this.Q.put(i, localckW);
  }

  public void a(ckW paramckW, String paramString) {
    try {
      bEs.bMK().b(paramckW, paramString, ay.bd().getString("shortcutsFile").substring(5));
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  private static String f() {
    return new URL(ay.bd().getString("shortcutsFile")).getFile();
  }

  public void a(String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      bEs.bMK().b(paramString, paramInt1, paramInt2, f());
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  private void g()
  {
    WakfuClientInstance.awy().rs().a(this.P);
    dLE.doY().t("waitingForKeyTyped", Boolean.valueOf(false));
  }
}