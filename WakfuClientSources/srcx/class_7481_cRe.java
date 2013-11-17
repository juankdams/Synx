public class cRe extends aRw
{
  private ctN kDy = null;

  public void c(ctN paramctN) {
    this.kDy = paramctN;
  }

  public byte[] encode() {
    return a((byte)3, aug.a(this.kDy));
  }

  public int getId() {
    return 15115;
  }
}