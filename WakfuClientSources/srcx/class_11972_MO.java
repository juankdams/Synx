import java.nio.ByteBuffer;

class MO extends cCH
{
  MO(cJc paramcJc)
  {
  }

  public int cc()
  {
    return 2;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.bZU.iHh ? 1 : 0));
    paramByteBuffer.put((byte)(cJc.a(this.bZU) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.bZU.iHh = (paramByteBuffer.get() == 1);
    cJc.a(this.bZU, paramByteBuffer.get() == 1);
  }
}