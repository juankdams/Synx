import java.nio.ByteBuffer;

public final class mo extends dzz
{
  public static final byte aQn = 0;
  public static final byte aQo = 1;
  private String Tl;
  private byte aQp = -1;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aQp = localByteBuffer.get();
    int i = localByteBuffer.getShort();
    byte[] arrayOfByte = new byte[i];
    localByteBuffer.get(arrayOfByte);

    this.Tl = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId() {
    return 2061;
  }

  public String getMessage() {
    return this.Tl;
  }

  public byte tY() {
    return this.aQp;
  }
}