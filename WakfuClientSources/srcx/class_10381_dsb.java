import java.nio.ByteBuffer;

public final class dsb extends bH
{
  private long cSN;

  public dsb()
  {
  }

  public dsb(long paramLong)
  {
    this.cSN = paramLong;
  }

  public bqr eT() {
    return bqr.fLG;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.cSN);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.cSN = paramByteBuffer.getLong();
  }

  public void a(cFt paramcFt) {
    paramcFt.a(this);
  }

  public void a(deW paramdeW) {
    paramdeW.b(this);
  }

  public long aoZ() {
    return this.cSN;
  }

  public String toString()
  {
    return "InteractiveElementDelete{m_elementUid=" + this.cSN + "} " + super.toString();
  }
}