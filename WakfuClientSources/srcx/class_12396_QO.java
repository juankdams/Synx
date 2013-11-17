import java.util.BitSet;
import org.apache.log4j.Logger;

public class QO extends aWl
{
  private static final aee bx = new bOO(new cQN());

  private static final qM by = new dzQ(new ec[] { new dLx("gain de PdV", new dmb[] { new dmb("valeur", dnN.lnR) }), new dLx("gain de PdV", new dmb[] { new dmb("", dnN.lnR), new dmb("D", dnN.lnR), new dmb("+", dnN.lnR) }) });
  private bTI cpW;

  public qM aF()
  {
    return by;
  }

  private QO()
  {
  }

  public QO(bTI parambTI)
  {
    this.cpW = parambTI;
    aH();
  }

  public bTI Cz()
  {
    return this.cpW;
  }

  public static QO a(cOE paramcOE, bTI parambTI) {
    QO localQO;
    try {
      localQO = (QO)bx.Mm();
      localQO.aOr = bx;
    }
    catch (Exception localException) {
      localQO = new QO();
      localQO.aOr = null;
      localQO.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGainWithFeedBack : " + localException.getMessage());
    }

    localQO.cpW = parambTI;
    localQO.aw = bsj.fOS.getId();
    localQO.eWQ = ((doA)bsj.fOS.getObject()).DU();
    localQO.eWS = -1;
    localQO.ejP = paramcOE;
    return localQO;
  }

  public QO acx()
  {
    QO localQO;
    try {
      localQO = (QO)bx.Mm();
      localQO.aOr = bx;
    }
    catch (Exception localException) {
      localQO = new QO();
      localQO.aOr = null;
      localQO.eXg = false;
      K.error("Erreur lors d'un checkOut sur un HPGainWithFeedBack : " + localException.getMessage());
    }

    localQO.cpW = this.cpW;
    return localQO;
  }

  public void aH()
  {
    super.aH();
    this.eWR.set(1);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evo != null) && 
      (this.evo.b(eu.ayM))) {
      this.cxl = this.evo.a(eu.ayM).gw(this.cxl);
    }

    super.a(paramaVc, paramBoolean);
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