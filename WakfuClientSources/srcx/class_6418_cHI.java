import java.nio.ByteBuffer;

class cHI
  implements dMx
{
  private long iCH;

  cHI()
  {
  }

  cHI(dxL paramdxL)
  {
    this.iCH = paramdxL.rP();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.iCH);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.iCH = paramByteBuffer.getLong();
  }

  public void a(aCu paramaCu) {
    paramaCu.u(cYq.jq(this.iCH));
  }

  public cQy wt() {
    return cQy.kBA;
  }

  public String toString()
  {
    return "PetLastMealDateChange{m_lastMealDate=" + this.iCH + '}';
  }
}