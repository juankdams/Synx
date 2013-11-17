import java.nio.ByteBuffer;

class bYh extends cCH
{
  bYh(dgb paramdgb)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(dgb.a(this.hoj) ? 1 : 0));
    paramByteBuffer.put((byte)(dgb.b(this.hoj) ? 1 : 0));
    paramByteBuffer.putInt(dgb.c(this.hoj));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dgb.a(this.hoj, paramByteBuffer.get() == 1);
    dgb.b(this.hoj, paramByteBuffer.get() == 1);
    dgb.a(this.hoj, paramByteBuffer.getInt());
  }

  public int cc()
  {
    return 6;
  }
}