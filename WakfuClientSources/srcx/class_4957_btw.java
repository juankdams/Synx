import java.nio.ByteBuffer;

public class btw extends aRw
{
  private boolean dWD;
  private boolean dWE;
  private byte dWF;
  private byte dWG;

  public void fl(boolean paramBoolean)
  {
    this.dWD = paramBoolean;
  }

  public void fm(boolean paramBoolean) {
    this.dWE = paramBoolean;
  }

  public void dc(byte paramByte) {
    this.dWF = paramByte;
  }

  public void dd(byte paramByte) {
    this.dWG = paramByte;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);

    localByteBuffer.put((byte)(this.dWD ? 1 : 0));
    localByteBuffer.put((byte)(this.dWE ? 1 : 0));
    localByteBuffer.put(this.dWF);
    localByteBuffer.put(this.dWG);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10039;
  }
}