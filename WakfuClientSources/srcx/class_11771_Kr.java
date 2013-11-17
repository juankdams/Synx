import org.apache.log4j.Logger;

public final class Kr extends dqZ
{
  private static final aee bx = new bOO(new akZ());

  private static final qM by = new dzQ(new ec[] { new dLx("Default (100% du coût)", new dmb[0]), new dLx("Rollback d'un % du cout du sort", new dmb[] { new dmb("% du coût rendu", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public Kr() {
    aH();
  }

  public Kr(dSc paramdSc) {
    super(paramdSc);
  }

  public Kr UX()
  {
    Kr localKr;
    try {
      localKr = (Kr)bx.Mm();
      localKr.aOr = bx;
    } catch (Exception localException) {
      localKr = new Kr();
      localKr.aOr = null;
      localKr.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacGainFunctionTriggeringSpellCost : " + localException.getMessage());
    }
    localKr.aOF = this.aOF;
    return localKr;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = 0;
    if (this.eWL == null)
      return;
    if (((dpI)this.eWL).bep() > 1)
      return;
    if (paramaVc == null)
      return;
    if (!(this.aOF instanceof eu))
      return;
    float f;
    if (((dpI)this.eWL).bep() == 0)
      f = 100.0F;
    else {
      f = ((dpI)this.eWL).o(0, cVC());
    }

    if (aIq() == null)
      return;
    awW localawW = (awW)aIq().agb();
    if (localawW == null)
      return;
    if (localawW.aIF() == null) {
      return;
    }
    int i = 0;
    switch (ali.aCX[((eu)this.aOF).ordinal()]) {
    case 1:
      i = localawW.aIC();
      break;
    case 2:
      i = localawW.aIE();
      break;
    case 3:
      i = localawW.aID();
      break;
    default:
      K.error("Trying to compute triggering spell cost on a 'non-cost' charac : " + this.aOF);
      i = 0;
    }

    this.cxl = bMr.ax(i * f / 100.0F);
  }
}