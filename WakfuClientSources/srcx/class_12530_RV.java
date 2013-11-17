import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class RV extends bTv
{
  private static final aee bx = new bOO(new bpJ());

  private static final qM by = new dzQ(new ec[] { new dLx("Gain de niveau des sorts de support actif", new dmb[] { new dmb("valeur (en niveaux)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public RV() {
    aH();
  }

  public RV add()
  {
    RV localRV;
    try {
      localRV = (RV)bx.Mm();
      localRV.aOr = bx;
    } catch (Exception localException) {
      localRV = new RV();
      localRV.aOr = null;
      localRV.eXg = false;
      K.error("Erreur lors d'un checkOut sur un PassiveSpellGain : " + localException.getMessage());
    }
    return localRV;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void ade()
  {
  }

  protected List adf()
  {
    if (this.evp == null) {
      return Collections.emptyList();
    }
    dCi localdCi = ((dhJ)this.evp).auL();

    if (localdCi == null) {
      return Collections.emptyList();
    }
    ArrayList localArrayList = new ArrayList();
    for (bfE localbfE : localdCi) {
      if (a(localbfE))
        localArrayList.add(localbfE);
    }
    return localArrayList;
  }

  private boolean a(bfE parambfE) {
    bzj localbzj = parambfE.bsL();
    if (localbzj == null)
      return false;
    return (!localbzj.bHY()) && (localbzj.bHU() == bTI.hfc.bJ());
  }
}