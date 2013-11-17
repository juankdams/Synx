import java.nio.ByteBuffer;

public final class aNV extends dWi
{
  private int baA;
  private long eug;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.baA = localByteBuffer.getInt();
    this.eug = localByteBuffer.getLong();
    return true;
  }

  public int yR() {
    return this.baA;
  }

  public long beT() {
    return this.eug;
  }

  public int getId() {
    return 8308;
  }
}