import java.nio.ByteBuffer;

public class clB extends bH
{
  private long RY;

  clB()
  {
  }

  public clB(long paramLong)
  {
    this.RY = paramLong;
  }

  public bqr eT() {
    return bqr.fLB;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.RY);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.RY = paramByteBuffer.getLong();
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

  public String toString()
  {
    return "BuildingDelete{m_buildingUid=" + this.RY + "} " + super.toString();
  }
}