import org.apache.log4j.Logger;

public class aWu extends doA
{
  private static final aee bx = new bOO(new YI());
  private boolean fbE;
  private static final qM by = new dzQ(new ec[] { new dLx("id de script", new dmb[] { new dmb("valeur", dnN.lnR) }), new dLx("id de script + feedback", new dmb[] { new dmb("valeur", dnN.lnR), new dmb("Afficher dans le chat", dnN.lnS) }) });

  public static aWu d(cOE paramcOE, bTI parambTI)
  {
    aWu localaWu;
    try
    {
      localaWu = (aWu)bx.Mm();
      localaWu.aOr = bx;
    } catch (Exception localException) {
      localaWu = new aWu();
      localaWu.aOr = null;
      localaWu.eXg = false;
      K.error("Erreur lors d'un checkOut sur un PlayEmote : " + localException.getMessage());
    }

    localaWu.aw = bsj.fTK.getId();
    localaWu.eWQ = ((doA)bsj.fTK.getObject()).DU();
    localaWu.ejP = paramcOE;
    return localaWu;
  }

  public void aJ()
  {
    super.aJ();

    this.fbE = false;
  }

  public aWu bmi()
  {
    aWu localaWu;
    try {
      localaWu = (aWu)bx.Mm();
      localaWu.aOr = bx;
    } catch (Exception localException) {
      localaWu = new aWu();
      localaWu.aOr = null;
      localaWu.eXg = false;
      K.error("Erreur lors d'un checkOut sur un PlayEmote : " + localException.getMessage());
    }

    return localaWu;
  }

  public qM aF()
  {
    return by;
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

  public void a(aVc paramaVc)
  {
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, (short)0, dNF.mei);

      if (((dpI)this.eWL).bep() == 2)
        this.fbE = (((dpI)this.eWL).nl(1) == 0.0F);
      else
        this.fbE = false;
    }
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo != null) && ((this.evo instanceof dhJ)))
      ((dhJ)this.evo).D(this.cxl, this.fbE);
  }
}