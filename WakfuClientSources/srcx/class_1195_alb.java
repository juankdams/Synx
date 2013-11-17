import java.nio.ByteBuffer;

class alb extends cCH
{
  alb(ajh paramajh)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(ajh.a(this.dlQ) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    ajh.a(this.dlQ, paramByteBuffer.get() == 1);
  }

  public int cc()
  {
    return 1;
  }
}