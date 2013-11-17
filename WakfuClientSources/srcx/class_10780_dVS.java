import java.nio.ByteBuffer;

public class dVS extends dzz
{
  private long bkH;
  private byte mvj;
  private long gav;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bkH = localByteBuffer.getLong();
    this.mvj = localByteBuffer.get();
    this.gav = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 11108;
  }

  public long EN() {
    return this.bkH;
  }

  public byte dvy() {
    return this.mvj;
  }

  public long cBT() {
    return this.gav;
  }
}