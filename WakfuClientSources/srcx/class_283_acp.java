import org.apache.log4j.Logger;

public class acp
  implements cvW
{
  private static final Logger K = Logger.getLogger(acp.class);

  public static final acp cRI = new acp();
  private byz bSY;
  private cLX cRJ;

  public void a(cjE paramcjE)
  {
    byv localbyv = byv.bFN();
    this.cRJ = new cLX(localbyv.bFO(), paramcjE);
    this.cRJ.initialize();
    localbyv.a(this);
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    boI localboI;
    dSR localdSR;
    int i;
    bTI localbTI;
    cjE localcjE;
    switch (paramcWG.getId()) {
    case 19351:
      localObject = (cek)paramcWG;
      localboI = ((cek)localObject).cgL();
      localdSR = (dSR)localboI.bsL();
      i = localdSR.getId();
      localbTI = bTI.dx(localdSR.bHU());
      localcjE = this.cRJ.cET();
      if (!localcjE.g(localbTI, i)) {
        dmO.lli.cUo();
        return false;
      }
      localcjE.b(localbTI, i);
      this.cRJ.refresh();
      apX localapX = localboI.byq();
      dLE.doY().a(localapX, localapX.getFields());

      aoH();
      return false;
    case 19352:
      localObject = (cek)paramcWG;
      localboI = ((cek)localObject).cgL();
      localdSR = (dSR)localboI.bsL();
      i = localdSR.getId();
      localbTI = bTI.dx(localdSR.bHU());
      localcjE = this.cRJ.cET();
      if (!localcjE.f(localbTI, i)) {
        dmO.lli.cUo();
        return false;
      }
      localcjE.d(localbTI, i);
      this.cRJ.refresh();
      dLE.doY().a(localboI, localboI.getFields());

      aoH();

      return false;
    case 19353:
      localObject = cBQ.cxL().a(bU.fH().getString("notification.restatSpellsSuccess"), Cn.et(7), 2L, 102, 1);

      ((cKX)localObject).a(new YC(this));

      return false;
    case 19354:
      this.cRJ.cET().reset();
      this.cRJ.refresh();
      aoH();
      return false;
    }

    return true;
  }

  private void aoH() {
    dOc localdOc = (dOc)getElementMap().fi("validButton");
    if (this.cRJ.cET().aIL())
      cRO.x(localdOc);
    else
      localdOc.getAppearance().J(gm.class);
  }

  private cpa getElementMap()
  {
    return cBQ.cxL().coO().nf("spellsRestatDialog");
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.bSY = byv.bFN().bFO();

      Zp localZp = this.bSY.aet();

      dLE.doY().t("breedInfo", localZp);

      cBQ.cxL().a("spellsRestatDialog", VV.dJ("spellsRestatDialog"), 8449L, (short)10000);

      dLE.doY().a("describedSpell", null, "spellsRestatDialog");

      cBQ.cxL().j("wakfu.spellsRestat", MI.class);

      aWc.blo().eO(600114L);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.cRJ = null;

      dLE.doY().removeProperty("breedInfo");

      cBQ.cxL().mW("spellsRestatDialog");

      cBQ.cxL().mN("wakfu.spellsRestat");

      aWc.blo().eO(600013L);
    }
  }

  public cjE aoI() {
    return this.cRJ.cET();
  }

  public cLX aoJ() {
    return this.cRJ;
  }

  public String toString() {
    return "UISpellsRestatFrame{m_localPlayer=" + this.bSY + '}';
  }
}