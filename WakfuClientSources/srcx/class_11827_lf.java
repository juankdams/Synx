import org.apache.log4j.Logger;

final class lf extends Mo
{
  private final aix aPb;

  private lf(byo parambyo, aix paramaix)
  {
    this.aPb = paramaix;
    this.aPb.ao().a(this);
  }

  public void aS() {
    byo.bjf().error("Le client ne devrait pas sérialiser les caractéristiques");
  }

  public void aT() {
    byo.a(this.iK, this.aPb.bUp);
  }
}