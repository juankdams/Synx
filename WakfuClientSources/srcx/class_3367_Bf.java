import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.EnableMiniMapCommand;

public class Bf
  implements cvW
{
  private static final Bf bwY = new Bf();
  private bpn bwZ;
  private static final byte bxa = 0;
  private anG bxb;
  private cst bxc = new cst();
  private gH bxd;

  public static Bf Kk()
  {
    return bwY;
  }

  public boolean a(cWG paramcWG) {
    if ((paramcWG instanceof dKQ)) {
      int i = ((dKQ)paramcWG).czj();
      switch (i) {
      case 0:
        bSH.bZs().bLV();
      }
      return false;
    }
    float f1;
    float f2;
    switch (paramcWG.getId())
    {
    case 16606:
      bzu localbzu1 = (bzu)paramcWG;
      f(localbzu1.getBooleanValue(), false);
      return false;
    case 16407:
      boolean bool = dLE.doY().getBooleanProperty("player.displayStates");
      dLE.doY().t("player.displayStates", Boolean.valueOf(!bool));

      return false;
    case 16402:
      byv.bFN().a(c.b());

      return false;
    case 16600:
      f1 = bSH.bZs().getZoomScale();
      f2 = f1 + 0.1F;
      f1 = 1.0F < f2 ? 1.0F : f2;
      bSH.bZs().setZoomScale(f1);

      return false;
    case 16601:
      f1 = bSH.bZs().getZoomScale();
      f2 = f1 - 0.1F;
      f1 = 0.0F > f2 ? 0.0F : f2;
      bSH.bZs().setZoomScale(f1);

      return false;
    case 16602:
      bzu localbzu2 = (bzu)paramcWG;

      bSH.bZs().setZoomScale((float)localbzu2.getDoubleValue());

      return false;
    case 19305:
      if (!byv.bFN().c(dPm.dqv())) {
        byv.bFN().a(dPm.dqv());
      }

      return false;
    }

    return true;
  }

  public void O(int paramInt1, int paramInt2) {
    if (paramInt2 == 0) {
      return;
    }
    czv localczv = (czv)getElementMap().fi("citizenContainer");
    cag localcag = new cag();
    localcag.aJ();
    localcag.setAlignment(aFG.eck);
    localcag.setLevel(1);
    localcag.setFile(paramInt2 > 0 ? "800195.xps" : "800196.xps");

    localcag.setX((int)localcag.getPosition().getX());
    localcag.setY((int)localcag.getPosition().getY() - 5);
    localcag.setTimeToLive(1000);
    localczv.getAppearance().a(localcag);
  }

  public void as(boolean paramBoolean) {
    cpa localcpa = getElementMap();
    if (localcpa != null) {
      dOc localdOc = (dOc)localcpa.fi("nwButton");
      if (localdOc != null) {
        localdOc.setEnabled(paramBoolean);
      }
      localdOc = (dOc)localcpa.fi("neButton");
      if (localdOc != null) {
        localdOc.setEnabled(paramBoolean);
      }
      localdOc = (dOc)localcpa.fi("swButton");
      if (localdOc != null) {
        localdOc.setEnabled(paramBoolean);
      }
      localdOc = (dOc)localcpa.fi("seButton");
      if (localdOc != null)
        localdOc.setEnabled(paramBoolean);
    }
  }

  public long getId()
  {
    return 10L;
  }

  public void a(long paramLong) {
  }

  private cpa getElementMap() {
    return cBQ.cxL().coO().nf("worldAndFightBarDialog");
  }

  public bpn getWindow() {
    return this.bwZ;
  }

  public void Kl() {
    dOc localdOc = (dOc)getElementMap().fi("fightInfoBtn");
    if (localdOc == null) {
      return;
    }
    cRO.x(localdOc);
  }

  public void Km() {
    dOc localdOc = (dOc)getElementMap().fi("symbiotBtn");
    if (localdOc == null) {
      return;
    }
    cRO.x(localdOc);
  }

  public void Kn() {
    dOc localdOc = (dOc)getElementMap().fi("communityButton");
    if (localdOc == null) {
      return;
    }
    cRO.x(localdOc);
  }

  public void Ko() {
    dOc localdOc = (dOc)getElementMap().fi("spellButton");
    if (localdOc == null) {
      return;
    }
    cRO.x(localdOc);
  }

  public void a(aFy paramaFy, short paramShort) {
    String str = null;
    switch (bOd.gTg[paramaFy.ordinal()]) {
    case 1:
      str = "spellsShortcutList";
      break;
    case 2:
      str = "itemsShortcutList";
    }

    if (str == null) {
      return;
    }

    ccG localccG = (ccG)getElementMap().fi(str);
    if (localccG == null) {
      return;
    }
    axU localaxU = localccG.getRenderableByOffset(paramShort);
    if (localaxU == null) {
      return;
    }
    dOc localdOc = (dOc)localaxU.getInnerElementMap().fi("borderContainer");
    if (localdOc == null) {
      return;
    }

    bNa localbNa1 = new bNa(0.531F, 0.812F, 0.835F, 1.0F);
    bNa localbNa2 = new bNa(bNa.gRx.get());

    gm localgm = new gm(localbNa2, localbNa1, localdOc.getAppearance(), 0, 500, 6, ddp.kWG);

    localdOc.getAppearance().a(localgm);
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dLE.doY().t("isInFight", Boolean.valueOf(false));

      byz localbyz = byv.bFN().bFO();

      localbyz.bGD().cWV();
      dLE.doY().t("challengeDetailsVisible", Boolean.valueOf(false));
      dLE.doY().t("chat.enableInteractions", Boolean.valueOf(!localbyz.i(dKm.lXI)));
      boolean bool = localbyz.i(dKm.lXJ);
      dLE.doY().t("followedAchievements.forceOpen", Boolean.valueOf(bool));
      asv.aEL();

      Kp();
      Kr();

      byv.bFN().a(aIU.aUP());
      byv.bFN().a(ff.me());

      this.bwZ = ((bpn)cBQ.cxL().a("worldAndFightBarDialog", VV.dJ("worldAndFightBarDialog"), 270336L, (short)10005));

      cBQ.cxL().j("wakfu.controlCenter", aep.class);

      dLE.doY().t("controlCenter.forcePopup", Boolean.valueOf(true));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      Ks();
      Kq();

      cBQ.cxL().mW("worldAndFightBarDialog");
      this.bwZ = null;

      cBQ.cxL().mN("wakfu.controlCenter");
      byv.bFN().b(aIU.aUP());
      byv.bFN().b(ff.me());
    }
  }

  private void Kp() {
    bSH.bZs().bLJ();
    cBQ.cxL().a("minimapPopup", VV.dJ("minimapPopup"), 8200L, (short)10000);

    cpa localcpa = cBQ.cxL().coO().nf("minimapPopup");
    if (localcpa != null) {
      this.bxb = ((anG)localcpa.fi("popup"));
    }

    aNL localaNL = cBQ.cxL().a("minimapDialog", VV.dJ("minimapDialog"), 40960L, (short)10000);

    this.bxc.e(localaNL.getElementMap());

    aka localaka = (aka)localaNL.getElementMap().fi("navigator");
    bSH.bZs().f(localaka);
    bSH.bZs().bLQ();

    cAo.cxf().a(this, 200L, 0, -1);

    aIH localaIH = WakfuClientInstance.awy().awB();
    boolean bool = localaIH.a(bmz.fEU);
    EnableMiniMapCommand.es(bool);
  }

  private void Kq()
  {
    cAo.cxf().a(this, 0);
    cBQ.cxL().mW("minimapDialog");
    cBQ.cxL().mW("minimapPopup");
    this.bxc.e(null);
    this.bxb = null;
    bSH.bZs().f(null);
  }

  public final void a(sV paramsV)
  {
    String str = paramsV.AB().getName();
    if ((str == null) || (str.length() == 0)) {
      return;
    }

    dLE.doY().t("minimapPopupDescription", str);

    aka localaka = (aka)paramsV.cIl();

    this.bxc.wq(paramsV.Ax() + localaka.getScreenX() - paramsV.Az() / 2);
    this.bxc.wr(paramsV.Ay() + localaka.getScreenY() - paramsV.AA() / 2);
    this.bxc.setWidth(paramsV.Az());
    this.bxc.setHeight(paramsV.AA());

    this.bxb.b(this.bxc);
  }

  public void f(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean2) && (paramBoolean1 != EnableMiniMapCommand.bmz())) {
      return;
    }

    cpa localcpa = cBQ.cxL().coO().nf("minimapDialog");
    if (localcpa != null) {
      dOc localdOc = (dOc)localcpa.fi("window");
      if (localdOc != null)
        localdOc.setVisible(paramBoolean1);
    }
  }

  public void at(boolean paramBoolean)
  {
    cpa localcpa = getElementMap();
    if (localcpa == null) {
      return;
    }
    aNL localaNL = localcpa.fi("emoteButton");
    if (localaNL == null) {
      return;
    }
    ((br)localaNL).setSelected(paramBoolean);
  }

  private void Kr()
  {
    if (!cBQ.cxL().mZ("sundialDialog"))
      cBQ.cxL().a("sundialDialog", VV.dJ("sundialDialog"), 8320L, (short)10000);
  }

  public void Ks()
  {
    cBQ.cxL().mW("sundialDialog");
  }

  public void au(boolean paramBoolean) {
    cpa localcpa = cBQ.cxL().coO().nf("sundialDialog");
    if (localcpa == null) {
      return;
    }

    dOc localdOc = (dOc)localcpa.fi("mainContainer");
    if (localdOc == null) {
      return;
    }

    localdOc.setVisible(paramBoolean);
  }
}