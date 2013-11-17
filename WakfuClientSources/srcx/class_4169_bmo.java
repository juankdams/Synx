import java.nio.ByteBuffer;

public class bmo extends bH
{
  private long cSN;
  private final cYk cGk = new cYk();
  private byte[] bFC;
  private int cSO;

  bmo()
  {
  }

  public bmo(long paramLong, cYk paramcYk, byte[] paramArrayOfByte, int paramInt)
  {
    this.cSN = paramLong;
    this.cGk.ae(paramcYk);
    this.bFC = paramArrayOfByte;
    this.cSO = paramInt;
  }

  public bqr eT() {
    return bqr.fLE;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.cSN);
    paramcXr.putInt(this.cGk.getX());
    paramcXr.putInt(this.cGk.getY());
    paramcXr.dT(this.cGk.IB());
    paramcXr.putInt(this.bFC.length);
    paramcXr.aD(this.bFC);
    paramcXr.putInt(this.cSO);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.cSN = paramByteBuffer.getLong();
    this.cGk.ac(paramByteBuffer.getInt(), paramByteBuffer.getInt(), paramByteBuffer.getShort());
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

  public long aoZ() {
    return this.cSN;
  }

  public byte[] getData() {
    return this.bFC;
  }

  public int getVersion() {
    return this.cSO;
  }

  public cYk ML() {
    return this.cGk;
  }

  public String toString()
  {
    return "InteractiveElementUpdate{m_data=" + this.bFC + ", m_elementUid=" + this.cSN + ", m_position=" + this.cGk + "} " + super.toString();
  }
}