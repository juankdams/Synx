import org.apache.log4j.Logger;

public abstract class bkY
{
  private static final Logger K = Logger.getLogger(bkY.class);
  protected final caT fBM;

  protected bkY(caT paramcaT)
  {
    this.fBM = paramcaT;
  }

  protected cMN b(cnv paramcnv)
  {
    return new cEP(paramcnv);
  }

  protected cnv a(dDe paramdDe)
  {
    return new bIj((arO)this.fBM, paramdDe);
  }

  protected dDe bvZ()
  {
    return new bdf((dEB)this.fBM);
  }

  protected eB bwa()
  {
    return new Ok();
  }

  public bIC bwb()
  {
    bIC localbIC = aAd();
    localbIC.cR(((arO)this.fBM).aEt().dto());
    return localbIC;
  }

  protected abstract bIC aAd();
}