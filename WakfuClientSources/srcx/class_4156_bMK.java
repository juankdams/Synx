import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bMK
  implements cvW
{
  protected static final Logger K = Logger.getLogger(bMK.class);

  private static final bMK gQX = new bMK();
  private bvw gQY;
  private ckJ gQZ;
  private final LinkedList gRa;
  private dRq gRb;
  private ArrayList bab;
  private cag baa;
  private aQG gRc;
  private static final int gRd = 10000;
  protected final ArrayList gRe;
  protected dHX gRf;

  public bMK()
  {
    this.gRa = new LinkedList();

    this.gRc = null;

    this.gRe = new ArrayList(3);

    this.gRf = dHX.lSJ;
  }
  public boolean bUs() {
    return (this.gRf == dHX.lSJ) || (this.gRf == dHX.lSL);
  }

  public boolean bUt() {
    return (this.gRf == dHX.lSJ) || (this.gRf == dHX.lSK);
  }

  public boolean bUu()
  {
    if (this.gQY == null) {
      return false;
    }
    return this.gQY.UO();
  }

  public static bMK bUv()
  {
    return gQX;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    int i;
    Object localObject3;
    switch (paramcWG.getId()) {
    case 16136:
      localObject1 = (bsO)paramcWG;
      localObject2 = ((bsO)localObject1).bAV();
      c(null);

      if ((localObject2 == null) || ((localObject2 instanceof blY))) {
        localObject2 = this.gQY.bDj();
      }
      this.gQY.a((aMT)localObject2);
      return false;
    case 16137:
      localObject1 = (dBo)paramcWG;
      localObject2 = ((dBo)localObject1).deG();

      if (localObject2 == null) {
        localObject2 = this.gQY.bDi();
        this.gQY.a(this.gQY.bDj());
      }
      if (localObject2 == null) {
        return false;
      }

      c((ckJ)localObject2);
      dLE.doY().t("overQuickAchievement", localObject2);
      dLE.doY().a(this.gQY.bDk(), new String[] { "achievementsQuickList" });
      return false;
    case 16138:
      localObject1 = (bzu)paramcWG;
      i = ((bzu)localObject1).getIntValue();
      boolean bool = byv.bFN().bFO().bGa().o(i, ((bzu)localObject1).getBooleanValue());
      if (bool) {
        ab.bl.aC();
        localObject3 = new Zq(((bzu)localObject1).getIntValue(), ((bzu)localObject1).getBooleanValue());
        byv.bFN().aJK().d((cWG)localObject3);
      }
      return false;
    case 16139:
      localObject1 = (bzu)paramcWG;
      i = ((bzu)localObject1).getIntValue();

      byz localbyz = byv.bFN().bFO();
      if (!localbyz.bHj().Td()) {
        localObject3 = new aEe(bU.fH().getString("chat.notify.questSharedWithNobody"));
        ((aEe)localObject3).mm(4);
        CM.LV().a((aEe)localObject3);
      } else {
        localObject3 = new aBD(i);
        byv.bFN().aJK().d((cWG)localObject3);
      }
      return false;
    case 16140:
      localObject1 = (bzu)paramcWG;
      i = ((bzu)localObject1).getIntValue();
      byv.bFN().bFO().bGa().sr(i);
      return false;
    }

    return true;
  }

  public static boolean bUw() {
    int i = (!LJ.Wo().cE("followedAchievementsDialog")) || (LJ.Wo().cF("followedAchievementsDialog")) ? 1 : 0;

    String str = i != 0 ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";

    return cBQ.cxL().mZ(str);
  }

  public static void gq(boolean paramBoolean) {
    int i = (!LJ.Wo().cE("followedAchievementsDialog")) || (LJ.Wo().cF("followedAchievementsDialog")) ? 1 : 0;

    String str = i != 0 ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";

    if (paramBoolean) {
      asv.aEL();

      bpn localbpn = (bpn)cBQ.cxL().a(str, VV.dJ(str), 40976L, (short)10000);

      LJ.Wo().a(localbpn, false);
      localbpn.setEnableResizeEvents(true);
      localbpn.setHorizontalDialog("followedAchievementsDialog");
      localbpn.setVerticalDialog("verticalFollowedAchievementsDialog");

      localbpn.a(CH.bGJ, new dwd(localbpn), false);

      cBQ.cxL().j("wakfu.followedAchievements", coK.class);
    }
    else {
      cBQ.cxL().M(str, true);
      cBQ.cxL().mN("wakfu.followedAchievements");
    }
  }

  public static void ts(int paramInt) {
    dka.cSF().a(new dwa(paramInt), 500L, 1);
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean);
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.gQZ = null;
      this.bab = null;
      this.gRb = null;
      cBQ.cxL().mW("achievementUnlockedDialog");

      cleanUp();
    }
  }

  public void gr(boolean paramBoolean) {
    if (paramBoolean) {
      if (cBQ.cxL().mZ("questDialog"))
        gs(paramBoolean);
      else {
        a(paramBoolean, this.gQZ);
      }
    }
    else if (cBQ.cxL().mZ("achievementsDialog"))
      gs(paramBoolean);
    else
      a(paramBoolean, this.gQZ);
  }

  private void cleanUp()
  {
    this.gQY = null;
    this.gQZ = null;
    this.gRc = null;
    this.gRa.clear();
    this.baa = null;

    dLE.doY().removeProperty("achievementsManager");
    dLE.doY().removeProperty("selectedAchievement");
    dLE.doY().removeProperty("overQuickAchievement");

    cBQ.cxL().mN("wakfu.achievements");
  }

  private static void gs(boolean paramBoolean)
  {
    cBQ.cxL().mW(paramBoolean ? "questDialog" : "achievementsDialog");

    aWc.blo().eO(600046L);
  }

  public void a(boolean paramBoolean, ckJ paramckJ)
  {
    Ke localKe = cHT.iDr.cCg();
    String str1;
    String str2;
    if (paramBoolean) {
      this.gQY = localKe;
      str1 = "questDialog";
      str2 = "achievementsDialog";
    } else {
      this.gQY = cHT.iDr.cCh();
      str1 = "achievementsDialog";
      str2 = "questDialog";
    }

    if (paramckJ != null) {
      this.gQY.a(cHT.iDr.xR(paramckJ.cmy()));
    }

    dLE.doY().t("selectedAchievement", paramckJ);
    dLE.doY().t("overQuickAchievement", paramckJ);

    dLE.doY().t("achievementsManager", this.gQY);

    if (cBQ.cxL().mZ(str2)) {
      cBQ.cxL().mW(str2);
    }

    if (!cBQ.cxL().mZ(str1)) {
      cBQ.cxL().a(str1, VV.dJ(str1), 1L, (short)10000);
    }

    dLE.doY().a("displayedAchievement", paramckJ, str1);

    cBQ.cxL().j("wakfu.achievements", bXO.class);

    aWc.blo().eO(600045L);
  }

  public void a(azx paramazx)
  {
    boolean bool = byv.bFN().bFO().i(dKm.lXJ);
    if (bool) {
      return;
    }
    int i = 0;
    if (!cBQ.cxL().mZ("questDescriptionDialog")) {
      cBQ.cxL().a("questDescriptionDialog", VV.dJ("questDescriptionDialog"), 1L, (short)10000);

      i = 1;
    }

    int j = paramazx.getId();
    dmz localdmz = paramazx.getType() == 1 ? sx.bbD.cN(j) : null;

    if (localdmz == null) {
      if (this.gRc != null) {
        this.gRc = null;
        i = 1;
      }
    } else {
      if (this.gRc == null) {
        this.gRc = new aQG();
        i = 1;
      }
      this.gRc.b(localdmz);
    }

    if (i != 0) {
      dLE.doY().a("questListBar", this.gRc, "questDescriptionDialog");
    }

    dLE.doY().a("displayedAchievement", paramazx, "questDescriptionDialog");
  }

  public void b(ckJ paramckJ) {
    int i = paramckJ.getId();
    dmz localdmz = sx.bbD.cN(i);
    if (localdmz == null) {
      K.warn("On essaye de charger une description de liste de qu$ete pour une quête qui n'est pas dans une suite, id=" + i);
      return;
    }

    int j = 0;
    if (!cBQ.cxL().mZ("questListBarDialog")) {
      cBQ.cxL().a("questListBarDialog", VV.dJ("questListBarDialog"), 8193L, (short)10000);

      j = 1;
    }

    if (this.gRc == null) {
      this.gRc = new aQG();
      j = 1;
    }
    this.gRc.b(localdmz);
    this.gRc.ny(i);

    if (j != 0) {
      dLE.doY().a("questListBar", this.gRc, "questListBarDialog");
    }

    dLE.doY().a("displayedAchievement", paramckJ, "questListBarDialog");
  }

  public void bUx() {
    cBQ.cxL().mW("questListBarDialog");
    this.gRc = null;
  }

  public void a(dEE paramdEE) {
    ckJ localckJ = cHT.iDr.xQ(paramdEE.getId());
    if (localckJ == null) {
      return;
    }
    if (this.gQZ != null)
      this.gRa.addLast(localckJ);
    else {
      d(localckJ);
    }

    aMT localaMT = cHT.iDr.xR(paramdEE.dgg().getId());
    if (localaMT != null)
      dLE.doY().a(localaMT, localaMT.getFields());
  }

  public static void c(ckJ paramckJ)
  {
    dLE.doY().t("selectedAchievement", paramckJ);

    if (paramckJ != null) {
      int i = paramckJ.cmy() == 4 ? 1 : 0;
      String str = i != 0 ? "questDialog" : "achievementsDialog";

      if (cBQ.cxL().mZ(str))
        dLE.doY().a("displayedAchievement", paramckJ, str);
    }
  }

  private void d(ckJ paramckJ)
  {
    this.gQZ = paramckJ;
    dLE.doY().t("unlockedAchievement", paramckJ);
    if ((!cBQ.cxL().mZ("achievementUnlockedDialog")) || (this.gRb == null)) {
      this.gRb = ((dRq)cBQ.cxL().a("achievementUnlockedDialog", VV.dJ("achievementUnlockedDialog"), 8194L, (short)10000));
    }

    if (this.gRb != null) {
      if (this.baa != null) {
        this.gRb.getAppearance().c(this.baa);
      }

      this.baa = new cag();
      this.baa.aJ();
      this.baa.setFile("6001037.xps");
      this.baa.setAlignment(aFG.eck);
      this.gRb.getAppearance().a(this.baa);
    }
    fr(true);
  }

  private void bCt() {
    this.bab = new ArrayList();
    cpa localcpa = this.gRb.getElementMap();
    this.bab.add(((dRq)localcpa.fi("mainContainer")).getAppearance());
    this.bab.add(((dRq)localcpa.fi("splashContainer")).getAppearance());
    this.bab.add(((caF)localcpa.fi("text")).getAppearance());
    this.bab.add(((czv)localcpa.fi("icon")).getAppearance());
    this.bab.add(((czv)localcpa.fi("starIcon")).getAppearance());
    this.bab.add(((caF)localcpa.fi("nameText")).getAppearance());
  }

  private void fq(boolean paramBoolean) {
    cpa localcpa = this.gRb.getElementMap();
    ((dRq)localcpa.fi("mainContainer")).setNonBlocking(paramBoolean);
  }

  public void fr(boolean paramBoolean) {
    if (this.gRb == null) {
      K.warn("on tente de fade l'interface de débloquage d'exploit alors qu'elle n'est pas chargée");
      return;
    }

    if (this.bab == null) {
      bCt();
    }
    fq(!paramBoolean);
    cpa localcpa = this.gRb.getElementMap();
    dRq localdRq = (dRq)localcpa.fi("mainContainer");
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

      localdRq.J(aga.class);
      aga localaga = new aga(localbNa1, localbNa2, this.bab, 0, 500, 1, ddp.kWG);
      localaga.a(new dvV(this, paramBoolean));

      localdRq.a(localaga);
    }
  }

  public bvw bUy() {
    return this.gQY;
  }

  public dHX bUz() {
    return this.gRf;
  }

  public void a(dHX paramdHX) {
    this.gRf = paramdHX;
    dLE.doY().a(this.gQY.bDk(), new String[] { "achievements", "categories" });
  }
}