import java.nio.ByteBuffer;

public class aID extends dzz
{
  private int Rm;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.Rm = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15722;
  }

  public int aSv() {
    return this.Rm;
  }
}