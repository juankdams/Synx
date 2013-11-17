import java.nio.ByteBuffer;

public class ceN extends dzz
{
  private long cfv;
  private long gCz;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cfv = localByteBuffer.getLong();
    this.gCz = localByteBuffer.getLong();
    return true;
  }

  public long anE() {
    return this.cfv;
  }

  public long ayX() {
    return this.gCz;
  }

  public int getId()
  {
    return 15990;
  }

  public String toString()
  {
    return "ItemXpChangeMessage{m_itemId=" + this.cfv + ", m_xp=" + this.gCz + '}';
  }
}