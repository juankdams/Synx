import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Hv
  implements cvW
{
  protected static final Logger K = Logger.getLogger(Hv.class);

  private static final Hv bPI = new Hv();
  private chk bPJ;
  private boolean bPK;
  private bnm N;

  public static Hv QV()
  {
    return bPI;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 16141:
      this.bPJ.cjp();
      aG(true);
      return false;
    case 16142:
      this.bPJ.cjq();
      aG(true);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.bPJ == null) {
        K.error("Impossible de charger l'affichage, il manque les données !");
        return;
      }

      this.N = new dfQ(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("backgroundDisplay", this.bPJ);

      cBQ.cxL().a("backgroundDisplayDialog", VV.dJ("backgroundDisplayDialog"), 256L, (short)30000);

      cpa localcpa = cBQ.cxL().coO().nf("backgroundDisplayDialog");
      bdD localbdD = this.bPJ.Kw();

      bmv localbmv1 = (bmv)localcpa.fi("margin1");
      a(localbmv1, localbdD.brJ(), localbdD.brK());

      bmv localbmv2 = (bmv)localcpa.fi("margin2");
      a(localbmv2, localbdD.brK(), localbdD.brJ());

      aG(false);

      cBQ.cxL().j("wakfu.background", adg.class);

      aWc.blo().eO(localbdD.brL());
    }
  }

  private void a(bmv parambmv, int paramInt1, int paramInt2) {
    if ((parambmv != null) && (this.bPJ != null)) {
      Insets localInsets = new Insets(50, paramInt1, 50, paramInt2);
      dRq localdRq = (dRq)parambmv.getParentOfType(dRq.class);
      localdRq.getAppearance().setMargin(localInsets);
      localdRq.getContainer().getLayoutManager().a(localdRq);
    }
  }

  private void aG(boolean paramBoolean) {
    cpa localcpa = cBQ.cxL().coO().nf("backgroundDisplayDialog");
    ArrayList localArrayList = new ArrayList();

    dOc localdOc = null;
    if (!paramBoolean) {
      localdOc = (dOc)localcpa.fi("background");
      if (localdOc != null) {
        localArrayList.add(localdOc.getAppearance());
      }
      localdOc = (dOc)localcpa.fi("closeButton");
      if (localdOc != null) {
        localArrayList.add(localdOc.getAppearance());
      }
      localdOc = (dOc)localcpa.fi("previousButton");
      if (localdOc != null) {
        localArrayList.add(localdOc.getAppearance());
      }
      localdOc = (dOc)localcpa.fi("nextButton");
      if (localdOc != null) {
        localArrayList.add(localdOc.getAppearance());
      }
    }

    for (int i = 1; i <= 10; i++) {
      localdOc = (dOc)localcpa.fi("text" + i);
      if (localdOc != null) {
        localArrayList.add(localdOc.getAppearance());
      }
    }

    for (i = 1; i <= 6; i++) {
      localdOc = (dOc)localcpa.fi("image" + i);
      if (localdOc != null) {
        localArrayList.add(localdOc.getAppearance());
      }
    }

    if (localdOc != null) {
      bNa localbNa1 = new bNa(bNa.gRu.get());
      bNa localbNa2 = new bNa(bNa.gRx.get());

      localdOc.a(new aga(localbNa1, localbNa2, localArrayList, 0, 500, 1, ddp.kWG));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      int i = this.bPJ != null ? this.bPJ.Kw().brM() : 600149;
      this.bPJ = null;

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("backgroundDisplay");

      cBQ.cxL().mW("backgroundDisplayDialog");

      cBQ.cxL().mN("wakfu.background");

      aWc.blo().eO(i);
    }
  }

  public void eR(int paramInt) {
    e(paramInt, true);
  }

  public void e(int paramInt, boolean paramBoolean) {
    this.bPK = paramBoolean;
    Bn localBn = cuw.ifd.wQ(paramInt);
    if (localBn == null) {
      return;
    }
    qi[] arrayOfqi1 = localBn.Kx();
    cOU[] arrayOfcOU = new cOU[arrayOfqi1.length];
    for (qi localqi : arrayOfqi1) {
      arrayOfcOU[localqi.xr()] = new cOU(localqi.getId(), localqi.xr(), localqi.oc(), localqi.xs());
    }
    this.bPJ = new chk(localBn.Kw(), arrayOfcOU);
  }
}