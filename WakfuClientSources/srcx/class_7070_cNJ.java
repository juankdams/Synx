import java.nio.ByteBuffer;

public class cNJ extends dWi
{
  private byte[] kti;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.kti = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.kti);

    return true;
  }

  public int getId()
  {
    return 8010;
  }

  public byte[] cFV() {
    return this.kti;
  }
}