import java.nio.ByteBuffer;

public class cNw extends aRw
{
  private long ksV;
  private boolean ksW = false;
  private boolean coU = false;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);
    localByteBuffer.putLong(this.ksV);
    localByteBuffer.put((byte)(this.ksW ? 1 : 0));
    localByteBuffer.put((byte)(this.coU ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public void j(long paramLong) {
    this.ksV = paramLong;
  }

  public void iB(boolean paramBoolean) {
    this.ksW = paramBoolean;
  }

  public void setLocked(boolean paramBoolean) {
    this.coU = paramBoolean;
  }

  public int getId() {
    return 7903;
  }

  public void bc() {
    super.bc();
    this.ksV = 0L;
    this.ksW = false;
    this.coU = false;
  }
}