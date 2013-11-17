import java.nio.ByteBuffer;

class dvS
  implements dMx
{
  private long lBj;

  dvS()
  {
  }

  dvS(dxL paramdxL)
  {
    this.lBj = paramdxL.rP();
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.lBj);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.lBj = paramByteBuffer.getLong();
  }

  public void a(aCu paramaCu) {
    paramaCu.v(cYq.jq(this.lBj));
  }

  public cQy wt() {
    return cQy.kBB;
  }

  public String toString()
  {
    return "PetLastHungryDateChange{m_lastHungryDate=" + this.lBj + '}';
  }
}