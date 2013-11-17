import java.nio.ByteBuffer;

public class cL extends bH
{
  private long RY;
  private int RZ;

  cL()
  {
  }

  public cL(long paramLong, int paramInt)
  {
    this.RY = paramLong;
    this.RZ = paramInt;
  }

  public bqr eT() {
    return bqr.fLD;
  }

  protected void c(cXr paramcXr) {
    super.c(paramcXr);
    paramcXr.jn(this.RY);
    paramcXr.putInt(this.RZ);
  }

  protected void j(ByteBuffer paramByteBuffer) {
    super.j(paramByteBuffer);
    this.RY = paramByteBuffer.getLong();
    this.RZ = paramByteBuffer.getInt();
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

  public int gw() {
    return this.RZ;
  }

  public void ab(int paramInt) {
    this.RZ = paramInt;
  }

  public String toString()
  {
    return "BuildingEquip{m_buildingUid=" + this.RY + ", m_itemId=" + this.RZ + "} " + super.toString();
  }
}