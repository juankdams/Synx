final class cUF extends Mo
{
  private final ddL cOB;

  private cUF(dhJ paramdhJ, ddL paramddL)
  {
    this.cOB = paramddL;
    this.cOB.ao().a(this);
  }

  public void aS() {
    if (dhJ.bb(this.bO) != null) {
      this.cOB.fsL = new btD();
      dhJ.bb(this.bO).a(this.cOB.fsL.gco);
    } else {
      this.cOB.fsL = null;
    }
  }

  public void aT() {
    if (this.cOB.fsL != null) {
      if (dhJ.bb(this.bO) == null) {
        dhJ.b(this.bO, aZx.a((byte)1, this.bO));
      }
      dhJ.bb(this.bO).b(this.cOB.fsL.gco);
    }
    else if (dhJ.bb(this.bO) != null) {
      dhJ.b(this.bO, null);
    }
  }
}