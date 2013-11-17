import java.nio.ByteBuffer;

public abstract class bH
{
  private long kK;
  private boolean kL;
  private long kM;

  public abstract bqr eT();

  public abstract void a(cFt paramcFt);

  public abstract void a(deW paramdeW);

  public final byte[] j()
  {
    cXr localcXr = new cXr();
    c(localcXr);
    return localcXr.toArray();
  }

  protected void c(cXr paramcXr) {
    paramcXr.jn(this.kK);
    paramcXr.jn(this.kM);
    paramcXr.eL((byte)(this.kL ? 1 : 0));
  }

  public final void a(ByteBuffer paramByteBuffer) {
    j(paramByteBuffer);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    this.kK = paramByteBuffer.getLong();
    this.kM = paramByteBuffer.getLong();
    this.kL = (paramByteBuffer.get() != 0);
  }

  public long eU() {
    return this.kK;
  }

  public void i(long paramLong) {
    this.kK = paramLong;
  }

  public boolean eV() {
    return this.kL;
  }

  public void g(boolean paramBoolean) {
    this.kL = paramBoolean;
  }

  public long eW() {
    return this.kM;
  }

  public void j(long paramLong) {
    this.kM = paramLong;
  }

  public String toString()
  {
    return "HavenWorldAction{m_actionUID=" + this.kK + ", m_isAdmin=" + this.kL + ", m_playerId=" + this.kM + '}';
  }
}