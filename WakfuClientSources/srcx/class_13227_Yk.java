import java.nio.ByteBuffer;

public class Yk extends dzz
{
  private long cws;
  private int cIL;
  private int cIM;

  public long agz()
  {
    return this.cws;
  }

  public int ajM() {
    return this.cIL;
  }

  public int ajN() {
    return this.cIM;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cws = localByteBuffer.getLong();
    this.cIL = localByteBuffer.getInt();
    this.cIM = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 10064;
  }
}