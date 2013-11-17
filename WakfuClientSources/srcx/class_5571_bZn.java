import java.nio.ByteBuffer;

public class bZn extends dzz
{
  private long eQx;
  private int bVc;
  private long ggi;
  private boolean hpI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eQx = localByteBuffer.getLong();
    this.bVc = localByteBuffer.getInt();
    this.ggi = localByteBuffer.getLong();
    this.hpI = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId() {
    return 4210;
  }

  public long bix() {
    return this.eQx;
  }

  public int Uq() {
    return this.bVc;
  }

  public long cdP() {
    return this.ggi;
  }

  public boolean cdQ() {
    return this.hpI;
  }
}