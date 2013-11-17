import java.nio.ByteBuffer;

public class ddq extends dzz
{
  private int dfl;
  private int hJg;
  private dxL kWJ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.dfl = localByteBuffer.getInt();
    this.hJg = localByteBuffer.getInt();
    this.kWJ = cYq.jq(localByteBuffer.getLong());

    return true;
  }

  public int aIn() {
    return this.hJg;
  }

  public dxL cOC() {
    return this.kWJ;
  }

  public int coC() {
    return this.dfl;
  }

  public int getId()
  {
    return 15502;
  }
}