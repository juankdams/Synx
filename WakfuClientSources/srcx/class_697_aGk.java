import java.nio.ByteBuffer;

public class aGk extends dzz
{
  private int aPh;
  private boolean edn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aPh = localByteBuffer.getInt();
    this.edn = (localByteBuffer.get() != 0);
    return true;
  }

  public int getId() {
    return 15608;
  }

  public int sY() {
    return this.aPh;
  }

  public boolean anv() {
    return this.edn;
  }
}