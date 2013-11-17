import java.nio.ByteBuffer;

public class cAq extends dzz
{
  private int aHQ;
  private byte iqn;
  private long aHS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aHQ = localByteBuffer.getInt();
    this.iqn = localByteBuffer.get();
    this.aHS = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15704;
  }

  public int bel() {
    return this.aHQ;
  }

  public ctr cxj() {
    return ctr.dU(this.iqn);
  }

  public long aQk() {
    return this.aHS;
  }
}