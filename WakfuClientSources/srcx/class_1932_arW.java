import java.util.Collection;
import org.apache.log4j.Logger;

public final class arW extends kM
{
  private static final aee bx = new bOO(new agz());

  private static final qM by = new dzQ(new ec[] { new dLx("paramètrage standard", new dmb[] { new dmb("pallier de niveau du gobgob", dnN.lnR), new dmb("arrondi au supérieur 1=oui 0=non", dnN.lnS), new dmb("cap du gain (-1 = pas de cap)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public arW()
  {
    aH();
  }

  public arW(dSc paramdSc) {
    super(paramdSc);
  }

  public arW aEB()
  {
    arW localarW;
    try {
      localarW = (arW)bx.Mm();
      localarW.aOr = bx;
    } catch (Exception localException) {
      localarW = new arW();
      localarW.aOr = null;
      localarW.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacBuffForOsaFusion : " + localException.getMessage());
    }
    localarW.aOF = this.aOF;
    return localarW;
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
    if (((dpI)this.eWL).bep() == 3) {
      float f1 = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
      int j = ((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1 ? 1 : 0;
      float f2 = ((dpI)this.eWL).a(2, cVC(), dNF.meh);

      float f3 = i / f1;

      if (j != 0)
        this.cxl = bCO.aB(f3);
      else {
        this.cxl = bCO.bD(f3);
      }
      if (f2 != -1.0F)
        this.cxl = ((int)Math.min(this.cxl, f2));
    }
  }
}