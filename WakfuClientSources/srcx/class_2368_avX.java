public class avX extends dzz
{
  private boolean bUX;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 1, false)) {
      return false;
    }
    this.bUX = (paramArrayOfByte[0] == 1);

    return true;
  }

  public int getId()
  {
    return 4;
  }

  public void d(int paramInt)
  {
  }

  public boolean IR()
  {
    return this.bUX;
  }
}