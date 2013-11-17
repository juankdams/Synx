import java.nio.ByteBuffer;

public class dbZ extends aRw
{
  private final long dUK;
  private final String m_name;
  private final boolean kUH;

  public dbZ(String paramString, dbY paramdbY, boolean paramBoolean)
  {
    this.m_name = paramString;
    this.dUK = paramdbY.getId();
    this.kUH = paramBoolean;
  }

  public byte[] encode()
  {
    String str1 = bU.fH().getString("bestRankName");
    String str2 = bU.fH().getString("worstRankName");
    byte[] arrayOfByte1 = dzp.qC(this.m_name);
    byte[] arrayOfByte2 = dzp.qC(str1);
    byte[] arrayOfByte3 = dzp.qC(str2);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(14 + arrayOfByte1.length + 6 + arrayOfByte2.length + 6 + arrayOfByte3.length + 1);

    localByteBuffer.putLong(this.dUK);
    localByteBuffer.putInt(arrayOfByte1.length);
    localByteBuffer.put(arrayOfByte1);
    localByteBuffer.putInt(arrayOfByte2.length);
    localByteBuffer.put(arrayOfByte2);
    localByteBuffer.putInt(arrayOfByte3.length);
    localByteBuffer.put(arrayOfByte3);
    localByteBuffer.put((byte)(this.kUH ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15641;
  }

  public String toString()
  {
    return "CreateGuildRequestMessage{m_blazon=" + this.dUK + ", m_name='" + this.m_name + '\'' + '}';
  }
}