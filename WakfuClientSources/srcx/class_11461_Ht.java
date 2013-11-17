import java.nio.ByteBuffer;

class Ht extends cCH
{
  Ht(kK paramkK)
  {
  }

  public int cc()
  {
    return 2;
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.put((byte)(kK.a(this.bPH) ? 1 : 0));
    if (this.bPH.aOF != null)
      paramByteBuffer.put(this.bPH.aOF.bJ());
    else
      paramByteBuffer.put((byte)0);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    kK.a(this.bPH, paramByteBuffer.get() == 1);
    this.bPH.aOF = eu.a(Byte.valueOf(paramByteBuffer.get()));
  }
}