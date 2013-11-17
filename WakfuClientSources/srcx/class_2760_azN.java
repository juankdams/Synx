import java.nio.ByteBuffer;

public class azN extends bH
{
  private long RY;
  private short dRw;
  private long aKE;

  azN()
  {
  }

  public azN(long paramLong)
  {
    this.RY = paramLong;
  }

  public bqr eT() {
    return bqr.fLC;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.RY);
    paramcXr.jn(this.aKE);
    paramcXr.dT(this.dRw);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.RY = paramByteBuffer.getLong();
    this.aKE = paramByteBuffer.getLong();
    this.dRw = paramByteBuffer.getShort();
  }

  public void a(cFt paramcFt) {
    paramcFt.a(this);
  }

  public void a(deW paramdeW) {
    paramdeW.b(this);
  }

  public long gv() {
    return this.RY;
  }

  public short aLG() {
    return this.dRw;
  }

  public long rb() {
    return this.aKE;
  }

  public void H(long paramLong) {
    this.aKE = paramLong;
  }

  public void aU(short paramShort) {
    this.dRw = paramShort;
  }

  public String toString()
  {
    return "BuildingEvolve{m_buildingUid=" + this.RY + ", m_nextBuildingRefId=" + this.dRw + ", m_creationDate=" + this.aKE + "} " + super.toString();
  }
}