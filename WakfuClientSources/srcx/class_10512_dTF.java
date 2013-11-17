import java.nio.ByteBuffer;

public class dTF extends dzz
{
  private long eoe;
  private int dFY;
  private long ewm;
  private String dpu;
  private long mqB;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eoe = localByteBuffer.getLong();
    this.dFY = localByteBuffer.getInt();
    this.ewm = localByteBuffer.getLong();
    int i = localByteBuffer.getInt();
    if (i > 0) {
      byte[] arrayOfByte = new byte[i];
      localByteBuffer.get(arrayOfByte);
      this.dpu = dzp.aJ(arrayOfByte);
      this.mqB = localByteBuffer.getLong();
    } else {
      this.dpu = null;
      this.mqB = 0L;
    }

    return true;
  }

  public long cKc() {
    return this.eoe;
  }

  public int aFY() {
    return this.dFY;
  }

  public long bfR() {
    return this.ewm;
  }

  public long dtA() {
    return this.mqB;
  }

  public String dtB()
  {
    return this.dpu;
  }

  public int getId() {
    return 5302;
  }
}