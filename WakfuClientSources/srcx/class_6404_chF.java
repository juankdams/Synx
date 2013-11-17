import java.util.BitSet;
import org.apache.log4j.Logger;

public class chF extends avO
{
  private static final aee bx = new bOO(new dJS());

  private static final qM by = new dzQ(new ec[] { new dLx("Attraction standard", new dmb[] { new dmb("Nombre de case (tire vers le caster)", dnN.lnR), new dmb("Dégâts de collision par cellule", dnN.lnR) }), new dLx("Tirage dans une direction précise", new dmb[] { new dmb("Nombre de case", dnN.lnR), new dmb("Dégâts de collision par cellule", dnN.lnR), new dmb("Direction particulière : 0:NE 1:SE 2:NW 3:SW 4:Dans la direction de la cible 5:Vers la cellule cible", dnN.lnS) }) });
  public static final byte hAM = 0;
  public static final byte hAN = 1;
  public static final byte hAO = 2;
  public static final byte hAP = 3;
  public static final byte hFT = 4;
  public static final byte hFU = 5;

  public qM aF()
  {
    return by;
  }

  public chF cjB()
  {
    chF localchF;
    try
    {
      localchF = (chF)bx.Mm();
      localchF.aOr = bx;
    } catch (Exception localException) {
      localchF = new chF();
      localchF.aOr = null;
      localchF.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Pull : " + localException.getMessage());
    }
    return localchF;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(188);
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

  public boolean bzc() {
    return true;
  }

  boolean aAu()
  {
    return true;
  }

  boolean aAv()
  {
    return (!aHE()) && (!aHF()) && ((aHS()) || (!aHG())) && (!aHH());
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

  cYk aAy()
  {
    if (((dpI)this.eWL).bep() < 3) {
      return cjC();
    }

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
      localCG = this.evp.atM();
      break;
    case 5:
      return this.eUw;
    default:
      if (aHR())
        localCG = CG.bFP;
      else {
        localCG = new La(this.evo.fa(), this.evo.fb(), this.evo.fc(), this.evp.fa(), this.evp.fb(), this.evp.fc()).Vy();
      }

      break;
    }

    return new cYk(this.evp.fa() + localCG.hY, this.evp.fb() + localCG.hZ);
  }

  private cYk cjC() {
    CG localCG = new La(this.evo.fa(), this.evo.fb(), this.evo.fc(), aAx().fa(), aAx().fb(), aAx().fc()).Vy();

    return new cYk(this.evo.fa() + localCG.hY, this.evo.fb() + localCG.hZ, this.evo.fc());
  }
}