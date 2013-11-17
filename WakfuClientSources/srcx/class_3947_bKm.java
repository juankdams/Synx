import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.script.MobileFunctionsLibrary;
import com.ankamagames.baseImpl.graphics.script.ParticleSystemFunctionsLibrary;
import com.ankamagames.baseImpl.graphics.script.SoundFunctionsLibrary;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.log4j.Logger;

public class bKm extends Su
  implements aGH, bWy, dcw, drG, dzI
{
  public static final String gMi = "skinColorIndex";
  public static final String gMj = "hairColorIndex";
  public static final String gMk = "pupilColorIndex";
  public static final String gMl = "skinColorFactor";
  public static final String gMm = "hairColorFactor";
  public static final String gMn = "clothIndex";
  public static final String gMo = "faceIndex";
  public static final String gMp = "skinDescription";
  public static final String gMq = "hairDescription";
  public static final String gMr = "pupilDescription";
  public static final String gMs = "skinAvailability";
  public static final String gMt = "hairAvailability";
  public static final String gMu = "pupilAvailability";
  public static final String gMv = "illustrationUrl";
  public static final String gMw = "characterChoiceIllustrationUrl";
  public static final String gMx = "characterSheetillustrationUrl";
  public static final String gMy = "setIndex";
  public static final String gMz = "currentTitleId";
  public static final String gMA = "currentTitle";
  public static final String gMB = "currentTitleObject";
  public static final String gMC = "hasGuild";
  public static final String gMD = "hasNation";
  public static final String gME = "characterListNation";
  public static final String gMF = "characterListNationIconUrl";
  public static final String gMG = "citizen";
  public static final String gMH = "breedAptitudesTitle";
  public static final String[] bF;
  public static final String[] aOb;
  protected final bg bwi = new bg();
  protected byte fCH;
  protected byte fCK;
  protected byte fCI;
  protected byte fCL;
  protected byte fCJ;
  protected int aSg;
  protected boolean gMI;
  protected boolean gMJ;
  private boolean gMK;
  protected PX gML = null;

  protected byte gMM = 0;

  private bkd gMN = null;
  protected dKc gMO;
  private static final hQ[] dFP = { ParticleSystemFunctionsLibrary.bjA(), MobileFunctionsLibrary.bbd(), SoundFunctionsLibrary.ckJ() };
  private aBt gMP;
  protected aiq gMQ = aiq.avh();
  private byo gMR;
  private bwe gMS;
  protected AL gMT;
  public boolean bIx = false;
  protected csP gMU;
  private baD gMV = new dKR();
  private final blB gMW;
  private final cIn gMX = new cIn(this);
  protected ahQ gMY;
  private aKJ gMZ = new aKJ();
  private final bHj gNa;
  private final bMG gNb;
  private dRM gNc;
  private short cZu;

  public bKm()
  {
    this.ctj = new bDQ(this);
    this.lcY = new air();
    this.ctk = new cdz(this);
    this.gMW = new blB(4000.0D, (Rx)this.lcY.a(eu.ayM));
    this.ldc.a(ciQ.ckL());
    this.gNa = bFX();
    this.gNb = bFY();
    this.ctu = new dtZ(this.gNb);
    bFw();
  }

  protected bHj bFX() {
    return new dMJ();
  }

  protected bMG bFY() {
    return new bGW();
  }

  public void bFw()
  {
    super.bFw();
    new qN(this, this.bwi.cq());
    new dSu(this, this.bwi.cE());
    new aSs(this, this.bwi.ck());
    new aNQ(this, this.bwi.cl());
    new cIx(this, this.bwi.cM());
    new ceL(this, this.bwi.cC());
    new ahk(this, this.bwi.aQP());
    new bbr(this, this.bwi.cQ());
    new axh(this, this.bwi.cU());
    new hL(this, this.bwi.cX());
    new cgM(this, this.bwi.cY());
    new Tc(this, this.bwi.da());
    new bIe(this, this.bwi.cs());
    new bgO(this, this.bwi.db());
    new abe(this, this.bwi.ct());
    new cKr(this, this.bwi.cz());
    new dew(this, this.bwi.dc());
  }

  public void aJ()
  {
    super.aJ();
    this.gMQ = aiq.avh();
    this.gNb.clear();
    this.gMK = false;
  }

  public void bc()
  {
    if (this.gMP != null) {
      this.gMP.clear();
      this.gMP = null;
    }

    super.bc();
    this.bwi.clear();
    this.gMQ.release();
    this.gMQ = null;
    if (this.gMR != null) {
      this.gMR.release();
      this.gMR = null;
    }

    bRE();
    this.gMV.reset();
    this.gNb.clear();
  }

  public void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.gNc == null) {
      localObject = cBF.isG.xm(paramInt1);
      localcUb = cxD.ilA.b((dlp)localObject);
      this.gNc = new dRM(this, localcUb);
      aeL().a(this.gNc);
    }

    Object localObject = new aCu(this.gNc);
    cUb localcUb = this.gNc.nJ();
    try {
      ((aCu)localObject).lT(paramInt2);
      ((aCu)localObject).lS(paramInt5);

      if ((paramInt3 > 0) && (localcUb.cJk() <= 0))
        ((aCu)localObject).lR(paramInt3);
      else if ((paramInt3 <= 0) && (localcUb.cJk() > 0)) {
        ((aCu)localObject).aOI();
      }

      if ((paramInt4 > 0) && (localcUb.cJq() <= 0)) {
        ((aCu)localObject).lU(paramInt4);
        ((aCu)localObject).w(dDE.dft().VN());
      } else if ((paramInt4 <= 0) && (localcUb.cJq() > 0)) {
        ((aCu)localObject).aOJ();
        ((aCu)localObject).aOK();
      }
    } catch (bvZ localbvZ) {
      K.error("Erreur lors de l'initialisation du familier dans le monde pour le joueur " + this, localbvZ);
    }
  }

  public void bRE() {
    if (this.gNc == null) {
      return;
    }

    if (aeF()) {
      aeL().b(this.gNc);
    }
    this.gNc.detach();
    this.gNc = null;
  }

  public dRM bRF() {
    return this.gNc;
  }

  public void a(aPH paramaPH)
  {
    super.a(paramaPH);

    adp();
    adq();
  }

  public boolean bRG() {
    return this.gMJ;
  }

  public boolean bRH() {
    return this.gMI;
  }

  public blB bRI()
  {
    return this.gMW;
  }

  protected bhh JI()
  {
    return SB.ctz;
  }

  protected byte JJ()
  {
    return 0;
  }

  public boolean JD()
  {
    return false;
  }

  public void iT(int paramInt)
  {
    if (this.aSg == paramInt) {
      return;
    }
    this.aSg = paramInt;
    for (azg localazg : this.lcU) {
      localazg.G(this);
    }
    aek();
  }

  public SB aii()
  {
    return (SB)super.aJp();
  }

  public int oc()
  {
    int i = super.oc();
    if (i != 0) {
      return i;
    }
    return this.aSg;
  }

  public byte bRJ() {
    return this.fCH;
  }

  public void a(byte paramByte1, byte paramByte2, boolean paramBoolean) {
    this.fCH = paramByte1;
    this.fCK = paramByte2;
    if (paramBoolean) {
      bRL();
      dLE.doY().a(this, new String[] { "skinColorIndex", "skinColorFactor" });
    }
  }

  public byte bRK() {
    return this.fCK;
  }

  private void bRL() {
    b(this, this, false);
  }

  public byte bRM() {
    return this.fCJ;
  }

  public void m(byte paramByte, boolean paramBoolean) {
    this.fCJ = paramByte;
    if (paramBoolean) {
      bRN();
      dLE.doY().a(this, new String[] { "pupilColorIndex" });
    }
  }

  private void bRN() {
    aKG localaKG = agt.arQ().a(this.iIO.uO(), bRM(), xK());
    aKG.a(localaKG, aeL(), 8);
  }

  public byte bRO() {
    return this.fCI;
  }

  public byte bRP() {
    return this.fCL;
  }

  public boolean bRQ() {
    return this.gMK;
  }

  public void a(cqm paramcqm)
  {
    super.a(paramcqm);
    if (paramcqm.adb() == eu.ayM)
      this.gMZ.ak(this);
  }

  public void JN()
  {
    ((air)cQY()).a(this);
    bXT.hnW.a(aeU());
  }

  public void JO()
  {
    ((air)cQY()).b(this);
    bXT.hnW.b(aeU());
  }

  public void b(byte paramByte1, byte paramByte2, boolean paramBoolean) {
    this.fCI = paramByte1;
    this.fCL = paramByte2;
    if (paramBoolean) {
      bRR();
      dLE.doY().a(this, new String[] { "hairColorIndex", "hairColorFactor" });
    }
  }

  private void bRR() {
    a(this, this, false);
  }

  public static void a(bKm parambKm, Su paramSu, boolean paramBoolean) {
    aKG localaKG = agt.arQ().c(parambKm);
    aKG.a(localaKG, paramSu.aeL(), 2);
    if (paramBoolean)
      dLE.doY().a(paramSu, new String[] { "hairColorIndex" });
  }

  public static void b(bKm parambKm, Su paramSu, boolean paramBoolean)
  {
    aKG localaKG = agt.arQ().b(parambKm);
    aKG.a(localaKG, paramSu.aeL(), 1);
    if (paramBoolean)
      dLE.doY().a(paramSu, new String[] { "skinColorIndex" });
  }

  protected final void aeo()
  {
    bRR();
    bRN();
    bRL();
  }

  protected final void aer()
  {
    super.aer();
    aeL().chs();
  }

  public aKG[] bRS()
  {
    return agt.arQ().a(uO(), this.fCH, xK());
  }

  public aKG[] bRT() {
    return agt.arQ().b(uO(), this.fCI, xK());
  }

  public void bRU() {
    iT(e(aii().uO(), xK()));
  }

  public static short e(short paramShort, byte paramByte) {
    return Short.valueOf(String.valueOf(paramShort) + String.valueOf(paramByte)).shortValue();
  }

  public void bRV() {
    SB localSB = SB.gG((int)(Math.random() * (SB.values().length - 2) + 1.0D));
    d(localSB);
    bRU();
  }

  public void d(SB paramSB) {
    c(paramSB);
    this.gMM = 0;
    bRU();
  }

  public void cO(byte paramByte)
  {
    super.cO(paramByte);
    bRU();
  }

  public baD JL()
  {
    return this.gMV;
  }

  public void bRW() {
    aKG[] arrayOfaKG1 = agt.arQ().e(aii().uO(), xK());
    double d3;
    if (arrayOfaKG1 != null) {
      double d1 = Math.random() * arrayOfaKG1.length;
      d3 = Math.random() * 4.0D;
      if (d1 == arrayOfaKG1.length) {
        d1 = 0.0D;
      }
      a((byte)(int)d1, (byte)(int)d3, true);
    }
    aKG[] arrayOfaKG2 = agt.arQ().f(aii().uO(), xK());
    if (arrayOfaKG2 != null) {
      double d2 = Math.random() * arrayOfaKG2.length;
      double d4 = Math.random() * 4.0D;
      if (d2 == arrayOfaKG2.length) {
        d2 = 0.0D;
      }
      b((byte)(int)d2, (byte)(int)d4, true);
    }
    aKG[] arrayOfaKG3 = agt.arQ().g(aii().uO(), xK());
    if (arrayOfaKG3 != null) {
      d3 = Math.random() * arrayOfaKG3.length;
      if (d3 == arrayOfaKG3.length) {
        d3 = 0.0D;
      }
      m((byte)(int)d3, true);
    }
  }

  public void bRX() {
    Cs localCs1 = agt.arQ().h(aii().uO(), xK());
    if (localCs1 != null) {
      a(((Byte)localCs1.getFirst()).byteValue(), ((Byte)localCs1.Lp()).byteValue(), true);
    }
    Cs localCs2 = agt.arQ().i(aii().uO(), xK());
    if (localCs2 != null) {
      b(((Byte)localCs2.getFirst()).byteValue(), ((Byte)localCs2.Lp()).byteValue(), true);
    }
    byte b = agt.arQ().j(aii().uO(), xK());
    m(b, true);
  }

  public void bRY() {
    this.m_name = dlV.cTw().cTF();
  }

  public byte bRZ()
  {
    return this.gMM;
  }

  public short bKk()
  {
    short[] arrayOfShort = bCc.bKN().f(aii().uO(), xK());
    return arrayOfShort[this.gMM];
  }

  public void bSa()
  {
    short[] arrayOfShort = bCc.bKN().f(aii().uO(), xK());
    this.gMM = ((byte)(int)(Math.random() * arrayOfShort.length));
    if (this.gMM == arrayOfShort.length) {
      this.gMM = 0;
    }
    cL(arrayOfShort[this.gMM]);
  }

  public void bSb()
  {
    short[] arrayOfShort = bCc.bKN().f(aii().uO(), xK());
    this.gMM = 0;
    if ((arrayOfShort != null) && (arrayOfShort.length > 0))
      cL(arrayOfShort[this.gMM]);
  }

  public void bSc()
  {
    short[] arrayOfShort = bCc.bKN().f(aii().uO(), xK());

    if (arrayOfShort == null) {
      return;
    }

    this.gMM = ((byte)(this.gMM + 1));
    this.gMM = ((byte)f(arrayOfShort, (short)this.gMM));
    cL(arrayOfShort[this.gMM]);
  }

  public void bSd()
  {
    short[] arrayOfShort = bCc.bKN().f(aii().uO(), xK());

    if (arrayOfShort == null) {
      return;
    }

    this.gMM = ((byte)(this.gMM - 1));
    this.gMM = ((byte)f(arrayOfShort, (short)this.gMM));
    cL(arrayOfShort[this.gMM]);
  }

  public short f(short[] paramArrayOfShort, short paramShort)
  {
    if (paramShort >= paramArrayOfShort.length) {
      paramShort = 0;
    }
    if (paramShort < 0) {
      paramShort = (short)(byte)(paramArrayOfShort.length - 1);
    }

    return paramShort;
  }

  public dKc bSe()
  {
    return this.gMO;
  }

  public void a(aDq paramaDq)
  {
    if ((!bB) && (this.gMO != null) && (paramaDq != null)) throw new AssertionError("Warning: replacing current Occupation without removing previous one");
    this.gMO = ((dKc)paramaDq);
  }

  public boolean q(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.gMO == null) {
      return true;
    }
    if (this.gMO.a(paramBoolean1, paramBoolean2)) {
      this.gMO = null;
      return true;
    }
    return false;
  }

  public boolean bSf()
  {
    if (this.gMO == null) {
      return true;
    }
    if (this.gMO.fW()) {
      this.gMO = null;
      return true;
    }
    return false;
  }

  public void bSg()
  {
    bSf();
  }

  public int JE()
  {
    return 0;
  }

  public int dU(int paramInt)
  {
    return 0;
  }

  public int dV(int paramInt)
  {
    return 0;
  }

  public void cL(short paramShort)
  {
    if (a(paramShort, aeL(), xK()))
      dLE.doY().a(this, new String[] { "setIndex" });
  }

  public static boolean a(short paramShort, bAF parambAF, byte paramByte)
  {
    dLB localdLB = bCc.bKN().cm(paramShort);
    if (localdLB != null) {
      boolean bool = false;
      for (bVw localbVw : localdLB) {
        if (localbVw != null) {
          gA localgA = new gA();
          localgA.b(localbVw);
          if (localgA.ol() != null) {
            azO[] arrayOfazO = localgA.ol().nh();
            if (arrayOfazO.length > 0) {
              short s = (short)arrayOfazO[0].hV;
              parambAF.a(localbVw, s, paramByte);
              bool = true;
            }
          }
        } else {
          K.error("Impossible de cree l'item , reference item null");
        }
      }
      return bool;
    }
    K.error("Impossible d'appliquer le set " + paramShort + " à un personnage : set inconnu");
    return false;
  }

  public String[] getFields()
  {
    return aOb;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("skinColorIndex"))
      return Integer.valueOf(bRJ());
    if (paramString.equals("hairColorIndex"))
      return Integer.valueOf(bRO());
    if (paramString.equals("pupilColorIndex"))
      return Integer.valueOf(bRM());
    if (paramString.equals("skinColorFactor"))
      return Integer.valueOf(bRK());
    if (paramString.equals("hairColorFactor"))
      return Integer.valueOf(bRP());
    if (paramString.equals("clothIndex"))
      return Integer.valueOf(afn());
    if (paramString.equals("faceIndex"))
      return Integer.valueOf(afo());
    if (paramString.equals("hairAvailability"))
      return Boolean.valueOf(aVN.blg().l(aii().uO(), xK()));
    if (paramString.equals("skinAvailability"))
      return Boolean.valueOf(aVN.blg().m(aii().uO(), xK()));
    if (paramString.equals("pupilAvailability"))
      return Boolean.valueOf(aVN.blg().n(aii().uO(), xK()));
    String str1;
    if (paramString.equals("hairDescription")) {
      str1 = String.format("breed.hairDescription.%d%d", new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(xK()) });
      if (bU.fH().containsKey(str1)) {
        return bU.fH().getString(str1);
      }
      return bU.fH().getString("characterCreation.hair");
    }
    if (paramString.equals("skinDescription")) {
      str1 = String.format("breed.skinDescription.%d%d", new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(xK()) });
      if (bU.fH().containsKey(str1)) {
        return bU.fH().getString(str1);
      }
      return bU.fH().getString("characterCreation.skin");
    }
    if (paramString.equals("illustrationUrl")) {
      try {
        return String.format(ay.bd().getString("breedIllustrationPath"), new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(xK()) });
      } catch (bdh localbdh1) {
        K.error("Exception", localbdh1);
      }
    } else if (paramString.equals("characterChoiceIllustrationUrl")) {
      try {
        return String.format(ay.bd().getString("breedCharacterChoiceIllustrationPath"), new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(xK()) });
      } catch (bdh localbdh2) {
        K.error("Exception", localbdh2);
      }
    } else if (paramString.equals("characterSheetillustrationUrl")) {
      try {
        return String.format(ay.bd().getString("breedContactListIllustrationPath"), new Object[] { Short.valueOf(uO()), Byte.valueOf(xK()) });
      } catch (bdh localbdh3) {
        K.error("Exception", localbdh3);
      }
    } else { if (paramString.equals("currentTitle")) {
        if (this.gMN == null) {
          return null;
        }
        return this.gMN.getDescription();
      }
      if (paramString.equals("currentTitleId")) {
        if (this.gMN == null) {
          return Integer.valueOf(-1);
        }
        return Short.valueOf(this.gMN.nc());
      }
      if (paramString.equals("secondarySkinColors"))
        return bRS();
      if (paramString.equals("secondaryHairColors"))
        return bRT();
      if (paramString.equals("currentTitleObject"))
        return this.gMN;
      if (paramString.equals("hasGuild"))
        return Boolean.valueOf(bSw());
      if (paramString.equals("hasNation"))
        return Boolean.valueOf(bSh());
      if (paramString.equals("characterListNation"))
        return bU.fH().b(39, bXb.cci().aL(this), new Object[0]);
      if (paramString.equals("characterListNationIconUrl"))
        return ay.bd().a("nationFlagIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(bXb.cci().aL(this)) });
      if (paramString.equals("citizen"))
        return cJf();
      if (paramString.equals("breedAptitudesTitle"))
        return bU.fH().getString("breed.aptitudes", new Object[] { aet().getName() });
      if (paramString.equals("pupilDescription")) {
        String str2 = String.format("breed.pupilDescription.%d%d", new Object[] { Short.valueOf(aii().uO()), Byte.valueOf(xK()) });
        if (bU.fH().containsKey(str2)) {
          return bU.fH().getString(str2);
        }
        return bU.fH().getString("characterCreation.pupil");
      }
    }

    return super.getFieldValue(paramString);
  }

  public boolean bSh() {
    return cJf().UI() != aYr.feh;
  }

  public bg bSi()
  {
    return this.bwi;
  }

  public boolean l(String paramString)
  {
    if (paramString.equals("skinColorIndex"))
      return true;
    if (paramString.equals("hairColorIndex"))
      return true;
    if (paramString.equals("pupilColorIndex"))
      return true;
    if (paramString.equals("hairColorFactor"))
      return true;
    if (paramString.equals("skinColorFactor")) {
      return true;
    }
    return super.l(paramString);
  }

  public PX aeu()
  {
    return this.gML;
  }

  protected String JG()
  {
    return "Smiley_" + uO() + xK();
  }

  protected String JH()
  {
    return "playerGfxPath";
  }

  public void initialize()
  {
    ayK().a(this, bEY());
    ayD();
  }

  public void gQ(long paramLong)
  {
    if (!adF())
      bRI().cU(paramLong);
  }

  public void aeV()
  {
    Ks localKs = this.bwi.cC();
    aeU().clear();
    if (localKs != null) {
      if (localKs.bWN != null) {
        ayK().a(localKs.bWN.data, bEY());
      }
      if (localKs.bWO != null) {
        ayK().a(localKs.bWO.dSK, this.ldc, this);
      }
    }

    this.aEM.a(cMI.krY);
  }

  public void q(dle paramdle)
  {
  }

  public void JC()
  {
    if (adF()) {
      this.lcY.acY();
      this.gMZ.reset();
      cQv();
    }
  }

  public cCH bSj() {
    return cCH.ivi;
  }

  public bkd bSk() {
    return this.gMN;
  }

  public short bSl() {
    return this.gMN != null ? this.gMN.nc() : -1;
  }

  public String bSm() {
    return this.gMN != null ? this.gMN.getDescription() : null;
  }

  public void bA(short paramShort) {
    a(new bkd(paramShort));
  }

  public void a(bkd parambkd) {
    this.gMN = parambkd;

    dLE.doY().a(this, new String[] { "currentTitleId", "currentTitle", "currentTitleObject" });
  }

  public void aea()
  {
    super.aea();

    if (!aeQ().aEt().dts()) {
      fz(false);
    }

    if ((!aeQ().de(getId())) && 
      (e(eu.ayM) < 1) && (aJu()))
      d(eu.ayM).set(1);
  }

  protected void bSn()
  {
    super.bSn();
    adq();
  }

  public byo bSo() {
    return this.gMR;
  }

  public int bSp()
  {
    int i = super.bSp();
    float f = bSo() != null ? 2.0F : 1.0F;
    return (int)(i / f);
  }

  public int bSq()
  {
    int i = super.bSq();
    float f = bSo() != null ? 2.0F : 1.0F;
    return (int)(i / f);
  }

  public void m(byo parambyo) {
    this.gMR = parambyo;
    this.gMR.aeL().fR((byte)8);
    this.gMR.n(this.cGk);
    this.gMR.bn(true);
    CA.Lv().p(this.gMR);
    this.gMR.aeV();
    this.gMR.c(this.aEM.E());

    if ((this.aEM.getEntity().mnT & 0x1) != 0) {
      this.gMR.aeL().getEntity().mnT |= 1;
    }
    this.aEM.getEntity().mnT &= -3;
    this.gMR.aeL().getEntity().mnT &= -3;

    this.gMR.aeL().n(this.aEM);

    this.aEM.b(this.gMR.aeL());
    WakfuClientInstance.awy().Dg().c(this.gMR.aeL());

    float[] arrayOfFloat1 = new aKG(6, bCO.bLk(), bCO.bLk(), bCO.bLk()).bcl();
    float[] arrayOfFloat2 = new aKG(7, bCO.bLk(), bCO.bLk(), bCO.bLk()).bcl();
    this.gMR.aeL().e(6, arrayOfFloat1);
    this.gMR.aeL().e(7, arrayOfFloat2);

    this.gMR.aeL().dB(2.0F);
  }

  public void bHm() {
    if (this.gMR != null)
    {
      if ((this.gMR.aeL().getEntity().mnT & 0x1) != 0) {
        this.gMR.aeL().getEntity().mnT &= -2;
      }

      this.gMR.aeL().o(aeL());
      WakfuClientInstance.awy().Dg().c(this.aEM);

      CA.Lv().r(this.gMR);
      this.gMR = null;
      this.aEM.b(this.gMS);
      this.gMS = null;
      this.aEM.setVisible(true);
      this.aEM.dB(1.0F);
    } else {
      K.warn("On fait descendre le joueur de sa monture alors qu'il n'en a pas");
    }
  }

  public cew aeL()
  {
    if (this.gMR != null) {
      return this.gMR.aeL();
    }
    return super.aeL();
  }

  public boolean aeF()
  {
    if (this.gMR != null) {
      return this.gMR.aeF();
    }
    return super.aeF();
  }

  public float JK()
  {
    return this.gMT == null ? 0.0F : this.gMT.JX();
  }

  public AL bSr() {
    return this.gMT;
  }

  public void rA(int paramInt)
  {
    Float localFloat = this.gMT == null ? null : Float.valueOf(this.gMT.JX());
    if (this.gMT == null) {
      this.gMT = new AL();
    }
    this.gMT.setValue(paramInt);
    if (localFloat == null) {
      return;
    }

    if ((byv.bFN().bFO().adF()) && (aeR() != byv.bFN().bFO().aeR()))
    {
      return;
    }

    int i = this.gMT.JX() - localFloat.floatValue() > 0.0F ? 1 : 0;
    FreeParticleSystem localFreeParticleSystem = cof.cop().vY(i != 0 ? 800067 : 800068);
    if (localFreeParticleSystem == null) {
      return;
    }

    localFreeParticleSystem.b(aeL());
    cWS.cKD().b(localFreeParticleSystem);
  }

  private void b(csP paramcsP) {
    this.gMU = paramcsP;
  }

  public void ayD()
  {
    if (aeI())
      super.ayD();
    else {
      this.gMX.cCq();
    }
    b("reloadItemEffects", new doD(this));
  }

  public void n(aVc paramaVc)
  {
    super.n(paramaVc);
    int i = (paramaVc.wa() != null) && (paramaVc.wa().nS() == 28) ? 1 : 0;
    int j = (paramaVc.wa() != null) && (paramaVc.wa().nS() == 32) ? 1 : 0;
    if ((i == 0) && (j == 0)) {
      return;
    }

    ayK().G(paramaVc);
  }

  public dCi auK()
  {
    if (this.gMY == null) {
      return null;
    }
    return this.gMY.auK();
  }

  public dCi auL()
  {
    if (this.gMY == null) {
      return null;
    }
    return this.gMY.auL();
  }

  public void a(dVs paramdVs)
  {
    if (this.gMY == null) {
      this.gMY = new ahQ(this);
    }

    this.gMY.auK().c(paramdVs);
  }

  public apX bV(long paramLong)
  {
    if (this.gMY == null) {
      return null;
    }

    return this.gMY.bV(paramLong);
  }

  public Iterable aeA()
  {
    if (this.gMY == null) {
      return null;
    }

    return this.gMY.aeA();
  }

  public ahQ bSs()
  {
    return this.gMY;
  }

  public long c(go paramgo)
  {
    switch (doB.cGn[paramgo.ordinal()]) {
    case 1:
      Fs localFs = byv.bFN().bFO().bHj().Ta();
      if (localFs == null) {
        return -1L;
      }
      return localFs.kp(getId()) != null ? localFs.getId() : -1L;
    }

    return -1L;
  }

  public boolean bHo()
  {
    return false;
  }

  public bMG bSt() {
    return this.gNb;
  }

  public bHj bSu()
  {
    return this.gNa;
  }

  public boolean bSv() {
    if (cJf().UI().bnA() == Lk()) {
      return true;
    }
    return false;
  }

  public boolean bSw()
  {
    return this.gNb.CD() > 0L;
  }

  public long CD() {
    return this.gNb.CD();
  }

  public void a(int paramInt, HashMap paramHashMap, boolean paramBoolean)
  {
    super.a(paramInt, paramHashMap, paramBoolean);
    HashMap localHashMap = new HashMap();
    localHashMap.put("playerId", Long.valueOf(getId()));
    if (paramHashMap != null) {
      localHashMap.putAll(paramHashMap);
    }
    if ((!bB) && (dlD.cTt().getPath() == null)) throw new AssertionError();
    String str = String.format("emotes/%d%s", new Object[] { Integer.valueOf(paramInt), dlD.cTt().getExtension() });
    dlD.cTt().a(str, dFP, localHashMap, null, false);
  }

  protected uP eK(long paramLong) {
    this.cZu = PF.abu().cF(paramLong);
    return uP.biS;
  }

  public short nU()
  {
    return this.cZu;
  }

  public void g(long paramLong, short paramShort)
  {
  }

  public aiq bSx() {
    return this.gMQ;
  }

  public void bSy() {
    dLE.doY().a(this, new String[] { "level", "levelValue" });
    bGl();
  }

  protected void bGl()
  {
  }

  public byte JM() {
    return 0;
  }

  public int a(bG parambG, int paramInt) {
    return this.gMV.a(parambG, paramInt);
  }

  public String toString()
  {
    if (aet() != null) {
      return super.toString() + " " + aet().getName();
    }
    return super.toString();
  }

  public void a(bXL parambXL)
  {
    super.a(parambXL);
    if (this.gMP != null)
      this.gMP.a(parambXL);
  }

  public void h(Kf paramKf)
  {
    if (paramKf == null) {
      return;
    }
    super.h(paramKf);
    if (paramKf.rQ() == 1)
      switch (doB.bwy[((cfY)paramKf).ordinal()]) {
      case 1:
      case 2:
        adq();
        break;
      case 3:
        aeC();
      }
  }

  public Su a(long paramLong, cYk paramcYk, short paramShort, csi paramcsi, boolean paramBoolean, aZx paramaZx)
  {
    Su localSu = super.a(paramLong, paramcYk, paramShort, paramcsi, paramBoolean, paramaZx);

    a(this, localSu, true);
    b(this, localSu, true);

    return localSu;
  }

  public dzC afg()
  {
    return bwX.k(this);
  }

  public cjh afh()
  {
    if ((this.iIO != null) && (this.iIO == SB.ctE)) {
      return cpm.coW();
    }

    return super.afh();
  }

  public int afq()
  {
    float f = JK();

    if (Math.abs(f) < 0.3F) {
      return super.afq();
    }

    if (f < 0.0F) {
      return 900018;
    }
    return 900017;
  }

  public int afr()
  {
    float f = JK();

    if (Math.abs(f) < 0.3F) {
      return super.afr();
    }

    if (f < 0.0F) {
      return 900021;
    }
    return 900020;
  }

  public aBt bSz() {
    return this.gMP;
  }

  public void a(aBt paramaBt) {
    this.gMP = paramaBt;
  }

  public boolean a(afC paramafC)
  {
    return afC.cYz.a(paramafC);
  }

  public String a(dle paramdle, Iterable paramIterable)
  {
    ArrayList localArrayList = new ArrayList();

    paramdle.atO();

    KR localKR = new KR();
    adz localadz = new adz();

    for (Object localObject1 = paramIterable.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = ((Iterator)localObject1).next();
      short s = 0;
      Object localObject4;
      Iterator localIterator1;
      if ((localObject2 instanceof gA)) {
        localObject4 = (gA)localObject2;
        if (ayJ().ajz().a((dsj)localObject4, this, ayL()))
        {
          int m = ((gA)localObject4).oi().getId();
          if (!localadz.contains(m)) {
            s = ((gA)localObject4).oi().bKk();
            localadz.hL(m);
          }
          if (((gA)localObject4).isActive()) {
            localIterator1 = ((gA)localObject4).iterator();
          }
        }
      }
      else if ((localObject2 instanceof bVw)) {
        localObject4 = (bVw)localObject2;

        if (!localadz.contains(((bVw)localObject4).getId())) {
          s = ((bVw)localObject4).bKk();
          localadz.hL(((bVw)localObject4).getId());
        }
        localIterator1 = ((bVw)localObject4).bKh();

        if (s != 0) {
          if (localKR.contains(s))
            localKR.a(s, localKR.L(s) + 1);
          else {
            localKR.a(s, 1);
          }

        }

        while (localIterator1.hasNext())
          localArrayList.add(localIterator1.next());
      }
    }
    Object localObject2;
    localObject1 = localKR.Vo();
    while (((dyO)localObject1).hasNext()) {
      ((dyO)localObject1).fl();

      localObject2 = bCc.bKN().cm(((dyO)localObject1).fm());

      localObject3 = ((dLB)localObject2).wL(((dyO)localObject1).value());

      int j = 0; for (int k = ((ArrayList)localObject3).size(); j < k; j++) {
        bog localbog = (bog)((ArrayList)localObject3).get(j);
        Iterator localIterator2 = localbog.iterator();
        while (localIterator2.hasNext()) {
          dpI localdpI = (dpI)localIterator2.next();
          localArrayList.add(localdpI);
        }
      }
    }

    int i = 0;

    Object localObject3 = new aYM(bU.fH(), localArrayList, (short)0);

    return ((aYM)localObject3).m(paramdle);
  }

  public bKm bSA() {
    byz localbyz = new byz();
    localbyz.c(this.iIO);
    localbyz.cO(this.aHn);
    localbyz.setName(getName());
    localbyz.iT(this.aSg);
    localbyz.b(this.fCI, this.fCL, true);
    localbyz.a(this.fCH, this.fCK, true);
    localbyz.m(this.fCJ, true);
    localbyz.e(afn(), true);
    localbyz.ctu = this.ctu;
    bZH localbZH = ayJ();
    for (Iterator localIterator = localbZH.iterator(); localIterator.hasNext(); ) {
      gA localgA = (gA)localIterator.next();
      ge localge = localgA.oi().bKn();
      azO localazO;
      for (localazO : localge.nh()) {
        try {
          localbyz.ayJ().b(localgA, (short)localazO.bJ());
        } catch (dI localdI1) {
          localdI1.printStackTrace();
        } catch (dcF localdcF1) {
          localdcF1.printStackTrace();
        } catch (bQT localbQT1) {
          localbQT1.printStackTrace();
        }
      }
      for (localazO : localge.nj())
        try {
          localbyz.ayJ().b(localgA, (short)localazO.bJ());
        } catch (dI localdI2) {
          localdI2.printStackTrace();
        } catch (dcF localdcF2) {
          localdcF2.printStackTrace();
        } catch (bQT localbQT2) {
          localbQT2.printStackTrace();
        }
    }
    localbyz.aek();
    return localbyz;
  }

  static
  {
    bF = new String[] { "skinColorIndex", "hairColorIndex", "pupilColorIndex", "illustrationUrl", "characterChoiceIllustrationUrl", "setIndex", "hairDescription", "skinDescription", "pupilDescription", "currentTitleId", "currentTitle", "currentTitleObject", "hasGuild", "hasNation" };

    aOb = new String[bF.length + Su.bF.length];
    System.arraycopy(bF, 0, aOb, 0, bF.length);
    System.arraycopy(Su.bF, 0, aOb, bF.length, Su.bF.length);
  }
}