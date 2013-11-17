import java.util.ArrayList;
import java.util.BitSet;
import org.apache.log4j.Logger;

public final class cUf extends ad
{
  private static final aee bx = new bOO(new dta());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });
  private static final int kGy = 952;

  public qM aF()
  {
    return by;
  }

  public cUf() {
    aH();
  }

  public cUf cJt()
  {
    cUf localcUf;
    try {
      localcUf = (cUf)bx.Mm();
      localcUf.aOr = bx;
    } catch (Exception localException) {
      localcUf = new cUf();
      localcUf.aOr = null;
      localcUf.eXg = false;
      K.error("Erreur lors d'un checkOut sur un RemoveFecaArmor : " + localException.getMessage());
    }
    return localcUf;
  }

  protected int a(ArrayList paramArrayList, dDN paramdDN, int paramInt) {
    for (aVc localaVc : paramdDN)
      if ((localaVc instanceof bPD))
      {
        bJC localbJC = ((bPD)localaVc).bWk();
        if (localbJC.bRf()) {
          paramArrayList.add(localaVc);
          if (localbJC.bQW() == 952)
            this.eWR.set(2149);
        }
      }
    return -1;
  }

  public void a(aVc paramaVc) {
  }

  public void bc() {
    super.bc();
  }
}