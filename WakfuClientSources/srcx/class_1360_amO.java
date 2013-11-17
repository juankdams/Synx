import java.nio.ByteBuffer;

public class amO extends dzz
{
  private long kM;
  private int dpC;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.kM = localByteBuffer.getLong();
    this.dpC = localByteBuffer.getInt();

    return true;
  }

  public long eW() {
    return this.kM;
  }

  public int azn() {
    return this.dpC;
  }

  public int getId()
  {
    return 12602;
  }
}