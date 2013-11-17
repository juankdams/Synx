public class cSz extends aRw
{
  private boolean kE;

  public void iI(boolean paramBoolean)
  {
    this.kE = paramBoolean;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = new byte[1];
    if (this.kE)
      arrayOfByte[0] = 1;
    else
      arrayOfByte[0] = 0;
    return a((byte)3, arrayOfByte);
  }

  public int getId()
  {
    return 8157;
  }
}