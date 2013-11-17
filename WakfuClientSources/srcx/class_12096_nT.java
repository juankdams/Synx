import org.apache.log4j.Logger;

public class nT extends dKc
{
  protected static final Logger K = Logger.getLogger(nT.class);
  private final czr aTb;

  public nT(czr paramczr)
  {
    this.aTb = paramczr;
  }

  public short fU() {
    return 18;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("Lancement de l'occupation DIM_BAG_BROWSE_FLEA");

    this.bSY.q(false, true);

    dKd.d(this.aTb.cwk());

    if (byv.bFN().c(dtN.cZR()))
      byv.bFN().b(dtN.cZR());
    byv.bFN().a(dtN.cZR());

    aVK localaVK = new aVK();
    localaVK.eL(this.aTb.getId());
    localaVK.dP(true);
    byv.bFN().aJK().d(localaVK);

    this.bSY.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("On arrête l'occupation DIM_BAG_BROWSE_FLEA (fromServer=" + paramBoolean1 + ", sendMessage=" + paramBoolean2 + ")");
    return fW();
  }

  public boolean fW()
  {
    if (byv.bFN().c(dtN.cZR())) {
      byv.bFN().b(dtN.cZR());
    }

    aVK localaVK = new aVK();
    localaVK.eL(this.aTb.getId());
    localaVK.dP(false);
    byv.bFN().aJK().d(localaVK);

    return true;
  }
}