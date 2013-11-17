import java.nio.ByteBuffer;

class dDk extends cCH
{
  dDk(hn paramhn, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) { paramByteBuffer.putShort(hn.a(this.lLw)); }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    hn.a(this.lLw, paramByteBuffer.getShort());
  }
}