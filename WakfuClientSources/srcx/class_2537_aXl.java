import java.nio.ByteBuffer;

class aXl extends cCH
{
  aXl(aHR paramaHR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    dxL localdxL = this.fcs.aIX.ES();
    if (localdxL != null)
      paramByteBuffer.putLong(localdxL.rP());
    else
      paramByteBuffer.putLong(0L);
  }

  public void a(ByteBuffer paramByteBuffer, int paramInt)
  {
    if (this.fcs.aIX == null) {
      this.fcs.aIX = aHR.aTW().bhQ();
    }

    long l = paramByteBuffer.getLong();
    this.fcs.aIX.f(cYq.jq(l));
  }

  public int cc()
  {
    return 8;
  }
}