import java.nio.ByteBuffer;

public final class auV extends dzz
{
  private KR dJI = new KR();

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    while (localByteBuffer.hasRemaining()) {
      this.dJI.a(localByteBuffer.getShort(), localByteBuffer.getInt());
    }
    return true;
  }

  public int getId() {
    return 9305;
  }

  public KR aHb() {
    return this.dJI;
  }
}