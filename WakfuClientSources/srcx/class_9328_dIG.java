import java.nio.ByteBuffer;

public class dIG extends cxw
{
  private byte lvb;

  public byte[] encode()
  {
    int i = 18;
    if (this.ilw != 0L)
      i += 8;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putLong(this.bkH);
    localByteBuffer.putLong(this.ilv);
    localByteBuffer.put(this.lvb);
    if (this.ilw != 0L) {
      localByteBuffer.put((byte)1);
      localByteBuffer.putLong(this.ilw);
    } else {
      localByteBuffer.put((byte)0);
    }return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5203;
  }

  public void d(azO paramazO) {
    this.lvb = paramazO.hV;
  }

  public void fM(byte paramByte) {
    this.lvb = paramByte;
  }
}