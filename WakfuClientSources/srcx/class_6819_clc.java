import java.nio.ByteBuffer;

public class clc extends aRw
{
  private long cJp;
  private dli cJo;

  public clc(long paramLong, dli paramdli)
  {
    this.cJp = paramLong;
    this.cJo = paramdli;
  }

  public byte[] encode() {
    int i = 12 + 10 * this.cJo.size();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.cJp);

    localByteBuffer.putInt(this.cJo.size());
    this.cJo.a(new cej(this, localByteBuffer));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 4183;
  }
}