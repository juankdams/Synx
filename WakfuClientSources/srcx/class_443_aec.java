import java.util.BitSet;
import org.apache.log4j.Logger;

public final class aec extends doA
{
  private static final aee bx = new bOO(new aqk());

  private static final qM by = new dzQ(new ec[] { new dLx("% de reduction", new dmb[] { new dmb("% de réduction", dnN.lnR) }) });

  public qM aF()
  {
    return by;
  }

  public aec() {
    aH();
  }

  public aec apZ()
  {
    aec localaec;
    try {
      localaec = (aec)bx.Mm();
      localaec.aOr = bx;
    } catch (Exception localException) {
      localaec = new aec();
      localaec.aOr = null;
      localaec.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ReduceZoneEffect : " + localException.getMessage());
    }
    return localaec;
  }

  public void a(aVc paramaVc)
  {
    this.cxl = 0;
    if (this.eWL == null)
      return;
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    Object localObject = paramaVc;
    if ((localObject == null) && (bkh() != null))
      localObject = ((dji)bkh()).cRV();
    if (localObject == null) {
      cVD();
      return;
    }
    if (o((aVc)localObject)) {
      cVD();
      return;
    }

    dpI localdpI = (dpI)((aVc)localObject).bkc();
    if ((localdpI != null) && ((localdpI.aui().eL() != chY.hGe) || (localdpI.a(PY.coz))))
    {
      ((aVc)localObject).b(0, -this.cxl, false);
    }
  }

  private boolean o(aVc paramaVc) {
    return (paramaVc.DV() != null) && (paramaVc.DV().get(2138));
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
  }
}