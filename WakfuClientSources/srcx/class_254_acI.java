import java.nio.ByteBuffer;

public final class acI extends bH
{
  private long cSN;
  private long cJp;
  private int bxi;
  private final cYk cGk = new cYk();
  private long bkK;
  private byte[] bFC;
  private int cSO;

  acI()
  {
  }

  public acI(long paramLong1, long paramLong2, int paramInt1, cYk paramcYk, long paramLong3, byte[] paramArrayOfByte, int paramInt2)
  {
    this.cSN = paramLong1;
    this.cJp = paramLong2;
    this.bxi = paramInt1;
    this.cGk.ae(paramcYk);
    this.bkK = paramLong3;
    this.bFC = paramArrayOfByte;
    this.cSO = paramInt2;
  }

  public bqr eT() {
    return bqr.fLF;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.cSN);
    paramcXr.jn(this.cJp);
    paramcXr.putInt(this.bxi);
    paramcXr.putInt(this.cGk.getX());
    paramcXr.putInt(this.cGk.getY());
    paramcXr.dT(this.cGk.IB());
    paramcXr.jn(this.bkK);
    paramcXr.putInt(this.bFC.length);
    paramcXr.aD(this.bFC);
    paramcXr.putInt(this.cSO);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.cSN = paramByteBuffer.getLong();
    this.cJp = paramByteBuffer.getLong();
    this.bxi = paramByteBuffer.getInt();
    this.cGk.ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
    this.bkK = paramByteBuffer.getLong();
    this.bFC = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(this.bFC);
    this.cSO = paramByteBuffer.getInt();
  }

  public void a(cFt paramcFt) {
    paramcFt.a(this);
  }

  public void a(deW paramdeW) {
    paramdeW.b(this);
  }

  public long gv() {
    return -1L;
  }

  public long aoZ() {
    return this.cSN;
  }

  public void cC(long paramLong) {
    this.cSN = paramLong;
  }

  public long sN() {
    return this.bkK;
  }

  public byte[] getData() {
    return this.bFC;
  }

  public int getVersion() {
    return this.cSO;
  }

  public int apa() {
    return this.bxi;
  }

  public cYk ML() {
    return this.cGk;
  }

  public long apb() {
    return this.cJp;
  }

  public String toString()
  {
    return "InteractiveElementCreate{m_data=" + this.bFC + ", m_elementUid=" + this.cSN + ", m_interactiveElementId=" + this.cJp + ", m_templateId=" + this.bxi + ", m_position=" + this.cGk + ", m_ownerId=" + this.bkK + "} " + super.toString();
  }
}