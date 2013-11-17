import java.util.ArrayList;
import org.apache.log4j.Logger;

public class rV
  implements cvW
{
  protected static final Logger K = Logger.getLogger(rV.class);

  private static rV aZZ = new rV();
  private cag baa;
  private ArrayList bab;
  private azi bac;
  private dOh bad;
  private bnm N;

  public static rV yw()
  {
    return aZZ;
  }

  public boolean a(cWG paramcWG)
  {
    short s;
    switch (paramcWG.getId()) {
    case 18220:
      s = (short)(this.bac.aLb() - 1);
      this.bac.aT(s);
      t(s);
      return false;
    case 18221:
      s = (short)(this.bac.aLb() + 1);
      this.bac.aT(s);
      t(s);
      return false;
    }

    return true;
  }

  private cNL getTableModel() {
    cNL localcNL = new cNL();

    localcNL.a(new blV(this));

    return localcNL;
  }

  public void t(short paramShort) {
    coB localcoB = new coB();
    localcoB.di(paramShort);
    localcoB.cG(this.bad == null ? -1 : this.bad.bJ());
    byv.bFN().aJK().d(localcoB);
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.bac == null) {
        K.error("Impossible de charger l'affichage du ladder de guilde, il manque les données !");
        return;
      }

      this.N = new blU(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("guildLadder", this.bac);
      dLE.doY().t("dungeonLadderBackgroundImage", ay.bd().M(bdD.fpx.getId()));

      cBQ.cxL().a("guildLadderDialog", VV.dJ("guildLadderDialog"), 256L, (short)30000);

      yx();

      cpa localcpa = cBQ.cxL().coO().nf("guildLadderDialog");
      if (localcpa != null) {
        cNL localcNL = getTableModel();
        aXE localaXE = (aXE)localcpa.fi("ladderTable");
        if (localaXE != null) {
          localaXE.setTableModel(localcNL);
        }
      }

      cBQ.cxL().j("wakfu.guildLadder", dIO.class);

      aWc.blo().eO(600120L);
    }
  }

  private void yx() {
    cpa localcpa = cBQ.cxL().coO().nf("guildLadderDialog");
    ArrayList localArrayList = new ArrayList();

    dOc localdOc = (dOc)localcpa.fi("background");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }
    localdOc = (dOc)localcpa.fi("closeButton");
    if (localdOc != null) {
      localArrayList.add(localdOc.getAppearance());
    }

    if (localdOc != null) {
      bNa localbNa1 = new bNa(bNa.gRu.get());
      bNa localbNa2 = new bNa(bNa.gRx.get());

      localdOc.a(new aga(localbNa1, localbNa2, localArrayList, 0, 500, 1, ddp.kWG));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.bac = null;
      this.bad = null;

      cBQ.cxL().b(this.N);

      dLE.doY().removeProperty("guildLadder");
      dLE.doY().removeProperty("dungeonLadderBackgroundImage");

      cBQ.cxL().mW("guildLadderDialog");

      cBQ.cxL().mN("wakfu.guildLadder");

      aWc.blo().eO(600121L);
    }
  }

  public void a(azi paramazi) {
    this.bac = paramazi;
    byv.bFN().a(yw());
  }

  public azi yy() {
    return this.bac;
  }

  public dOh yz() {
    return this.bad;
  }
}