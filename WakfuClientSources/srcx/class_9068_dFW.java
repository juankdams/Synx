import java.util.HashSet;
import org.apache.log4j.Logger;

public class dFW extends aGS
{
  private static final aee bx = new bOO(new aCJ());

  private static final qM by = new dzQ(new ec[] { new dLx("Rebond", new dmb[] { new dmb("valeur de l'attaque", dnN.lnR), new dmb("Réduction à chaque rebond", dnN.lnS), new dmb("Portée maximum d'un rebond", dnN.lnS), new dmb("Nombre de Dispersion", dnN.lnS) }), new dLx("Rebond, type diffusion", new dmb[] { new dmb("valeur de l'attaque", dnN.lnR), new dmb("Réduction à chaque rebond", dnN.lnS), new dmb("Portée maximum d'un rebond", dnN.lnS), new dmb("Nombre de Dispersion", dnN.lnS), new dmb("Type Diffusion (0 : non, 1 : oui) par défaut 0", dnN.lnS) }), new dLx("Rebond avec élément", new dmb[] { new dmb("valeur de l'attaque", dnN.lnR), new dmb("Réduction à chaque rebond", dnN.lnS), new dmb("Portée maximum d'un rebond", dnN.lnS), new dmb("Nombre de Dispersion", dnN.lnS), new dmb("Type Diffusion (0 : non, 1 : oui) par défaut 0", dnN.lnS), new dmb("Element", dnN.lnS) }) });
  private bTI cpW;

  public qM aF()
  {
    return by;
  }

  private dFW()
  {
  }

  public dFW(bTI parambTI) {
    this.cpW = parambTI;
  }

  public dFW dhh()
  {
    dFW localdFW;
    try {
      localdFW = (dFW)bx.Mm();
      localdFW.aOr = bx;
    } catch (Exception localException) {
      localdFW = new dFW();
      localdFW.aOr = null;
      K.error("Erreur lors d'un checkOut sur un HPLeech : " + localException.getMessage());
    }
    return localdFW;
  }

  public dFW dhi()
  {
    dFW localdFW = (dFW)super.aSU();
    localdFW.cpW = this.cpW;
    return localdFW;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    aWl localaWl = aWl.c(this.ejP, this.cpW);
    localaWl.i(this.evo);
    localaWl.kf(this.cxl);
    localaWl.j(this.evp);
    localaWl.a(null);
    localaWl.bkB();
    localaWl.b(bkc());
    localaWl.aH();
    localaWl.bkz();

    super.a(paramaVc, paramBoolean);
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if ((this.eel == 0) && (this.eWL != null)) {
      this.cxl = ((dpI)this.eWL).a(0, s, dNF.mei);
      this.eeo = ((dpI)this.eWL).a(1, s, dNF.mei);
      this.eep = ((dpI)this.eWL).a(2, s, dNF.mei);
      this.eem = ((byte)((dpI)this.eWL).a(3, s, dNF.mei));
      this.een = this.cxl;
      this.eer = new HashSet();
      this.eeq = ((((dpI)this.eWL).bep() >= 5) && (((dpI)this.eWL).a(4, s, dNF.mei) == 1));
    }

    super.a(paramaVc);
  }

  protected boolean a(dMT paramdMT1, dMT paramdMT2) {
    return (paramdMT1 != null) && (paramdMT2 != null) && (paramdMT1.Fx() == paramdMT2.Fx());
  }

  public bTI Cz() {
    return this.cpW;
  }
}