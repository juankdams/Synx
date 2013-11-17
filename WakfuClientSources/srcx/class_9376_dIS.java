import java.nio.ByteBuffer;

class dIS extends cCH
{
  dIS(aeU paramaeU)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.lUu.aOG ? 1 : 0));
    paramByteBuffer.put((byte)(this.lUu.aOH ? 1 : 0));
    paramByteBuffer.putInt(this.lUu.aOI);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.lUu.aOG = (paramByteBuffer.get() == 1);
    this.lUu.aOH = (paramByteBuffer.get() == 1);
    this.lUu.aOI = paramByteBuffer.getInt();
  }

  public int cc()
  {
    return 6;
  }
}