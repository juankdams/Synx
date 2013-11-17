import java.io.IOException;
import org.apache.log4j.Logger;

public class cDK extends arK
{
  private boolean ixm = false;
  private cbI ixn;
  private int cMi;

  protected arK aEq()
  {
    return new cDK();
  }

  protected void a(bCd parambCd) {
    super.a(parambCd);
    cDK localcDK = (cDK)parambCd;
    localcDK.ixm = this.ixm;
    localcDK.cMi = this.cMi;
    localcDK.ixn = this.ixn;
  }

  public cbI czD() {
    return this.ixn;
  }

  public void a(cbI paramcbI) {
    this.ixn = paramcbI;
  }

  public int alv() {
    return this.cMi;
  }

  public void hz(int paramInt) {
    this.cMi = paramInt;
  }

  public boolean czE() {
    return this.ixm;
  }

  public void hW(boolean paramBoolean) {
    this.ixm = paramBoolean;
  }

  protected void a(czg paramczg) {
    super.a(paramczg);

    paramczg.gfh = this.cMi;
  }

  protected ZG d(long paramLong, boolean paramBoolean)
  {
    if (!((kk)this.cLK).bfm()) {
      return null;
    }
    blq localblq;
    try
    {
      localblq = ((kk)this.cLK).bfh().gL(paramLong);
    } catch (IOException localIOException) {
      return null;
    }

    if (localblq == null)
      return null;
    Object localObject;
    if (this.ixm) {
      float f1 = bCO.cL(6, 9) * (bCO.bLj() ? -1 : 1);
      float f2 = bCO.cL(6, 9) * (bCO.bLj() ? -1 : 1);

      localObject = new aAv(f1, f2, 0.0F, true, 0);
    } else {
      localObject = this.ixn;
      if (localObject == null) {
        K.error("On essaye de créer une source audio sans avoir d'ObservedSource dans le container " + getName() + " (" + getId() + "). Vérifier le paramétrage du container");

        return null;
      }

    }

    dCo localdCo = null;
    if (this.cMi >= 0) {
      localdCo = ((kk)this.cLK).bfg().og(this.cMi);
    }
    if (localdCo == null) {
      localdCo = dCo.lKF;
    }
    caQ localcaQ = ((kk)this.cLK).a(localblq, 1.0F, (cbI)localObject, localdCo.btj(), localdCo.btg(), localdCo.bti(), 0, 0, paramBoolean, false, false, 0.0F, -1L);

    if (localcaQ == null) {
      return null;
    }

    return localcaQ.ceQ();
  }
}