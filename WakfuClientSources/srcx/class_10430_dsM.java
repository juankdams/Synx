import java.nio.ByteBuffer;

public class dsM extends cxw
{
  protected byte lvb;

  public byte[] encode()
  {
    int i = 9;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.bkH);
    localByteBuffer.put(this.lvb);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5205;
  }

  public void c(azO paramazO)
  {
    this.lvb = paramazO.hV;
  }

  public void cz(byte paramByte) {
    this.lvb = paramByte;
  }
}