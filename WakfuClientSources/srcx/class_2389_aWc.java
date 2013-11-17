import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class aWc extends cZV
  implements Hz, bcG
{
  public static final int eYp = 0;
  public static final int eYq = 10;
  public static final int eYr = 20;
  public static final float eYs = 1.0F;
  public static final int eYt = 200000;
  public static final int eYu = 200200;
  public static final int eYv = 290998;
  public static final int eYw = 290999;
  public static final int eYx = 290997;
  public static final int eYy = 0;
  public static final int eYz = 15384;
  public static final int eYA = 600001;
  public static final int eYB = 600002;
  public static final int eYC = 600003;
  public static final int eYD = 600004;
  public static final int eYE = 600006;
  public static final int eYF = 600007;
  public static final int eYG = 600008;
  public static final int eYH = 600009;
  public static final int eYI = 600010;
  public static final int eYJ = 600011;
  public static final int eYK = 600012;
  public static final int eYL = 600013;
  public static final int eYM = 600014;
  public static final int eYN = 600015;
  public static final int eYO = 600016;
  public static final int eYP = 600017;
  public static final int eYQ = 600018;
  public static final int eYR = 600019;
  public static final int eYS = 600020;
  public static final int eYT = 600021;
  public static final int eYU = 600022;
  public static final int eYV = 600023;
  public static final int eYW = 600024;
  public static final int eYX = 600025;
  public static final int eYY = 600026;
  public static final int eYZ = 600027;
  public static final int eZa = 600028;
  public static final int eZb = 600029;
  public static final int eZc = 600030;
  public static final int eZd = 600036;
  public static final int eZe = 600037;
  public static final int eZf = 600038;
  public static final int eZg = 600039;
  public static final int eZh = 600040;
  public static final int eZi = 600043;
  public static final int eZj = 600044;
  public static final int eZk = 600045;
  public static final int eZl = 600046;
  public static final int eZm = 600053;
  public static final int eZn = 600054;
  public static final int eZo = 600057;
  public static final int eZp = 600058;
  public static final int eZq = 600059;
  public static final int eZr = 600060;
  public static final int eZs = 600062;
  public static final int eZt = 600063;
  public static final int eZu = 600064;
  public static final int eZv = 600065;
  public static final int eZw = 600066;
  public static final int eZx = 600067;
  public static final int eZy = 600068;
  public static final int eZz = 600069;
  public static final int eZA = 600070;
  public static final int eZB = 600071;
  public static final int eZC = 600072;
  public static final int eZD = 600074;
  public static final int eZE = 600075;
  public static final int eZF = 600077;
  public static final int eZG = 600078;
  public static final int eZH = 600082;
  public static final int eZI = 600083;
  public static final int eZJ = 600109;
  public static final int eZK = 600114;
  public static final int eZL = 600195;
  public static final int eZM = 600116;
  public static final int eZN = 600117;
  public static final int eZO = 600118;
  public static final int eZP = 600119;
  public static final int eZQ = 600120;
  public static final int eZR = 600121;
  public static final int eZS = 600122;
  public static final int eZT = 600123;
  public static final int eZU = 600124;
  public static final int eZV = 600125;
  public static final int eZW = 600126;
  public static final int eZX = 600127;
  public static final int eZY = 600128;
  public static final int eZZ = 600129;
  public static final int faa = 600130;
  public static final int fab = 600131;
  public static final int fac = 600132;
  public static final int fad = 600133;
  public static final int fae = 600134;
  public static final int faf = 600136;
  public static final int fag = 600137;
  public static final int fah = 600138;
  public static final int fai = 600139;
  public static final int faj = 600140;
  public static final int fak = 600141;
  public static final int fal = 600142;
  public static final int fam = 600143;
  public static final int fan = 600144;
  public static final int fao = 600145;
  public static final int fap = 600146;
  public static final int faq = 600147;
  public static final int far = 600148;
  public static final int fas = 600149;
  public static final int fat = 600152;
  public static final int fau = 600153;
  public static final int fav = 600154;
  public static final int faw = 600155;
  public static final int fax = 600156;
  public static final int fay = 600158;
  public static final int faz = 600182;
  public static final int faA = 600193;
  private static final boolean faB = false;
  private boolean faC = true;

  private final aRn faD = new aJf(this);

  private final bic faE = new asV(this);
  private cTL faF;
  private boolean faG;
  private final bhr faH = new bhr();
  private final bfz faI = new bfz();
  private final LT faJ = new LT();

  private static final aWc faK = new aWc();

  private bIu faL = new bIu();
  private boolean faM;
  private boolean faN;
  private boolean faO;
  private boolean Ur;
  private long faP = 200200L;
  private float faQ = 1.0F;
  private long faR = 200200L;
  private float faS = 1.0F;
  private long faT;
  private float faU;
  private short faV = -1;
  private boolean faW;
  private cbg faX;
  private cbg faY;
  private cbg faZ;
  private ZG fba;
  private cSR fbb;
  private cSR fbc;
  private Xg fbd;

  public static aWc blo()
  {
    return faK;
  }

  private aWc() {
    bAw.b(this);
  }

  private cbg a(byte paramByte, cbg paramcbg, float paramFloat, int paramInt)
  {
    float f = 1.0F;
    if (paramcbg != null) {
      f = cbg.a(paramcbg);
      dka.cSF().j(paramcbg);
    } else {
      switch (paramByte) {
      case 0:
        f = cpT.hZb.cpc().bfj();
        break;
      case 1:
        f = cpT.hZc.cpd().bfj();
        break;
      case 2:
        f = cpT.hZf.cpd().bfj();
      }

    }

    int i = 100;
    int j = paramInt / 100;

    cbg localcbg = new cbg(this, paramByte, f, paramFloat, j, null);
    dka.cSF().a(localcbg, 100L, j);

    return localcbg;
  }

  public void e(float paramFloat, int paramInt) {
    this.faX = a((byte)0, this.faX, paramFloat, paramInt);
  }

  public void f(float paramFloat, int paramInt) {
    this.faY = a((byte)1, this.faY, paramFloat, paramInt);
  }

  public void g(float paramFloat, int paramInt) {
    this.faZ = a((byte)2, this.faY, paramFloat, paramInt);
  }

  protected boolean blp()
  {
    dDE.dft().a(this);
    try
    {
      this.faG = bUD.getBoolean(ay.bd().getString("soundAmbianceEnable"));
      if (this.faG) {
        this.faH.load(ay.bd().getString("dynamicSoundAmbianceFile"));
        this.faH.c(new aJh(this));
      }

    }
    catch (bdh localbdh)
    {
      K.warn(localbdh.getMessage());
    }

    axg.aIP().a(new chM());

    if (this.faF != null) {
      this.faF.abp();
    }

    for (cpT localcpT : cpT.values()) {
      localcpT.blv();
    }

    cpT.hZb.cpc().aT(ay.bd().bn());
    b(cpT.hZb.cpc());

    cpT.hZb.cpe().aT(ay.bd().bn());
    b(cpT.hZb.cpe());

    cpT.hZc.cpc().aT(ay.bd().bj());
    b(cpT.hZc.cpc());

    cpT.hZc.cpd().aT(ay.bd().bj());
    b(cpT.hZc.cpd());

    cpT.hZc.cpe().aT(ay.bd().bj());
    b(cpT.hZc.cpe());

    cpT.hZd.cpe().aT(ay.bd().bk());
    b(cpT.hZd.cpe());

    cpT.hZf.cpd().aT(ay.bd().bm());
    b(cpT.hZf.cpd());

    cpT.hZh.cpd().aT(ay.bd().bi());
    b(cpT.hZh.cpd());
    cpT.hZh.cpe().aT(ay.bd().bi());
    b(cpT.hZh.cpe());

    cpT.hZe.cpd().aT(ay.bd().bl());
    b(cpT.hZe.cpd());
    cpT.hZe.cpe().aT(ay.bd().bl());
    b(cpT.hZe.cpe());

    cpT.hZg.cpd().aT(ay.bd().bo());
    b(cpT.hZg.cpd());
    cpT.hZg.cpe().aT(ay.bd().bo());
    b(cpT.hZg.cpe());

    cpT.hZj.cpd().aT(ay.bd().bg());
    b(cpT.hZj.cpd());
    cpT.hZj.cpe().aT(ay.bd().bg());
    b(cpT.hZj.cpe());

    cpT.hZi.cpd().aT(ay.bd().bh());
    b(cpT.hZi.cpd());
    cpT.hZi.cpe().aT(ay.bd().bh());
    b(cpT.hZi.cpe());

    cAZ.ish = ay.bd().bp();
    cAZ.isg = ay.bd().bq();

    SoundFunctionsLibrary.ckJ().a(this.faD);
    SoundFunctionsLibrary.ckJ().a(this.faI);
    SoundFunctionsLibrary.ckJ().a(this.faJ);

    return true;
  }

  public void ei(boolean paramBoolean)
  {
    cpT.hZc.cpd().dM(paramBoolean);
    cpT.hZc.cpe().dM(paramBoolean);
    cpT.hZd.cpe().dM(paramBoolean);
    cpT.hZg.cpd().dM(paramBoolean);
    cpT.hZg.cpe().dM(paramBoolean);
    cpT.hZh.cpd().dM(paramBoolean);
    cpT.hZh.cpe().dM(paramBoolean);
    cpT.hZj.cpd().dM(paramBoolean);
    cpT.hZj.cpe().dM(paramBoolean);
  }

  protected void U(long paramLong)
  {
    super.U(paramLong);
    this.faD.bbb();
    int i = WakfuClientInstance.awy().Dg().cKV().ye();
    if (this.kNN != i)
      zv(i);
  }

  protected void blq()
  {
    if (!isRunning()) {
      return;
    }

    c(cpT.hZb.cpc());
    c(cpT.hZb.cpe());
    c(cpT.hZc.cpc());
    c(cpT.hZc.cpd());
    c(cpT.hZc.cpe());
    c(cpT.hZe.cpd());
    c(cpT.hZe.cpe());
    c(cpT.hZd.cpe());
    c(cpT.hZf.cpd());
    c(cpT.hZh.cpd());
    c(cpT.hZh.cpe());
    c(cpT.hZg.cpd());
    c(cpT.hZg.cpe());
    c(cpT.hZj.cpd());
    c(cpT.hZj.cpe());
    c(cpT.hZi.cpd());
    c(cpT.hZi.cpe());

    SoundFunctionsLibrary.ckJ().a(this.faD);
    ayg.aJQ().c(this);
  }

  public void blr()
  {
    if (!isRunning())
      return;
    try
    {
      cpT.hZc.cpc().stop();
      cpT.hZc.cpd().stop();
      cpT.hZc.cpe().stop();
      cpT.hZd.cpe().stop();
      cpT.hZe.cpd().stop();
      cpT.hZe.cpe().stop();
      cpT.hZh.cpd().stop();
      cpT.hZh.cpe().stop();
      cpT.hZg.cpd().stop();
      cpT.hZg.cpe().stop();
      cpT.hZj.cpd().stop();
      cpT.hZj.cpe().stop();
      cpT.hZi.cpd().stop();
      cpT.hZi.cpe().stop();
    } catch (Exception localException) {
      K.error("Erreur lors de l'arrêt des sons du monde ", localException);
    }
  }

  private void bls()
  {
    if ((!this.faM) || (!this.faW) || (this.faN) || (this.faO)) {
      return;
    }

    this.faW = false;

    boolean bool = dDE.dft().bcG();

    cFX localcFX = dkx.cSX().eh(this.faV);
    if (localcFX == null) {
      blw();
      blx();
      return;
    }

    cQG localcQG = bool ? localcFX.cBm() : localcFX.cBn();
    if (localcQG == null)
      blw();
    else {
      b(localcQG.cHs(), localcQG.cHu() / 100.0F);
    }

    ArrayList localArrayList = bool ? localcFX.cBk() : localcFX.cBl();
    if (localArrayList == null) {
      blx();
    } else {
      ciB localciB = cpT.hZb.cpc();
      localciB.b(localArrayList, localcFX.cBr());
    }

    localcQG = localcFX.cBo();
    this.faP = (localcQG == null ? 200200L : localcQG.cHs());
    this.faQ = (localcQG == null ? 1.0F : localcQG.cHu() / 100.0F);

    localcQG = localcFX.cBp();
    this.faR = (localcQG == null ? this.faP : localcQG.cHs());
    this.faS = (localcQG == null ? this.faQ : localcQG.cHu() / 100.0F);
  }

  public void ej(boolean paramBoolean) {
    cpT.hZb.cpc().gY(paramBoolean);

    this.faW = true;
    bls();
  }

  public void blt()
  {
    for (Object localObject2 : cpT.values()) {
      localObject2.blt();
    }

    this.faM = true;

    ??? = cpT.hZb.cpc();
    ((ciB)???).fm(8000);
    ((ciB)???).vp(8000);

    if (this.faG)
      this.faH.play();
  }

  public void blu()
  {
    if (this.faG)
      this.faH.play();
  }

  public void blv()
  {
    for (Object localObject2 : cpT.values()) {
      localObject2.blv();
    }

    this.faM = false;

    ??? = cpT.hZb.cpc();
    ((ciB)???).fm(1000);
    ((ciB)???).vp(1000);
    this.faV = -1;
    this.faW = false;
    this.faN = false;
    this.faO = false;
    this.Ur = false;
    if (this.faG) {
      this.faH.stop();
    }

    ZG localZG = eN(200000L);
    if (localZG == null)
      blx();
  }

  public void aH(boolean paramBoolean)
  {
    this.faW = true;
    bls();
  }

  public void bt(short paramShort) {
    e(paramShort, false);
  }

  public void e(short paramShort, boolean paramBoolean) {
    if ((paramShort == this.faV) && (!paramBoolean)) {
      return;
    }

    this.faV = paramShort;
    this.faW = true;

    bls();
  }

  public void ek(boolean paramBoolean) {
    cpT.hZb.cpc().gZ(paramBoolean);
  }

  public void b(long paramLong, float paramFloat)
  {
    a(paramLong, paramFloat, true);
  }

  private void a(long paramLong, float paramFloat, boolean paramBoolean) {
    if (!isRunning()) {
      return;
    }
    if (paramLong == 0L) {
      return;
    }

    ciB localciB = cpT.hZc.cpc();

    if (paramBoolean) {
      this.faT = paramLong;
      this.faU = paramFloat;
    }

    if (!this.faN)
      localciB.g(paramLong, paramFloat);
  }

  public void blw()
  {
    if (!isRunning()) {
      return;
    }

    ciB localciB = cpT.hZc.cpc();
    localciB.cb(8000.0F);
  }

  public ZG eN(long paramLong)
  {
    return c(paramLong, 1.0F);
  }

  public ZG c(long paramLong, float paramFloat)
  {
    if ((!this.faN) && (paramLong != 0L)) {
      return cpT.hZb.cpc().g(paramLong, paramFloat);
    }

    return null;
  }

  private void blx()
  {
    if (!isRunning()) {
      return;
    }

    ciB localciB = cpT.hZb.cpc();
    if (localciB.ckl() != qx.aXH) {
      localciB.S(null);
    }

    if (!this.faN)
      try {
        localciB.ckm();
      } catch (Exception localException) {
        K.warn("Problème à l'arrêt du groupe de musique.");
      }
  }

  public void a(long paramLong, boolean paramBoolean, int paramInt)
  {
    if (!isRunning()) {
      return;
    }
    if (paramInt == -1)
      g(paramLong, paramBoolean);
    else
      dka.cSF().a(new csh(this, paramLong, paramBoolean), paramInt, 1);
  }

  public ZG eO(long paramLong)
  {
    if (!isRunning()) {
      return null;
    }
    return g(paramLong, false);
  }

  public ZG g(long paramLong, boolean paramBoolean)
  {
    return a(cpT.hZf.cpd(), paramLong, paramBoolean);
  }

  public ZG a(long paramLong, float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    ciB localciB = cpT.hZb.cpc();
    float f = localciB.bfk();
    localciB.q(f * paramFloat, paramInt1);
    dka.cSF().a(new aJg(this, localciB, f, paramInt2), paramInt3, 1);

    return eO(paramLong);
  }

  public void b(long paramLong, float paramFloat, int paramInt1, int paramInt2, int paramInt3) {
    ciB localciB = cpT.hZb.cpc();
    float f = localciB.bfk();
    localciB.q(f * paramFloat, paramInt1);
    dka.cSF().a(new aJj(this, localciB, f, paramInt2), paramInt3, 1);

    a(paramLong, false, paramInt1);
  }

  public ZG eP(long paramLong)
  {
    return h(paramLong, false);
  }

  public ZG h(long paramLong, boolean paramBoolean)
  {
    return a(cpT.hZh.cpd(), paramLong, paramBoolean);
  }

  private ZG a(aOv paramaOv, long paramLong, boolean paramBoolean)
  {
    if (!isRunning()) {
      return null;
    }

    return paramaOv.a(paramLong, true, true, paramBoolean, -1L);
  }

  public void bly() {
    if (!isRunning())
      return;
    try
    {
      cpT.hZf.cpd().stop();
    } catch (Exception localException) {
      K.warn("Problème lors de l'arrêt des sons de l'interface : " + localException.getMessage());
    }
  }

  public void reset()
  {
    this.faO = false;
    this.Ur = false;

    if (this.faN)
    {
      this.faN = false;

      localciB = cpT.hZc.cpc();
      localciB.vp(4000);

      cpT.hZd.cpe().setMute(WakfuClientInstance.awy().awB().a(yR.bsF));
    }

    ciB localciB = cpT.hZb.cpc();
    localciB.fm(8000);
    localciB.vp(8000);
  }

  public boolean blz() {
    return this.faC;
  }

  public void el(boolean paramBoolean) {
    this.faC = paramBoolean;
  }

  public bic blA()
  {
    return this.faE;
  }

  public void oc(int paramInt) {
    if (!isRunning()) {
      return;
    }
    if (this.fba == null)
      this.fba = g(paramInt, true);
  }

  public void blB()
  {
    oc(600001);
  }

  public void stopLoading() {
    if (!isRunning()) {
      return;
    }
    if (this.fba != null) {
      this.fba.an(0.01F);
      this.fba = null;
    }
  }

  public void WS() {
    if (!isRunning()) {
      return;
    }
    eO(600011L);
  }

  public void blC() {
    if (!isRunning()) {
      return;
    }
    ZG localZG = eO(600012L);
    if (localZG != null) {
      float f = localZG.alh();
      localZG.ae(f * 0.5F);
    }
  }

  public void blD() {
    if (!isRunning()) {
      return;
    }
    ZG localZG = eO(600013L);
    if (localZG != null) {
      float f = localZG.alh();
      localZG.ae(f * 0.5F);
    }
  }

  public void b(azO paramazO) {
    if ((!isRunning()) || (!this.faC)) {
      return;
    }
    switch (aJk.ejA[paramazO.ordinal()]) {
    case 1:
      eO(600037L);
      break;
    case 2:
    case 3:
      eO(600038L);
      break;
    case 4:
      eO(600036L);
      break;
    case 5:
      eO(600028L);
      break;
    case 6:
      eO(600029L);
      break;
    default:
      eO(600030L);
    }
    blG();
  }

  public void blE() {
    if ((!isRunning()) || (!this.faC)) {
      return;
    }
    eO(600043L);
    blG();
  }

  public void blF() {
    if ((!isRunning()) || (!this.faC)) {
      return;
    }
    eO(600040L);
    blG();
  }

  private void blG() {
    this.faC = false;
    dka.cSF().a(new aJi(this), 1000L, 1);
  }

  public void blH()
  {
    ek(acn.aoA().aoE() < 0.0F);
  }

  public synchronized void em(boolean paramBoolean) {
    this.faO = true;
    this.Ur = paramBoolean;

    K.info("startChallenge chaos=" + paramBoolean);

    if (this.faN) {
      return;
    }

    ciB localciB = cpT.hZb.cpc();
    localciB.vp(1000);
    localciB.fm(1000);
    localciB.ha(true);
    if (!this.Ur)
      localciB.g(290997L, 0.5F);
  }

  public synchronized void blI()
  {
    this.faO = false;
    this.Ur = false;

    K.info("stopChallenge");

    if (!this.faN) {
      ciB localciB = cpT.hZb.cpc();
      localciB.vp(2000);
      localciB.fm(1000);
      localciB.ha(false);
      localciB.fm(8000);
      localciB.vp(8000);

      bls();
    }
  }

  public void blJ() {
    if (!isRunning()) {
      return;
    }

    eO(600067L);
  }

  public synchronized void g(arl paramarl) {
    if (!isRunning()) {
      return;
    }

    this.faN = true;

    if (this.faG) {
      this.faH.stop();
    }

    cpT.hZd.cpe().setMute(true);
    cpT.hZb.cpe().setMute(true);

    long l = this.faP;

    Iterator localIterator = paramarl.bgG().iterator();
    while (localIterator.hasNext()) {
      localObject = (Su)localIterator.next();
      if ((localObject instanceof byo)) {
        byo localbyo = (byo)localObject;
        if (localbyo.FB() != null) {
          l = this.faR;
          break;
        }if (((Su)localObject).i(dKm.lXn)) {
          l = this.faR;
          break;
        }

      }

    }

    Object localObject = cpT.hZb.cpc();
    ((ciB)localObject).vp(1500);
    ((ciB)localObject).fm(1000);

    if (!this.faO) {
      ((ciB)localObject).ha(true);
    }

    if (l != 0L)
      ((ciB)localObject).g(l, 0.4F * this.faQ);
  }

  public void blK()
  {
    if (!isRunning()) {
      return;
    }
    ciB localciB = cpT.hZb.cpc();
    ZG localZG = localciB.ckk();
    if (localZG != null)
      localZG.q(this.faQ, 1000.0F);
  }

  public void en(boolean paramBoolean)
  {
    if (!isRunning()) {
      return;
    }

    if (!this.faN) {
      return;
    }

    ciB localciB = cpT.hZb.cpc();
    localciB.fm(1000);
    localciB.vp(1000);
    if (paramBoolean)
      localciB.g(290998L, 1.0F);
    else
      localciB.g(290999L, 1.0F);
  }

  public synchronized void blL()
  {
    if (!isRunning()) {
      return;
    }

    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    int i = localbyz.bGv() != null ? 1 : 0;
    if (i != 0)
    {
      return;
    }

    ciB localciB1 = cpT.hZc.cpc();
    localciB1.vp(4000);
    b(this.faT, this.faU);

    cpT.hZd.cpe().setMute(WakfuClientInstance.awy().awB().a(yR.bsF));
    cpT.hZb.cpe().setMute(WakfuClientInstance.awy().awB().a(yR.bsE));

    ciB localciB2 = cpT.hZb.cpc();
    if (!this.faO) {
      localciB2.ha(false);
      localciB2.fm(8000);
      localciB2.vp(8000);
    } else if (this.Ur) {
      localciB2.ckm();
    } else {
      localciB2.g(290997L, 0.4F);
    }

    this.faN = false;
    bls();

    if (this.faG) {
      this.faH.play();
      anK.drx.aAh();
      cOr.cGn();
    }
  }

  public final void blM()
  {
    kk localkk = cpT.hZd.cpe();
    localkk.z(false);
  }

  public final void blN()
  {
    kk localkk = cpT.hZd.cpe();
    localkk.z(true);
  }

  public final void a(dMM paramdMM, cfb paramcfb1, cfb paramcfb2) {
    if (!isRunning());
  }

  public void ho(String paramString)
  {
    this.faF = Pp.de(paramString);
  }

  public void aY(float paramFloat)
  {
    if (!isRunning()) {
      return;
    }
    a(cpT.hZb.cpc(), paramFloat);
    a(cpT.hZb.cpe(), paramFloat);
  }

  private void a(aOv paramaOv, float paramFloat) {
    paramaOv.ag(paramFloat);
    paramaOv.ae(paramFloat);
  }

  public float blO() {
    return cpT.hZb.cpc().alj();
  }

  public void eo(boolean paramBoolean) {
    if (!isRunning()) {
      return;
    }
    cpT.hZb.cpc().setMute(paramBoolean);
    cpT.hZb.cpe().setMute(paramBoolean);
  }

  public boolean blP() {
    return cpT.hZb.cpc().bfl();
  }

  public void aZ(float paramFloat) {
    if (!isRunning()) {
      return;
    }
    a(cpT.hZf.cpd(), paramFloat);
  }

  public void ba(float paramFloat) {
    if (!isRunning()) {
      return;
    }
    a(cpT.hZc.cpc(), paramFloat);
    a(cpT.hZc.cpd(), paramFloat);
    a(cpT.hZc.cpe(), paramFloat);
    a(cpT.hZd.cpe(), paramFloat);
    a(cpT.hZe.cpd(), paramFloat);
    a(cpT.hZe.cpe(), paramFloat);
    a(cpT.hZh.cpd(), paramFloat);
    a(cpT.hZh.cpe(), paramFloat);
    a(cpT.hZg.cpd(), paramFloat);
    a(cpT.hZg.cpe(), paramFloat);
    a(cpT.hZj.cpd(), paramFloat);
    a(cpT.hZj.cpe(), paramFloat);
    a(cpT.hZi.cpd(), paramFloat);
    a(cpT.hZi.cpe(), paramFloat);
  }

  public float blQ() {
    return cpT.hZc.cpd().alj();
  }

  public void ep(boolean paramBoolean) {
    if (!isRunning()) {
      return;
    }
    cpT.hZf.cpd().setMute(paramBoolean);
  }

  public boolean blR() {
    return cpT.hZf.cpd().bfl();
  }

  public void eq(boolean paramBoolean) {
    if (!isRunning()) {
      return;
    }
    cpT.hZc.cpc().setMute(paramBoolean);
    cpT.hZc.cpd().setMute(paramBoolean);
    cpT.hZc.cpe().setMute(paramBoolean);
    cpT.hZe.cpd().setMute(paramBoolean);
    cpT.hZe.cpe().setMute(paramBoolean);
    cpT.hZd.cpe().setMute(paramBoolean);
    cpT.hZh.cpd().setMute(paramBoolean);
    cpT.hZh.cpe().setMute(paramBoolean);
    cpT.hZg.cpd().setMute(paramBoolean);
    cpT.hZg.cpe().setMute(paramBoolean);
    cpT.hZj.cpd().setMute(paramBoolean);
    cpT.hZj.cpe().setMute(paramBoolean);
    cpT.hZi.cpd().setMute(paramBoolean);
    cpT.hZi.cpe().setMute(paramBoolean);
  }

  public boolean blS() {
    return cpT.hZc.cpc().bfl();
  }

  public caQ a(bgG parambgG, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!isRunning()) {
      return null;
    }
    if (parambgG == null) {
      return null;
    }

    long l = beq.fq(parambgG.btf());
    cpT localcpT = cpT.hF(l);
    if ((localcpT == null) || (localcpT.cpe() == null)) {
      localcpT = cpT.hZd;
    }

    kk localkk = localcpT.cpe();
    if (!localkk.bfm()) {
      return null;
    }
    blq localblq;
    try
    {
      localblq = localkk.bfh().gL(parambgG.btf());
    } catch (IOException localIOException) {
      K.debug("Impossible de charger le son d'id " + parambgG.btf());
      return null;
    }

    if (localblq == null) {
      K.debug("Impossible de charger le son d'id " + parambgG.btf());
      return null;
    }
    caQ localcaQ;
    try
    {
      int i = WakfuClientInstance.awy().Dg().Y(paramInt1, paramInt2, paramInt3);
      localcaQ = localkk.a(localblq, parambgG.alj(), new aAv(paramInt1, paramInt2, paramInt3, false, i), parambgG.btj(), parambgG.btg(), parambgG.bti(), parambgG.btk(), parambgG.bth(), true, false, false, 200.0F, -1L);
    } catch (Exception localException) {
      K.debug("Exception levée lors de la création d'une source positionnée", localException);
      return null;
    }
    return localcaQ;
  }

  public void a(dNN paramdNN)
  {
    if (paramdNN == null) {
      K.warn("setListener(null), ne devrait pas arriver");
    }

    if (!isRunning()) {
      return;
    }

    super.a(paramdNN);
    cpT.hZb.cpe().a(paramdNN);
    cpT.hZc.cpe().a(paramdNN);
    cpT.hZd.cpe().a(paramdNN);
    cpT.hZe.cpe().a(paramdNN);
    cpT.hZh.cpe().a(paramdNN);
    cpT.hZg.cpe().a(paramdNN);
    cpT.hZi.cpe().a(paramdNN);
    cpT.hZj.cpe().a(paramdNN);

    cpT.hZc.cpd().a(paramdNN);
    cpT.hZe.cpd().a(paramdNN);
    cpT.hZh.cpd().a(paramdNN);
    cpT.hZg.cpd().a(paramdNN);
    cpT.hZi.cpd().a(paramdNN);
    cpT.hZj.cpd().a(paramdNN);
  }

  public void hp(String paramString)
  {
    if (!isRunning()) {
      return;
    }

    bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();
    K localK = localbwZ.jh("reverbs");
    this.fbb = aEp.r(localK);
  }

  protected aEp od(int paramInt)
  {
    return (aEp)this.fbb.get(paramInt);
  }

  protected void oe(int paramInt)
  {
    cpT.hZb.cpe().bk(paramInt);
    cpT.hZc.cpd().bk(paramInt);
    cpT.hZc.cpe().bk(paramInt);
    cpT.hZd.cpe().bk(paramInt);
    cpT.hZe.cpd().bk(paramInt);
    cpT.hZe.cpe().bk(paramInt);
    cpT.hZg.cpd().bk(paramInt);
    cpT.hZg.cpe().bk(paramInt);
    cpT.hZh.cpd().bk(paramInt);
    cpT.hZj.cpd().bk(paramInt);
    cpT.hZj.cpe().bk(paramInt);
  }

  public void hq(String paramString)
  {
    if (!isRunning()) {
      return;
    }

    bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();
    K localK = localbwZ.jh("lowpasses");
    this.fbc = ajR.r(localK);

    rR(0);
  }

  protected ajR of(int paramInt)
  {
    if ((this.fbc == null) || (this.fbc.size() == 0)) {
      return ajR.djz;
    }
    return (ajR)this.fbc.get(paramInt);
  }

  public void blT()
  {
    try
    {
      String str = ay.bd().getString("rollOffPresetFile");
      blo().hr(str);
    } catch (Exception localException) {
      K.error("impossible d'initialiser WakfuSoundManager.ROLLOFF_PRESET_FILE", localException);
    }
  }

  public void hr(String paramString) {
    if (!isRunning()) {
      return;
    }

    bpA localbpA = new bpA();
    bwZ localbwZ = new bwZ();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();
    K localK = localbwZ.jh("rollOffs");
    this.fbd = dCo.K(localK);
  }

  public dCo og(int paramInt)
  {
    if ((this.fbd == null) || (this.fbd.size() == 0)) {
      return dCo.lKF;
    }

    dCo localdCo = (dCo)this.fbd.get(paramInt);

    if (localdCo != null) {
      return localdCo;
    }

    return (dCo)this.fbd.hc(0);
  }

  public void hs(String paramString) {
    if (!isRunning()) {
      return;
    }

    this.faI.cG(paramString);
  }

  public void blU() {
    if (!isRunning()) {
      return;
    }

    this.faI.reload();
  }

  public void ht(String paramString) {
    if (!isRunning()) {
      return;
    }

    this.faJ.cG(paramString);
  }

  public void blV() {
    if (!isRunning()) {
      return;
    }

    this.faJ.reload();
  }

  public void b(rP paramrP) {
    if ((this.faG) && (!this.faN))
      this.faH.b(paramrP);
  }

  public void a(long paramLong, wK paramwK, cbI paramcbI)
  {
    if ((this.faG) && (!this.faN))
      this.faH.a(paramLong, paramcbI, paramwK);
  }

  public void eQ(long paramLong)
  {
    this.faH.eQ(paramLong);
  }

  protected boolean blW()
  {
    return true;
  }

  public void a(pz parampz) {
    this.faH.c(parampz);
  }

  public void b(pz parampz) {
    this.faH.d(parampz);
  }

  public bhr blX() {
    return this.faH;
  }
}