import java.nio.ByteBuffer;

class aXj extends cCH
{
  aXj(aHR paramaHR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.putLong(this.fcs.aIX.EN());
    paramByteBuffer.putLong(this.fcs.aIX.sN());
    paramByteBuffer.put(this.fcs.aIX.getType());
    paramByteBuffer.put(this.fcs.aIX.ET());
    paramByteBuffer.put((byte)(this.fcs.aIX.EO() ? 1 : 0));
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    if (this.fcs.aIX == null) {
      this.fcs.aIX = aHR.aTW().bhQ();
    }
    this.fcs.aIX.aH(paramByteBuffer.getLong());
    this.fcs.aIX.aI(paramByteBuffer.getLong());
    this.fcs.aIX.setType(paramByteBuffer.get());
    this.fcs.aIX.n(paramByteBuffer.get());
    this.fcs.aIX.ag(paramByteBuffer.get() == 1);
  }

  public int cc()
  {
    return 19;
  }
}