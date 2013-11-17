import java.nio.ByteBuffer;

class drj extends cCH
{
  drj(apM paramapM, int paramInt)
  {
    super(paramInt);
  }
  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putLong(this.cZX.aDR);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.cZX.aDR = paramByteBuffer.getLong();
    apM.a(this.cZX, null);
  }
}