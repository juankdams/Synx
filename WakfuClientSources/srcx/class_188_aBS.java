import java.nio.ByteBuffer;

public class aBS extends dzz
{
  private long kh;
  private short cJY;
  private Qv dWh;

  public long aiQ()
  {
    return this.kh;
  }

  public short aks() {
    return this.cJY;
  }

  public Qv aOa() {
    return this.dWh;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kh = localByteBuffer.getLong();
    this.cJY = localByteBuffer.getShort();
    this.dWh = new Qv();
    this.dWh.h(localByteBuffer);
    return localByteBuffer.remaining() == 0;
  }

  public int getId() {
    return 5232;
  }
}