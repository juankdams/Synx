import java.util.HashSet;
import org.apache.log4j.Logger;

public class cPE extends aGS
{
  private static final aee bx = new bOO(new cDF());

  private static final qM by = new dzQ(new ec[] { new dLx("Rebond", new dmb[] { new dmb("valeur de l'attaque", dnN.lnR), new dmb("Réduction à chaque rebond", dnN.lnS), new dmb("Portée maximum d'un rebond", dnN.lnS), new dmb("Nombre de Dispersion", dnN.lnS) }), new dLx("Rebond", new dmb[] { new dmb("valeur de l'attaque", dnN.lnR), new dmb("Réduction à chaque rebond", dnN.lnS), new dmb("Portée maximum d'un rebond", dnN.lnS), new dmb("Nombre de Dispersion", dnN.lnS), new dmb("Type Diffusion (0 : non, 1 : oui) par défaut 0", dnN.lnR) }) });
  private bTI kyP;
  private dnO kyQ;

  public qM aF()
  {
    return by;
  }

  public cPE()
  {
  }

  public cPE(bTI parambTI, dnO paramdnO)
  {
    this.kyP = parambTI;
    this.kyQ = paramdnO;
  }

  public cPE cGF()
  {
    cPE localcPE;
    try {
      localcPE = (cPE)bx.Mm();
      localcPE.aOr = bx;
    } catch (Exception localException) {
      localcPE = new cPE();
      localcPE.aOr = null;
      K.error("Erreur lors d'un checkOut sur un HPLeech : " + localException.getMessage());
    }
    return localcPE;
  }

  public cPE cGG()
  {
    cPE localcPE = (cPE)super.aSU();

    localcPE.kyP = this.kyP;
    localcPE.kyQ = this.kyQ;
    return localcPE;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    aLM localaLM = dap.cMI().zw(((dpI)this.eWL).yR());

    bFw localbFw = bFw.a(this.ejP, this.kyP, this.kyQ, this.cxl, this.evp);
    localbFw.i(this.evo);
    if (this.evp != null) {
      cYk localcYk = this.evp.ML();
      localbFw.C(localcYk.getX(), localcYk.getY(), localcYk.IB());
    }
    localbFw.b(wa());
    localbFw.aH();
    localbFw.d(DV());
    if (this.eWL != null)
      localbFw.d(((dpI)this.eWL).auh());
    localbFw.ct((byte)1);
    localbFw.bNn();
    localbFw.c(localbFw.bNo(), (this.eWL != null) && (((dpI)this.eWL).cL(1L)), (this.eWL != null) && (((dpI)this.eWL).zi()));

    localbFw.bkB();
    if ((localaLM != null) && (localaLM.nc(0) != null))
      localbFw.b(localaLM.nc(0));
    else {
      localbFw.b(bkc());
    }
    localbFw.bkz();

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

  protected boolean a(dMT paramdMT1, dMT paramdMT2)
  {
    return (paramdMT1 != null) && (paramdMT2 != null) && (paramdMT1.Fx() != paramdMT2.Fx());
  }

  public bTI Cz()
  {
    return this.kyP;
  }
}