import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public abstract class cMt
  implements cvW
{
  private static Logger K = Logger.getLogger(cMt.class);

  protected Su Rl = null;

  protected acS krJ = null;
  public static final byte krK = 0;
  public static final byte krL = 1;
  public static final byte krM = 2;
  private cYk krN = null;

  private boolean dQN = false;

  public void af(Su paramSu)
  {
    this.Rl = paramSu;
  }

  protected abstract Ce wa();

  protected abstract void x(int paramInt1, int paramInt2, short paramShort);

  protected abstract void azi();

  protected abstract byte azk();

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void wb() {
    if (this.krJ != null) {
      this.krJ.apj();
    }
    cFt();
  }

  protected abstract String azl();

  protected abstract String azj();

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 18015:
      cFs();
      return true;
    case 19992:
      if (this.Rl != null) {
        aqQ localaqQ = (aqQ)paramcWG;

        if (localaqQ.aCU()) {
          cFv();
        }

        byv.bFN().b(this);
      }
      return false;
    }

    return true;
  }

  private void cFs() {
    cFx();

    Su localSu1 = (Su)this.Rl.aeQ().x(this.krN);
    Su localSu2 = (Su)this.Rl.aeQ().x(axB.aJa());
    if (localSu2 == localSu1)
      return;
    if (localSu1 != null)
      dxz.x(localSu1.aeL());
    if (localSu2 != null) {
      dxz.w(localSu2.aeL());
      this.krN = new cYk(axB.aJa());
    } else {
      this.krN = null;
    }
    cFt();
  }

  private void cFt()
  {
    bWx.cbz().hide();

    String str = azj();
    if (str != null)
      aI(str, azl());
    else {
      dGx.dhr().unlock();
    }
    cFu();
  }

  private void cFu() {
    bWx.cbz().setText(azl());
  }

  public void cFv() {
    int i = 0;
    int j = 0;
    int k = 0;
    short s = 0;

    if (this.krJ.q(axB.aUg)) {
      j = axB.aUg.getX();
      k = axB.aUg.getY();
      s = axB.aUg.IB();

      i = 1;
    }

    if (i != 0) {
      x(j, k, s);
      azi();
    }

    byv.bFN().b(this);
  }

  public boolean cFw()
  {
    return this.dQN;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!this.dQN) {
      this.dQN = true;

      aYX.bnY().bod();

      if (byv.bFN().c(aYX.bnY())) {
        byv.bFN().b(aYX.bnY());
      }

      bZc localbZc = daO.cML().cMM();
      if ((localbZc != null) && ((localbZc instanceof cew))) {
        cYk localcYk = axB.aJa();
        cew localcew = (cew)localbZc;
        if (cqJ.c(localcew, localcYk) > 0) {
          dxz.x(localcew);
        }
      }
      cFs();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (this.dQN)
    {
      this.krJ.apj();

      dGx.dhr().unlock();
      bWx.cbz().hide();

      byv.bFN().a(aYX.bnY());

      this.dQN = false;

      bZc localbZc = daO.cML().cMM();
      if ((localbZc instanceof cew)) {
        localObject = (cew)localbZc;
        if (!((cew)localObject).isSelected()) {
          dxz.x((cew)localObject);
        }
      }

      Object localObject = (aTL)WakfuClientInstance.awy().Dg();
      dCb localdCb = ((aTL)localObject).biV();
      if ((localdCb != null) && ((localdCb instanceof cew)))
        dxz.w((cew)localdCb);
    }
  }

  private void aI(String paramString1, String paramString2) {
    if (paramString1 == null) {
      return;
    }
    switch (azk()) {
    case 0:
    case 2:
      dGx.dhr().a(duv.lyt, true);
      break;
    case 1:
      dGx.dhr().a(duv.lyx, true);
    }

    bWx.cbz().a(paramString1, paramString2, 10, -30, aFG.ecg);
  }

  public void cFx() {
    cYk localcYk = axB.aUg;
    if ((localcYk != null) && (this.krJ.q(localcYk)))
      this.krJ.a(wa(), this.Rl, localcYk);
    else
      this.krJ.apk();
  }
}