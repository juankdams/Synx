import com.ankamagames.wakfu.client.WakfuClientInstance;
import org.apache.log4j.Logger;

public class vt extends cqy
{
  protected static final Logger K = Logger.getLogger(vt.class);

  private static final vt bjF = new vt();
  private bnm N;

  public static vt Ek()
  {
    return bjF;
  }

  private vt()
  {
    super(new dFU[] { new ccO(), new oQ(), new cJg(), new aQM(), new abJ(), new dhF(), new Jm(), new dEm(), new dEo(), new bRo(), new cjw(), new dba(), new aaW(), new Uk(), new dqL(), new bNd() });
  }

  private void El()
  {
    cBQ.cxL().j("wakfu.guildManagement", aWr.class);
    cBQ.cxL().j("wakfu.guildImprovement", Fc.class);
    cBQ.cxL().j("wakfu.guildHavenWorld", oi.class);
  }

  private void Em() {
    cBQ.cxL().mN("wakfu.guildManagement");
    cBQ.cxL().mN("wakfu.guildImprovement");
    cBQ.cxL().mN("wakfu.guildHavenWorld");
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  private cNL getTableModel() {
    cNL localcNL = new cNL();

    localcNL.a("rank", new bnU(new cPe(this)));

    localcNL.a("name", new bnU(new cPd(this)));

    localcNL.a("level", new bnU(new cPg(this)));

    localcNL.a("guildPoints", new bnU(new cPf(this)));

    return localcNL;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (!byv.bFN().bFO().bSw()) {
        return;
      }

      this.N = new cPb(this);

      boolean bool = WakfuClientInstance.awy().awB().a(bmz.fEJ);
      dqB.cXD().kk(bool);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("guildManagementDialog", VV.dJ("guildManagementDialog"), 32769L, (short)10000);

      cpa localcpa = cBQ.cxL().coO().nf("guildManagementDialog");
      if (localcpa != null) {
        localObject = getTableModel();
        aXE localaXE = (aXE)localcpa.fi("guildTable");
        if (localaXE != null) {
          localaXE.setTableModel((cNL)localObject);
        }
      }

      dqB.cXD().cXF();

      El();

      dLE.doY().t("rankModificationDirty", Boolean.valueOf(false));
      dLE.doY().a("currentPage", Integer.valueOf(0), "guildManagementDialog");

      dLE.doY().t("guild", dqB.cXD());

      Object localObject = new deL();
      byv.bFN().aJK().d((cWG)localObject);

      aWc.blo().eO(600012L);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cYG localcYG = (cYG)dLE.doY().rv("havenWorld");
      if (localcYG != null)
        localcYG.byC();
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("guildManagementDialog");
      Em();

      dLE.doY().removeProperty("guild");
      aWc.blo().eO(600013L);
    }
  }
}