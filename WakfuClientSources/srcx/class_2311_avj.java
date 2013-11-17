import java.nio.ByteBuffer;

public class avj extends dzz
{
  private int dJT;
  private long doJ;

  public void bc()
  {
    super.bc();
    this.dJT = -1;
    this.doJ = -1L;
  }

  public void aJ()
  {
    super.aJ();
    this.dJT = 0;
    this.doJ = 0L;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dJT = localByteBuffer.getInt();
    this.doJ = localByteBuffer.getLong();
    return true;
  }

  public int getId()
  {
    return 20036;
  }

  public int aHn() {
    return this.dJT;
  }

  public long aHo() {
    return this.doJ;
  }
}