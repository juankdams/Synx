import java.nio.ByteBuffer;

public class vh extends dzz
{
  private int bjk;
  private int bjl;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bjk = localByteBuffer.get();
    this.bjl = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15718;
  }

  public cXB Ec() {
    return cXB.values()[this.bjk];
  }

  public int Ed() {
    return this.bjl;
  }
}