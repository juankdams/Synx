import java.nio.ByteBuffer;

public abstract class Lf extends cWG
{
  public static final int bXH = 5;

  public void aJ()
  {
  }

  public void bc()
  {
  }

  public byte[] a(byte paramByte, byte[] paramArrayOfByte)
  {
    int i = 5 + paramArrayOfByte.length;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putShort((short)i);
    localByteBuffer.put(paramByte);
    localByteBuffer.putShort((short)getId());

    localByteBuffer.put(paramArrayOfByte);

    return localByteBuffer.array();
  }

  public void d(int paramInt)
  {
  }
}