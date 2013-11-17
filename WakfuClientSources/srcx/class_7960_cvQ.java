import java.nio.ByteBuffer;

class cvQ extends cCH
{
  cvQ(clV paramclV, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(clV.a(this.iho).bJ());
    paramByteBuffer.put(clV.b(this.iho).bJ());
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    clV.a(this.iho, dEv.fH(paramByteBuffer.get()));
    clV.a(this.iho, bcz.bI((short)paramByteBuffer.get()));
  }
}