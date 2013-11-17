import java.nio.ByteBuffer;

public class bTa extends dzz
{
  private long Tj;
  private cbQ heu = new cbQ();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.Tj = localByteBuffer.getLong();
    while (localByteBuffer.hasRemaining()) {
      this.heu.add(localByteBuffer.getLong());
    }
    return true;
  }

  public int getId() {
    return 506;
  }

  public long hf() {
    return this.Tj;
  }

  public cbQ bZH() {
    return this.heu;
  }
}