import java.nio.ByteBuffer;

public class cVu extends dzz
{
  private int cQD;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cQD = localByteBuffer.getInt();
    return true;
  }

  public cbd cKe() {
    return cbd.values()[this.cQD];
  }

  public int getId()
  {
    return 20059;
  }

  public String toString()
  {
    return "GuildErrorMessage{m_errorId=" + this.cQD + '}';
  }
}