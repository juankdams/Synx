import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class cHX
  implements TM, cvW
{
  private static final String cgf = "destinationPosition";
  private static final float[] cgg = { 0.0F, 1.0F, 0.0F, 0.5F };
  private static final float[] cgh = { 1.0F, 0.0F, 0.0F, 0.5F };

  private static final Logger K = Logger.getLogger(cHX.class);

  private static final cHX iDy = new cHX();

  private final cSR iDz = new cSR();
  private DisplayedScreenElement cgj;
  private BW cgk;
  private EA cgl;
  private Runnable cgm;
  private Runnable cgn;

  public static cHX cCk()
  {
    return iDy;
  }

  public void a(EA paramEA)
  {
    this.cgl = paramEA;
  }

  public void a(Runnable paramRunnable) {
    this.cgn = paramRunnable;
  }

  public void b(Runnable paramRunnable) {
    this.cgm = paramRunnable;
  }

  public BW aaR() {
    return this.cgk;
  }

  public boolean a(cWG paramcWG)
  {
    aqQ localaqQ;
    switch (paramcWG.getId())
    {
    case 19994:
      localaqQ = (aqQ)paramcWG;

      ArrayList localArrayList = WakfuClientInstance.awy().Dg().a(localaqQ.aCX(), localaqQ.aCY(), 0.0F, bYP.hoG);

      DisplayedScreenElement localDisplayedScreenElement = (localArrayList != null) && (!localArrayList.isEmpty()) ? (DisplayedScreenElement)localArrayList.get(0) : null;
      if (localDisplayedScreenElement != this.cgj) {
        b(localDisplayedScreenElement);
      }

      return false;
    case 19992:
      localaqQ = (aqQ)paramcWG;

      if (!localaqQ.aCU()) {
        this.cgk = BW.bEh;
        K.info("Bag-action cancelled");
        this.cgn.run();
      } else if (this.cgk == BW.bEg) {
        aWc.blo().eO(600071L);
        K.info("Bag-action to " + this.cgl.sR().bOs() + " validated");
        this.cgm.run();
      } else {
        K.info("Bag-action cancelled");
        this.cgn.run();
      }

      this.cgl = null;
      dbL.cNv().oO("destinationPosition");
      byv.bFN().b(this);

      return false;
    }

    return true;
  }

  private boolean b(DisplayedScreenElement paramDisplayedScreenElement) {
    if (paramDisplayedScreenElement != null) {
      ScreenElement localScreenElement = paramDisplayedScreenElement.bpc();
      int i = localScreenElement.ddI();
      int j = localScreenElement.ddJ();
      short s = localScreenElement.ddH();

      this.cgk = ((BW)this.iDz.get(ek(i, j)));
      float[] arrayOfFloat = this.cgk == BW.bEg ? cgg : cgh;

      this.cgl.sR().L(i, j, s);
      ciL localciL = dbL.cNv().oN("destinationPosition");
      if ((!bB) && (localciL == null)) throw new AssertionError();
      localciL.clear();
      localciL.Q(i, j, s);
      localciL.g(arrayOfFloat);
    }
    this.cgj = paramDisplayedScreenElement;
    return false;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.cgl.sR().bOt();
      cCl();
    }
    try
    {
      dbL.cNv().oL("destinationPosition");
    } catch (Exception localException) {
      K.error("Exception raised while pushing frame " + getClass().getName(), localException);
    }
  }

  private void cCl() {
    this.iDz.clear();
    byz localbyz = byv.bFN().bFO();
    apG localapG = localbyz.bHa().aCI();
    for (Object localObject1 = localapG.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (aqA)((Iterator)localObject1).next();
      for (int i = ((aqA)localObject2).aCK(); i < ((aqA)localObject2).aCK() + ((aqA)localObject2).So(); i++) {
        for (int j = ((aqA)localObject2).aCL(); j < ((aqA)localObject2).aCL() + ((aqA)localObject2).bY(); j++) {
          a((aqA)localObject2, i, j);
        }
      }
    }
    localObject1 = ayg.aJQ().bjr();
    for (Object localObject2 = ((List)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { cfb localcfb = (cfb)((Iterator)localObject2).next();
      localcfb.P(new bCv(this));
    }
  }

  private void a(aqA paramaqA, int paramInt1, int paramInt2)
  {
    if (((paramaqA instanceof dQC)) && (((dQC)paramaqA).e(this.cgl))) {
      this.iDz.put(ek(paramInt1, paramInt2), BW.bEk);
      return;
    }

    azX localazX = acL.apd().aP(paramInt1, paramInt2);
    if (localazX != null) {
      this.iDz.put(ek(paramInt1, paramInt2), BW.bEi);
      return;
    }

    if (!paramaqA.a(this.cgl, paramInt1, paramInt2)) {
      this.iDz.put(ek(paramInt1, paramInt2), BW.bEj);
      return;
    }

    tF localtF = cwO.dV(paramInt1, paramInt2);
    if (localtF == null) {
      return;
    }

    this.iDz.put(ek(paramInt1, paramInt2), localtF.I(paramInt1, paramInt2) ? BW.bEi : BW.bEg);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    this.iDz.clear();
    if (this.cgl != null) {
      K.info("Bag-action cancelled");
      this.cgn.run();
      this.cgl = null;
    }
    this.cgj = null;
    this.cgk = BW.bEh;
    try {
      this.cgl = null;
      dbL.cNv().oO("destinationPosition");
      dbL.cNv().oM("destinationPosition");
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }

  private static int ek(int paramInt1, int paramInt2) {
    return bCO.cN(paramInt1, paramInt2);
  }
}