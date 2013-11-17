import java.nio.ByteBuffer;

class bcS
  implements dMx
{
  private long bwF;

  bcS()
  {
  }

  bcS(dxL paramdxL)
  {
    this.bwF = paramdxL.rP();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.bwF);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.bwF = paramByteBuffer.getLong();
  }

  public void a(aCu paramaCu) {
    paramaCu.t(cYq.jq(this.bwF));
  }

  public cQy wt() {
    return cQy.kBC;
  }

  public String toString()
  {
    return "PetLastMealDateChange{m_lastMealDate=" + this.bwF + '}';
  }
}