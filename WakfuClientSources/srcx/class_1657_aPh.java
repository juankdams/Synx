public class aPh
  implements cvW
{
  private static aPh eLm = new aPh();
  private bnm N;

  public static aPh bgd()
  {
    return eLm;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 17730:
      byv.bFN().b(this);
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  private cNL getTableModel() {
    cNL localcNL = new cNL();

    localcNL.a("name", new bnU(new bgz(this)));

    localcNL.a("level", new bnU(new bgH(this)));

    localcNL.a("xp", new bnU(new bgI(this)));

    localcNL.a("kamas", new bnU(new bgD(this)));

    localcNL.a("kamasTax", new bnU(new bgE(this)));

    return localcNL;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new bgw(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("fightResultDialog", VV.dJ("fightResultDialog"), 1L, (short)10000);

      cpa localcpa = cBQ.cxL().coO().nf("fightResultDialog");
      if (localcpa != null) {
        cNL localcNL = getTableModel();
        aXE localaXE1 = (aXE)localcpa.fi("winnersTable");
        if (localaXE1 != null) {
          localaXE1.setTableModel(localcNL);
        }
        aXE localaXE2 = (aXE)localcpa.fi("losersTable");
        if (localaXE2 != null) {
          localaXE2.setTableModel(localcNL);
        }

      }

      cBQ.cxL().j("wakfu.fightResult", cAW.class);

      aWc.blo().eO(600068L);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mW("fightResultSpellsDetailsDialog");
      cBQ.cxL().mW("fightResultSummonsDetailsDialog");
      cBQ.cxL().mW("fightResultDialog");

      aCg.aOq().dj(true);

      dKc localdKc = byv.bFN().bFO().bSe();
      if ((localdKc != null) && (localdKc.fU() == 4)) {
        aMb localaMb = (aMb)localdKc;
        localaMb.bdr();
      }

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("fight.resultDescription");
      dLE.doY().removeProperty("osamodasSymbiotCreatureCapturedState");

      cBQ.cxL().mN("wakfu.fightResult");
      aWc.blo().blL();
    }
  }

  public void bge() {
    String str = cBQ.cxL().mZ("fightResultSummonsDetailsDialog") ? "fightResultSummonsDetailsDialog" : "fightResultDialog";
    cBQ.cxL().a("fightResultSpellsDetailsDialog", VV.dJ("fightResultSpellsDetailsDialog"), "fightResultDialog", "fightResultDialog", "fightResultDialog", 32769L, (short)10000);
  }

  public void bgf()
  {
    String str = cBQ.cxL().mZ("fightResultSpellsDetailsDialog") ? "fightResultSpellsDetailsDialog" : "fightResultDialog";
    cBQ.cxL().a("fightResultSummonsDetailsDialog", VV.dJ("fightResultSummonsDetailsDialog"), "fightResultDialog", "fightResultDialog", "fightResultDialog", 32769L, (short)10000);
  }
}