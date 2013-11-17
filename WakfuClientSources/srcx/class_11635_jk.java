import java.nio.ByteBuffer;

public class jk extends bH
{
  private long RY;
  private long aKE;
  private short aKF;
  private short aEd;
  private short aEe;

  jk()
  {
  }

  public jk(short paramShort1, short paramShort2, short paramShort3)
  {
    this.aKF = paramShort1;
    this.aEd = paramShort2;
    this.aEe = paramShort3;
  }

  public bqr eT() {
    return bqr.fLA;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.RY);
    paramcXr.jn(this.aKE);
    paramcXr.dT(this.aKF);
    paramcXr.dT(this.aEd);
    paramcXr.dT(this.aEe);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.RY = paramByteBuffer.getLong();
    this.aKE = paramByteBuffer.getLong();
    this.aKF = paramByteBuffer.getShort();
    this.aEd = paramByteBuffer.getShort();
    this.aEe = paramByteBuffer.getShort();
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

  public void n(long paramLong) {
    this.RY = paramLong;
  }

  public long rb() {
    return this.aKE;
  }

  public void H(long paramLong) {
    this.aKE = paramLong;
  }

  public short rc() {
    return this.aKF;
  }

  public short nx() {
    return this.aEd;
  }

  public short ny() {
    return this.aEe;
  }

  public String toString()
  {
    return "BuildingCreate{m_buildingRefId=" + this.aKF + ", m_buildingUid=" + this.RY + ", m_creationDate=" + this.aKE + ", m_x=" + this.aEd + ", m_y=" + this.aEe + "} " + super.toString();
  }
}