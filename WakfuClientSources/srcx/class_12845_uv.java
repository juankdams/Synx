import java.nio.ByteBuffer;

public class uv extends aRw
{
  private int TR = 0;

  public void setOffset(int paramInt)
  {
    this.TR = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.TR);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20001;
  }
}