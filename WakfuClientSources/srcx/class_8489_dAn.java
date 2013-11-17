import com.ankamagames.wakfu.client.WakfuClientInstance;
import com.ankamagames.wakfu.client.console.command.display.AlphaMaskCommand;
import com.ankamagames.wakfu.client.console.command.display.HideFightOccluders;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

final class dAn
{
  private static final Logger K = Logger.getLogger(dAn.class);
  private static final float lHe = 0.6F;
  private static final cSR lHf = new cSR();
  private static final cSR lHg = new cSR();

  static void q(ckT paramckT) {
    if (paramckT == null) {
      return;
    }
    for (Object localObject1 = paramckT.bgG().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
      bD((Su)localObject2);
    }
    localObject1 = paramckT.LC();
    if (localObject1 != null) {
      for (localObject2 = ((aJD)localObject1).bbj().iterator(); ((Iterator)localObject2).hasNext(); ) { cjK localcjK = (cjK)((Iterator)localObject2).next();
        d(paramckT, localcjK);
      }
      ddC();
    }

    Object localObject2 = paramckT.aDH();
    if (localObject2 != null)
      ((azj)localObject2).aLd();
  }

  static void r(ckT paramckT)
  {
    a(paramckT, VO.cAV);
  }

  private static void a(ckT paramckT, VO paramVO) {
    if (paramckT == null)
      return;
    b(paramckT, paramVO);
    u(paramckT);
    w(paramckT);
  }

  private static cYk b(ckT paramckT, cYk paramcYk) {
    UG localUG = paramckT.LB();
    int i = 2147483647;
    Object localObject = null;
    for (Su localSu : paramckT.bgG()) {
      cYk localcYk = localSu.ML();
      if (localcYk == null) {
        K.error("fighter sans position");
      }
      else if (localUG.am(localcYk.getX(), localcYk.getY()))
      {
        int j = paramcYk.ac(localcYk);
        if (j < i) {
          i = j;
          localObject = localcYk;
        }
      }
    }
    return localObject;
  }

  public static void k(czN paramczN) {
    if (lHf.containsKey(paramczN.getId())) {
      return;
    }
    cYk localcYk = l(paramczN);
    if (localcYk == null) {
      K.error("pas de cellule trouvée pour représenter le combat " + paramczN + " center=" + paramczN.LB().ahT());
      return;
    }

    dCb localdCb1 = dkh.a(paramczN, 0, localcYk);
    lHf.put(paramczN.getId(), localdCb1);
    dps.cXa().k(localdCb1);

    dCb localdCb2 = dkh.a(paramczN, 1, localcYk);
    lHg.put(paramczN.getId(), localdCb2);
    dps.cXa().k(localdCb2);
  }

  private static cYk l(czN paramczN) {
    cYk localcYk = paramczN.LB().ahT();
    localcYk.dG(cwO.V(localcYk.getX(), localcYk.getY(), localcYk.IB()));
    try
    {
      if (!cwO.v(localcYk.getX(), localcYk.getY(), localcYk.IB()))
        return b(paramczN, localcYk);
    }
    catch (Exception localException) {
      K.warn("La map topolologique pour " + localcYk + " n'est pas chargée", localException);
    }
    return localcYk;
  }

  public static void s(ckT paramckT) {
    ahm localahm1 = (ahm)lHg.remove(paramckT.getId());
    if (localahm1 != null) {
      dps.cXa().l(localahm1);
    }
    ahm localahm2 = (ahm)lHf.remove(paramckT.getId());
    if (localahm2 != null)
      dps.cXa().l(localahm2);
  }

  static void ddB()
  {
    Pv localPv = new Pv();

    lHf.s(localPv);
    lHg.s(localPv);

    lHf.clear();
    lHg.clear();
  }

  public static void b(ckT paramckT, VO paramVO) {
    switch (Pu.chU[paramVO.ordinal()]) {
    case 1:
      x(paramckT.bgG());
      break;
    case 2:
      y(paramckT.bgG());
    }
  }

  public static void t(ckT paramckT)
  {
    Collection localCollection = paramckT.bgG();
    for (Su localSu : localCollection) {
      localSu.aeL().chm();
      localSu.aeL().chn();
    }
  }

  public static void u(ckT paramckT) {
    aJD localaJD = paramckT.LC();
    if ((paramckT instanceof arl))
      bOX.bVM().r(((arl)paramckT).afA());
    if (localaJD != null) {
      for (cjK localcjK : localaJD.bbj()) {
        v(localcjK);
      }

      ddC();
    }
    bOX.bVM().update();
  }

  public static void v(ckT paramckT) {
    aJD localaJD = paramckT.LC();
    arl localarl = (arl)paramckT;
    aYV localaYV = localarl.afA();
    bOX.bVM().a(localaYV, paramckT);
    if (localaJD != null) {
      for (cjK localcjK : localaJD.bbj()) {
        d(paramckT, localcjK);
      }
    }
    ddC();
    bOX.bVM().update();
  }

  public static void w(ckT paramckT) {
    azj localazj = paramckT.aDH();
    if (localazj != null)
      localazj.yx();
  }

  public static void x(ckT paramckT) {
    azj localazj = paramckT.aDH();
    if (localazj != null)
      localazj.aLd();
  }

  private static void x(Collection paramCollection) {
    for (Su localSu : paramCollection)
      bF(localSu);
  }

  private static void y(Collection paramCollection)
  {
    for (Su localSu : paramCollection)
      bE(localSu);
  }

  static void bD(Su paramSu)
  {
    cew localcew = paramSu.aeL();
    localcew.aw(localcew.atD());
    if (paramSu.afk())
      return;
    localcew.setVisible(true);
  }

  static void bE(Su paramSu) {
    paramSu.aeL().cc(false);
    paramSu.aeL().aw(0.6F);
    if (paramSu.afk())
      return;
    paramSu.aeL().setVisible(true);
  }

  static void bF(Su paramSu) {
    paramSu.aeL().setVisible(false);
    paramSu.aeL().cc(false);
  }

  static void ddC() {
    ((aTL)WakfuClientInstance.awy().Dg()).a(bOX.bVM());
  }

  static void d(ckT paramckT, cjK paramcjK) {
    if (paramckT.e(paramcjK))
      bOX.bVM().a(paramcjK, paramckT);
  }

  static void v(cjK paramcjK) {
    bOX.bVM().r(paramcjK);
  }

  public static void y(ckT paramckT) {
    dmM.cUe().dd(WakfuClientInstance.awy().Dg().cKV().getZoomFactor());
    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    arl localarl = (arl)paramckT;
    Su localSu = localarl.aDp().Ia();
    if (localSu != null) {
      localaWe.a(localSu.aeL());
      localaWe.xS();
    }
    localaWe.er(true);
    btL.gcv.a((agk)paramckT.aDH());
  }

  public static void m(ckT paramckT) {
    WakfuClientInstance.awy().Dg().B(dmM.cUe().cUg());
    aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
    localaWe.a(byv.bFN().bFO().aeL());
    localaWe.er(false);

    AlphaMaskCommand.eW(false);
    HideFightOccluders.yV(0);

    btL.gcv.b((agk)paramckT.aDH());
  }

  public static void ddD() {
    dLf.djM().j(new Px());
  }

  public static void ak(ArrayList paramArrayList)
  {
    Py localPy = new Py(paramArrayList);

    lHf.s(localPy);
    lHg.s(localPy);
  }
}