import java.nio.ByteBuffer;

public class cvz extends aRw
{
  private long brD;
  private long dYt;
  private String m_name;

  public cvz(long paramLong1, long paramLong2, String paramString)
  {
    this.brD = paramLong1;
    this.dYt = paramLong2;
    this.m_name = paramString;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.m_name);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(17 + arrayOfByte.length);
    localByteBuffer.putLong(this.brD);
    localByteBuffer.putLong(this.dYt);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20069;
  }
}