import java.nio.ByteBuffer;

public final class CD extends dzz
{
  private long iI;
  private int bFx;
  private int bFy;
  private boolean bFz;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    this.bFx = localByteBuffer.getInt();
    this.bFy = localByteBuffer.getInt();
    this.bFz = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId() {
    return 9201;
  }

  public long eq() {
    return this.iI;
  }

  public int LI() {
    return this.bFx;
  }

  public int LJ() {
    return this.bFy;
  }

  public boolean LK() {
    return this.bFz;
  }
}