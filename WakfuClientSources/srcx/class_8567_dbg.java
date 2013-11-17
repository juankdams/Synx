import java.nio.ByteBuffer;

public class dbg extends dsQ
{
  private long kTb;
  private long kTc;
  private long kD;
  private boolean dUH;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);
    this.dUH = (localByteBuffer.get() == 1);
    this.kTb = localByteBuffer.getLong();
    this.kTc = localByteBuffer.getLong();
    this.kD = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 6200;
  }

  public int eo() {
    return 0;
  }

  public dPD ep() {
    return dPD.mhm;
  }

  public boolean cMW() {
    return this.dUH;
  }

  public long cMX() {
    return this.kTb;
  }

  public long gA() {
    return this.kD;
  }

  public long cMY() {
    return this.kTc;
  }
}