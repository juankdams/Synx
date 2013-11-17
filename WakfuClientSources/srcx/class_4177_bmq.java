import java.nio.ByteBuffer;

class bmq extends cCH
{
  bmq(dBr paramdBr, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(dBr.a(this.fDT));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dBr.a(this.fDT, paramByteBuffer.getLong());
  }
}