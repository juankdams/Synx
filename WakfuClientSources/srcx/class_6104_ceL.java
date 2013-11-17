import org.apache.log4j.Logger;

final class ceL extends Mo
{
  private Ks hzl;

  ceL(bKm parambKm, Ks paramKs)
  {
    this.hzl = paramKs;
    this.hzl.ao().a(this);
  }

  public void aS() {
    bKm.asu().error("Le client ne devrait pas sérialiser les running effects.");
  }

  public void aT() {
    this.aHq.ayK().clear();
    if (this.hzl.bWO != null)
      if (this.aHq.bIx)
        this.aHq.ayK().a(this.hzl.bWO.dSK, bKm.o(this.aHq), this.aHq);
      else
        bKm.a(this.aHq, this.hzl.bWO.dSK);
  }
}