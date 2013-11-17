import java.nio.ByteBuffer;

class l extends cCH
{
  l(hE paramhE, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(hE.a(this.ah).bJ());
    paramByteBuffer.putInt(hE.b(this.ah));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    hE.a(this.ah, bG.d(paramByteBuffer.get()));
    hE.a(this.ah, paramByteBuffer.getInt());
  }
}