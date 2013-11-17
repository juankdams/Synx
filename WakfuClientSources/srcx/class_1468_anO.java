import java.nio.ByteBuffer;

class anO extends cCH
{
  anO(dqh paramdqh)
  {
  }

  public int cc()
  {
    return 2;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(this.drI.iHh ? 1 : 0));
    paramByteBuffer.put((byte)(dqh.a(this.drI) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.drI.iHh = (paramByteBuffer.get() == 1);
    dqh.a(this.drI, paramByteBuffer.get() == 1);
  }
}