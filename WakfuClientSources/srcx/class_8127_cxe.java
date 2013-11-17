import java.nio.ByteBuffer;

public class cxe extends aRw
{
  private boolean ijQ;
  private int bla;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(5);
    localByteBuffer.put((byte)(this.ijQ ? 1 : 0));
    localByteBuffer.putInt(this.bla);
    return a((byte)3, localByteBuffer.array());
  }

  public void cuy()
  {
    this.ijQ = false;
    this.bla = 0;
  }

  public void wY(int paramInt)
  {
    this.ijQ = true;
    this.bla = paramInt;
  }

  public int getId()
  {
    return 13203;
  }
}