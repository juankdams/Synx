import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class byz extends bKm
  implements aHi, aVF, ajF, avm, awN, bEg, bbk, bcG, bxz, bzI, caY, dIX, dcw, djv, dkl, duL
{
  protected static final ddt ehE = new ddt();
  public static final String gkH = "shortcutBarManager";
  public static final String gkI = "bags";
  public static final String fln = "equipment";
  public static final String gkJ = "equipmentBonus";
  public static final String gkK = "selectedItemInventoryDescription";
  public static final String fMq = "headEquipment";
  public static final String fMr = "hairEquipment";
  public static final String fMs = "faceEquipment";
  public static final String fMt = "shoulderEquipment";
  public static final String fMu = "neckEquipment";
  public static final String fMv = "chestEquipment";
  public static final String fMw = "armsEquipment";
  public static final String fMx = "leftHandEquipment";
  public static final String fMy = "rightHandEquipment";
  public static final String fMz = "beltEquipment";
  public static final String fMA = "skirtEquipment";
  public static final String fMB = "trousersEquipment";
  public static final String fMC = "legsEquipment";
  public static final String fMD = "petEquipment";
  public static final String fME = "costumeEquipment";
  public static final String fMF = "backEquipment";
  public static final String fMG = "wingEquipment";
  public static final String fMH = "firstWeaponEquipment";
  public static final String fMI = "secondWeaponEquipment";
  public static final String fMJ = "accessoryEquipment";
  public static final String gkL = "weaponSkills";
  public static final String gkM = "craft";
  public static final String gkN = "kamas";
  public static final String gkO = "formatedKamas";
  public static final String gkP = "tokens";
  public static final String gkQ = "temporaryTransferInventory";
  public static final String gkR = "availableTitles";
  public static final String dwH = "currentLevelPercentage";
  public static final String eia = "xpRatio";
  public static final String gkS = "aptitudes";
  public static final String gkT = "commonAptitudes";
  public static final String gkU = "breedAptitudes";
  public static final String gkV = "availableCommonPoints";
  public static final String gkW = "availableAptitudePoints";
  public static final String gkX = "aptitudeMenuText";
  public static final String gkY = "wakfuGauge";
  public static final String gkZ = "wakfuGaugePopupText";
  public static final String gla = "wakfuGaugeIconStyle";
  public static final String glb = "wakfuGaugeColor";
  public static final String gjB = "nation";
  public static final String glc = "characterIconUrl";
  public static final String gld = "isInSubscriberZone";
  public static final String gle = "canLockSpell";
  public static final String glf = "hasMissingSpellXp";
  public static final String glg = "lockedSpell";
  static final String[] bwe = { "shortcutBarManager", "bags", "equipment", "equipmentBonus", "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "costumeEquipment", "weaponSkills", "kamas", "formatedKamas", "tokens", "temporaryTransferInventory", "availableTitles", "currentLevelPercentage", "xpRatio", "wakfuGauge", "wakfuGaugePopupText", "wakfuGaugeIconStyle", "isInSubscriberZone", "canLockSpell", "lockedSpell", "hasMissingSpellXp" };

  static final String[] bwd = new String[bwe.length + bKm.aOb.length];

  private static final String[] glh = { "headEquipment", "hairEquipment", "faceEquipment", "shoulderEquipment", "neckEquipment", "chestEquipment", "armsEquipment", "leftHandEquipment", "rightHandEquipment", "beltEquipment", "skirtEquipment", "trousersEquipment", "legsEquipment", "petEquipment", "backEquipment", "wingEquipment", "firstWeaponEquipment", "secondWeaponEquipment", "accessoryEquipment", "costumeEquipment", "actorEquipment" };

  protected final bZH gli = new bZH();

  private int glj = 0;

  private final HashMap glk = new HashMap();
  private final HashMap gll = new HashMap();
  private ajF glm;
  protected final cvq gln = new cvq(hX.pK());

  private final dpr bvc = new dpr();

  private final azP glo = new azP();

  private final bRM glp = new bRM();

  private final bVG glq = new bVG();

  private final cCo glr = new cCo();

  private final awT gls = new awT();
  private final am glt = new am();

  private final xy glu = new xy();

  private final bMD glv = new bMD();
  private boolean glw = true;

  protected boolean glx = false;
  private fY gly;
  private dwN glz;
  private dwN glA;
  private boolean glB = false;
  private String glC;
  private final cyW glD = new cyW();

  private final Jl glE = new Jl(this);

  private boolean glF = true;

  private final cTB glG = new cTB(this);
  private ArrayList glH;
  aVF glI = new cwM(false);

  private final dSr glJ = new aSD();

  private final ET glK = new ET();

  private bCP glL = null;

  private se glM = null;
  private bva glN;
  private arl glO;
  private azZ glP = new azZ();
  private boolean glQ;
  private adz glR;
  private adz glS;
  private adz glT;
  private final aOr glU = new aOr();

  private boolean glV = true;

  public cTB bFW()
  {
    return this.glG;
  }

  public byz()
  {
    ((air)cQY()).a(this);
    this.glo.a(bHb.gEk);
    this.glu.a(RS.cru);
    this.glu.a(RS.crw);
    dqG localdqG = (dqG)this.glu.b(RS.crw);
    this.gly = new fY(localdqG);
    localdqG.a(this.gly);
    this.gli.d(new amK(this));
    this.glD.hO(true);
    this.bIx = false;
    this.glK.a(new dHl(this));

    bXT.hnW.a(aeU());
  }

  protected bHj bFX()
  {
    return new bHj();
  }

  protected bMG bFY()
  {
    return new ud();
  }

  public boolean aeI()
  {
    return true;
  }

  public se bFZ() {
    return this.glM;
  }

  public bCP bGa() {
    return this.glL;
  }

  public void a(long paramLong)
  {
    super.a(paramLong);
    aZr.boo().a(paramLong, this);
  }

  public void bGb() {
    aZr.boo().b(this.aTz, this);
  }

  public void initialize()
  {
    bFW().a(aeU());

    aeL().cc(WakfuClientInstance.awy().awB().a(bmz.fEs));

    gD(-1);

    int i = d(eu.ayM).acU();

    bGd();
    bGe();
    bFW().clear();
    JC();

    this.gMY.initialize();

    bGf();
    this.glV = true;
    this.bvc.a(ayJ(), bGP());

    bRI().axx();

    Nx.cdi.k(this.glo.aLI());

    this.bIx = true;

    cRf();
    bGc();
    zV(i);
    bp(true);

    dSH.moM.f(this.glL);
    this.glv.bUk();
  }

  private void bGc() {
    if (this.gMU != null) {
      bFW().a(this.gMU, this.ldc, this);
      this.gMU = null;
    }
  }

  private void bGd() {
    if ((this.iIO == SB.ctB) && (bGo() == null)) {
      this.glm = new dzn();
      a(new QT());
    }
  }

  private void bGe() {
    for (bPL localbPL : this.gln)
      localbPL.f((SB)this.iIO);
  }

  private void bGf()
  {
    ayJ().d(new dHh(this));
  }

  public boolean bGg()
  {
    return this.bIx;
  }

  public void bFw()
  {
    super.bFw();
    new dlu(this, this.bwi.cD(), null);
    new bwo(this, this.bwi.cr(), null);
    new DE(this, this.bwi.cB(), null);
    new dvq(this, this.bwi.cK(), null);
    new beL(this, this.bwi.cF(), null);
    new cKa(this, this.bwi.cG(), null);
    new anB(this, this.bwi.cH(), null);
    new bd(this, this.bwi.cI(), null);
    new aAL(this, this.bwi.cn(), null);
    new bXK(this, this.bwi.co(), null);
    new cKZ(this, this.bwi.cp(), null);
    new RT(this, this.bwi.cN(), null);
    new cvh(this, this.bwi.cm(), null);
    new dcf(this, this.bwi.cO(), null);
    new eZ(this, this.bwi.dd(), null);
    new cut(this, this.bwi.cy(), null);
    new aAT(this, this.bwi.di(), null);
    new dJV(this, this.bwi.dj(), null);
    new cJq(this, this.bwi.cV(), null);
    new atZ(this, this.bwi.de(), null);
    new cOn(this, this.bwi.df(), null);
    new dEr(this, this.bwi.dk(), null);
  }

  public void JC()
  {
    cQY().acY();

    cQu();

    q(this);

    bGj();

    for (bTI localbTI : bTI.values())
      if (localbTI.bZU())
        n(localbTI);
  }

  private void bGh()
  {
    bRI().iU(0);
    d(eu.ayM).set(0);
  }

  public void bGi() {
    for (bTI localbTI : bTI.values())
      if (localbTI.bZU())
        n(localbTI);
  }

  private void bGj()
  {
    if (!(this.iIO instanceof SB)) {
      return;
    }
    ((SB)this.iIO).afL().a(cQY(), nU());
  }

  public void q(dle paramdle)
  {
    for (eu localeu : eu.values()) {
      if (localeu.isExpandable())
      {
        paramdle.a(localeu).setMax(this.iIO.b(localeu));
      }
      else
      {
        paramdle.a(localeu).set(this.iIO.b(localeu));
      }

    }

    bGk();

    paramdle.a(eu.ayN).cpx();
    paramdle.a(eu.ayP).cpx();
    paramdle.a(eu.ayO).cpx();
    paramdle.a(eu.ayX).cpx();

    cQX();
  }

  private void bGk() {
    aNm localaNm = this.gMQ.avj();
    while (localaNm.hasNext()) {
      localaNm.fl();
      byte b = localaNm.rC();
      eu localeu = eu.a(Byte.valueOf(b));
      int i = this.gMQ.e(aii(), b);
      if (localeu.isExpandable())
        d(localeu).gx(i);
      else
        d(localeu).gv(i);
    }
  }

  protected void bGl()
  {
    dLE.doY().a(this, new String[] { "currentLevelPercentage", "xpRatio" });
  }

  public bZH ayJ()
  {
    return this.gli;
  }

  public gA gk(long paramLong) {
    gA localgA = (gA)this.gli.ci(paramLong);
    if ((localgA != null) && (localgA.isActive())) {
      return localgA;
    }
    return this.glv.iS(paramLong);
  }

  private void bGm() {
    if (this.gML == null)
      this.gML = new PX();
    else {
      this.gML.clear();
    }
    azO[] arrayOfazO = azO.values();
    for (int i = 0; i < arrayOfazO.length; i++) {
      gA localgA = (gA)this.gli.dB((short)arrayOfazO[i].hV);
      if (localgA != null) {
        this.gML.c(arrayOfazO[i].hV, localgA.ok());
      }
    }
    this.glV = false;
  }

  public PX aeu()
  {
    bGm();

    return this.gML;
  }

  public cvq bGn()
  {
    return this.gln;
  }

  public QT bGo()
  {
    if (this.glm != null) {
      return (QT)this.glm.awq();
    }
    return null;
  }

  public void a(QT paramQT) {
    if (this.glm == null) {
      this.glm = new dzn();
    }
    this.glm.a(paramQT);
    paramQT.a(this);
  }

  public void awr() {
    if (this.glm != null)
      this.glm.awr();
  }

  public byte aws()
  {
    if (this.glm != null) {
      return this.glm.aws();
    }
    return 0;
  }

  public void aZ(byte paramByte) {
    if (this.glm != null)
      this.glm.aZ(paramByte);
  }

  public void aX(byte paramByte)
  {
    if (this.glm != null)
      this.glm.aX(paramByte);
  }

  public void aY(byte paramByte)
  {
    if (this.glm != null)
      this.glm.aY(paramByte);
  }

  public boolean bGp()
  {
    return this.glw;
  }

  public void fA(boolean paramBoolean) {
    if (this.glw != paramBoolean) {
      this.glw = paramBoolean;
      dGW.dhM().kU(this.glw);
    }
  }

  public void a(gA paramgA, short paramShort, byte paramByte1, byte paramByte2, long paramLong1, long paramLong2)
  {
    if (!this.glw) {
      return;
    }

    if ((paramLong1 != 2L) && (paramLong2 != 2L)) {
      a(paramgA, paramShort, paramLong1, paramLong2, paramByte1, paramByte2);
    }
    else if ((paramLong1 == 2L) && (paramLong2 != 2L)) {
      a(paramgA, paramLong2, paramByte1, paramByte2);
    }
    else if (paramLong1 != 2L)
    {
      if ((paramgA.oi().a(Aq.bvQ) != null) && (!paramgA.oi().a(Aq.bvQ).i(this, paramgA, null, bEY())))
      {
        avW.aIb().a(58, 3, new Object[0]);

        return;
      }
      a(paramgA, paramLong1, paramByte2);
    }
    else
    {
      if (paramByte1 == paramByte2) {
        return;
      }
      if ((paramgA.oi().a(Aq.bvQ) != null) && (!paramgA.oi().a(Aq.bvQ).i(this, paramgA, null, bEY())))
      {
        return;
      }
      if (paramByte1 == paramByte2) {
        return;
      }
      a(paramgA, paramByte1, paramByte2);
    }

    if ((paramLong1 == 2L) || (paramLong2 == 2L)) {
      byA.onChangeEquipement(this);
    }

    dLE.doY().a(this, glh);
    cpa localcpa = cBQ.cxL().coO().nf("equipmentDialog");
    if (localcpa != null) {
      dLE.doY().b("itemDetail", "isEquiped", localcpa);
    }

    bsP.getInstance().bAX();
  }

  private void a(gA paramgA, short paramShort, long paramLong1, long paramLong2, byte paramByte1, byte paramByte2)
  {
    if (paramShort == 0) {
      return;
    }

    int i = 1;
    long l1 = 0L;

    long l2 = paramgA.oj();
    cRs localcRs1 = this.glv.iO(paramLong1);
    cRs localcRs2 = this.glv.iO(paramLong2);
    if ((paramgA.nP() > paramShort) && (paramShort != -1)) {
      gA localgA = paramgA.q(false);
      try {
        l1 = localgA.oj();
        i = cot.cox().a(localcRs1.cHT(), localcRs2.cHT(), (short)paramByte2, paramgA, paramShort, localgA, this, bEY());
      }
      catch (Exception localException2)
      {
        K.error("Exception survenue durant le transfert de bag ? bag (avec split) : ", localException2);
      }
    } else {
      try {
        i = cot.cox().a(localcRs1.cHT(), localcRs2.cHT(), (short)paramByte2, paramgA, paramShort, null, this, bEY());
      }
      catch (Exception localException1)
      {
        K.error("Exception survenue durant le transfert de bag ? bag (sans split) : ", localException1);
      }
    }

    if (i == 0) {
      bQC localbQC = new bQC();
      localbQC.hR(paramLong2);
      localbQC.hT(paramLong1);
      localbQC.aC((short)paramByte2);
      localbQC.hQ(l2);
      localbQC.hS(l1);
      localbQC.l(paramShort);
      byv.bFN().aJK().d(localbQC);
    }
  }

  private void a(gA paramgA, long paramLong, byte paramByte1, byte paramByte2)
  {
    cRs localcRs = bGP().iO(paramLong);
    try {
      int i = (short)paramByte2;
      gA localgA = localcRs.dR((short)paramByte2);
      if ((paramByte2 >= 0) && (localgA != null) && (!paramgA.b(localgA))) {
        return;
      }

      int j = this.gli.ajz().a(this.gli, paramgA);

      int k = localcRs.ajz().b(localcRs.cHT(), paramgA);

      if (i == -1) {
        i = localcRs.aM(paramgA);
        if (i == -1) {
          i = localcRs.bQI();
        }
      }

      if ((j != 0) || (k != 0)) {
        return;
      }

      Oq localOq = new Oq();
      localOq.bQ(paramLong);
      localOq.bP(paramgA.oj());
      localOq.S((short)paramByte2);
      byv.bFN().aJK().d(localOq);
    } catch (Exception localException) {
      K.error("L'objet n a pas pu etre ajout? : ", localException);
    }
  }

  private void a(gA paramgA, long paramLong, byte paramByte)
  {
    if (paramgA == null) {
      K.error("On tente de transférer un item null !");
      return;
    }
    if (((adF()) && (aeQ().aEu() != dzm.lFJ)) || (!paramgA.oi().bKn().a(azO.bu(paramByte))))
    {
      avW.aIb().a(58, 3, new Object[0]);

      return;
    }
    bZH localbZH = ayJ();

    int i = 0;
    if (localbZH.dC(paramByte)) {
      i = 1;
    }

    ((cVY)localbZH.ajz()); if (!cVY.aO(paramgA)) {
      i = 1;
    }

    if (!localbZH.ajz().a(paramgA, this, ayL())) {
      i = 1;
    }

    if (i != 0) {
      avW.aIb().a(60, 3, new Object[0]);

      return;
    }
    gA localgA1 = (gA)localbZH.dB((short)paramByte);
    Object localObject1 = localgA1;
    if (localgA1 != null) {
      if (!localgA1.isActive()) {
        localObject2 = localgA1.oi().bKn().nh();

        for (Object localObject4 : localObject2) {
          gA localgA2 = (gA)localbZH.dB((short)localObject4.hV);
          if (localgA2.ok() == ((gA)localObject1).ok()) {
            localObject1 = localgA2;
            break;
          }
        }
      }

      if (localbZH.ajz().a(localbZH, (dsj)localObject1) != 0) {
        avW.aIb().a(60, 3, new Object[0]);

        return;
      }

      if (localbZH.ajz().a(localbZH, localgA1, paramgA) != 0) {
        avW.aIb().a(60, 3, new Object[0]);
      }

    }
    else if (localbZH.ajz().a(localbZH, paramgA, (short)paramByte) != 0) {
      avW.aIb().a(60, 3, new Object[0]);

      return;
    }

    Object localObject2 = new dIG();
    ((dIG)localObject2).hT(paramLong);
    ((dIG)localObject2).fM(paramByte);
    ((dIG)localObject2).hQ(paramgA.oj());
    ((dIG)localObject2).hS(paramgA.oj());
    byv.bFN().aJK().d((cWG)localObject2);
  }

  private void a(gA paramgA, byte paramByte1, byte paramByte2)
  {
    int i;
    try
    {
      i = dOa.dqf().a(this.gli, (short)paramByte1, this.gli, (short)paramByte2, paramgA, this, bEY()) == 0 ? 1 : 0;
    }
    catch (Exception localException)
    {
      K.error("Exception", localException);
      i = 0;
    }

    if (i != 0) {
      dsM localdsM = new dsM();
      localdsM.hQ(paramgA.oj());
      localdsM.cz(paramByte2);

      byv.bFN().aJK().d(localdsM);
    }

    this.glx = false;
  }

  public void a(gA paramgA, short paramShort, long paramLong) {
    if (paramgA.or())
      return;
    Object localObject1;
    bBS localbBS;
    Object localObject2;
    if (paramLong == 2L) {
      if (ayJ().d(paramgA)) {
        localObject1 = paramgA.oi().bKn().nj();

        if (localObject1 != null) {
          for (int i = 0; i < localObject1.length; i++) {
            localbBS = localObject1[i];
            ayJ().dz((short)localbBS.hV);
          }
        }

        localObject2 = new bBS();
        ((bBS)localObject2).hT(paramLong);
        ((bBS)localObject2).hQ(paramgA.oj());
        ((bBS)localObject2).l((short)-1);
        byv.bFN().aJK().d((cWG)localObject2);

        dLE.doY().a(this, glh);
      }
    } else {
      localObject1 = this.glv.iO(paramLong);
      localObject2 = ((cRs)localObject1).cHT();

      if (paramShort == 0) {
        return;
      }
      if (((paramgA.oi().a(Aq.bvR) != null) && (!paramgA.oi().a(Aq.bvR).i(this, ML(), paramgA, bEY()))) || ((paramgA.oi().a(Aq.bvS) != null) && (!paramgA.oi().a(Aq.bvS).i(this, ML(), paramgA, bEY()))))
      {
        return;
      }
      if ((paramShort < paramgA.nP()) && (paramShort > 0)) {
        if (((dfy)localObject2).c(paramgA.oj(), (short)-paramShort)) {
          localbBS = new bBS();
          localbBS.hT(((cRs)localObject1).EN());
          localbBS.l(paramShort);
          localbBS.hQ(paramgA.oj());
          byv.bFN().aJK().d(localbBS);
        }
      }
      else if (((dfy)localObject2).d(paramgA))
      {
        localbBS = new bBS();
        localbBS.hT(((cRs)localObject1).EN());
        localbBS.hQ(paramgA.oj());
        localbBS.l((short)-1);
        byv.bFN().aJK().d(localbBS);
      }
    }
  }

  public dhu bGq()
  {
    return this.ldc;
  }

  public void bGr()
  {
    this.glk.clear();
  }

  public void e(apX paramapX)
  {
    Short localShort = (Short)this.glk.get(paramapX);
    if (localShort == null) {
      localShort = Short.valueOf((short)0);
    }
    localShort = Short.valueOf((short)(localShort.shortValue() + 1));
    this.glk.put(paramapX, localShort);
  }

  public ArrayList bGs()
  {
    ArrayList localArrayList = new ArrayList();
    for (apX localapX : this.glk.keySet()) {
      Short localShort = (Short)this.glk.get(localapX);
      if (localShort != null) {
        localArrayList.add(new Cs(localapX, localShort));
      }
    }

    return localArrayList;
  }

  public void bGt()
  {
    this.gll.clear();
  }

  public void aa(gA paramgA)
  {
    Short localShort = (Short)this.gll.get(paramgA);
    if (localShort == null) {
      localShort = Short.valueOf((short)0);
    }
    localShort = Short.valueOf((short)(localShort.shortValue() + 1));
    this.gll.put(paramgA, localShort);
  }

  public ArrayList bGu()
  {
    ArrayList localArrayList = new ArrayList();
    for (gA localgA : this.gll.keySet()) {
      Short localShort = (Short)this.gll.get(localgA);
      if (localShort != null) {
        localArrayList.add(new Cs(localgA, localShort));
      }
    }

    return localArrayList;
  }

  public final void gl(long paramLong) {
    boolean bool = WakfuClientInstance.awy().awB().a(bmz.fEy);

    bE localbE = new bE(paramLong, bool);
    byv.bFN().aJK().d(localbE);
  }

  private Su az(Su paramSu) {
    czN localczN = paramSu.aeN();
    byte b = localczN.hX(paramSu.getId());
    Collection localCollection = localczN.ca(b);
    Iterator localIterator = localCollection.iterator();
    Su localSu = null;
    if (localIterator.hasNext()) {
      localSu = (Su)localIterator.next();
    }
    return localSu;
  }

  public void aA(Su paramSu) {
    kw localkw = new kw();
    localkw.O(paramSu.getId());
    localkw.h(paramSu.fa(), paramSu.fb(), paramSu.fc());

    if (WakfuClientInstance.awy().awB().a(bmz.fEy))
    {
      localkw.sn();
    }
    byv.bFN().aJK().d(localkw);
  }

  public void rw(int paramInt) {
    byv.bFN().aJK().d(new bGx(paramInt));
  }

  public void a(dMM paramdMM, cfb paramcfb1, cfb paramcfb2)
  {
    bOU.gUc.b(new bAN(paramcfb1, paramcfb2));
    bva localbva = byJ.gma.cG(paramcfb2.getX(), paramcfb2.getY());

    if (localbva != this.glN)
      try {
        b(localbva);
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
  }

  public arl bGv()
  {
    if (aeQ() != null) {
      return aeQ();
    }
    return bHg();
  }

  public int bGw() {
    arl localarl = bGv();
    return localarl == null ? -1 : localarl.getId();
  }

  public boolean bGx() {
    return (!adF()) && (bGM());
  }

  public boolean a(cGx paramcGx) {
    for (BZ localBZ = paramcGx.cBy(); localBZ.hasNext(); ) {
      localBZ.fl();
      if (!t(localBZ.zY(), localBZ.Lb())) {
        return false;
      }
    }
    return true;
  }

  public boolean t(int paramInt, short paramShort) {
    short s = 0;
    for (Object localObject1 = bGP().hi(paramInt).iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (gA)((Iterator)localObject1).next();
      s += ((gA)localObject2).nP();
      if (s >= paramShort) {
        return true;
      }
    }
    localObject1 = (Vu)b(RS.cru);
    Object localObject2 = ((Vu)localObject1).ha(paramInt);
    if (localObject2 == null) {
      return false;
    }
    return ((cEG)localObject2).nP() >= paramShort;
  }

  public int b(cGx paramcGx) {
    int i = 2147483647;
    for (BZ localBZ = paramcGx.cBy(); localBZ.hasNext(); ) {
      localBZ.fl();
      int j = localBZ.zY();
      int k = bGP().tj(j);
      if (k == 0) {
        Vu localVu = (Vu)b(RS.cru);
        cEG localcEG = localVu.ha(j);
        if (localcEG != null) {
          k = localcEG.nP();
        }
      }
      int m = k / localBZ.Lb();
      if (m < i) {
        i = m;
      }
    }
    return i;
  }

  public boolean bGy() {
    ayn localayn = bWW.ccf().FB();
    if (localayn == null) {
      return true;
    }
    aYr localaYr = cJf().UI();
    dqU localdqU = localaYr.aMP().jq(localayn.avc());

    return localdqU == dqU.ltr;
  }

  public boolean aDj() {
    short s = Lk();
    brW localbrW = ars.dzL.aL(s);
    if (localbrW == null)
      return false;
    return localbrW.getId() == bSt().CF();
  }

  public boolean Jv() {
    short s = Lk();
    brW localbrW = ars.dzL.aL(s);
    return localbrW != null;
  }

  public boolean bGz() {
    aYr localaYr = cQs();
    if (localaYr == null) {
      return false;
    }
    if (localaYr.bnA() == Lk()) {
      return false;
    }
    return cJf().HL();
  }

  public void bGA()
  {
    rx(800200);
  }

  private void rx(int paramInt) {
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(paramInt);
    if (localFreeParticleSystem == null) {
      return;
    }

    localFreeParticleSystem.b(aeL());
    cWS.cKD().b(localFreeParticleSystem);
  }

  public dOe b(RS paramRS) {
    return this.glu.b(paramRS);
  }

  public boolean aHp() {
    return aHq() > 0;
  }

  public int aHq() {
    return this.glj;
  }

  public void kx(int paramInt) {
    this.glj = paramInt;
  }

  public void aHr() {
    this.glj = 0;
  }

  public void b(int paramInt, cDZ paramcDZ) {
    super.b(paramInt, paramcDZ);
    bGD().cWA();
  }

  protected void a(int paramInt, cDZ paramcDZ)
  {
    super.a(paramInt, paramcDZ);
    dMU localdMU = this.bvc.cWz();
    if (localdMU != null) {
      localdMU.bI(this);
      localdMU.dpH();
    }
    this.bvc.cWA();
  }

  public void aeD()
  {
    super.aeD();
    bGD().cWB();
  }

  public void fB(boolean paramBoolean) {
    this.glQ = paramBoolean;
  }

  public void bGB()
  {
    this.glC = null;

    dLE.doY().a(this, new String[] { "equipmentBonus" });
  }

  public void a(uz paramuz, String paramString) {
    if (paramuz != null)
      dLE.doY().a(this, new String[] { "characterIconUrl" });
    else
      K.warn(paramString);
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("shortcutBarManager")) {
      return this.bvc;
    }

    if (paramString.equals("characterIconUrl"))
      return aZr.boo().eZ(getId());
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramString.equals("equipment")) {
      localObject1 = new ArrayList();
      for (localObject2 = this.gli.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (gA)((Iterator)localObject2).next();
        ((ArrayList)localObject1).add(localObject3);
      }
      return localObject1;
    }

    if (paramString.equals("equipmentBonus")) {
      if (this.glC == null) {
        this.glC = a(this, this.gli);
      }
      return this.glC;
    }

    if (paramString.equals("bags")) {
      return this.glv;
    }

    if (paramString.equals("headEquipment")) {
      return this.gli.dB((short)azO.dRx.hV);
    }
    if (paramString.equals("hairEquipment")) {
      return this.gli.dB((short)azO.dRy.hV);
    }
    if (paramString.equals("faceEquipment")) {
      return this.gli.dB((short)azO.dRz.hV);
    }
    if (paramString.equals("shoulderEquipment")) {
      return this.gli.dB((short)azO.dRA.hV);
    }
    if (paramString.equals("neckEquipment")) {
      return this.gli.dB((short)azO.dRB.hV);
    }
    if (paramString.equals("chestEquipment")) {
      return this.gli.dB((short)azO.dRC.hV);
    }
    if (paramString.equals("armsEquipment")) {
      return this.gli.dB((short)azO.dRD.hV);
    }
    if (paramString.equals("leftHandEquipment")) {
      return this.gli.dB((short)azO.dRE.hV);
    }
    if (paramString.equals("rightHandEquipment")) {
      return this.gli.dB((short)azO.dRF.hV);
    }
    if (paramString.equals("beltEquipment")) {
      return this.gli.dB((short)azO.dRH.hV);
    }
    if (paramString.equals("skirtEquipment")) {
      return this.gli.dB((short)azO.dRG.hV);
    }
    if (paramString.equals("trousersEquipment")) {
      return this.gli.dB((short)azO.dRI.hV);
    }
    if (paramString.equals("legsEquipment")) {
      return this.gli.dB((short)azO.dRJ.hV);
    }
    if (paramString.equals("backEquipment")) {
      return this.gli.dB((short)azO.dRK.hV);
    }
    if (paramString.equals("wingEquipment")) {
      return this.gli.dB((short)azO.dRL.hV);
    }
    if (paramString.equals("firstWeaponEquipment")) {
      return this.gli.dB((short)azO.dRM.hV);
    }
    if (paramString.equals("secondWeaponEquipment")) {
      return this.gli.dB((short)azO.dRN.hV);
    }
    if (paramString.equals("accessoryEquipment")) {
      return this.gli.dB((short)azO.dRO.hV);
    }
    if (paramString.equals("petEquipment")) {
      return this.gli.dB((short)azO.dRT.hV);
    }
    if (paramString.equals("costumeEquipment")) {
      return this.gli.dB((short)azO.dRU.hV);
    }
    if (paramString.equals("weaponSkills")) {
      localObject1 = this.gln.iterator();
      localObject2 = new ArrayList();
      while (((Iterator)localObject1).hasNext()) {
        localObject3 = (bPL)((Iterator)localObject1).next();
        if (((Dk)((bPL)localObject3).cvw()).Wh().equals(bcR.fmZ)) {
          ((ArrayList)localObject2).add(localObject3);
        }
      }
      return localObject2;
    }
    if (paramString.equals("craft")) {
      return Nx.cdi.isEmpty() ? null : Nx.cdi;
    }
    if (paramString.equals("temporaryTransferInventory"))
      return this.gly;
    if (paramString.equals("availableTitles")) {
      return this.glH;
    }
    if (paramString.equals("currentLevelPercentage")) {
      return Float.valueOf(ayY());
    }
    if (paramString.equals("xpRatio")) {
      if (nU() >= 140) {
        return bU.fH().getString("maxLevel");
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append(bU.fH().getString("xpRatio", new Object[] { bU.fH().iK(ble().cH(blf())), bU.fH().iK(ble().aq(nU())) }));

      return ((StringBuilder)localObject1).toString();
    }

    if (paramString.equals("wakfuGauge"))
      return Float.valueOf(1.0F - (JK() + 1.0F) / 2.0F);
    float f1;
    if (paramString.equals("wakfuGaugePopupText")) {
      f1 = JK() * 100.0F;
      localObject2 = Math.abs((int)f1) + "% ";
      localObject3 = new lZ();
      ((lZ)localObject3).a(bU.fH().getString("wakfu.gaugePopup"));
      if (f1 > 0.0F) {
        ((lZ)localObject3).a("\n").am("28d2c4").a((CharSequence)localObject2).a(bU.fH().getString("desc.wakfu")).tJ();
      }
      else if (f1 < 0.0F) {
        ((lZ)localObject3).a("\n").am("ab00ff").a((CharSequence)localObject2).a(bU.fH().getString("STASIS")).tJ();
      }
      else
      {
        return null;
      }
      return ((lZ)localObject3).tP();
    }

    if (paramString.equals("wakfuGaugeColor")) {
      f1 = JK();
      float f2 = Math.abs(f1);
      localObject3 = f1 < 0.0F ? clP.hOu : clP.hOt;

      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(bCO.s(1.0F, localObject3[0], f2)).append(",");
      localStringBuilder.append(bCO.s(1.0F, localObject3[1], f2)).append(",");
      localStringBuilder.append(bCO.s(1.0F, localObject3[2], f2));
      return localStringBuilder.toString();
    }

    if (paramString.equals("wakfuGaugeIconStyle")) {
      f1 = JK();
      return f1 > 0.0F ? "wakfuIcon" : f1 < 0.0F ? "StasisIcon" : "";
    }

    if (paramString.equals("aptitudes")) {
      return this.glJ;
    }

    if (paramString.equals("commonAptitudes")) {
      return this.glJ.bim();
    }

    if (paramString.equals("breedAptitudes")) {
      return this.glJ.bil();
    }

    if (paramString.equals("availableAptitudePoints")) {
      return Integer.valueOf(bGQ().d(qE.aXR) - Dn.MA().b(qE.aXR));
    }

    if (paramString.equals("aptitudeMenuText")) {
      return bGC();
    }

    if (paramString.equals("availableCommonPoints")) {
      return Integer.valueOf(bGQ().d(qE.aXQ) - Dn.MA().b(qE.aXQ));
    }

    if (paramString.equals("nation")) {
      return ((ctE)cJf()).crd();
    }

    if (paramString.equals("isInSubscriberZone")) {
      return Boolean.valueOf(bGP.gDx.a(new aGH[] { this }));
    }

    if (paramString.equals("canLockSpell")) {
      return Boolean.valueOf(dyc.bd(this) == Mb.bZc);
    }

    if (paramString.equals("hasMissingSpellXp")) {
      return Boolean.valueOf(dyc.bd(this) == Mb.bZd);
    }

    if (paramString.equals("lockedSpell")) {
      return auK().hh(aHq());
    }

    return super.getFieldValue(paramString);
  }

  private Object bGC()
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    qE[] arrayOfqE = qE.values();
    int j = 0;
    int k = 0; for (int m = arrayOfqE.length; k < m; k++) {
      qE localqE = arrayOfqE[k];
      if (!this.glJ.g(localqE).isEmpty())
      {
        int n = this.glJ.d(localqE) - Dn.MA().b(localqE);

        i += n;
        if (j++ != 0)
          localStringBuilder.append(" - ");
        localStringBuilder.append(n);
      }
    }
    if (i == 0) {
      return bU.fH().getString("character.sheet.display.abilities");
    }
    String str = new lZ().tI().bx(14).am(bNa.gRJ.bUV()).a(localStringBuilder.toString()).tJ().tP();

    return bU.fH().getString("character.sheet.improve.abilities", new Object[] { str });
  }

  protected void adA()
  {
    if ((this.ctf == null) || (this.ctg == null)) {
      this.ctf = new ArrayList();
      this.ctg = new ArrayList();
      this.cth = new ArrayList();

      for (aVc localaVc : bFW()) {
        if (j(localaVc)) {
          int i = -1;
          Iterator localIterator2;
          Object localObject;
          switch (localaVc.wa().nS()) {
          case 18:
            if (!adF())
              for (localIterator2 = bHk().iterator(); localIterator2.hasNext(); ) { localObject = (bjU)localIterator2.next();
                if (((bjU)localObject).acm() == localaVc.wa().nT()) {
                  int k = ((bjU)localObject).bcN();
                  i = k != -1 ? k / 1000 : -1;
                  break; }  }  break;
          case 1:
            if (localaVc.aIq().LA() != 1) {
              int j = ((bXU)localaVc.wa()).bQW();
              localObject = bFW().pz(j);

              if (localObject != null)
                i = bFW().jg(((bPD)localObject).oj());
            }
            break;
          default:
            i = bFW().jg(localaVc.oj());
          }

          brO localbrO = aeU().a(localaVc, i);

          if (localbrO != null) {
            switch (localaVc.wa().nS()) {
            case 19:
            case 33:
              if (!this.ctg.contains(localbrO))
                this.ctg.add(localbrO); break;
            default:
              if (!this.ctf.contains(localbrO)) {
                this.ctf.add(localbrO);
              }
              break;
            }
            if (!this.cth.contains(localbrO)) {
              this.cth.add(localbrO);
            }
          }
        }
      }

      adB();
    }
  }

  public String[] getFields()
  {
    return bwd;
  }

  public amS a(aFy paramaFy, byte paramByte)
  {
    bJz localbJz = null;
    try {
      localbJz = this.bvc.c(paramaFy, paramByte);
      return localbJz.bQS();
    } catch (Exception localException) {
      K.error("Exception while trying to het shortcutbar " + paramaFy + " / " + paramByte, localException);
    }return null;
  }

  public dpr bGD()
  {
    return this.bvc;
  }

  public azP aTn() {
    return this.glo;
  }

  public bRM bGE() {
    return this.glp;
  }

  public awT bGF() {
    return this.gls;
  }

  public am bGG() {
    return this.glt;
  }

  public void bGH()
  {
    dLE.doY().a(this, glh);
  }

  public void bGI() {
    this.bvc.bGI();
  }

  public void a(dVs paramdVs)
  {
  }

  public short bGJ()
  {
    dCi localdCi = this.gMY.auK();
    if (localdCi.size() == 0) {
      return 0;
    }
    int i = 0;
    for (apX localapX : localdCi) {
      i += localapX.nU();
    }
    return (short)(i / localdCi.size());
  }

  public boolean bGK()
  {
    return this.glB;
  }

  public boolean bGL() {
    if (bSe() == null) {
      return false;
    }
    switch (bSe().fU()) {
    case 2:
    case 3:
    case 6:
    case 8:
      return true;
    case 4:
    case 5:
    case 7: } return false;
  }

  public void fC(boolean paramBoolean)
  {
    this.glB = paramBoolean;
  }

  public boolean bGM() {
    return this.glF;
  }

  public void fD(boolean paramBoolean) {
    this.glF = paramBoolean;
  }

  public void bA(short paramShort)
  {
    if (this.glH != null) {
      for (int i = this.glH.size() - 1; i >= 0; i--) {
        bkd localbkd = (bkd)this.glH.get(i);
        if (localbkd.nc() == paramShort) {
          a(localbkd);
          return;
        }
      }
    }

    a(new bkd(paramShort));
  }

  public void m(short[] paramArrayOfShort)
  {
    int i = paramArrayOfShort.length;
    if (this.glH == null) {
      this.glH = new ArrayList(i + 1);
    } else {
      this.glH.clear();
      this.glH.ensureCapacity(i + 1);
    }

    this.glH.add(new bkd((short)-1));
    for (int j = 0; j < i; j++) {
      this.glH.add(new bkd(paramArrayOfShort[j]));
    }

    Object localObject = null;
    bkd localbkd1 = bSk();

    if ((this.glH != null) && (localbkd1 != null)) {
      for (int k = this.glH.size() - 1; k >= 0; k--) {
        bkd localbkd2 = (bkd)this.glH.get(k);
        if (localbkd2.nc() == localbkd1.nc()) {
          localObject = localbkd2;
        }
      }
    }

    a(localObject);

    dLE.doY().a(this, new String[] { "availableTitles" });
  }

  public void a(cqm paramcqm)
  {
    super.a(paramcqm);
    b("characUpdate", new dHj(this));
  }

  private void bGN()
  {
    for (gA localgA : this.gli)
      localgA.of();
  }

  private void bGO()
  {
    cHu localcHu = this.glv.cEg();
    while (localcHu.hasNext()) {
      localcHu.fl();
      for (gA localgA : (cRs)localcHu.value())
        localgA.of();
    }
  }

  public void a(bNz parambNz)
  {
    if (parambNz.bVh().equals(this.gli))
    {
      YS localYS;
      gA localgA;
      int i;
      switch (dHm.aOs[parambNz.bVg().ordinal()]) {
      case 1:
      case 2:
        localYS = (YS)parambNz;
        if ((localYS.akr() instanceof gA))
        {
          localgA = (gA)localYS.akr();

          i = e(eu.ayM);
          ayD();
          d(eu.ayM).set(i);

          this.bvc.a(localgA, localYS);

          localgA.of();

          this.glV = true;

          aWc.blo().b(azO.bu((byte)localYS.aks()));
        }

        break;
      case 3:
      case 4:
        localYS = (YS)parambNz;
        if ((localYS.akr() instanceof gA)) {
          localgA = (gA)localYS.akr();
          i = e(eu.ayM);
          if (localgA.oi().bKk() != 0) {
            dLB localdLB = bCc.bKN().cm(localgA.oi().bKk());

            a(localgA, localdLB);
          } else {
            s(localgA);
          }

          ayD();

          d(eu.ayM).set(i);

          this.bvc.c(localgA);

          this.glx = false;
          localgA.of();

          this.glV = true;
        }break;
      case 5:
      case 6:
      }
    }
  }

  public csx[] adN()
  {
    dCb localdCb = aeS();
    if ((localdCb != null) && 
      ((localdCb instanceof djm))) {
      djm localdjm = (djm)localdCb;
      cRz localcRz = (cRz)localdjm.vK();
      return localcRz.adN();
    }

    return csx.icw;
  }

  public bMD bGP()
  {
    return this.glv;
  }

  public dSr bGQ()
  {
    return this.glJ;
  }

  public void c(cOE paramcOE)
  {
    super.c(paramcOE);
    dLE.doY().a(this, new String[] { "aptitudes", "breedAptitudes", "commonAptitudes", "aptitudeMenuText", "availableAptitudePoints", "availableCommonPoints" });
  }

  public void bGR()
  {
    super.bGR();
    bp(true);
  }

  public void bGS()
  {
    super.bGS();
    dBL.lJn.C(this);
    bp(true);
  }

  public adz bGT() {
    return this.glS;
  }

  public void bGU()
  {
    dBL.lJn.B(this);
    bp(true);
  }

  public void bGV() {
    dBL.lJn.A(this);
    bp(true);
  }

  public adz bGW() {
    return this.glR;
  }

  public adz bGX() {
    return this.glT;
  }

  public aOr bGY() {
    return this.glU;
  }

  public boolean bGZ() {
    dqG localdqG = (dqG)b(RS.crw);
    return !localdqG.isEmpty();
  }

  public dwN bHa()
  {
    return this.glA;
  }

  public void b(dwN paramdwN)
  {
    this.glA = paramdwN;
  }

  public dwN bHb()
  {
    return this.glz;
  }

  public int JE()
  {
    return this.glz.fO().bDx();
  }

  public int dU(int paramInt)
  {
    int i = this.glz.fO().bDx();
    this.glz.fO().BD(paramInt);
    return i - this.glz.fO().bDx();
  }

  public int dV(int paramInt)
  {
    int i = this.glz.fO().bDx();
    this.glz.fO().Bj(paramInt);
    return i - this.glz.fO().bDx();
  }

  public void a(int paramInt, long paramLong, boolean paramBoolean)
  {
    super.a(paramInt, paramLong, paramBoolean);

    cyv localcyv = (cyv)bGn().hh(paramInt);
    if (localcyv == null) {
      return;
    }

    uP localuP = localcyv.da(paramLong);

    long l = localcyv.ble().hR(localcyv.cvu() + 1) - localcyv.ayX();
    Dk localDk = (Dk)localcyv.cvw();

    if ((!paramBoolean) || (localDk.Wh().xj() == bcR.fmZ.xj()));
  }

  public void b(int paramInt, long paramLong, boolean paramBoolean)
  {
    apX localapX = (apX)auK().hh(paramInt);
    if (localapX == null) {
      return;
    }

    super.b(paramInt, paramLong, paramBoolean);

    uP localuP = localapX.da(paramLong);

    long l = localapX.ble().aq(localapX.nU()) - localapX.ble().cH(localapX.ayX());

    String str1 = paramLong > 0L ? "infoPop.xpGain" : "infoPop.xpLoss";

    String str2 = bU.fH().getString(str1, new Object[] { ((dSR)localapX.bsL()).getName(), Long.valueOf(paramLong), Long.valueOf(l), cPU.kAC, Short.valueOf(localuP.DO()) });

    ehE.info(str2);

    n(bTI.dx(((dSR)localapX.bsL()).bHU()));

    if (paramBoolean) {
      dLE.doY().a(this.gMY, this.gMY.getFields());
    }

    if ((!paramBoolean) || (!adF()));
  }

  public void g(long paramLong, short paramShort)
  {
    da(paramLong);
    long l = ble().hR(nU() + 1) - blf();
    String str = bU.fH().getString("infoPop.xpGain", new Object[] { getName(), Long.valueOf(paramLong), Long.valueOf(l), cPU.kAC, Short.valueOf(paramShort) });

    ehE.info(str);

    super.g(paramLong, paramShort);
  }

  public void JN()
  {
  }

  public void JO()
  {
  }

  public void a(aPH paramaPH)
  {
    this.bvc.cWO();
    super.a(paramaPH);

    int i = uO();
    if (i == SB.ctF.uO())
      cpX.hZN.r(this);
    else if (i == SB.ctL.uO())
      cmO.hSn.r(this);
    else if (i == SB.ctM.uO())
      cyV.inA.r(this);
    else if (i == SB.ctE.uO()) {
      cfA.hAC.r(this);
    }

    if (bHh()) {
      new aKe().execute();
    }

    dmM.cUe().AL(paramaPH.getId());
    dmM.cUe().cUl();

    if ((this.glQ) && ((paramaPH instanceof arl)))
      buI.bCs().h((arl)paramaPH);
  }

  public void aea()
  {
    Sg.a(1, this);
    super.aea();

    SB localSB = aii();
    if (localSB == SB.ctB) {
      QT localQT = bGo();
      if (localQT != null) {
        localQT.aal();
      }
    }
    else if (localSB == SB.ctL) {
      cmO.hSn.a(this);
    } else if (localSB == SB.ctF) {
      cpX.hZN.a(this);
    } else if (localSB == SB.ctM) {
      cyV.inA.a(this);
    } else if (localSB == SB.ctE) {
      cfA.hAC.a(this);
    }

    bp(true);
  }

  public void a(dxl paramdxl, short paramShort, long paramLong)
  {
  }

  public void bHc()
  {
    for (gA localgA : ayJ())
      ayJ().d(localgA);
  }

  public void bHd()
  {
    for (cHu localcHu = this.glv.cEg(); localcHu.hasNext(); ) {
      localcHu.fl();
      ((cRs)localcHu.value()).ajx();
    }
  }

  public void bHe() {
    dCb localdCb = aeS();

    if (localdCb != null)
      b(null);
  }

  private boolean bHf()
  {
    if (bGZ()) {
      tL.Ca().Cb();
      return false;
    }

    if (bHh()) {
      this.glP.aLW();
      return false;
    }

    return true;
  }

  protected void b(arl paramarl)
  {
    super.b(paramarl);
    bOq.bVv().j(paramarl);
    asv.aEL();
  }

  public void i(arl paramarl) {
    this.glO = paramarl;
    bOq.bVv().j(paramarl);
  }

  public arl bHg() {
    return this.glO;
  }

  public boolean bHh() {
    return this.glO != null;
  }

  public boolean a(alr paramalr, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (!bHf()) {
      return false;
    }
    return aeL().a(paramalr, paramBoolean1, paramBoolean2);
  }

  public boolean b(cYk paramcYk, boolean paramBoolean1, boolean paramBoolean2)
  {
    return (bHf()) && (aeL().b(paramcYk, paramBoolean1, paramBoolean2));
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2, List paramList) {
    return (bHf()) && (aeL().a(paramBoolean1, paramBoolean2, paramList));
  }

  public boolean a(int paramInt1, int paramInt2, short paramShort, boolean paramBoolean1, boolean paramBoolean2)
  {
    return (bHf()) && (aeL().a(paramInt1, paramInt2, paramShort, paramBoolean1, paramBoolean2));
  }

  public boolean a(cuB paramcuB, boolean paramBoolean)
  {
    return (bHf()) && (aeL().a(paramcuB, paramBoolean));
  }

  public cyW bHi()
  {
    return this.glD;
  }

  public void c(dsl paramdsl, int paramInt) {
    if (paramInt != 0) {
      String str = paramInt < 0 ? "kama.loss" : "kama.gain";
      aEe localaEe = new aEe(bU.fH().getString(str, new Object[] { Integer.valueOf(Math.abs(paramInt)) }));

      localaEe.mm(4);
      CM.LV().a(localaEe);
    }

    int i = paramdsl.bDx();
    dLE.doY().t("kamas", Integer.valueOf(i));
    dLE.doY().t("formatedKamas", bU.fH().iK(i));
  }

  public boolean ry(int paramInt)
  {
    amY localamY = qn.xw().ck(paramInt);
    return localamY != null;
  }

  public long blf() {
    return this.glI.blf();
  }

  public short nU()
  {
    return this.glI.nU();
  }

  public cOB ble() {
    return this.glI.ble();
  }

  public float ayY()
  {
    return this.glI.ayY();
  }

  public uP eK(long paramLong)
  {
    return this.glI.eK(paramLong);
  }

  public uP da(long paramLong) {
    uP localuP = this.glI.da(paramLong);
    a(localuP);
    return localuP;
  }

  void a(uP paramuP) {
    if (paramuP.DR()) {
      int i = paramuP.DO();
      Bf.Kk().Kl();

      dSr localdSr = bGQ();
      j = paramuP.DO() * 5;

      localdSr.a(qE.aXQ, localdSr.d(qE.aXQ) + j);

      localdSr.a(qE.aXR, localdSr.d(qE.aXR) + j);

      dLE.doY().a(this, new String[] { "availableCommonPoints", "availableAptitudePoints", "aptitudeMenuText" });

      dLE.doY().a(this.gMY, this.gMY.getFields());

      if (((this.iIO instanceof SB)) && (!adF())) {
        ((SB)this.iIO).afL().b(cQY(), (short)(nU() - i), nU());

        cQX();
      }

      bUH.caG().caI();
    }

    long l = this.glI.blf() - paramuP.DP();
    int j = this.glI.nU() - paramuP.DO();
    float f = ble().d((short)j, l);
    Nw.ZC().a(paramuP, f, this.glI.ayY());

    bSy();
  }

  public uP bs(short paramShort) {
    uP localuP = this.glI.bs(paramShort);
    a(localuP);
    return localuP;
  }

  public Jl bHj()
  {
    return this.glE;
  }

  public long Tb() {
    return bHj().Tb();
  }

  public boolean rz(int paramInt)
  {
    super.rz(paramInt);

    int i = 0;
    for (int j = 0; j < this.glH.size(); j++) {
      if (((bkd)this.glH.get(j)).nc() == paramInt) {
        i = 1;
        break;
      }
    }

    if (i == 0) {
      this.glH.add(new bkd((short)paramInt));
    }

    return i == 0;
  }

  public void rA(int paramInt)
  {
    super.rA(paramInt);

    dLE.doY().a(this, new String[] { "wakfuGauge", "wakfuGaugePopupText", "wakfuGaugeIconStyle", "wakfuGaugeColor" });
  }

  public Collection bHk()
  {
    return this.glK.Og();
  }

  public ET bHl() {
    return this.glK;
  }

  public void m(byo parambyo)
  {
    super.m(parambyo);
    bSo().aeL().fE(true);
    this.aEM.fE(false);
  }

  public void bHm()
  {
    bSo().aeL().fE(false);
    this.aEM.fE(true);
    super.bHm();
  }

  public void a(int paramInt1, cvY paramcvY, dkI paramdkI, int paramInt2, int paramInt3)
  {
    super.a(paramInt1, paramcvY, paramdkI, paramInt2, paramInt3);

    Yp localYp = cJf().HK();
    String str;
    Object localObject2;
    if ((this.bIx) && (localYp != null) && (paramInt2 < localYp.IP())) {
      localObject1 = bU.fH().getString("notification.nationRankLostTitle");

      str = cda.createLink(bU.fH().getString("notification.nationRankLostText", new Object[] { bU.fH().b(57, (int)localYp.getId(), new Object[0]) }), ana.dqi);

      localObject2 = new az((String)localObject1, str, ana.dqi, 600132);

      cjO.clE().j((cWG)localObject2);
    }

    if (aeQ() == null) {
      ayD();
    }
    Object localObject1 = dwC.dbQ().BQ(paramInt2);
    if ((this.bIx) && (paramdkI != localObject1)) {
      str = bU.fH().getString("notification.citizenRankTitle");

      localObject2 = cda.createLink(bU.fH().getString("notification.citizenRankText", new Object[] { bU.fH().getString(((dkI)localObject1).agf()) }), ana.dqg);

      az localaz = new az(str, (String)localObject2, ana.dqg);

      cjO.clE().j(localaz);
    }
    bOU.gUc.b(new bvp((dkI)localObject1, paramInt2));
  }

  public void b(bva parambva) {
    this.glN = parambva;

    if ((parambva != null) && (parambva.boT() != null)) {
      dbh localdbh = (dbh)aAA.dTm.aMA();
      localdbh.o((ayn)parambva.boT());
      biI.fzg.b(localdbh);

      bOU.gUc.b(new ctg(parambva.getId()));
    } else {
      bzu.cf((short)16002);

      bUH.caG().c(null);
      bUH.caG().bst();

      blo.bws().clear();
      dcK.cOf().clear();
    }

    cCZ.cyZ().bMn();
    bSH.bZs().bMn();
  }

  public bva bHn() {
    return this.glN;
  }

  public void afi()
  {
    super.afi();
    ceR.chM().chN();
    bGD().cWX();
  }

  public void rB(int paramInt)
  {
    bRI().iU(paramInt);
  }

  public dsl fO() {
    return this.glz.fO();
  }

  public boolean P(gA paramgA) {
    throw new UnsupportedOperationException("Not implemented");
  }

  public cRs Q(gA paramgA) {
    throw new UnsupportedOperationException("Not implemented");
  }

  public bdK boU() {
    return ayg.aJQ().bjs();
  }

  public boolean b(go paramgo)
  {
    switch (dHm.cGn[paramgo.ordinal()]) {
    case 1:
      return Tb() > 0L;
    }
    return false;
  }

  public long c(go paramgo)
  {
    switch (dHm.cGn[paramgo.ordinal()]) {
    case 1:
      return this.glE.Tb();
    }
    return 0L;
  }

  public boolean bHo()
  {
    return (this.glE.Tb() > 0L) || (CD() > 0L);
  }

  public boolean l(cYk paramcYk)
  {
    boolean bool = super.l(paramcYk);
    bGI();
    return bool;
  }

  public cCo bHp() {
    return this.glr;
  }

  public bVG bHq() {
    return this.glq;
  }

  public void bc()
  {
    super.bc();
    this.bvc.release();
    if (this.glz != null) {
      this.glz.release();
      this.glz = null;
    }
    bXT.hnW.b(aeU());
    this.glj = 0;
  }

  public void h(Kf paramKf) {
    if (paramKf == null)
      return;
    super.h(paramKf);
    if (paramKf.rQ() == 0)
      switch (dHm.lSj[((dKm)paramKf).ordinal()]) {
      case 1:
        dLE.doY().t("chat.enableInteractions", Boolean.valueOf(!i(dKm.lXI)));
        break;
      case 2:
        boolean bool = i(dKm.lXJ);
        dLE.doY().t("followedAchievements.forceOpen", Boolean.valueOf(bool));
        asv.aEL();
        break;
      case 3:
        dLE.doY().t("callHelpDisabled", Boolean.valueOf(c(paramKf)));
        break;
      case 4:
        dLE.doY().t("lockFightDisabled", Boolean.valueOf(c(paramKf)));
        break;
      case 5:
        dLE.doY().t("cellReportDisabled", Boolean.valueOf(c(paramKf)));
        break;
      case 6:
        dLE.doY().t("hideFightersDisabled", Boolean.valueOf(c(paramKf)));
        break;
      case 7:
        dLE.doY().t("giveUpDisabled", Boolean.valueOf(c(paramKf)));
      }
  }

  static
  {
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(aOb, 0, bwd, bwe.length, bKm.aOb.length);
  }
}