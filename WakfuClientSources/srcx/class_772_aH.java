import java.nio.ByteBuffer;

public class aH extends dzz
{
  private int ie;
  private long jdField_if;

  public int bP()
  {
    return this.ie;
  }

  public long bQ() {
    return this.jdField_if;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.ie = localByteBuffer.getInt();
    this.jdField_if = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15134;
  }
}