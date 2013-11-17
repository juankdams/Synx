import java.nio.ByteBuffer;

public class doP extends dzz
{
  private int lpo;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.lpo = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 4000;
  }

  public int cWl() {
    return this.lpo;
  }
}