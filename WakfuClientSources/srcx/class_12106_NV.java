import java.nio.ByteBuffer;

class NV extends cCH
{
  NV(SL paramSL, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(SL.a(this.ceQ));
    paramByteBuffer.put((byte)(SL.b(this.ceQ) ? 1 : 0));
    paramByteBuffer.put((byte)(SL.c(this.ceQ) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    SL.a(this.ceQ, paramByteBuffer.getInt());
    SL.a(this.ceQ, paramByteBuffer.get() == 1);
    SL.b(this.ceQ, paramByteBuffer.get() == 1);
  }
}