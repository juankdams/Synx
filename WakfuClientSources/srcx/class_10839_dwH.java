import java.nio.ByteBuffer;

public class dwH extends aRw
{
  private byte lCl;

  public dwH(byte paramByte)
  {
    this.lCl = paramByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put(this.lCl);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20083;
  }
}