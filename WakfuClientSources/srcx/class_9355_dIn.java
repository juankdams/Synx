import java.nio.ByteBuffer;

class dIn extends cCH
{
  dIn(csz paramcsz, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(csz.b(this.lTk) ? 1 : 0));
    paramByteBuffer.putInt(csz.a(this.lTk));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    csz.a(this.lTk, paramByteBuffer.get() == 1);
    csz.a(this.lTk, paramByteBuffer.getInt());
  }
}