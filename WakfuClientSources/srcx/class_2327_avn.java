import java.nio.ByteBuffer;

public final class avn extends dzz
{
  private byte dJU;
  private int dJV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dJU = localByteBuffer.get();
    this.dJV = localByteBuffer.getInt();

    return true;
  }

  public byte aHs() {
    return this.dJU;
  }

  public int getResult() {
    return this.dJV;
  }

  public int getId() {
    return 504;
  }
}