import java.util.BitSet;
import org.apache.log4j.Logger;

public class cfQ extends avO
{
  private static final aee bx = new bOO(new clN());

  private static final qM by = new dzQ(new ec[] { new dLx("Poussage standard", new dmb[] { new dmb("Nombre de case", dnN.lnR), new dmb("Dégâts de collision par cellule", dnN.lnR) }), new dLx("Poussage dans une direction précise", new dmb[] { new dmb("Nombre de case", dnN.lnR), new dmb("Dégâts de collision par cellule", dnN.lnR), new dmb("Direction particulière : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Opposée à la direction de la cible 5:Opposé à la cellule cible 6:aléatoire", dnN.lnS) }), new dLx("Elements des degats de poussé", new dmb[] { new dmb("Nombre de case", dnN.lnR), new dmb("Dégâts de collision par cellule", dnN.lnR), new dmb("Direction particulière : -1 (defaut) 0:NE 1:SE 2:NW 3:SW 4:Opposée à la direction de la cible 5:Opposé à la cellule cible 6:aléatoire", dnN.lnS), new dmb("Elements des dégâts de collision (default = EARTH(3))", dnN.lnS) }) });
  public static final byte hAM = 0;
  public static final byte hAN = 1;
  public static final byte hAO = 2;
  public static final byte hAP = 3;
  public static final byte hAQ = 4;
  public static final byte hAR = 5;
  public static final byte hAS = 6;

  public qM aF()
  {
    return by;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(187);
  }

  public cfQ cir()
  {
    cfQ localcfQ;
    try {
      localcfQ = (cfQ)bx.Mm();
      localcfQ.aOr = bx;
    } catch (Exception localException) {
      localcfQ = new cfQ();
      localcfQ.aOr = null;
      localcfQ.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Push : " + localException.getMessage());
    }
    return localcfQ;
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

  boolean aAu()
  {
    return false;
  }

  boolean aAv()
  {
    return (this.evp != null) && (!aHE()) && (!aHF()) && ((aHS()) || (!aHG())) && (!aHH());
  }

  boolean aAw()
  {
    return true;
  }

  public agl aAx()
  {
    if ((this.evp instanceof agl))
      return (agl)this.evp;
    return null;
  }

  public void a(aVc paramaVc)
  {
    super.a(paramaVc);
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() >= 4) {
      int i = ((dpI)this.eWL).a(3, cVC(), dNF.meh);
      bTI localbTI = bTI.dx((byte)i);
      if (localbTI == null) {
        K.error("Erreur de parametre, l'element n'existe pas " + i);
        return;
      }
      this.dKI = localbTI;
      this.dKJ = true;
    }
  }

  cYk aAy()
  {
    int i = -1;
    if (((dpI)this.eWL).bep() == 3) {
      short s = cVC();
      i = (byte)((dpI)this.eWL).a(2, s, dNF.mei);
    }
    CG localCG;
    switch (i) {
    case 0:
      localCG = CG.bFM;
      break;
    case 1:
      localCG = CG.bFG;
      break;
    case 2:
      localCG = CG.bFK;
      break;
    case 3:
      localCG = CG.bFI;
      break;
    case 4:
      localCG = this.evp.atM().LS();
      break;
    case 5:
      return this.eUw;
    case 6:
      switch (dpe.eL(1, 4)) {
      case 1:
        localCG = CG.bFM;
        break;
      case 2:
        localCG = CG.bFK;
        break;
      case 3:
        localCG = CG.bFG;
        break;
      case 4:
      default:
        localCG = CG.bFI;
      }break;
    default:
      if (aHR())
        localCG = CG.bFP;
      else {
        localCG = new La(this.evo.fa(), this.evo.fb(), this.evo.fc(), this.evp.fa(), this.evp.fb(), this.evp.fc()).Vy();
      }

      break;
    }

    return new cYk(this.evp.fa() + localCG.LO().hY, this.evp.fb() + localCG.LO().hZ);
  }
}