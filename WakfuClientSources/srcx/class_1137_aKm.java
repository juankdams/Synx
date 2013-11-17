import java.nio.ByteBuffer;

public class aKm extends Ia
{
  private byte ekM;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    M(localByteBuffer);
    this.ekM = localByteBuffer.get();
    return true;
  }

  public int getId()
  {
    return 8038;
  }

  public byte bbz() {
    return this.ekM;
  }
}