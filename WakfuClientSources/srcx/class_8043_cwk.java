import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class cwk extends bTv
{
  private static final aee bx = new bOO(new dSf());

  private static final qM by = new dzQ(new ec[] { new dLx("Gain de niveau des sorts passifs", new dmb[] { new dmb("valeur (en niveaux)", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public cwk() {
    aH();
  }

  public cwk ctN()
  {
    cwk localcwk;
    try {
      localcwk = (cwk)bx.Mm();
      localcwk.aOr = bx;
    } catch (Exception localException) {
      localcwk = new cwk();
      localcwk.aOr = null;
      localcwk.eXg = false;
      K.error("Erreur lors d'un checkOut sur un PassiveSpellGain : " + localException.getMessage());
    }
    return localcwk;
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL != null)
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void ade()
  {
    if (!(this.evp instanceof dhJ))
      return;
    ((dhJ)this.evp).bFx();
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
      if (e(localbfE))
        localArrayList.add(localbfE);
    }
    return localArrayList;
  }

  private boolean e(bfE parambfE) {
    bzj localbzj = parambfE.bsL();
    if (localbzj == null)
      return false;
    return localbzj.bHY();
  }
}