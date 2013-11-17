import java.nio.ByteBuffer;

class axT extends cCH
{
  axT(kM paramkM)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.dNi.aOG ? 1 : 0));
    paramByteBuffer.put((byte)(this.dNi.aOH ? 1 : 0));
    paramByteBuffer.putInt(this.dNi.aOI);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.dNi.aOG = (paramByteBuffer.get() == 1);
    this.dNi.aOH = (paramByteBuffer.get() == 1);
    this.dNi.aOI = paramByteBuffer.getInt();
  }

  public int cc()
  {
    return 6;
  }
}