import java.nio.ByteBuffer;

public class aJs extends aRw
{
  private final int ejI;

  public aJs(int paramInt)
  {
    this.ejI = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.ejI);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15627;
  }
}