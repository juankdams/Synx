import java.util.BitSet;
import org.apache.log4j.Logger;

public abstract class gE extends doA
{
  private static final qM by = new dzQ(new ec[0]);

  protected boolean aFK = true;
  protected boolean aFL = false;
  protected boolean aFM = true;
  private cYk aFN;
  public cCH aAR = new cSN(this, 11);

  public qM aF()
  {
    return by;
  }

  protected gE() {
    aH();
  }

  public abstract gE gt();

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if (!this.aFK) {
      if (gs() != null)
        this.eUw.ae(gs().ML());
      return;
    }

    a(paramaVc, paramBoolean, gs());
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(189);
  }

  protected abstract dle gs();

  public cYk oO() {
    return this.aFN;
  }

  private void a(aVc paramaVc, boolean paramBoolean, dle paramdle) {
    int i = 1;
    if (paramdle == null) {
      K.error("caster null sur un running effect teleport");
      i = 0;
    }

    cYk localcYk = oP();
    if ((i == 0) || (localcYk == null)) {
      return;
    }
    int j = paramdle.fa();
    int k = paramdle.fb();
    short s = paramdle.fc();

    this.aFN = new cYk(j, k, s);

    cLo localcLo = null;
    if ((bkt()) && ((this.ejP instanceof dMC))) {
      localcLo = new cLo(((dMC)this.ejP).dps(), paramdle, localcYk);
      localcLo.U(paramdle.ML());
    }

    paramdle.q(localcYk.getX(), localcYk.getY(), localcYk.IB());

    b(paramaVc, paramBoolean);

    if ((this.ejP.LC() != null) && (bkt()) && (localcLo != null))
    {
      CG localCG = new La(j, k, s, paramdle.fa(), paramdle.fb(), paramdle.fc()).Vy();
      paramdle.g(localCG);
      localcLo.T(paramdle.ML());
      localcLo.cEx();
      if (localcLo.cEy()) {
        localcLo.cED();
      }
      paramdle.g(null);
    }
  }

  protected cYk oP() {
    return this.eUw;
  }

  public void a(aVc paramaVc)
  {
    dle localdle = gs();
    if ((!(localdle instanceof dhJ)) || (this.eUw == null)) {
      this.aFK = false;
      return;
    }
    UG localUG = this.ejP.LB();
    if (localUG == null) {
      K.warn("pas de fightmap sur le context " + this.ejP);
      this.aFK = false;
      return;
    }
    bep localbep = localUG.u(this.eUw.getX(), this.eUw.getY(), this.eUw.IB());
    if (localbep == null) {
      this.aFK = false;
      return;
    }
    if ((!this.aFL) && ((localdle.c(cfY.hBk)) || (localdle.c(cfY.hCd))))
    {
      this.aFK = false;
      return;
    }
    if ((((aTa)localdle).Vj()) && (!oQ())) {
      this.aFK = false;
    }

    if ((this.aFM) && (!localUG.a(localdle, this.eUw))) {
      K.error("On demande un téléport sur une cellule invalide. Position demandée : " + this.eUw + " pour l'instance " + localUG.D());
      this.aFK = false;
    }
  }

  protected boolean oQ() {
    return false;
  }

  public abstract boolean aL();

  public abstract boolean aM();

  public abstract boolean aN();

  public void bc()
  {
    this.aFN = null;
    this.aFL = false;
    this.aFM = true;
    super.aJ();
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}