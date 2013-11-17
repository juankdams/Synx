import org.apache.log4j.Logger;

public final class LU extends bZG
{
  private static final aee bx = new bOO(new csp());

  private static final qM by = new dzQ(new ec[] { new dLx("apply avec nouveau niveau capé par niveau d'un autre état", new dmb[] { new dmb("stateId", dnN.lnQ), new dmb("level", dnN.lnS), new dmb("pourcentage d'application / AREA_HP", dnN.lnS), new dmb("stateId dont il ne faut pas dépasser le lvl", dnN.lnS), new dmb("etat capant sur la cible (0=non (defaut), 1=oui)", dnN.lnS) }) });

  public qM aF()
  {
    return by;
  }

  public LU() {
    aH();
  }

  public LU Wx()
  {
    LU localLU;
    try {
      localLU = (LU)bx.Mm();
      localLU.aOr = bx;
    } catch (Exception localException) {
      localLU = new LU();
      localLU.aOr = null;
      localLU.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyStateLevelCapedByAnotherState : " + localException.getMessage());
    }
    return localLU;
  }

  protected int Wy()
  {
    return ((dpI)this.eWL).a(2, cVC(), dNF.meh);
  }

  protected void P(short paramShort)
  {
    this.gCj = ((short)((dpI)this.eWL).a(1, paramShort, dNF.meh));

    int i = ((dpI)this.eWL).a(4, cVC(), dNF.meh) == 1 ? 1 : 0;
    dle localdle = i != 0 ? this.evp : this.evo;
    if (!(localdle instanceof axQ)) {
      this.gCj = 0;
      return;
    }
    int j = ((dpI)this.eWL).a(3, cVC(), dNF.meh);

    int k = ((axQ)localdle).dv(j);
    if (k <= 0) {
      this.gCj = 0;
      return;
    }

    bJC localbJC = cNO.cFX().yF(this.aGz);
    if (localbJC == null) {
      this.gCj = 0;
      return;
    }

    if (localbJC.NW()) {
      if (!(this.evp instanceof axQ)) {
        this.gCj = 0;
        return;
      }
      int m = Math.max(0, ((axQ)this.evp).dv(this.aGz));
      int n = (short)Math.min(this.gCj + m, k);
      this.gCj = ((short)Math.max(0, n - m));
    }
    else
    {
      this.gCj = ((short)Math.min(this.gCj, k));
    }
  }
}