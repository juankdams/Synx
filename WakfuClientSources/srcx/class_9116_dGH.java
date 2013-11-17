import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class dGH
  implements cvW
{
  private static final Logger K = Logger.getLogger(dGH.class);

  private static dGH lRk = new dGH();
  private int lRl = 0;
  private bnm N;

  public static dGH dhB()
  {
    return lRk;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId())
    {
    case 18110:
      cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.restoreChatOptions"), Cn.et(0), 2073L, 102, 1);

      localcKX.a(new qC(this));

      return false;
    }

    return true;
  }

  public void aUB() {
    byv.bFN().b(ceb.cgG());
    WakfuClientInstance.awy().awB().aUB();
    aAx.aMd().aMu();
    try {
      aQL.bhn();
    } catch (Exception localException) {
      K.error("immpossible de rétablir les paramètres par défaut de chat !", localException);
    }
    byv.bFN().a(ceb.cgG());
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.N = new qB(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("chat.editedView", null);
      dLE.doY().t("chat.viewOver", null);

      dLE.doY().t("chat.colorEditedObject", null);

      aNL localaNL = cBQ.cxL().a("chatOptionsDialog", VV.dJ("chatOptionsDialog"), 256L, (short)26000);

      if (localaNL != null) {
        ((dad)localaNL.getElementMap().fi("tabbedContainer")).setSelectedTabIndex(this.lRl);
      }

      cBQ.cxL().j("wakfu.chatOptions", dPA.class);

      ceb.cgG().gO(true);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      ceb.cgG().gO(false);
      this.lRl = 0;

      dLE.doY().removeProperty("chat.editedView");
      dLE.doY().removeProperty("chat.viewOver");
      dLE.doY().removeProperty("chat.colorEditedObject");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("chatOptionsDialog");

      cBQ.cxL().mN("wakfu.chatOptions");
    }
  }

  public void setSelectedTabIndex(int paramInt)
  {
    this.lRl = paramInt;
  }
}