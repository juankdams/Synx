public class aFt extends aRw
{
  private boolean bKT;

  public void dq(boolean paramBoolean)
  {
    this.bKT = paramBoolean;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = new byte[1];
    if (this.bKT)
      arrayOfByte[0] = 1;
    else
      arrayOfByte[0] = 0;
    return a((byte)3, arrayOfByte);
  }

  public int getId()
  {
    return 8149;
  }
}