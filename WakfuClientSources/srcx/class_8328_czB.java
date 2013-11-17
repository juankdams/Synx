import java.nio.ByteBuffer;

class czB extends cCH
{
  czB(aLm paramaLm, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putShort(aLm.a(this.ioF));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    aLm.a(this.ioF, paramByteBuffer.getShort());
  }
}