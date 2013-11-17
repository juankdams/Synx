import org.apache.log4j.Logger;

public final class cXx extends qZ
{
  private static final aee bx = new bOO(new N());

  public cXx()
  {
    aH();
  }

  public cXx cLk()
  {
    cXx localcXx;
    try {
      localcXx = (cXx)bx.Mm();
      localcXx.aOr = bx;
    } catch (Exception localException) {
      localcXx = new cXx();
      localcXx.aOr = null;
      localcXx.eXg = false;
      K.error("Erreur lors d'un checkOut sur un ApplyStateFunctionActionCost : " + localException.getMessage());
    }
    return localcXx;
  }

  protected void a(aVc paramaVc, boolean paramBoolean) {
    jJ(true);
    if ((paramaVc == null) || (!(paramaVc instanceof dRu))) {
      K.error("On ne peut pas utiliser cet effet avec autre chose qu'un déclenchement lié à un ActionCost");
      return;
    }

    dRu localdRu = (dRu)paramaVc;

    int i = localdRu.dsq();
    int j = localdRu.dsp();
    int k = localdRu.dso();

    short s = (short)(i * this.aYK + j * this.aYL + k * this.aYM);

    bZG localbZG = bZG.a(this.ejP, this.evp, this.aGz, s, false);
    localbZG.i(this.evo);
    localbZG.b(this.eWM);
    localbZG.b(this.eWL);
    localbZG.cel();
    localbZG.c(paramaVc, false);
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
}