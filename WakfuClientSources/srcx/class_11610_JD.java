import java.nio.ByteBuffer;

class JD extends cCH
{
  JD(dzK paramdzK, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(dzK.a(this.bUB));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dzK.a(this.bUB, paramByteBuffer.getLong());
  }
}