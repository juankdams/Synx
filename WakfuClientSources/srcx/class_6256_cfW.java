import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class cfW extends ang
{
  private bKi giT;
  private aCH giU;

  public List EB()
  {
    if (Ew() != dqU.ltr)
      return null;
    ArrayList localArrayList = new ArrayList();

    ayn localayn = bWW.ccf().FB();

    byz localbyz = byv.bFN().bFO();

    cwu localcwu = new cwu(localbyz, (byo)this.dvI, this.giT, localayn == null ? null : localayn.aKu());

    localArrayList.addAll(localcwu.bDr());
    return localArrayList;
  }

  public List EC()
  {
    return null;
  }

  public cfW(bKi parambKi)
  {
    this.giT = parambKi;
    this.giU = clR.cni().vL(this.giT.gC());
    this.dqN = new KH(this);
  }

  public csx qb()
  {
    return new bxP();
  }

  public aiI pW()
  {
    return aiI.dfG;
  }

  public void run()
  {
    fy(false);
  }

  public boolean isEnabled()
  {
    return bFe() == dQO.mls;
  }

  public void fy(boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();

    if (!pZ()) {
      cYb.cLu().cLv();
      return;
    }

    if (this.dvI == null) {
      cYb.cLu().cLv();
      return;
    }

    byo localbyo = (byo)this.dvI;

    if (!localbyz.q(false, true)) {
      return;
    }

    localbyz.aeL().b(this.dqN);

    Object localObject1 = null;
    int i;
    int j;
    if (this.giU.aOU()) {
      localObject2 = this.giU.L(localbyz);
      localbyz.ayJ().dB((short)azO.dRO.hV);
      if (localObject2 == null) {
        cYb.cLu().cLv();
        return;
      }

      i = ((gA)localObject2).oi().bKp();
      j = ((gA)localObject2).oi().bKo();
    } else {
      i = 1;
      j = 1;
    }

    cwO.a((short)localbyz.bY(), localbyz.afD(), localbyz.arG());
    Object localObject2 = new ArrayList();

    int k = 1;

    CG[] arrayOfCG = CG.LR();
    cYk localcYk1 = localbyz.ML();

    for (int m = 0; m < arrayOfCG.length; m++) {
      CG localCG = arrayOfCG[m];
      cYk localcYk2 = new cYk(localbyo.ML());
      for (int n = i; n <= j; n++) {
        localcYk2.k(localCG);
        short s = cwO.U(localcYk2.getX(), localcYk2.getY(), localcYk2.IB());
        if (s != -32768) {
          localcYk2.dG(s);
          ((ArrayList)localObject2).add(localcYk2);
          k &= (!localcYk1.equals(localcYk2) ? 1 : 0);
          break;
        }
      }
    }

    if (((ArrayList)localObject2).isEmpty()) {
      avW.aIb().a(2, 3, new Object[0]);
      cYb.cLu().cLv();
      return;
    }

    if (localbyz.aeL().dpE()) {
      k = 1;
    }

    if (k == 0) {
      g(localbyo, false);
      return;
    }

    localbyz.aeL().b(this.dqN);

    m = localcYk1.ac(localbyo.ML()) > 2 ? 1 : 0;

    if (!localbyz.a(false, m, (List)localObject2)) {
      localbyz.aeL().c(this.dqN);
      avW.aIb().a(2, 3, new Object[0]);
    }
  }

  public bKi bFc()
  {
    return this.giT;
  }

  public bVf bFd() {
    if (!(this.dvI instanceof byo)) {
      return null;
    }
    return ((byo)this.dvI).aeM();
  }

  public cYk azG() {
    return null;
  }

  private dQO bFe() {
    byz localbyz = byv.bFN().bFO();
    byo localbyo = (byo)this.dvI;
    azP localazP = localbyz.aTn();
    if (!localazP.contains(this.giT.axX())) {
      return dQO.mlz;
    }
    if (localbyo.adF()) {
      return dQO.mlw;
    }

    if (!bGP.gDx.a(new aGH[] { localbyz })) {
      return dQO.mlD;
    }
    if (!localbyo.rv(this.giT.getId())) {
      return dQO.mlx;
    }
    if (!this.giU.K(localbyz)) {
      return dQO.mlB;
    }
    if (localazP.getLevel(this.giT.axX()) < this.giT.bOH()) {
      return dQO.mlv;
    }
    if ((this.giT.F() != null) && (!this.giT.F().i(localbyz, this.dvI, null, null))) {
      return dQO.mlt;
    }
    return dQO.mls;
  }

  public boolean pZ()
  {
    if (!this.giU.isEnabled()) {
      return false;
    }

    if (bFe() == dQO.mlz) {
      return false;
    }

    byz localbyz = byv.bFN().bFO();
    if (localbyz.c(dKm.lXG)) {
      return false;
    }
    int i = (this.giT.F() == null) || (this.giT.F().i(localbyz, this.dvI, null, null)) ? 1 : 0;
    int j = !localbyz.adF() ? 1 : 0;
    int k = !aYP.feK.bnQ() ? 1 : 0;

    return (i != 0) && (j != 0) && (k != 0);
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
    return bFe() == dQO.mls ? bNa.gRA : bNa.gRz;
  }

  protected int qc()
  {
    return this.giU.aOR();
  }

  public String getLabel()
  {
    lZ locallZ = new lZ().tz();
    locallZ.a(bU.fH().getString("desc.mru." + qa()));
    locallZ.tA().a("\n");

    bBn localbBn = Hh.QM().dh(this.giT.Ux());
    locallZ.a(localbBn != null ? localbBn.getName() : "#ERROR#").a("\n");
    String str = bU.fH().b(43, this.giT.axX(), new Object[0]);
    locallZ.a(str).a(" ");

    dQO localdQO = bFe();
    bNa localbNa = localdQO == dQO.mlv ? bNa.gRz : bNa.gRA;

    locallZ.tI().am(localbNa.bUV());
    locallZ.a(bU.fH().getString("desc.mru.levelRequired", new Object[] { Integer.valueOf(this.giT.bOH()) }));
    locallZ.tJ();

    if (localdQO != dQO.mls) {
      locallZ.tI().am(bNa.gRz.bUV());
      switch (KF.bXi[localdQO.ordinal()]) {
      case 1:
        locallZ.a("\n").a(bU.fH().getString("collect.error.npc.inFight"));
        break;
      case 2:
        locallZ.a("\n").a(bU.fH().getString("error.playerNotSubscribed"));
        break;
      case 3:
        locallZ.a("\n").a(bU.fH().getString("collect.error.wrongLevel"));
        break;
      case 4:
        locallZ.a("\n").a(bU.fH().getString("collect.error.npc.collected"));
        break;
      case 5:
        bZA localbZA = this.giT.F();
        if (localbZA != null)
          locallZ.tH().a(daj.a(localbZA));
        else {
          locallZ.a("\n").a(bU.fH().getString("error.unknown"));
        }
        break;
      case 6:
        locallZ.a("\n").a(bU.fH().getString("action.error.wrongItemEquiped"));
      }

      locallZ.tJ();
    }

    return locallZ.tP();
  }

  private void g(Su paramSu, boolean paramBoolean) {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();

    int i = cqJ.c(localcew, paramSu);
    if (i <= 1)
    {
      CG localCG = localcew.atB().Z(((Su)this.dvI).ML());
      if (localCG != null) {
        localcew.c(localCG);
      }

      if (this.giU.aOU()) {
        gA localgA = this.giU.L(localbyz);
        if (localgA == null) {
          cYb.cLu().cLv();
          return;
        }
      }

      float f = Math.abs(paramSu.fc() - localcew.getAltitude());
      if (f > localcew.arG()) {
        K.error("Plantation impossible sur la cellule " + paramSu.ML() + " : hauteur maximale de saut de " + localcew.arG());
        avW.aIb().a(2, 3, new Object[0]);
        cYb.cLu().cLv();
        return;
      }

      localcew.c(this.dqN);

      cYb.cLu().wg();

      JR localJR = new JR(this.giT.getId(), paramSu.getId());
      byv.bFN().aJK().d(localJR);
    } else if ((paramBoolean) && (i <= 2)) {
      localcew.b(this.dqN);
      if (!localbyz.a((alr)this.dvI, false, false)) {
        localcew.c(this.dqN);
        avW.aIb().a(2, 3, new Object[0]);
        cYb.cLu().cLv();
        return;
      }
    }
  }
}