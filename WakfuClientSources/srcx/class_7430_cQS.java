public class cQS
{
  private final bpn cGL;
  private final doN kCE;

  public cQS(bpn parambpn, ahB paramahB)
  {
    this.cGL = parambpn;
    this.kCE = new cWO(this, parambpn, paramahB);

    this.cGL.setEnableResizeEvents(true);
    this.cGL.a(CH.bGJ, this.kCE, true);
  }

  public bpn getWindow() {
    return this.cGL;
  }

  public void removeListeners() {
    this.cGL.b(CH.bGJ, this.kCE, true);
  }
}