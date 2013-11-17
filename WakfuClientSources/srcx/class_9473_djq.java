import java.nio.ByteBuffer;

public class djq extends aRw
{
  private long aTz;
  private String m_name;

  public void setName(String paramString)
  {
    this.m_name = paramString;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.m_name);
    int i = arrayOfByte.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(12 + i);
    localByteBuffer.putLong(this.aTz);
    localByteBuffer.putInt(i);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20021;
  }
}