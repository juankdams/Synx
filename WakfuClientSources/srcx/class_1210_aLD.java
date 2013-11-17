import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.material.Material.ObjectFactory;
import org.apache.log4j.Logger;

public class aLD extends dOc
{
  private static final Logger K = Logger.getLogger(aLD.class);
  public static final String TAG = "WorldEditor";
  public static final int eqi = 3;
  private static final bNa eqj = new bNa(255, 255, 255, 64);

  private static final int eqk = byn.jo("HavenWorldBuildingRemoved");
  private static final bNa eql = bNa.gRx;
  private static final bNa eqm = new bNa(255, 0, 0, 255);
  private static final Material eqn = (Material)Material.mwD.bQx();

  private final Xg eqo = new Xg();
  private aRa aRn;
  private aIJ eqp;
  private cwx eqq;
  private cGt eqr;
  private dmh eqs = dmh.ljT;

  private int eqt = 2147483647;
  private int equ = 2147483647;
  private EntitySprite eqv;

  public aLD()
  {
    for (dmh localdmh : dmh.values()) {
      this.eqo.put(localdmh.ordinal(), new dNs(null));
    }

    this.eqr = new coD();
    this.eqr.e(this);
  }

  public String getTag()
  {
    return "WorldEditor";
  }

  public aRa getHavenWorldImages() {
    return this.aRn;
  }

  public aIJ getWorkingHavenWorld() {
    return this.eqp;
  }

  public dmh getCurrentLayer() {
    return this.eqs;
  }

  public void a(aIJ paramaIJ, aRa paramaRa) {
    this.eqp = paramaIJ.aUC();
    this.aRn = paramaRa;
    c(paramaIJ);

    this.eqq.ac(0.0F, 9 * (paramaIJ.KV() + paramaIJ.KX()) / 2);
  }

  public void bF(int paramInt1, int paramInt2) {
    this.eqq.ac(paramInt1, paramInt2);
    refresh();
  }

  public float getZoomFactor() {
    return this.eqq.getZoomFactor();
  }

  public void bdf() {
    this.eqq.C(this.eqq.getZoomFactor() * 2.0F);
    refresh();
  }

  public void refresh() {
    setNeedsToResetMeshes();
  }

  public void bdg() {
    this.eqq.C(this.eqq.getZoomFactor() * 0.5F);
    refresh();
  }

  public void translate(float paramFloat1, float paramFloat2) {
    aIJ localaIJ = getWorkingHavenWorld();
    dQx localdQx = localaIJ.KT();

    cEl localcEl1 = this.eqq.ctU();
    cEl localcEl2 = this.eqq.aa(paramFloat1, paramFloat2);
    int i;
    float f1;
    if (localcEl2.getX() > 0.0F) {
      i = (localdQx.hqv + 1) * 9;
      f1 = Math.min(i - localcEl1.getX(), localcEl2.getX());
    } else {
      i = localdQx.hqu * 9;
      f1 = Math.max(i - localcEl1.getX(), localcEl2.getX());
    }
    int j;
    float f2;
    if (localcEl2.getY() > 0.0F) {
      j = (localdQx.hqx + 1) * 9;
      f2 = Math.min(j - localcEl1.getY(), localcEl2.getY());
    } else {
      j = localdQx.hqw * 9;
      f2 = Math.max(j - localcEl1.getY(), localcEl2.getY());
    }
    this.eqq.ac(localcEl1.getX() + f1, localcEl1.getY() + f2);
    refresh();
  }

  public cEl getScreenCenter() {
    float f1 = (this.eqp.KU() + this.eqp.KW()) / 2.0F;
    float f2 = (this.eqp.KV() + this.eqp.KX()) / 2.0F - 3.0F;

    f1 += 0.5F;
    f2 += 0.5F;
    return this.eqq.ab(f1 * 9.0F, f2 * 9.0F);
  }

  public void setSize(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super.setSize(paramInt1, paramInt2, paramBoolean);
    this.eqq.setSize(paramInt1, paramInt2);
  }

  public MD getPatchCoordFromMouse(int paramInt1, int paramInt2) {
    MD localMD = getCellCoordFromMouse(paramInt1, paramInt2);
    localMD.set(bnp.qo(localMD.getX()), bnp.qp(localMD.getY()));
    return localMD;
  }

  public MD getCellCoordFromMouse(int paramInt1, int paramInt2) {
    return this.eqq.getCellCoordFromMouse(paramInt1, paramInt2);
  }

  public void setCurrentLayer(dmh paramdmh) {
    if (this.eqs == paramdmh) {
      return;
    }
    a(paramdmh);
    setSelectTool();
  }

  private void a(dmh paramdmh) {
    this.eqs = paramdmh;
  }

  public void a(cxX paramcxX) {
    if (this.eqq == null) {
      return;
    }
    this.eqq.co(paramcxX.imh ? 0.4F : 1.0F);
    this.eqq.hI(paramcxX.iiz);
  }

  public cGt getTool() {
    return this.eqr;
  }

  public void setTool(cGt paramcGt) {
    this.eqt = 2147483647;
    this.equ = 2147483647;
    this.eqr.clear();
    this.eqr = paramcGt;
    this.eqr.e(this);
    a(this.eqr.Kt());
    refresh();
  }

  public void bG(int paramInt1, int paramInt2)
  {
    MD localMD = getCellCoordFromMouse(paramInt1, paramInt2);
    if ((this.eqt != localMD.getX()) || (this.equ != localMD.getY())) {
      this.eqr.clear();

      this.eqr.ef(paramInt1, paramInt2);
      refresh();
      this.eqt = localMD.getX();
      this.equ = localMD.getY();
    }
  }

  public void bH(int paramInt1, int paramInt2) {
    this.eqr.clear();
    this.eqr.eg(paramInt1, paramInt2);
    refresh();
  }

  private void c(aIJ paramaIJ) {
    this.eqq.clear();
    this.eqq.Z(this.aRn.bhy(), this.aRn.bhz());

    if (paramaIJ == null) {
      K.error("Le havre monde ne doit pas être null");
      return;
    }

    for (int i = paramaIJ.KV(); i <= paramaIJ.KX(); i++) {
      for (int j = paramaIJ.KU(); j <= paramaIJ.KW(); j++) {
        y(paramaIJ.R(j, i), j, i);
      }
    }

    paramaIJ.e(new tT(this));

    this.eqq.b(this.eqp.KT());
    this.eqq.hI(true);
  }

  public bRc a(int paramInt, MD paramMD)
  {
    Entity3D localEntity3D = this.eqq.a(paramMD, eqj);
    bRc localbRc = new bRc(new bAb(paramInt), paramMD.getX(), paramMD.getY());
    a(localbRc, localEntity3D);
    return localbRc;
  }

  private bcQ y(int paramInt1, int paramInt2, int paramInt3) {
    cDs localcDs = ars.dzL.aP((short)paramInt1);
    if (localcDs == null) {
      K.error("Pas de patch d'id " + paramInt1);
      return null;
    }
    return a(localcDs, paramInt2, paramInt3);
  }

  private bcQ a(cDs paramcDs, int paramInt1, int paramInt2) {
    int i = paramcDs.bqQ();
    uz localuz = this.aRn.nC(i);
    if (localuz == null) {
      K.error("Pas de texture pour le patch " + i);
      return null;
    }

    bcQ localbcQ = new bcQ(paramcDs, paramInt1, paramInt2);
    MD localMD = this.aRn.nA(i);
    EntitySprite localEntitySprite = this.eqq.a(localbcQ.Qx(), localMD, localuz, bNa.gRx);
    a(localbcQ, localEntitySprite);
    return localbcQ;
  }

  public bcQ b(cDs paramcDs, int paramInt1, int paramInt2) {
    bcQ localbcQ = a(paramcDs, paramInt1, paramInt2);
    if (localbcQ != null) {
      this.eqp.j(paramInt1, paramInt2, paramcDs.bqQ());
    }
    return localbcQ;
  }

  private cbR f(aXL paramaXL) {
    cUh localcUh1 = paramaXL.adj();
    cUh localcUh2 = aDF.e(localcUh1);
    if (localcUh2 == null) {
      return null;
    }

    int i = localcUh2.xN(paramaXL.gw());
    uz localuz = this.aRn.nD(i);
    if (localuz == null) {
      K.error("Pas de texture pour le groupe " + i);
      return null;
    }

    MD localMD1 = new MD(paramaXL.bmV(), paramaXL.bmW());
    MD localMD2 = this.aRn.nB(i);
    EntitySprite localEntitySprite = this.eqq.b(localMD1, localMD2, localuz, bNa.gRx);
    cbR localcbR = new cbR(paramaXL);

    a(localcbR, localEntitySprite);
    return localcbR;
  }

  public cbR a(bFA parambFA) {
    cbR localcbR = f(parambFA);

    if (localcbR != null) {
      cUh localcUh = aDF.e(parambFA.adj());
      this.eqp.b(new bFA(parambFA.gv(), localcUh.nc(), parambFA.gw(), parambFA.bmV(), parambFA.bmW()));
    }
    return localcbR;
  }

  public cbR g(aXL paramaXL) {
    cbR localcbR = f(paramaXL);
    this.eqp.b(paramaXL);
    return localcbR;
  }

  private void a(bNi parambNi, Entity paramEntity)
  {
    Entity localEntity = a(paramEntity, parambNi);
    f(localEntity);
  }

  private void f(Entity paramEntity) {
    this.eqq.f(paramEntity);
    if (this.eqv == paramEntity)
      this.eqv = null;
  }

  public void b(bNi parambNi)
  {
    if (parambNi != null) {
      switch (tU.bgv[parambNi.bqM().ordinal()]) {
      case 1:
        this.eqp.bh(parambNi.EN());
        break;
      case 2:
        this.eqq.ctT();
      }

    }

    Entity localEntity = i(parambNi);
    f(localEntity);
    refresh();
  }

  protected void rd()
  {
    super.rd();
    this.bqm.d(this.eqq.getEntity());
  }

  public EntityGroup getMapEntity() {
    return this.eqq.getEntity();
  }

  public boolean isAppearanceCompatible(Jg paramJg)
  {
    return true;
  }

  public void bc()
  {
    super.bc();
    if (this.eqq != null) {
      this.eqq.dispose();
      this.eqq = null;
    }
    this.eqv = null;

    for (int i = 0; i < this.eqo.size(); i++) {
      ((dNs)this.eqo.hc(i)).clear();
    }
    this.eqo.clear();

    this.eqr = new coD();
  }

  public void aJ()
  {
    super.aJ();

    this.eqq = new cwx();
    this.eqq.C(0.25F);

    Jg localJg = Jg.checkOut();
    localJg.setWidget(this);
    a(localJg);

    setNeedsToPreProcess();
    setFocusable(true);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    return super.setXMLAttribute(paramInt, paramString, paramaKN);
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject)
  {
    return super.setPropertyAttribute(paramInt, paramObject);
  }

  public bcQ getGroundUnderMouse(int paramInt1, int paramInt2)
  {
    MD localMD = getPatchCoordFromMouse(paramInt1, paramInt2);
    int i = localMD.getX() * 9;
    int j = localMD.getY() * 9;
    EntitySprite localEntitySprite = this.eqq.dR(i, j);
    return (bcQ)getItem(dmh.ljS, localEntitySprite);
  }

  public bcQ getGround(int paramInt1, int paramInt2) {
    int i = paramInt1 * 9;
    int j = paramInt2 * 9;
    EntitySprite localEntitySprite = this.eqq.dR(i, j);
    return (bcQ)getItem(dmh.ljS, localEntitySprite);
  }

  public cbR getBuildingUnderMouse(int paramInt1, int paramInt2) {
    EntitySprite localEntitySprite = this.eqq.dT(paramInt1, paramInt2);
    return (cbR)getItem(dmh.ljT, localEntitySprite);
  }

  public cbR getBuilding(int paramInt1, int paramInt2) {
    EntitySprite localEntitySprite = this.eqq.dS(paramInt1, paramInt2);
    return (cbR)getItem(dmh.ljT, localEntitySprite);
  }

  public void c(bNi parambNi) {
    if ((parambNi instanceof bRc)) {
      a(0, parambNi.Qx());
      return;
    }
    bdh();
    Entity localEntity = h(parambNi);
    if (((localEntity instanceof EntitySprite)) || (localEntity == null)) {
      b((EntitySprite)localEntity);
    }
    refresh();
  }

  public void bdh() {
    if (this.eqq != null)
      this.eqq.ctT();
  }

  private void b(EntitySprite paramEntitySprite)
  {
    if (this.eqv == paramEntitySprite) {
      return;
    }
    if ((this.eqv != null) && (this.eqv.exists())) {
      this.eqv.setMaterial(Material.mwz);
    }
    if (paramEntitySprite != null) {
      paramEntitySprite.setMaterial(eqn);
    }
    this.eqv = paramEntitySprite;
  }

  public void d(bNi parambNi) {
    Entity localEntity = h(parambNi);
    if (localEntity == null) {
      return;
    }

    bkk localbkk = Pb.aaU().aaW();
    if (localbkk.pZ(eqk))
      localEntity.a(localbkk, eqk, null);
  }

  public void e(bNi parambNi)
  {
    Entity localEntity = h(parambNi);
    if (localEntity == null) {
      return;
    }
    localEntity.dsK();
  }

  public void f(bNi parambNi) {
    Entity localEntity = h(parambNi);
    if (localEntity == null) {
      return;
    }
    localEntity.setColor(eqm);
  }

  public void g(bNi parambNi) {
    Entity localEntity = h(parambNi);
    if (localEntity == null) {
      return;
    }
    localEntity.setColor(eql);
  }

  public void bdi() {
    for (int i = 0; i < this.eqo.size(); i++)
      dNs.a((dNs)this.eqo.hc(i)).s(new tV(this));
  }

  public void setSelectTool()
  {
    if (this.eqs == dmh.ljS) {
      setTool(new bXt());
      return;
    }
    if (this.eqs == dmh.ljT) {
      setTool(new bzi());
      return;
    }
    setTool(new coD());
  }

  private Entity h(bNi parambNi) {
    if (parambNi == null) {
      return null;
    }
    return getSpriteMap(parambNi).l(parambNi);
  }

  private Entity a(Entity paramEntity, bNi parambNi) {
    return getSpriteMap(parambNi).b(paramEntity, parambNi);
  }

  private Entity i(bNi parambNi) {
    return getSpriteMap(parambNi).m(parambNi);
  }

  private bNi getItem(dmh paramdmh, EntitySprite paramEntitySprite) {
    return getSpriteMap(paramdmh).d(paramEntitySprite);
  }

  private dNs getSpriteMap(bNi parambNi) {
    return getSpriteMap(parambNi.bqM());
  }

  private dNs getSpriteMap(dmh paramdmh) {
    return (dNs)this.eqo.get(paramdmh.ordinal());
  }

  public void getEntities(EntityGroup paramEntityGroup) {
    this.eqq.getEntities(paramEntityGroup);
  }

  static
  {
    eqn.F(0.2F, 0.2F, 0.2F);
  }
}