import java.nio.ByteBuffer;

public class ctl extends bH
{
  private short idd;
  private short ide;
  private short idf;
  private short aHE;

  ctl()
  {
  }

  public ctl(short paramShort1, short paramShort2, short paramShort3, short paramShort4)
  {
    this.idd = paramShort1;
    this.ide = paramShort2;
    this.idf = paramShort3;
    this.aHE = paramShort4;
  }

  public bqr eT() {
    return bqr.fLz;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.dT(this.idd);
    paramcXr.dT(this.ide);
    paramcXr.dT(this.idf);
    paramcXr.dT(this.aHE);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.idd = paramByteBuffer.getShort();
    this.ide = paramByteBuffer.getShort();
    this.idf = paramByteBuffer.getShort();
    this.aHE = paramByteBuffer.getShort();
  }

  public void a(cFt paramcFt) {
    paramcFt.a(this);
  }

  public void a(deW paramdeW) {
    paramdeW.b(this);
  }

  public short cqW() {
    return this.idd;
  }

  public short cqX() {
    return this.ide;
  }

  public short bqQ() {
    return this.idf;
  }

  public short pQ() {
    return this.aHE;
  }

  public String toString()
  {
    return "TopologyUpdate{m_oldPatchId=" + this.aHE + ", m_patchX=" + this.idd + ", m_patchY=" + this.ide + ", m_patchId=" + this.idf + "} " + super.toString();
  }
}