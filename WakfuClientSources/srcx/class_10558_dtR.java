import java.util.BitSet;
import org.apache.log4j.Logger;

public final class dtR extends doA
{
  private static final aee bx = new bOO(new aXR());

  private static final qM by = new dzQ(new ec[] { new dLx("Params", new dmb[0]) });
  private bTI cpW;

  public qM aF()
  {
    return by;
  }

  public dtR()
  {
    aH();
  }

  public dtR cZU()
  {
    dtR localdtR;
    try {
      localdtR = (dtR)bx.Mm();
      localdtR.aOr = bx;
    } catch (Exception localException) {
      localdtR = new dtR();
      localdtR.aOr = null;
      localdtR.eXg = false;
      K.error("Erreur lors d'un checkOut sur un DoubleOrQuits : " + localException.getMessage());
    }
    localdtR.cpW = this.cpW;
    return localdtR;
  }

  public void a(aVc paramaVc) {
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    cVD();
    if (paramaVc == null) {
      K.error("Ne peut être exécuté que via trigger");
      return;
    }

    if (paramaVc.bkc() == null) {
      K.error("Generic effect inconnu, on ne peut pas faire les test nécessaires pour executer l'effet");
      return;
    }

    BitSet localBitSet = paramaVc.bkc().auh();
    if (localBitSet == null) {
      K.error("Trigger propres du declencheurs inconnus, on ne peut pas faire les test nécessaires pour executer l'effet");
      return;
    }

    if (localBitSet.get(2136))
      activate();
    else
      X(paramaVc);
  }

  private void activate()
  {
    if ((this.cxl <= 0) || (this.cpW == null)) {
      return;
    }
    int i = dpe.AX(2) == 1 ? 1 : 0;
    if (i != 0) {
      int j = 0;
      if (this.evo.b(eu.azQ)) {
        j = this.evo.e(eu.azQ);
      }
      int k = this.cxl * (100 + j) / 100;
      bFw localbFw = bFw.a(this.ejP, this.cpW, dnO.lnU, k, this.evp);
      localbFw.i(this.evo);
      localbFw.b(bdH.brN());
      localbFw.bkz();

      this.cxl *= 2;
      if (bkn() != null)
        bkn().kf(this.cxl);
    } else {
      aWl localaWl = aWl.c(this.ejP, this.cpW);
      localaWl.j(this.evp);
      localaWl.i(this.evo);
      localaWl.kf(this.cxl);
      localaWl.b(bdH.brN());
      localaWl.bkz();

      bkn().bkq().G(bkn());
    }
  }

  public void oT() {
    dji localdji = (dji)bkh();
    if (localdji != null)
      X(localdji.cRV());
    super.oT();
  }

  private void X(aVc paramaVc) {
    if (paramaVc == null) {
      K.error("Pas d'effet declencheur pour enregistrer la valeur");
      return;
    }

    this.cxl = paramaVc.getValue();
    if (bkn() != null)
      bkn().kf(this.cxl);
    this.cpW = ((doA)paramaVc).Cz();
  }

  public boolean aL() {
    return true;
  }

  public boolean aM() {
    return true;
  }

  public boolean aN() {
    return false;
  }

  public void bc() {
    this.cpW = null;
    super.bc();
  }
}