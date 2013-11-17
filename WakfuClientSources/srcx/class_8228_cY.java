import java.nio.ByteBuffer;

public class cY extends dzz
{
  private long Sh;
  private int Si;
  private long kD;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.Si = localByteBuffer.getInt();
    this.Sh = localByteBuffer.getLong();
    this.kD = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 4108;
  }

  public int gz() {
    return this.Si;
  }

  public long eq() {
    return this.Sh;
  }

  public long gA() {
    return this.kD;
  }
}