import java.nio.ByteBuffer;

public class dSh extends dzz
{
  private int aPh;
  private long kM;
  private boolean mom;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aPh = localByteBuffer.getInt();
    this.kM = localByteBuffer.getLong();
    this.mom = (localByteBuffer.get() != 0);
    return true;
  }

  public int getId() {
    return 15618;
  }

  public int sY() {
    return this.aPh;
  }

  public long eW() {
    return this.kM;
  }

  public boolean dsQ() {
    return this.mom;
  }
}