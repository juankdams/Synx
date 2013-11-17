import org.apache.log4j.Logger;

public class Nj
  implements cvW
{
  protected static final Logger K = Logger.getLogger(Nj.class);

  private static Nj caf = new Nj();
  private cGb cag;
  private bnm N;

  public static Nj Xh()
  {
    return caf;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      this.N = new cLd(this);

      cBQ.cxL().a(this.N);

      byv.bFN().b(Rl.acN());
      dGW.dhM().dhN();

      if ((this.cag != null) && (this.cag.getSize() > 0)) {
        localObject = new bzu();
        ((bzu)localObject).d(19328);
        ((bzu)localObject).a((byte)0);
        cjO.clE().j((cWG)localObject);
      }

      Object localObject = (bpn)cBQ.cxL().a("storageBoxDialog", VV.dJ("storageBoxDialog"), 17L, (short)10000);

      dGW.dhM().j((bpn)localObject);

      dLE.doY().t("storageBox", this.cag);

      cBQ.cxL().j("wakfu.storageBox", cCM.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cCM.setDraggedItemId(-1L);
      if (this.cag != null) {
        this.cag.clear();
        this.cag = null;
      }

      byz localbyz = byv.bFN().bFO();
      if ((localbyz != null) && (localbyz.bSe() != null)) {
        localbyz.q(false, true);
      }

      if (byv.bFN().c(dGW.dhM())) {
        dGW.dhM().dhP();
      }

      cBQ.cxL().mN("wakfu.collectMachine");

      cBQ.cxL().b(this.N);

      if (cBQ.cxL().mZ("storageBoxDialog")) {
        cBQ.cxL().mW("storageBoxDialog");
      }

      byv.bFN().a(Rl.acN());

      dLE.doY().removeProperty("storageBox");
    }
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject4;
    long l1;
    Object localObject5;
    Object localObject3;
    byte b2;
    Object localObject2;
    int i;
    switch (paramcWG.getId()) {
    case 19329:
      localObject1 = (czW)paramcWG;
      byte b1 = ((czW)localObject1).getDestinationPosition();
      long l2 = ((czW)localObject1).ah();

      localObject4 = this.cag.bdX();
      if (localObject4 == null) {
        K.error("Aucun compartiment sélectionné !");
        return false;
      }
      ((Lh)localObject4).a(l2, b1);

      return false;
    case 19326:
      localObject1 = (czW)paramcWG;
      l1 = ((czW)localObject1).ah();
      byte b3 = ((czW)localObject1).getDestinationPosition();

      localObject4 = this.cag.bdX();
      if (localObject4 == null) {
        K.error("Aucun compartiment sélectionné, impossible de réaliser l'action de drop !!!");
        return false;
      }

      localObject5 = byv.bFN().bFO().bGP().iS(l1);

      bnq localbnq = ((Lh)localObject4).a((gA)localObject5, ((czW)localObject1).ag(), b3);
      switch (cLc.iKK[localbnq.ordinal()]) {
      case 1:
        K.warn("Impossible d'ajouter l'item");
        String str = bU.fH().getString("storageBox.addItem.unauthorized");
        aEe localaEe = new aEe(str);
        localaEe.mm(3);
        CM.LV().ez(3).a(localaEe);
        return false;
      case 2:
        K.warn("Impossible d'ajouter l'item");
        return false;
      }

      return false;
    case 19327:
      localObject1 = (czW)paramcWG;
      l1 = ((czW)localObject1).getDestinationUniqueId();

      localObject3 = this.cag.bdX();
      if (localObject3 == null) {
        K.error("Aucun compartiment sélectionné, impossible de réaliser l'action de drop !!!");
        return false;
      }
      ((Lh)localObject3).a(((czW)localObject1).getItem().oj(), ((czW)localObject1).nP(), l1, ((czW)localObject1).getDestinationPosition());

      cCM.setDraggedItemId(-1L);
      return false;
    case 19330:
      localObject1 = (bzu)paramcWG;
      b2 = ((bzu)localObject1).af();
      localObject2 = this.cag.bdX();
      if (localObject2 == null) {
        K.error("impossible de retrouver le compartiment d'index=" + b2);
        return false;
      }
      ((Lh)localObject2).VG();
      return false;
    case 19328:
      localObject1 = (bzu)paramcWG;
      b2 = ((bzu)localObject1).af();
      if (this.cag == null) {
        return false;
      }
      localObject2 = this.cag.bU(b2);
      if (localObject2 == null) {
        K.error("impossible de retrouver le compartiment d'index=" + b2);
        return false;
      }

      a((Lh)localObject2);
      return false;
    case 19332:
      localObject1 = (bzu)paramcWG;
      i = bCO.gr(((bzu)localObject1).getIntValue());
      if (this.cag.Fd() < i) {
        localObject2 = bU.fH().getString("error.storage.notEnoughMoneyInBox");
        localObject3 = new NW(102, 0, (String)localObject2, 2L);
        cBQ.cxL().a((NW)localObject3);
        return false;
      }

      localObject2 = bU.fH().getString("bigNumberWithSeparator", new Object[] { Integer.valueOf(i) });
      localObject3 = bU.fH().getString("question.storage.withdrawConfirm", new Object[] { localObject2 });
      localObject4 = new NW(102, 0, (String)localObject3, 24L);
      localObject5 = cBQ.cxL().a((NW)localObject4);
      ((cKX)localObject5).a(new cLe(this, i));

      return false;
    case 19331:
      localObject1 = (bzu)paramcWG;
      i = bCO.gr(((bzu)localObject1).getIntValue());
      if (byv.bFN().bFO().fO().bDx() < i) {
        localObject2 = bU.fH().getString("error.storage.notEnoughMoneyInPlayer");
        localObject3 = new NW(102, 0, (String)localObject2, 2L);
        cBQ.cxL().a((NW)localObject3);
        return false;
      }

      localObject2 = bU.fH().getString("question.storage.depositConfirm", new Object[] { Integer.valueOf(i) });
      localObject3 = new NW(102, 0, (String)localObject2, 24L);
      localObject4 = cBQ.cxL().a((NW)localObject3);
      ((cKX)localObject4).a(new cLa(this, i));

      return false;
    }

    return true;
  }

  public void a(Lh paramLh) {
    if ((paramLh.VC()) || (paramLh.VD())) {
      paramLh.select();
    }
    this.cag.b(paramLh);
    this.cag.VF();
  }

  public long getId() {
    return 12L;
  }

  public void a(long paramLong) {
  }

  public void a(cSR paramcSR, aMY paramaMY, int paramInt) {
    this.cag = new mG(paramcSR, paramaMY, paramInt);
    dLE.doY().t("storageBox", this.cag);
    bzu localbzu = new bzu();
    localbzu.d(19328);
    localbzu.a((byte)0);
    cjO.clE().j(localbzu);
  }

  public void a(bvj parambvj) {
    this.cag = new duu(parambvj.bCR(), parambvj.bCQ());
  }

  public cGb Xi() {
    return this.cag;
  }

  public void fO(int paramInt) {
    this.cag.nh(paramInt);
  }

  public void Xj() {
    Lh localLh = this.cag.bdX();
    localLh.VE();
  }

  public void b(dor paramdor) {
    Lh localLh = this.cag.bdX();
    localLh.a(paramdor);
    localLh.VF();
  }

  public void a(bbO parambbO) {
    mG localmG = (mG)this.cag;
    aMY localaMY = new aMY();
    localaMY.e(parambbO);
    localmG.a(localaMY);
  }
}