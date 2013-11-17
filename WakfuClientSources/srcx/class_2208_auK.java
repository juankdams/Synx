import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class auK extends vC
{
  public static final int ENABLED = 0;
  public static final int dHH = 1;
  public static final int dHI = 2;
  private bye aUm;
  private int cPV;

  public aiI pW()
  {
    return aiI.dfy;
  }

  public csx qb() {
    return new auK();
  }

  public void run() {
    if (!pZ()) {
      K.error("Tentative de lancement de l'action '" + pW().bL() + "' alors que isRunnable retourne que l'action est impossible");
      return;
    }

    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    if (this.aUm != null) {
      localcew.c(this.aUm);
    }
    bKm localbKm = (bKm)this.dvI;
    if (!FJ.a(new czx(localbKm.getName(), 3))) {
      return;
    }
    int i = localbKm.fa() - localcew.fa();
    int j = localbKm.fb() - localcew.fb();

    if ((Math.abs(i) <= 1) && (Math.abs(j) <= 1)) {
      localcew.c(La.l(i, j));

      cUc localcUc = new cUc();
      localcUc.jh(localbKm.getId());
      byv.bFN().aJK().d(localcUc);
      return;
    }

    this.aUm = new Eo(this);

    localcew.b(this.aUm);

    localbyz.b(((bKm)this.dvI).ML(), true, true);
  }

  public boolean isEnabled() {
    byz localbyz = byv.bFN().bFO();

    bKm localbKm = (bKm)this.dvI;
    if (bGP.gDv.a(new aGH[] { localbyz }) != bGP.gDv.a(new aGH[] { localbKm })) {
      this.cPV = 2;
      return false;
    }

    if ((byv.bFN().bFO().bSv()) || (localbKm.bSv())) {
      this.cPV = 1;
      return false;
    }
    return true;
  }

  public boolean pZ()
  {
    if (!(this.dvI instanceof bKm)) {
      return false;
    }

    Su localSu = (Su)this.dvI;
    if (localSu.adF()) {
      return false;
    }
    if (localSu.c(dKm.lXA)) {
      return false;
    }
    if ((localSu.bSB() != null) && (localSu.bSB().fU() == 4)) {
      return false;
    }
    byz localbyz = byv.bFN().bFO();
    if (localbyz.bGK()) {
      return false;
    }
    if (localbyz.c(dKm.lXA)) {
      return false;
    }
    if (localbyz.adF()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }
    return true;
  }

  public String qa()
  {
    return "trade";
  }

  public String getLabel() {
    if (!isEnabled()) {
      locallZ = new lZ();
      locallZ.tz().a(bU.fH().getString("desc.mru." + qa())).tA().a("\n");

      locallZ.tI().am(ict);
      switch (this.cPV) {
      case 2:
        locallZ.a(bU.fH().getString("error.someoneNotSubscribed")).tJ();
        break;
      case 1:
        locallZ.a(bU.fH().getString("exchange.forbidden.in.prison")).tJ();
      }

      return locallZ.tP();
    }

    if (!(this.dvI instanceof Su)) {
      return qa();
    }
    lZ locallZ = new lZ().tz().am(icr);
    locallZ.a(bU.fH().getString("exchange.with", new Object[] { ((Su)this.dvI).getName() })).tA();
    return locallZ.tP();
  }

  protected int qc()
  {
    return coH.hWg.aw;
  }

  public List EB() {
    if (Ew() != dqU.ltr)
      return null;
    byz localbyz = byv.bFN().bFO();

    kW localkW = new kW(localbyz, (cTK)this.dvI);

    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(localkW.bDr());
    return localArrayList;
  }

  public List EC() {
    return null;
  }
}