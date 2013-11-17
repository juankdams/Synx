import java.nio.ByteBuffer;

public class dkD extends dzz
{
  public static final byte hzy = 0;
  public static final byte hzz = 1;
  public static final byte hzA = 2;
  private byte hzC;
  private String Tl = null;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 3, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hzC = localByteBuffer.get();
    Short localShort = Short.valueOf(localByteBuffer.getShort());
    byte[] arrayOfByte = new byte[localShort.shortValue() & 0xFFFF];
    localByteBuffer.get(arrayOfByte);
    this.Tl = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId()
  {
    return 102;
  }

  public byte chP()
  {
    return this.hzC;
  }

  public String getMessage()
  {
    return this.Tl;
  }
}