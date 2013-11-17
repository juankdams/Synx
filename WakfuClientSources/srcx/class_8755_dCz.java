import java.nio.ByteBuffer;

public class dCz extends bH
{
  private short bxq;
  private short bxr;

  dCz()
  {
  }

  public dCz(short paramShort1, short paramShort2)
  {
    this.bxq = paramShort1;
    this.bxr = paramShort2;
  }

  public bqr eT() {
    return bqr.fLy;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.dT(this.bxq);
    paramcXr.dT(this.bxr);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.bxq = paramByteBuffer.getShort();
    this.bxr = paramByteBuffer.getShort();
  }

  public void a(cFt paramcFt) {
    paramcFt.a(this);
  }

  public void a(deW paramdeW) {
    paramdeW.b(this);
  }

  public short Ky() {
    return this.bxq;
  }

  public short Kz() {
    return this.bxr;
  }

  public String toString()
  {
    return "TopologyCreate{m_partitionX=" + this.bxq + ", m_partitionY=" + this.bxr + "} " + super.toString();
  }
}