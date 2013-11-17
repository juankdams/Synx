import java.nio.ByteBuffer;

public class mE extends dzz
{
  private String Th;
  private String aQZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    byte[] arrayOfByte1 = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte1);
    this.Th = dzp.aJ(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte2);
    this.aQZ = dzp.aJ(arrayOfByte2);
    return true;
  }

  public String he() {
    return this.Th;
  }

  public String uo() {
    return this.aQZ;
  }

  public int getId()
  {
    return 20056;
  }

  public String toString()
  {
    return "GuildInvitationMessage{m_inviterName='" + this.Th + '\'' + ", m_guildName='" + this.aQZ + '\'' + '}';
  }
}