import java.nio.ByteBuffer;

public class cPL extends dzz
{
  private long aLD;
  private long dES;
  private boolean bKT;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aLD = localByteBuffer.getLong();
    this.dES = localByteBuffer.getLong();
    this.bKT = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId()
  {
    return 6022;
  }

  public long acp() {
    return this.aLD;
  }

  public long aFL() {
    return this.dES;
  }

  public boolean gI() {
    return this.bKT;
  }
}