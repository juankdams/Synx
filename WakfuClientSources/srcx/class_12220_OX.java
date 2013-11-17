import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class OX
  implements TM, cvW
{
  private static final String cgf = "destinationPosition";
  private static final float[] cgg = { 0.0F, 1.0F, 0.0F, 0.5F };
  private static final float[] cgh = { 1.0F, 0.0F, 0.0F, 0.5F };

  private static final Logger K = Logger.getLogger(OX.class);

  private static final OX cgi = new OX();

  private final GM bep = new GM();
  private DisplayedScreenElement cgj;
  private BW cgk;
  private EA cgl;
  private Runnable cgm;
  private Runnable cgn;

  public static OX aaQ()
  {
    return cgi;
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
    case 19995:
      localaqQ = (aqQ)paramcWG;
      DisplayedScreenElement localDisplayedScreenElement = ah(localaqQ.aCX(), localaqQ.aCY());
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
        this.bep.add(n(this.cgj.fa(), this.cgj.fb(), this.cgj.fc()));
        this.cgm.run();
      } else {
        K.info("Bag-action cancelled");
        this.cgn.run();
      }

      this.cgl = null;
      dbL.cNv().oO("destinationPosition");
      byv.bFN().b(this);

      return false;
    case 19993:
    }
    return true;
  }

  private boolean b(DisplayedScreenElement paramDisplayedScreenElement) {
    if (paramDisplayedScreenElement != null) {
      ScreenElement localScreenElement = paramDisplayedScreenElement.bpc();
      int i = localScreenElement.ddI();
      int j = localScreenElement.ddJ();
      short s = cwO.V(i, j, localScreenElement.ddH());

      int k = byv.bFN().bFO().fc();

      int m = !m(i, j, s) ? 1 : 0;
      this.cgk = (m != 0 ? BW.bEi : BW.bEg);
      float[] arrayOfFloat = m != 0 ? cgh : cgg;
      if ((m != 0) && (Math.abs(localScreenElement.ddH() - k) > 6)) {
        aaS();
        this.cgj = paramDisplayedScreenElement;
        return true;
      }

      if (this.cgl != null) {
        this.cgl.sR().L(i, j, s);
      }
      ciL localciL = dbL.cNv().oN("destinationPosition");
      if ((!bB) && (localciL == null)) throw new AssertionError();
      localciL.clear();
      localciL.Q(i, j, s);
      localciL.g(arrayOfFloat);
    } else {
      aaS();
    }
    this.cgj = paramDisplayedScreenElement;
    return false;
  }

  private void aaS() {
    this.cgk = BW.bEi;
    bf(false);
    dbL.cNv().oO("destinationPosition");
  }

  private void bf(boolean paramBoolean) {
    if (this.cgl == null) {
      return;
    }
    for (abc localabc : this.cgl.sL())
      ((djm)localabc).setVisible(paramBoolean);
  }

  private boolean m(int paramInt1, int paramInt2, short paramShort)
  {
    if (paramShort == -32768) {
      return false;
    }

    if (cjS.clP().dz(paramInt1, paramInt2)) {
      return false;
    }

    return !this.bep.N(n(paramInt1, paramInt2, paramShort));
  }

  private static DisplayedScreenElement ah(int paramInt1, int paramInt2) {
    ArrayList localArrayList = WakfuClientInstance.awy().Dg().a(paramInt1, paramInt2, 0.0F, bYP.hoI);
    if ((localArrayList == null) || (localArrayList.isEmpty())) {
      return null;
    }

    return (DisplayedScreenElement)localArrayList.get(0);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.cgl != null) {
        this.cgl.sR().bOt();
      }
      aaT();
    }
    try
    {
      dbL.cNv().oL("destinationPosition");
    } catch (Exception localException) {
      K.error("Exception raised while pushing frame " + getClass().getName(), localException);
    }
  }

  private void aaT() {
    this.bep.clear();

    List localList = ayg.aJQ().bjr();
    for (cfb localcfb : localList) {
      int i = localcfb.getX() * 18;
      int j = localcfb.getY() * 18;

      for (int k = i; k < i + localcfb.getWidth(); k++)
        for (int m = j; m < j + localcfb.getHeight(); m++) {
          azX localazX = acL.apd().aP(k, m);
          if (localazX != null) {
            this.bep.add(n(k, m, localazX.fc()));
          }
          else
          {
            tF localtF = cwO.dV(k, m);
            if (localtF != null)
            {
              for (short s : cwO.dY(k, m)) {
                if (s != -32768)
                {
                  if ((localtF.i(k, m, s)) || (cwO.Z(k, m, s))) {
                    this.bep.add(n(k, m, s));
                  }
                }
              }
              localcfb.P(new dja(this));
            }
          }
        }
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    this.bep.clear();
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

  private static long n(int paramInt1, int paramInt2, short paramShort) {
    return aUG.B(paramInt1, paramInt2, paramShort);
  }
}