import java.nio.ByteBuffer;

class bim extends cCH
{
  bim(Ag paramAg)
  {
  }

  public int cc()
  {
    return 2;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    if (this.fyJ.aOF != null)
      paramByteBuffer.put(this.fyJ.aOF.bJ());
    else
      paramByteBuffer.put((byte)0);
    paramByteBuffer.put((byte)(Ag.a(this.fyJ) ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.fyJ.aOF = eu.a(Byte.valueOf(paramByteBuffer.get()));
    Ag.a(this.fyJ, paramByteBuffer.get() == 1);
  }
}