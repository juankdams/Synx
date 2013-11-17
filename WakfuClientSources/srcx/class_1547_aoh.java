import java.nio.ByteBuffer;

class aoh
  implements dMx
{
  private int bvH;

  aoh()
  {
  }

  aoh(int paramInt)
  {
    this.bvH = paramInt;
  }

  public byte[] j() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bvH);
    return localByteBuffer.array();
  }

  public void a(ByteBuffer paramByteBuffer) {
    this.bvH = paramByteBuffer.getInt();
  }

  public void a(aCu paramaCu) {
    paramaCu.lS(this.bvH);
  }

  public cQy wt() {
    return cQy.kBx;
  }

  public String toString()
  {
    return "PetHealthChangeEvent{m_health=" + this.bvH + '}';
  }
}