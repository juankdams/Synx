import java.util.BitSet;
import org.apache.log4j.Logger;

public class ez extends doA
{
  private static final aee bx = new bOO(new afY());

  private static final qM by = new dzQ(new ec[] { new dLx("Echange de position standard", new dmb[0]), new dLx("Bypass stabilisation", new dmb[] { new dmb("Bypass stabilisation (0 = false, 1 = true)", dnN.lnR) }) });
  private cLo aAJ;
  private cLo aAK;
  private int aAL;
  private int aAM;
  private short aAN;
  private int aAO;
  private int aAP;
  private short aAQ;
  public cCH aAR = new afV(this, 20);

  public qM aF()
  {
    return by;
  }

  public ez() {
    aH();
  }

  public final void aH()
  {
    super.aH();
    this.eWR.set(184);
  }

  public ez lI()
  {
    ez localez;
    try {
      localez = (ez)bx.Mm();
      localez.aOr = bx;
    } catch (Exception localException) {
      localez = new ez();
      localez.aOr = null;
      localez.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Push : " + localException.getMessage());
    }
    localez.aAL = this.aAL;
    localez.aAM = this.aAM;
    localez.aAN = this.aAN;

    localez.aAO = this.aAO;
    localez.aAP = this.aAP;
    localez.aAQ = this.aAQ;
    return localez;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    int i = 1;

    if ((this.evo instanceof aTa)) {
      if (((aTa)this.evo).Vj())
        i = 0;
      if ((this.evo.aJu()) || (this.evo.byd()))
        i = 0;
    }
    if (((this.evp instanceof aTa)) && 
      (((aTa)this.evp).Vj())) {
      i = 0;
    }

    dle localdle1 = this.evp;
    dle localdle2 = this.evo;
    int j = 0;
    if (((dpI)this.eWL).bep() == 1) {
      j = ((dpI)this.eWL).a(0, cVC(), dNF.meh) == 1 ? 1 : 0;
    }
    if (j == 0) {
      if ((this.evp != null) && ((this.evp.c(cfY.hBk)) || (this.evp.c(cfY.hCb)))) {
        jJ(true);
        return;
      }

      if ((this.evo != null) && ((this.evo.c(cfY.hBk)) || (this.evo.c(cfY.hCb)))) {
        jJ(true);
        return;
      }
    }

    if ((i != 0) && (localdle2 != null) && (localdle1 != null) && ((this.evp instanceof agl)))
    {
      if (bkt()) {
        this.aAL = localdle2.fa();
        this.aAM = localdle2.fb();
        this.aAN = localdle2.fc();

        this.aAO = localdle1.fa();
        this.aAP = localdle1.fb();
        this.aAQ = localdle1.fc();
      }

      if ((bkt()) && ((localdle1 instanceof dhJ)) && ((localdle2 instanceof dhJ))) {
        a((dhJ)localdle1, (dhJ)localdle2);
      }
      localdle2.q(this.aAO, this.aAP, this.aAQ);
      localdle1.q(this.aAL, this.aAM, this.aAN);

      if (paramaVc != null)
      {
        if (atX())
          paramaVc.j(localdle1);
        else {
          paramaVc.j(localdle2);
        }

      }

      b(paramaVc, paramBoolean);

      if ((this.ejP.LC() != null) && (bkt()))
        a(localdle1, localdle2);
    }
    else {
      jJ(true);
    }
  }

  private void a(dhJ paramdhJ1, dhJ paramdhJ2) {
    dbE localdbE = ((dMC)this.ejP).dps();

    this.aAJ = new cLo(localdbE, paramdhJ2, paramdhJ2.ML());
    this.aAJ.U(paramdhJ2.ML());

    this.aAK = new cLo(localdbE, paramdhJ1, paramdhJ1.ML());
    this.aAK.U(paramdhJ1.ML());
  }

  private void a(dle paramdle1, dle paramdle2) {
    if ((this.aAJ == null) || (this.aAK == null)) {
      return;
    }
    this.aAJ.T(paramdle2.ML());
    this.aAJ.cEx();
    if (this.aAJ.cEy()) {
      this.aAJ.cED();
    }

    this.aAK.T(paramdle1.ML());
    this.aAK.cEx();
    if (this.aAK.cEy())
      this.aAK.cED();
  }

  public void a(aVc paramaVc)
  {
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    this.aAJ = null;
    this.aAK = null;
    super.bc();
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  public int lK()
  {
    return this.aAL;
  }

  public int lL() {
    return this.aAM;
  }

  public short lM() {
    return this.aAN;
  }

  public int lN() {
    return this.aAO;
  }

  public int lO() {
    return this.aAP;
  }

  public short lP() {
    return this.aAQ;
  }
}