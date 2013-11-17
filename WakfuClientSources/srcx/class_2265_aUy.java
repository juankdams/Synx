import org.apache.log4j.Logger;

public class aUy
  implements cvW, Runnable
{
  protected static final Logger K = Logger.getLogger(aUy.class);

  private static aUy eVx = new aUy();
  private bwe chg;
  private int eVy;
  private bnm N;
  private final dow eVz = dow.cVB();
  private final adz eVA = new adz();

  public static aUy bjB()
  {
    return eVx;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject1;
    Object localObject2;
    aYr localaYr;
    Object localObject3;
    int i;
    switch (paramcWG.getId()) {
    case 18401:
      localObject1 = (bcO)paramcWG;
      localObject2 = byv.bFN().bFO();
      ctE localctE1 = (ctE)((byz)localObject2).cJf();
      if (((byz)localObject2).nU() < 1) {
        CM.LV().f(bU.fH().getString("nation.vote.not.level.required", new Object[] { Short.valueOf(1) }), 8);

        return false;
      }
      if (!this.eVz.b(localctE1)) {
        CM.LV().f(bU.fH().getString("nation.rank.unauthorized.for.vote"), 8);

        return false;
      }

      localaYr = localctE1.UI();
      localaYr.t(localctE1.biC(), ((bcO)localObject1).bqL().cEO().getId());

      localObject3 = (Qy)((bcO)localObject1).bqL().cEO();
      String str;
      if (((byz)localObject2).getId() == ((Qy)localObject3).getId()) {
        str = bU.fH().getString("nation.vote.voteFor.voteDoneForMe");
      }
      else
      {
        str = bU.fH().getString("nation.vote.voteFor.voteDoneForSomeone", new Object[] { ((Qy)localObject3).getName() });
      }
      CM.LV().f(str, 8);

      localctE1.hx(true);

      bjD();

      return false;
    case 16161:
      localObject1 = (ctE)byv.bFN().bFO().cJf();
      localObject2 = ((ctE)localObject1).UI();
      this.eVy -= 1;
      i = ((aYr)localObject2).aMX() ? ((aYr)localObject2).abA() : ((aYr)localObject2).aNc().abA();
      if (i < 3)
        return false;
      if (this.eVy < 0) {
        this.eVy = ((int)Math.floor((i - 1.0F) / 3.0F));
      }
      if ((!((aYr)localObject2).aMX()) && (this.eVA.contains(this.eVy))) {
        bPE.bWu().updateUI();
        return false;
      }
      this.eVA.hL(this.eVy);
      bjD();

      return false;
    case 16162:
      localObject1 = (ctE)byv.bFN().bFO().cJf();
      localObject2 = ((ctE)localObject1).UI();
      this.eVy += 1;
      i = ((aYr)localObject2).aMX() ? ((aYr)localObject2).abA() : ((aYr)localObject2).aNc().abA();
      if (i < 3)
        return false;
      if (i <= bjE() * 3) {
        this.eVy = 0;
      }
      if ((!((aYr)localObject2).aMX()) && (this.eVA.contains(this.eVy))) {
        bPE.bWu().updateUI();
        return false;
      }
      this.eVA.hL(this.eVy);
      bjD();
      return false;
    case 18400:
      localObject1 = (bzu)paramcWG;
      localObject2 = byv.bFN().bFO();
      ctE localctE2 = (ctE)((byz)localObject2).cJf();
      if (!this.eVz.a(localctE2)) {
        CM.LV().f(bU.fH().getString("nation.rank.unauthorized.for.registration"), 8);

        return false;
      }

      localaYr = localctE2.UI();
      localObject3 = ((bzu)localObject1).getStringValue().replace("\r\n", " ").replace("\n", " ");

      localaYr.g(((byz)localObject2).getId(), (String)localObject3);
      localctE2.bLG();
      bjD();
      return false;
    }

    return true;
  }

  public int bjC() {
    return 3 + (this.eVy == 0 ? 1 : 0);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();

      this.chg = new cq(this);

      localbyz.aeL().a(this.chg);

      this.N = new co(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("voteInformationDialog", VV.dJ("voteInformationDialog"), 32769L, (short)10000);

      ctE localctE = (ctE)localbyz.cJf();
      aYr localaYr = localctE.UI();
      if (localaYr.aMX()) {
        dka.cSF().a(this, 1000L);

        dLE.doY().t("electionSloganDirty", Boolean.valueOf(false));
      }
      dLE.doY().t("voteInscription.feeWarning", bU.fH().getString("nation.vote.eligible.warning", new Object[] { Integer.valueOf(localaYr.aMN()) }));

      this.eVy = 0;
      this.eVA.hL(this.eVy);
      bjD();

      cBQ.cxL().j("wakfu.voteInformation", dU.class);
    }
  }

  private void bjD()
  {
    uv localuv = new uv();
    localuv.setOffset(bjE() * 3);
    byv.bFN().aJK().d(localuv);
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      bPE.bWu().bWS();

      byz localbyz = byv.bFN().bFO();
      localbyz.aeL().b(this.chg);
      this.chg = null;
      this.eVA.clear();

      aYr localaYr = localbyz.cJf().UI();
      if (!localaYr.aMX()) {
        localaYr.aNc().clear();
      } else {
        dLE.doY().removeProperty("voteInscription.feeWarning");
        dLE.doY().removeProperty("electionSloganDirty");
      }

      dka.cSF().j(this);

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("voteInformationDialog");

      dLE.doY().removeProperty("voteList");

      cBQ.cxL().mN("wakfu.voteInformation");
    }
  }

  public void run()
  {
    dLE.doY().a(bPE.bWu(), new String[] { "electionClosureDescription" });
  }

  public int bjE() {
    return this.eVy;
  }
}