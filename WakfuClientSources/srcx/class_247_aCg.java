import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aCg
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aCg.class);

  private static aCg dWx = new aCg();
  private bnm N;
  private ArrayList dWy = new ArrayList();
  private String dWz;
  private aoL dWA = new aoL();

  final Runnable dWB = new dwl(this);
  private gA dWC;

  private int a(cUb paramcUb)
  {
    kb localkb = paramcUb.cJm().V(dDE.dft().VN());
    return localkb.d(paramcUb.cJh().MD());
  }

  public static aCg aOq()
  {
    return dWx;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    Object localObject4;
    Object localObject6;
    Object localObject7;
    switch (paramcWG.getId())
    {
    case 19152:
      localObject1 = (dkW)paramcWG;

      localObject2 = (ckV)((dkW)localObject1).aoo();
      if (localObject2 == null) {
        K.error("Impossible de récupérer le familier à décrire");
        return false;
      }
      localObject3 = ((ckV)localObject2).cmF();

      localObject5 = "petDialog";

      localObject4 = y((gA)localObject3);
      localObject6 = ((dkW)localObject1).aop();

      for (localObject7 = this.dWy.iterator(); ((Iterator)localObject7).hasNext(); ) { String str = (String)((Iterator)localObject7).next();
        cBQ.cxL().mW(str);
      }

      if (!cBQ.cxL().mZ((String)localObject4))
      {
        if (localObject6 == null) {
          localObject7 = (bpn)cBQ.cxL().a((String)localObject4, VV.dJ("petDialog"), 129L, (short)10000);

          ((bpn)localObject7).a(new dwe(this, (bpn)localObject7, (dkW)localObject1));
        }
        else
        {
          cBQ.cxL().a((String)localObject4, VV.dJ("petDialog"), this.dWz == null ? localObject6 : this.dWz, (String)localObject6, "petDialog", 129L, (short)10000);
        }

        this.dWz = ((String)localObject4);
        dLE.doY().a("pet", localObject2, (String)localObject4);

        this.dWy.add(localObject4);
        aOq().aOs();
      } else {
        cBQ.cxL().mW((String)localObject4);
      }
      return false;
    case 19154:
      localObject1 = (bGY)paramcWG;
      localObject2 = ((bGY)localObject1).getItem();
      if (localObject2 == null) {
        return false;
      }
      localObject3 = ((bGY)localObject1).boi();
      if (localObject3 == null) {
        return false;
      }

      localObject4 = byv.bFN().bFO();
      if (!((byz)localObject4).bGP().N(((gA)localObject2).oj())) {
        localObject5 = bU.fH().getString("pet.feedUnauthorizedNotFromInventory");
        localObject6 = new aEe((String)localObject5);
        ((aEe)localObject6).mm(3);
        CM.LV().ez(3).a((aEe)localObject6);
        return false;
      }

      localObject5 = ((gA)localObject2).oi().a(Aq.bvV);

      if ((((gA)localObject2).nI()) || ((localObject5 != null) && (!((bZA)localObject5).i(localObject4, localObject2, localObject2, ((byz)localObject4).bGa())))) {
        localObject6 = bU.fH().getString("pet.feedUnauthorized");
        localObject7 = new aEe((String)localObject6);
        ((aEe)localObject7).mm(3);
        CM.LV().ez(3).a((aEe)localObject7);
        return false;
      }

      localObject6 = cBQ.cxL().a(bU.fH().getString("question.feedPet", new Object[] { ((gA)localObject2).getName() }), Cn.et(0), 2073L, 102, 1);

      ((cKX)localObject6).a(new dwb(this, (gA)localObject2, (ckV)localObject3));

      return false;
    case 19153:
      localObject1 = (aZb)paramcWG;
      localObject2 = ((aZb)localObject1).getStringValue();
      localObject3 = ((aZb)localObject1).boi();
      if ((aYD.avC().eA((String)localObject2)) && (((String)localObject2).length() > 0) && (!((String)localObject2).equals(((ckV)localObject3).getName())))
      {
        localObject4 = new cIb();
        ((cIb)localObject4).bP(((ckV)localObject3).cmF().oj());
        ((cIb)localObject4).eK((String)localObject2);
        byv.bFN().aJK().d((cWG)localObject4);
      } else {
        localObject4 = bU.fH().getString("error.chat.operationNotPermited");
        localObject5 = new aEe((String)localObject4);
        ((aEe)localObject5).mm(3);
        CM.LV().a((aEe)localObject5);
      }
      return false;
    case 19155:
      localObject1 = (czW)paramcWG;
      localObject2 = byv.bFN().bFO().gk(((czW)localObject1).ah());
      if (localObject2 == null) {
        return false;
      }
      this.dWC = ((czW)localObject1).getItem();
      localObject3 = new ckV((gA)localObject2);
      ((ckV)localObject3).ih(this.dWC.ok());
      cBQ.cxL().a("petColorPreviewDialog", VV.dJ("petColorPreviewDialog"), 256L, (short)30000);

      dLE.doY().a("pet", localObject3, "petColorPreviewDialog");
      dLE.doY().t("petColorPreviewText", bU.fH().getString("pet.colorPreviewQuestion", new Object[] { this.dWC.getName() }));
      return false;
    case 19156:
      aOr();
      return false;
    case 19157:
      localObject1 = new cgq();
      ((cgq)localObject1).bP(this.dWC.oj());
      ((cgq)localObject1).cS(((bzu)paramcWG).ah());
      byv.bFN().aJK().d((cWG)localObject1);
      aOr();
      return false;
    case 19158:
      localObject1 = (czW)paramcWG;
      localObject2 = new bMZ();
      ((bMZ)localObject2).bP(((czW)localObject1).getItem().oj());
      ((bMZ)localObject2).cS(((czW)localObject1).ah());
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    case 19159:
      localObject1 = (czW)paramcWG;
      localObject2 = new ajo();
      ((ajo)localObject2).cS(((czW)localObject1).ah());
      ((ajo)localObject2).aH((byte)((czW)localObject1).aks());
      ((ajo)localObject2).cT(((czW)localObject1).getDestinationUniqueId());
      byv.bFN().aJK().d((cWG)localObject2);
      return false;
    }

    return true;
  }

  private void a(ckV paramckV, gA paramgA) {
    cUb localcUb = paramckV.cmF().nJ();
    dxL localdxL = dDE.dft().VN();

    bAF localbAF = paramckV.cmG();
    String str;
    if (localcUb.cJh().Aw(paramgA.ok())) {
      localbAF.eq("AnimEmote-Effrayee");
      localbAF.asZ();
      str = bU.fH().getString("pet.chat.sleeping", new Object[] { bXW.l(localcUb.cJh().Ax(paramgA.ok())) });
    } else if (localcUb.cJh().Au(paramgA.ok())) {
      localbAF.eq("AnimEmote-Rire");
      localbAF.asZ();
      str = bU.fH().getString("pet.chat.healing", new Object[] { Integer.valueOf(localcUb.cJh().Av(paramgA.ok())) });
    } else if (!localcUb.cJh().eB(paramgA.ok())) {
      localbAF.eq("AnimEmote-Effrayee");
      localbAF.asZ();
      str = bU.fH().getString("pet.chat.feedWithBadItem", new Object[] { Integer.valueOf(localcUb.cJh().a(cDI.ixi)) });
    } else if (!localcUb.cJl().V(localdxL).b(localcUb.cJh().MC())) {
      localbAF.eq("AnimEmote-Effrayee");
      localbAF.asZ();
      str = bU.fH().getString("pet.chat.feedNotHungry", new Object[] { Integer.valueOf(localcUb.cJh().a(cDI.ixh)) });
    } else {
      localbAF.eq("AnimEmote-Rire");
      localbAF.asZ();
      str = bU.fH().getString("pet.chat.feedGood", new Object[] { Byte.valueOf(localcUb.cJh().ME()) });
    }
    aEe localaEe = new aEe(str);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  private void aOr() {
    ckV localckV = (ckV)dLE.doY().br("pet", "petColorPreviewDialog");
    localckV.clean();
    dLE.doY().a("pet", null, "petColorPreviewDialog");
    cBQ.cxL().mW("petColorPreviewDialog");
    this.dWC = null;
  }

  private String y(gA paramgA) {
    return "petDialog_" + paramgA.oj();
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.N = new dvY(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().j("wakfu.pet", dfo.class);

      dka.cSF().a(this.dWB, 1000L, -1);

      di(false);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      aOw();
      dka.cSF().j(this.dWB);

      this.dWy.clear();
      this.dWz = null;

      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.pet");
    }
  }

  public void z(gA paramgA)
  {
    if (this.dWA.N(paramgA.oj())) {
      return;
    }
    ahv localahv = new ahv(this, paramgA, null);
    this.dWA.put(paramgA.oj(), localahv);
  }

  public void A(gA paramgA) {
    if (!this.dWA.N(paramgA.oj())) {
      return;
    }
    paramgA.nJ().d((cfI)this.dWA.get(paramgA.oj()));
    this.dWA.remove(paramgA.oj());
  }

  public void aOs() {
    dka.cSF().j(this.dWB);
    dka.cSF().a(this.dWB, 1000L, -1);
  }

  public boolean aOt() {
    if (!this.dWy.isEmpty()) {
      return false;
    }
    if (dLE.doY().rv("pet") != null) {
      return false;
    }
    return true;
  }

  public void aOu() {
    if (!aOt()) {
      return;
    }
    dka.cSF().j(this.dWB);
  }

  public boolean a(ckV paramckV) {
    return B(paramckV.cmF());
  }

  public boolean B(gA paramgA) {
    return this.dWy.contains(y(paramgA));
  }

  public void aOv() {
    for (Object localObject1 = this.dWy.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (String)((Iterator)localObject1).next();
      ckV localckV = (ckV)dLE.doY().br("pet", (String)localObject2);
      localckV.VF();
    }
    localObject1 = (ckV)dLE.doY().rv("pet");
    if (localObject1 == null) {
      return;
    }
    Object localObject2 = ((ckV)localObject1).cmF();
    if (localObject2 == null) {
      return;
    }
    if (((gA)localObject2).oi() == null) {
      return;
    }
    ((ckV)localObject1).VF();
  }

  public void C(gA paramgA) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    if (B(paramgA)) {
      cBQ.cxL().mW(y(paramgA));
    }
    aOv();
    di(true);
  }

  private void di(boolean paramBoolean)
  {
    aOw();
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    bMD localbMD = localbyz.bGP();
    if (localbMD == null) {
      return;
    }
    for (gA localgA : localbMD.bUi())
      if (localgA.nI())
      {
        if (paramBoolean) {
          A(localgA);
        }
        z(localgA);
        if (!paramBoolean)
        {
          cUb localcUb2 = localgA.nJ();
          if (!localcUb2.cJm().Q(localcUb2.cJl()))
          {
            if (localcUb2.aGa() == 0)
              D(localgA);
            else if (a(localcUb2) > 0)
              E(localgA); 
          }
        }
      }
    ??? = (gA)localbyz.ayJ().dB((short)azO.dRT.bJ());
    if (??? == null) {
      return;
    }
    if (paramBoolean) {
      A((gA)???);
    }
    z((gA)???);
    cUb localcUb1 = ((gA)???).nJ();
    if (localcUb1.cJm().S(localcUb1.cJl()))
      if (localcUb1.aGa() == 0)
        D((gA)???);
      else if (a(localcUb1) > 0)
        E((gA)???);
  }

  private void aOw()
  {
    dvX localdvX = new dvX(this);

    this.dWA.s(localdvX);
    this.dWA.clear();
  }

  public void D(gA paramgA) {
    cUb localcUb = paramgA.nJ();
    String str1 = (localcUb.getName() != null) && (localcUb.getName().length() > 0) ? localcUb.getName() : paramgA.getName();
    String str2 = bU.fH().getString("pet.chat.weak", new Object[] { str1 });
    aEe localaEe = new aEe(str2);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void E(gA paramgA) {
    cUb localcUb = paramgA.nJ();
    if (localcUb.aGa() == 0) {
      return;
    }
    int i = localcUb.cJh().a(cDI.ixg);
    String str1 = (localcUb.getName() != null) && (localcUb.getName().length() > 0) ? localcUb.getName() : paramgA.getName();
    String str2 = bU.fH().getString("pet.chat.hungry", new Object[] { str1, Integer.valueOf(i) });
    aEe localaEe = new aEe(str2);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void F(gA paramgA) {
    int i = paramgA.ok();
    for (String str : this.dWy) {
      ckV localckV = (ckV)dLE.doY().br("pet", str);
      cpa localcpa = cBQ.cxL().coO().nf(str);
      czv localczv;
      if (localckV.cmF().nJ().cJh().AB(i)) {
        localczv = (czv)localcpa.fi("colorImageContainer");
        c(localczv);
      } else if (localckV.cmF().nJ().cJh().AA(i)) {
        localczv = (czv)localcpa.fi("equipmentImageContainer");
        c(localczv);
      } else if ((localckV.cmF().nJ().cJh().eB(i)) || (localckV.cmF().nJ().cJh().Aw(i)) || (localckV.cmF().nJ().cJh().Au(i)))
      {
        localczv = (czv)localcpa.fi("petPortrait");
        c(localczv);
      }
    }
  }

  private void c(czv paramczv) {
    Jg localJg = paramczv.getAppearance();

    bNa localbNa1 = new bNa(bNa.gRx.get());
    bNa localbNa2 = new bNa(bNa.gRw.get());

    localJg.J(gm.class);
    localJg.setModulationColor(localbNa1);
    gm localgm = new gm(localbNa1, localbNa2, localJg, 0, 300, -1, ddp.kWG);
    localJg.a(localgm);
  }

  public void aOx() {
    for (String str : this.dWy) {
      cpa localcpa = cBQ.cxL().coO().nf(str);
      a(localcpa, "colorImageContainer");
      a(localcpa, "equipmentImageContainer");
      a(localcpa, "petPortrait");
    }
  }

  private void a(cpa paramcpa, String paramString) {
    try {
      czv localczv = (czv)paramcpa.fi(paramString);
      if ((localczv == null) || (localczv.isUnloading())) {
        return;
      }
      localczv.getAppearance().J(gm.class);
    } catch (Exception localException) {
      K.error("", localException);
    }
  }

  public void dj(boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    gA localgA = (gA)localbyz.ayJ().dB((short)azO.dRT.hV);
    if (localgA == null) {
      return;
    }
    String str = y(localgA);
    if (!cBQ.cxL().mZ(str)) {
      return;
    }
    ckV localckV = (ckV)dLE.doY().br("pet", str);
    if ((localckV.bql()) || (paramBoolean))
      dLE.doY().a(localckV, new String[] { "fightLimit" });
  }
}