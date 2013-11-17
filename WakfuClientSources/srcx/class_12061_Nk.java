import java.nio.ByteBuffer;

class Nk extends bJS
{
  Nk(aTA paramaTA1, aTA paramaTA2, int paramInt)
  {
    super(paramaTA2, paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) { paramByteBuffer.putLong(this.cah.aTz); }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.cah.aTz = paramByteBuffer.getLong();
  }

  public void aS()
  {
  }

  public void aT()
  {
    for (bxV localbxV : this.cah.dOe)
      localbxV.a(this);
  }
}