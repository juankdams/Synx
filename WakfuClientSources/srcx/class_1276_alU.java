public class alU extends dzz
{
  private byte[] dnI;

  public boolean a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length != 0))
      this.dnI = paramArrayOfByte;
    else {
      this.dnI = null;
    }
    return true;
  }

  public int getId()
  {
    return 2;
  }

  public void d(int paramInt)
  {
  }

  public byte[] ayC()
  {
    return this.dnI;
  }
}