import java.util.ArrayList;
import org.apache.log4j.Logger;

public class HJ
  implements cvW
{
  protected static final Logger K = Logger.getLogger(HJ.class);

  private static HJ bPY = new HJ();
  private int bPZ;
  private bnm N;

  public static HJ Ra()
  {
    return bPY;
  }

  public boolean a(cWG paramcWG)
  {
    paramcWG.getId();

    return true;
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void eT(int paramInt)
  {
    if (this.bPZ == paramInt) {
      return;
    }

    this.bPZ = paramInt;

    Rb();
  }

  private void Rb() {
    cpa localcpa = cBQ.cxL().coO().nf("frescoDialog");
    if (localcpa == null) {
      K.warn("Impossible de trouver l'elementMap");
      return;
    }

    bhd localbhd = (bhd)localcpa.fi("multipleImage");
    try {
      localbhd.setParticlePath(ay.bd().s(800248));
      String str = String.format(ay.bd().getString("frescoPath"), new Object[] { Integer.valueOf(this.bPZ) });
      localbhd.setImagePath(str);
    } catch (bdh localbdh) {
      K.warn("Problème de Property", localbdh);
    }
  }

  private void j(int paramInt1, int paramInt2, int paramInt3) {
    cpa localcpa = cBQ.cxL().coO().nf("frescoDialog");
    ArrayList localArrayList = new ArrayList();

    dOc localdOc = (dOc)localcpa.fi("closeButton");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("multipleImage");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("leftArrowContainer");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("rightArrowContainer");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("mainWindow");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }

    if (localdOc != null) {
      bNa localbNa1 = new bNa(paramInt1);
      bNa localbNa2 = new bNa(paramInt2);

      localdOc.a(new aga(localbNa1, localbNa2, localArrayList, 0, paramInt3, 1, ddp.kWG));
    }
  }

  private void Rc() {
    j(bNa.gRu.get(), bNa.gRx.get(), 1000);
    aWc.blo().f(0.2F, 1000);
    aWc.blo().e(0.4F, 1000);
  }

  private void Rd() {
    j(bNa.gRx.get(), bNa.gRu.get(), 250);
    aWc.blo().f(1.0F, 300);
    aWc.blo().e(1.0F, 300);
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new agO(this);

      cBQ.cxL().a(this.N);

      aNL localaNL = cBQ.cxL().a("frescoDialog", VV.dJ("frescoDialog"), 257L, (short)10000);

      cpa localcpa = localaNL.getElementMap();
      bhd localbhd = (bhd)localcpa.fi("multipleImage");
      dOc localdOc1 = (dOc)localcpa.fi("leftArrowContainer");
      dOc localdOc2 = (dOc)localcpa.fi("rightArrowContainer");

      localbhd.setImageListener(new agN(this, localdOc1, localdOc2));

      localdOc1.setVisible(false);

      Rb();
      Rc();

      cBQ.cxL().j("wakfu.fresco", aMa.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      Rd();

      cBQ.cxL().mN("wakfu.fresco");

      dka.cSF().a(new agP(this), 250L, 1);
    }
  }
}