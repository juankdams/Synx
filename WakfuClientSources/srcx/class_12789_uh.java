import java.util.ArrayList;
import org.apache.log4j.Logger;

public class uh
  implements cvW
{
  protected static final Logger K = Logger.getLogger(uh.class);

  private static uh bgD = new uh();
  private ArrayList bgE;
  private bnm N;

  public static uh CL()
  {
    return bgD;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 19007:
      bzu localbzu = (bzu)paramcWG;
      int i = localbzu.getIntValue();
      String str1 = bU.fH().b(39, i, new Object[0]);
      String str2 = bU.fH().getString("question.nationSelectionConfirm", new Object[] { str1 });
      NW localNW = new NW(102, 0, str2, null, Cn.et(0), 24L);

      cKX localcKX = cBQ.cxL().a(localNW);
      localcKX.a(new beF(this, i));

      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.bgE == null) {
        K.error("Nations null on ne peut pas afficher le panneau !");
        return;
      }
      dLE.doY().t("nationSelectionList", this.bgE);
      dLE.doY().t("selectedNation", null);

      this.N = new beE(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("nationSelectionPanelDialog", VV.dJ("nationSelectionPanelDialog"), 256L, (short)10000);

      cBQ.cxL().j("wakfu.nationSelectionPanel", oh.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.bgE = null;
      dLE.doY().removeProperty("nationSelectionList");
      dLE.doY().removeProperty("selectedNation");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("nationSelectionPanelDialog");

      cBQ.cxL().mN("wakfu.nationSelectionPanel");
    }
  }

  public void h(ArrayList paramArrayList) {
    this.bgE = new ArrayList();
    for (jU localjU : paramArrayList)
      this.bgE.add(new byd(localjU.bP(), localjU.rD(), localjU.rE(), localjU.rF(), localjU.u(), localjU.rG()));
  }
}