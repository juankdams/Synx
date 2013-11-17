import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import org.apache.log4j.Logger;

public class Jd
  implements cvW
{
  private static Logger K = Logger.getLogger(Jd.class);

  private static final Jd bSh = new Jd();

  private boolean bSi = false;
  private boolean bSj;
  private ArrayList bSk;
  private int bSl;
  private int bSm;
  private long iI = -1L;
  private String bSn;
  private bNO bSo = bNO.gSK;

  public static final String[] bSp = { "AnimEmote-Repos", "AnimEmote-Victoire", "AnimEmote-Effrayee", "AnimEmote-Bailler", "AnimEmote-Rire", "AnimEmote-Huss-Debut", "AnimEmote-Chercher", "AnimEmote-Huss-Debut" };
  public static final String bSq = "AnimEmote-Coucou";
  public static final String bSr = "AnimStatique";
  public static final String bSs = "AnimStatique02";
  public static final int bSt = 7500;
  public static final int bSu = 5000;
  private static final Random bSv = new Random(System.currentTimeMillis());
  private cag baa;
  private auC bSw;
  private ccG bSx;
  private short bSy;
  private czv bSz;
  private czv bSA;
  private czv bSB;
  private static final cYR bSC = new cYR();

  private final Collection bSD = new ArrayList();

  public static Jd Ss()
  {
    return bSh;
  }

  public void g(long paramLong)
  {
    this.iI = paramLong;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }

  public void a(bNO parambNO) {
    this.bSo = parambNO;
  }

  private static void a(bKm parambKm, boolean paramBoolean) {
    parambKm.aei();
    parambKm.e((byte)0, false);
    parambKm.f((byte)0, false);
    parambKm.aej();

    if (paramBoolean) {
      dLE.doY().t("characterCreation.currentDressStyleIndex", Integer.valueOf(parambKm.afn() + 1));
      dLE.doY().t("characterCreation.currentHairStyleIndex", Integer.valueOf(parambKm.afo() + 1));
      dLE.doY().t("characterCreation.totalDressStyleIndex", Integer.valueOf(agt.arQ().b(parambKm.uO(), parambKm.xK() == 0)));

      dLE.doY().t("characterCreation.totalHairStyleIndex", Integer.valueOf(agt.arQ().c(parambKm.uO(), parambKm.xK() == 0)));
    }
  }

  public bKm St()
  {
    bKm localbKm = (bKm)dLE.doY().rv("characterCreation.editablePlayerInfo");
    if (localbKm == null) {
      localbKm = new bKm();
      dLE.doY().t("characterCreation.editablePlayerInfo", localbKm);
    }
    return localbKm;
  }

  public boolean a(cWG paramcWG)
  {
    dLE localdLE = dLE.doY();
    bKm localbKm = St();
    Object localObject1;
    Object localObject2;
    if ((paramcWG instanceof dKQ)) {
      cAo.cxf().b(this);
      if ((!this.bSi) && (localbKm != null) && ((localbKm.E() == CG.bFI) || (localbKm.E() == CG.bFG))) {
        localObject1 = localbKm.aeL();
        localObject2 = ((cew)localObject1).ata();
        if (((String)localObject2).equals(((cew)localObject1).atp())) {
          String str = SC();
          this.bSw.setAnimName(str);
          localdLE.bk("characterCreation.editablePlayerInfo", "actorDescriptorLibrary");
          localdLE.bk("characterCreation.editablePlayerInfo", "actorLinkage");
        } else {
          ((cew)localObject1).eq(((cew)localObject1).atp());
        }
      }

      SB();

      return false;
    }
    int j;
    byte b2;
    byte b3;
    int i;
    int k;
    byte b1;
    switch (paramcWG.getId())
    {
    case 16513:
      cgG.ciL().gV(true);
      byv.bFN().a(cgG.ciL());

      byv.bFN().b(aPz.bgu());

      return false;
    case 16512:
      localObject1 = (cgZ)paramcWG;
      a(localbKm, ((cgZ)localObject1).getStringValue());
      return false;
    case 16515:
      localObject1 = (dcT)paramcWG;
      localObject2 = ((dcT)localObject1).cOm();
      if (a(localbKm, (UT)localObject2)) {
        return false;
      }

      return false;
    case 16516:
      localObject1 = (cgZ)paramcWG;
      j = ((cgZ)localObject1).af();
      if (localbKm.xK() == j) {
        return false;
      }
      if (this.bSi) {
        return false;
      }

      ac(j);
      SM();

      return false;
    case 16517:
      localObject1 = (cgZ)paramcWG;
      SJ();
      SK();

      j = localdLE.rv("characterCreation.hairColorChosen") != null ? 1 : 0;
      b2 = bCO.cp(((cgZ)localObject1).ag());
      b3 = bCO.cq(((cgZ)localObject1).ag());
      if (j == 0) {
        this.bSy = bCO.l(localbKm.bRO(), localbKm.bRP());
      }
      localdLE.t("characterCreation.hairColorChosen", agt.arQ().b(localbKm.uO(), b2, localbKm.xK()));

      localbKm.b(b2, b3, true);
      localdLE.a(localbKm, new String[] { "actorDescriptorLibrary", "secondaryHairColors" });

      return false;
    case 16518:
      localObject1 = (cgZ)paramcWG;
      SI();
      SK();

      j = localdLE.rv("characterCreation.skinColorChosen") != null ? 1 : 0;
      b2 = bCO.cp(((cgZ)localObject1).ag());
      b3 = bCO.cq(((cgZ)localObject1).ag());
      if (j == 0) {
        this.bSy = bCO.l(localbKm.bRJ(), localbKm.bRK());
      }
      localdLE.t("characterCreation.skinColorChosen", agt.arQ().a(localbKm.uO(), b2, localbKm.xK()));

      localbKm.a(b2, b3, true);
      localdLE.a(localbKm, new String[] { "actorDescriptorLibrary", "secondarySkinColors" });

      return false;
    case 16524:
      SJ();
      SI();

      localObject1 = (cgZ)paramcWG;
      j = bCO.cp(((cgZ)localObject1).ag());
      localbKm.m(j, true);
      localdLE.a(localbKm, new String[] { "actorDescriptorLibrary" });

      return false;
    case 16525:
      i = agt.arQ().c(localbKm.uO(), localbKm.xK() == 0);
      j = (byte)dLE.doY().rr("characterCreation.currentHairStyleIndex");
      j = (byte)(j + 1);
      if (j > i) {
        k = 1;
      }

      localbKm.f((byte)(k - 1), true);
      dLE.doY().t("characterCreation.currentHairStyleIndex", Byte.valueOf(k));

      return false;
    case 16526:
      i = agt.arQ().c(localbKm.uO(), localbKm.xK() == 0);
      k = (byte)dLE.doY().rr("characterCreation.currentHairStyleIndex");
      k = (byte)(k - 1);
      if (k <= 0) {
        k = (byte)i;
      }
      localbKm.f((byte)(k - 1), true);
      dLE.doY().t("characterCreation.currentHairStyleIndex", Byte.valueOf(k));

      return false;
    case 16527:
      i = agt.arQ().b(localbKm.uO(), localbKm.xK() == 0);
      k = (byte)dLE.doY().rr("characterCreation.currentDressStyleIndex");
      k = (byte)(k + 1);
      if (k > i) {
        b1 = 1;
      }

      localbKm.e((byte)(b1 - 1), true);
      dLE.doY().t("characterCreation.currentDressStyleIndex", Byte.valueOf(b1));

      return false;
    case 16528:
      i = agt.arQ().b(localbKm.uO(), localbKm.xK() == 0);
      b1 = (byte)dLE.doY().rr("characterCreation.currentDressStyleIndex");
      b1 = (byte)(b1 - 1);
      if (b1 <= 0) {
        b1 = (byte)i;
      }
      localbKm.e((byte)(b1 - 1), true);
      dLE.doY().t("characterCreation.currentDressStyleIndex", Byte.valueOf(b1));

      return false;
    case 16529:
      i = agt.arQ().b(localbKm.uO(), localbKm.xK() == 0);
      int m = bCO.sf(i) + 1;

      int n = agt.arQ().c(localbKm.uO(), localbKm.xK() == 0);
      int i1 = bCO.sf(n) + 1;

      int i2 = agt.arQ().a(localbKm.uO(), localbKm.xK());
      int i3 = bCO.sf(i2);
      int i4 = bCO.sf(8);

      int i5 = agt.arQ().b(localbKm.uO(), localbKm.xK());
      int i6 = bCO.sf(i5);
      int i7 = bCO.sf(8);

      int i8 = agt.arQ().c(localbKm.uO(), localbKm.xK());
      int i9 = bCO.sf(i8);

      localbKm.e((byte)(m - 1), true);
      dLE.doY().t("characterCreation.currentDressStyleIndex", Integer.valueOf(m));

      localbKm.f((byte)(i1 - 1), true);
      dLE.doY().t("characterCreation.currentHairStyleIndex", Integer.valueOf(i1));

      localbKm.a((byte)i3, (byte)i4, true);
      localdLE.a(localbKm, new String[] { "actorDescriptorLibrary", "secondarySkinColors" });

      localbKm.b((byte)i6, (byte)i7, true);
      localdLE.a(localbKm, new String[] { "actorDescriptorLibrary", "secondaryHairColors" });

      localbKm.m((byte)i9, true);
      localdLE.a(localbKm, new String[] { "actorDescriptorLibrary" });
      return false;
    case 16514:
    case 16519:
    case 16520:
    case 16521:
    case 16522:
    case 16523: } return true;
  }

  private boolean a(bKm parambKm, UT paramUT) {
    SB localSB = paramUT.aii();
    if (parambKm.aii() == localSB) {
      return true;
    }
    if (this.bSi) {
      return true;
    }
    if (!paramUT.isEnabled()) {
      return true;
    }

    if ((localSB == SB.ctP) && (parambKm.xK() == 1)) {
      return true;
    }
    if ((paramUT instanceof dnK)) {
      UT localUT = null;

      while ((localUT == null) || (localUT.aii() == parambKm.aii()) || ((localUT.aii() == SB.ctP) && (parambKm.xK() == 1))) {
        localUT = (UT)this.bSk.get(b(this.bSo));
        K.error(localUT.aii().name());
      }
      a(localUT);
    } else {
      a(paramUT);
    }
    Sv();
    return false;
  }

  public bNO Su() {
    return this.bSo;
  }

  private boolean Sv() {
    cpa localcpa = cBQ.cxL().coO().nf("characterCreationDialog");
    if (localcpa == null) {
      return true;
    }
    aTp localaTp = (aTp)localcpa.fi("nameHelpTextEditor");

    zC.Ip().e(localaTp);

    dRq localdRq = (dRq)localcpa.fi("mainContainer");
    czv localczv = (czv)localcpa.fi("bigBackground");

    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localczv.getAppearance());
    localArrayList.add(this.bSw);
    localdRq.J(dHx.class);
    localdRq.J(aga.class);
    this.bSw.setModulationColor(bNa.gRu);
    localczv.setModulationColor(bNa.gRu);
    dka.cSF().a(new aZ(this, localdRq, localArrayList), 100L, 1);

    return false;
  }

  private boolean a(bKm parambKm, byte paramByte) {
    this.bSj = false;
    if ((paramByte == 1) && (!dLE.doY().getBooleanProperty("characterCreation.femaleEnabled"))) {
      paramByte = 0;
      this.bSj = true;
    }
    if (parambKm.xK() == paramByte) {
      return true;
    }
    a(parambKm, paramByte, true);
    dLE.doY().t("characterCreation.currentDressStyleIndex", Integer.valueOf(parambKm.afn() + 1));
    dLE.doY().t("characterCreation.currentHairStyleIndex", Integer.valueOf(parambKm.afo() + 1));
    dLE.doY().t("characterCreation.totalDressStyleIndex", Integer.valueOf(agt.arQ().b(parambKm.uO(), parambKm.xK() == 0)));

    dLE.doY().t("characterCreation.totalHairStyleIndex", Integer.valueOf(agt.arQ().c(parambKm.uO(), parambKm.xK() == 0)));

    ab(paramByte);
    return false;
  }

  private void a(bKm parambKm, String paramString) {
    aWc.blo().eO(600003L);

    parambKm.setName(paramString);

    ckU.cmE().ak(true).g(bU.fH().getString("createCharacter.progress"), 0);

    blC localblC = new blC();
    localblC.g(this.iI);
    localblC.bR(parambKm.aii().uO());
    localblC.cU(parambKm.afn());
    localblC.cV(parambKm.afo());
    localblC.cQ(parambKm.bRO());
    localblC.cT(parambKm.bRP());
    localblC.cP(parambKm.bRJ());
    localblC.cS(parambKm.bRK());
    localblC.cR(parambKm.bRM());
    localblC.cO(parambKm.xK());
    localblC.setName(parambKm.getName());
    byv.bFN().aJK().d(localblC);

    bXb.cci().aN(parambKm);
  }

  private void a(bKm parambKm, byte paramByte, boolean paramBoolean) {
    dLE localdLE = dLE.doY();
    parambKm.cO(paramByte);

    parambKm.bRU();
    parambKm.bSb();
    parambKm.bRX();
    a(parambKm);
    a(parambKm, paramBoolean);
    if (paramBoolean) {
      localdLE.t("characterCreation.hairColorChosen", null);
      localdLE.t("characterCreation.skinColorChosen", null);
      localdLE.t("characterCreation.pupilColorChosen", null);
    }
  }

  public long getId() {
    return hashCode();
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      ckU.cmE().ak(true);
      this.bSm = -2147483648;
      SP();
      this.bSy = -1;

      SA();

      dLE.doY().t("characterCreation.overBreed", null);
      dLE.doY().t("characterCreation.describedMainSpell", null);
      dLE.doY().t("characterCreation.hairColorChosen", null);
      dLE.doY().t("characterCreation.skinColorChosen", null);
      dLE.doY().t("characterCreation.pupilColorChosen", null);
      dLE.doY().t("characterCreation.breedOver", null);
      dLE.doY().t("characterCreation.randomNameActivated", Boolean.valueOf(Sw()));
      dLE.doY().t("characterCreation.enableCancel", Boolean.valueOf(this.bSo.bVk()));

      boolean bool = bBc.b(byv.bFN().bFQ().bOR(), bBc.gtf);
      dLE.doY().t("characterCreation.regex", bool ? "[\\p{L} '-\\[\\]]+" : "[\\p{L} '-]+");
      dLE.doY().t("characterCreation.maxChars", Short.valueOf((short)25));

      String str = "characterCreationDialog";
      aNL localaNL = cBQ.cxL().a("characterCreationDialog", VV.dJ("characterCreationDialog"), 8192L, (short)10000);

      c(localaNL);

      this.bSA = ((czv)localaNL.getElementMap().fi("maleImage"));
      this.bSB = ((czv)localaNL.getElementMap().fi("femaleImage"));
      this.bSw = ((auC)localaNL.getElementMap().fi("characterAEV"));
      Sy();

      dJt.setCreateCharacterFlag(false);
      cBQ.cxL().j("wakfu.characterCreation", dJt.class);

      aWc.blo().eO(600012L);

      aWc.blo().blv();

      SQ();
    }
  }

  private boolean Sw() {
    if (!bU.fH().ajJ().cBa())
      return false;
    return ay.bd().getBoolean("enableRandomCharacterName", true);
  }

  private void c(aNL paramaNL) {
    this.bSx = ((ccG)paramaNL.getElementMap().fi("breedList2"));
    this.bSz = ((czv)paramaNL.getElementMap().fi("breedIllustration"));

    this.bSx.a(new aY(this));
  }

  public void Sx()
  {
    cpa localcpa = cBQ.cxL().coO().nf("characterCreationDialog");
    caF localcaF = (caF)localcpa.fi("characterNameEditorText");
    localcaF.J(gm.class);
    localcaF.setVisible(false);
  }

  private void Sy() {
    cpa localcpa = cBQ.cxL().coO().nf("characterCreationDialog");
    caF localcaF = (caF)localcpa.fi("characterNameEditorText");
    bNa localbNa1 = new bNa(bNa.gRx);
    bNa localbNa2 = new bNa(bNa.gRu);

    localcaF.J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, localcaF, 0, 1000, -1, true, ddp.kWG);
    localcaF.a(localgm);
  }

  private int Sz() {
    return bCO.sf(this.bSk.size() - 1);
  }

  private int a(SB paramSB) {
    int i = 0; for (int j = this.bSk.size(); i < j; i++) {
      UT localUT = (UT)this.bSk.get(i);
      if (localUT.aii() == paramSB)
        return i;
    }
    return 0;
  }

  private int b(bNO parambNO) {
    if (parambNO.bVj()) {
      return a(SB.ctQ);
    }
    int i;
    do
      i = Sz();
    while (((UT)this.bSk.get(i)).aii() == SB.ctQ);
    return i;
  }

  private void SA()
  {
    this.bSk = new ArrayList();
    Zp[] arrayOfZp = aQC.bhe().bhh();
    for (int i = 0; i < arrayOfZp.length; i++)
    {
      SB localSB = arrayOfZp[i].aii();

      if (bNl.e(localSB))
      {
        UT localUT = new UT(localSB);
        localUT.gX(bSC.get(localSB));
        localUT.setEnabled(localUT.aii() != SB.ctQ ^ this.bSo.bVj());

        this.bSk.add(localUT);
      }
    }
    i = 0;
    int j = 0; for (int k = this.bSk.size(); j < k; j++) {
      if (((UT)this.bSk.get(j)).isEnabled()) {
        i++;
      }
    }

    dnK localdnK = new dnK(this, null);
    localdnK.setEnabled(i > 1);
    this.bSk.add(localdnK);
    Collections.sort(this.bSk, new be(this));

    dLE.doY().t("characterCreation.breedInfoList", this.bSk);
    dLE.doY().t("characterCreation.breedsAvailableNumber", Integer.valueOf(arrayOfZp.length));
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.iI = -1L;
      this.bSn = null;
      this.bSo = bNO.gSK;
      this.bSy = -1;
      this.bSk.clear();

      for (Object localObject1 = this.bSD.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (uz)((Iterator)localObject1).next();
        ((uz)localObject2).axl();
      }
      this.bSD.clear();

      St().aeL().dispose();
      localObject1 = (ArrayList)dLE.doY().rv("characterCreation.breedInfoList");
      for (Object localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { bKm localbKm = (bKm)((Iterator)localObject2).next();
        localbKm.release();
      }
      localObject2 = (bKm)dLE.doY().rv("characterCreation.editablePlayerInfo");
      if (localObject2 != null) {
        ((bKm)localObject2).release();
      }

      dLE.doY().removeProperty("characterCreation.editablePlayerInfo");
      dLE.doY().removeProperty("characterCreation.overBreed");
      dLE.doY().removeProperty("characterCreation.breedInfoList");
      dLE.doY().removeProperty("characterCreation.breedsAvailableNumber");
      dLE.doY().removeProperty("characterCreation.hairColorChosen");
      dLE.doY().removeProperty("characterCreation.skinColorChosen");
      dLE.doY().removeProperty("characterCreation.pupilColorChosen");
      dLE.doY().removeProperty("characterCreation.currentHairStyleIndex");
      dLE.doY().removeProperty("characterCreation.totalHairStyleIndex");
      dLE.doY().removeProperty("characterCreation.currentDressStyleIndex");
      dLE.doY().removeProperty("characterCreation.totalDressStyleIndex");
      dLE.doY().removeProperty("characterCreation.breedOver");
      dLE.doY().removeProperty("characterCreation.randomNameActivated");

      cBQ.cxL().mW("characterCreationDialog");

      cBQ.cxL().mN("wakfu.characterCreation");

      cAo.cxf().b(this);

      this.baa = null;
      this.bSw = null;
    }
  }

  public void SB() {
    int i = bSv.nextInt(7500);
    bG(i + 5000);
  }

  private void bG(long paramLong)
  {
    cAo.cxf().b(this);
    cAo.cxf().a(bSh, paramLong, 0, 1);
  }

  private static String SC()
  {
    return bSp[yb.Ha().nextInt(bSp.length)];
  }

  private void a(UT paramUT) {
    SD();
    int i = paramUT.aii().uO() == SB.ctP.uO() ? 1 : 0;
    dLE.doY().t("characterCreation.femaleEnabled", Boolean.valueOf(i == 0));
    bKm localbKm = St();
    localbKm.d(paramUT.aii());

    localbKm.bSb();
    localbKm.bRX();
    localbKm.c(CG.bFI);

    a(localbKm, this.bSj ? 1 : localbKm.xK());

    a(localbKm, true);

    a(localbKm);

    this.bSx.setSelectedValue(paramUT);

    dLE.doY().t("characterCreation.hairColorChosen", null);
    dLE.doY().t("characterCreation.skinColorChosen", null);
    dLE.doY().t("characterCreation.pupilColorChosen", null);

    Y(localbKm.xK());
    SE();
  }

  private void SD() {
    axU localaxU = this.bSx.getSelected();
    if (localaxU == null) {
      return;
    }
    cpa localcpa = localaxU.getInnerElementMap();
    a((czv)localcpa.fi("breedSelectionNW"));
    a((czv)localcpa.fi("breedSelectionSW"));
    a((czv)localcpa.fi("breedSelectionNE"));
    a((czv)localcpa.fi("breedSelectionSE"));
  }

  private void a(czv paramczv) {
    bNa localbNa = new bNa(bNa.gRx);

    paramczv.J(gm.class);
    paramczv.setModulationColor(localbNa);

    paramczv.J(cMy.class);
    paramczv.getImageMesh().c(1.0F, 1.0F, 1.0F);
  }

  private void SE() {
    axU localaxU = this.bSx.getSelected();
    if (localaxU == null) {
      return;
    }
    cpa localcpa = localaxU.getInnerElementMap();
    b((czv)localcpa.fi("breedSelectionNW"));
    b((czv)localcpa.fi("breedSelectionSW"));
    b((czv)localcpa.fi("breedSelectionNE"));
    b((czv)localcpa.fi("breedSelectionSE"));
  }

  private void b(czv paramczv) {
    bNa localbNa1 = new bNa(bNa.gRx);
    bNa localbNa2 = new bNa(bNa.gRu);

    paramczv.J(cMy.class);
    cMy localcMy = new cMy(Float.valueOf(0.8F), Float.valueOf(1.0F), paramczv, 0, 300, ddp.kWH, paramczv.getImageMesh(), -1);
    paramczv.a(localcMy);
  }

  private void a(bKm parambKm) {
    dLE localdLE = dLE.doY();
    localdLE.a(parambKm, new String[] { "sex", "hairColors", "skinColors", "pupilColors", "actorDescriptorLibrary", "actorAnimationPath", "actorLinkage", "hairDescription", "skinDescription", "pupilDescription", "hairAvailability", "skinAvailability", "pupilAvailability", "breedInfo" });
  }

  private void SF()
  {
    cpa localcpa = cBQ.cxL().coO().nf("characterCreationDialog");
    if (localcpa == null) {
      return;
    }
    czv localczv = (czv)localcpa.fi("bigBackground");
    if (localczv == null) {
      return;
    }
    if (this.baa == null) {
      this.baa = new cag();
      this.baa.aJ();
      this.baa.setAlignment(aFG.eck);
      this.baa.setX((int)this.baa.getPosition().getX());
      this.baa.setY((int)(this.baa.getPosition().getY() + 20.0F));
      this.baa.setLevel(1);
    }
    this.baa.setFile(agt.arQ().ia(St().aii().uO()));
    localczv.getAppearance().a(this.baa);
  }

  public void SG() {
    if (this.baa != null)
      this.baa.setFile(agt.arQ().ia(St().aii().uO()));
  }

  public void SH()
  {
    SI();
    SJ();
    SK();
  }

  private void SI() {
    dLE localdLE = dLE.doY();
    if (localdLE.rv("characterCreation.hairColorChosen") == null) {
      return;
    }
    if (this.bSy == -1) {
      return;
    }
    byte b1 = bCO.cp(this.bSy);
    byte b2 = bCO.cq(this.bSy);
    bKm localbKm = St();
    localbKm.b(b1, b2, true);
    localdLE.a(localbKm, new String[] { "actorDescriptorLibrary" });
    dLE.doY().t("characterCreation.hairColorChosen", null);
  }

  private void SJ() {
    dLE localdLE = dLE.doY();
    if (localdLE.rv("characterCreation.skinColorChosen") == null) {
      return;
    }
    if (this.bSy == -1) {
      return;
    }
    byte b1 = bCO.cp(this.bSy);
    byte b2 = bCO.cq(this.bSy);
    bKm localbKm = St();
    localbKm.a(b1, b2, true);
    localdLE.a(localbKm, new String[] { "actorDescriptorLibrary" });
    dLE.doY().t("characterCreation.skinColorChosen", null);
  }

  private void SK() {
    dLE localdLE = dLE.doY();
    if (localdLE.rv("characterCreation.pupilColorChosen") == null) {
      return;
    }
    if (this.bSy == -1) {
      return;
    }
    byte b = bCO.cp(this.bSy);
    bKm localbKm = St();
    localbKm.m(b, true);
    localdLE.a(localbKm, new String[] { "actorDescriptorLibrary" });
    dLE.doY().t("characterCreation.pupilColorChosen", null);
  }

  public void Y(byte paramByte) {
    a(this.bSz, bNa.gRu, bNa.gRx);
    a(this.bSA, bNa.gRu, Z(paramByte));
    a(this.bSB, bNa.gRu, aa(paramByte));
  }

  private bNa Z(byte paramByte) {
    return paramByte == 0 ? bNa.gRx : bNa.gRu;
  }

  private bNa aa(byte paramByte) {
    return paramByte == 1 ? bNa.gRx : bNa.gRu;
  }

  public void ab(byte paramByte) {
    bNa localbNa1 = paramByte == 1 ? bNa.gRx : bNa.gRu;
    bNa localbNa2 = paramByte == 1 ? bNa.gRu : bNa.gRx;

    a(this.bSA, localbNa1, localbNa2);
    a(this.bSB, localbNa2, localbNa1);
  }

  private static void a(czv paramczv, bNa parambNa1, bNa parambNa2) {
    if (paramczv == null) {
      return;
    }
    bNa localbNa1 = new bNa(parambNa1);
    bNa localbNa2 = new bNa(parambNa2);

    paramczv.J(gm.class);
    gm localgm = new gm(localbNa1, localbNa2, paramczv, 0, 300, 1, false, ddp.kWG);
    paramczv.a(localgm);
  }

  public static short s(Su paramSu) {
    ArrayList localArrayList = (ArrayList)dLE.doY().rv("characterCreation.breedInfoList");
    return (short)localArrayList.indexOf(paramSu);
  }

  public boolean SL() {
    return this.bSi;
  }

  public void ac(byte paramByte) {
    SO();

    hF localhF = new hF(this, paramByte);
    hF.a(localhF);
  }

  private void SM()
  {
    ZG localZG = aWc.blo().eO(600158L);
    if (localZG != null) {
      localZG.ae(0.5F);
    }

    SN();
  }

  private void SN() {
    if (this.bSl >= this.bSx.size()) {
      this.bSl = 0;
      return;
    }

    dka.cSF().a(new bc(this), 20L, 1);
  }

  private void SO()
  {
    this.bSi = true;
    dLE.doY().t("characterCreation.controlsLocked", Boolean.valueOf(this.bSi));
  }

  private void SP() {
    this.bSi = false;
    dLE.doY().t("characterCreation.controlsLocked", Boolean.valueOf(this.bSi));
  }

  public void SQ()
  {
    bOK localbOK = ckU.cmE().FO();
    Zp[] arrayOfZp = aQC.bhe().bhh();

    localbOK.g(bU.fH().getString("loading.preLoad"), arrayOfZp.length * 4);
    for (Object localObject2 : arrayOfZp) {
      short s = localObject2.nc();
      a(s, true);
      a(s, false);
    }

    ??? = new bb(this, arrayOfZp, localbOK);

    ((Thread)???).start();
  }

  private void a(short paramShort, boolean paramBoolean) {
    String str1;
    try {
      str1 = ay.bd().getString("ANMEquipmentPath");
    } catch (bdh localbdh) {
      K.error("Erreur au chargement d'une propriété", localbdh);
      return;
    }
    int i = agt.arQ().c(paramShort, paramBoolean);
    int j = agt.arQ().b(paramShort, paramBoolean);
    String str2;
    String str3;
    for (int k = 0; k < i; k++) {
      str2 = agt.arQ().a(paramShort, paramBoolean, k);
      str3 = String.format(str1, new Object[] { str2 });
      ahm.eo(str3);
    }
    for (k = 0; k < j; k++) {
      str2 = agt.arQ().b(paramShort, paramBoolean, k);
      str3 = String.format(str1, new Object[] { str2 });
      ahm.eo(str3);
    }
  }

  static
  {
    bSC.i(SB.ctQ, 4);

    bSC.i(SB.ctH, 1);
    bSC.i(SB.ctI, 5);
    bSC.i(SB.ctG, 9);

    bSC.i(SB.ctD, 2);
    bSC.i(SB.ctM, 6);
    bSC.i(SB.ctB, 10);
    bSC.i(SB.ctF, 14);

    bSC.i(SB.ctJ, 3);
    bSC.i(SB.ctN, 7);
    bSC.i(SB.ctC, 11);
    bSC.i(SB.ctK, 15);

    bSC.i(SB.ctP, 8);
    bSC.i(SB.ctL, 12);
    bSC.i(SB.ctA, 16);

    bSC.i(SB.ctE, 13);
  }
}