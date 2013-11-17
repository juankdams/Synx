public class arY extends ws
{
  private long dBB;

  public arY(bKu parambKu)
  {
    super(parambKu);
    this.dBB = parambKu.nL().ayX();
  }

  public void restore() {
    aM(this.dBB);
  }

  public void aQ(short paramShort) {
    if (!Fz().nK()) {
      return;
    }
    dHJ localdHJ = Fz().nL();
    aM(localdHJ.ble().hR(paramShort));
  }

  public void aM(long paramLong) {
    super.aM(paramLong);

    gA localgA = (gA)Fz();
    localgA.of();

    dLE.doY().a((dBv)Fz(), new String[] { "ap", "level", "effect", "effectAndCaracteristic", "caracteristic", "criticalEffectDetails" });
  }
}