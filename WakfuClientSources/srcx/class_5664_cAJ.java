import java.nio.ByteBuffer;

class cAJ extends cCH
{
  cAJ(FY paramFY)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(FY.e(this.iqs) ? 1 : 0));
    paramByteBuffer.put((byte)(FY.f(this.iqs) ? 1 : 0));
    paramByteBuffer.put(this.iqs.Qi());
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    FY.a(this.iqs, paramByteBuffer.get() > 0);
    FY.b(this.iqs, paramByteBuffer.get() > 0);
    FY.a(this.iqs, paramByteBuffer.get());
  }
}