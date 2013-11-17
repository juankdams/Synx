import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class ajh extends bTv
{
  private static final qM by = new dzQ(new ec[] { new dLx("Gain de niveau des sorts tous elements", new dmb[] { new dmb("valeur (en niveaux)", dnN.lnR) }), new dLx("Gain de niveau des sorts tous elements, avec ou sans stasis", new dmb[] { new dmb("valeur (en niveaux)", dnN.lnR), new dmb("prise en compte du stasis (1=oui (defaut), 0=non", dnN.lnS) }) });
  private boolean aHd;
  private boolean diB = true;

  private static final aee aER = new bOO(new ala());

  private cCH aGA = new alb(this);

  public ajh()
  {
    aH();
  }

  public aVc aO()
  {
    ajh localajh;
    try
    {
      localajh = (ajh)aER.Mm();
      localajh.aOr = aER;
    } catch (Exception localException) {
      localajh = new ajh();
      localajh.aOr = null;
      localajh.eXg = false;
      K.error("Erreur lors d'un checkOut sur un AllElementalSpellGain : " + localException.getMessage());
    }
    return localajh;
  }

  public void release()
  {
    if (this.aHd)
      try {
        aER.y(this);
        this.aHd = false;
      } catch (Exception localException) {
        K.error("Exception lors du retour au pool", localException);
      }
    else
      bc();
  }

  public void a(aVc paramaVc)
  {
    if (this.eWL != null) {
      this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
      this.diB = ((((dpI)this.eWL).bep() < 2) || (((dpI)this.eWL).a(1, cVC(), dNF.meh) == 1));
    }
  }

  protected void ade()
  {
    ((dhJ)this.evp).n(bTI.dx(bTI.hfa.bJ()));
    ((dhJ)this.evp).n(bTI.dx(bTI.heX.bJ()));
    ((dhJ)this.evp).n(bTI.dx(bTI.heZ.bJ()));
    ((dhJ)this.evp).n(bTI.dx(bTI.heY.bJ()));
    if (this.diB)
      ((dhJ)this.evp).n(bTI.dx(bTI.hfb.bJ()));
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
      if (b(localbfE)) {
        localArrayList.add(localbfE);
      }
    }
    return localArrayList;
  }

  private boolean b(bfE parambfE) {
    return (parambfE.bsL().bHU() == bTI.hfa.bJ()) || (parambfE.bsL().bHU() == bTI.heZ.bJ()) || (parambfE.bsL().bHU() == bTI.heY.bJ()) || (parambfE.bsL().bHU() == bTI.heX.bJ()) || ((this.diB) && (parambfE.bsL().bHU() == bTI.hfb.bJ()));
  }

  public qM aF()
  {
    return by;
  }

  public cCH lJ()
  {
    return this.aGA;
  }
}