import java.nio.ByteBuffer;

class zI extends bJS
{
  zI(bUZ parambUZ1, bUZ parambUZ2, int paramInt)
  {
    super(parambUZ2, paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(bUZ.a(this.buC));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    bUZ.a(this.buC, paramByteBuffer.getLong());
  }

  public void aS()
  {
  }

  public void aT()
  {
    for (bxV localbxV : bUZ.b(this.buC))
      localbxV.a(this);
  }
}