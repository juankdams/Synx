import java.util.HashSet;

public class bUH
{
  private int hgC;
  private amY hgD;
  private ack hgE;
  private static final String hgF = "challengeProposal";
  private static final String hgG = "challengeVarUpdated";
  private static final String hgH = "challengeVarUpdateNegate";
  private static final String hgI = "challengeWin";
  private static final String hgJ = "challengeFailed";
  private static final int hgK = 600;
  private static bUH hgL = new bUH();

  public void uf(int paramInt)
  {
    this.hgC = paramInt;
  }

  public void c(amY paramamY) {
    this.hgD = paramamY;
    caI();
  }

  public void a(ack paramack) {
    this.hgE = paramack;
  }

  public void a(ack paramack, int paramInt) {
    this.hgE = paramack;
    aZA.fgu.j(paramInt, false);
  }

  public ack caD() {
    return this.hgE;
  }

  public int caE() {
    return this.hgC;
  }

  public amY caF() {
    return this.hgD;
  }

  public static bUH caG()
  {
    return hgL;
  }

  public void caH() {
    if (this.hgD != null) {
      qn.xw().co(this.hgD.getId());
      this.hgD = null;
      ab.bl.i(-1);
    }

    bst();
    dLE.doY().t("waitingForInputChallenge", null);
  }

  private void kv(String paramString) {
    e(tq.Bg().b(dHL.lSB.dhZ(), byn.jp(paramString), paramString, false));
  }

  private void e(uz paramuz) {
    cew localcew = byv.bFN().bFO().aeL();
    dVG localdVG = new dVG();

    doc localdoc = new doc(paramuz, 32, 32, localdVG, 2000);
    localdoc.a(localcew);

    HashSet localHashSet = dbI.cNt().b(localcew);
    localdoc.pu(Math.max(1, localHashSet != null ? localHashSet.size() * 600 : 0));
    dbI.cNt().a(localdoc);
  }

  public void a(int paramInt1, long paramLong, dxL paramdxL, cSi paramcSi, boolean paramBoolean, int paramInt2) {
    if (paramInt1 == -1) {
      aZA.fgu.j(paramLong, this.hgD == null);
      aZA.fgu.bot();
    } else {
      aZA.fgu.j(paramLong, false);
      int i = this.hgE == ack.cRf ? 1 : 0;
      if (this.hgD == null) {
        this.hgD = qn.xw().b(paramInt1, paramdxL);
        this.hgD.b(paramcSi);
        if (paramBoolean) {
          this.hgD.cx(false);
          this.hgD.cz(true);
          this.hgD.cy(true);
        }
        if ((i != 0) && (!paramBoolean)) {
          aWc.blo().eO(600127L);
        }
      }

      this.hgD.aM(paramInt2);
      this.hgD.r(paramdxL);

      caJ();
    }

    caI();
    bot();
  }

  public void caI()
  {
    int i;
    if (caN())
      i = this.hgD != null ? this.hgD.getId() : -1;
    else {
      i = -1;
    }
    ab.bl.i(i);
  }

  public void caJ()
  {
    String str;
    if (cBQ.cxL().mZ("verticalFollowedAchievementsDialog"))
      str = "verticalFollowedAchievementsDialog";
    else if (cBQ.cxL().mZ("followedAchievementsDialog"))
      str = "followedAchievementsDialog";
    else {
      str = null;
    }

    if (str == null) {
      return;
    }

    cpa localcpa = cBQ.cxL().coO().nf(str);
    dOc localdOc = (dOc)localcpa.fi("environmentRenderable.environmentQuestContainer");

    cag localcag = new cag();
    localcag.aJ();
    localcag.setFile("6001051.xps");
    localcag.setAlignment(aFG.eck);
    localdOc.getAppearance().a(localcag);
  }

  public void bot() {
    switch (aNJ.etI[this.hgE.ordinal()]) {
    case 1:
    case 2:
      Object localObject = this.hgD != null ? aUi.eUP.nW(this.hgD.getId()) : null;
      dLE.doY().t("displayedAchievement", localObject);
      break;
    case 3:
    case 4:
      dLE.doY().t("displayedAchievement", null);
    }
  }

  public void caK()
  {
    switch (aNJ.etI[this.hgE.ordinal()])
    {
    case 1:
      break;
    case 2:
      if (this.hgD != null) {
        this.hgD.cx(false);
        this.hgD.cz(true); } break;
    case 3:
    case 4:
      if ((this.hgD != null) && (!this.hgD.IR()) && (this.hgD.azw())) {
        ug(this.hgD.getId());
      }
      caH();
      aZA.fgu.bos();
    }
  }

  public void ug(int paramInt)
  {
    if ((this.hgD != null) && (this.hgD.getId() == paramInt)) {
      dLE.doY().t("challengeDetailsVisible", Boolean.valueOf(false));
      this.hgD.cA(true);
      this.hgD.cy(false);
      this.hgD.cz(false);
      this.hgD.r(null);

      int i = !this.hgD.azC() ? 1 : 0;
      if ((i != 0) && (caN())) {
        String str = bU.fH().getString("chat.challenge.failed", new Object[] { this.hgD.getTitle() });
        int j = 4;
        CM.LV().f(str, 4);
        kv(ay.bd().a("challengeFlyingImagePath", "defaultIconPath", new Object[] { "challengeFailed" }));
      }

      caL();
    }

    bst();
  }

  public void caL() {
    if (this.hgD != null) {
      qn.xw().co(this.hgD.getId());
      this.hgD = null;
      bot();
      ab.bl.i(-1);
    }
  }

  public short azB() {
    if (this.hgD != null) {
      return this.hgD.azB();
    }
    return -1;
  }

  public void bst()
  {
  }

  public void caM() {
    if (caN()) {
      kv(ay.bd().a("challengeFlyingImagePath", "defaultIconPath", new Object[] { "challengeWin" }));

      cew localcew = byv.bFN().bFO().aeL();
      localcew.c(CG.bFI);

      localcew.eq("AnimEmote-Victoire");
    }
  }

  public void gH(boolean paramBoolean) {
    if (caN()) {
      String str = paramBoolean ? "challengeVarUpdated" : "challengeVarUpdateNegate";
      kv(ay.bd().a("challengeFlyingImagePath", "defaultIconPath", new Object[] { str }));
    }
  }

  public boolean caN() {
    byz localbyz = byv.bFN().bFO();
    Object localObject = this.hgD != null ? this.hgD.EE().dfY() : null;
    int i = (localObject == null) || (localObject.i(localbyz, localbyz, null, null)) ? 1 : 0;
    return (i != 0) && (!localbyz.cJf().HL());
  }
}