public class dJQ extends dzz
{
  private byte lWn = -1;
  private byte cuu = -1;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 2, true))
      return false;
    this.cuu = paramArrayOfByte[0];
    this.lWn = paramArrayOfByte[1];
    return true;
  }

  public int getId() {
    return 9;
  }

  public void d(int paramInt) {
    throw new UnsupportedOperationException("Id fixe pour ce message. Ne peut être changé.");
  }

  public byte djb() {
    return this.lWn;
  }

  public byte agd() {
    return this.cuu;
  }
}