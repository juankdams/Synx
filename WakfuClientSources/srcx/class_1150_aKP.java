import java.nio.ByteBuffer;

class aKP
  implements dxu
{
  private final String eoN;

  public aKP()
  {
    this.eoN = null;
  }

  public aKP(String paramString)
  {
    this.eoN = paramString;
  }

  public boolean gQ(String paramString)
  {
    return true;
  }

  public ByteBuffer encode(String paramString)
  {
    if (this.eoN == null) {
      return ByteBuffer.wrap(paramString.getBytes());
    }
    return ByteBuffer.wrap(paramString.getBytes(this.eoN));
  }

  public String K(byte[] paramArrayOfByte)
  {
    if (this.eoN == null) {
      return new String(paramArrayOfByte);
    }
    return new String(paramArrayOfByte, this.eoN);
  }
}