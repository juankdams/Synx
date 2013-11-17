import java.nio.ByteBuffer;

class Uj extends cCH
{
  Uj(aZP paramaZP, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) { paramByteBuffer.putShort(aZP.a(this.cxG)); }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    aZP.a(this.cxG, paramByteBuffer.getShort());
  }
}