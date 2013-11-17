import java.nio.ByteBuffer;

public class aTW extends dzz
{
  private final aoL eUA = new aoL();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++) {
      long l = localByteBuffer.getLong();
      byte[] arrayOfByte = new byte[localByteBuffer.getShort() & 0xFFFF];
      localByteBuffer.get(arrayOfByte);
      this.eUA.put(l, arrayOfByte);
    }

    return true;
  }

  public int getId()
  {
    return 4216;
  }

  public aoL bjn()
  {
    return this.eUA;
  }
}