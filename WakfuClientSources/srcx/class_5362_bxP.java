import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bxP extends ang
{
  private azX fLs;
  private bKi giT;
  private aCH giU;

  public bxP()
  {
  }

  public bxP(azX paramazX, bKi parambKi)
  {
    this.fLs = paramazX;
    this.giT = parambKi;
    this.giU = clR.cni().vL(this.giT.gC());
    this.dqN = new doy(this);
  }

  public bKi bFc()
  {
    return this.giT;
  }

  public bVf bFd() {
    return this.fLs;
  }

  public cYk azG() {
    return this.fLs.atB();
  }

  public csx qb()
  {
    return new bxP();
  }

  public aiI pW()
  {
    return aiI.dfG;
  }

  public List EB()
  {
    if (Ew() == dqU.ltp) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();

    dxy localdxy = this.fLs.aLV();

    ayn localayn = bWW.ccf().FB();

    byz localbyz = byv.bFN().bFO();
    Object localObject1;
    int k;
    if (this.giT.bOJ()) {
      localObject1 = new ArrayList();
      if ((localdxy instanceof ceV)) {
        for (k : ((ceV)localdxy).BA())
          ((ArrayList)localObject1).add(blo.bws().qc(k));
      }
      else {
        ((ArrayList)localObject1).add(dcK.cOf().zJ(localdxy.bqt()));
      }
      for (??? = ((ArrayList)localObject1).iterator(); ((Iterator)???).hasNext(); ) { acy localacy = (acy)((Iterator)???).next();
        if ((localacy != null) && (localacy.aoT()) && (!localacy.aoU())) {
          De localDe = new De(localbyz);
          k = localacy.aoV();
          if (k != 0)
          {
            agy localagy;
            if (k > 0)
              localagy = agy.daq;
            else {
              localagy = agy.dap;
            }
            localDe.a(localagy);
            localArrayList.addAll(localDe.bDr());
          }
        }
      }
    }

    if (!this.fLs.aLV().c(aDc.dXL)) {
      localObject1 = new cwu(localbyz, this.fLs, this.giT, localayn == null ? null : localayn.aKu());
      localArrayList.addAll(((cwu)localObject1).bDr());
    }

    return localArrayList;
  }

  public List EC()
  {
    return null;
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.c(dKm.lXV)) {
      return false;
    }
    boolean bool = (this.giU.isEnabled()) && (bFe() != dQO.mlz) && (!localbyz.adF()) && (!aYP.feK.bnQ());

    if (bool) {
      setEnabled(true);

      dwN localdwN = localbyz.bHa();
      if ((localdwN != null) && (!localdwN.a(localbyz, this.fLs.fa(), this.fLs.fb())))
      {
        setEnabled(false);
      }
    }

    return bool;
  }

  public String qa()
  {
    if (this.giU == null) {
      return "undefined";
    }
    return this.giU.aOS();
  }

  public bNa apQ()
  {
    if (this.giT.axX() == 0) {
      return bNa.gRA;
    }

    deT localdeT = DA.bIr.eD(this.giT.axX());
    byz localbyz = byv.bFN().bFO();
    short s = localbyz.aTn().getLevel(this.giT.axX());
    int i = this.giT.bOH();
    int j = Et.a(s, (short)i, localdeT, localbyz) == 0L ? 1 : 0;
    return bFe() != dQO.mlv ? bNa.gRA : j != 0 ? bNa.gRE : bNa.gRz;
  }

  public boolean isEnabled()
  {
    return bFe() == dQO.mls;
  }

  protected int qc()
  {
    return this.giU.aOR();
  }

  private dQO bFe() {
    byz localbyz = byv.bFN().bFO();
    azP localazP = localbyz.aTn();
    cWE localcWE = this.giT.bOK();
    boolean bool = bGP.gDx.a(new aGH[] { localbyz });
    if ((this.giT.axX() != 0) && ((!localazP.contains(this.giT.axX())) || (cYb.cLu().s(this.fLs)))) {
      return dQO.mlz;
    }
    if (!bool) {
      return dQO.mlD;
    }
    if (localazP.getLevel(this.giT.axX()) < this.giT.bOH()) {
      return dQO.mlv;
    }
    if (!this.giU.K(localbyz)) {
      return dQO.mlz;
    }
    if ((this.giT.F() != null) && (!this.giT.F().i(localbyz, this.dvI, null, null))) {
      return dQO.mlt;
    }
    if ((localcWE.cKw()) && (localbyz.bGP().ye(localcWE.Uv()) == null) && (((Vu)localbyz.b(RS.cru)).ha(localcWE.Uv()) == null))
    {
      return dQO.mlA;
    }
    if (this.fLs == localbyz.aeS()) {
      return dQO.mly;
    }
    return dQO.mls;
  }

  public String getLabel()
  {
    lZ locallZ = new lZ();
    locallZ.tz().a(bU.fH().getString("desc.mru." + qa())).tA();

    if (this.giT.Ux() != 0) {
      locallZ.tH();
      bBn localbBn1 = Hh.QM().dh(this.giT.Ux());
      if (localbBn1 != null)
        locallZ.a(localbBn1.getName());
      else {
        locallZ.a("#ERROR#");
      }
    }

    int i = this.giT.axX();
    if (i != 0) {
      locallZ.tH();
      localObject = bU.fH().b(43, i, new Object[0]);
      locallZ.a((CharSequence)localObject).a(" : ").tI().am(apQ().bUV()).a(bU.fH().getString("desc.mru.levelRequired", new Object[] { Integer.valueOf(this.giT.bOH()) })).tJ();
    }

    Object localObject = bFe();

    cWE localcWE = this.giT.bOK();
    if (localcWE.cKw()) {
      locallZ.tH();
      int j = localcWE.Uv();
      bBn localbBn2 = Hh.QM().dh(j);
      String str = localbBn2.getName();
      locallZ.a(bU.fH().getString("itemNeeded"));
      locallZ.tI().am(localObject == dQO.mlA ? ict : ics).a(str).tJ();
    }

    if (localObject != dQO.mls) {
      switch (doz.bXi[localObject.ordinal()]) {
      case 1:
        locallZ.tH().tI().am(ict).a(bU.fH().getString("error.playerNotSubscribed")).tJ();
        break;
      case 2:
        locallZ.tH().tI().am(ict).a(bU.fH().getString("collect.error.wrongLevel")).tJ();
        break;
      case 3:
        bZA localbZA = this.giT.F();
        if (localbZA != null)
          locallZ.tH().tI().am(ict).a(daj.a(localbZA)).tJ();
        else {
          locallZ.tH().tI().am(ict).a(bU.fH().getString("error.unknown")).tJ();
        }
        break;
      case 4:
        locallZ.tH().tI().am(ict).a(bU.fH().getString("collect.error.tooEarly")).tJ();
        break;
      case 5:
        locallZ.tH().tI().am(ict).a(bU.fH().getString("collect.resourceAlreadyUseByPlayer")).tJ();
        break;
      case 6:
        locallZ.tH().tI().am(ict).a(bU.fH().getString("action.error.wrongItemEquiped")).tJ();
        break;
      case 7:
        break;
      default:
        locallZ.tH().tI().am(ict).a(bU.fH().getString("unknown")).tJ();
      }
    }

    int k = this.giT.bOG();
    if (k > 1) {
      locallZ.tH().a(bU.fH().getString("collect.nbPlayers", new Object[] { Integer.valueOf(k) }));
    }

    return locallZ.tP();
  }

  private void p(azX paramazX) {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    localcew.c(localbyz.ML().Z(this.fLs.atB()));

    int i = 1;
    int j = dDC.Ct(this.giT.axX());

    int k = localbyz.ML().ac(this.fLs.atB());
    if ((k < 1) || (k > j)) {
      cYb.cLu().cLv();
      return;
    }

    cYb.cLu().wg();

    csB localcsB = new csB(this.giT.getId(), paramazX.fa(), paramazX.fb());
    byv.bFN().aJK().d(localcsB);
  }

  public void run()
  {
    fy(false);
  }

  public void fy(boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();

    if (!pZ()) {
      cYb.cLu().cLv();
      return;
    }

    if ((this.fLs == null) || (!this.fLs.aLS())) {
      cYb.cLu().cLv();
      return;
    }

    dCb localdCb = localbyz.aeS();
    if ((localdCb != null) && (localdCb == this.fLs)) {
      cYb.cLu().cLv();
      return;
    }

    if (!localbyz.q(false, true)) {
      return;
    }

    int i = 1;
    int j = dDC.Ct(this.giT.axX());

    cwO.a((short)localbyz.bY(), localbyz.afD(), localbyz.arG());
    ArrayList localArrayList = new ArrayList();

    int k = 1;

    CG[] arrayOfCG = CG.LR();
    cYk localcYk1 = localbyz.ML();

    for (int m = 0; m < arrayOfCG.length; m++) {
      CG localCG = arrayOfCG[m];
      cYk localcYk2 = new cYk(this.fLs.atB());
      for (int n = 1; n <= j; n++) {
        localcYk2.k(localCG);
        short s = cwO.U(localcYk2.getX(), localcYk2.getY(), localcYk2.IB());
        if ((s != -32768) && (dDC.a((short)localbyz.bY(), s, this.fLs.ML().IB(), this.giT.axX())))
        {
          localcYk2.dG(s);
          localArrayList.add(localcYk2);
          k &= (!localcYk1.equals(localcYk2) ? 1 : 0);
          break;
        }
      }
    }

    if (localArrayList.isEmpty()) {
      avW.aIb().a(2, 3, new Object[0]);
      cYb.cLu().cLv();
      return;
    }

    if (localbyz.aeL().dpE()) {
      k = 1;
    }

    if (k != 0)
    {
      localbyz.aeL().b(this.dqN);

      m = localcYk1.ac(this.fLs.atB()) > 2 ? 1 : 0;

      if (!localbyz.a(false, m, localArrayList)) {
        localbyz.aeL().c(this.dqN);
        avW.aIb().a(2, 3, new Object[0]);
        cYb.cLu().cLv();
      }
    } else {
      p(this.fLs);
    }
  }
}