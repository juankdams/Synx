import java.nio.ByteBuffer;

class dtk extends cCH
{
  dtk(tY paramtY)
  {
  }

  public int cc()
  {
    return 1;
  }

  public void b(ByteBuffer paramByteBuffer) {
    if (this.lvO.aOF != null)
      paramByteBuffer.put(this.lvO.aOF.bJ());
    else
      paramByteBuffer.put((byte)0);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt) {
    this.lvO.aOF = eu.a(Byte.valueOf(paramByteBuffer.get()));
  }
}