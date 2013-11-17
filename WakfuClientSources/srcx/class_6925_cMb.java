import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class cMb extends dWu
  implements cRz
{
  private static final Logger K = Logger.getLogger(cMb.class);
  protected short kqX;
  protected boolean kqY;
  private XV kqZ;
  protected boolean kra;
  protected boolean haI;
  protected boolean krb;
  protected int krc;
  protected boolean krd;
  protected boolean kre;
  private dkO krf;
  protected final duc krg;
  protected EA krh;
  private String m_name;
  private ArrayList kri;
  protected int csY;
  private final cCH iah;
  private final cCH kC;
  private final cCH krj;

  public cMb()
  {
    this.kqZ = XV.cIx;

    this.haI = true;

    this.krf = dkO.lim;
    this.krg = new bGv(this);

    this.csY = -1;

    this.iah = new ade(this);

    this.kC = new add(this);

    this.krj = new Yd(this);
  }

  public static cMb a(long paramLong, byte[] paramArrayOfByte)
  {
    cMb localcMb = (cMb)acs.aoN().gh(paramLong);
    if (localcMb == null) {
      K.error("Impossible de spawner l'élément interactif instanceId=" + paramLong);
      return null;
    }

    if (paramArrayOfByte != null)
    {
      localcMb.q(paramArrayOfByte);
    }
    localcMb.sM();

    for (abc localabc : localcMb.sL()) {
      if ((localabc instanceof ob)) {
        ob localob = (ob)localabc;
        bVl.caZ().b(localob);
        localob.atf();
        bdB.b(localob);
      }
    }
    return localcMb;
  }

  public void setVisible(boolean paramBoolean)
  {
    super.setVisible(paramBoolean);
    if (!paramBoolean) {
      cEY();
    }
    for (abc localabc : sL())
      ((djm)localabc).setVisible(paramBoolean);
  }

  public boolean isVisible()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return super.isVisible();
    }

    if (!c(dLq.maH)) {
      return super.isVisible();
    }

    arl localarl = localbyz.bGv();
    cYk localcYk = ML();
    return (super.isVisible()) && ((localarl == null) || (!localarl.LB().aq(localcYk.getX(), localcYk.getY())));
  }

  private void cEY() {
    clD localclD = cqu.cpE().cpF();
    if (localclD != null) {
      int i = 0; for (int j = localclD.cmZ(); i < j; i++) {
        cRz localcRz = localclD.vK(i);
        if (localcRz == this) {
          cqu.cpE().alK();
          break;
        }
      }
    }
  }

  public int fa()
  {
    return this.cGk.getX();
  }

  public int fb()
  {
    return this.cGk.getY();
  }

  public short fc()
  {
    return this.cGk.IB();
  }

  public float getWorldX() {
    return fa();
  }

  public float getWorldY() {
    return fb();
  }

  public float getAltitude() {
    return fc();
  }

  public List bVi()
  {
    if (this.kri == null) {
      bCM();
    }
    return Collections.unmodifiableList(this.kri);
  }

  public boolean V(cYk paramcYk) {
    return bVi().contains(paramcYk);
  }

  public String getName() {
    return this.m_name;
  }

  public short cEZ() {
    return this.kqX;
  }

  public void dO(short paramShort) {
    this.kqX = paramShort;
  }

  public int cFa() {
    return this.krc;
  }

  public final XV cFb() {
    return this.kqZ;
  }

  protected final void a(XV paramXV) {
    this.kqZ = paramXV;
  }

  public boolean aMB() {
    return this.krb;
  }

  public void D(boolean paramBoolean) {
    this.krb = paramBoolean;
  }

  public boolean bYk() {
    return this.haI;
  }

  public void setSelectable(boolean paramBoolean) {
    this.haI = paramBoolean;
  }

  public boolean ti() {
    return this.kra;
  }

  public void ix(boolean paramBoolean) {
    this.kra = paramBoolean;
  }

  public boolean cFc() {
    return this.kre;
  }

  public void iy(boolean paramBoolean) {
    this.kre = paramBoolean;
  }

  public boolean cwn() {
    return this.kqY;
  }

  public void iz(boolean paramBoolean) {
    this.kqY = paramBoolean;
  }

  public void n(cYk paramcYk) {
    this.cGk.ae(paramcYk);
  }

  public boolean b(dJO paramdJO, bhL parambhL)
  {
    if (!aUP.c(adU(), paramdJO)) {
      K.warn("Tentative de fire de l'action " + paramdJO + " sur l'élément interactif " + this + " alors que celle-ci n'est pas gérée", new UnsupportedOperationException());

      return false;
    }

    boolean bool = false;
    if (this.krf.isDestroyed())
      bool = this.krf.b(paramdJO, parambhL);
    else if (this.krh != null) {
      bool = this.krh.a(paramdJO, parambhL);
    }
    if (!bool) {
      bool = super.b(paramdJO, parambhL);
    }

    if (bool) {
      bOU.gUc.b(new fo(this, paramdJO.dja()));
    }
    if (parambhL.getId() == byv.bFN().bFO().getId()) {
      bhD.btQ().d(new bWX(getId(), paramdJO.dja()));
    }
    return bool;
  }

  public final dJO[] adU() {
    if (this.krf.isDestroyed())
      return this.krf.adU();
    if (this.krh != null) {
      return this.krh.eS();
    }
    return eS();
  }

  public abstract dJO[] eS();

  protected void cFd()
  {
    if (!(this instanceof AQ)) {
      return;
    }

    AQ localAQ = (AQ)this;
    if (localAQ.tj() == null) {
      return;
    }
    this.krf = new bHI(localAQ);
  }

  public final void x(short paramShort)
  {
    if (paramShort == this.aTn) {
      return;
    }

    super.x(paramShort);

    this.krf.cC(paramShort);

    tf();
  }

  public dkO Ka() {
    return this.krf;
  }

  protected void tf() {
    sM();
  }

  public final dJO adT() {
    return this.krf.isDestroyed() ? this.krf.adT() : eR();
  }

  protected abstract dJO eR();

  public final void a(dJO paramdJO)
  {
    byv.bFN().bFO().aeL().bIV();
    bAY localbAY = new bAY();
    localbAY.ch(paramdJO.dja());
    localbAY.b(getId());
    byv.bFN().aJK().d(localbAY);
  }

  public csx[] adN()
  {
    if (this.krf.isDestroyed()) {
      return ((bHI)this.krf).adN();
    }

    if (this.krh != null) {
      return this.krh.am();
    }
    return am();
  }

  public csx[] am() {
    return csx.icw;
  }

  public boolean adO()
  {
    return true;
  }

  public final Point adP()
  {
    dSz localdSz = WakfuClientInstance.awy().Dg();
    cYm localcYm = up.c(localdSz, getWorldX(), getWorldY(), getAltitude() + bY());
    int i = bCO.bC(localcYm.aOR);
    int j = bCO.bC(localcYm.aOS);
    return new Point(i, j);
  }

  public short OL()
  {
    return 0;
  }

  public byte bY() {
    Iterator localIterator = sL().iterator(); if (localIterator.hasNext()) { abc localabc = (abc)localIterator.next();
      return localabc.vJ();
    }
    return 4;
  }

  public void aJ()
  {
    super.aJ();
    this.kqX = 0;
    this.kqY = false;
    this.kqZ = XV.cIx;
    this.kra = false;
    this.haI = true;
    this.krb = false;
    this.krc = 0;
    this.krd = false;
    this.kre = false;
    if ((!bB) && (this.krf != dkO.lim)) throw new AssertionError();
    this.m_name = "";
    if ((!bB) && (this.kri != null)) throw new AssertionError();
    this.csY = -1;
  }

  public void bc()
  {
    super.bc();
    this.m_name = null;
    this.krf = dkO.lim;
    this.kri = null;
    this.krh = null;
    this.krg.clear();
  }

  protected final cCH boI()
  {
    return this.iah;
  }

  protected final cCH yI()
  {
    return this.kC;
  }

  protected cCH ak()
  {
    return cCH.ivi;
  }

  protected cCH abF() {
    return this.krj;
  }

  public cCH[] tn() {
    return new cCH[] { boH(), boI(), yI(), ak(), boJ(), boK(), abF() };
  }

  public String cvk()
  {
    return null;
  }

  public boolean g(bAF parambAF) {
    return (!cFe()) && (V(parambAF.atB()));
  }

  public boolean cFe()
  {
    return this.krd;
  }

  public void bCM() {
    if (isDummy()) {
      return;
    }
    ArrayList localArrayList = dAz.eC(this.fgF);

    this.krd = false;
    if (localArrayList.contains(dAz.lHW)) {
      if (sO()) {
        localArrayList.remove(dAz.lHW);
        if (localArrayList.isEmpty()) {
          K.error("[Level Design] Element interactif bloquant, et pas de pattern d'activation valide : " + this.cGk);
          this.krd = true;
        }
      }
      else if (localArrayList.size() == 1)
      {
        this.krd = true;
      }

    }

    cYk localcYk = new cYk();
    this.kri = new ArrayList();

    cwO.a((short)6, (byte)0, (short)4);
    if (localArrayList.contains(dAz.lHW)) {
      this.kri.add(new cYk(fa(), fb(), fc()));
    }
    for (int i = localArrayList.size() - 1; i >= 0; i--) {
      dAz localdAz = (dAz)localArrayList.get(i);
      if (localdAz != dAz.lHW)
      {
        CG localCG = CG.eu((E().m_index + localdAz.ddV()) % 8);
        localcYk.ac(this.cGk.getX() + localCG.hY, this.cGk.getY() + localCG.hZ, this.cGk.IB());

        short s1 = (short)asc.jT(localcYk.getX());
        short s2 = (short)asc.jU(localcYk.getY());
        try
        {
          if (bOh.O(s1, s2)) {
            cwO.J(s1, s2);
            short s3 = cwO.T(localcYk.getX(), localcYk.getY(), localcYk.IB());
            if (s3 != -32768) {
              localcYk.dG(s3);
              this.kri.add(new cYk(localcYk));
            }
          } else {
            K.error("On veut charger une cellule qui n'appartient à aucune map " + localcYk + " world=" + bOh.D() + " IE=" + getId());
          }
        } catch (IOException localIOException) {
          K.error("Impossible de charger la map [" + s1 + ", " + s2 + "]", localIOException);
        }
      }
    }
  }

  public void al() {
  }

  public void aau() {
  }

  private void a(tF paramtF, boolean paramBoolean) { if (boE())
      paramtF.a(fa(), fb(), paramBoolean);
    else
      paramtF.a(fa(), fb(), fc(), paramBoolean);
  }

  public void MW()
  {
    super.MW();
    cFf();
  }

  public void cFf()
  {
    if (!sO()) {
      return;
    }
    cYk localcYk = ML();
    short s1 = (short)asc.jT(localcYk.getX());
    short s2 = (short)asc.jU(localcYk.getY());
    try {
      cwO.J(s1, s2);
    } catch (IOException localIOException) {
      K.warn("Problème au chargement de la topologie de la map");
    }

    tF localtF = boL();
    if (localtF != null)
      a(localtF, true);
    else
      K.error("Impossible de marquer bloquant un élément sans topologie");
  }

  public void tk()
  {
    super.tk();

    if (c(dLq.maH)) {
      localObject1 = cof.cop();
      localObject2 = sL();
      for (localIterator = ((Collection)localObject2).iterator(); localIterator.hasNext(); ) { localabc = (abc)localIterator.next();
        if ((localabc instanceof ob))
        {
          FreeParticleSystem localFreeParticleSystem = ((cof)localObject1).vY(800030);
          localFreeParticleSystem.b((ob)localabc);
          cWS.cKD().b(localFreeParticleSystem);
        }
      }
    }
    abc localabc;
    Object localObject1 = boL();
    if (localObject1 != null) {
      a((tF)localObject1, false);
    }
    Object localObject2 = bVl.caZ();
    for (Iterator localIterator = sL().iterator(); localIterator.hasNext(); ) { localabc = (abc)localIterator.next();
      if ((localabc instanceof ob)) {
        ((bVl)localObject2).c((ob)localabc);
      }
    }

    release();
  }

  public void ev(boolean paramBoolean)
  {
    super.ev(paramBoolean);

    tF localtF = boL();
    if ((this.mwI) && (localtF != null)) {
      int i = fa();
      int j = fb();
      short s = fc();
      cfb localcfb = (cfb)ayg.aJQ().bZ(i, j);
      cFf localcFf = new cFf(i, j, s);
      localcfb.P(localcFf);
      a(localtF, localcFf.cAF());
    }
  }

  public int hA() {
    return -1;
  }

  public void wk(int paramInt) {
    this.csY = paramInt;
  }

  public boolean yz(int paramInt) {
    return this.csY == paramInt;
  }

  public int aeR() {
    return this.csY;
  }

  public boolean ta() {
    return true;
  }

  public duc sR() {
    return this.krg;
  }

  public void c(CG paramCG) {
    super.c(paramCG);
    this.kri = null;
  }

  public EA xN() {
    throw new UnsupportedOperationException("Il faut implementer cette methode pour rendre l'ie deployable");
  }

  public EA abI() {
    return this.krh;
  }
}