import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Collection;
import org.apache.log4j.Logger;

public class dAE
  implements cvW, Runnable
{
  private static final Logger K = Logger.getLogger(dAE.class);

  private static final dAE lIb = new dAE();
  private bFT lIc;
  private dRq lId;
  private dRq lIe;
  private static final long lIf = 5000L;
  private Runnable lIg = new bpX(this);

  private Runnable lIh = new bqb(this);

  private Thread lIi = null;

  public static dAE ddW()
  {
    return lIb;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    float f;
    switch (paramcWG.getId())
    {
    case 16385:
      ckU.cmE().ak(false).g(bU.fH().getString("logon.progress"), 0);
      localObject1 = (dDD)paramcWG;

      localObject2 = WakfuClientInstance.awy().awB();
      ((aIH)localObject2).a(bmz.fEd, ((dDD)localObject1).dfs().booleanValue());
      ((aIH)localObject2).c(bmz.fEe, ((dDD)localObject1).dfs().booleanValue() ? ((dDD)localObject1).brr() : "");

      localObject3 = byv.bFN();

      ((byv)localObject3).hY(((dDD)localObject1).brr());
      ((byv)localObject3).setPassword(((dDD)localObject1).getPassword());
      ((byv)localObject3).setEmail(((dDD)localObject1).getEmail());
      ((byv)localObject3).eB(false);

      doh localdoh = ((dDD)localObject1).bru();
      ((byv)localObject3).a(localdoh);
      if (localdoh != null) {
        ((aIH)localObject2).a(bmz.fEf, ((dDD)localObject1).dfs().booleanValue() ? localdoh.getIndex() : 0);
        localdoh.cVy();
      }

      aig.dej.o("loginLock", false);

      ((byv)localObject3).bFR();

      return false;
    case 16392:
      localObject1 = (bzu)paramcWG;
      localObject2 = ((bzu)localObject1).getStringValue();

      byv.bFN().hZ((String)localObject2);

      localObject3 = new dcI();
      byv.bFN().aJK().d((cWG)localObject3);
      return false;
    case 16384:
      localObject1 = (aii)paramcWG;

      bU.fH().b(((aii)localObject1).ajJ());

      WakfuClientInstance.awy().cleanUp();
      WakfuClientInstance.awy().start();

      bzu.cf((short)16382);

      return false;
    case 16382:
      return false;
    case 16111:
      buL();
      return false;
    case 16112:
      localObject1 = (ahZ)paramcWG;
      localObject2 = ((ahZ)localObject1).auR();
      if ((!((ahZ)localObject1).getBooleanValue()) && (localObject2.equals(this.lIc.bOe()))) {
        return false;
      }
      b((ajz)localObject2);
      dec();
      return false;
    case 16113:
      b(this.lIc.bOg());
      if (!this.lIc.bOc()) {
        eX.setLeftArrowInvisible(null, true);
      }
      dec();
      return false;
    case 16114:
      b(this.lIc.bOh());
      if (!this.lIc.bOb()) {
        eX.setRightArrowInvisible(null, true);
      }
      dec();
      return false;
    case 16115:
      f = ((bzu)paramcWG).ai();
      localObject2 = this.lIc.bOe().awm();
      ((bji)localObject2).bl(f);
      dLE.doY().a((dBv)localObject2, new String[] { "videoSoundVolumeValue", "videoSoundVolumeValue", "videoMuted" });
      return false;
    case 16119:
      f = ((bzu)paramcWG).ai();
      localObject2 = this.lIc.bOe().awm();
      ((bji)localObject2).aN(f);
      dLE.doY().a((dBv)localObject2, new String[] { "videoCurrentTimeText", "videoProgressionValue" });
      return false;
    case 16116:
      int i = ((bzu)paramcWG).getIntValue();
      localObject2 = this.lIc.bOe().awm();
      ((bji)localObject2).a(this.lId, i);
      dLE.doY().a((dBv)localObject2, new String[] { "selectedQuality" });
      return false;
    case 16117:
      ajz localajz = this.lIc.bOe();
      if (localajz == null) {
        return false;
      }
      if (!localajz.awn()) {
        return false;
      }
      localObject2 = localajz.awm();
      ((bji)localObject2).eQ(!((bji)localObject2).isMuted());
      dLE.doY().a((dBv)localObject2, new String[] { "videoSoundVolumeValue", "videoSoundVolumeValue", "videoMuted" });
      return false;
    }

    return true;
  }

  private void buL() {
    ajz localajz = this.lIc.bOe();
    if (localajz == null) {
      return;
    }
    if (!localajz.awn()) {
      return;
    }
    bji localbji = localajz.awm();
    localbji.buL();
    dLE.doY().a(localbji, new String[] { "videoPlaying" });
    deb();
    if (localbji.buM().isPaused())
      aWc.blo().e(1.0F, 1000);
    else
      aWc.blo().e(0.0F, 1000);
  }

  private void b(ajz paramajz)
  {
    if (paramajz == null) {
      return;
    }
    if ((this.lIc.bOe() != null) && (this.lIc.bOe().awn())) {
      bji localbji = this.lIc.bOe().awm();
      if (localbji.buK()) {
        buL();
      }
    }
    kO(this.lIc.bOe() == null);
    this.lIc.a(paramajz);
    this.lIc.e(this.lId);
    dLE.doY().a(this.lIc, this.lIc.getFields());
    if (paramajz.awn())
      dLE.doY().a(paramajz.awm(), bji.bF);
  }

  private void kO(boolean paramBoolean)
  {
    int i = this.lIe.getAppearance().getModulationColor().get();
    int j = bNa.gRx.get();

    if (i == j) {
      return;
    }

    bNa localbNa1 = new bNa(i);
    bNa localbNa2 = new bNa(j);

    this.lIe.getAppearance().J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, this.lIe.getAppearance(), 0, 75, 1, false, ddp.kWG);
    localgm.a(new bqa(this, j, i, paramBoolean));

    this.lIe.getAppearance().a(localgm);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  private static String ddX()
  {
    return bZr.as("http://www.WAKFU.com", "www.WAKFU.com");
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (paramBoolean) {
      return;
    }

    dLE.doY().t("overNew", null);
    dLE.doY().t("wakfuWebsiteURL", ddX());
    dLE.doY().t("rssFeed", null);

    if (this.lIi == null) {
      this.lIi = new bpZ(this, "RSS Loading");

      this.lIi.start();
    }

    dLE.doY().t("languages", bU.fH().fF());
    dLE.doY().t("currentLanguage", bU.fH().fG());

    aig.dej.ev("loginLock");

    if (ay.bd().bt()) {
      cBQ.cxL().a("logonDialogEmail", VV.dJ("logonDialogEmail"), 8192L, (short)10000);
    } else {
      cBQ.cxL().a("logonDialog", VV.dJ("logonDialog"), 8192L, (short)10000).getElementMap();
      dLE.doY().t("news", null);
      ddY();
    }

    aWc.blo().blv();

    buj.bCk().setEnabled(false);
  }

  private void ddY() {
    switch (bpY.fKw[Zt.cKQ.akB().ordinal()]) {
    case 1:
      K.error("[NEWS] Erreur lors du chargement");
      ddZ();
      break;
    case 2:
      K.info("[NEWS] Chargement effectué");
      ddZ();
      dea();
      break;
    case 3:
    case 4:
      K.warn("[NEWS] Chargement...");
      dka.cSF().a(this.lIh, 5000L, 1);
    }
  }

  private void ddZ()
  {
    dka.cSF().j(this.lIh);
  }

  private void dea() {
    aCd localaCd = Zt.cKQ.akD();
    if ((localaCd == null) || (localaCd.aOo().isEmpty())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("logonDialog");
    this.lId = ((dRq)localcpa.fi("newsContainer"));
    this.lIe = ((dRq)localcpa.fi("blinkContainer"));
    this.lIc = new bFT(localaCd);
    b(this.lIc.bOf());
    dLE.doY().a(this.lIc, this.lIc.getFields());
    dLE.doY().t("news", this.lIc);

    ded();
  }

  private void deb() {
    dka.cSF().j(this);
    dka.cSF().j(this.lIg);
  }

  private void dec() {
    deb();
    dka.cSF().a(this.lIg, 180000L, 1);
  }

  private void ded()
  {
    dka.cSF().a(this, 30000L, -1);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      deb();
      ddZ();
      aWc.blo().e(1.0F, 1000);
      if (this.lIc != null) {
        this.lIc.clean();
      }

      if (ay.bd().bt())
        cBQ.cxL().mW("logonDialogEmail");
      else {
        cBQ.cxL().mW("logonDialog");
      }

      aig.dej.ew("loginLock");
      if (this.lIi != null) {
        this.lIi.interrupt();
        this.lIi = null;
      }
    }
  }

  public void run() {
    if ((!this.lIc.bOb()) && (!this.lIc.bOc())) {
      return;
    }
    if (!this.lIc.bOb()) {
      b(this.lIc.bOf());
      return;
    }
    b(this.lIc.bOh());
  }

  public bFT dee() {
    return this.lIc;
  }
}