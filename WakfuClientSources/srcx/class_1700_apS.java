import java.nio.ByteBuffer;

public class apS extends aRw
{
  private final boolean dwy;

  public apS(boolean paramBoolean)
  {
    this.dwy = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put((byte)(this.dwy ? 1 : 0));
    return a((byte)6, localByteBuffer.array());
  }

  public int getId()
  {
    return 20058;
  }

  public String toString()
  {
    return "GuildInvitationResultMessage{m_accepted=" + this.dwy + '}';
  }
}