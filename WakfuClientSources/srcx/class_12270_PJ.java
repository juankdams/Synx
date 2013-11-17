import java.nio.ByteBuffer;

class PJ extends cCH
{
  PJ(dhj paramdhj)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(dhj.a(this.cim));
    paramByteBuffer.putShort(dhj.b(this.cim));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    dhj.a(this.cim, paramByteBuffer.getInt());
    dhj.a(this.cim, paramByteBuffer.getShort());
  }

  public int cc()
  {
    return 6;
  }
}