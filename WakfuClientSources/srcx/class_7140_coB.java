import java.nio.ByteBuffer;

public class coB extends aRw
{
  private byte fsq = -1;
  private short aXf = 0;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(3);

    localByteBuffer.put(this.fsq);
    localByteBuffer.putShort(this.aXf);

    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20085;
  }

  public void di(short paramShort) {
    this.aXf = paramShort;
  }

  public void cG(byte paramByte) {
    this.fsq = paramByte;
  }
}