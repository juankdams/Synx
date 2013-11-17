import java.nio.ByteBuffer;

class Oc extends cCH
{
  Oc(dWw paramdWw, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put((byte)(dWw.a(this.ceW) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dWw.a(this.ceW, paramByteBuffer.get() == 1);
  }
}