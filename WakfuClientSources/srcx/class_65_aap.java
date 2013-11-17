final class aap extends Mo
{
  private final ddL cOB;

  private aap(dhJ paramdhJ, ddL paramddL)
  {
    this.cOB = paramddL;
    this.cOB.ao().a(this);
  }

  public void aS() {
    if (dhJ.ba(this.bO) != null) {
      this.cOB.fsL = new btD();
      dhJ.ba(this.bO).a(this.cOB.fsL.gco);
    } else {
      this.cOB.fsL = null;
    }
  }

  public void aT() {
    if (this.cOB.fsL != null) {
      if (dhJ.ba(this.bO) == null) {
        dhJ.a(this.bO, aZx.a((byte)0, this.bO));
      }
      dhJ.ba(this.bO).b(this.cOB.fsL.gco);
    }
    else if (dhJ.ba(this.bO) != null) {
      dhJ.a(this.bO, null);
    }
  }
}