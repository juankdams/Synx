import java.nio.ByteBuffer;

class bRl extends cCH
{
  bRl(bJT parambJT, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(bJT.a(this.haZ));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bJT.a(this.haZ, paramByteBuffer.getLong());

    bJT.a(this.haZ, null);
  }
}