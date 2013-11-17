import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class zV
  implements cvW
{
  private static zV bvb = new zV();

  private static final Logger K = Logger.getLogger(zV.class);
  private dpr bvc;
  private final cSR bvd = new cSR();

  private boolean bve = false;

  public static zV IH()
  {
    return bvb;
  }

  public boolean a(cWG paramcWG)
  {
    cMa localcMa;
    boolean bool3;
    boolean bool4;
    switch (paramcWG.getId())
    {
    case 16405:
      byv.bFN().b(this);
      return false;
    case 16710:
      b(CG.bFM);
      return false;
    case 16707:
      b(CG.bFK);
      return false;
    case 16708:
      b(CG.bFG);
      return false;
    case 16709:
      b(CG.bFI);
      return false;
    case 16406:
      if (dLE.doY().getBooleanProperty("spellInventoryDisplay")) {
        dLE.doY().t("spellInventoryDisplay", Boolean.valueOf(false));
      } else {
        II();
        dLE.doY().t("spellInventoryDisplay", Boolean.valueOf(true));
      }
      return false;
    case 16419:
      if (dLE.doY().getBooleanProperty("itemInventoryDisplay")) {
        dLE.doY().t("itemInventoryDisplay", Boolean.valueOf(false));
      } else {
        II();
        dLE.doY().t("itemInventoryDisplay", Boolean.valueOf(true));
      }
      return false;
    case 16422:
      if (cBQ.cxL().mZ("osamodasSymbiotDialog")) {
        byv.bFN().b(bJI.bRn());
      } else {
        II();
        byv.bFN().a(bJI.bRn());
      }

      return false;
    case 16434:
      if (dLE.doY().getBooleanProperty("fightActionsDisplay")) {
        dLE.doY().t("fightActionsDisplay", Boolean.valueOf(false));
      }
      else {
        II();
        dLE.doY().t("fightActionsDisplay", Boolean.valueOf(true));
      }

      return false;
    case 16423:
      if (dLE.doY().getBooleanProperty("kardsDisplay")) {
        dLE.doY().t("kardsDisplay", Boolean.valueOf(false));
      }
      else {
        II();
        dLE.doY().t("kardsDisplay", Boolean.valueOf(true));
      }
      return false;
    case 16410:
      if (dLE.doY().getBooleanProperty("spellInventoryDisplay")) {
        dLE.doY().t("spellInventoryDisplay", Boolean.valueOf(false));
      }
      return false;
    case 16700:
      localcMa = (cMa)paramcWG;
      Object localObject1 = localcMa.getItem();
      boolean bool1 = localcMa.getBooleanValue();
      bool3 = localcMa.cEX();
      bool4 = byv.bFN().bFO().i(dKm.lXH);
      if ((bool4) && (!bool3))
        return false;
      if (localObject1 == null) {
        return false;
      }
      int k = localcMa.cEU();
      int m = localcMa.cEV();
      int n = localcMa.getPosition();
      dKD localdKD1 = null;
      aFy localaFy1 = this.bvc.cWy();

      if ((n != -1) && (k != -1)) {
        localdKD1 = this.bvc.fu((byte)k).cI((short)n);

        if (localdKD1 != null) {
          localdKD1 = (dKD)localdKD1.ow();
        }
      }
      int i1 = localcMa.cEW();
      aFy localaFy2 = null;
      dKD localdKD2 = null;
      Object localObject3;
      if ((localObject1 instanceof apX)) {
        localaFy2 = aFy.ebH;
        localObject3 = (apX)localObject1;
        localdKD2 = dKD.b(bKq.gNe, ((apX)localObject3).oj(), ((apX)localObject3).ok(), ((apX)localObject3).oc());
      } else if ((localObject1 instanceof dKD)) {
        localdKD2 = (dKD)localObject1;
        if (localdKD2.asL() == bKq.gNh) {
          localObject3 = Hh.QM().dh(2145);
          if (localdKD2.ok() != ((bBn)localObject3).getId()) {
            gA localgA = (gA)byv.bFN().bFO().ayJ().dB((short)(int)-(localdKD2.oj() + 1L));

            localaFy2 = localgA.on() ? aFy.ebG : aFy.ebH;

            if (localgA.isActive()) {
              localdKD2 = dKD.b(bKq.gNg, localgA.oj(), localgA.ok(), localgA.oc());
              if (localgA.isUsable())
                localdKD2.bg((byte)2);
              else
                localdKD2.bg((byte)3);
            }
          }
        }
      }
      else if ((localObject1 instanceof gA))
      {
        localObject3 = (gA)localObject1;
        localaFy2 = aFy.ebG;
        if (byv.bFN().bFO().bGP().o((dsj)localObject3) != null) {
          if (((gA)localObject3).oi().bKn().nh().length > 0) {
            localdKD2 = dKD.b(bKq.gNg, ((gA)localObject3).oj(), ((gA)localObject3).ok(), ((gA)localObject3).oc());
            localdKD2.bg((byte)0);
          }
          else if (((gA)localObject3).isUsable()) {
            localdKD2 = dKD.b(bKq.gNf, -1L, ((gA)localObject3).ok(), ((gA)localObject3).oc());
            localdKD2.bg((byte)4);
          } else {
            localdKD2 = dKD.b(bKq.gNg, ((gA)localObject3).oj(), ((gA)localObject3).ok(), ((gA)localObject3).oc());
            localdKD2.bg((byte)0);
          }
        }
        else if (byv.bFN().bFO().ayJ().f((dsj)localObject3)) {
          localdKD2 = dKD.b(bKq.gNg, ((gA)localObject3).oj(), ((gA)localObject3).ok(), ((gA)localObject3).oc());
          if (((gA)localObject3).isUsable())
            localdKD2.bg((byte)2);
          else
            localdKD2.bg((byte)3);
        }
        else {
          localdKD2 = null;
        }

      }
      else if ((localObject1 instanceof cC)) {
        localaFy2 = aFy.ebG;
        localObject3 = (cC)localObject1;
        localdKD2 = dKD.b(bKq.gNi, ((cC)localObject3).getId(), ((cC)localObject3).getId(), ((cC)localObject3).getId());
      }

      if ((localaFy2 != null) && (this.bvc.cWy() != localaFy2)) {
        this.bvc.d(localaFy2);
        n = -1;
        k = -1;
      }

      if (!this.bvc.a(localdKD2, k, (short)n))
      {
        if ((localdKD1 != null) && (i1 != -1)) {
          this.bvc.a(localdKD1, k, (short)n);
        }
        if (localdKD2 != null) {
          localdKD2.release();
        }
        if (bool4)
          this.bvc.d(localaFy1);
        return false;
      }
      if ((localdKD1 != null) && (i1 != -1)) {
        localObject3 = dKD.b(localdKD1.asL(), localdKD1.oj(), localdKD1.ok(), localdKD1.asM());
        this.bvc.a((dKD)localObject3, m, (short)i1);
      }
      if (bool1) {
        aWc.blo().eO(600053L);
      }

      if (bool4) {
        this.bvc.d(localaFy1);
      }
      return false;
    case 16701:
      localcMa = (cMa)paramcWG;
      int i = localcMa.cEU();
      int j = localcMa.getPosition();
      bool3 = localcMa.cEX();
      bool4 = byv.bFN().bFO().i(dKm.lXH);
      if ((bool4) && (!bool3))
        return false;
      this.bvc.b(i, (short)j, false);

      aWc.blo().eO(600059L);
      return false;
    case 16702:
      localcMa = (cMa)paramcWG;
      Object localObject2 = localcMa.getItem();
      boolean bool2 = localcMa.cEX();
      bool3 = byv.bFN().bFO().i(dKm.lXH);
      if ((bool3) && (!bool2))
        return false;
      if ((localObject2 instanceof dKD)) {
        this.bvc.b((dKD)localObject2, localcMa.cEU(), (short)localcMa.getPosition());
      }

      aWc.blo().blE();
      return false;
    case 16703:
      this.bvc.cWM();
      IM();

      return false;
    case 16704:
      this.bvc.cWN();
      IM();

      return false;
    case 16411:
      dLE.doY().t("spellDescriptionDisplay", Boolean.valueOf(true));

      return false;
    case 16412:
      if (dLE.doY().getBooleanProperty("spellDescriptionDisplay")) {
        dLE.doY().t("spellDescriptionDisplay", Boolean.valueOf(false));
      }

      return false;
    case 16433:
      this.bvc.a(this.bvc.cWy() == aFy.ebH ? aFy.ebG : aFy.ebH, true);

      return false;
    case 16432:
      this.bvc.a(this.bvc.cWy() == aFy.ebG ? aFy.ebH : aFy.ebG, true);

      return false;
    }

    return true;
  }

  private void b(CG paramCG) {
    byz localbyz = byv.bFN().bFO();
    if (!localbyz.adF()) {
      return;
    }
    cgQ localcgQ = new cgQ(paramCG);
    byv.bFN().aJK().d(localcgQ);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void II() {
    dLE.doY().t("throwableInventoryDisplay", Boolean.valueOf(false));
    if (!byv.bFN().bFO().adF())
      dLE.doY().t("fightActionsDisplay", Boolean.valueOf(false));
  }

  public void IJ()
  {
    if (!this.bvc.ft((byte)0).axS())
      IK();
    else
      IL();
  }

  public void M(byte paramByte)
  {
    if (!this.bvc.ft(paramByte).axS())
      N(paramByte);
    else
      b(paramByte, true);
  }

  public void IK()
  {
    byte b1 = 0; for (byte b2 = this.bvc.cWy().aRO(); b1 < b2; b1 = (byte)(b1 + 1))
      N(b1);
  }

  public void IL()
  {
    byte b1 = 0; for (byte b2 = this.bvc.cWy().aRO(); b1 < b2; b1 = (byte)(b1 + 1))
      b(b1, false);
  }

  public void N(byte paramByte)
  {
    bJz localbJz = this.bvc.ft(paramByte);
    if (localbJz.axS()) {
      return;
    }

    String str1 = localbJz.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog";
    String str2 = str1 + paramByte;

    if (cBQ.cxL().mZ(str2)) {
      return;
    }

    String str3 = null;
    try {
      if (!this.bvd.isEmpty()) {
        int i = 0;
        do {
          bpn localbpn2 = (bpn)this.bvd.get(i);
          if ((localbpn2 != null) && (!localbpn2.isUnloading()) && (!localbpn2.getUserDefinedManager().bTT())) {
            str3 = localbpn2.getElementMap().getId();
            break;
          }
          i = (byte)(i + 1);
        }while (i < this.bvd.size());
      }
    }
    catch (Exception localException) {
      K.error("Erreur au contrôle du placement d'une barre de raccourci secondaire");
      return;
    }
    bpn localbpn1;
    if (str3 != null) {
      localbpn1 = (bpn)cBQ.cxL().a(str2, VV.dJ(str1), null, str3, str1, 40960L, (short)10005);
    }
    else {
      localbpn1 = (bpn)cBQ.cxL().a(str2, VV.dJ(str1), 40960L, (short)10005);
    }

    localbpn1.setHorizontalDialog("secondaryShortcutBarDialog");
    localbpn1.setVerticalDialog("verticalSecondaryShortcutBarDialog");

    if (!this.bvd.contains(paramByte))
    {
      this.bvd.put(paramByte, localbpn1);
    }

    LJ.Wo().a(localbpn1, false);

    dLE.doY().a("shortcutBar", this.bvc.ft(paramByte), localbpn1.getElementMap());

    b(paramByte, true, true);
  }

  public void b(byte paramByte, boolean paramBoolean) {
    bJz localbJz = this.bvc.ft(paramByte);
    if (!localbJz.axS()) {
      return;
    }

    String str = (localbJz.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + paramByte;
    if (cBQ.cxL().mZ(str)) {
      cBQ.cxL().mW(str);
    }

    b(paramByte, false, paramBoolean);
  }

  public void b(byte paramByte, boolean paramBoolean1, boolean paramBoolean2) {
    for (aFy localaFy : aFy.aRT()) {
      this.bvc.c(localaFy, paramByte).cq(paramBoolean1);
    }

    if (paramBoolean2)
      IN();
  }

  public void c(byte paramByte, boolean paramBoolean)
  {
    for (aFy localaFy : aFy.aRT()) {
      this.bvc.c(localaFy, paramByte).setVertical(paramBoolean);
    }

    IN();
  }

  public void IM() {
    if (this.bvc != null) {
      aFy localaFy = this.bvc.cWy();
      if (localaFy != null) {
        byte b1 = 0; for (byte b2 = localaFy.aRO(); b1 < b2; b1 = (byte)(b1 + 1))
          O(b1);
      }
    }
  }

  public void O(byte paramByte)
  {
    bJz localbJz = this.bvc.ft(paramByte);
    String str = (localbJz.isVertical() ? "verticalSecondaryShortcutBarDialog" : "secondaryShortcutBarDialog") + paramByte;
    if (cBQ.cxL().mZ(str))
      dLE.doY().a("shortcutBar", this.bvc.ft(paramByte), str);
  }

  public void IN()
  {
    boolean[] arrayOfBoolean = new boolean[this.bvc.cWy().aRO() * 2];
    int i = 0; for (int k = this.bvc.cWy().aRO(); i < k; i = (byte)(i + 1)) {
      bJz localbJz = this.bvc.ft(i);
      arrayOfBoolean[(i * 2)] = localbJz.axS();
      arrayOfBoolean[(i * 2 + 1)] = localbJz.isVertical();
    }
    i = 0;
    int m = Math.min(32, arrayOfBoolean.length);
    int j;
    for (int n = 0; n < m; n++) {
      if (arrayOfBoolean[n] != 0) {
        i += (1 << n);
      }
    }
    WakfuClientInstance.awy().awB().a(bmz.fEj, j);
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!this.bve) {
      aIH localaIH = WakfuClientInstance.awy().awB();
      this.bvc = byv.bFN().bFO().bGD();
      aFy localaFy1 = aFy.valueOf(localaIH.f(bmz.fEl));
      bmz localbmz = localaFy1 == aFy.ebH ? bmz.fEm : bmz.fEn;

      byte b1 = (byte)localaIH.d(localbmz);
      if (localaFy1 != null) {
        if (this.bvc.cWy() != localaFy1)
          this.bvc.b(localaFy1, b1);
        else {
          this.bvc.q(b1, true);
        }
      }
      II();

      arl localarl = byv.bFN().bFO().aeQ();
      if ((localarl != null) && 
        (localarl.aDp().Ia() == byv.bFN().bFO())) {
        byv.bFN().a(aDd.aPo());
      }

      cBQ.cxL().j("wakfu.shortcutBar", bAq.class);
      cBQ.cxL().j("wakfu.osamodasSymbiot", sE.class);

      this.bve = true;

      int i = localaIH.d(bmz.fEj);
      int j = Math.min(32, aFy.aRT()[0].aRO() * 2);
      boolean[] arrayOfBoolean1 = new boolean[j];
      for (int k = 0; k < j; k++) {
        arrayOfBoolean1[k] = ((i >> k & 0x1) == 1 ? 1 : false);
      }
      boolean[] arrayOfBoolean2 = arrayOfBoolean1;
      for (aFy localaFy2 : aFy.aRT()) {
        byte b2 = 0; for (byte b3 = localaFy2.aRO(); b2 < b3; b2 = (byte)(b2 + 1)) {
          bJz localbJz = this.bvc.c(localaFy2, b2);
          localbJz.setVertical(arrayOfBoolean2[(b2 * 2 + 1)]);
        }
      }

      int m = 0; for (??? = this.bvc.cWy().aRO(); m < ???; m = (byte)(m + 1))
        if (arrayOfBoolean2[(m * 2)] != 0)
          N(m);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (this.bve) {
      this.bvd.clear();
      qn.xw().clean();

      IL();

      cBQ.cxL().mN("wakfu.shortcutBar");
      cBQ.cxL().mN("wakfu.osamodasSymbiot");

      byv.bFN().b(aDd.aPo());

      this.bvc = null;
      this.bve = false;
    }
  }
}