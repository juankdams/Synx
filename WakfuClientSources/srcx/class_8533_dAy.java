import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class dAy
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dAy.class);

  private static final dAy lHI = new dAy();

  private final ArrayList lHJ = new ArrayList();
  private String lHK;
  private bnm N;

  public static dAy ddT()
  {
    return lHI;
  }

  private void clean()
  {
    for (String str : this.lHJ) {
      cBQ.cxL().mW(str);
    }
    this.lHJ.clear();
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject7;
    Object localObject2;
    Object localObject6;
    switch (paramcWG.getId())
    {
    case 16832:
      localObject1 = (afk)paramcWG;
      int i = ((afk)localObject1).getIntValue();
      localObject3 = bcF.fmQ.oR(i);
      if (localObject3 == null) {
        return false;
      }

      localObject4 = ((adz)localObject3).toArray();
      Arrays.sort((int[])localObject4);
      localObject5 = byv.bFN().bFO().aTn();
      int k = -1;
      for (int m = 0; m < localObject4.length; m++) {
        if (((azP)localObject5).contains(localObject4[m])) {
          k = localObject4[m];
          break;
        }
      }

      if (!byv.bFN().c(bcN.bqJ())) {
        byv.bFN().a(bcN.bqJ());
      }

      if (k != -1) {
        localObject7 = new bzu();
        ((bzu)localObject7).d(16833);
        ((bzu)localObject7).e(k);
        cjO.clE().j((cWG)localObject7);
      }

      localObject7 = new bzu();
      ((bzu)localObject7).d(16831);
      ((bzu)localObject7).e(i);
      cjO.clE().j((cWG)localObject7);

      return false;
    case 16429:
      localObject1 = (brp)paramcWG;
      localObject2 = (dLB)((brp)localObject1).aoo();

      localObject3 = ((brp)localObject1).aop();
      if (localObject2 == null) {
        if (localObject3 == null) {
          return false;
        }

        cBQ.cxL().mW((String)localObject3);
        if (this.lHJ.isEmpty()) {
          byv.bFN().b(this);
        }

        return false;
      }

      localObject4 = "setDetailDialog";
      localObject5 = "setDetailDialog_" + ((dLB)localObject2).nc();

      a((ace)localObject1, localObject2, (String)localObject3, "setDetailDialog", (String)localObject5);

      return false;
    case 16430:
      localObject1 = (dkW)paramcWG;
      localObject2 = (bbM)((dkW)localObject1).aoo();

      if (localObject2 == null) {
        K.error("Impossible de récupérer le familier à décrire");
        return false;
      }

      localObject3 = ((dkW)localObject1).aop();

      localObject5 = "itemDetailDialog";
      localObject4 = kv(((bbM)localObject2).bhS());

      a((ace)localObject1, localObject2, (String)localObject3, (String)localObject5, (String)localObject4);
      return false;
    case 16416:
      localObject1 = (cpB)paramcWG;
      localObject2 = (cfm)((cpB)localObject1).aoo();

      localObject3 = ((cpB)localObject1).aop();
      if (localObject2 == null) {
        if (localObject3 == null) {
          return false;
        }

        cBQ.cxL().mW((String)localObject3);
        if (this.lHJ.isEmpty()) {
          byv.bFN().b(this);
        }

        return false;
      }

      localObject4 = ((cfm)localObject2).cij();
      int j = localObject4 != null ? ((bBn)localObject4).getId() : -1;
      String str = "craftItemDetailDialog";
      localObject7 = "craftItemDetailDialog_" + j;

      a((ace)localObject1, localObject2, (String)localObject3, "craftItemDetailDialog", (String)localObject7);

      return false;
    case 16415:
      localObject1 = (cER)paramcWG;
      localObject2 = (gA)((cER)localObject1).aoo();

      localObject3 = ((cER)localObject1).aop();
      if (localObject2 == null) {
        if (localObject3 == null) {
          return false;
        }

        cBQ.cxL().mW((String)localObject3);
        if (this.lHJ.isEmpty()) {
          byv.bFN().b(this);
        }

        return false;
      }

      localObject4 = null;

      if (((gA)localObject2).nK()) {
        localObject2 = ((gA)localObject2).nH();
        localObject4 = new arY((bKu)localObject2);
      }

      localObject6 = "itemDetailDialog_" + ((gA)localObject2).oj();

      boolean bool1 = a((ace)localObject1, localObject2, (String)localObject3, "itemDetailDialog", (String)localObject6);
      if ((bool1) && (localObject4 != null)) {
        dLE.doY().a("itemLevelController", localObject4, cBQ.cxL().coO().nf((String)localObject3), true);
      }

      return false;
    case 16800:
      localObject1 = byv.bFN().bFO().aeQ();
      if ((localObject1 != null) && (((arl)localObject1).aEu() != dzm.lFI)) {
        return false;
      }

      localObject2 = byv.bFN().bFO();
      if (((byz)localObject2).isDead()) {
        localObject3 = new aEe(bU.fH().getString("action.error.cantWhileDead"));
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
        return false;
      }

      localObject3 = (czW)paramcWG;
      localObject4 = ((czW)localObject3).getItem();
      localObject6 = ((gA)localObject4).ol().nh();

      if (localObject6.length == 0) {
        avW.aIb().a(60, 3, new Object[0]);
        return false;
      }

      byte b = -1;
      if (((czW)localObject3).aks() == -1) {
        for (Object localObject8 : localObject6) {
          if (byv.bFN().bFO().ayJ().dB((short)localObject8.hV) == null) {
            b = localObject8.hV;
            break;
          }
        }
      }
      if (((czW)localObject3).aks() == -2) {
        b = localObject6[0].hV;
      }
      if ((((czW)localObject3).aks() == -3) && (localObject6.length > 1)) {
        b = localObject6[1].hV;
      }

      if (b == -1) {
        b = localObject6[0].hV;
      }

      byv.bFN().bFO().a((gA)localObject4, (short)1, ((czW)localObject3).getSourcePosition(), b, ((czW)localObject3).getSourceUniqueId(), ((czW)localObject3).getDestinationUniqueId());
      dLE.doY().a(byv.bFN().bFO(), new String[] { "actorEquipment" });

      return false;
    case 16803:
      localObject1 = byv.bFN().bFO().aeQ();
      if ((localObject1 != null) && (((arl)localObject1).aEu() != dzm.lFI)) {
        return false;
      }

      localObject2 = byv.bFN().bFO();
      if (((byz)localObject2).isDead()) {
        localObject3 = new aEe(bU.fH().getString("action.error.cantWhileDead"));
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
        return false;
      }

      localObject3 = (czW)paramcWG;
      localObject4 = ((czW)localObject3).getItem();
      localObject6 = byv.bFN().bFO();
      cRs localcRs = ((byz)localObject6).bGP().ao((gA)localObject4);

      if (!((byz)localObject6).ayJ().m((dsj)localObject4)) {
        return false;
      }

      if (localcRs == null) {
        cBQ.cxL().a(bU.fH().getString("error.bagFull"), Cn.et(1), 1027L, 102, 1);

        return false;
      }
      long l2 = localcRs.EN();
      if (l2 == -1L) {
        return false;
      }
      try
      {
        if (!localcRs.au(((czW)localObject3).getItem()))
          return false;
      }
      catch (Exception localException) {
        return false;
      }

      byv.bFN().bFO().a(((czW)localObject3).getItem(), (short)-1, ((czW)localObject3).getSourcePosition(), (byte)-1, 2L, l2);
      dLE.doY().a(byv.bFN().bFO(), new String[] { "actorEquipment" });
      return false;
    case 16804:
      localObject1 = byv.bFN().bFO().aeQ();
      if ((localObject1 != null) && (((arl)localObject1).aEu() != dzm.lFI)) {
        return false;
      }

      localObject2 = (czW)paramcWG;
      byv.bFN().bFO().a(((czW)localObject2).getItem(), ((czW)localObject2).nP(), ((czW)localObject2).getSourcePosition(), ((czW)localObject2).getDestinationPosition(), ((czW)localObject2).getSourceUniqueId(), ((czW)localObject2).getDestinationUniqueId());
      if (cBQ.cxL().mZ("splitStackDialog")) {
        cBQ.cxL().mW("splitStackDialog");
      }

      dLE.doY().a(byv.bFN().bFO(), new String[] { "actorEquipment" });

      return false;
    case 16828:
      localObject1 = (czW)paramcWG;
      localObject2 = new cpi(((czW)localObject1).getItem().ok());
      localObject3 = byv.bFN().aJK();
      if (localObject3 != null) {
        ((cyx)localObject3).d((cWG)localObject2);
      }
      return false;
    case 16820:
      localObject1 = byv.bFN().bFO();
      if (((byz)localObject1).aeQ() != null) {
        return false;
      }

      localObject2 = (czW)paramcWG;
      localObject3 = ((czW)localObject2).getItem();
      localObject4 = cBQ.cxL().a(bU.fH().getString("question.throwAwayItem", new Object[] { ((gA)localObject3).getName() }), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject4).a(new cYN(this, (gA)localObject3, (czW)localObject2));

      return false;
    case 16827:
      localObject1 = byv.bFN().bFO();

      if ((((byz)localObject1).aeQ() != null) || (aYP.feK.bnQ())) {
        return false;
      }

      localObject2 = (czW)paramcWG;
      localObject3 = ((czW)localObject2).getItem();

      if ((localObject3 != null) && (((gA)localObject3).oi().a(Aq.bvR) != null) && (((gA)localObject3).oi().a(Aq.bvV) != null) && (!((gA)localObject3).oi().a(Aq.bvR).i(localObject1, ((byz)localObject1).ML(), localObject3, ((byz)localObject1).bEY())) && (!((gA)localObject3).oi().a(Aq.bvV).i(localObject1, ((byz)localObject1).ML(), localObject3, ((byz)localObject1).bEY())))
      {
        dtY.aS((gA)localObject3);
        return false;
      }

      localObject4 = cBQ.cxL().a(bU.fH().getString("question.deleteItem", new Object[] { ((gA)localObject3).getName() }), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject4).a(new cYM(this, (gA)localObject3));

      return false;
    case 16712:
      localObject1 = (bqw)paramcWG;

      localObject2 = byv.bFN().bFO();
      if (((byz)localObject2).isDead()) {
        localObject3 = new aEe(bU.fH().getString("action.error.cantWhileDead"));
        ((aEe)localObject3).mm(3);
        CM.LV().a((aEe)localObject3);
        return false;
      }

      localObject3 = ((bqw)localObject1).getItem();
      if ((localObject3 != null) && (((gA)localObject3).on())) {
        if ((byv.bFN().c(azv.aLf())) && 
          (azv.aLf().getItem() == localObject3)) {
          byv.bFN().b(azv.aLf());
          return false;
        }

        if ((((bqw)localObject1).bzB()) || (((bVw)((gA)localObject3).oi()).cbj() == bbG.fkQ)) {
          if (((gA)localObject3).iterator().hasNext()) {
            localObject4 = new dQg();
            ((dQg)localObject4).aW(((gA)localObject3).oj());
            byv.bFN().aJK().d((cWG)localObject4);
          }

          if (a((Su)localObject2, (gA)localObject3, ((byz)localObject2).aKb())) {
            localObject4 = new aEe(bU.fH().getString("chat.item.selfUse", new Object[] { ceb.ag((gA)localObject3) }));
            ((aEe)localObject4).mm(4);
            CM.LV().a((aEe)localObject4);
          }
        } else {
          azv.aLf().e((gA)localObject3);
          azv.aLf().af((Su)localObject2);
          byv.bFN().a(azv.aLf());
        }
      }

      return false;
    case 16715:
      localObject1 = (afk)paramcWG;
      long l1 = ((afk)localObject1).ah();

      localObject4 = byv.bFN().bFO();
      localObject6 = ((byz)localObject4).bGP().iS(l1);
      if (localObject6 == null) {
        return false;
      }

      short s = ((gA)localObject6).oi().bKk();
      dLB localdLB = bCc.bKN().cm(s);

      if (localdLB == null) {
        K.warn("On essaye de merger un itemSet inexistant");
        return false;
      }

      if (!dTX.d(localdLB)) {
        K.warn("Le set d'id=" + s + " n'est pas mergeable.");
        return false;
      }

      boolean bool2 = dTX.a((dhJ)localObject4, localdLB, true);

      if (bool2) {
        Qc localQc = new Qc();
        localQc.T(s);
        byv.bFN().aJK().d(localQc);
      }
      return false;
    case 16870:
      localObject1 = (bRA)paramcWG;
      gA localgA = ((bRA)localObject1).bYK();
      localObject3 = (gA)((bRA)localObject1).aoo();

      if (aYP.feK.bnQ()) {
        CM.LV().f(bU.fH().getString("error.impossibleDuringExchange"), 3);
        return false;
      }

      if (localObject3 == null) {
        return false;
      }

      if (!((gA)localObject3).nM()) {
        return false;
      }

      if (localgA.oi().bKD() != aRQ.eOV) {
        return false;
      }

      if (((gA)localObject3).nP() != 1) {
        CM.LV().f(bU.fH().getString("error.cantSocketGemOnStackedItem"), 3);
        return false;
      }

      localObject4 = ((gA)localObject3).nO();

      if (localgA.nU() < ((gA)localObject3).nU()) {
        CM.LV().f(bU.fH().getString("error.gemIsTooLowLevel"), 3);
        return false;
      }

      if (!((cdI)localObject4).d(localgA.oi())) {
        CM.LV().f(bU.fH().getString("error.cantSocketGem"), 3);
        return false;
      }

      localObject6 = bU.fH().getString("question.socketGem.emptySlot");

      cKX localcKX = cBQ.cxL().a((String)localObject6, Cn.et(0), 2073L, 102, 1);

      localcKX.a(new cYP(this, localgA, (gA)localObject3));

      return false;
    }

    return true;
  }

  public static boolean a(Su paramSu, gA paramgA, cYk paramcYk) {
    dKf localdKf = (dKf)paramgA.oi().bKr();
    if ((localdKf != null) && (!paramSu.adF())) {
      bOU.gUc.b(new ctD(paramgA.oi()));
      localdKf.ap(paramcYk);
      if (localdKf.hK(paramgA.ok())) {
        a(paramgA, localdKf);
        return false;
      }
      return localdKf.f(paramgA);
    }

    return false;
  }

  private static void a(gA paramgA, dKf paramdKf) {
    cKX localcKX = cBQ.cxL().a(String.format(bU.fH().getString("question.activate.restat"), new Object[0]), Cn.et(0), 2073L, 102, 1);

    localcKX.a(new cYO(paramdKf, paramgA));
  }

  private boolean a(ace paramace, Object paramObject, String paramString1, String paramString2, String paramString3)
  {
    if ((!cBQ.cxL().mZ(paramString3)) && (this.lHJ.size() < 30))
    {
      bpn localbpn;
      if (paramString1 == null) {
        localbpn = (bpn)cBQ.cxL().a(paramString3, VV.dJ(paramString2), 129L, (short)10000);

        localbpn.a(new cYK(this, localbpn, paramace));
      }
      else
      {
        localbpn = (bpn)cBQ.cxL().a(paramString3, VV.dJ(paramString2), this.lHK == null ? paramString1 : this.lHK, paramString1, paramString2, 129L, (short)10000);
      }

      this.lHK = paramString3;
      dLE.doY().a("itemDetail", paramObject, localbpn.getElementMap(), true);

      this.lHJ.add(paramString3);

      return true;
    }
    cBQ.cxL().mW(paramString3);

    return false;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.N = new cYH(this);

      dLE.doY().t("pet", null);

      cBQ.cxL().a(this.N);

      cBQ.cxL().j("wakfu.itemDetails", dxt.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.lHK = null;
      this.lHJ.clear();

      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.itemDetails");

      clean();
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public String kv(long paramLong) {
    return "itemDetailDialog_" + paramLong;
  }
}