public class baQ extends aRw
{
  private byte[] baw;

  public baQ()
  {
    this.baw = null;
  }

  public byte[] encode()
  {
    return a((byte)1, this.baw);
  }

  public int getId()
  {
    return 1025;
  }

  public void X(byte[] paramArrayOfByte) {
    this.baw = paramArrayOfByte;
  }
}