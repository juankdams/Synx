import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

final class bWR extends cGj
  implements bDi
{
  public static final String hkU = "hasVoted";
  public static final String hkV = "isCandidate";
  public static final String hkW = "candidateInfo";
  public static final String hkX = "nationRankDescription";
  public static final String hkY = "nativeNationCitizenScore";
  public static final String hkZ = "isPassportActive";
  public static final String frW = "passportStampIconUrl";
  public static final String frX = "nationColor";
  public static final String hla = "nationName";
  public static final String hlb = "canApplyForGovernorConcerningCrimes";
  public static final String hlc = "canVoteConcerningCrimes";
  public static final String hld = "candidateRegistrationWarningInfo";
  private ctE hle;
  private cLP hlf;
  private final cSR hlg = new cSR();
  private final cSR hlh = new cSR();

  public bWR(ctE paramctE) {
    this.hle = paramctE;
    ccc();
  }

  private void ccc()
  {
  }

  public void a(ctE paramctE)
  {
    this.hle = paramctE;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (this.hle == null) {
      return null;
    }
    if (paramString.equals("hasVoted"))
      return Boolean.valueOf(this.hle.biE());
    if (paramString.equals("isCandidate"))
      return Boolean.valueOf(this.hle.biG());
    if (paramString.equals("candidateInfo"))
      return this.hlf;
    if (paramString.equals("nativeNationCitizenScore"))
      return this.hlg.get(this.hle.bP());
    Object localObject1;
    Object localObject2;
    if (paramString.equals("nationRankDescription")) {
      localObject1 = new lZ();
      ((lZ)localObject1).tI().am(getColor().bUV());
      localObject2 = this.hle.HK();
      if (localObject2 != null)
        ((lZ)localObject1).a(bU.fH().b(57, (int)((Yp)localObject2).getId(), new Object[0]));
      else
        ((lZ)localObject1).a(bU.fH().getString("nation.citizen.noRank"));
      Iterator localIterator;
      if (this.hle.biI().size() > 0) {
        for (localIterator = this.hle.biI().iterator(); localIterator.hasNext(); ) {
          dLC localdLC = (dLC)localIterator.next();
          ((lZ)localObject1).tH();
          ((lZ)localObject1).a(bU.fH().getString(localdLC.name()));
        }
      }
      ((lZ)localObject1).tJ();
      return ((lZ)localObject1).tP();
    }if (paramString.equals("nationColor"))
      return getColor();
    if (paramString.equals("isPassportActive"))
      return Boolean.valueOf(this.hle.HW());
    if (paramString.equals("passportStampIconUrl"))
      return ay.bd().a("passportStampIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.hle.bP()) });
    if (paramString.equals("nationName"))
      return bU.fH().b(39, this.hle.bP(), new Object[0]);
    if (paramString.equals("canApplyForGovernorConcerningCrimes")) {
      localObject1 = byv.bFN().bFO();
      return Boolean.valueOf((bGP.gDv.a(new aGH[] { localObject1 })) && (!this.hle.biG()) && (dow.cVB().a(this.hle)));
    }
    if (paramString.equals("canVoteConcerningCrimes")) {
      localObject1 = byv.bFN().bFO();
      return Boolean.valueOf((bGP.gDv.a(new aGH[] { localObject1 })) && (dow.cVB().b(this.hle)));
    }
    if (paramString.equals("candidateRegistrationWarningInfo")) {
      localObject1 = new lZ();
      localObject2 = byv.bFN().bFO();
      int i = 1;
      if (!bGP.gDv.a(new aGH[] { localObject2 })) {
        ((lZ)localObject1).a(bU.fH().getString("error.playerNotSubscribed"));
      } else {
        if (!dow.cVB().a(this.hle)) {
          if (i == 0) {
            ((lZ)localObject1).tH();
          }
          ((lZ)localObject1).a(bU.fH().getString("nation.rank.unauthorized.for.registration"));
          i = 0;
        }
        if (((byz)localObject2).JE() < bPE.bWu().aMN()) {
          if (i == 0) {
            ((lZ)localObject1).tH();
          }
          ((lZ)localObject1).a(bU.fH().getString("nation.not.enough.kamas.for.registration", new Object[] { Integer.valueOf(this.hle.UI().aMN()) }));
          i = 0;
        }
        if (((byz)localObject2).cJf().biG()) {
          if (i == 0) {
            ((lZ)localObject1).tH();
          }
          ((lZ)localObject1).a(bU.fH().getString("nation.vote.candidateRegistration.alreadyCandidate"));
          i = 0;
        }
      }

      return ((lZ)localObject1).tP();
    }
    return null;
  }

  private bNa getColor() {
    return clP.hPn;
  }

  public void bLG() {
    this.hlf = bPE.bWu().gU(this.hle.biC());

    dLE.doY().a(this, new String[] { "candidateInfo", "hasVoted", "isCandidate", "canVoteConcerningCrimes", "canApplyForGovernorConcerningCrimes" });
  }

  public void adq() {
    bKm localbKm = (bKm)this.hle.bDq();
    localbKm.adq();
  }

  private void g(int paramInt1, int paramInt2, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    if (localbyz == null) {
      return;
    }
    bKm localbKm = (bKm)this.hle.bDq();
    int i = this.hle.dJ(paramInt1);
    dkI localdkI = dwC.dbQ().BQ(i);

    bUy localbUy = (bUy)this.hlg.get(paramInt1);
    if (localbUy == null) {
      localbUy = new bUy(paramInt1);
      this.hlg.put(paramInt1, localbUy);
    }
    localbUy.ue(i);
    if (paramInt1 == this.hle.bP()) {
      dLE.doY().a(this, new String[] { "nativeNationCitizenScore" });
    }
    if (localbKm.aeI()) {
      a(paramInt1, localdkI, paramInt2, i, localbKm);
    } else if ((this.hle.HL()) && (localbyz.cJf().c(dLC.mbM))) {
      String str = bU.fH().getString(localdkI.agf());
      lZ locallZ = new lZ();
      dju.a(locallZ, "characterName_" + localbKm.getId(), localbKm.getName());
      CM.LV().f(bU.fH().getString("nation.remoteCriminal", new Object[] { locallZ.tP(), str }), 8);
    }

    if (paramBoolean)
      adq();
  }

  private void a(int paramInt1, dkI paramdkI, int paramInt2, int paramInt3, bKm parambKm)
  {
    int i = paramInt3 - paramInt2;
    if (i == 0) {
      return;
    }
    dkI localdkI = dwC.dbQ().BQ(paramInt2);
    int j = localdkI != paramdkI ? 1 : 0;
    if ((j != 0) && (this.hle.HL()) && 
      (!localdkI.a(aRk.eOf))) {
      str = bU.fH().b(39, paramInt1, new Object[0]);
      localObject1 = bU.fH().getString(paramdkI.agf());
      CM.LV().f(bU.fH().getString("nation.playerCriminal", new Object[] { str, localObject1 }), 8);

      localObject2 = bU.fH().getString("notification.outlawTitle");

      localObject3 = cda.createLink(bU.fH().getString("notification.outlawText", new Object[] { bU.fH().b(39, paramInt1, new Object[0]) }), ana.dqh, paramInt1 + "");

      localObject4 = new az((String)localObject2, (String)localObject3, ana.dqh);
      cjO.clE().j((cWG)localObject4);
    }

    Bf.Kk().O(paramInt3, paramInt3 - paramInt2);

    String str = ay.bd().a("lawFlyingImagePath", "defaultIconPath", new Object[] { i > 0 ? "1" : "2" });

    Object localObject1 = tq.Bg().b(dHL.lSB.dhZ(), byn.jp(str), str, false);
    Object localObject2 = parambKm.aeL();
    Object localObject3 = new dVG();

    Object localObject4 = new doc((uz)localObject1, 48, 48, (dbK)localObject3, 3000);
    ((doc)localObject4).a((cqz)localObject2);

    HashSet localHashSet = dbI.cNt().b((cqz)localObject2);

    NP localNP = new NP(0, 20);

    dfj localdfj = new dfj(adF.c("WCI", 5, 10), (i > 0 ? "+" : "") + i, localNP, 3000);

    localdfj.setColor(1.0F, 1.0F, 1.0F, 1.0F);

    localdfj.a((cqz)localObject2);

    int k = 0;
    if (localHashSet != null) {
      k = localHashSet.size() * 600;
      ((doc)localObject4).pu(k);
      localdfj.pu(k);
    }
    dbI.cNt().a((aCF)localObject4);
    dbI.cNt().a(localdfj);

    aWc.blo().a(i > 0 ? 600139L : 600140L, false, k);
  }

  public void ccd()
  {
    bKm localbKm = (bKm)this.hle.bDq();

    if (localbKm.afk()) {
      localbKm.adp();
      return;
    }

    int i = !localbKm.isDead() ? 1 : 0;

    localbKm.adq();
    localbKm.aek();
  }

  public void o(aYr paramaYr) {
    this.hlg.put(paramaYr.bP(), new bUy(paramaYr.bP()));
    g(paramaYr.bP(), this.hle.dJ(paramaYr.bP()), false);
  }

  public void bLF() {
    dLE.doY().a(this, new String[] { "hasVoted" });
  }

  public void st(int paramInt) {
    g(this.hle.HN(), paramInt, false);
  }

  public void cP(int paramInt1, int paramInt2) {
    g(paramInt1, paramInt2, true);
  }

  public void bLH() {
    dLE.doY().a(this, new String[] { "isPassportActive" });
  }
}