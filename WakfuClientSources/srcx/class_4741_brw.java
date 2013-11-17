import java.util.Collection;
import org.apache.log4j.Logger;

public final class brw extends dqZ
{
  private static final aee bx = new bOO(new Ai());

  private static final qM by = new dzQ(new ec[] { new dLx("paramètrage standard", new dmb[] { new dmb("pallier de niveau du gobgob", dnN.lnR), new dmb("en % de la charac 1=oui 0=non", dnN.lnS), new dmb("arrondi au supérieur 1=oui 0=non", dnN.lnS), new dmb("cap du gain (-1 = pas de cap)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public brw()
  {
    aH();
  }

  public brw(dSc paramdSc) {
    super(paramdSc);
  }

  public brw bzS()
  {
    brw localbrw;
    try {
      localbrw = (brw)bx.Mm();
      localbrw.aOr = bx;
    } catch (Exception localException) {
      localbrw = new brw();
      localbrw.aOr = null;
      localbrw.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacBuffForOsaFusion : " + localException.getMessage());
    }
    localbrw.aOF = this.aOF;
    return localbrw;
  }

  public void a(aVc paramaVc) {
    this.cxl = 0;
    if ((this.evo == null) || (!(this.evo instanceof dhJ))) {
      return;
    }
    if (!(this.ejP instanceof dMC)) {
      return;
    }
    dbE localdbE = ((dMC)this.ejP).dps();
    Collection localCollection = localdbE.Z((dhJ)this.evo);

    int i = -1;
    for (dhJ localdhJ : localCollection) {
      if (localdhJ.uO() == 1620) {
        i = localdhJ.nU();
        break;
      }
    }

    if (i == -1) {
      return;
    }
    if (((dpI)this.eWL).bep() == 4) {
      float f1 = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
      boolean bool = ((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1;
      int j = ((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1 ? 1 : 0;
      float f2 = ((dpI)this.eWL).a(3, cVC(), dNF.meh);

      float f3 = i / f1;

      if (j != 0)
        this.cxl = bCO.aB(f3);
      else {
        this.cxl = bCO.bD(f3);
      }
      if (f2 != -1.0F) {
        this.cxl = ((int)Math.min(this.cxl, f2));
      }
      this.bgy = bool;
    }
  }
}