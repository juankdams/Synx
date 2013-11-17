import java.nio.ByteBuffer;

class cJU extends cCH
{
  cJU(cDJ paramcDJ)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putInt(cDJ.a(this.iIp));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    cDJ.a(this.iIp, paramByteBuffer.getInt());
  }

  public int cc()
  {
    return 4;
  }
}