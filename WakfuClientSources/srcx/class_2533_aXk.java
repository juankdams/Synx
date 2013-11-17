import java.nio.ByteBuffer;

class aXk extends cCH
{
  aXk(aHR paramaHR)
  {
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    dxL localdxL = this.fcs.aIX.EQ();
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
    this.fcs.aIX.e(cYq.jq(l));
  }

  public int cc()
  {
    return 8;
  }
}