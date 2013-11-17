import org.apache.log4j.Logger;

public final class aST extends bZG
{
  private static final aee bx = new bOO(new buJ());

  private static final qM by = new dzQ(new ec[] { new dLx("apply avec gestion des resistances/boosts", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS), new dmb("pourcentage d'application / AREA_HP", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public aST() {
    aH();
  }

  public aST bir()
  {
    aST localaST;
    try {
      localaST = (aST)bx.Mm();
      localaST.aOr = bx;
    } catch (Exception localException) {
      localaST = new aST();
      localaST.aOr = null;
      localaST.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyStatePercentFunctionAreaHp : " + localException.getMessage());
    }
    return localaST;
  }

  protected int Wy() {
    if ((this.evo.b(eu.aAg)) && (this.eWL != null))
      return ((dpI)this.eWL).a(2, cVC(), dNF.meh) * this.evo.e(eu.aAg);
    return 0;
  }
}