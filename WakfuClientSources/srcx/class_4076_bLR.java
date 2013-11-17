import java.nio.ByteBuffer;

class bLR extends hk
{
  private bLR(aYr paramaYr)
  {
  }

  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.gPq.dc(paramByteBuffer.getInt());
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.gPq.bP());
  }

  public int O() {
    return 4;
  }
}