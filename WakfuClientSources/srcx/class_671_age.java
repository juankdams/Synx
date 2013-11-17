import java.nio.ByteBuffer;

class age extends cCH
{
  age(cVS paramcVS, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(cVS.a(this.cZt));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cVS.a(this.cZt, paramByteBuffer.getLong());
  }
}