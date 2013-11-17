import java.nio.ByteBuffer;

class bMU extends cCH
{
  bMU(dvO paramdvO, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putFloat(dvO.a(this.gRl));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dvO.a(this.gRl, paramByteBuffer.getFloat());
  }
}