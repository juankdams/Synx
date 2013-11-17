import java.nio.ByteBuffer;

class bzk extends cCH
{
  bzk(bMQ parambMQ, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(bMQ.a(this.gnj));
    paramByteBuffer.putShort(bMQ.b(this.gnj));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bMQ.a(this.gnj, paramByteBuffer.getLong());
    bMQ.a(this.gnj, null);
    bMQ.a(this.gnj, paramByteBuffer.getShort());
  }
}