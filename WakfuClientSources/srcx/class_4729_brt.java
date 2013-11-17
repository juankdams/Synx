import java.util.BitSet;
import org.apache.log4j.Logger;

public class brt extends gE
{
  private static final qM by = new dzQ(new ec[] { new dLx("Pas de param, on tp uniquement le caster", new dmb[0]), new dLx("On peut tp le propriétaire de la zone", new dmb[] { new dmb("Tp owner : 0 = non (defaut), 1 = oui", dnN.lnS) }), new dLx("Autorise de tp un perso porté", new dmb[] { new dmb("Tp owner : 0 = non (defaut), 1 = oui", dnN.lnS), new dmb("Tp carried : 0 = non (defaut), 1 = ou", dnN.lnS) }), new dLx("Autorise de tp un perso porté", new dmb[] { new dmb("Tp owner : 0 = non (defaut), 1 = oui", dnN.lnS), new dmb("Tp carried : 0 = non (defaut), 1 = oui", dnN.lnS), new dmb("Tp Forcée (by pass stabilisé et autres propriété) 0 = non (defaut), 1 = oui", dnN.lnS) }), new dLx("Autorise de tp un perso porté", new dmb[] { new dmb("Tp owner : 0 = non (defaut), 1 = oui", dnN.lnS), new dmb("Tp carried : 0 = non (defaut), 1 = oui", dnN.lnS), new dmb("Tp Forcée (by pass stabilisé et autres propriété) 0 = non (defaut), 1 = oui", dnN.lnS), new dmb("Verifie les cellules bloquantes 0 = non, 1 = oui (defaut)", dnN.lnS) }) });

  private static final aee bx = new bOO(new wP());

  public qM aF()
  {
    return by;
  }

  public brt bzR()
  {
    return a(null, null, null, null, null);
  }

  public static brt a(cOE paramcOE, dpI paramdpI, dle paramdle, bqk parambqk, cYk paramcYk) {
    brt localbrt;
    try {
      localbrt = (brt)bx.Mm();
      localbrt.aOr = bx;
    } catch (Exception localException) {
      localbrt = new brt();
      localbrt.aOr = null;
      localbrt.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Push : " + localException.getMessage());
    }
    localbrt.aFK = true;
    localbrt.ejP = paramcOE;
    localbrt.eWL = paramdpI;
    localbrt.evo = paramdle;
    localbrt.eWM = parambqk;
    if (paramcYk != null)
      localbrt.C(paramcYk.getX(), paramcYk.getY(), paramcYk.IB());
    return localbrt;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(197);
  }

  protected dle gs()
  {
    if ((this.eWL == null) || (((dpI)this.eWL).bep() == 0)) {
      return this.evo;
    }
    int i = ((dpI)this.eWL).a(0, cVC(), dNF.meh) == 1 ? 1 : 0;
    if ((i != 0) && 
      ((this.evo instanceof cjK))) {
      cjK localcjK = (cjK)this.evo;
      dle localdle = localcjK.axG();
      if (localdle != null)
        return localdle;
      K.error("On cherche a téléporter le propriétaire d'une zone d'effet mais celui-ci est inconnu " + localcjK.clt());
    }

    return this.evo;
  }

  public void a(aVc paramaVc)
  {
    if (((dpI)this.eWL).bep() >= 3)
      this.aFL = (((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1);
    if (((dpI)this.eWL).bep() >= 4)
      this.aFM = (((dpI)this.eWL).a(3, cVC(), dNF.meh) == 1);
    super.a(paramaVc);
  }

  protected boolean oQ()
  {
    if (this.eWL == null) {
      return false;
    }
    if (((dpI)this.eWL).bep() < 2) {
      return false;
    }
    return ((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1;
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }
}