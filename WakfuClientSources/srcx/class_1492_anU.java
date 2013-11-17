import java.util.BitSet;
import org.apache.log4j.Logger;

public final class anU extends avO
{
  private static final aee bx = new bOO(new dBG());

  private static final qM by = new dzQ(new ec[] { new dLx("Distance a parcourir", new dmb[] { new dmb("valeur", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public static anU a(cOE paramcOE, int paramInt, dle paramdle1, dpI paramdpI, dle paramdle2, bqk parambqk)
  {
    anU localanU;
    try
    {
      localanU = (anU)bx.Mm();
      localanU.aOr = bx;
    } catch (Exception localException) {
      localanU = new anU();
      localanU.aOr = null;
      localanU.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Repell : " + localException.getMessage());
    }

    localanU.aw = bsj.fSB.getId();
    localanU.eWQ = ((doA)bsj.fSB.getObject()).DU();
    localanU.aH();
    localanU.evp = paramdle1;
    localanU.evo = paramdle2;
    localanU.cxl = paramInt;
    localanU.eWM = parambqk;
    localanU.eWS = -1;
    localanU.ejP = paramcOE;
    localanU.eWL = paramdpI;
    return localanU;
  }

  public anU aAt()
  {
    anU localanU;
    try {
      localanU = (anU)bx.Mm();
      localanU.aOr = bx;
    } catch (Exception localException) {
      localanU = new anU();
      localanU.aOr = null;
      K.error("Erreur lors d'une newInstance sur un Repell : " + localException.getMessage());
    }
    return localanU;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(194);
  }

  boolean aAu()
  {
    return false;
  }

  boolean aAv()
  {
    return (this.eUw != null) && (!aHE()) && (!aHF()) && (!aHI());
  }

  boolean aAw()
  {
    return false;
  }

  public agl aAx()
  {
    if ((this.evo instanceof agl))
      return (agl)this.evo;
    return null;
  }

  cYk aAy()
  {
    return this.eUw;
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    if ((this.eWM != null) && (((bqk)this.eWM).nS() == 11)) {
      bfE localbfE = (bfE)this.eWM;
      if (localbfE.bsL() != null)
        return !localbfE.bsL().bHR();
    }
    return false;
  }

  public boolean aN()
  {
    return true;
  }
}