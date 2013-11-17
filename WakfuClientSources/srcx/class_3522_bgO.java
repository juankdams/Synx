final class bgO extends Mo
{
  private final qF fuG;

  bgO(bKm parambKm, qF paramqF)
  {
    this.fuG = paramqF;
    this.fuG.ao().a(this);
  }

  public void aS() {
    throw new UnsupportedOperationException("[SOCIAL] La Part SocialStates ne devrait pas être sérialisée par le client.");
  }

  public void aT() {
    this.aHq.gMI = this.fuG.aXT;
    this.aHq.gMJ = this.fuG.aXU;
  }
}