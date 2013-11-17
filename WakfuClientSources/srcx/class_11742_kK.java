import java.util.BitSet;
import org.apache.log4j.Logger;

public class kK extends aYO
{
  private static final aee bx = new bOO(new Hu());

  private static final qM aOz = new dzQ(new ec[] { new dLx("Vol de Charac (Gain pour caster)", new dmb[] { new dmb("valeur (-1 pour valeur restante dans la charac)", dnN.lnR) }), new dLx("Vol de Charac", new dmb[] { new dmb("valeur (-1 pour valeur restante dans la charac)", dnN.lnR), new dmb("Buff (1) ou Gain (0=default) pour caster", dnN.lnR) }) });

  private static final qM aOA = new dzQ(new ec[] { new dLx("Vol de Charac (Gain pour caster)", new dmb[] { new dmb("Charac", dnN.lnR), new dmb("valeur (-1 pour valeur restante dans la charac)", dnN.lnR) }), new dLx("Vol de Charac", new dmb[] { new dmb("Charac", dnN.lnR), new dmb("valeur (-1 pour valeur restante dans la charac)", dnN.lnR), new dmb("Buff (1) ou Gain (0=default) pour caster", dnN.lnR) }), new dLx("Vol de Charac, buff poru le caster, avec def des params pour la fin de l'effet de buff", new dmb[] { new dmb("Charac", dnN.lnR), new dmb("valeur (-1 pour valeur restante dans la charac)", dnN.lnR), new dmb("Buff pour caster (pas utilisé, buff forcé)", dnN.lnR), new dmb("Buff se termine en fin de tour (0/1)", dnN.lnR), new dmb("Buff en tours complets (0/1)", dnN.lnR) }) });

  private boolean aOB = false;
  private boolean aOC;
  private boolean aOD = false;
  private boolean aOE = true;

  public cCH aAR = new Ht(this);

  public qM aF()
  {
    if (this.aOB) {
      return aOA;
    }
    return aOz;
  }

  public kK()
  {
    this.aOB = true;
    this.aOD = false;
    this.aOE = true;
  }

  public kK(eu parameu) {
    super(parameu);
    this.aOB = false;
    this.aOD = false;
    this.aOE = true;
    aH();
  }

  public kK ss()
  {
    kK localkK;
    try
    {
      localkK = (kK)bx.Mm();
      localkK.aOr = bx;
    } catch (Exception localException) {
      localkK = new kK();
      localkK.aOr = null;
      localkK.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacSteal : " + localException.getMessage());
    }
    localkK.aOF = this.aOF;
    localkK.aOB = this.aOB;
    localkK.aOD = this.aOD;
    localkK.aOE = this.aOE;
    return localkK;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL == null) {
      return;
    }
    short s = cVC();

    if (this.aOB) {
      this.aOF = eu.a(Byte.valueOf((byte)((dpI)this.eWL).a(0, s, dNF.meh)));
      if (this.aOF == null)
        return;
    }
    int i = this.aOB ? 1 : 0;

    this.cxl = ((dpI)this.eWL).a(i, s, dNF.meh);
    if (((dpI)this.eWL).bep() > i + 1)
      this.aOC = (((dpI)this.eWL).nl(i + 1) == 1.0F);
    else {
      this.aOC = false;
    }
    if (((dpI)this.eWL).bep() == 5) {
      this.aOC = true;
      this.aOE = (((dpI)this.eWL).a(3, s, dNF.meh) == 1);
      this.aOD = (((dpI)this.eWL).a(4, s, dNF.meh) == 1);
    } else {
      this.aOD = false;
      this.aOE = true;
    }
  }

  public void aH()
  {
    super.aH();
    if (this.aOF == null)
      return;
    switch (this.aOF.ln())
    {
    case 0:
      switch (Hs.aCX[((eu)this.aOF).ordinal()]) {
      case 1:
        this.eWR.set(59);
      }
      break;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    dle localdle = sx();
    if ((localdle == null) || (!localdle.b(this.aOF)) || (this.evo == null) || (!this.evo.b(this.aOF))) {
      jJ(true);
    }
    else {
      if (bkt()) {
        if (this.cxl == -1)
          this.cxl = localdle.e(this.aOF);
        else
          this.cxl = (this.cxl < localdle.e(this.aOF) ? this.cxl : localdle.e(this.aOF));
      }
      if (this.aOC) {
        b(paramaVc, paramBoolean);
        kM localkM = new kM(this.aOF);
        localkM.j(this.evo);
        localkM.bkr();
        localkM.kf(this.cxl);
        localkM.B(true);
        localkM.u(this);
        localkM.i(this.evo);
        localkM.b(cHp.r(this.aOD, this.aOE));
        localkM.b(this.ejP);
        localkM.k(this.evo);
      } else {
        this.evo.a(this.aOF).gv(this.cxl);
      }
    }

    super.a(paramaVc, paramBoolean);
  }

  protected int st()
  {
    return 100;
  }

  public boolean aL()
  {
    return true;
  }

  public cCH lJ()
  {
    return this.aAR;
  }
}