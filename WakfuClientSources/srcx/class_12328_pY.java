import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class pY
  implements bOW, cvW
{
  private static final Logger K = Logger.getLogger(pY.class);

  private static final pY aWI = new pY();
  private cag aWJ;
  private cag aWK;
  private bnm N;

  public static pY xl()
  {
    return aWI;
  }

  public void au(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("characterSheetDialog")))
      byv.bFN().b(this);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    Object localObject4;
    Iterator localIterator;
    int m;
    switch (paramcWG.getId()) {
    case 17682:
      byv.bFN().b(this);
      return false;
    case 17686:
      localObject1 = (cpN)paramcWG;
      localObject2 = ((cpN)localObject1).cpb();
      if (localObject2 == null) {
        return false;
      }

      localObject3 = ((bWG)localObject2).cbI().bQE();
      i = Dn.MA().c((qE)localObject3).size();
      Dn.MA().n((bWG)localObject2);

      if (!Dn.MA().l((bWG)localObject2)) {
        dmO.lli.cUo();
      }

      localObject4 = byv.bFN().bFO().bGQ();
      localIterator = ((dSr)localObject4).iterator();

      while (localIterator.hasNext()) {
        bWG localbWG1 = (bWG)localIterator.next();
        if (localbWG1 != localObject2)
        {
          Dn.MA().a(localbWG1);
        }
      }
      int k = Dn.MA().c((qE)localObject3).size();
      if ((i == 0) && (k == 1)) {
        if (((cpN)localObject1).cvP() != null) {
          ((cpN)localObject1).cvP().setVisible(true);
        }

        if (((cpN)localObject1).cvO() != null) {
          cag localcag = new cag();
          localcag.aJ();
          localcag.setFile("6001009.xps");
          localcag.setAlignment(aFG.eck);
          ((cpN)localObject1).cvO().getAppearance().a(localcag);
          switch (aYT.dFj[localObject3.ordinal()]) {
          case 1:
            this.aWJ = localcag;
            break;
          case 2:
            this.aWK = localcag;
          }
        }

      }

      return false;
    case 17687:
      localObject1 = (cpN)paramcWG;
      localObject2 = ((cpN)localObject1).cpb();
      if (localObject2 == null) {
        return false;
      }

      localObject3 = ((bWG)localObject2).cbI().bQE();
      i = Dn.MA().c((qE)localObject3).size();

      Dn.MA().o((bWG)localObject2);

      if (!Dn.MA().h((bWG)localObject2)) {
        dmO.lli.cUo();
      }

      localObject4 = byv.bFN().bFO().bGQ();
      localIterator = ((dSr)localObject4).iterator();

      while (localIterator.hasNext()) {
        bWG localbWG2 = (bWG)localIterator.next();
        if (localbWG2 != localObject2)
        {
          Dn.MA().a(localbWG2);
        }
      }
      m = Dn.MA().c((qE)localObject3).size();
      if ((i == 1) && (m == 0)) {
        a((cyO)localObject1, (qE)localObject3);
      }

      return false;
    case 17688:
      localObject1 = (cyO)paramcWG;
      localObject2 = qE.z(((cyO)localObject1).af());
      localObject3 = Dn.MA().c((qE)localObject2);
      if (((agT)localObject3).size() > 0) {
        dkQ localdkQ = new dkQ();
        localdkQ.b((agT)localObject3);
        byv.bFN().aJK().d(localdkQ);
        K.info("Envoi d'une requête pour leveler " + ((agT)localObject3).size() + " aptitude(s).");
      }

      Dn.MA().a((qE)localObject2, false);

      a((cyO)localObject1, (qE)localObject2);

      return false;
    case 17689:
      localObject1 = (cyO)paramcWG;
      localObject2 = qE.z(((cyO)localObject1).af());

      Dn.MA().a((qE)localObject2);
      dLE.doY().a(byv.bFN().bFO(), new String[] { "aptitudes", "breedAptitudes", "commonAptitudes", "availableAptitudePoints", "aptitudeMenuText", "availableCommonPoints" });

      a((cyO)localObject1, (qE)localObject2);

      return false;
    case 17680:
      localObject1 = (bzu)paramcWG;

      localObject2 = byv.bFN().bFO();
      if (((byz)localObject2).adF()) {
        return false;
      }

      localObject3 = ((byz)localObject2).bSx();
      if (localObject3 == null) {
        return false;
      }

      byte b = ((bzu)localObject1).af();
      localObject4 = ((byz)localObject2).aii();

      int j = ((aiq)localObject3).e((bhh)localObject4, b);
      if (((aiq)localObject3).c((bhh)localObject4, b) != aMd.eqW) {
        return false;
      }
      m = ((aiq)localObject3).e((bhh)localObject4, b);
      int n = m - j;
      if (n != 0) {
        localObject5 = eu.a(Byte.valueOf(b));
        Rx localRx = (Rx)((byz)localObject2).cQY().a((dSc)localObject5);
        if (((eu)localObject5).isExpandable())
          localRx.gx(n);
        else {
          localRx.gv(n);
        }

      }

      Object localObject5 = new dtU();
      ((dtU)localObject5).fy(((bzu)localObject1).af());
      byv.bFN().aJK().d((cWG)localObject5);

      dLE.doY().a((dBv)localObject2, Su.bF);

      return false;
    case 17690:
      if (!cBQ.cxL().mZ("characterSheetAptitudesDialog")) {
        cBQ.cxL().a("characterSheetAptitudesDialog", VV.dJ("characterSheetAptitudesDialog"), 32769L, (short)10000);
      }
      else {
        cBQ.cxL().mW("characterSheetAptitudesDialog");
        Dn.MA().MB();
      }
      return false;
    case 17681:
    case 17683:
    case 17684:
    case 17685: } return true;
  }

  private void a(cyO paramcyO, qE paramqE) {
    if (paramcyO.cvP() != null) {
      paramcyO.cvP().setVisible(false);
    }

    if (paramcyO.cvO() != null) {
      cag localcag = null;
      switch (aYT.dFj[paramqE.ordinal()]) {
      case 1:
        localcag = this.aWJ;
        this.aWJ = null;
        break;
      case 2:
        localcag = this.aWK;
        this.aWK = null;
      }

      if (localcag != null)
        paramcyO.cvO().getAppearance().c(localcag);
    }
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      xm();
      boolean bool;
      if (duB.dai().j((byte)3, "displayAllCharacteristics"))
        bool = duB.dai().c((byte)3, "displayAllCharacteristics");
      else {
        bool = true;
      }
      P(bool);

      Dn.MA().MB();

      dLE.doY().t("characterSheetSecondMode", Boolean.valueOf(WakfuClientInstance.awy().awB().a(bmz.fEC)));

      this.N = new aYS(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("characterSheetDialog", VV.dJ("characterSheetDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.characterSheet", cZj.class);

      aWc.blo().eO(600054L);
    }
  }

  private void xm() {
    cpa localcpa = cBQ.cxL().coO().nf("worldAndFightBarDialog");
    if (localcpa == null) {
      return;
    }
    dOc localdOc = (dOc)localcpa.fi("fightInfoBtn");
    if (localdOc == null) {
      return;
    }
    localdOc.getAppearance().J(gm.class);
  }

  public void P(boolean paramBoolean) {
    dLE.doY().t("displayAllCharacteristics", Boolean.valueOf(paramBoolean));
    duB.dai().b((byte)3, "displayAllCharacteristics", paramBoolean);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localbyz.afs().cgu();
      }

      dLE.doY().removeProperty("characterSheetSecondMode");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("characterSheetDialog");
      cBQ.cxL().mW("characterSheetAptitudesDialog");

      cBQ.cxL().mN("wakfu.characterSheet");

      aWc.blo().eO(600013L);

      this.aWJ = null;
      this.aWK = null;
    }
  }
}