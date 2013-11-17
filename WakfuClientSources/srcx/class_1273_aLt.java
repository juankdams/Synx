import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;

public final class aLt extends bTv
{
  private static final aee bx = new bOO(new cxG());

  private static final qM by = new dzQ(new ec[] { new dLx("Gain de niveau des sorts d'un element", new dmb[] { new dmb("element des sorts", dnN.lnQ), new dmb("valeur (en niveaux)", dnN.lnR) }) });
  private int epL;

  public qM aF()
  {
    return by;
  }

  public aLt() {
    aH();
  }

  public aLt bcV()
  {
    aLt localaLt;
    try {
      localaLt = (aLt)bx.Mm();
      localaLt.aOr = bx;
    } catch (Exception localException) {
      localaLt = new aLt();
      localaLt.aOr = null;
      localaLt.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ElementalSpellGain : " + localException.getMessage());
    }
    localaLt.epL = this.epL;
    return localaLt;
  }

  public void a(aVc paramaVc)
  {
    short s = cVC();
    if (this.eWL != null) {
      this.epL = ((dpI)this.eWL).a(0, s, dNF.meh);
      this.cxl = ((dpI)this.eWL).a(1, s, dNF.meh);
    }
  }

  protected void ade()
  {
    ((dhJ)this.evp).n(bTI.dx((byte)this.epL));
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
      if (localbfE.bsL().bHU() == this.epL)
        localArrayList.add(localbfE);
    }
    return localArrayList;
  }

  public void bc()
  {
    super.bc();
    this.epL = -1;
  }
}