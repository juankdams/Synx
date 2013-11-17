public class bPx extends aRw
{
  private boolean gWh;

  public void gw(boolean paramBoolean)
  {
    this.gWh = paramBoolean;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = new byte[1];
    if (this.gWh)
      arrayOfByte[0] = 1;
    else
      arrayOfByte[0] = 0;
    return a((byte)3, arrayOfByte);
  }

  public int getId()
  {
    return 8153;
  }
}