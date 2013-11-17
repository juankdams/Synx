import java.nio.ByteBuffer;

class afV extends cCH
{
  afV(ez paramez, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(ez.a(this.cZm));
    paramByteBuffer.putInt(ez.b(this.cZm));
    paramByteBuffer.putShort(ez.c(this.cZm));
    paramByteBuffer.putInt(ez.d(this.cZm));
    paramByteBuffer.putInt(ez.e(this.cZm));
    paramByteBuffer.putShort(ez.f(this.cZm));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    ez.a(this.cZm, paramByteBuffer.getInt());
    ez.b(this.cZm, paramByteBuffer.getInt());
    ez.a(this.cZm, paramByteBuffer.getShort());
    ez.c(this.cZm, paramByteBuffer.getInt());
    ez.d(this.cZm, paramByteBuffer.getInt());
    ez.b(this.cZm, paramByteBuffer.getShort());
  }
}