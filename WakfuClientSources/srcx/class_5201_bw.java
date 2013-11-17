import java.nio.ByteBuffer;

class bw extends cCH
{
  bw(bEI parambEI)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(bEI.a(this.ks) ? 1 : 0));
    paramByteBuffer.put((byte)(bEI.b(this.ks) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bEI.a(this.ks, paramByteBuffer.get() == 1);
    bEI.b(this.ks, paramByteBuffer.get() == 1);
  }

  public int cc()
  {
    return 2;
  }
}