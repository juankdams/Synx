import java.nio.ByteBuffer;

public class dOY extends dzz
{
  private long eQx;
  private dtq lce;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 19) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eQx = localByteBuffer.getLong();
    this.lce = dtq.aO(localByteBuffer);
    if (this.lce == null) {
      return false;
    }
    return true;
  }

  public int getId() {
    return 4114;
  }

  public long bix() {
    return this.eQx;
  }

  public dtq cPV() {
    return this.lce;
  }
}