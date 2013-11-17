import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class dhJ
  implements aTa, axQ, bEd, bIs, bad, cBT, cTK, cYl, ctb, dHW, dib
{
  private static final boolean DEBUG = false;
  public static final eu[] lcO = { eu.ayM, eu.ayN, eu.ayO, eu.ayP, eu.azq, eu.azd, eu.aze, eu.azf, eu.azg, eu.azA, eu.azB, eu.azy, eu.azx, eu.azj, eu.azk, eu.azl, eu.azm, eu.azn, eu.ayQ, eu.ayR };

  public static final eu[] lcP = { eu.azr, eu.azp, eu.ayU, eu.ayS, eu.ayT, eu.aza, eu.azb, eu.ayW, eu.ayV, eu.azI, eu.ayY, eu.azc, eu.azd, eu.aze, eu.azf, eu.azg, eu.azh, eu.azi, eu.azz, eu.azA, eu.azB, eu.azy, eu.azx, eu.azZ, eu.aAb, eu.aAa, eu.aAc };

  public static final eu[] lcQ = { eu.ayM, eu.ayN, eu.ayO, eu.ayP, eu.azq, eu.azj, eu.azk, eu.azl, eu.azm, eu.azn, eu.azA, eu.azB, eu.azy, eu.azx, eu.ayQ, eu.ayR, eu.ayY, eu.azc, eu.azd, eu.aze, eu.azf, eu.azg, eu.azh, eu.azi, eu.ayS, eu.ayT, eu.aza, eu.azb, eu.azI, eu.azW, eu.azT, eu.azS, eu.azR, eu.azU, eu.azV, eu.azY, eu.aAj, eu.aAk };
  private static final int lcR = 6;
  protected static final Logger K = Logger.getLogger(dhJ.class);

  private boolean lcS = true;
  private String lcT;
  protected final Collection lcU = new ArrayList();
  protected boolean lcV;
  protected long aTz;
  protected long bkK;
  private byte hJn = -1;
  protected byte bkM = -1;
  protected String m_name;
  protected short TD;
  protected byte aHn;
  protected CG ax = CG.bFM;
  protected boolean lcW;
  protected final bCD lcX = new bCD();
  protected azp lcY;
  protected boolean hJp;
  protected boolean lcZ;
  protected boolean lda;
  private boolean ldb;
  protected final dhu ldc = new dhu(this, (byte)3);
  protected final dhu ldd = new dhu(this, (byte)4);

  protected bhh iIO = SB.ctz;
  protected final cYk cGk = new cYk();
  private bgJ lde;
  private boolean ldf;
  private boolean ldg;
  private boolean ldh;
  private csi ldi;
  private aZx ldj;
  private aZx ldk;
  private final aHw ldl = new aHw();
  private CG dLD;
  private boolean ldm;
  private final cvY ldn;
  private final aCr ldo = new aCr();
  private final alV ldp = new alV(this);
  protected boolean ldq;
  private dhJ dnJ;
  private boolean ldr;
  private final List lds = new ArrayList();
  private boolean ldt;
  private float ldu;
  private dle ldv;
  private int ldw;
  protected aTa ldx;
  protected cYl bXu;
  private beQ ldy;
  private byte ldz = 0;
  private dli ldA;

  protected dhJ()
  {
    this.ldn = adR();
  }

  public void d(csi paramcsi) {
    this.ldi = paramcsi;
  }

  public csi cQn() {
    return this.ldi;
  }

  public abstract int dV(int paramInt);

  public abstract drn adx();

  public abstract Collection adH();

  public abstract dhJ bW(long paramLong);

  public abstract Hh adS();

  public abstract cCe afu();

  public abstract int JE();

  public abstract aEv JF();

  public abstract void JC();

  public abstract boolean JD();

  protected abstract cvY adR();

  public cvY cJf()
  {
    return this.ldn;
  }

  public boolean a(dwo paramdwo) {
    return (!this.lds.contains(paramdwo)) && (this.lds.add(paramdwo));
  }

  public boolean b(dwo paramdwo) {
    return this.lds.remove(paramdwo);
  }

  private void cQo() {
    for (int i = 0; i < this.lds.size(); i++)
      ((dwo)this.lds.get(i)).q(this);
  }

  private void cQp()
  {
    for (int i = 0; i < this.lds.size(); i++)
      ((dwo)this.lds.get(i)).r(this);
  }

  protected void cQq()
  {
    for (int i = 0; i < this.lds.size(); i++)
      ((dwo)this.lds.get(i)).s(this);
  }

  protected void cQr()
  {
    for (int i = 0; i < this.lds.size(); i++)
      ((dwo)this.lds.get(i)).t(this);
  }

  public aYr cQs()
  {
    return dsh.luB.BA(afc());
  }

  public int cQt() {
    aYr localaYr = cQs();
    return localaYr == null ? -1 : localaYr.bP();
  }

  protected void cQu() {
    azp localazp = this.lcY;
    air localair;
    if ((localazp instanceof air)) {
      localair = (air)localazp;
    } else {
      K.error("Les NPCs ont des caractéristiques paresseuses. Les procédures doivent être ajoutées sur la breed.");
      return;
    }

    Rx localRx1 = localair.d(eu.azw);
    if (localRx1 != null) {
      localRx1.a(new bBO(localair, eu.ayM, this.iIO.a(ceU.hzD), 1));
    }

    Rx localRx2 = localair.d(eu.aAd);
    if (localRx2 != null) {
      localRx2.a(new bBO(localair, eu.azA, 1.0F, 0));
      localRx2.a(new bBO(localair, eu.azy, 1.0F, 0));
      localRx2.a(new bBO(localair, eu.azB, 1.0F, 0));
      localRx2.a(new bBO(localair, eu.azx, 1.0F, 0));
      localRx2.a(new bBO(localair, eu.azU, 1.0F, 0));
      localRx2.a(new bBO(localair, eu.azV, 1.0F, 0));
    }

    Rx localRx3 = localair.d(eu.azt);
    if (localRx3 != null) {
      localRx3.a(new bBO(localair, eu.azg, 1.0F, 0));
      localRx3.a(new bBO(localair, eu.azn, 1.0F, 0));
    }
    Rx localRx4 = localair.d(eu.azu);
    if (localRx4 != null) {
      localRx4.a(new bBO(localair, eu.azf, 1.0F, 0));
      localRx4.a(new bBO(localair, eu.azm, 1.0F, 0));
    }
    Rx localRx5 = localair.d(eu.azv);
    if (localRx5 != null) {
      localRx5.a(new bBO(localair, eu.azd, 1.0F, 0));
      localRx5.a(new bBO(localair, eu.azk, 1.0F, 0));
    }
    Rx localRx6 = localair.d(eu.azs);
    if (localRx6 != null) {
      localRx6.a(new bBO(localair, eu.aze, 1.0F, 0));
      localRx6.a(new bBO(localair, eu.azl, 1.0F, 0));
    }

    Rx localRx7 = localair.d(eu.aAb);
    if (localRx7 != null) {
      localRx7.a(new bBO(localair, eu.azg, this.iIO.a(ceU.hzE), 0));
      localRx7.a(new bBO(localair, eu.azn, this.iIO.a(ceU.hzI), 0));
    }
    Rx localRx8 = localair.d(eu.azZ);
    if (localRx8 != null) {
      localRx8.a(new bBO(localair, eu.azf, this.iIO.a(ceU.hzH), 0));
      localRx8.a(new bBO(localair, eu.azm, this.iIO.a(ceU.hzL), 0));
    }
    Rx localRx9 = localair.d(eu.aAa);
    if (localRx9 != null) {
      localRx9.a(new bBO(localair, eu.azd, this.iIO.a(ceU.hzG), 0));
      localRx9.a(new bBO(localair, eu.azk, this.iIO.a(ceU.hzK), 0));
    }
    Rx localRx10 = localair.d(eu.aAc);
    if (localRx10 != null) {
      localRx10.a(new bBO(localair, eu.aze, this.iIO.a(ceU.hzF), 0));
      localRx10.a(new bBO(localair, eu.azl, this.iIO.a(ceU.hzJ), 0));
    }

    Rx localRx11 = localair.d(eu.aze);
    if (localRx11 != null) {
      localRx11.a(new duE(localair));
    }
    Rx localRx12 = localair.d(eu.azd);
    if (localRx12 != null) {
      localRx12.a(new duE(localair));
    }
    Rx localRx13 = localair.d(eu.azf);
    if (localRx13 != null) {
      localRx13.a(new duE(localair));
    }
    Rx localRx14 = localair.d(eu.azg);
    if (localRx14 != null) {
      localRx14.a(new duE(localair));
    }
    Rx localRx15 = localair.d(eu.aAp);
    if (localRx15 != null) {
      localRx15.a(new duE(localair));
    }

    if (adF())
      cQv();
  }

  public void cQv()
  {
    if (aJp() != SB.ctK) {
      return;
    }

    Rx localRx1 = (Rx)this.lcY.a(eu.ayM);
    Rx localRx2 = (Rx)this.lcY.a(eu.aAj);
    Rx localRx3 = (Rx)this.lcY.a(eu.azE);

    if (localRx3 == null) {
      return;
    }

    azo localazo = new azo((air)this.lcY, 0.9F);

    if (localRx1 != null) {
      localRx1.a(localazo);
    }

    if (localRx2 != null)
      localRx2.a(localazo);
  }

  public abstract void gD(int paramInt);

  public abstract int dU(int paramInt);

  public abstract dhJ b(long paramLong, cYk paramcYk, short paramShort, csi paramcsi, boolean paramBoolean, aZx paramaZx);

  public boolean cQw()
  {
    return false;
  }

  public void aJ()
  {
    this.ldi = null;
    this.lcS = false;
    this.lcT = null;
    this.aTz = 0L;
    this.bkK = 0L;
    this.bkM = JJ();
    this.TD = 0;
    this.aHn = 0;
    this.m_name = "<undefined>";
    this.iIO = JI();
    this.hJp = false;
    this.lcZ = false;
    this.ax = CG.bFM;
    this.lcU.clear();
    this.lda = false;

    this.lda = JD();
    this.bXu = null;
    this.ldx = null;
    this.ldn.reset();
    this.hJn = -1;
  }

  public void bc() {
    if (this.ldi != null) {
      this.ldi.clean();
    }
    this.ldi = null;
    this.ldw = 0;
    this.lcW = false;
    this.ldA = null;
    this.iIO = JI();
    this.lcU.clear();
    this.ax = CG.bFM;
    this.aTz = 0L;
    this.TD = 0;
    this.lda = false;
    this.hJp = false;
    this.lcZ = false;
    this.ldm = false;
    this.ldf = false;
    this.ldg = false;
    this.ldh = false;
    this.m_name = "<undefined>";
    this.lcV = false;
    this.dLD = null;
    this.bkK = -1L;
    this.cGk.ac(-32000, -32000, (short)-1);
    if (this.lde != null) {
      this.lde.bbk();
      this.lde = null;
    }
    this.ldo.clear();
    this.aHn = -1;
    this.ldl.reset();
    this.bkM = -1;
    this.ldk = null;

    if (this.bXu != null) {
      this.bXu.adK();
    }
    this.bXu = null;
    if (this.ldx != null) {
      this.ldx.Vk();
    }
    this.ldx = null;
    cQV();
    this.lcS = true;

    this.ldn.reset();
    this.ldb = false;
    this.ldq = false;
    this.ldr = false;
    this.ldy = null;
    this.ldz = 0;
    this.ldA = null;
    this.ldw = 0;
  }

  public void release() {
    bc();
  }

  protected abstract bhh JI();

  protected abstract byte JJ();

  public boolean cQx()
  {
    return this.lcS;
  }

  public String cQy()
  {
    return this.lcT;
  }

  public void a(aPH paramaPH) {
    this.ldu = 0.0F;
    this.lcV = true;
    this.ldq = false;
    fz(false);

    this.ldl.reset();

    cQo();
  }

  public void aea() {
    this.ldu = 0.0F;
    this.lcV = false;
    this.hJp = false;
    this.ldq = false;
    this.ldx = null;
    this.bXu = null;

    if (cQz()) {
      this.ldl.reset();
      e(this.ldc);
    }

    cQp();
  }

  private boolean cQz() {
    return !cQA();
  }

  protected boolean cQA() {
    aPH localaPH = afv();
    return (localaPH == null) || (localaPH.aq(this));
  }

  protected final void e(cOE paramcOE) {
    a(paramcOE, null);
  }

  protected final void a(cOE paramcOE, List paramList) {
    a(paramcOE, paramList, true);
  }

  protected void a(cOE paramcOE, List paramList, boolean paramBoolean) {
    try {
      if (paramList == null) {
        paramList = h(paramcOE);
      }

      int i = e(eu.ayM);

      aZx localaZx = this.ldj;
      if (localaZx != null) {
        localaZx.reset();
      }

      if (paramBoolean) {
        ayK().kR(true);
        try {
          ayK().clear();
        } catch (Exception localException2) {
          K.error("Exception levee", localException2);
        }
        ayK().kR(false);
      }
      a(new dRe());

      if (!this.ldf) {
        JC();
      }

      f(paramcOE);
      M(paramList);
      zV(i);
      if (!this.ldf)
        g(paramcOE);
    }
    catch (Exception localException1) {
      K.error("Exception levee lors du rechargment d'un perso " + this, localException1);
    }
  }

  public void zV(int paramInt) {
    d(eu.ayM).set(paramInt);
  }

  public abstract void aeb();

  protected static void a(aPH paramaPH, dhJ paramdhJ)
  {
    if (paramaPH == null) {
      return;
    }

    paramaPH.Y(paramdhJ);
  }

  public void h(long paramLong1, long paramLong2) {
    if (afv() == null) {
      return;
    }
    afv().h(paramLong1, paramLong2);
  }

  public void dF(byte paramByte) {
    this.hJn = paramByte;
  }

  public byte cgE() {
    return this.hJn;
  }

  public boolean atP() {
    return true;
  }

  public boolean aeH() {
    return true;
  }

  public boolean atQ() {
    return (!c(cfY.hBq)) && ((c(cfY.hBg)) || (!c(cfY.hBf))) && (!c(cfY.hCa));
  }

  public cYk ML()
  {
    return this.cGk != null ? new cYk(this.cGk) : null;
  }

  public dle clC() {
    if (this.ldv != null)
      return this.ldv;
    return this;
  }

  public void B(dle paramdle) {
    this.ldv = paramdle;
  }

  public void d(int paramInt1, int paramInt2, short paramShort)
  {
    if ((!bB) && ((paramShort < -512) || (paramShort > 511))) throw new AssertionError("Altitude of the position is out of bounds : " + paramShort);

    UG localUG = LB();
    if ((localUG != null) && (!Vj()) && (localUG.aw(this.hJn)) && (!this.ldt)) {
      localUG.a(this, paramInt1, paramInt2);
    }

    this.cGk.ac(paramInt1, paramInt2, paramShort);
    if ((this.aTz != -1L) && (!cQB())) {
      K.error("Position invalide pour un BasicCharacterInfo : " + this.cGk + " worldId=" + this.TD);
    }

    if (this.ldx != null) {
      this.ldx.d(paramInt1, paramInt2, paramShort);
      this.ldx.atl();
    }
  }

  public void n(cYk paramcYk) {
    d(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
  }

  private UG LB() {
    aPH localaPH = afv();
    if (localaPH == null) {
      return null;
    }
    return localaPH.LB();
  }

  protected boolean cQB() {
    return true;
  }

  public void q(int paramInt1, int paramInt2, short paramShort) {
    throw new UnsupportedOperationException("Not implemented - this method must be overloaded");
  }

  public aid boT()
  {
    return null;
  }

  public void n(bTI parambTI) {
    if (parambTI == null) {
      return;
    }
    if (!parambTI.bZU()) {
      return;
    }
    dCi localdCi = auK();
    if (localdCi == null) {
      return;
    }
    if (this.lcY == null) {
      return;
    }
    if ((aJp() == null) || (!(aJp() instanceof SB))) {
      return;
    }
    ((SB)aJp()).afK().a(parambTI, this.lcY, localdCi);
  }

  public boolean b(dSc paramdSc) {
    return (this.lcY != null) && (this.lcY.c(paramdSc));
  }

  public Rx d(dSc paramdSc) {
    return (Rx)this.lcY.a(paramdSc);
  }

  public int e(dSc paramdSc) {
    return this.lcY == null ? 0 : this.lcY.e(paramdSc);
  }

  public int g(dSc paramdSc) {
    return this.lcY.f(paramdSc);
  }

  public int boX() {
    return e(eu.ayR);
  }

  public int boY() {
    return e(eu.ayQ);
  }

  public boolean boZ() {
    return !c(cfY.hBn);
  }

  public void c(CG paramCG) {
    int i = paramCG.m_index - this.ax.m_index;
    this.ax = paramCG;
    if (this.ldx != null)
      this.ldx.c(this.ldx.E().ev(i));
  }

  public void g(CG paramCG)
  {
    this.dLD = paramCG;
  }

  public CG atM() {
    return this.dLD == null ? this.ax : this.dLD;
  }

  public byte bY()
  {
    if (this.iIO != null) {
      return this.iIO.bY();
    }
    return 6;
  }

  public boolean ayb() {
    return !c(cfY.hBO);
  }

  public byte afD() {
    if (this.iIO != null) {
      return this.iIO.afD();
    }
    return 0;
  }

  public short arG() {
    return 4;
  }

  public boolean c(Kf paramKf) {
    switch (paramKf.rQ()) {
    case 1:
      if (this.ldj != null) {
        return this.ldj.c((cfY)paramKf);
      }
      break;
    case 0:
      if (this.ldk != null) {
        return this.ldk.c((dKm)paramKf);
      }
      break;
    }
    return false;
  }

  public boolean i(Kf paramKf) {
    return c(paramKf);
  }

  public boolean bnX() {
    return (c(cfY.hBf)) || (c(cfY.hBq));
  }

  public byte d(Kf paramKf) {
    switch (paramKf.rQ()) {
    case 1:
      if (this.ldj != null) {
        return this.ldj.d((cfY)paramKf);
      }
      break;
    case 0:
      if (this.ldk != null) {
        return this.ldk.d((dKm)paramKf);
      }
      break;
    }
    return 0;
  }

  public void a(Kf paramKf, byte paramByte) {
    switch (paramKf.rQ()) {
    case 1:
      if (this.ldj != null) {
        this.ldj.e((cfY)paramKf);
      }
      if (this.ldj != null)
        this.ldj.a((cfY)paramKf, paramByte); break;
    case 0:
      if (this.ldk == null) {
        this.ldk = aZx.a((byte)0, this);
      }
      if (this.ldk != null)
        this.ldk.a((dKm)paramKf, paramByte);
      break;
    }
  }

  public void a(Kf paramKf)
  {
    switch (paramKf.rQ())
    {
    case 1:
      if (this.ldj != null)
        this.ldj.e((cfY)paramKf); break;
    case 0:
      if (this.ldk == null) {
        this.ldk = aZx.a((byte)0, this);
      }
      if (this.ldk != null)
        this.ldk.e((dKm)paramKf);
      break;
    }
  }

  public void j(Kf paramKf)
  {
    if (paramKf == null) {
      return;
    }
    switch (paramKf.rQ()) {
    case 1:
      if (this.ldj != null)
        this.ldj.f((cfY)paramKf); break;
    case 0:
      if (this.ldk != null) {
        this.ldk.f((dKm)paramKf);
        if (this.ldk.isEmpty())
          this.ldk = null;
      }
      break;
    }
  }

  public void b(Kf paramKf)
  {
    switch (paramKf.rQ()) {
    case 1:
      if (ayK() != null) {
        ayK().a((cfY)paramKf);
      }
      if (this.ldj != null)
        this.ldj.g((cfY)paramKf); break;
    case 0:
      if (this.ldk != null) {
        this.ldk.g((dKm)paramKf);
        if (this.ldk.isEmpty())
          this.ldk = null;
      }
      break;
    }
  }

  public void h(Kf paramKf)
  {
  }

  public boolean a(BitSet paramBitSet, aVc paramaVc, byte paramByte)
  {
    return (ayK() != null) && (ayK().a(paramBitSet, paramaVc, paramByte));
  }

  public boolean bGg() {
    return true;
  }

  public void b(dle paramdle) {
  }

  public void c(dle paramdle) {
  }

  public void d(dle paramdle) {
  }

  public boolean atL() {
    aPH localaPH = afv();
    if ((localaPH != null) && (!localaPH.aEt().bbP()) && (localaPH.bgL() < 2)) {
      return false;
    }

    return (adF()) && (d(eu.ayM).isZero()) && (!this.lcZ) && (!this.hJp);
  }

  public boolean clu() {
    return (adF()) && (d(eu.ayM).value() > 0) && (!this.lcZ) && (this.hJp) && (!this.ldb);
  }

  public boolean cly()
  {
    return (adF()) && ((d(eu.ayX).isZero()) || ((afv() != null) && (afv().cm(Fx()).isEmpty()))) && (this.hJp) && (d(eu.ayM).value() <= 0);
  }

  public boolean aJu()
  {
    return (adF()) && (afv() != null) && (afv().S(this));
  }

  public boolean byd() {
    return (adF()) && (afv() != null) && (afv().T(this));
  }

  public boolean byc() {
    return (adF()) && (afv() != null) && (afv().R(this));
  }

  public void ps() {
    this.hJp = true;
  }

  public void adY() {
    this.hJp = false;
  }

  public void jf(boolean paramBoolean) {
    this.ldb = paramBoolean;
  }

  public boolean cQC() {
    return this.ldb;
  }

  public void adZ() {
    if (cQD()) {
      return;
    }
    if ((!c(cfY.hBl)) && (!this.ldq))
      fz(true);
  }

  private boolean cQD()
  {
    if (this.bXu != null) {
      this.bXu.adK();
    }

    aPH localaPH = afv();
    if (localaPH == null) {
      return true;
    }

    Collection localCollection = localaPH.bgG();
    for (Iterator localIterator = localCollection.iterator(); localIterator.hasNext(); ) {
      dhJ localdhJ = (dhJ)localIterator.next();
      ayK().o(localdhJ);
    }
    return false;
  }

  public boolean adX() {
    return !this.ldm;
  }

  public void he(boolean paramBoolean) {
    this.ldm = paramBoolean;
  }

  public byte[] aRa()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRa();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public void aE(byte[] paramArrayOfByte)
  {
    cQV();
    cQL();
    aEv localaEv = JF();
    if (localaEv != null)
      localaEv.q(paramArrayOfByte);
    else
      K.error("Impossible de désérialioser les données binaire du fighter : pas de sérialiseur défini.");
  }

  public byte[] cls()
  {
    return ayK().eE(false);
  }

  public byte[] jg(boolean paramBoolean) {
    return ayK().eE(paramBoolean);
  }

  public void aq(byte[] paramArrayOfByte) {
    ayK().a(paramArrayOfByte, bEY());
  }

  public byte Fx() {
    if (afv() == null) {
      return -1;
    }
    return afv().ad(this);
  }

  public void as(byte paramByte) {
    if (afv() == null) {
      return;
    }
    afv().a(this, paramByte);
  }

  public cOE ayL() {
    Object localObject = bEY();
    if ((localObject == null) || (((cOE)localObject).LA() == 0)) {
      localObject = this.ldc;
    }
    return localObject;
  }

  public dhu cQE() {
    return this.ldd;
  }

  public boolean a(int paramInt, cYk paramcYk) {
    return true;
  }

  public void q(byte[] paramArrayOfByte) {
    aEv localaEv = JF();
    if (localaEv != null)
      localaEv.q(paramArrayOfByte);
    else
      K.error("Impossible de décoder les données binaire du personnage : pas de sérialiseur défini.");
  }

  public short fc()
  {
    return this.cGk.IB();
  }

  public void ed(short paramShort) {
    this.cGk.dG(paramShort);
    if (this.ldx != null)
      this.ldx.d(this.cGk.getX(), this.cGk.getY(), paramShort);
  }

  public cKT bHr()
  {
    return null;
  }

  public String cQF() {
    return getName();
  }

  public final cOE bEY() {
    return (this.lcV) && (afv() != null) ? adV() : adW();
  }

  public bZH ayJ() {
    return null;
  }

  public amS a(aFy paramaFy, byte paramByte)
  {
    return null;
  }

  public cOE adV() {
    if (afv() != null) {
      return afv().aIq();
    }
    return null;
  }

  public String cQG() {
    return null;
  }

  public short nU() {
    return 0;
  }

  public abstract float JK();

  public String getName() {
    return this.m_name != null ? this.m_name : "UNDEFINED";
  }

  public final cYk aKb()
  {
    return this.cGk;
  }

  public cvq bGn() {
    return null;
  }

  public dCi auK() {
    return null;
  }

  public dCi auL() {
    return null;
  }

  public aHw cQH() {
    return this.ldl;
  }

  public int aJt() {
    return kV(SB.ctz.uO());
  }

  public int kV(int paramInt) {
    int i = 0;
    Iterator localIterator;
    Object localObject;
    if (afv() != null) {
      localIterator = afv().bgG().iterator();
      while (localIterator.hasNext()) {
        localObject = (dHW)localIterator.next();
        if ((localObject instanceof dhJ)) {
          dhJ localdhJ = (dhJ)localObject;
          if ((localdhJ.ldf) && (!localdhJ.lcZ) && (localdhJ.aft() == this) && (localdhJ != this) && ((paramInt == SB.ctz.uO()) || (localdhJ.uO() == paramInt)))
          {
            i++;
          }
        }
      }
    } else {
      for (localIterator = adH().iterator(); localIterator.hasNext(); ) { localObject = (dhJ)localIterator.next();
        if ((((dhJ)localObject).ldf) && (!((dhJ)localObject).lcZ) && ((paramInt == SB.ctz.uO()) || (((dhJ)localObject).uO() == paramInt))) {
          i++;
        }
      }
    }
    return i;
  }

  public int aff() {
    int i = 0;
    Iterator localIterator;
    Object localObject;
    if (afv() != null) {
      localIterator = afv().bgG().iterator();
      while (localIterator.hasNext()) {
        localObject = (dHW)localIterator.next();
        if ((localObject instanceof dhJ)) {
          dhJ localdhJ = (dhJ)localObject;
          if ((localdhJ.ldf) && (!localdhJ.lcZ) && (localdhJ.aft() == this))
          {
            i += ((dGf)localdhJ.aJp()).alN();
          }
        }
      }
    } else {
      for (localIterator = adH().iterator(); localIterator.hasNext(); ) { localObject = (dhJ)localIterator.next();
        if ((((dhJ)localObject).ldf) && (!((dhJ)localObject).lcZ)) {
          i += ((dGf)((dhJ)localObject).aJp()).alN();
        }
      }
    }
    return i;
  }

  public int cQI() {
    NQ localNQ = awq();
    if (localNQ == null) {
      return 0;
    }
    csi localcsi = localNQ.aac();
    if (localcsi == null) {
      return 0;
    }

    return localcsi.cqI();
  }

  public cOE adW() {
    return null;
  }

  public int fa() {
    return this.cGk.getX();
  }

  public int fb() {
    return this.cGk.getY();
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

  protected void bFw() {
    aEv localaEv = JF();
    if (localaEv != null) {
      new bHh(this, localaEv.aQJ(), null);
      new nC(this, localaEv.aQI(), null);
      new bWl(this, localaEv.aQH());
      new def(this, localaEv.aQK());
      new bWq(this, localaEv.aQL());
      new bRF(this, localaEv.aQM(), null);
      new aj(this, localaEv.aQN(), null);
      new sB(this, localaEv.aQO(), null);
      new aap(this, localaEv.aQQ(), null);
      new cUF(this, localaEv.aQR(), null);
      new dEy(this, localaEv.aQS(), null);
    } else {
      K.error("Pas de sérialiseur à initialiser : le personnage ne sera pas sérialisable !");
    }
  }

  public boolean cQJ() {
    return this.lda;
  }

  public boolean aJr() {
    return this.ldf;
  }

  public boolean aJs() {
    return this.ldg;
  }

  public boolean cQK() {
    return (this.ldf) || (c(dKm.lXr));
  }

  public void cQL()
  {
    if (this.ldj == null)
      this.ldj = aZx.a((byte)1, this);
  }

  public void a(azg paramazg)
  {
    if (!this.lcU.contains(paramazg))
      this.lcU.add(paramazg);
  }

  public void ayD()
  {
    this.ldp.ayD();
  }

  protected void cQM() {
    f(d(eu.ayN));
    f(d(eu.ayO));
    f(d(eu.ayP));
  }

  private void f(cqm paramcqm) {
    if (paramcqm != null)
      paramcqm.cpx();
  }

  protected void c(cOE paramcOE)
  {
    cQN();

    dSr localdSr = bGQ();
    if (localdSr == null) {
      return;
    }
    for (Iterator localIterator1 = localdSr.iterator(); localIterator1.hasNext(); ) { localbWG = (bWG)localIterator1.next();
      for (dpI localdpI : localbWG)
        if (localdpI.aMG() == 0)
          localdpI.a(localbWG, this, paramcOE, bsj.bAv(), fa(), fb(), fc(), this, null);
    }
    bWG localbWG;
  }

  public void cQN()
  {
    ayK().px(17);
  }

  public void cQO() {
    ayK().px(19);
  }

  public Collection bHk() {
    return null;
  }

  public final String cQP() {
    String str = "";
    for (aVc localaVc : ayK().Cu(18)) {
      str = str + localaVc.getClass().getSimpleName() + " zoneBuffId=" + localaVc.wa().nT() + '\n';
    }

    return str;
  }

  public void cQQ() {
    ayK().px(18);

    Collection localCollection = bHk();
    Iterator localIterator1;
    if (localCollection != null)
      for (localIterator1 = localCollection.iterator(); localIterator1.hasNext(); ) { localbjU = (bjU)localIterator1.next();
        for (dpI localdpI : localbjU.buX())
          if (localdpI.aMG() == 0)
            localdpI.a(localbjU.buX(), this, this.ldc, bsj.bAv(), fa(), fb(), fc(), this, null);
      }
    bjU localbjU;
  }

  public void a(int paramInt1, cvY paramcvY, dkI paramdkI, int paramInt2, int paramInt3)
  {
    if (paramcvY.bP() == paramInt1)
    {
      dkI localdkI = dwC.dbQ().BQ(paramInt2);
      if (localdkI == paramdkI) {
        return;
      }

      if ((paramdkI.a(aRk.eOe)) && (!localdkI.a(aRk.eOe))) {
        cQO();
      }
      if ((localdkI.a(aRk.eOe)) && (!paramdkI.a(aRk.eOe)))
        bGR();
    }
  }

  public void bGR()
  {
    ayK().px(19);

    if (this.ldn == null) {
      return;
    }

    if (!b(aRk.eOe)) {
      return;
    }

    aYr localaYr = this.ldn.UI();
    if (localaYr.aNd().clp() == null) {
      return;
    }

    crV localcrV = localaYr.auU();
    if (localcrV == null) {
      K.info("buffs nuls impossible de recharger les buff");
      return;
    }
    int i = 0; for (int j = localcrV.size(); i < j; i++) {
      int k = localcrV.wm(i);

      cHN localcHN = dPR.mji.Do(k);

      if (localcHN != null) {
        for (dpI localdpI : localcHN) {
          if (localdpI.aMG() == 0) {
            localdpI.a(localcHN, this, this.ldc, bsj.bAv(), fa(), fb(), fc(), this, null);
          }

        }

      }
      else
      {
        K.error("Impossible d'appliquer ce buff (ID=" + k + "), il est introuvable.");
      }
    }
  }

  public void bGS() {
  }

  public void bGU() {
  }

  public void bGV() {
  }

  private boolean b(aRk paramaRk) {
    aYr localaYr = this.ldn.UI();
    int i = this.ldn.dJ(localaYr.bP());
    return dwC.dbQ().BQ(i).a(paramaRk);
  }

  public dSr bGQ() {
    return null;
  }

  public final byte h(short paramShort, boolean paramBoolean)
  {
    dSr localdSr = bGQ();
    if (localdSr == null) {
      K.error("Impossible de leveler les aptitudes d'un " + getClass().getName() + " qui n'en possède pas");

      return 1;
    }

    bWG localbWG = localdSr.bq(paramShort);
    if (localbWG == null) {
      K.error("Le personnage " + this + " ne possède pas l'aptitude " + paramShort);
      return 1;
    }
    if (!localbWG.cbI().b(aJp())) {
      K.error("Mauvaise breed pour augmenter l'aptitude " + paramShort + " : attendu=" + localbWG.cbI().toString() + ", trouvé=" + aJp());

      return 1;
    }

    int i = localbWG.nU();
    if ((i < 0) || (i > localbWG.cbI().nV())) {
      K.error("Niveau invalide pour l'aptitude " + localbWG + " du personnage " + this + " : " + i);

      return 1;
    }

    if (i == localbWG.cbI().nV()) {
      return 3;
    }

    int j = localbWG.cbI().atR();
    ArrayList localArrayList = auK().hi(j);
    if ((j != 0) && (localArrayList.isEmpty())) {
      return 1;
    }

    int k = localbWG.cbI().cG((short)(i + 1));
    if (k > nU()) {
      K.error(this + " n'a pas le niveau pour augmenter l'aptitude " + paramShort + " jusqu'au niveau " + (localbWG.nU() + 1) + " : requis=" + k + ", actuellement=" + nU());

      return 4;
    }

    if (paramBoolean) {
      qE localqE = localbWG.cbI().bQE();
      int m = localbWG.a((short)(i + 1), this);
      int n = localdSr.d(localqE);
      if (n < m) {
        K.error("Pas assez de points à " + this + " pour augmenter l'aptitude " + paramShort + " jusqu'au niveau " + (localbWG.nU() + 1) + " : requis=" + m + ", actuellement=" + n);

        return 2;
      }

      localdSr.a(localqE, n - m);
    }

    localbWG.aQ((short)(i + 1));
    c(this.ldc);
    bFx();
    return 0;
  }

  public void reset() {
    this.aTz = -1L;
    this.bkK = -1L;
    this.m_name = "";
    d(0, 0, (short)510);
    this.TD = -1;
    this.lcU.clear();
    this.aHn = 0;
    this.ax = CG.bFM;
  }

  public byte[] j()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.j();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRh()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRh();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aQW()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aQW();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] cQR()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aQZ();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRi()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRi();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRc()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRc();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] cQS()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRd();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRe()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRe();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRf()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRf();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRg()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRg();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] dl(boolean paramBoolean)
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.dl(paramBoolean);
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aQX()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      String str = null;
      if (cQw()) {
        str = getName();
        setName("[STAFF] " + str);
      }
      byte[] arrayOfByte = localaEv.aQX();
      if (cQw()) {
        setName(str);
      }
      return arrayOfByte;
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aQY()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      String str = null;
      if (cQw()) {
        str = getName();
        setName("[STAFF] " + str);
      }
      byte[] arrayOfByte = localaEv.aQY();
      if (cQw()) {
        setName(str);
      }
      return arrayOfByte;
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] cQT()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRl();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRm()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRm();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRn()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRn();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] aRb()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRb();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public byte[] cQU()
  {
    aEv localaEv = JF();
    if (localaEv != null) {
      return localaEv.aRq();
    }
    K.error("Impossible de sérialiser les données binaire du personnage : pas de sérialiseur défini.");
    return aUP.EMPTY_BYTE_ARRAY;
  }

  public void h(int paramInt, Object paramObject)
  {
  }

  public void i(int paramInt, Object paramObject)
  {
  }

  public void jh(boolean paramBoolean)
  {
    this.lda = paramBoolean;
  }

  public void pg(String paramString)
  {
  }

  public void gE(int paramInt)
  {
    this.ldw = paramInt;
  }

  public int oc() {
    return this.ldw;
  }

  public void iT(int paramInt) {
  }

  public void aQ(short paramShort) {
    throw new UnsupportedOperationException("Only monsters can set level");
  }

  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
  }

  public void ji(boolean paramBoolean)
  {
    this.ldf = paramBoolean;
  }

  public boolean t(gA paramgA) {
    return this.ldp.t(paramgA);
  }

  public void s(gA paramgA) {
    this.ldp.s(paramgA);
  }

  protected void a(gA paramgA, ctU paramctU) {
    this.ldp.a(paramgA, paramctU);
  }

  public void cQV()
  {
    this.ldj = null;
    this.ldm = false;
    cyk();
  }

  public void cQW()
  {
    this.lcU.clear();
  }

  protected void cQX()
  {
    for (bsc localbsc : bQG.bXD().bXE()) {
      byte b = localbsc.bAs();
      int i = localbsc.qI(nU());
      eu localeu = eu.a(Byte.valueOf(b));
      if ((localeu != null) && (b(localeu)))
        d(localeu).gz(i);
    }
  }

  public void a(byte paramByte, cYk paramcYk, boolean paramBoolean, bfE parambfE)
  {
  }

  public bhh aJp()
  {
    return this.iIO;
  }

  public short uO() {
    if (this.iIO != null) {
      return this.iIO.uO();
    }
    return -1;
  }

  public azp cQY() {
    return this.lcY;
  }

  public CG E() {
    return this.ax;
  }

  public aZx cQZ()
  {
    return this.ldj;
  }

  public long getId() {
    return this.aTz;
  }

  public byte aLY() {
    return 20;
  }

  public short Lk() {
    return this.TD;
  }

  public long sN() {
    return this.bkK;
  }

  public aYx atN() {
    if (c(cfY.hBT)) {
      return null;
    }
    this.lcX.a(fa(), fb(), fc(), this.ax);
    return this.lcX;
  }

  public bgJ ayK() {
    cRb();
    return this.lde;
  }

  public boolean cRa() {
    return this.lde != null;
  }

  public void cRb() {
    if (this.lde == null)
      this.lde = new bgJ(this);
  }

  public byte xK()
  {
    return this.aHn;
  }

  public byte getType() {
    return this.bkM;
  }

  public aZx cRc()
  {
    return this.ldk;
  }

  public void fz(boolean paramBoolean) {
    if (this.lcZ != paramBoolean) {
      this.lcZ = paramBoolean;
      bSn();
    }
  }

  public boolean isDead() {
    return this.lcZ;
  }

  protected void bSn() {
  }

  public boolean cRd() {
    return this.lcW;
  }

  public void c(bhh parambhh) {
    this.iIO = parambhh;
  }

  public aiq bSx() {
    return null;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public void jj(boolean paramBoolean) {
    this.lcW = paramBoolean;
  }

  public void Y(short paramShort) {
    this.TD = paramShort;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public void jk(boolean paramBoolean)
  {
    this.lcV = paramBoolean;
  }

  public void aI(long paramLong) {
    this.bkK = paramLong;
  }

  public void cO(byte paramByte) {
    this.aHn = paramByte;
  }

  public void setType(byte paramByte) {
    this.bkM = paramByte;
  }

  public void aV(dhJ paramdhJ) {
    if (paramdhJ == null) {
      return;
    }
    this.dnJ = paramdhJ;
  }

  public void unlink() {
    this.dnJ = null;
  }

  public dhJ cRe() {
    return this.dnJ;
  }

  public aTa cLL()
  {
    return this.ldx;
  }

  public cYl Vl() {
    return this.bXu;
  }

  public boolean cLK() {
    return this.ldx != null;
  }

  public boolean Vj() {
    return this.bXu != null;
  }

  public boolean Vi() {
    return !c(cfY.hCz);
  }

  public boolean a(cYl paramcYl) {
    return (!cLK()) && (!Vj());
  }

  public boolean b(aTa paramaTa)
  {
    if (paramaTa == null) {
      return false;
    }

    if (cLK()) {
      return false;
    }

    if (Vj()) {
      return false;
    }

    if (paramaTa == this) {
      return false;
    }

    if (!paramaTa.a(this)) {
      return false;
    }

    if ((paramaTa.fc() > fc() + bY() / 2) && (paramaTa.fc() < fc() - bY() / 2))
    {
      return false;
    }

    return true;
  }

  public boolean a(aTa paramaTa)
  {
    if (!b(paramaTa)) {
      return false;
    }

    if (paramaTa == null) {
      return false;
    }

    cYk localcYk = ML();

    this.ldx = paramaTa;
    paramaTa.b(this);

    paramaTa.d(localcYk.getX(), localcYk.getY(), localcYk.IB());
    paramaTa.atl();

    return true;
  }

  public void b(cYl paramcYl)
  {
    this.bXu = paramcYl;
    UG localUG = LB();
    if (localUG != null)
      localUG.a(this, false);
  }

  public void Vk()
  {
    this.bXu = null;
    UG localUG = LB();
    if (localUG != null)
      localUG.a(this, true);
  }

  public boolean m(cYk paramcYk)
  {
    if (this.ldx != null) {
      if (!this.cGk.equals(paramcYk)) {
        CG localCG = new La(paramcYk.getX() - this.cGk.getX(), paramcYk.getY() - this.cGk.getY(), 0).Vy();
        c(localCG);
      }
      this.ldx.d(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
      this.ldx.Vk();
      this.ldx = null;
      return true;
    }

    return false;
  }

  public boolean l(cYk paramcYk) {
    return m(paramcYk);
  }

  public void adK() {
    if (this.ldx != null) {
      cYk localcYk = ML();
      m(localcYk);
    }
  }

  public boolean rz(int paramInt)
  {
    return false;
  }

  public void bFx() {
    ayK().px(25);
    if (auK() == null) {
      return;
    }
    for (Iterator localIterator1 = auK().iterator(); localIterator1.hasNext(); ) { localbfE = (bfE)localIterator1.next();
      bzj localbzj = localbfE.bsL();
      if ((localbfE.nU() > 0) || (localbzj.bHZ()))
      {
        if (localbzj.bHY()) {
          localbfE = (bfE)auK().hh(localbzj.getId());
          for (dpI localdpI : localbfE)
            localdpI.a(localbfE, this, ayL(), bsj.bAv(), fa(), fb(), fc(), this, null);
        }
      } }
    bfE localbfE;
  }

  public final void f(cOE paramcOE) {
    c(paramcOE);
    bFx();
    cQQ();
    bGR();
    bGS();
    bGU();
    ayD();
    bGV();
  }

  protected void g(cOE paramcOE) {
    if (paramcOE.LA() != 1) {
      return;
    }

    if (!((dMC)paramcOE).bbU()) {
      return;
    }

    if (this.bkM != 0) {
      return;
    }

    bJC localbJC1 = cNO.cFX().yF(1408);
    bJC localbJC2 = localbJC1.cJ((short)0);
    ArrayList localArrayList = localbJC1.cd((short)0);
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dpI localdpI = (dpI)localArrayList.get(i);
      localdpI.a(localbJC2, this, adW(), bsj.bAv(), fa(), fb(), fc(), this, null);
    }
  }

  protected final void cRf()
  {
    ayK().a(this, bEY());
    f(this.ldc);
  }

  protected final List h(cOE paramcOE) {
    List localList = ayK().bto();
    Iterator localIterator = localList.iterator();
    ArrayList localArrayList = new ArrayList();
    while (localIterator.hasNext()) {
      bPD localbPD1 = (bPD)localIterator.next();
      if (localbPD1.bWk().NT()) {
        bPD localbPD2 = localbPD1.d(paramcOE);
        localArrayList.add(localbPD2);
      }
    }
    return localArrayList;
  }

  protected void M(List paramList) {
    for (bPD localbPD1 : paramList) {
      aVc.bka();
      bPD localbPD2 = localbPD1;
      localbPD2.jJ(true);
      localbPD2.i(this);
      localbPD2.j(this);
      localbPD2.bks();
      localbPD2.k(this);
      localbPD2.release();
    }
  }

  public void a(short paramShort1, short paramShort2, int paramInt, dpI paramdpI)
  {
    a(paramShort1, paramShort2, paramInt, paramdpI, false);
  }

  public void a(short paramShort1, short paramShort2, int paramInt, dpI paramdpI, boolean paramBoolean)
  {
    cOE localcOE = afv() != null ? afv().aIq() : adW();

    bsS localbsS = new bsS();

    aVc.bka();
    bZG localbZG = bZG.a(localcOE, this, paramShort1, paramShort2, false);
    localbZG.i(this);
    localbZG.jH(paramBoolean);
    localbsS.qK(paramInt).ga(localbZG.getId());
    localbZG.b(localbsS.bAZ());
    localbZG.b(paramdpI);

    localbZG.c(null, false);
  }

  public void ee(short paramShort)
  {
    bJC localbJC1 = cNO.cFX().yF(paramShort);
    bJC localbJC2 = localbJC1.cJ((short)0);
    ArrayList localArrayList = localbJC1.cd((short)0);
    int i = 0; for (int j = localArrayList.size(); i < j; i++) {
      dpI localdpI = (dpI)localArrayList.get(i);
      localdpI.a(localbJC2, this, adW(), bsj.bAv(), fa(), fb(), fc(), this, null);
    }
  }

  public abstract baD JL();

  public long e(csi paramcsi)
  {
    return aff() + paramcsi.cqI();
  }

  public long bmL() {
    return aff() + cQI();
  }

  public void cRg() {
  }

  public boolean r(long paramLong1, long paramLong2) {
    for (aVc localaVc : ayK()) {
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == paramLong1))
      {
        return paramLong2 == ((bPD)localaVc).bWk().nU();
      }
    }
    return false;
  }

  public boolean s(long paramLong1, long paramLong2) {
    for (aVc localaVc : ayK()) {
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == paramLong1))
      {
        return paramLong2 <= ((bPD)localaVc).bWk().nU();
      }
    }
    return false;
  }

  public boolean a(long paramLong1, long paramLong2, axQ paramaxQ) {
    if (ayK() == null) {
      return false;
    }
    if (paramaxQ == null) {
      return false;
    }

    Iterator localIterator = ayK().iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if (localaVc.getId() == bsj.fSj.getId()) {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == paramLong1)
        {
          if (localbJC.nU() != paramLong2) {
            return false;
          }
          if (localaVc.bke() == null) {
            return false;
          }
          return localaVc.bke().getId() == paramaxQ.getId();
        }
      }
    }
    return false;
  }

  public boolean a(long paramLong, axQ paramaxQ) {
    if (ayK() == null) {
      return false;
    }
    if (paramaxQ == null) {
      return false;
    }

    Iterator localIterator = ayK().iterator();
    while (localIterator.hasNext()) {
      aVc localaVc = (aVc)localIterator.next();
      if (localaVc.getId() == bsj.fSj.getId()) {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bQW() == paramLong)
        {
          if (localaVc.bke() == null) {
            return false;
          }
          return localaVc.bke().getId() == paramaxQ.getId();
        }
      }
    }
    return false;
  }

  public boolean du(long paramLong) {
    for (aVc localaVc : ayK()) {
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == paramLong))
      {
        return true;
      }
    }
    return false;
  }

  public int dv(long paramLong) {
    for (aVc localaVc : ayK()) {
      if ((localaVc.getId() == bsj.fSj.getId()) && (((bPD)localaVc).bWk().bQW() == paramLong))
      {
        return ((bPD)localaVc).bWk().nU();
      }
    }
    return -1;
  }

  public boolean zW(int paramInt) {
    return zY(paramInt) != null;
  }

  public boolean zX(int paramInt) {
    return zZ(paramInt) != null;
  }

  public aVc zY(int paramInt) {
    for (aVc localaVc : ayK()) {
      if (localaVc.getId() == paramInt) {
        return localaVc;
      }
    }
    return null;
  }

  public aVc zZ(int paramInt) {
    for (aVc localaVc : ayK()) {
      if (localaVc.yR() == paramInt) {
        return localaVc;
      }
    }
    return null;
  }

  public void c(dyI paramdyI) {
    this.ldo.a(paramdyI);
  }

  public void d(dyI paramdyI) {
    this.ldo.b(paramdyI);
  }

  public void g(short paramShort, int paramInt) {
    this.ldo.g(paramShort, paramInt);
  }

  public int aY(short paramShort) {
    return this.ldo.aY(paramShort);
  }

  public void j(short paramShort, int paramInt) {
    this.ldo.h(paramShort, paramInt);
  }

  public int ef(short paramShort) {
    return this.ldo.aZ(paramShort);
  }

  public boolean cRh() {
    return this.ldq;
  }

  public void jl(boolean paramBoolean) {
    this.ldq = paramBoolean;
  }

  public void a(dVs paramdVs) {
  }

  public byte cRi() {
    return afw() == null ? Fx() : afw().Fx();
  }

  public void jm(boolean paramBoolean) {
    this.ldr = paramBoolean;
  }

  public boolean cRj() {
    return this.ldr;
  }

  public void bFv() {
    int i = e(eu.ayP);
    int j = g(eu.ayP);

    int k = e(eu.ayN);
    int m = g(eu.ayN);

    int n = e(eu.ayO);
    int i1 = g(eu.ayO);

    JC();

    int i2 = g(eu.ayP);
    int i3 = i2 - j;

    int i4 = g(eu.ayN);
    int i5 = i4 - m;

    int i6 = g(eu.ayO);
    int i7 = i6 - i1;

    d(eu.ayP).set(i + i3);
    d(eu.ayN).set(k + i5);
    d(eu.ayO).set(n + i7);
  }

  public void jn(boolean paramBoolean) {
    this.ldg = paramBoolean;
  }

  public void jo(boolean paramBoolean) {
    this.ldh = paramBoolean;
  }

  protected void aW(dhJ paramdhJ) {
    NQ localNQ = paramdhJ.awq();
    if (this.ldh) {
      return;
    }
    localNQ.bM(getId());
  }

  public void Aa(int paramInt) {
    if (this.bkM != 0) {
      return;
    }

    if (!adF()) {
      return;
    }

    int i = g(eu.ayM);
    this.ldu += paramInt / i / 6.0F * 100.0F;
  }

  public float cRk() {
    return this.ldu;
  }

  public int Ab(int paramInt) {
    return paramInt - bMr.ax(paramInt * this.ldu / 100.0F);
  }

  protected void d(bhh parambhh) {
    if (parambhh.afB().length <= 0) {
      return;
    }
    aZx localaZx = cQZ();
    if (localaZx == null) {
      K.error("manager de propriété de combat null au chargement des données de combat");
      return;
    }
    for (int k : parambhh.afB()) {
      cfY localcfY = cfY.vg(k);
      if (localcfY != null)
        localaZx.e(localcfY);
      else
        K.error("id d'une propriété de base incorrect :" + k);
    }
  }

  public boolean l(int paramInt, short paramShort)
  {
    return false;
  }

  public void aeB() {
  }

  public void Ac(int paramInt) {
  }

  public void b(int paramInt, cDZ paramcDZ) {
    a(paramInt, paramcDZ);
  }

  protected void a(int paramInt, cDZ paramcDZ) {
  }

  public void Ad(int paramInt) {
    aeD();
  }

  public void aeD() {
  }

  public boolean aeE() {
    return false;
  }

  public void cRl()
  {
    if (this.ldz == 0) {
      if ((!bB) && (this.ldy != null)) throw new AssertionError();
      this.ldy = new beQ(null);
    }
    this.ldz = ((byte)(this.ldz + 1));

    if (this.ldz > 100)
      K.warn("Il doit y avoir un poblème....", new Exception());
  }

  public void b(String paramString, Runnable paramRunnable)
  {
    if (this.ldy == null)
      paramRunnable.run();
    else
      this.ldy.a(paramString, paramRunnable);
  }

  public void cRm()
  {
    this.ldz = ((byte)(this.ldz - 1));
    if (this.ldz == 0) {
      this.ldy.execute();
      this.ldy = null;
    }
  }

  protected void afa()
  {
  }

  public void D(int paramInt, boolean paramBoolean)
  {
    a(paramInt, null, paramBoolean);
  }

  public void a(int paramInt, HashMap paramHashMap, boolean paramBoolean)
  {
  }

  public long cyi()
  {
    return this.aTz;
  }

  public dli cyj()
  {
    return this.ldA;
  }

  public dhJ cRn() {
    return null;
  }

  public void a(cBT paramcBT, short paramShort) {
    if (this.ldA == null) {
      this.ldA = new dli();
    }
    short s = this.ldA.jK(paramcBT.cyi());
    s = (short)(s + paramShort);
    this.ldA.r(paramcBT.cyi(), s);
  }

  public void b(cBT paramcBT, short paramShort) {
    if (this.ldA != null) {
      short s = this.ldA.jK(paramcBT.cyi());
      s = (short)(s - paramShort);
      this.ldA.r(paramcBT.cyi(), s);
    }
  }

  public void c(cBT paramcBT, short paramShort) {
    if (this.ldA == null) {
      this.ldA = new dli();
    }
    this.ldA.r(paramcBT.cyi(), paramShort);
  }

  public void a(cBT paramcBT) {
    if (this.ldA != null)
      this.ldA.jL(paramcBT.cyi());
  }

  public void cyk()
  {
    this.ldA = null;
  }

  public String cyl() {
    if (afv() != null) {
      String str1 = getName();
      if (str1.length() == 0) {
        str1 = "id(" + this.aTz + ')' + " breed(" + (aJp() != null ? Short.valueOf(aJp().uO()) : "unknown") + ')';
      }

      String str2 = "AggroList for " + str1 + ":\n";
      if (this.ldA != null) {
        bnP localbnP = this.ldA.cTd();
        while (localbnP.hasNext()) {
          localbnP.fl();
          long l = localbnP.bic();
          aPH localaPH = afv();
          dhJ localdhJ = localaPH.eu(l);
          String str3 = null;
          if (localdhJ != null) {
            str3 = localdhJ.getName();
            if ("".equals(str3)) {
              str3 = "id(" + localdhJ.aTz + ')' + " breed(" + (localdhJ.aJp() != null ? Short.valueOf(localdhJ.aJp().uO()) : "unknown") + ')';
            }

          }

          str2 = str2 + str3 + " : " + localbnP.Lb() + "\n";
        }
      }
      return str2;
    }
    return getName() + " not in Fight";
  }

  public void n(aVc paramaVc)
  {
  }

  public int afE() {
    return afv() != null ? this.iIO.afF() : this.iIO.afE();
  }

  public int bSp() {
    return this.iIO.afG().aCn();
  }

  public int bSq() {
    return this.iIO.afH().aCn();
  }

  public aDq bSB() {
    return null;
  }

  public void a(aDq paramaDq) {
  }

  public boolean q(boolean paramBoolean1, boolean paramBoolean2) {
    return true;
  }

  public boolean bSf() {
    return true;
  }

  public void bSg()
  {
  }

  public abstract void initialize();

  public abstract int afc();

  public abstract int afd();

  public abstract void a(int paramInt, Object paramObject);

  protected static dhJ b(aPH paramaPH, dhJ paramdhJ)
  {
    if (paramaPH == null)
    {
      return paramdhJ;
    }
    dhJ localdhJ = paramaPH.ab(paramdhJ);
    return localdhJ == null ? paramdhJ : localdhJ;
  }

  protected static dhJ c(aPH paramaPH, dhJ paramdhJ) {
    if (paramaPH == null)
    {
      return paramdhJ;
    }
    dhJ localdhJ = paramaPH.ac(paramdhJ);
    return localdhJ == null ? paramdhJ : localdhJ;
  }

  public abstract dhJ aft();

  public long aJq()
  {
    dhJ localdhJ = aft();
    if (localdhJ == null) {
      return 0L;
    }

    return localdhJ.aTz;
  }

  public NQ awq() {
    return null;
  }

  public void rB(int paramInt) {
  }

  public void jp(boolean paramBoolean) {
    this.ldt = paramBoolean;
  }

  public void cRo() {
  }

  public void adu() {
    aPH localaPH = afv();
    if (localaPH == null) {
      return;
    }
    localaPH.al(this);
    localaPH.az(this);
    localaPH.as(this);
    localaPH.an(this);
    localaPH.Y(this);
    cQD();
    localaPH.ar(this);
    localaPH.ao(this);
    localaPH.at(this);
  }

  public boolean b(go paramgo)
  {
    throw new UnsupportedOperationException("Not implemented");
  }

  public dhu bGq() {
    return this.ldc;
  }

  public int cRp() {
    return 0;
  }

  public void atl() {
  }

  public boolean a(afC paramafC) {
    return afC.cYy.a(paramafC);
  }

  public air cRq() {
    return null;
  }

  public double a(bcz parambcz) {
    int i = 0;
    if (b(eu.azP)) {
      i += e(eu.azP);
    }
    i += JL().a(dEv.lNi, parambcz);
    return i / 100.0D;
  }
}