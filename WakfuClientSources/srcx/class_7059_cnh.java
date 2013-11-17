import java.nio.ByteBuffer;

class cnh extends cCH
{
  cnh(cCG paramcCG)
  {
  }

  public int cc()
  {
    return 2;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.hTd.iHh ? 1 : 0));
    paramByteBuffer.put((byte)(cCG.a(this.hTd) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.hTd.iHh = (paramByteBuffer.get() == 1);
    cCG.a(this.hTd, paramByteBuffer.get() == 1);
  }
}