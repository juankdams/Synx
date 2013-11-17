import java.nio.ByteBuffer;

public final class aXr extends dzz
{
  private aeL fcv;
  private long fcw;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.fcv = aeL.hP(localByteBuffer.get());
    this.fcw = localByteBuffer.getLong();

    return true;
  }

  public int getId() {
    return 15206;
  }

  public aeL bmF() {
    return this.fcv;
  }

  public long bmG() {
    return this.fcw;
  }
}