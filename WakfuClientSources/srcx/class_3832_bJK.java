import java.nio.ByteBuffer;

public class bJK extends dzz
{
  private je eaV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eaV = je.aZ(localByteBuffer.getInt());

    return true;
  }

  public je aRB() {
    return this.eaV;
  }

  public int getId()
  {
    return 20095;
  }
}