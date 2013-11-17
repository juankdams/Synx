public class dgW extends aRw
{
  private dtq lce;

  public byte[] encode()
  {
    if (this.lce != null) {
      byte[] arrayOfByte = this.lce.encode();
      return a((byte)3, arrayOfByte);
    }
    return null;
  }

  public int getId()
  {
    return 4113;
  }

  public dtq cPV() {
    return this.lce;
  }

  public void b(dtq paramdtq) {
    this.lce = paramdtq;
  }
}