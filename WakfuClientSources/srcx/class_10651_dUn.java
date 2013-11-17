import java.nio.ByteBuffer;

public class dUn extends aRw
{
  private byte[] cRH;

  public void aS(byte[] paramArrayOfByte)
  {
    this.cRH = paramArrayOfByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + this.cRH.length);
    localByteBuffer.putInt(this.cRH.length);
    localByteBuffer.put(this.cRH);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 10043;
  }
}