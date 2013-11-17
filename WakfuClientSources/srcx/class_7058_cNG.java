import java.nio.ByteBuffer;

class cNG extends cCH
{
  cNG(bFw parambFw, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.kth.gAG);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.kth.gAG = paramByteBuffer.getInt();
  }
}