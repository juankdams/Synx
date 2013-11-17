import java.nio.ByteBuffer;

class pE extends cCH
{
  pE(cyN paramcyN, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(cyN.a(this.aVS));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cyN.a(this.aVS, paramByteBuffer.getInt());
  }
}