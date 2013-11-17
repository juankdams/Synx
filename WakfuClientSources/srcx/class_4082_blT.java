import java.nio.ByteBuffer;

public class blT extends dzz
{
  private int aCV;
  private int fDe;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aCV = localByteBuffer.getInt();
    this.fDe = localByteBuffer.getInt();

    return true;
  }

  public int mP() {
    return this.aCV;
  }

  public int bwU() {
    return this.fDe;
  }

  public int getId()
  {
    return 20073;
  }
}