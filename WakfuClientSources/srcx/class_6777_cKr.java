final class cKr extends Mo
{
  private final dFw iJk;

  cKr(bKm parambKm, dFw paramdFw)
  {
    this.iJk = paramdFw;
    this.iJk.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("Les informations de compte de sont pas sérialisés par le client");
  }

  public void aT() {
    bKm.q(this.aHq).a(cPC.yM(this.iJk.fFP));
  }
}