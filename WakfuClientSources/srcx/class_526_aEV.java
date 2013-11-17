import java.nio.ByteBuffer;

public class aEV extends bH
{
  private long RY;
  private short aEd;
  private short aEe;

  aEV()
  {
  }

  public aEV(long paramLong, short paramShort1, short paramShort2)
  {
    this.RY = paramLong;
    this.aEd = paramShort1;
    this.aEe = paramShort2;
  }

  public bqr eT() {
    return bqr.fLH;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.RY);
    paramcXr.dT(this.aEd);
    paramcXr.dT(this.aEe);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.RY = paramByteBuffer.getLong();
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

  public short nx() {
    return this.aEd;
  }

  public short ny() {
    return this.aEe;
  }

  public String toString()
  {
    return "BuildingMove{m_buildingUid=" + this.RY + ", m_x=" + this.aEd + ", m_y=" + this.aEe + "} " + super.toString();
  }
}