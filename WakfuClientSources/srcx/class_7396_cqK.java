import java.nio.ByteBuffer;

public class cqK extends dzz
{
  private int baj;
  private int aKS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aKS = localByteBuffer.getInt();
    this.baj = localByteBuffer.getInt();
    return true;
  }

  public int yC() {
    return this.baj;
  }

  public int getDuration() {
    return this.aKS;
  }

  public int getId() {
    return 11230;
  }
}