import java.nio.ByteBuffer;

class bqT extends cCH
{
  bqT(fb paramfb, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(fb.a(this.fMd));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    fb.a(this.fMd, paramByteBuffer.getInt());
  }
}