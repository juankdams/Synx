public class aAh extends aRw
{
  private final byte[] dnI;

  public aAh(byte[] paramArrayOfByte)
  {
    this.dnI = paramArrayOfByte;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = this.dnI;
    if (this.dnI == null) {
      arrayOfByte = new byte[0];
    }
    return a((byte)0, arrayOfByte);
  }

  public int getId()
  {
    return 3;
  }

  public void d(int paramInt)
  {
  }
}