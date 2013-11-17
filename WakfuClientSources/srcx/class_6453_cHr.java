import java.nio.ByteBuffer;

public final class cHr extends dzz
{
  private boolean bUX;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bUX = (localByteBuffer.get() != 0);
    return true;
  }

  public boolean IR() {
    return this.bUX;
  }

  public int getId()
  {
    return 13105;
  }

  public String toString()
  {
    return "GemMergedResultMessage{m_success=" + this.bUX + '}';
  }
}