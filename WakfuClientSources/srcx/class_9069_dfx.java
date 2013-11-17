import java.nio.ByteBuffer;

public class dfx extends dzz
{
  private int buP;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.buP = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15710;
  }

  public int IF() {
    return this.buP;
  }
}