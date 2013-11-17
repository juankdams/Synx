import java.nio.ByteBuffer;

public class zS extends dzz
{
  private int buP;
  private int buQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.buP = localByteBuffer.getInt();
    this.buQ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15712;
  }

  public int IF() {
    return this.buP;
  }

  public int IG() {
    return this.buQ;
  }
}