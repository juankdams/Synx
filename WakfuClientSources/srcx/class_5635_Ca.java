import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Ca
  implements cvW
{
  private static final Logger K = Logger.getLogger(Ca.class);

  private static Ca bEz = new Ca();

  private final Nm bEA = new Nm();

  private cYk bEB = new cYk();
  private dRK bEC = new dRK("fightPlacement", new float[] { 1.0F, 1.0F, 1.0F, 1.0F });

  public static Ca Lc() {
    return bEz;
  }

  public boolean a(cWG paramcWG) {
    byz localbyz1 = byv.bFN().bFO();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    byz localbyz2;
    ArrayList localArrayList;
    cYk localcYk;
    switch (paramcWG.getId())
    {
    case 18007:
      localObject1 = localbyz1.aeQ();
      if (((arl)localObject1).aEu() != dzm.lFJ) {
        return false;
      }

      localObject2 = new aFt();
      localObject3 = localbyz1.aeL();

      if (!((arl)localObject1).aa(localbyz1)) {
        ((aFt)localObject2).dq(true);
        ((arl)localObject1).Y(localbyz1);
        if (!((arl)localObject1).ab(localbyz1))
          ((cew)localObject3).cha();
        else
          bOJ.a((cew)localObject3, ((cew)localObject3).cgZ());
      }
      else
      {
        ((aFt)localObject2).dq(false);
        ((cew)localObject3).chb();
        ((arl)localObject1).Z(localbyz1);
      }

      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    case 18006:
      localObject1 = new qH();
      ((qH)localObject1).X(byv.bFN().bFO().getId());
      ((qH)localObject1).a(CG.bFM);
      byv.bFN().aJK().d((cWG)localObject1);
      return false;
    case 18004:
      localObject1 = new qH();
      ((qH)localObject1).X(byv.bFN().bFO().getId());
      ((qH)localObject1).a(CG.bFG);
      byv.bFN().aJK().d((cWG)localObject1);
      return false;
    case 18005:
      localObject1 = new qH();
      ((qH)localObject1).X(byv.bFN().bFO().getId());
      ((qH)localObject1).a(CG.bFI);
      byv.bFN().aJK().d((cWG)localObject1);
      return false;
    case 18003:
      localObject1 = new qH();
      ((qH)localObject1).X(byv.bFN().bFO().getId());
      ((qH)localObject1).a(CG.bFK);
      byv.bFN().aJK().d((cWG)localObject1);
      return false;
    case 18011:
      if (localbyz1.c(dKm.lXN)) {
        return false;
      }
      localObject1 = new bPx();

      ((bPx)localObject1).gw(true);

      byv.bFN().aJK().d((cWG)localObject1);

      localObject2 = byv.bFN().bFO();

      localObject3 = new aEe(bU.fH().getString("fight.callForHelp", new Object[] { ((Su)localObject2).getName() }));
      ((aEe)localObject3).mm(4);
      CM.LV().a((aEe)localObject3);

      return false;
    case 18014:
      if (axB.cUs != null) {
        if (localbyz1.c(dKm.lXO)) {
          return false;
        }
        localObject1 = new cSz();
        boolean bool = ((bzu)paramcWG).getBooleanValue();
        ((cSz)localObject1).iI(bool);
        byv.bFN().aJK().d((cWG)localObject1);
      }

      return false;
    case 19994:
    case 19995:
      if (axB.aIZ().aJe()) {
        return true;
      }

      localObject1 = (aqQ)paramcWG;
      localbyz2 = byv.bFN().bFO();
      if (localbyz2.aeQ().aa(localbyz2)) {
        return true;
      }

      localObject3 = localbyz2.aeQ().LB();
      localArrayList = WakfuClientInstance.awy().Dg().a(((aqQ)localObject1).aCX(), ((aqQ)localObject1).aCY(), localbyz2.fc(), bYP.hoH);

      localcYk = a(localbyz2, (UG)localObject3, localArrayList);
      this.bEC.clear();
      if (localcYk != null) {
        this.bEC.Q(localcYk.getX(), localcYk.getY(), localcYk.IB());
      }

      return true;
    case 19992:
      if (axB.aIZ().aJe()) {
        return true;
      }

      localObject1 = (aqQ)paramcWG;
      localbyz2 = byv.bFN().bFO();
      if (localbyz2.aeQ().aa(localbyz2)) {
        return true;
      }
      localObject3 = localbyz2.aeQ().LB();
      localArrayList = WakfuClientInstance.awy().Dg().a(((aqQ)localObject1).aCX(), ((aqQ)localObject1).aCY(), localbyz2.fc(), bYP.hoH);

      if (((aqQ)localObject1).aCU()) {
        localcYk = a(localbyz2, (UG)localObject3, localArrayList);

        if (localcYk != null) {
          aWc.blo().eO(600071L);
          Wl localWl = new Wl();
          localWl.n(localcYk);
          byv.bFN().aJK().d(localWl);
        }
      }
      else {
        return true;
      }

      return false;
    }

    return true;
  }

  private cYk a(byz parambyz, UG paramUG, ArrayList paramArrayList) {
    cYk localcYk = new cYk();
    int i = parambyz.Fx();

    for (int j = 0; j < paramArrayList.size(); j++) {
      DisplayedScreenElement localDisplayedScreenElement = (DisplayedScreenElement)paramArrayList.get(j);
      localcYk.ae(localDisplayedScreenElement.bpc().ddK());

      if (parambyz.ML().equals(localcYk)) {
        return null;
      }
      int k = paramUG.ax(localcYk.getX(), localcYk.getY());
      if ((i == k) && 
        (paramUG.a(parambyz, localcYk)) && (paramUG.aw(localcYk.getX(), localcYk.getY()) == localcYk.IB()))
      {
        return localcYk;
      }
    }

    return null;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().t("isInFightPlacement", Boolean.valueOf(true));
      Bf.Kk().as(true);

      cBQ.cxL().j("wakfu.fightAction", dux.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dLE.doY().t("isInFightPlacement", Boolean.valueOf(false));
      Bf.Kk().as(false);

      br("worldAndFightBarDialog");

      cBQ.cxL().mN("wakfu.fightCreationOrPlacement");
      this.bEC.clear();
    }
  }

  private void br(String paramString) {
    cpa localcpa = cBQ.cxL().coO().nf(paramString);
    if (localcpa != null) {
      dOc localdOc = (dOc)localcpa.fi("apsContainer");
      if (localdOc != null)
        localdOc.setVisible(false);
    }
  }
}