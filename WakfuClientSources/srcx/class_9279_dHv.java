import java.nio.ByteBuffer;

public class dHv extends dzz
{
  private int aNN;
  private byte cYF;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    this.cYF = localByteBuffer.get();
    return true;
  }

  public int se() {
    return this.aNN;
  }

  public byte arc() {
    return this.cYF;
  }

  public int getId() {
    return 11216;
  }
}