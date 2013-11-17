import java.nio.ByteBuffer;

public class bj extends dsQ
{
  private long iI;
  private int kf;
  private int[][] kg;

  public int eo()
  {
    return 0;
  }

  public dPD ep() {
    return null;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();
    this.kf = localByteBuffer.getInt();

    this.kg = new int[this.kf][3];
    for (int i = 0; i < this.kf; i++) {
      this.kg[i][0] = localByteBuffer.getInt();
      this.kg[i][1] = localByteBuffer.getInt();
      this.kg[i][2] = localByteBuffer.getInt();
    }

    return true;
  }

  public int getId() {
    return 8040;
  }

  public long eq() {
    return this.iI;
  }

  public int er() {
    return this.kf;
  }

  public int[][] es() {
    return this.kg;
  }
}