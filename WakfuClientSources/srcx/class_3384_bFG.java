import java.nio.ByteBuffer;

public class bFG extends dzz
{
  private int bJP;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bJP = localByteBuffer.getInt();
    return true;
  }

  public int ajL() {
    return this.bJP;
  }

  public int getId()
  {
    return 20072;
  }

  public String toString() {
    return "GuildBonusLearnedMessage{m_bonusId=" + this.bJP + '}';
  }
}