import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class arl extends dbE
  implements ckT, dBv
{
  public static final String[] bF = new String[0];
  private List dzr;
  private List dzs;
  private final ArrayList dzt;
  private cdu dzu;
  private long bYL = 0L;

  private final HashSet dzv = new HashSet(0);

  protected static final Material dzw = (Material)Material.mwD.bQx();
  private final bGM dzx;
  private final List aEZ = new ArrayList();

  private cpy bQB = null;
  private bhm dzy;
  private boolean dzz;
  private Wr bTD;
  private final List dzA = new ArrayList();
  cFV dzB;
  private final HashMap dzC = new HashMap();

  boolean dzD = false;

  protected static Material aDn()
  {
    dzw.F(0.2F, 0.2F, 0.2F);
    return dzw;
  }

  public Wr aDo()
  {
    return this.bTD;
  }

  public void b(Wr paramWr) {
    this.bTD = paramWr;
  }

  public arl(int paramInt, dTw paramdTw, UG paramUG, cpy paramcpy, dzm paramdzm)
  {
    this(paramInt, paramdTw, paramUG, paramcpy);
    this.ipA = paramdzm;
  }

  public arl(int paramInt, dTw paramdTw, UG paramUG, cpy paramcpy) {
    super(paramInt, paramdTw, paramUG);
    this.eMH = new anI(this).bwb();
    this.aEZ.add(new alF((zu)this.eMH));
    this.dzB = new cFV(paramUG);
    this.dzx = new bGM(this, null);
    this.dzt = new ArrayList();
    this.kTF = new adH(this);
    this.bQB = paramcpy;
    this.dzy = new bhm(paramInt);
    this.eML.a(this.dzy);
  }

  public void a(aYV paramaYV) {
    super.a(paramaYV);
    this.dzB.id(paramaYV.bnX());
  }

  public boolean Ij()
  {
    return this.eMF.U(byv.bFN().bFO());
  }

  public int getDuration()
  {
    int i = (int)(System.currentTimeMillis() - this.bYL) / 60000;
    if (i >= 0) {
      return i;
    }
    return 0;
  }

  public zu aDp()
  {
    return (zu)super.aDG();
  }

  protected void a(ckR paramckR)
  {
  }

  public void aDq()
  {
    this.dzu = new cdu();
  }

  public boolean bo(byte paramByte) {
    return (this.bQB != null) && (this.bQB.contains(paramByte));
  }

  public long P(byte paramByte)
  {
    throw new UnsupportedOperationException("Le client ne doit pas donner un Id d'effectuser");
  }

  public cVn aDr()
  {
    return null;
  }

  public void aDs()
  {
    super.aDs();
    this.bYL = System.currentTimeMillis();

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).Mi();
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void H(Su paramSu)
  {
    super.e(paramSu);

    if (this.dzu != null) {
      int i = byj() / 1000;
      this.dzu.hF(i);
      dLE.doY().t("totalCountdown", Integer.valueOf(i));
    }

    byz localbyz = byv.bFN().bFO();
    localbyz.a(new eu[] { eu.ayN, eu.ayM, eu.ayO, eu.ayP });

    if (paramSu.adL() == localbyz)
    {
      byv.bFN().b(csr.cqN());
      if (!paramSu.cQJ())
      {
        byv.bFN().a(cmI.cnw());
      }
      aWc.blo().eO(600077L);

      cGz.iBJ.bb(paramSu);

      db(paramSu.getId());
    } else {
      aWc.blo().eO(600078L);
      bbo localbbo = dLE.doY().bs("itemDetail", "equipmentDialog");
      if (localbbo != null) {
        cpa localcpa = cBQ.cxL().coO().nf("equipmentDialog");
        if (localcpa != null) {
          dLE.doY().b("itemDetail", "usableNow", localcpa);
        }
      }
    }

    bhD.btQ().d(new aai(paramSu.getId()));

    bnc.bxw().d(this);

    for (int j = 0; j < this.aEZ.size(); j++)
      try {
        ((Dc)this.aEZ.get(j)).e(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  private void db(long paramLong)
  {
    this.dzx.p(byj(), paramLong);
  }

  private void aDt() {
    if (!this.dzx.aia()) {
      return;
    }

    this.dzx.aib();
  }

  public void Q(Su paramSu) {
    if (!this.dzx.aia()) {
      return;
    }

    this.dzx.aib();

    R(paramSu);
  }

  void R(Su paramSu) {
    byv.bFN().b(cmI.cnw());

    long l = paramSu.getId();
    short s = aDp().AU();
    dJg localdJg = new dJg(l, s);
    byv.bFN().aJK().d(localdJg);
  }

  public void a(Dc paramDc) {
    if (!this.aEZ.contains(paramDc))
      this.aEZ.add(paramDc);
  }

  public void b(Dc paramDc)
  {
    this.aEZ.remove(paramDc);
  }

  public void S(Su paramSu) {
    if (!this.dzA.contains(paramSu))
      this.dzA.add(paramSu);
  }

  public void I(Su paramSu)
  {
    if (this.dzu != null) {
      this.dzu.stop();
    }

    aDt();
    super.f(paramSu);
    cGz.iBJ.bd(paramSu);

    for (int i = 0; i < this.aEZ.size(); i++) {
      try {
        ((Dc)this.aEZ.get(i)).f(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }

    }

    if (byv.bFN().c(cmI.cnw())) {
      byv.bFN().b(cmI.cnw());
    }

    if (!byv.bFN().c(csr.cqN()))
      byv.bFN().a(csr.cqN());
  }

  protected void jF(int paramInt)
  {
    if (Ij()) {
      akY.axI().d(this);

      byv.bFN().a(Ca.Lc());
      aWe localaWe = WakfuClientInstance.awy().Dg().cKV();

      localaWe.a(WakfuClientInstance.awy().awz().bFO().aeL());

      int i = (paramInt + 600) / 1000;
      if (this.dzu != null) {
        this.dzu.hF(i);
      }
      dLE.doY().t("totalCountdown", Integer.valueOf(i));

      for (int j = 0; j < this.aEZ.size(); j++)
        try {
          ((Dc)this.aEZ.get(j)).Mg();
        } catch (Exception localException) {
          K.error("Exception levee", localException);
        }
    }
  }

  public void Mh()
  {
    if (Ij()) {
      akY.axI().clear();
      aWe localaWe = WakfuClientInstance.awy().Dg().cKV();
      localaWe.a(WakfuClientInstance.awy().awz().bFO().aeL());

      byv.bFN().b(Ca.Lc());

      this.dzu.stop();

      for (int i = 0; i < this.aEZ.size(); i++)
        try {
          ((Dc)this.aEZ.get(i)).Mh();
        } catch (Exception localException) {
          K.error("Exception levee", localException);
        }
    }
  }

  public void a(Su paramSu, List paramList, dNZ paramdNZ)
  {
  }

  public void aDu()
  {
    super.aDu();

    this.dzx.aib();

    if (this.dzu != null)
    {
      this.dzu.stop();
      this.dzu = null;
      this.bYL = 0L;
    }

    this.dzv.clear();
    this.dzC.clear();

    byv.bFN().bFO().bGI();
    byv.bFN().bFO().bSs().ceJ();

    int i = 0; for (int j = this.dzA.size(); i < j; i++) {
      Su localSu = (Su)this.dzA.get(i);
      asf.aED().a(false, localSu);
    }

    for (Iterator localIterator = this.aEZ.iterator(); localIterator.hasNext(); )
      try {
        ((Dc)localIterator.next()).Mj();
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void aDv()
  {
    cjS.clP().h(this);
    this.aEZ.clear();
    this.dzy.btM();
    super.aDv();
  }

  public void J(Su paramSu) {
    super.g(paramSu);

    if (paramSu.aeI()) {
      Collection localCollection = ca(paramSu.Fx());
      Object localObject = null;
      for (Su localSu : localCollection) {
        if (ap(localSu))
        {
          localObject = localSu;
        }
      }
      if (localObject != null) {
        if ((localObject instanceof byo))
          bOU.gUc.b(new dbb(localObject.uO(), ((byo)localObject).hf()));
        else if ((localObject instanceof bKm))
          bOU.gUc.b(new dbb(localObject.uO(), ((bKm)localObject).c(go.aEq)));
        else {
          bOU.gUc.b(new dbb(localObject.uO(), 0L));
        }
      }
      dLE.doY().t("currentFightLocked", Boolean.valueOf(bo(ad(paramSu))));
    }

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).g(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  protected void v(dhJ paramdhJ)
  {
    if ((paramdhJ.cgE() != -1) && (this.iM.p(paramdhJ.fa(), paramdhJ.fb())))
      this.iM.j(paramdhJ);
  }

  protected void K(Su paramSu)
  {
    super.h(paramSu);
    paramSu.a(paramSu, bgG());

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).h(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void T(Su paramSu)
  {
    for (int i = 0; i < this.aEZ.size(); i++) {
      try {
        ((Dc)this.aEZ.get(i)).k(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    }
    super.y(paramSu);
  }

  public void U(Su paramSu) {
    super.c(paramSu);

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).i(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void V(Su paramSu)
  {
    super.b(paramSu);

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).j(paramSu);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void a(drv paramdrv)
  {
    long l = paramdrv.cYm();
    dLE.doY().t("currentFightLocked", Boolean.valueOf(paramdrv.isClosed()));

    Su localSu = (Su)eu(l);
    if (localSu == null)
      K.error(String.format("Joueur #%d à l'origine du verrouillage du combat id=%d inconnu", new Object[] { Long.valueOf(l), Integer.valueOf(getId()) }));
    String str;
    if (paramdrv.cYl()) {
      str = bU.fH().getString("fight.autoLocked");
    } else {
      localObject = paramdrv.isClosed() ? "fight.lockedBy" : "fight.unlockedBy";
      str = bU.fH().getString((String)localObject, new Object[] { localSu == null ? null : localSu.getName() });
    }

    Object localObject = new aEe(str);
    ((aEe)localObject).mm(4);
    CM.LV().a((aEe)localObject);
  }

  public void a(oo paramoo)
  {
    doA localdoA = (doA)paramoo.cbs();
    if (localdoA == null) {
      return;
    }

    dle localdle = localdoA.bkf();
    if ((localdle != null) && ((localdle instanceof Su))) {
      ((Su)localdle).aeU().h(localdoA);
    }

    if (!localdoA.bWq())
      super.a(paramoo);
  }

  public void a(cjK paramcjK, alr paramalr)
  {
  }

  public void b(cjK paramcjK, alr paramalr)
  {
  }

  public void a(cjK paramcjK) {
    super.a(paramcjK);
    if (!e(paramcjK)) {
      return;
    }

    aBt localaBt = byv.bFN().bFO().bSz();
    if (localaBt != null) {
      localaBt.a(paramcjK);
    }

    bOX.bVM().a(paramcjK, this);
    ((aTL)WakfuClientInstance.awy().Dg()).a(bOX.bVM());
  }

  public boolean e(cjK paramcjK) {
    if (paramcjK.getType() == xj.bpm.xj()) {
      aRS localaRS = (aRS)paramcjK;
      if (a(localaRS)) {
        return false;
      }
    }
    if ((paramcjK.c(aIm.egU)) && 
      (byv.bFN().bFO().Fx() != paramcjK.Fx())) {
      return false;
    }

    if ((paramcjK.getType() == xj.bpv.xj()) && 
      (byv.bFN().bFO() != paramcjK.axG())) {
      return false;
    }

    if ((paramcjK.getType() == xj.bpk.xj()) && 
      (byv.bFN().bFO() != paramcjK.axG())) {
      return false;
    }

    return true;
  }

  public boolean a(aRS paramaRS) {
    if (!paramaRS.bnX()) {
      return false;
    }
    dle localdle = paramaRS.axG();
    if (localdle == null) {
      return true;
    }
    Su localSu = (Su)this.eMF.dP(localdle.getId());
    if (localSu == null) {
      return true;
    }
    int i = this.eMF.ad(localSu);
    int j = this.eMF.ad(byv.bFN().bFO());
    return i != j;
  }

  public void b(cjK paramcjK)
  {
    super.b(paramcjK);

    if ((paramcjK instanceof dhy)) {
      localObject = ((dhy)paramcjK).Uc();
      daO.cML().a(((cCq)localObject).cyG());
    }

    Object localObject = byv.bFN().bFO().bSz();
    if (localObject != null) {
      ((aBt)localObject).b(paramcjK);
    }

    l(paramcjK);
    bOX.bVM().r(paramcjK);
    byv.bFN().bFO().bGD().cWX();

    del localdel = new del((aAn)paramcjK);
    localdel.d(18106);
    localdel.c(false);
    cjO.clE().j(localdel);
  }

  public void c(String paramString, Object paramObject) {
  }

  public Object getFieldValue(String paramString) {
    return null;
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void dc(long paramLong)
  {
    bls localbls = (bls)this.dzC.remove(Long.valueOf(paramLong));
    if (localbls != null)
      localbls.bwt();
  }

  public void W(Su paramSu)
  {
  }

  public Iterator aDw()
  {
    return this.dzC.values().iterator();
  }

  public void aDx()
  {
    super.aDx();

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).Mk();
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void Ml()
  {
    super.Ml();

    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).Ml();
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public void b(bls parambls)
  {
    this.dzC.put(Long.valueOf(parambls.getId()), parambls);
  }

  public void removeAllItems() {
    this.dzC.clear();
  }

  public bls dd(long paramLong) {
    return (bls)this.dzC.get(Long.valueOf(paramLong));
  }

  public void o(List paramList) {
    this.dzs = paramList;
  }

  public void p(List paramList) {
    this.dzr = paramList;
  }

  public boolean de(long paramLong)
  {
    if (this.dzs == null) {
      return false;
    }
    return this.dzs.contains(Long.valueOf(paramLong));
  }

  public boolean df(long paramLong) {
    if (this.dzr == null) {
      return false;
    }
    return this.dzr.contains(Long.valueOf(paramLong));
  }

  public boolean aDy()
  {
    return (super.aDy()) || (this.dzD);
  }

  public void X(Su paramSu)
  {
    super.x(paramSu);
  }

  public boolean aDz()
  {
    if (!bgP()) {
      return false;
    }

    cpy localcpy = new cpy();
    boolean bool = a(localcpy);

    if (bool) {
      return false;
    }

    cQE localcQE = localcpy.cpa();
    while (localcQE.hasNext()) {
      byte b = localcQE.cHr();
      co(b);
    }

    return true;
  }

  private boolean a(cpy paramcpy)
  {
    Iterator localIterator = this.eMF.b(new cGB[] { cGB.cBA() }).iterator();
    boolean bool = false;
    while (localIterator.hasNext()) {
      Su localSu = (Su)localIterator.next();
      paramcpy.dP(localSu.Fx());
      if (paramcpy.size() >= bgB()) {
        bool = true;
        break;
      }
    }
    return bool;
  }

  public adf LG()
  {
    return ciQ.ckL();
  }

  public void cK(boolean paramBoolean) {
    Iterator localIterator = bgG().iterator();
    if (paramBoolean)
      while (localIterator.hasNext()) {
        Su localSu = (Su)localIterator.next();
        localSu.aeL().a(aDn());
      }
  }

  public void aDA()
  {
    K.error("ASK FOR FIGHT RECOVERY PROCESS");
    aDp().stop();
    bkP localbkP = new bkP();
    localbkP.cS(getId());
    byv.bFN().aJK().d(localbkP);
  }

  public void z(byte[] paramArrayOfByte) {
    K.error("PROCESSING FIGHT RECOVERY");
    q(paramArrayOfByte);
    aDp().start();
  }

  public boolean Y(Su paramSu) {
    return this.dzv.add(paramSu);
  }

  public boolean Z(Su paramSu) {
    return this.dzv.remove(paramSu);
  }

  public boolean aa(Su paramSu) {
    return this.dzv.contains(paramSu);
  }

  public boolean aDB() {
    return this.dzz;
  }

  public void cL(boolean paramBoolean) {
    this.dzz = paramBoolean;
  }

  public boolean ab(Su paramSu) {
    for (Su localSu : bgG()) {
      if (((localSu instanceof bKm)) && (localSu != paramSu) && (!this.dzv.contains(localSu))) {
        return false;
      }
    }
    return true;
  }

  public cFV aDC() {
    return this.dzB;
  }

  public long bp(byte paramByte) {
    return ((Su)cn(paramByte)).getId();
  }

  public void l(cdO paramcdO)
  {
    if ((paramcdO instanceof cyj)) {
      cyj localcyj = (cyj)paramcdO;
      A(localcyj);
    }
  }

  public Collection aDD()
  {
    return this.eMF.b(new cGB[] { cGB.a(cGB.cBE()) });
  }

  public boolean ac(Su paramSu) {
    return this.eMF.U(paramSu);
  }

  public void aDE()
  {
    this.dzD = true;
    super.aDE();
    aDF();
  }

  private void aDF() {
    int i = 0; for (int j = this.dzt.size(); i < j; i++) {
      ((dxZ)this.dzt.get(i)).a(this);
    }
    this.dzt.clear();
  }

  public void a(dxZ paramdxZ) {
    if (!this.dzt.contains(paramdxZ))
      this.dzt.add(paramdxZ);
  }

  public void b(dhJ paramdhJ, bzj parambzj)
  {
    for (int i = 0; i < this.aEZ.size(); i++)
      try {
        ((Dc)this.aEZ.get(i)).a((Su)paramdhJ, parambzj);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public dhJ bo(int paramInt1, int paramInt2)
  {
    dhJ localdhJ = super.bo(paramInt1, paramInt2);
    if ((localdhJ != null) && (localdhJ.bnX())) {
      return null;
    }
    return localdhJ;
  }
}