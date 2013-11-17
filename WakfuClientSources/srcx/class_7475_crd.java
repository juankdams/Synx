public class crd extends csx
  implements bye
{
  protected cYk aVG;

  public aiI pW()
  {
    return aiI.dgd;
  }

  public void run() {
    if (!pZ()) {
      return;
    }
    cYk localcYk1 = cpP();

    byz localbyz = byv.bFN().bFO();
    this.aVG = localcYk1;

    if (!localbyz.q(false, true))
      return;
    localbyz.aeL().b(this);

    if (!localbyz.b(this.aVG, false, true)) {
      localbyz.aeL().c(this);
      cYk localcYk2 = localbyz.aeL().atB();
      if ((Math.abs(localcYk2.getX() - this.aVG.getX()) <= 1) && (Math.abs(localcYk2.getY() - this.aVG.getY()) <= 1))
      {
        cpR();
        cpO();
        return;
      }
      cpQ();
    }
  }

  private void cpO() {
    int i = ((Su)this.dvI).aeR();
    if (dmM.cUe().cUf() == i)
      return;
    bng localbng = new bng();
    localbng.cS(i);
    byv.bFN().aJK().d(localbng);
  }

  public cYk cpP() {
    Su localSu = (Su)this.dvI;
    ckT localckT = cjS.clP().vz(localSu.aeR());
    if (localckT == null) {
      return null;
    }
    cYk localcYk = i(localckT);

    return localcYk;
  }

  private cYk i(ckT paramckT) {
    byz localbyz = byv.bFN().bFO();
    cYk localcYk1 = localbyz.ML();
    cYk localcYk2 = new cYk(localcYk1);

    int i = 2147483647;
    UG localUG = paramckT.LB();
    int j = localUG.getMinX();
    int k = localUG.getMinY();

    cYk localcYk3 = new cYk();

    for (int m = j; m < j + localUG.getWidth(); m++)
      for (int n = k; n < k + localUG.getHeight(); n++)
        if (localUG.ap(m, n)) {
          short s = localUG.aw(m, n);
          int i1 = localcYk1.ab(m, n, s);
          if (i1 < i)
          {
            localcYk3.ac(m, n, s);

            a(paramckT, localcYk3);

            if (!localcYk3.ae(m, n))
            {
              if (cwO.v(localcYk3.getX(), localcYk3.getY(), localcYk3.IB()))
              {
                i = i1;
                localcYk2.ae(localcYk3);
                if (i == 0) break;
              }
            }
          }
        }
    return localcYk2;
  }

  private cYk a(ckT paramckT, cYk paramcYk)
  {
    UG localUG = paramckT.LB();
    if (!localUG.aq(paramcYk.getX() + 1, paramcYk.getY()))
      paramcYk.p(1, 0, 0);
    else if (!localUG.aq(paramcYk.getX(), paramcYk.getY() + 1))
      paramcYk.p(0, 1, 0);
    else if (!localUG.aq(paramcYk.getX() - 1, paramcYk.getY()))
      paramcYk.aa(1, 0, 0);
    else if (!localUG.aq(paramcYk.getX(), paramcYk.getY() - 1)) {
      paramcYk.aa(0, 1, 0);
    }
    return paramcYk;
  }

  private void cpQ() {
    aEe localaEe = new aEe(bU.fH().getString("fight.no.path.to.border"));
    localaEe.mm(3);
    CM.LV().a(localaEe);
  }

  public void b(dMM paramdMM, int paramInt1, int paramInt2, short paramShort) {
    paramdMM.c(this);
    if ((this.aVG.getX() != paramInt1) || (this.aVG.getY() != paramInt2))
      return;
    cpR();
    cpO();
  }

  private void cpR() {
    byz localbyz = byv.bFN().bFO();
    Su localSu = (Su)this.dvI;
    ckT localckT = cjS.clP().vz(localSu.aeR());
    if (localckT != null) {
      CG localCG = localbyz.ML().Z(localckT.LB().ahT());
      if (localCG != null)
        localbyz.aeL().i(localCG);
    }
  }

  public boolean pZ()
  {
    byz localbyz = byv.bFN().bFO();
    if (localbyz.adF()) {
      return false;
    }
    if (aYP.feK.bnQ()) {
      return false;
    }

    if (localbyz.bGv() != null) {
      return false;
    }
    if ((this.dvI instanceof Su)) {
      return (((Su)this.dvI).adF()) && (!((Su)this.dvI).isDead());
    }
    return false;
  }

  public String qa()
  {
    return "becameFightSpectator";
  }

  public csx qb() {
    return new crd();
  }

  protected int qc()
  {
    return coH.hXk.aw;
  }
}