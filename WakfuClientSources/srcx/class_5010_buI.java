import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class buI
  implements Dc, cvW
{
  protected static final Logger K = Logger.getLogger(buI.class);

  private static final buI geh = new buI();
  private cag baa;
  private dRq gei;
  private ArrayList bab;
  private final LinkedList gej;
  private static final int gek = 2500;
  private cbs gel;
  private boolean gem;
  private boolean gen;
  private boolean geo;
  private yP gep;
  private Runnable geq;
  private int ger;
  private aRp ges;
  private ZG cQB;
  private boolean get;
  private int geu;
  private bnm N;

  public buI()
  {
    this.gej = new LinkedList();

    this.ger = -1;

    this.geu = -1;
  }

  public static buI bCs()
  {
    return geh;
  }

  public boolean a(cWG paramcWG)
  {
    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.gel == null) {
        K.error("Impossible de charger l'affichage du donjon arcade, il manque les données !");
        return;
      }

      byz localbyz = byv.bFN().bFO();
      arl localarl = localbyz.aeQ();
      if (localarl == null) {
        localbyz.fB(true);
        return;
      }

      h(localarl);
    }
  }

  public void h(arl paramarl) {
    byv.bFN().bFO().fB(false);

    paramarl.a(this);

    this.N = new dBc(this);

    cBQ.cxL().a(this.N);

    dLE.doY().t("arcadeDungeon", this.gel);

    cBQ.cxL().a("arcadeDungeonDialog", VV.dJ("arcadeDungeonDialog"), 8192L, (short)10000);

    cBQ.cxL().j("wakfu.arcadeDungeon", dSq.class);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.geu = -1;
      this.gep = null;
      this.gem = false;
      this.gen = false;
      this.geo = false;

      if (this.cQB != null) {
        this.cQB.bH(true);
        this.cQB.q(0.0F, 100.0F);
        this.cQB = null;
      }

      dka.cSF().j(this.geq);

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("arcadeDungeon");

      cBQ.cxL().mW("arcadeDungeonDialog");

      cBQ.cxL().mN("wakfu.arcadeDungeon");
    }
  }

  public void qY(int paramInt) {
    this.geu = byv.bFN().bFO().nU();
    this.gel = new cbs(aqx.dyc.jy(paramInt));
    this.gel.cfb();
    this.ges = new aRp(this);
    byv.bFN().a(geh);
  }

  public void iR(String paramString) {
    if (dLE.doY().rv("splashText") != null) {
      this.gej.addLast(paramString);
    } else {
      dLE.doY().t("splashText", paramString);
      if ((!cBQ.cxL().mZ("splashMessageDialog")) || (this.gei == null)) {
        this.gei = ((dRq)cBQ.cxL().a("splashMessageDialog", VV.dJ("splashMessageDialog"), 8210L, (short)10000));
      }

      if (this.gei != null) {
        if (this.baa != null) {
          this.gei.getAppearance().c(this.baa);
        }

        this.baa = new cag();
        this.baa.aJ();
        this.baa.setFile("6001037.xps");
        this.baa.setAlignment(aFG.eck);
        this.gei.getAppearance().a(this.baa);
      }
      fr(true);
    }
  }

  private void bCt() {
    this.bab = new ArrayList();
    cpa localcpa = this.gei.getElementMap();
    this.bab.add(((dOc)localcpa.fi("mainContainer")).getAppearance());
    this.bab.add(((dOc)localcpa.fi("text")).getAppearance());
  }

  private void fq(boolean paramBoolean) {
    cpa localcpa = this.gei.getElementMap();
    ((dOc)localcpa.fi("mainContainer")).setNonBlocking(paramBoolean);
  }

  public void fr(boolean paramBoolean) {
    if (this.gei == null) {
      K.warn("on tente de fade un splashScreen alors qu'il n'est pas chargé");
      return;
    }

    if (this.bab == null)
      bCt();
    fq(!paramBoolean);
    cpa localcpa = this.gei.getElementMap();
    aNL localaNL = localcpa.fi("mainContainer");

    dKW localdKW = (dKW)this.bab.get(0);
    int i;
    int j;
    if (paramBoolean) {
      i = bNa.gRu.get();
      j = bNa.gRx.get();
    } else {
      i = bNa.gRx.get();
      j = bNa.gRu.get();
    }

    if (i != j) {
      if (paramBoolean)
        aWc.blo().blC();
      else {
        aWc.blo().blD();
      }

      bNa localbNa1 = new bNa(i);
      bNa localbNa2 = new bNa(j);

      String str = (String)dLE.doY().rv("splashText");

      localaNL.J(aga.class);
      aga localaga = new aga(localbNa1, localbNa2, this.bab, 0, 500, 1, ddp.kWG);
      localaga.a(new dBb(this, paramBoolean, str));

      localaNL.a(localaga);
    }
  }

  public cbs bCu() {
    return this.gel;
  }

  public void bCv()
  {
    if (this.ges != null)
      this.ges.bhH();
    if (cBQ.cxL().mZ("arcadeDungeonResultDialog"))
      return;
    bpn localbpn = (bpn)cBQ.cxL().a("arcadeDungeonResultDialog", VV.dJ("arcadeDungeonResultDialog"), 257L, (short)10000);

    localbpn.a(new dAY(this, localbpn));

    byv.bFN().bFO().aeQ().b(this);

    aWc.blo().eO(600137L);
  }

  public void bCw() {
    if (this.gep == yP.bsu)
      return;
    this.gep = yP.bsu;
    cpa localcpa = cBQ.cxL().coO().nf("arcadeDungeonResultDialog");
    if (localcpa == null) {
      return;
    }

    cWk localcWk1 = (cWk)localcpa.fi("monsterCount");
    int i = this.gel.cfk();
    dka.cSF().a(new dAX(this, localcWk1), 50L, i + 1);

    cWk localcWk2 = (cWk)localcpa.fi("eventCount");
    int j = this.gel.cfm();
    dka.cSF().a(new dBk(this, localcWk2), 50L, j + 1);

    cWk localcWk3 = (cWk)localcpa.fi("challengeCount");
    int k = this.gel.cfj();
    dka.cSF().a(new dBi(this, localcWk3), 50L, k + 1);

    bsK localbsK1 = (bsK)localcpa.fi("monsterScore");
    localbsK1.setNumber(this.gel.cfl());
    localbsK1.a(new dBe(this, localbsK1));

    bsK localbsK2 = (bsK)localcpa.fi("eventScore");
    localbsK2.setNumber(this.gel.cfn());
    localbsK2.a(new dBd(this, localbsK2));

    bsK localbsK3 = (bsK)localcpa.fi("challengeScore");
    localbsK3.setNumber(this.gel.cfi());
    localbsK3.a(new dBm(this, localbsK3));

    this.cQB = aWc.blo().g(600146L, true);
    if (this.cQB != null) {
      this.cQB.ae(0.0F);
      this.cQB.q(1.0F, 100.0F);
    }
  }

  private void bCx() {
    if (this.gep == yP.bsv)
      return;
    this.gep = yP.bsv;

    cpa localcpa = cBQ.cxL().coO().nf("arcadeDungeonResultDialog");
    if (localcpa == null) {
      return;
    }
    bsK localbsK = (bsK)localcpa.fi("finalScore");
    ccG localccG = (ccG)localcpa.fi("rewardsList");

    localbsK.setNumber(this.gel.cfp());
    localbsK.a(new bAl(this, localbsK));

    int i = this.gel.cfe();

    if (i > 0) {
      this.geq = new bAk(this, localccG);

      dka.cSF().a(this.geq, localbsK.getTotalDuration() / i, i);
    }
  }

  private void d(czv paramczv)
  {
    bNa localbNa1 = bNa.gRx;

    bNa localbNa2 = bNa.gRu;

    gm localgm = new gm(localbNa1, localbNa2, paramczv, 0, 500, 4, ddp.kWG);
    localgm.a(new bAi(this, paramczv, localgm));

    paramczv.a(localgm);
  }

  private void bCy() {
    if (this.gep == yP.bsw)
      return;
    this.gep = yP.bsw;

    cpa localcpa = cBQ.cxL().coO().nf("arcadeDungeonResultDialog");
    if (localcpa == null)
      return;
    dOc localdOc = (dOc)localcpa.fi("containerStamp");
    int i = 600131;

    String str = null;
    switch (bAh.goS[this.gel.cfr().ordinal()]) {
    case 1:
      str = "6001046.xps";
      i = 600130;
      break;
    case 2:
      str = "6001047.xps";
      i = 600130;
      break;
    case 3:
      str = "6001048.xps";
      i = 600131;
      break;
    case 4:
      str = "6001049.xps";
      i = 600131;
      break;
    case 5:
    }

    if (str == null) {
      return;
    }
    aWc.blo().eO(i);

    cag localcag = new cag();
    localcag.aJ();
    localcag.setFile(str);
    localcag.setAlignment(aFG.eck);
    localdOc.getAppearance().a(localcag);
  }

  public void bCz() {
    this.ger = -1;
    this.get = false;
    this.gel.bCz();
    if (this.gel.cff() == 1)
      aWc.blo().eO(600136L);
    else
      aWc.blo().eO(600147L);
    geh.iR(bU.fH().getString("arcadeDungeon.round", new Object[] { Integer.valueOf(this.gel.cff()) }));
  }

  public void bCA() {
    this.gel.bCA();
    String str1 = bU.fH().getString("notification.arcadeDungeonWaveTitle");
    lZ locallZ = new lZ();
    locallZ.a(bU.fH().getString("notification.arcadeDungeonWaveText", new Object[] { Short.valueOf(this.gel.cfq()) }));
    if ((this.ger == -1) && (this.get)) {
      this.ger = 6;
    }
    if (this.ger != -1) {
      this.ger -= 1;
      locallZ.tH();
      String str2 = bU.fH().getString("notification.arcadeDungeonRemainingTurnText", new Object[] { Integer.valueOf(this.ger) });
      locallZ.tI().tz().am(bNa.gRz.bUW()).a(str2).tA().tJ();
    }

    cjO.clE().j(new az(str1, locallZ.tP(), ana.dqk));
  }

  private boolean bCB() {
    return (this.gem) && (this.gen) && (this.geo);
  }

  public void qZ(int paramInt) {
    int i = this.gel.cfo();
    int j = Math.round(i * 0.2F);
    this.gel.uA(j);
    rd(j);
    String str1 = bU.fH().getString("notification.arcadeDungeonEventSucceededTitle");
    String str2 = bU.fH().getString("notification.arcadeDungeonEventSucceededText", new Object[] { aqx.dyc.jz(paramInt), Integer.valueOf(j) });
    cjO.clE().j(new az(str1, str2, ana.dqk));

    c(byv.bFN().bFO(), j);
  }

  public void ra(int paramInt) {
    aZM localaZM = this.gel.uy(paramInt);
    localaZM.ew(false);
    localaZM.bz(true);
    String str1 = bU.fH().getString("notification.arcadeDungeonChallengeFailedTitle");
    String str2 = bU.fH().getString("notification.arcadeDungeonChallengeFailedText", new Object[] { localaZM.getName() });
    cjO.clE().j(new az(str1, str2, ana.dqk));

    aEe localaEe = new aEe(str2);
    localaEe.mm(4);
    CM.LV().a(localaEe);
  }

  public void rb(int paramInt) {
    aZM localaZM = this.gel.uy(paramInt);
    localaZM.ew(true);
    localaZM.bz(true);
    int i = localaZM.Dz();
    this.gel.uB(i);
    rd(i);
    String str1 = bU.fH().getString("notification.arcadeDungeonChallengeSucceededTitle");
    String str2 = bU.fH().getString("notification.arcadeDungeonChallengeSucceededText", new Object[] { Integer.valueOf(i), localaZM.getName(), localaZM.getDescription() });
    cjO.clE().j(new az(str1, str2, ana.dqk));

    aEe localaEe = new aEe(str2);
    localaEe.mm(4);
    CM.LV().a(localaEe);

    c(byv.bFN().bFO(), i);
  }

  public void rc(int paramInt) {
    aZM localaZM = this.gel.uy(paramInt);
    localaZM.bz(false);
  }

  public void Mg()
  {
    aWc.blo().eO(600134L);
  }

  public void Mh()
  {
  }

  public void Mi() {
  }

  public void Mj() {
    bCv();
  }

  public void Mk()
  {
  }

  public void Ml()
  {
  }

  public void e(dhJ paramdhJ)
  {
  }

  public void f(dhJ paramdhJ)
  {
  }

  public void g(dhJ paramdhJ) {
    if ((paramdhJ instanceof byo)) {
      byo localbyo = (byo)paramdhJ;
      if (localbyo.i(dKm.lXn)) {
        geh.iR(bU.fH().getString("arcadeDungeon.boss", new Object[] { localbyo.getName() }));
        aWc.blo().eO(600136L);
        this.get = true;
      }
    }
  }

  public void h(dhJ paramdhJ) {
    if ((paramdhJ instanceof byo)) {
      arl localarl = byv.bFN().bFO().aeQ();
      if ((localarl == null) || (localarl.aDy())) {
        return;
      }
      byo localbyo = (byo)paramdhJ;
      if (!localbyo.c(dKm.lXs)) {
        return;
      }
      int i = localbyo.bFG();
      this.gel.uz(i);
      rd(i);

      c(paramdhJ, i);
    }
  }

  private void c(dhJ paramdhJ, int paramInt) {
    NP localNP = new NP(0, 20);

    dfj localdfj = new dfj(adF.c("WCI", 5, 20), "+" + paramInt, localNP, 3000);
    localdfj.setColor(bNa.gRJ.QC(), bNa.gRJ.QD(), bNa.gRJ.QE(), bNa.gRJ.getAlpha());

    localdfj.a(paramdhJ);

    HashSet localHashSet = dbI.cNt().b(paramdhJ);

    if (localHashSet != null)
      localdfj.pu(localHashSet.size() * 600);
    dbI.cNt().a(localdfj);
  }

  public void i(dhJ paramdhJ)
  {
  }

  public void j(dhJ paramdhJ) {
  }

  public void a(dhJ paramdhJ, bzj parambzj) {
  }

  public void a(aAn paramaAn) {
  }

  public void k(dhJ paramdhJ) {
    if ((paramdhJ instanceof byz))
      bCv();
  }

  private void rd(int paramInt)
  {
    if (paramInt < 1)
      return;
    int i = this.gel.ab();
    if (this.ges == null) {
      this.ges = new aRp(this);
    }
    if (this.ges.azx())
      this.ges.bO(i, paramInt);
    else {
      this.ges.nK(paramInt);
    }
    dka.cSF().a(this.ges, Math.max(25, 75 - Math.max(1, this.ges.bhI()) * 25));
  }

  public int bCC()
  {
    return this.geu;
  }
}