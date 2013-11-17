import org.apache.log4j.Logger;

class bdf
  implements dDe
{
  private static final Logger K = Logger.getLogger(bdf.class);
  private final dEB fnx;

  bdf(dEB paramdEB)
  {
    this.fnx = paramdEB;
  }

  public int fc(long paramLong) {
    dHW localdHW = this.fnx.ez(paramLong);
    if (localdHW == null)
      K.error("[_FL_] fightId=" + this.fnx.getId() + " : Fighter inconnu " + paramLong + " on ne peut pas recuperer son init");
    return localdHW == null ? 0 : localdHW.e(eu.azq);
  }

  public boolean fd(long paramLong) {
    dHW localdHW = this.fnx.ez(paramLong);
    return (localdHW != null) && (localdHW.c(cfY.hBj));
  }
}