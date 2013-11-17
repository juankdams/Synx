import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class bIR
  implements cvW
{
  private static final Logger K = Logger.getLogger(bIR.class);
  private static final boolean aRN = false;
  private static final bIR gJn = new bIR();

  private clf gJo = clf.hMN;
  private Su ghO;
  private bSl gJp;
  private final bSl bpK = new bCF();
  private boolean gJq;
  private int dyx;
  private int dyy;
  private char gJr;
  private boolean gJs;

  public static bIR bQl()
  {
    return gJn;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    reset();
    try {
      this.gJr = ay.bd().getString("magicKey").toCharArray()[0];
    } catch (Exception localException) {
      K.error("Pas d'entrée pour magicKey");
      this.gJr = '\000';
    }
    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    this.gJp = localaWe.xZ();
    localaWe.er(true);
    a(clf.hML);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    reset();
    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    localaWe.er(false);
    if (this.gJp == null)
      localaWe.a(byv.bFN().bFO().aeL());
    else
      localaWe.a(this.gJp);
  }

  private void reset()
  {
    this.ghO = null;
    this.gJs = false;
    this.gJq = true;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 19995:
      this.gJs = true;

      return axB.aIZ().a(paramcWG);
    case 19992:
      localObject = (aTL)WakfuClientInstance.awy().Dg();
      if ((this.gJs) && (((aTL)localObject).isKeyDown(this.gJr)))
      {
        this.gJq = true;
      }
      this.gJs = false;

      return axB.aIZ().a(paramcWG);
    case 19991:
      localObject = (ani)paramcWG;
      if ((this.gJo == clf.hMO) && (((ani)localObject).azT().getKeyChar() == this.gJr)) {
        bQn();
      }

      return true;
    case 19993:
    case 19994:
    }

    return true;
  }

  private void a(clf paramclf) {
    if ((!bB) && (paramclf == null)) throw new AssertionError();

    if (this.gJo != paramclf)
    {
      this.gJo = paramclf;
      bQq();
    }
  }

  private void bQm() {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    localaTL.dX(true);
    localaTL.dZ(true);
    a(clf.hMO);
  }

  private void bQn() {
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    bQo();
    bQq();
    aYX.bnY().enable();
    localaTL.dX(false);
    localaTL.dZ(false);
    this.gJq = true;
  }

  private void bQo() {
    a(clf.hMM);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  private cyz bQp() {
    byz localbyz = byv.bFN().bFO();
    arl localarl = localbyz.bGv();
    cyz localcyz = new cyz(localbyz.aeL(), localarl == null ? null : localarl.LB());

    if (localarl == null) {
      localcyz.a(localbyz.aeL(), 1);
      return localcyz;
    }

    int i = localarl.bgG().size();
    Iterator localIterator = localbyz.bGv().bgG().iterator();

    while (localIterator.hasNext()) {
      Su localSu = (Su)localIterator.next();
      if (!localSu.afk())
      {
        int j = (localSu instanceof byo) ? 10 : 12;
        if ((this.ghO != null) && (localSu == this.ghO))
          localcyz.a(localSu.aeL(), Math.max(j, j * i));
        else
          localcyz.a(localSu.aeL(), j);
      }
    }
    if (localcyz.cvy() < 1) {
      K.error("Il devrait y avoir au moins 1 target (le localPlayer");
    }
    return localcyz;
  }

  public void aC(Su paramSu)
  {
    if (this.gJo != clf.hMO)
    {
      bQo();
    }

    this.ghO = paramSu;
    switch (bNH.gSJ[this.gJo.ordinal()]) {
    case 1:
      bQq();

      break;
    case 2:
      bQq();
    }
  }

  public void aD(Su paramSu)
  {
    if (this.gJo == clf.hMM)
      aC(paramSu);
  }

  public void rU()
  {
    bQq();
  }

  private void bQq() {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    switch (bNH.gSJ[this.gJo.ordinal()]) {
    case 1:
      localdSz.c(bQp());

      break;
    case 2:
      if (this.ghO != null)
        localdSz.c(this.ghO.aeL());
      break;
    }
  }

  private void cX(int paramInt1, int paramInt2)
  {
    if ((this.dyx == paramInt1) && (this.dyy == paramInt2)) {
      return;
    }
    aTL localaTL = (aTL)WakfuClientInstance.awy().Dg();
    if (this.gJq) {
      this.dyx = paramInt1;
      this.dyy = paramInt2;

      this.gJo = clf.hMO;
      aYX.bnY().disable();

      aWe localaWe = localaTL.cKV();
      bSl localbSl = localaWe.xZ();
      int i = cwO.V(localbSl.fa(), localbSl.fb(), localbSl.fc());

      if (Math.abs(i - localbSl.getAltitude()) > 20.0F) {
        return;
      }
      this.bpK.k(localbSl.getWorldX(), localbSl.getWorldY(), localbSl.getAltitude());
      localaWe.a(this.bpK);
      this.gJq = false;
    }

    a(paramInt1, paramInt2, localaTL, this.bpK, this.dyx, this.dyy);

    this.dyx = paramInt1;
    this.dyy = paramInt2;
  }

  static void a(int paramInt1, int paramInt2, aTL paramaTL, bSl parambSl, int paramInt3, int paramInt4)
  {
    int i = -(paramInt1 - paramInt3);
    int j = paramInt2 - paramInt4;

    float f1 = paramaTL.t(i, j);
    float f2 = paramaTL.u(i, j);
    int k = parambSl.fa() + bCO.bC(f1);
    int m = parambSl.fb() + bCO.bC(f2);

    axB.aIZ(); arl localarl = axB.cUs;
    if (localarl == null)
      return;
    if (!localarl.LB().p(k, m)) {
      return;
    }
    parambSl.k(k, m, parambSl.getAltitude());
  }
}