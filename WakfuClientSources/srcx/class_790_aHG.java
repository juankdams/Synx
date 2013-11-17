import org.apache.log4j.Logger;

public class aHG extends kM
{
  private static final aee bx = new bOO(new agC());

  private static final qM by = new dzQ(new ec[] { new dLx("Don de charac (debuff pour soi buff pour l'autre)", new dmb[] { new dmb("valeur (-1 = tout)", dnN.lnR) }), new dLx("Don de charac (buff pour soi , debuff pour l'autre)", new dmb[] { new dmb("valeur (-1 = tout)", dnN.lnR), new dmb("Swap target et caster (1 = oui)", dnN.lnS) }) });

  private boolean efN = false;

  public qM aF()
  {
    return by;
  }

  private aHG()
  {
  }

  public aHG(eu parameu)
  {
    super(parameu);
    aH();
  }

  public aHG aTG()
  {
    aHG localaHG;
    try
    {
      localaHG = (aHG)bx.Mm();
      localaHG.aOr = bx;
    } catch (Exception localException) {
      localaHG = new aHG();
      localaHG.aOr = null;
      localaHG.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacGift : " + localException.getMessage());
    }
    localaHG.aOF = this.aOF;
    localaHG.efN = this.efN;
    return localaHG;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp != null) && (this.evp.b(this.aOF)) && (this.evo != null) && (this.evo.b(this.aOF))) {
      if (this.efN) {
        dle localdle = this.evo;
        this.evo = this.evp;
        this.evp = localdle;
      }

      int i = this.evo.e(this.aOF);

      if (this.cxl == -1)
        this.cxl = i;
      else {
        this.cxl = Math.min(this.cxl, i);
      }
      super.a(paramaVc, paramBoolean);

      cqm localcqm = this.evo.a(this.aOF);
      localcqm.gv(-this.cxl);
      localcqm.gx(-this.cxl);
    } else {
      jJ(true);
    }
  }

  public void a(aVc paramaVc)
  {
    this.aOG = true;
    this.aOH = true;
    this.efN = false;

    short s = cVC();
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
      if (((dpI)this.eWL).bep() >= 2)
        this.efN = (((dpI)this.eWL).nl(1) == 1.0F);
    }
  }

  public void aK()
  {
    if ((this.ksH) && (this.evo != null) && (this.evo.b(this.aOF)) && (this.evp.b(this.aOF)))
    {
      this.evo.a(this.aOF).gx(this.cxl);
    }

    super.aK();
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
}