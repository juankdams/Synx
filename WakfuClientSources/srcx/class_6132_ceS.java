import java.nio.ByteBuffer;

public class ceS extends dzz
{
  public static final byte hzy = 0;
  public static final byte hzz = 1;
  public static final byte hzA = 2;
  public static final byte hzB = 3;
  private byte hzC;
  private String Tl = null;
  private int dui = 16777215;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 3, false)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.hzC = localByteBuffer.get();
    if (this.hzC == 3)
      this.dui = localByteBuffer.getInt();
    Short localShort = Short.valueOf(localByteBuffer.getShort());
    byte[] arrayOfByte = new byte[localShort.shortValue() & 0xFFFF];
    localByteBuffer.get(arrayOfByte);
    this.Tl = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId()
  {
    return 105;
  }

  public byte chP()
  {
    return this.hzC;
  }

  public String getMessage()
  {
    return this.Tl;
  }

  public int aBc() {
    return this.dui;
  }
}