import java.util.List;
import org.apache.log4j.Logger;

public class dPm
  implements bOW, cvW, dCn
{
  private static final Logger K = Logger.getLogger(dPm.class);

  private static final dPm mgM = new dPm();
  private aFy mgN;
  private bnm N;
  private byz bSY;
  private boolean dQN = false;

  public static dPm dqv()
  {
    return mgM;
  }

  public final void au(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("spellsDialog")))
      byv.bFN().b(this);
  }

  public final void dqw()
  {
    byv localbyv = byv.bFN();
    if (localbyv.c(this))
      localbyv.b(this);
    else
      localbyv.a(this);
  }

  public boolean a(cWG paramcWG)
  {
    byv localbyv;
    byz localbyz;
    apX localapX1;
    Object localObject;
    switch (paramcWG.getId())
    {
    case 4214:
      acB();
      break;
    case 16435:
      localbyv = byv.bFN();
      localbyz = localbyv.bFO();
      localapX1 = (apX)localbyz.auK().hh(localbyz.aHq());

      localObject = new cxe();
      ((cxe)localObject).cuy();
      localbyv.aJK().d((cWG)localObject);
      localbyz.aHr();
      dLE.doY().a(localbyz, new String[] { "lockedSpell" });
      dLE.doY().a(localapX1, apX.bF);
      localbyz.bGD().cWX();
      return false;
    case 16436:
      localbyv = byv.bFN();
      localbyz = localbyv.bFO();
      localapX1 = (apX)localbyz.auK().hh(localbyz.aHq());

      localObject = (bMq)paramcWG;
      apX localapX2 = ((bMq)localObject).QI();
      cxe localcxe = new cxe();
      localcxe.wY(((dSR)localapX2.bsL()).getId());
      localbyv.aJK().d(localcxe);
      localbyv.bFO().kx(((dSR)localapX2.bsL()).getId());
      dLE.doY().a(localbyv.bFO(), new String[] { "lockedSpell" });
      dLE.doY().a(localapX2, apX.bF);
      dLE.doY().a(localapX1, apX.bF);
      localbyz.bGD().cWX();
      return false;
    }

    return true;
  }

  public long getId() {
    return 50L;
  }

  public void a(long paramLong)
  {
  }

  private String Dh(int paramInt)
  {
    switch (paramInt) {
    case 3:
      return "desc.spellEarth";
    case 2:
      return "desc.spellWater";
    case 4:
      return "desc.spellWind";
    case 1:
      return "desc.spellFire";
    case 5:
      return "desc.spellStasis";
    case 0:
      return "desc.spellPhysical";
    case 9:
      return "desc.spellSupport";
    case 6:
    case 7:
    case 8: } return null;
  }

  public final void acB() {
    dLE.doY().a(this.bSY, this.bSY.getFields());
  }

  private void dqx() {
    cpa localcpa = cBQ.cxL().coO().nf("worldAndFightBarDialog");
    if (localcpa == null)
      return;
    dOc localdOc = (dOc)localcpa.fi("spellButton");
    if (localdOc == null) {
      return;
    }
    localdOc.getAppearance().J(gm.class);
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (!this.dQN) {
      dqx();

      this.bSY = byv.bFN().bFO();

      ahQ localahQ = this.bSY.bSs();

      Zp localZp = this.bSY.aet();

      dLE.doY().t("breedInfo", localZp);
      dLE.doY().t("characterLocal", this.bSY);

      this.N = new asb(this);

      asa localasa = new asa(this);

      cBQ.cxL().a(this.N);
      cBQ.cxL().a(localasa);

      cBQ.cxL().a("spellsDialog", VV.dJ("spellsDialog"), 32769L, (short)10000);
      try
      {
        apX localapX = (apX)this.bSY.bSs().aU((byte)0).get(0);
        dLE.doY().a("describedSpell", localapX, "spellsDialog");
        dLE.doY().a("editableDescribedSpell", localapX.k(false, true), "spellsDialog");
      } catch (Exception localException) {
        K.error("Impossible de sélectionner le premier sort élémentaire du joueur ! ");
        localException.printStackTrace();
      }

      cBQ.cxL().j("wakfu.characterBook.spellsPage", sw.class);

      aWc.blo().eO(600114L);

      buj.bCk().a(cED.iyE, "spellsDialog");

      dpr localdpr = this.bSY.bGD();
      this.mgN = localdpr.cWy();
      localdpr.a(aFy.ebH, true);
      localdpr.a(this);

      this.dQN = true;
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (this.dQN)
    {
      dLE.doY().removeProperty("breedInfo");

      dLE.doY().removeProperty("characterLocal");
      dLE.doY().removeProperty("describedSpell");
      dLE.doY().removeProperty("editableDescribedSpell");

      cBQ.cxL().b(this.N);
      cBQ.cxL().mW("spellsDialog");

      cBQ.cxL().mN("wakfu.characterBook.spellsPage");

      aWc.blo().eO(600013L);

      dpr localdpr = this.bSY.bGD();
      if (this.bSY.aeQ() == null)
        localdpr.a(this.mgN, true);
      localdpr.b(this);

      this.dQN = false;
    }
  }

  public void e(aFy paramaFy) {
    this.mgN = paramaFy;
  }
}