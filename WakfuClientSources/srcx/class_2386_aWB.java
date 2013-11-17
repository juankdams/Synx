import java.nio.ByteBuffer;

class aWB extends cCH
{
  aWB(tx paramtx, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(tx.a(this.fbJ));
    paramByteBuffer.putInt(tx.b(this.fbJ));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    tx.a(this.fbJ, paramByteBuffer.get());
    tx.a(this.fbJ, paramByteBuffer.getInt());
  }
}