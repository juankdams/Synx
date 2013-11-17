import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class Nw
  implements cvW
{
  private static final Nw cda = new Nw();
  protected static final Logger K = Logger.getLogger(Nw.class);

  private final Object aNy = new Object();
  private dRq aBV;
  private alP cdb;
  private duS cdc;
  private duS cdd;
  private bnm N;
  private cKq cde;
  private cag cdf;
  private boolean cdg = false;

  private final Runnable cdh = new FM(this);

  public static Nw ZC()
  {
    return cda;
  }

  public void a(uP paramuP, float paramFloat1, float paramFloat2)
  {
    synchronized (this.aNy) {
      if (!this.cdg) {
        return;
      }

      if (byv.bFN().bFO().aeQ() != null) {
        return;
      }

      this.aBV.setVisible(true);

      ZF();

      this.cdb.setUseIncreaseProgressTween(false);
      this.cdb.setUseDecreaseProgressTween(false);

      float f = paramuP.DR() ? 0.0F : paramFloat1;

      this.cdb.setInitialValue(f);

      this.cdb.setUseIncreaseProgressTween(true);
      this.cdb.setUseDecreaseProgressTween(true);

      if (f != paramFloat2) {
        this.cde = this.cdb.setValue(paramFloat2);
        this.cde.setDuration(2500);
        this.cde.a(new GV(this));
      }
      else
      {
        dka.cSF().a(this.cdh, 5000L, 1);
      }

      this.cdd.getAppearance().setModulationColor(new bNa(bNa.gRx));
      a(this.cdd, false, 1500, 1000);
      this.cdc.setText(bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(byv.bFN().bFO().nU()) }));
      this.cdd.setText("+" + paramuP.DP());

      aY(true);

      if (paramuP.DR())
        ZE();
    }
  }

  private void ZD()
  {
    if (this.cdf != null) {
      this.cdc.getAppearance().b(this.cdf);
      this.cdf = null;
    }
  }

  private void ZE() {
    ZD();

    this.cdf = new cag();
    this.cdf.aJ();
    this.cdf.setFile("6001051.xps");
    this.cdf.setAlignment(aFG.eck);
    this.cdc.getAppearance().a(this.cdf);
  }

  private void ZF() {
    dka.cSF().j(this.cdh);
    ZD();

    this.cdb.b(this.cde);
    this.cde = null;

    cpa localcpa = cBQ.cxL().coO().nf("xpGainDialog");
    if (localcpa == null) {
      return;
    }

    for (aOG localaOG = new aOG(localcpa); localaOG.hasNext(); ) {
      aNL localaNL = localaOG.bfH();
      if ((localaNL instanceof dOc))
        ((dOc)localaNL).getAppearance().J(gm.class);
    }
  }

  private void a(dOc paramdOc, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    bNa localbNa1 = paramdOc.getAppearance().getModulationColor();
    int i = localbNa1 != null ? localbNa1.get() : bNa.gRx.get();
    int j = paramBoolean ? bNa.gRx.get() : bNa.gRu.get();

    if (i != j) {
      bNa localbNa2 = new bNa(i);
      bNa localbNa3 = new bNa(j);

      paramdOc.getAppearance().J(gm.class);
      gm localgm = new gm(localbNa2, localbNa3, paramdOc.getAppearance(), paramInt1, paramInt2, 1, false, ddp.kWG);
      paramdOc.getAppearance().a(localgm);
    }
  }

  private void aY(boolean paramBoolean) {
    cpa localcpa = cBQ.cxL().coO().nf("xpGainDialog");
    if (localcpa == null) {
      return;
    }

    for (aOG localaOG = new aOG(localcpa); localaOG.hasNext(); ) {
      aNL localaNL = localaOG.bfH();
      if (((localaNL instanceof dOc)) && (localaNL != this.cdd)) {
        dOc localdOc = (dOc)localaNL;
        a(localdOc, paramBoolean, 0, 200);
      }
    }
  }

  public boolean a(cWG paramcWG) {
    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      boolean bool = WakfuClientInstance.awy().awB().a(bmz.fET);
      if (bool)
        ZG();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
      sG();
  }

  public void aZ(boolean paramBoolean)
  {
    if (!byv.bFN().c(this)) {
      return;
    }

    if (paramBoolean == this.cdg) {
      return;
    }

    if (paramBoolean)
      ZG();
    else
      sG();
  }

  private void ZG()
  {
    synchronized (this.aNy) {
      cBQ.cxL().a("xpGainDialog", VV.dJ("xpGainDialog"), 8196L, (short)10000);

      cpa localcpa = cBQ.cxL().coO().nf("xpGainDialog");
      this.aBV = ((dRq)localcpa.fi("container"));
      this.cdb = ((alP)localcpa.fi("progressBar"));
      this.cdc = ((duS)localcpa.fi("levelText"));
      this.cdd = ((duS)localcpa.fi("xpGainText"));

      this.aBV.setVisible(false);

      this.cdg = true;
    }
  }

  private void sG() {
    synchronized (this.aNy) {
      this.cdg = false;

      cBQ.cxL().mW("xpGainDialog");

      this.aBV = null;
      this.cdb = null;
      this.cdc = null;
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}