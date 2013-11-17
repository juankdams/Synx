import java.nio.ByteBuffer;

public final class ayI extends dzz
{
  private long dPu;
  private byte cXi;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dPu = localByteBuffer.getLong();
    this.cXi = localByteBuffer.get();
    return true;
  }

  public long aKF() {
    return this.dPu;
  }

  public byte VH() {
    return this.cXi;
  }

  public int getId()
  {
    return 13103;
  }

  public String toString()
  {
    return "GemResultMessage{m_gemmedItemId" + this.dPu + ", m_index=" + this.cXi + '}';
  }
}