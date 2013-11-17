import java.nio.ByteBuffer;

public class KD extends dsQ
{
  private int bXf;
  byte[] bXg;
  long kD;
  long bXh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.bXf = localByteBuffer.getInt();

    this.bXg = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.bXg);

    this.kD = localByteBuffer.getLong();
    this.bXh = localByteBuffer.getLong();

    return true;
  }

  public int getId() {
    return 8122;
  }

  public int eo() {
    return this.bXf;
  }

  public dPD ep() {
    return dPD.mhz;
  }

  public int Vc() {
    return this.bXf;
  }

  public byte[] Vd()
  {
    return this.bXg;
  }

  public long gA() {
    return this.kD;
  }

  public long Ve() {
    return this.bXh;
  }
}